package defpackage;

/* loaded from: classes2.dex */
public final class tq7 extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(rq7 rq7Var) {
        sq7 sq7Var = (sq7) this.a;
        CharSequence charSequenceB = rq7Var.b.b(sq7Var.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        sq7Var.setText(charSequenceB);
        sq7Var.setIcon(r34.b(sq7Var.getContext(), rq7Var.c.intValue()).mutate());
    }
}
