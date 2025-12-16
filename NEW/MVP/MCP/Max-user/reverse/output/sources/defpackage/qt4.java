package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class qt4 implements zde {
    public final CharSequence a;
    public final int b;
    public final u08 c;

    /* JADX WARN: Multi-variable type inference failed */
    public qt4(CharSequence charSequence, int i, sm6 sm6Var) {
        this.a = charSequence;
        this.b = i;
        this.c = (u08) sm6Var;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        return new pt4(this);
    }
}
