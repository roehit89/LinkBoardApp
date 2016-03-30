package com.example.rohit.linkboardapp.Model;


/**
 * Created by Rohit on 3/30/2016.
 */
public final class UserLoginModel {

   private String status;
   private String message;
   private Data data;


    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }

    public  UserLoginModel(String status,String message,Data data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public final static class Data
    {
        public String role_id;
        public String status_id;
        public String organization_copy_title;
        public String image;
        public String organization_copy_text;
        public String organization_start_link_token;
        public String organizations_email;
        public String organization_employees;
        public String id;
        public String first_name;
        public String desk_id;
        public String username;
        public String timezone;
        public String updated_at;
        public String email;
        public String organization_detail;
        public String organization_id;
        public String organization_url;
        public String dob;
        public String last_name;
        public String created_at;
        public String language;
        public String role_name;
        public String organization_name;

        public Data(String role_id, String status_id, String organization_copy_title, String image, String organization_copy_text, String organization_start_link_token, String organizations_email, String organization_employees, String id, String first_name, String desk_id, String username, String timezone, String updated_at, String email, String organization_detail, String organization_id, String organization_url, String dob, String last_name, String created_at, String language, String role_name, String organization_name) {
            this.role_id = role_id;
            this.status_id = status_id;
            this.organization_copy_title = organization_copy_title;
            this.image = image;
            this.organization_copy_text = organization_copy_text;
            this.organization_start_link_token = organization_start_link_token;
            this.organizations_email = organizations_email;
            this.organization_employees = organization_employees;
            this.id = id;
            this.first_name = first_name;
            this.desk_id = desk_id;
            this.username = username;
            this.timezone = timezone;
            this.updated_at = updated_at;
            this.email = email;
            this.organization_detail = organization_detail;
            this.organization_id = organization_id;
            this.organization_url = organization_url;
            this.dob = dob;
            this.last_name = last_name;
            this.created_at = created_at;
            this.language = language;
            this.role_name = role_name;
            this.organization_name = organization_name;
        }

        public String getRole_id ()
        {
            return role_id;
        }

        public String getStatus_id ()
        {
            return status_id;
        }

        public String getOrganization_copy_title ()
        {
        return organization_copy_title;
       }

        public String getImage ()
        {
            return image;
        }

      public String getOrganization_copy_text ()
    {
        return organization_copy_text;
    }


        public String getOrganization_start_link_token ()
        {
            return organization_start_link_token;
        }

        public String getOrganizations_email ()
        {
            return organizations_email;
        }


        public String getOrganization_employees ()
        {
            return organization_employees;
        }

        public String getId ()
        {
            return id;
        }

        public String getFirst_name ()
         {
            return first_name;
         }


        public String getDesk_id ()
        {
        return desk_id;
        }


        public String getUsername ()
        {
            return username;
        }

        public String getTimezone ()
        {
            return timezone;
        }


        public String getUpdated_at ()
        {
            return updated_at;
        }

        public String getEmail ()
        {
            return email;
        }


        public String getOrganization_detail ()
        {
            return organization_detail;
        }


        public String getOrganization_id ()
        {
            return organization_id;
        }

        public String getOrganization_url ()
        {
            return organization_url;
        }

        public String getDob ()
        {
            return dob;
        }


        public String getLast_name ()
        {
            return last_name;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public String getLanguage ()
        {
            return language;
        }


        public String getRole_name ()
        {
            return role_name;
        }

        public String getOrganization_name ()
        {
            return organization_name;
        }
    }
}
