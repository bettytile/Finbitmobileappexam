package et.com.synctech.mobileappexam;



import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<EmployeeData> data;

    public DataAdapter(ArrayList<EmployeeData> employeeData) {
        this.data = employeeData;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.employee_name.setText(data.get(i).getEmployee_name());
        viewHolder.employee_age.setText(data.get(i).getEmployee_age());
        viewHolder.employee_salary.setText(data.get(i).getEmployee_salary());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView employee_name,employee_age,employee_salary;
        private ImageView employee_img;
        public ViewHolder(View view) {
            super(view);

            employee_name =view.findViewById(R.id.employee_name);
            employee_age = view.findViewById(R.id.employee_age);
            employee_salary =view.findViewById(R.id.employee_salary);

        }
    }

}

