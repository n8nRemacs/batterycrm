package androidx.core.view;

import android.view.View;
import androidx.core.view.C22823h0;

/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22815d0 extends C22823h0.b<Boolean> {
    @Override // androidx.core.view.C22823h0.b
    @j.X
    public final Boolean a(@j.N View view) {
        return Boolean.valueOf(C22823h0.h.c(view));
    }

    @Override // androidx.core.view.C22823h0.b
    @j.X
    public final void b(@j.N View view, Boolean bool) {
        C22823h0.h.f(view, bool.booleanValue());
    }

    @Override // androidx.core.view.C22823h0.b
    public final boolean e(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
