package defpackage;

import java.io.File;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class es5 implements drf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ es5(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

    @Override // defpackage.drf
    public final Object get() {
        switch (this.a) {
            case 0:
                gs5 gs5Var = (gs5) this.c;
                return gs5Var.a(new u64(gs5Var, 5, (long[]) this.b));
            case 1:
                js5 js5Var = (js5) this.c;
                long[] jArr = (long[]) this.b;
                o3f o3fVar = new o3f();
                js5Var.f.put(Long.valueOf(js5Var.a.c(4, jArr)), o3fVar);
                return o3fVar;
            default:
                ozf ozfVar = (ozf) this.c;
                File file = (File) this.b;
                y0g y0gVar = (y0g) ozfVar.b.getValue();
                ((z7c) ozfVar.c.getValue()).b.getClass();
                j0e j0eVarB = ((n0g) ((m0g) ozfVar.o.getValue())).b();
                y0gVar.getClass();
                return new n97(y0gVar.a, file, j0eVarB);
        }
    }
}
