package misao.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Sonu on 1/31/2017.
 */

public class ImageAdapter extends BaseAdapter {
    Context context;

    public  ImageAdapter(Context context)
    {
        this.context = context;
    }
    @Override
    public int getCount() {
        return mthumbnail.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null)
        {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else
        {
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mthumbnail[position]);
        return imageView;
    }

    public Integer[] mthumbnail = {
        R.drawable.amazon, R.drawable.amazonicon, R.drawable.app9, R.drawable.fbicon11,
            R.drawable.ff, R.drawable.flipkart, R.drawable.funsmile, R.drawable.game,
            R.drawable.photocopy, R.drawable.ucicon, R.drawable.ucnews, R.drawable.unnamed,
            R.drawable.videocopy, R.drawable.yahoo,
            R.drawable.amazon, R.drawable.amazonicon, R.drawable.app9, R.drawable.fbicon11,
            R.drawable.ff, R.drawable.flipkart, R.drawable.funsmile, R.drawable.game,
            R.drawable.photocopy, R.drawable.ucicon, R.drawable.ucnews, R.drawable.unnamed,
            R.drawable.videocopy, R.drawable.yahoo,
            R.drawable.amazon, R.drawable.amazonicon, R.drawable.app9, R.drawable.fbicon11,
            R.drawable.ff, R.drawable.flipkart, R.drawable.funsmile, R.drawable.game,
            R.drawable.photocopy, R.drawable.ucicon, R.drawable.ucnews, R.drawable.unnamed,
            R.drawable.videocopy, R.drawable.yahoo,
            R.drawable.amazon, R.drawable.amazonicon, R.drawable.app9, R.drawable.fbicon11,
            R.drawable.ff, R.drawable.flipkart, R.drawable.funsmile, R.drawable.game,
            R.drawable.photocopy, R.drawable.ucicon, R.drawable.ucnews, R.drawable.unnamed,
            R.drawable.videocopy, R.drawable.yahoo,
    };
}
