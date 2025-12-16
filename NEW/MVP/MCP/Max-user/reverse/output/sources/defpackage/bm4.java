package defpackage;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class bm4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bm4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                cm4 cm4Var = (cm4) this.b;
                bi biVar = cm4Var.b;
                lrd lrdVar = cm4Var.a;
                vk6 vk6VarA = biVar.a();
                try {
                    lrdVar.c();
                    try {
                        vk6VarA.w();
                        lrdVar.q();
                        biVar.r(vk6VarA);
                        return null;
                    } finally {
                        lrdVar.k();
                    }
                } catch (Throwable th) {
                    biVar.r(vk6VarA);
                    throw th;
                }
            case 1:
                m35 m35Var = (m35) this.b;
                bi biVar2 = m35Var.d;
                OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl = m35Var.a;
                vk6 vk6VarA2 = biVar2.a();
                try {
                    oneMeRoomDatabase_Impl.c();
                    try {
                        vk6VarA2.w();
                        oneMeRoomDatabase_Impl.q();
                        biVar2.r(vk6VarA2);
                        return null;
                    } finally {
                        oneMeRoomDatabase_Impl.k();
                    }
                } catch (Throwable th2) {
                    biVar2.r(vk6VarA2);
                    throw th2;
                }
            case 2:
                hs5 hs5Var = (hs5) this.b;
                bi biVar3 = hs5Var.c;
                lrd lrdVar2 = hs5Var.a;
                vk6 vk6VarA3 = biVar3.a();
                try {
                    lrdVar2.c();
                    try {
                        vk6VarA3.w();
                        lrdVar2.q();
                        biVar3.r(vk6VarA3);
                        return null;
                    } finally {
                        lrdVar2.k();
                    }
                } catch (Throwable th3) {
                    biVar3.r(vk6VarA3);
                    throw th3;
                }
            case 3:
                qs5 qs5Var = (qs5) this.b;
                bi biVar4 = qs5Var.c;
                lrd lrdVar3 = qs5Var.a;
                vk6 vk6VarA4 = biVar4.a();
                try {
                    lrdVar3.c();
                    try {
                        vk6VarA4.w();
                        lrdVar3.q();
                        biVar4.r(vk6VarA4);
                        return null;
                    } finally {
                        lrdVar3.k();
                    }
                } catch (Throwable th4) {
                    biVar4.r(vk6VarA4);
                    throw th4;
                }
            case 4:
                vs5 vs5Var = (vs5) this.b;
                bi biVar5 = vs5Var.c;
                lrd lrdVar4 = vs5Var.a;
                vk6 vk6VarA5 = biVar5.a();
                try {
                    lrdVar4.c();
                    try {
                        vk6VarA5.w();
                        lrdVar4.q();
                        biVar5.r(vk6VarA5);
                        return qqg.a;
                    } finally {
                        lrdVar4.k();
                    }
                } catch (Throwable th5) {
                    biVar5.r(vk6VarA5);
                    throw th5;
                }
            case 5:
                mt5 mt5Var = (mt5) this.b;
                bi biVar6 = mt5Var.c;
                lrd lrdVar5 = mt5Var.a;
                vk6 vk6VarA6 = biVar6.a();
                try {
                    lrdVar5.c();
                    try {
                        vk6VarA6.w();
                        lrdVar5.q();
                        biVar6.r(vk6VarA6);
                        return qqg.a;
                    } finally {
                        lrdVar5.k();
                    }
                } catch (Throwable th6) {
                    biVar6.r(vk6VarA6);
                    throw th6;
                }
            case 6:
                ((Runnable) this.b).run();
                return null;
            case 7:
                an9 an9Var = (an9) this.b;
                bi biVar7 = an9Var.d;
                lrd lrdVar6 = an9Var.a;
                vk6 vk6VarA7 = biVar7.a();
                try {
                    lrdVar6.c();
                    try {
                        vk6VarA7.w();
                        lrdVar6.q();
                        biVar7.r(vk6VarA7);
                        return null;
                    } finally {
                        lrdVar6.k();
                    }
                } catch (Throwable th7) {
                    biVar7.r(vk6VarA7);
                    throw th7;
                }
            case 8:
                sx sxVar = (sx) this.b;
                AtomicBoolean atomicBoolean = sxVar.d;
                sxVar.o.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        sxVar.Y.c();
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 9:
                wna wnaVar = (wna) this.b;
                hq9 hq9Var = wnaVar.e;
                lrd lrdVar7 = wnaVar.a;
                vk6 vk6VarA8 = hq9Var.a();
                try {
                    lrdVar7.c();
                    try {
                        vk6VarA8.w();
                        lrdVar7.q();
                        hq9Var.r(vk6VarA8);
                        return qqg.a;
                    } finally {
                        lrdVar7.k();
                    }
                } catch (Throwable th8) {
                    hq9Var.r(vk6VarA8);
                    throw th8;
                }
            case 10:
                coa coaVar = (coa) this.b;
                hq9 hq9Var2 = coaVar.c;
                lrd lrdVar8 = coaVar.a;
                vk6 vk6VarA9 = hq9Var2.a();
                try {
                    lrdVar8.c();
                    try {
                        vk6VarA9.w();
                        lrdVar8.q();
                        hq9Var2.r(vk6VarA9);
                        return qqg.a;
                    } finally {
                        lrdVar8.k();
                    }
                } catch (Throwable th9) {
                    hq9Var2.r(vk6VarA9);
                    throw th9;
                }
            case 11:
                wpa wpaVar = (wpa) this.b;
                hq9 hq9Var3 = wpaVar.d;
                lrd lrdVar9 = wpaVar.a;
                vk6 vk6VarA10 = hq9Var3.a();
                try {
                    lrdVar9.c();
                    try {
                        vk6VarA10.w();
                        lrdVar9.q();
                        hq9Var3.r(vk6VarA10);
                        return qqg.a;
                    } finally {
                        lrdVar9.k();
                    }
                } catch (Throwable th10) {
                    hq9Var3.r(vk6VarA10);
                    throw th10;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                jdc jdcVar = (jdc) this.b;
                hq9 hq9Var4 = (hq9) jdcVar.d;
                lrd lrdVar10 = (lrd) jdcVar.b;
                vk6 vk6VarA11 = hq9Var4.a();
                try {
                    lrdVar10.c();
                    try {
                        vk6VarA11.w();
                        lrdVar10.q();
                        hq9Var4.r(vk6VarA11);
                        return qqg.a;
                    } finally {
                        lrdVar10.k();
                    }
                } catch (Throwable th11) {
                    hq9Var4.r(vk6VarA11);
                    throw th11;
                }
            case 13:
                ocd ocdVar = (ocd) this.b;
                hq9 hq9Var5 = ocdVar.d;
                lrd lrdVar11 = ocdVar.a;
                vk6 vk6VarA12 = hq9Var5.a();
                try {
                    lrdVar11.c();
                    try {
                        vk6VarA12.w();
                        lrdVar11.q();
                        hq9Var5.r(vk6VarA12);
                        return null;
                    } finally {
                        lrdVar11.k();
                    }
                } catch (Throwable th12) {
                    hq9Var5.r(vk6VarA12);
                    throw th12;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                xdf xdfVar = (xdf) this.b;
                crd crdVar = xdfVar.c;
                lrd lrdVar12 = xdfVar.a;
                vk6 vk6VarA13 = crdVar.a();
                try {
                    lrdVar12.c();
                    try {
                        vk6VarA13.w();
                        lrdVar12.q();
                        crdVar.r(vk6VarA13);
                        return qqg.a;
                    } finally {
                        lrdVar12.k();
                    }
                } catch (Throwable th13) {
                    crdVar.r(vk6VarA13);
                    throw th13;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                jgf jgfVar = (jgf) this.b;
                crd crdVar2 = jgfVar.c;
                lrd lrdVar13 = jgfVar.a;
                vk6 vk6VarA14 = crdVar2.a();
                try {
                    lrdVar13.c();
                    try {
                        vk6VarA14.w();
                        lrdVar13.q();
                        crdVar2.r(vk6VarA14);
                        return null;
                    } finally {
                        lrdVar13.k();
                    }
                } catch (Throwable th14) {
                    crdVar2.r(vk6VarA14);
                    throw th14;
                }
            case 16:
                fuf fufVar = (fuf) this.b;
                crd crdVar3 = fufVar.d;
                lrd lrdVar14 = fufVar.a;
                vk6 vk6VarA15 = crdVar3.a();
                try {
                    lrdVar14.c();
                    try {
                        vk6VarA15.w();
                        lrdVar14.q();
                        crdVar3.r(vk6VarA15);
                        return qqg.a;
                    } finally {
                        lrdVar14.k();
                    }
                } catch (Throwable th15) {
                    crdVar3.r(vk6VarA15);
                    throw th15;
                }
            case LangUtils.HASH_SEED /* 17 */:
                ewg ewgVar = (ewg) this.b;
                crd crdVar4 = ewgVar.f;
                lrd lrdVar15 = ewgVar.a;
                vk6 vk6VarA16 = crdVar4.a();
                try {
                    lrdVar15.c();
                    try {
                        vk6VarA16.w();
                        lrdVar15.q();
                        crdVar4.r(vk6VarA16);
                        return null;
                    } finally {
                        lrdVar15.k();
                    }
                } catch (Throwable th16) {
                    crdVar4.r(vk6VarA16);
                    throw th16;
                }
            case 18:
                o2h o2hVar = (o2h) this.b;
                crd crdVar5 = o2hVar.d;
                lrd lrdVar16 = o2hVar.a;
                vk6 vk6VarA17 = crdVar5.a();
                try {
                    lrdVar16.c();
                    try {
                        vk6VarA17.w();
                        lrdVar16.q();
                        crdVar5.r(vk6VarA17);
                        return null;
                    } finally {
                        lrdVar16.k();
                    }
                } catch (Throwable th17) {
                    crdVar5.r(vk6VarA17);
                    throw th17;
                }
            case 19:
                b1j b1jVar = (b1j) this.b;
                b1jVar.getClass();
                return h38.c.a(b1jVar.g);
            case 20:
                a8j a8jVar = (a8j) this.b;
                a8jVar.getClass();
                return h38.c.a(a8jVar.a);
            default:
                fcj fcjVar = (fcj) this.b;
                fcjVar.getClass();
                return h38.c.a(fcjVar.g);
        }
    }
}
