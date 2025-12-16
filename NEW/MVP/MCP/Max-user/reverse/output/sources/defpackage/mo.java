package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class mo {
    public final TextView a;
    public final t9f b;

    public mo(TextView textView) {
        this.a = textView;
        this.b = new t9f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((haj) this.b.b).b(inputFilterArr);
    }

    public final boolean b() {
        return ((haj) this.b.b).f();
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, o6d.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(o6d.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        ((haj) this.b.b).g(z);
    }

    public final void e(boolean z) {
        ((haj) this.b.b).h(z);
    }
}
