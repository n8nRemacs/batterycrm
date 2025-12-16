package com.google.android.material.sidesheet;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import j.D;
import j.I;
import j.N;

/* compiled from: SideSheetDialog.java */
/* loaded from: classes6.dex */
public class k extends g<j> {

    /* compiled from: SideSheetDialog.java */
    public class a extends j {
        public a() {
        }

        @Override // com.google.android.material.sidesheet.c
        public final void a(int i12) {
            if (i12 == 5) {
                k.this.cancel();
            }
        }
    }

    @Override // com.google.android.material.sidesheet.g
    public final void r(b<j> bVar) {
        bVar.a(new a());
    }

    @Override // com.google.android.material.sidesheet.g
    @N
    public final b t() {
        b bVarT = super.t();
        if (bVarT instanceof SideSheetBehavior) {
            return (SideSheetBehavior) bVarT;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.g
    @N
    public final SideSheetBehavior u(@N FrameLayout frameLayout) {
        int i12 = SideSheetBehavior.f357153v;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.g) layoutParams).f44447a;
        if (cVar instanceof SideSheetBehavior) {
            return (SideSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.g
    @D
    public final int v() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.g
    @I
    public final int w() {
        return R.layout.m3_side_sheet_dialog;
    }
}
