package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ru.ok.android.onelog.OneLogDirect;

/* loaded from: classes2.dex */
public final class ey2 implements r02 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;
    public Object d;

    public void a(long j) {
        n8i n8iVar = (n8i) this.c;
        y4c y4cVar = ((bwa) this.d).b;
        if (y4cVar != null ? y4cVar.h : false) {
            n8iVar.a = SystemClock.elapsedRealtime();
        } else {
            n8iVar.a = j;
        }
        n8iVar.b = n8iVar.a;
    }

    public void b() {
        bwa bwaVar = (bwa) this.d;
        n8i n8iVar = (n8i) this.c;
        long j = n8iVar.a;
        if (j < 0) {
            return;
        }
        long j2 = n8iVar.b;
        if (j2 > j || (j2 == 0 && j == 0)) {
            y4c y4cVar = bwaVar.b;
            Long lValueOf = null;
            if (y4cVar != null ? y4cVar.h : false) {
                ghb ghbVar = bwaVar.a;
                if (ghbVar != null) {
                    if ((y4cVar != null ? y4cVar.h : false) && fni.a(Looper.myLooper(), Looper.getMainLooper())) {
                        lValueOf = Long.valueOf(((vgb) ghbVar).g());
                    }
                    ey2 ey2Var = new ey2(ghbVar, lValueOf);
                    y4c y4cVar2 = bwaVar.b;
                    if (y4cVar2 != null) {
                        String strK = u45.k(uoi.E(j), "-", uoi.E(j2));
                        if (y4cVar2.a != null) {
                            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
                            oneLogDirect.flush();
                            oneLogDirect.send(a9i.a("watch_coverage_live", y4cVar2, ey2Var, strK));
                        }
                    }
                }
            } else {
                ghb ghbVar2 = bwaVar.a;
                if (ghbVar2 != null) {
                    ey2 ey2Var2 = new ey2(ghbVar2, (Long) null);
                    y4c y4cVar3 = bwaVar.b;
                    if (y4cVar3 != null) {
                        String strK2 = u45.k(uoi.E(j), "-", uoi.E(j2));
                        if (y4cVar3.a != null) {
                            OneLogDirect oneLogDirect2 = OneLogDirect.INSTANCE;
                            oneLogDirect2.flush();
                            oneLogDirect2.send(a9i.a("watch_coverage_record", y4cVar3, ey2Var2, strK2));
                        }
                    }
                }
            }
        }
        n8iVar.a();
    }

    @Override // defpackage.r02
    public ryf e() {
        return (ryf) this.d;
    }

    @Override // defpackage.r02
    public long getTimestamp() {
        r02 r02Var = (r02) this.c;
        if (r02Var != null) {
            return r02Var.getTimestamp();
        }
        long j = this.b;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // defpackage.r02
    public p02 m() {
        r02 r02Var = (r02) this.c;
        return r02Var != null ? r02Var.m() : p02.a;
    }

    @Override // defpackage.r02
    public int o() {
        r02 r02Var = (r02) this.c;
        if (r02Var != null) {
            return r02Var.o();
        }
        return 1;
    }

    @Override // defpackage.r02
    public n02 q() {
        r02 r02Var = (r02) this.c;
        return r02Var != null ? r02Var.q() : n02.a;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append("InternalStatInfo(" + ((fk6) this.c));
                Long l = (Long) this.d;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue != 0) {
                        sb.append(", live_seek= " + jLongValue);
                    }
                }
                sb.append(", vfpo= " + this.b);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.r02
    public o02 v() {
        r02 r02Var = (r02) this.c;
        return r02Var != null ? r02Var.v() : o02.a;
    }

    public ey2(bwa bwaVar) {
        this.a = 3;
        this.d = bwaVar;
        n8i n8iVar = new n8i();
        n8iVar.a = -1L;
        n8iVar.b = -1L;
        this.c = n8iVar;
        this.b = 15000;
    }

    public ey2(ghb ghbVar, Long l) {
        v3h v3hVar;
        v3h v3hVar2;
        this.a = 2;
        bdh bdhVar = ((vgb) ghbVar).E.Z;
        this.c = (bdhVar == null || (v3hVar2 = (v3h) ((xy8) bdhVar.c)) == null) ? null : v3hVar2.b();
        this.d = l;
        long jI = 100;
        if (ghbVar instanceof rl0) {
            vgb vgbVar = (vgb) ((rl0) ghbVar);
            bdh bdhVar2 = vgbVar.E.Z;
            if (bdhVar2 != null && (v3hVar = (v3h) ((xy8) bdhVar2.c)) != null) {
                jI = vgbVar.i(v3hVar);
            }
        }
        this.b = jI;
    }

    public ey2(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.c = new z95(this);
                this.d = new z95(this);
                break;
            default:
                this.c = new SimpleDateFormat("yyyy-MM-dd'T'XXX HH:mm:", Locale.US);
                this.d = "";
                break;
        }
    }

    public ey2(r02 r02Var, ryf ryfVar, long j) {
        this.a = 5;
        this.c = r02Var;
        this.d = ryfVar;
        this.b = j;
    }
}
