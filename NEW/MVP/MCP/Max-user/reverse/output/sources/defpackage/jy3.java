package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class jy3 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(xx3 xx3Var) {
        v0b v0bVar = (v0b) this.a;
        long j = xx3Var.a;
        v0bVar.setId(Long.hashCode(j));
        v0bVar.setTitle(xx3Var.b);
        v0bVar.setSubtitle(xx3Var.o);
        v0bVar.setVerified(xx3Var.s0);
        v0bVar.f();
        v0bVar.setOnClickListener(null);
        CharSequence charSequence = xx3Var.t0;
        Uri uri = xx3Var.Y;
        v0bVar.g(j, charSequence, uri != null ? uri.toString() : null);
        v0bVar.setSelectionEnabled(false);
    }
}
