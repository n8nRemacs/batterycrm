package e11;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public class I0 extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ImageView f394368b;

    public I0(@j.N Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f394368b = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(@j.P Bitmap bitmap) {
        this.f394368b.setImageBitmap(bitmap);
    }
}
