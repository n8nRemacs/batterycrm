package defpackage;

/* loaded from: classes2.dex */
public final class ag2 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(bg2 bg2Var) {
        zf2 zf2Var = (zf2) this.a;
        zf2Var.setTitle(bg2Var.a);
        zf2Var.setSubtitle(bg2Var.b);
        String str = bg2Var.c;
        CharSequence charSequence = bg2Var.d;
        long j = bg2Var.o;
        zf2Var.a.setCustomOverlay(bg2Var.X);
        uxa uxaVar = zf2Var.a;
        Long lValueOf = Long.valueOf(j);
        if (charSequence == null) {
            charSequence = "";
        }
        uxa.n(uxaVar, str, lValueOf, charSequence);
        zf2Var.setDescriptions(bg2Var.Y);
    }
}
