import axios from 'axios';

const url = 'http://localhost:3003/users';

export const getUsers = async (id) => {
  id = id || '';
  const x = await axios.get(`${url}/${id}`);
  return x;
};

export const addUser = async (user) => {
  const x = await axios.post(url, user);
  return x;
};

export const editUser = async (id, user) => {
  const x = await axios.put(`${url}/${id}`, user);
  return x;
};
export const deleteUser = async (id) => {
  const x = await axios.delete(`${url}/${id}`);
  return x;
};
