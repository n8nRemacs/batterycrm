package defpackage;

/* loaded from: classes2.dex */
public final class o54 implements g54 {
    public final String a;
    public final ws0 b;
    public final ws0 c;

    public o54(String str, ws0 ws0Var, ws0 ws0Var2) {
        this.a = str;
        this.b = ws0Var;
        this.c = ws0Var2;
    }

    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
        if (fni.a(c54Var != null ? c54Var.getInstanceId() : null, this.a) && z) {
            this.b.invoke();
        }
    }

    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        if (!fni.a(c54Var2 != null ? c54Var2.getInstanceId() : null, this.a) || z) {
            return;
        }
        this.c.invoke();
    }
}
