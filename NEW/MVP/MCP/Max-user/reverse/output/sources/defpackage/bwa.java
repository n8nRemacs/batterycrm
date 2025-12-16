package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class bwa {
    public ghb a;
    public y4c b;
    public y4c c;
    public long d = -1;
    public final a3b e = new a3b(17);
    public final AtomicLong f = new AtomicLong(0);
    public final ey2 g = new ey2(this);
    public final boolean h = true;
    public final qdf i = new qdf(this);
    public final rdf j = new rdf(0, this);
    public final yh6 k = new yh6(this);

    public static final void a(bwa bwaVar, ghb ghbVar) {
        y4c y4cVar = bwaVar.b;
        if (y4cVar == null || bwaVar.d <= 0) {
            return;
        }
        a9i.b("close_at_empty_buffer", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - bwaVar.d));
        bwaVar.d = -1L;
    }

    public static final void b(bwa bwaVar, ghb ghbVar) {
        y4c y4cVar = bwaVar.b;
        if (y4cVar == null || bwaVar.d <= 0) {
            return;
        }
        a9i.b("empty_buffer", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - bwaVar.d));
        bwaVar.d = -1L;
    }

    public final void c(ghb ghbVar) {
        y4c y4cVar = this.b;
        if (y4cVar != null) {
            ey2 ey2Var = new ey2(ghbVar, (Long) null);
            long andSet = this.f.getAndSet(0L);
            if (andSet > 0) {
                a9i.b("download_bytes", y4cVar, ey2Var, Long.valueOf(andSet));
            }
        }
    }

    public final void d(vgb vgbVar) {
        if (fni.a(this.a, vgbVar)) {
            return;
        }
        ghb ghbVar = this.a;
        qdf qdfVar = this.i;
        if (ghbVar != null) {
            oh6 oh6Var = ((rl0) ghbVar).i;
            oh6Var.b.remove(qdfVar);
            oh6Var.b.size();
            qdfVar.toString();
        }
        ghb ghbVar2 = this.a;
        rdf rdfVar = this.j;
        if (ghbVar2 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = ((rl0) ghbVar2).j;
            copyOnWriteArrayList.remove(rdfVar);
            copyOnWriteArrayList.size();
            rdfVar.toString();
        }
        ghb ghbVar3 = this.a;
        yh6 yh6Var = this.k;
        if (ghbVar3 != null) {
            yh6 yh6Var2 = ((rl0) ghbVar3).k;
            ((CopyOnWriteArrayList) yh6Var2.b).remove(yh6Var);
            ((CopyOnWriteArrayList) yh6Var2.b).size();
            yh6Var.getClass();
        }
        if (vgbVar != null) {
            vgbVar.a(qdfVar);
        }
        if (vgbVar != null) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = vgbVar.j;
            copyOnWriteArrayList2.add(rdfVar);
            copyOnWriteArrayList2.size();
            rdfVar.toString();
        }
        if (vgbVar != null) {
            yh6 yh6Var3 = vgbVar.k;
            ((CopyOnWriteArrayList) yh6Var3.b).add(yh6Var);
            ((CopyOnWriteArrayList) yh6Var3.b).size();
            yh6Var.toString();
        }
        this.a = vgbVar;
    }
}
