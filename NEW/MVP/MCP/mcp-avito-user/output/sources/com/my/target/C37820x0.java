package com.my.target;

import android.view.View;

/* renamed from: com.my.target.x0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37820x0 extends View {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public a f365226b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f365227c;

    /* renamed from: com.my.target.x0$a */
    public interface a {
        void a(boolean z12);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z12 = true;
        this.f365227c = true;
        boolean zHasWindowFocus = hasWindowFocus();
        a aVar = this.f365226b;
        if (aVar == null) {
            return;
        }
        if (!this.f365227c || !zHasWindowFocus) {
            if (zHasWindowFocus) {
                return;
            } else {
                z12 = false;
            }
        }
        aVar.a(z12);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean z12 = false;
        this.f365227c = false;
        boolean zHasWindowFocus = hasWindowFocus();
        a aVar = this.f365226b;
        if (aVar == null) {
            return;
        }
        if (this.f365227c && zHasWindowFocus) {
            z12 = true;
        } else if (zHasWindowFocus) {
            return;
        }
        aVar.a(z12);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z12) {
        boolean z13;
        super.onWindowFocusChanged(z12);
        a aVar = this.f365226b;
        if (aVar == null) {
            return;
        }
        if (this.f365227c && z12) {
            z13 = true;
        } else if (z12) {
            return;
        } else {
            z13 = false;
        }
        aVar.a(z13);
    }

    public void setStateChangedListener(@j.P a aVar) {
        this.f365226b = aVar;
    }
}
