package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.g7;
import com.yandex.mobile.ads.nativeads.j0;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public abstract class n<T extends j0> extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @P
    private T f392693a;

    public n(Context context) {
        super(context);
    }

    public final void a(@N T t12) {
        this.f392693a = t12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t12 = this.f392693a;
        if (t12 != null) {
            t12.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        T t12 = this.f392693a;
        if (t12 != null) {
            t12.h();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        char c12 = (i12 == 0 && isShown()) ? (char) 0 : '\b';
        T t12 = this.f392693a;
        if (t12 != null) {
            int i13 = g7.f385602b;
            t12.toString();
            if (c12 == 0) {
                t12.g();
            } else {
                t12.h();
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i12) {
        getVisibility();
        char c12 = (i12 == 0 && getVisibility() == 0) ? (char) 0 : '\b';
        T t12 = this.f392693a;
        if (t12 != null) {
            int i13 = g7.f385602b;
            t12.toString();
            if (c12 == 0) {
                t12.g();
            } else {
                t12.h();
            }
        }
        super.onWindowVisibilityChanged(i12);
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
    }
}
