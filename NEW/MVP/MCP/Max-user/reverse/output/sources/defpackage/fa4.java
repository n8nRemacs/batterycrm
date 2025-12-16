package defpackage;

/* loaded from: classes2.dex */
public final class fa4 implements sm6 {
    public final /* synthetic */ f86 a;
    public final /* synthetic */ va4 b;

    public fa4(f86 f86Var, va4 va4Var) {
        this.a = f86Var;
        this.b = va4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f9a f9aVar = (f9a) obj2;
        lg8 lg8Var = lg8.d;
        if (f9aVar == null) {
            return ucf.a(this.a);
        }
        f86 f86Var = (f86) f9aVar.getValue();
        if (f86Var == null) {
            String str = this.b.b;
            f86 f86Var2 = this.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.i("Folder(", f86Var2.a, ") was set to flow"), null);
            }
            f9aVar.setValue(this.a);
            return f9aVar;
        }
        long j = f86Var.u0;
        f86 f86Var3 = this.a;
        if (j > f86Var3.u0) {
            String str2 = this.b.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, ho7.i("Folder(", f86Var3.a, ") was ignored due to greater time of present folder"), null);
            }
            return f9aVar;
        }
        String str3 = this.b.b;
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            l6bVar3.c(lg8Var, str3, ho7.i("Folder(", f86Var3.a, ") was updated by folder from cache"), null);
        }
        f9aVar.setValue(this.a);
        return f9aVar;
    }
}
