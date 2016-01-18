package org.mohan.app.dao;

import java.util.List;
import java.util.Map;

import org.moham.app.exception.GException;


public interface IGenericsDB {
	public List getAll(Class cl) throws GException ;
	public List findByExample(Object obj) throws GException;
	public Object getByPK(Class cl, Object obj) throws GException;
	public Boolean add(Object obj) throws GException;
	public Boolean update(Object obj) throws GException;
	public Boolean delete(Object obj) throws GException;
	public List getWithLikeAndEqualeCondition(Class cl, Map<String, Object> map) throws GException;
}
