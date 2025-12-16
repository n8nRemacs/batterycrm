package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class nm8 {
    public final lzf a;
    public final k18 b;
    public final k18 c;
    public final ContextScope d;
    public final c9a e;
    public final LinkedHashMap f;
    public long g;
    public boolean h;
    public boolean i;

    public nm8(k18 k18Var, k18 k18Var2, lzf lzfVar) {
        this.a = lzfVar;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = d7j.a(((q2b) lzfVar).b());
        long[] jArr = fzd.a;
        this.e = new c9a();
        this.f = new LinkedHashMap();
        this.g = -1L;
        this.h = true;
    }

    public final void a(List list) {
        c9a c9aVar = this.e;
        arb arbVar = arb.CHAT_INIT_TO_RENDER;
        zqb zqbVar = (zqb) c9aVar.f(arbVar);
        if (zqbVar == null || zqbVar.c != -1) {
            return;
        }
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
        if (zqbVar2 != null) {
            c().getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zqbVar2.c = jElapsedRealtime - zqbVar2.b;
            zqbVar2.f = list;
            f(jElapsedRealtime);
        }
        if (!this.i) {
            this.g = ((pe8) ((pb3) c().a.getValue())).K();
        }
        ((jrb) this.b.getValue()).e(1, 0);
    }

    public final void b(List list) {
        c9a c9aVar = this.e;
        arb arbVar = arb.CHATS_INIT_TO_RENDER;
        zqb zqbVar = (zqb) c9aVar.f(arbVar);
        if (zqbVar == null || zqbVar.c != -1) {
            return;
        }
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
        if (zqbVar2 != null) {
            c().getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zqbVar2.c = jElapsedRealtime - zqbVar2.b;
            zqbVar2.f = list;
            zqb zqbVar3 = (zqb) c9aVar.f(arb.FOLDERS_INIT_TO_RENDER);
            if (zqbVar3 == null || zqbVar3.c != -1) {
                f(jElapsedRealtime);
            }
        }
        ((jrb) this.b.getValue()).f(1, 0);
    }

    public final erb c() {
        return (erb) this.c.getValue();
    }

    public final crb d(gqb gqbVar) {
        o98 o98VarA;
        zqb zqbVar;
        c9a c9aVar = this.e;
        arb arbVar = arb.MAIN_SCREEN_INIT_TO_RENDER;
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
        long j = 0;
        if (zqbVar2 != null) {
            if (!this.h) {
                zqbVar2 = null;
            }
            if (zqbVar2 != null) {
                zqbVar2.d = 0L;
                j = 1;
            }
        }
        arb arbVar2 = arb.FOLDERS_INIT_TO_RENDER;
        zqb zqbVar3 = (zqb) c9aVar.f(arbVar2);
        gqb gqbVar2 = gqb.EVENT_OPEN_CHATS;
        long j2 = -1;
        if (zqbVar3 != null) {
            if (gqbVar != gqbVar2) {
                zqbVar3 = null;
            }
            if (zqbVar3 != null) {
                zqbVar3.d = j;
                j++;
                if (this.h) {
                    zqb zqbVar4 = (zqb) c9aVar.f(arbVar);
                    zqbVar3.e = zqbVar4 != null ? zqbVar4.d : -1L;
                }
            }
        }
        arb arbVar3 = arb.CHATS_INIT_TO_RENDER;
        zqb zqbVar5 = (zqb) c9aVar.f(arbVar3);
        if (zqbVar5 != null) {
            if (gqbVar != gqbVar2) {
                zqbVar5 = null;
            }
            if (zqbVar5 != null) {
                zqbVar5.d = j;
                j++;
                if (this.h) {
                    zqb zqbVar6 = (zqb) c9aVar.f(arbVar);
                    zqbVar5.e = zqbVar6 != null ? zqbVar6.d : -1L;
                }
            }
        }
        arb arbVar4 = arb.CHAT_INIT_TO_RENDER;
        zqb zqbVar7 = (zqb) c9aVar.f(arbVar4);
        if (zqbVar7 != null) {
            if (gqbVar != gqb.EVENT_OPEN_CHAT) {
                zqbVar7 = null;
            }
            if (zqbVar7 != null) {
                zqbVar7.d = j;
                if (this.h) {
                    zqb zqbVar8 = (zqb) c9aVar.f(arbVar);
                    zqbVar7.e = zqbVar8 != null ? zqbVar8.d : -1L;
                }
            }
        }
        int iOrdinal = gqbVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                o98 o98VarD = ve3.d();
                if (this.h && (zqbVar = (zqb) c9aVar.f(arbVar)) != null) {
                    j2 = zqbVar.c;
                    o98VarD.add(zqbVar);
                }
                zqb zqbVar9 = (zqb) c9aVar.f(arbVar4);
                if (zqbVar9 != null) {
                    if (!this.h) {
                        j2 = zqbVar9.c;
                    }
                    o98VarD.add(zqbVar9);
                    o98VarA = ve3.a(o98VarD);
                    this.h = false;
                    return new crb(j2, o98VarA);
                }
            }
            return null;
        }
        o98 o98VarD2 = ve3.d();
        if (this.h) {
            zqb zqbVar10 = (zqb) c9aVar.f(arbVar);
            if (zqbVar10 != null) {
                j2 = zqbVar10.c;
                o98VarD2.add(zqbVar10);
            }
            zqb zqbVar11 = (zqb) c9aVar.f(arbVar2);
            if (zqbVar11 != null) {
                o98VarD2.add(zqbVar11);
            }
            zqb zqbVar12 = (zqb) c9aVar.f(arbVar3);
            if (zqbVar12 != null) {
                o98VarD2.add(zqbVar12);
            }
            o98VarA = ve3.a(o98VarD2);
            this.h = false;
            return new crb(j2, o98VarA);
        }
        return null;
    }

    public final void e(gqb gqbVar, List list) {
        qt7 qt7Var = (qt7) this.f.remove(gqbVar);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.k(((zqb) it.next()).a);
        }
        this.i = false;
    }

    public final void f(long j) {
        zqb zqbVar = (zqb) this.e.f(arb.MAIN_SCREEN_INIT_TO_RENDER);
        if (zqbVar != null) {
            if (zqbVar.c != -1) {
                zqbVar = null;
            }
            if (zqbVar != null) {
                zqbVar.c = j - zqbVar.b;
            }
        }
    }
}
