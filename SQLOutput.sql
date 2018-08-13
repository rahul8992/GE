Select md.name , md.model_id ,rv.rev_id ,max(rv.created_at) from Model md left join Revision rv on md.model_id=rv.model_id 
group by md.name , md.model_id ;