package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* loaded from: classes.dex */
public abstract class f8j {
    public static final void d(View view, long j, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new gg4(j, onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new l30(this, i, 15));
    }

    public abstract void b(int i);

    public abstract void c(Typeface typeface);
}
