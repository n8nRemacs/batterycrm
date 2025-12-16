package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.C22823h0;

/* compiled from: ViewCompat.java */
/* renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22817e0 extends C22823h0.b<CharSequence> {
    @Override // androidx.core.view.C22823h0.b
    @j.X
    public final CharSequence a(View view) {
        return C22823h0.h.a(view);
    }

    @Override // androidx.core.view.C22823h0.b
    @j.X
    public final void b(View view, CharSequence charSequence) {
        C22823h0.h.e(view, charSequence);
    }

    @Override // androidx.core.view.C22823h0.b
    public final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
