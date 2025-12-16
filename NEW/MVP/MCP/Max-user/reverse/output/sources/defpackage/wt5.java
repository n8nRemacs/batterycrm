package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class wt5 implements bbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ PmsKey c;

    public /* synthetic */ wt5(gu5 gu5Var, PmsKey pmsKey, int i) {
        this.a = i;
        this.b = gu5Var;
        this.c = pmsKey;
    }

    @Override // defpackage.bbd
    public final Object D(Object obj, yy7 yy7Var) {
        switch (this.a) {
            case 0:
                Boolean bool = Boolean.FALSE;
                gu5 gu5Var = this.b;
                PmsKey pmsKey = this.c;
                if (gu5Var.m(pmsKey)) {
                    return kaj.b(gu5Var.g, pmsKey.name(), bool, vid.a(Boolean.class));
                }
                l5c l5cVar = gu5Var.h;
                boolean zContains = l5cVar.h.g.contains(pmsKey.name());
                c4 c4Var = l5cVar;
                if (zContains) {
                    c4Var = l5cVar.h;
                }
                return kaj.b(c4Var.g, pmsKey.name(), bool, vid.a(Boolean.class));
            case 1:
                gu5 gu5Var2 = this.b;
                PmsKey pmsKey2 = this.c;
                if (gu5Var2.m(pmsKey2)) {
                    return kaj.b(gu5Var2.g, pmsKey2.name(), 30L, vid.a(Long.class));
                }
                l5c l5cVar2 = gu5Var2.h;
                boolean zContains2 = l5cVar2.h.g.contains(pmsKey2.name());
                c4 c4Var2 = l5cVar2;
                if (zContains2) {
                    c4Var2 = l5cVar2.h;
                }
                return kaj.b(c4Var2.g, pmsKey2.name(), 30L, vid.a(Long.class));
            case 2:
                Boolean bool2 = Boolean.FALSE;
                gu5 gu5Var3 = this.b;
                PmsKey pmsKey3 = this.c;
                if (gu5Var3.m(pmsKey3)) {
                    return kaj.b(gu5Var3.g, pmsKey3.name(), bool2, vid.a(Boolean.class));
                }
                l5c l5cVar3 = gu5Var3.h;
                boolean zContains3 = l5cVar3.h.g.contains(pmsKey3.name());
                c4 c4Var3 = l5cVar3;
                if (zContains3) {
                    c4Var3 = l5cVar3.h;
                }
                return kaj.b(c4Var3.g, pmsKey3.name(), bool2, vid.a(Boolean.class));
            case 3:
                Boolean bool3 = Boolean.FALSE;
                gu5 gu5Var4 = this.b;
                PmsKey pmsKey4 = this.c;
                if (gu5Var4.m(pmsKey4)) {
                    return kaj.b(gu5Var4.g, pmsKey4.name(), bool3, vid.a(Boolean.class));
                }
                l5c l5cVar4 = gu5Var4.h;
                boolean zContains4 = l5cVar4.h.g.contains(pmsKey4.name());
                c4 c4Var4 = l5cVar4;
                if (zContains4) {
                    c4Var4 = l5cVar4.h;
                }
                return kaj.b(c4Var4.g, pmsKey4.name(), bool3, vid.a(Boolean.class));
            default:
                gu5 gu5Var5 = this.b;
                PmsKey pmsKey5 = this.c;
                if (gu5Var5.m(pmsKey5)) {
                    return kaj.b(gu5Var5.g, pmsKey5.name(), 0L, vid.a(Long.class));
                }
                l5c l5cVar5 = gu5Var5.h;
                boolean zContains5 = l5cVar5.h.g.contains(pmsKey5.name());
                c4 c4Var5 = l5cVar5;
                if (zContains5) {
                    c4Var5 = l5cVar5.h;
                }
                return kaj.b(c4Var5.g, pmsKey5.name(), 0L, vid.a(Long.class));
        }
    }
}
