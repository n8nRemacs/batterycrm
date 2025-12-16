package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class sp {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) tp.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
