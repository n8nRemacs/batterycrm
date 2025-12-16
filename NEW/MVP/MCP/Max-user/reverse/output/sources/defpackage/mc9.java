package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class mc9 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(lc9 lc9Var) {
        String string;
        v0b v0bVar = (v0b) this.a;
        long j = lc9Var.a;
        v0bVar.setId(Long.hashCode(j));
        v0bVar.setEnabled(lc9Var.t0);
        v0bVar.setTitle(lc9Var.b);
        v0bVar.setSubtitle(lc9Var.d.b(v0bVar.getContext()));
        v0bVar.setVerified(lc9Var.Y);
        s5g s5gVar = lc9Var.w0;
        v0bVar.setAlias(s5gVar != null ? s5gVar.b(v0bVar.getContext()) : null);
        v0bVar.f();
        v0bVar.setOnClickListener(null);
        CharSequence charSequence = lc9Var.X;
        Uri uri = lc9Var.o;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        v0bVar.g(j, charSequence, string);
        v0bVar.setSelectionEnabled(false);
    }
}
