package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o03 implements re4 {
    public final bwf a;
    public final k18 b;
    public final bwf c;

    public o03(bwf bwfVar, k18 k18Var, bwf bwfVar2) {
        this.a = bwfVar;
        this.b = k18Var;
        this.c = bwfVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o03.a(java.util.Set, q44):java.lang.Object");
    }

    public final c23 b() {
        f86 f86VarA = ((h13) this.a.getValue()).a();
        return f86VarA.a() ? a23.a : new b23(f86VarA.o, f86VarA.d, f86VarA.z0, f86VarA.A0, f86VarA.Y);
    }

    @Override // defpackage.re4
    public final List m(long j, j37 j37Var, int i, int i2, long j2, long j3) {
        hs2 hs2VarA;
        ks2 ks2Var = (ks2) this.c.getValue();
        List<pb2> listD = ((ch2) this.b.getValue()).d(b(), j, j37Var != null ? Long.valueOf(j37Var.getA()) : null, i2);
        String str = ks2Var.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.f(listD.size(), "ChatModelConverter.toModels() START: chatsCount="), null);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (pb2 pb2Var : listD) {
            try {
                hs2VarA = ks2Var.a(pb2Var);
            } catch (Throwable th) {
                wqi.e(ks2Var.b, "ChatModelConverter.convertChatToModel() failed for " + pb2Var.a, th);
                hs2VarA = null;
            }
            if (hs2VarA != null) {
                arrayList.add(hs2VarA);
            }
        }
        return arrayList;
    }
}
