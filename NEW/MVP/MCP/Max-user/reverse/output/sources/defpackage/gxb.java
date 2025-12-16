package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class gxb extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(fxb fxbVar) {
        String string;
        v0b v0bVar = (v0b) this.a;
        v0bVar.setId(Long.hashCode(fxbVar.u0));
        v0bVar.setActivated(fxbVar.t0);
        v0bVar.setTitle(fxbVar.c);
        s5g s5gVar = fxbVar.d;
        v0bVar.setSubtitle(s5gVar != null ? s5gVar.b(v0bVar.getContext()) : null);
        v0bVar.setOnClickListener(null);
        long j = fxbVar.b;
        CharSequence charSequence = fxbVar.s0;
        Uri uri = fxbVar.o;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        v0bVar.g(j, charSequence, string);
        v0bVar.setVerified(fxbVar.Y);
    }
}
