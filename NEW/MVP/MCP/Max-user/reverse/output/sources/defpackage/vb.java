package defpackage;

/* loaded from: classes2.dex */
public final class vb extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(da daVar) {
        v0b v0bVar = (v0b) this.a;
        v0bVar.setId(Long.hashCode(daVar.Y));
        v0bVar.setTitle(daVar.b);
        v0bVar.setSubtitle(daVar.c.b(v0bVar.getContext()));
        v0bVar.f();
        v0bVar.setOnClickListener(null);
        v0bVar.setVerified(daVar.X);
        v0bVar.g(daVar.a, daVar.o, daVar.d);
        v0bVar.setSelectionEnabled(false);
    }
}
