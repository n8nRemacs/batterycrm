package com.google.android.material.progressindicator;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* compiled from: LinearProgressIndicator.java */
/* loaded from: classes6.dex */
public final class v extends com.google.android.material.progressindicator.b<w> {

    /* compiled from: LinearProgressIndicator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    /* compiled from: LinearProgressIndicator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface b {
    }

    @Override // com.google.android.material.progressindicator.b
    public final void b(int i12) {
        S s5 = this.f356890b;
        if (s5 != 0 && ((w) s5).f356982g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i12);
    }

    public int getIndeterminateAnimationType() {
        return ((w) this.f356890b).f356982g;
    }

    public int getIndicatorDirection() {
        return ((w) this.f356890b).f356983h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        S s5 = this.f356890b;
        w wVar = (w) s5;
        if (((w) s5).f356983h != 1) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if ((getLayoutDirection() != 1 || ((w) s5).f356983h != 2) && getLayoutDirection() == 0) {
                int i16 = ((w) s5).f356983h;
            }
        }
        wVar.getClass();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        int paddingRight = i12 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - (getPaddingBottom() + getPaddingTop());
        o<w> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        i<w> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i12) {
        w wVar = (w) this.f356890b;
        if (wVar.f356982g == i12) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        wVar.f356982g = i12;
        wVar.a();
        if (i12 == 0) {
            o<w> indeterminateDrawable = getIndeterminateDrawable();
            r rVar = new r(wVar);
            indeterminateDrawable.f356960n = rVar;
            rVar.f356956a = indeterminateDrawable;
        } else {
            o<w> indeterminateDrawable2 = getIndeterminateDrawable();
            u uVar = new u(getContext(), wVar);
            indeterminateDrawable2.f356960n = uVar;
            uVar.f356956a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setIndicatorColor(@N int... iArr) {
        super.setIndicatorColor(iArr);
        ((w) this.f356890b).a();
    }

    public void setIndicatorDirection(int i12) {
        S s5 = this.f356890b;
        ((w) s5).f356983h = i12;
        w wVar = (w) s5;
        if (i12 != 1) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (getLayoutDirection() != 1 || ((w) s5).f356983h != 2) {
                getLayoutDirection();
            }
        }
        wVar.getClass();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackCornerRadius(int i12) {
        super.setTrackCornerRadius(i12);
        ((w) this.f356890b).a();
        invalidate();
    }
}
