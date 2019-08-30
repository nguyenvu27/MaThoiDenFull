package com.example.mathoidenfull.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mathoidenfull.R;

import java.util.List;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder> {

    private List<Face> mListFace;
    private OnCallBack mListener ;


    public FaceAdapter(OnCallBack listntener, List<Face> listFace) {
        this.mListFace = listFace;
        this.mListener = listntener ;
    }

    @NonNull
    @Override
    public FaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_face, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FaceAdapter.ViewHolder holder, int position) {
        Face face = mListFace.get(position);
        holder.ivAvatar.setImageResource(face.getResId());
        holder.tvName.setText(face.getName());
    }

    @Override
    public int getItemCount() {
        return mListFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = (ImageView) itemView.findViewById(R.id.iv_avatar);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onItemClicked(getPosition());
                }
            });
        }

    }
    public interface OnCallBack{
        void onItemClicked(int position) ;
    }
}
