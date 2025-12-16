package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class uac {
    public final bwf A;
    public final bwf B;
    public final bwf C;
    public final ContentResolver a;
    public final qac b;
    public final vui c;
    public final boolean d;
    public final aqc e;
    public final v25 f;
    public final boolean g;
    public final uf7 h;
    public final Set i;
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public final bwf l;
    public final bwf m;
    public final bwf n;
    public final bwf o;
    public final bwf p;
    public final bwf q;
    public final bwf r;
    public final bwf s;
    public final bwf t;
    public final bwf u;
    public final bwf v;
    public final bwf w;
    public final bwf x;
    public final bwf y;
    public final bwf z;

    public uac(ContentResolver contentResolver, qac qacVar, vui vuiVar, boolean z, aqc aqcVar, v25 v25Var, boolean z2, c6a c6aVar, Set set) {
        this.a = contentResolver;
        this.b = qacVar;
        this.c = vuiVar;
        this.d = z;
        this.e = aqcVar;
        this.f = v25Var;
        this.g = z2;
        this.h = c6aVar;
        this.i = set;
        new LinkedHashMap();
        final int i = 0;
        this.l = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i2 = 17;
        this.m = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i2) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i3 = 1;
        this.n = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i3) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i4 = 2;
        this.o = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i4) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i5 = 3;
        this.p = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i5) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i6 = 4;
        this.q = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i6) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i7 = 5;
        this.r = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i7) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i8 = 6;
        this.s = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i8) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i9 = 7;
        this.t = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i9) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i10 = 8;
        this.u = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i10) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i11 = 9;
        this.v = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i11) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i12 = 10;
        this.w = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i12) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i13 = 11;
        this.x = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i13) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i14 = 12;
        this.y = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i14) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i15 = 13;
        this.z = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i15) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i16 = 14;
        this.A = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i16) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i17 = 15;
        this.B = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i17) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
        final int i18 = 16;
        this.C = new bwf(new cm6(this) { // from class: tac
            public final /* synthetic */ uac b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                xnd xndVarA;
                boolean z3 = true;
                switch (i18) {
                    case 0:
                        uac uacVar = this.b;
                        ml6.i();
                        return new t9((nac) uacVar.p.getValue(), 1);
                    case 1:
                        uac uacVar2 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar2.u.getValue(), 1);
                    case 2:
                        uac uacVar3 = this.b;
                        ml6.i();
                        return uacVar3.g((nac) uacVar3.r.getValue());
                    case 3:
                        uac uacVar4 = this.b;
                        aqc aqcVar2 = uacVar4.e;
                        qac qacVar2 = uacVar4.b;
                        ml6.i();
                        nac nacVar = (nac) uacVar4.r.getValue();
                        qacVar2.getClass();
                        return new p7g(nacVar, aqcVar2, 0);
                    case 4:
                        uac uacVar5 = this.b;
                        qac qacVar3 = uacVar5.b;
                        ml6.i();
                        nac nacVar2 = (nac) uacVar5.p.getValue();
                        qacVar3.getClass();
                        return new t9(nacVar2, 2);
                    case 5:
                        uac uacVar6 = this.b;
                        vui vuiVar2 = uacVar6.c;
                        ml6.i();
                        synchronized (uacVar6) {
                            try {
                                ml6.i();
                                qac qacVar4 = uacVar6.b;
                                t9 t9Var = new t9(uacVar6.i(new px4(qacVar4.j, qacVar4.d, vuiVar2, 2)), 0);
                                qac qacVar5 = uacVar6.b;
                                if (!uacVar6.d || uacVar6.f == v25.c) {
                                    z3 = false;
                                }
                                xndVarA = qacVar5.a(t9Var, z3, uacVar6.h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return xndVarA;
                    case 6:
                        uac uacVar7 = this.b;
                        qac qacVar6 = uacVar7.b;
                        ml6.i();
                        nac nacVar3 = (nac) uacVar7.t.getValue();
                        qacVar6.getClass();
                        return new t9(nacVar3, 2);
                    case 7:
                        uac uacVar8 = this.b;
                        aqc aqcVar3 = uacVar8.e;
                        qac qacVar7 = uacVar8.b;
                        ml6.i();
                        return new p7g(uacVar8.i(new fe4(qacVar7.i.h(), qacVar7.j, 1)), aqcVar3, 0);
                    case 8:
                        uac uacVar9 = this.b;
                        aqc aqcVar4 = uacVar9.e;
                        qac qacVar8 = uacVar9.b;
                        ml6.i();
                        return new p7g(uacVar9.i(new xc8(qacVar8.i.h(), qacVar8.j, qacVar8.a, 0)), aqcVar4, 0);
                    case 9:
                        uac uacVar10 = this.b;
                        qac qacVar9 = uacVar10.b;
                        return uacVar10.h(new fe4(qacVar9.i.h(), qacVar9.j, 1), new k8g[]{new dd8(qacVar9.i.i(), qacVar9.j, qacVar9.a)});
                    case 10:
                        uac uacVar11 = this.b;
                        qac qacVar10 = uacVar11.b;
                        return uacVar11.f(new re8(qacVar10.i.h(), qacVar10.a, 1));
                    case 11:
                        uac uacVar12 = this.b;
                        qac qacVar11 = uacVar12.b;
                        ExecutorService executorServiceH = qacVar11.i.h();
                        py0 py0Var = qacVar11.j;
                        xc8 xc8Var = new xc8(executorServiceH, py0Var, qacVar11.a, 0);
                        bk5 bk5Var = qacVar11.i;
                        return uacVar12.h(xc8Var, new k8g[]{new yc8(bk5Var.h(), py0Var, qacVar11.a), new dd8(bk5Var.i(), py0Var, qacVar11.a)});
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        uac uacVar13 = this.b;
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        qac qacVar12 = uacVar13.b;
                        return uacVar13.f(new re8(qacVar12.i.e(), qacVar12.a, 0));
                    case 13:
                        uac uacVar14 = this.b;
                        qac qacVar13 = uacVar14.b;
                        return uacVar14.h(new xc8(qacVar13.i.h(), qacVar13.j, qacVar13.a, 1), new k8g[]{new dd8(qacVar13.i.i(), qacVar13.j, qacVar13.a)});
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        uac uacVar15 = this.b;
                        qac qacVar14 = uacVar15.b;
                        return uacVar15.h(new qc8(qacVar14.i.h(), qacVar14.j, qacVar14.b, 1), new k8g[]{new dd8(qacVar14.i.i(), qacVar14.j, qacVar14.a)});
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        uac uacVar16 = this.b;
                        qac qacVar15 = uacVar16.b;
                        return uacVar16.h(new qc8(qacVar15.i.h(), qacVar15.j, qacVar15.c, 0), new k8g[]{new dd8(qacVar15.i.i(), qacVar15.j, qacVar15.a)});
                    case 16:
                        uac uacVar17 = this.b;
                        qac qacVar16 = uacVar17.b;
                        return uacVar17.g(qacVar16.a(new t9(new fe4(yu1.a, qacVar16.j, 0), 0), true, uacVar17.h));
                    default:
                        uac uacVar18 = this.b;
                        ml6.i();
                        return new t9((nac) uacVar18.t.getValue(), 1);
                }
            }
        });
    }

    public final nac a(rf7 rf7Var) {
        ml6.i();
        Uri uri = rf7Var.b;
        int i = rf7Var.c;
        if (i == 0) {
            return (nac) this.o.getValue();
        }
        bwf bwfVar = this.w;
        switch (i) {
            case 2:
                return rf7Var.c() ? d() : (nac) bwfVar.getValue();
            case 3:
                return rf7Var.c() ? d() : (nac) this.v.getValue();
            case 4:
                if (rf7Var.c()) {
                    return d();
                }
                String type = this.a.getType(uri);
                Object obj = zb9.a;
                return type != null ? dnf.r(type, "video/", false) : false ? (nac) bwfVar.getValue() : (nac) this.x.getValue();
            case 5:
                return (nac) this.B.getValue();
            case 6:
                return (nac) this.A.getValue();
            case 7:
                return (nac) this.C.getValue();
            case 8:
                return (nac) this.z.getValue();
            default:
                Set set = this.i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        throw ctd.h(it);
                    }
                }
                throw new IllegalArgumentException(wy1.h("Unsupported uri scheme! Uri is: ", q85.f(uri)));
        }
    }

    public final nac b(rf7 rf7Var) {
        q85.j(rf7Var);
        int i = rf7Var.c;
        if (i == 0) {
            return (nac) this.q.getValue();
        }
        if (i == 2 || i == 3) {
            return (nac) this.s.getValue();
        }
        throw new IllegalArgumentException(wy1.h("Unsupported uri scheme for encoded image fetch! Uri is: ", q85.f(rf7Var.b)));
    }

    public final nac c(rf7 rf7Var) {
        int i = rf7Var.c;
        Uri uri = rf7Var.b;
        ml6.i();
        q85.j(rf7Var);
        if (i == 0) {
            return (nac) this.l.getValue();
        }
        if (i == 2 || i == 3) {
            return (nac) this.m.getValue();
        }
        if (i == 4) {
            return (nac) this.n.getValue();
        }
        Set set = this.i;
        if (set != null) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
        }
        throw new IllegalArgumentException(wy1.h("Unsupported uri scheme for encoded image fetch! Uri is: ", q85.f(uri)));
    }

    public final nac d() {
        return (nac) this.y.getValue();
    }

    public final synchronized nac e(nac nacVar) {
        nac nacVar2;
        nacVar2 = (nac) this.j.get(nacVar);
        if (nacVar2 == null) {
            qac qacVar = this.b;
            px4 px4Var = new px4(nacVar, qacVar.o, qacVar.i.e());
            qac qacVar2 = this.b;
            px4 px4Var2 = new px4(qacVar2.m, qacVar2.n, px4Var, 3);
            this.j.put(nacVar, px4Var2);
            nacVar2 = px4Var2;
        }
        return nacVar2;
    }

    public final nac f(nac nacVar) {
        qac qacVar = this.b;
        jf9 jf9Var = qacVar.m;
        kk4 kk4Var = qacVar.n;
        return new ip0(qacVar.m, kk4Var, new p7g(new kp0(kk4Var, new mp0(jf9Var, kk4Var, nacVar, 0)), this.e, 0), 0);
    }

    public final nac g(nac nacVar) {
        ml6.i();
        qac qacVar = this.b;
        return f(new jh4(qacVar.d, qacVar.i.a(), qacVar.e, qacVar.f, qacVar.g, qacVar.h, nacVar, qacVar.q, qacVar.p));
    }

    public final nac h(gd8 gd8Var, k8g[] k8gVarArr) {
        t9 t9Var = new t9(i(gd8Var), 0);
        qac qacVar = this.b;
        uf7 uf7Var = this.h;
        return g(new p7g(qacVar.a(new t9(k8gVarArr), true, uf7Var), new f8g(qacVar.i.d(), qacVar.a(t9Var, true, uf7Var)), 1));
    }

    public final kp0 i(nac nacVar) {
        boolean z = this.g;
        qac qacVar = this.b;
        if (z) {
            ml6.i();
            brf brfVar = qacVar.k;
            kk4 kk4Var = qacVar.n;
            nacVar = new px4(brfVar, kk4Var, new px4(brfVar, kk4Var, nacVar, 1), 0);
        }
        jf9 jf9Var = qacVar.l;
        kk4 kk4Var2 = qacVar.n;
        return new kp0(kk4Var2, (nac) new mp0(jf9Var, kk4Var2, nacVar, 1));
    }
}
