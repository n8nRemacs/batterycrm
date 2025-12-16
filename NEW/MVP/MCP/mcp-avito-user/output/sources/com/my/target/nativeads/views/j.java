package com.my.target.nativeads.views;

import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.RecyclerView;
import j.N;

/* loaded from: classes7.dex */
public final class j extends P {

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public I f365039d;

    public interface a {
    }

    public static int i(@N RecyclerView.m mVar, @N View view, @N I i12) {
        int iE2 = ((i12.e(view) / 2) + i12.g(view)) - ((i12.n() / 2) + i12.m());
        mVar.getClass();
        if (RecyclerView.m.t0(view) == 0) {
            return iE2;
        }
        mVar.o0();
        RecyclerView.m.t0(view);
        return iE2;
    }

    @Override // androidx.recyclerview.widget.P
    @N
    public final int[] c(@N RecyclerView.m mVar, @N View view) {
        int[] iArr = new int[2];
        if (mVar.I()) {
            if (this.f365039d.f53676a != mVar) {
                this.f365039d = I.a(mVar);
            }
            iArr[0] = i(mVar, view, this.f365039d);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.P
    @j.P
    public final View f(@N RecyclerView.m mVar) {
        if (mVar.e0() == 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.P
    public final int g(@N RecyclerView.m mVar, int i12, int i13) {
        int iO02 = mVar.o0();
        if (iO02 == 0) {
            return -1;
        }
        if (this.f365039d.f53676a != mVar) {
            this.f365039d = I.a(mVar);
        }
        I i14 = this.f365039d;
        int iE02 = mVar.e0();
        boolean z12 = false;
        View view = null;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i17 = 0; i17 < iE02; i17++) {
            View viewD0 = mVar.d0(i17);
            if (viewD0 != null) {
                int i18 = i(mVar, viewD0, i14);
                if (i18 <= 0 && i18 > i16) {
                    view2 = viewD0;
                    i16 = i18;
                }
                if (i18 >= 0 && i18 < i15) {
                    view = viewD0;
                    i15 = i18;
                }
            }
        }
        if (!mVar.I() ? i13 > 0 : i12 > 0) {
            z12 = true;
        }
        if (z12 && view != null) {
            return RecyclerView.m.t0(view);
        }
        if (!z12 && view2 != null) {
            return RecyclerView.m.t0(view2);
        }
        if (z12) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iT02 = RecyclerView.m.t0(view) + (z12 ? 1 : -1);
        if (iT02 < 0 || iT02 >= iO02) {
            return -1;
        }
        return iT02;
    }
}
