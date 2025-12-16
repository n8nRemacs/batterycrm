package defpackage;

/* loaded from: classes2.dex */
public final class hxg extends d2f implements ct7 {
    public t9f E0;

    @Override // defpackage.d2f
    public final void E() {
        this.E0 = null;
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        fxg fxgVar = (fxg) t98Var;
        gxg gxgVar = (gxg) this.a;
        gxgVar.setType(fxgVar.b);
        CharSequence charSequenceA = fxgVar.c.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        gxgVar.setTitle(charSequenceA);
    }
}
