package com.example.rohit.linkboardapp.Model;

/**
 * Created by Rohit on 3/27/2016.
 */
public final class Model {
    public final boolean status;
    public final String message;
    public final Data data;

    public Model(boolean status, String message, Data data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static final class Data {
        public final String username;
        public final String email;
        public final String first_name;

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getDob() {
            return dob;
        }

        public String getDesk_id() {
            return desk_id;
        }

        public String getOrganization_id() {
            return organization_id;
        }

        public String getRole_id() {
            return role_id;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getId() {
            return id;
        }

        public final String last_name;
        public final String dob;
        public final String desk_id;
        public final String organization_id;
        public final String role_id;
        public final String updated_at;
        public final String created_at;
        public final String id;

        public Data(String username, String email, String first_name, String last_name, String dob, String desk_id, String organization_id, String role_id, String updated_at, String created_at, String id){
            this.username = username;
            this.email = email;
            this.first_name = first_name;
            this.last_name = last_name;
            this.dob = dob;
            this.desk_id = desk_id;
            this.organization_id = organization_id;
            this.role_id = role_id;
            this.updated_at = updated_at;
            this.created_at = created_at;
            this.id = id;
        }


    }
}