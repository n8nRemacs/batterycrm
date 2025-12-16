package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class s9j {
    public final /* synthetic */ int a = 2;

    public static void a(TextView textView, Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            Objects.requireNonNull(animationDrawable);
            textView.post(new qj4(11, animationDrawable));
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 2:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return vid.a(getClass()).b();
            default:
                return super.toString();
        }
    }
}
