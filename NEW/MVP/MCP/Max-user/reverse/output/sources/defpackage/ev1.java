package defpackage;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.media.transformer.MediaTransformException;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

/* loaded from: classes2.dex */
public final /* synthetic */ class ev1 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ ev1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
        this.X = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$9((cm6) this.b, (cm6) this.c, (CallsAudioManagerV3Impl) this.d, (String) this.o, (em6) this.X);
                break;
            case 1:
                ((cr3) this.c).run().d(new u02((fde) this.b, (AtomicBoolean) this.d, (dr3) this.o, (AtomicBoolean) this.X, 3), dx4.a);
                break;
            case 2:
                ax4 ax4Var = (ax4) this.b;
                StatsReport[] statsReportArr = (StatsReport[]) this.c;
                StatsReport[] statsReportArr2 = (StatsReport[]) this.d;
                ti1 ti1Var = (ti1) this.o;
                eef eefVar = (eef) this.X;
                os0[] os0VarArr = new os0[statsReportArr2.length];
                yi1 yi1Var = ax4Var.k.a;
                yi1 yi1VarW = ax4Var.w(ti1Var);
                boolean z = false;
                for (int i = 0; i < statsReportArr2.length; i++) {
                    if (statsReportArr2[i].id.endsWith("_recv")) {
                        os0VarArr[i] = new os0(yi1VarW, z);
                    } else {
                        os0VarArr[i] = new os0(yi1Var, z);
                    }
                }
                eefVar.a(statsReportArr, statsReportArr2, os0VarArr, Collections.EMPTY_MAP, ax4Var);
                break;
            case 3:
                sa9 sa9Var = (sa9) this.b;
                hhg hhgVar = (hhg) this.c;
                pm3 pm3Var = (pm3) this.d;
                String str = (String) this.o;
                ra9 ra9Var = (ra9) this.X;
                String str2 = (String) sa9Var.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str2, "Transformer.startSafely", null);
                    }
                }
                try {
                    hhgVar.f(pm3Var, str);
                    break;
                } catch (Throwable th) {
                    wqi.e((String) sa9Var.b, "Unexpected failure when start transformer", th);
                    MediaTransformException mediaTransformException = new MediaTransformException("Unexpected failure when start transformer", th);
                    wqi.e(ra9Var.b, "onError", mediaTransformException);
                    ra9Var.a.a(mediaTransformException);
                    ra9Var.a();
                    return;
                }
            case 4:
                gfe gfeVar = (gfe) this.b;
                StatsReport[] statsReportArr3 = (StatsReport[]) this.c;
                StatsReport[] statsReportArr4 = (StatsReport[]) this.d;
                ArrayList arrayList = (ArrayList) this.o;
                eef eefVar2 = (eef) this.X;
                Map mapX = gfeVar.x();
                os0[] os0VarArr2 = new os0[statsReportArr4.length];
                boolean z2 = false;
                for (int i2 = 0; i2 < statsReportArr4.length; i2++) {
                    l8i l8iVar = (l8i) arrayList.get(i2);
                    if (l8iVar.b) {
                        os0VarArr2[i2] = new os0((Object) null, true);
                    } else {
                        os0VarArr2[i2] = new os0(l8iVar.c ? gfeVar.k.a : gfeVar.w(l8iVar.a), z2);
                    }
                }
                eefVar2.a(statsReportArr3, statsReportArr4, os0VarArr2, mapX, gfeVar);
                break;
            case 5:
                s1h s1hVar = (s1h) this.b;
                dsf dsfVar = (dsf) this.c;
                n22 n22Var = (n22) this.d;
                t1h t1hVar = (t1h) this.o;
                f9g f9gVar = (f9g) this.X;
                if (n22Var == s1hVar.c()) {
                    s1hVar.u = dsfVar.d(n22Var, true);
                    uah uahVar = (uah) t1hVar.f(t1h.b);
                    Objects.requireNonNull(uahVar);
                    uahVar.f(s1hVar.u, f9gVar);
                    s1hVar.P();
                    break;
                }
                break;
            case 6:
                WebTransportSocket.handleAsync$lambda$7((WebTransportSocket) this.b, (String) this.o, (sm6) this.c, this.d, (WebTransportSocket.Listener) this.X);
                break;
            default:
                c5i c5iVar = (c5i) this.b;
                String str3 = (String) this.o;
                wib wibVar = (wib) this.c;
                d6i d6iVar = (d6i) this.d;
                WorkRequest workRequest = (WorkRequest) this.X;
                s5i s5iVarX = c5iVar.c.x();
                ArrayList arrayListQ = s5iVarX.q(str3);
                if (arrayListQ.size() > 1) {
                    wibVar.B(new sib(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                    break;
                } else {
                    p5i p5iVar = (p5i) ue3.I(arrayListQ);
                    if (p5iVar == null) {
                        d6iVar.invoke();
                        break;
                    } else {
                        String str4 = p5iVar.a;
                        r5i r5iVarP = s5iVarX.p(str4);
                        if (r5iVarP == null) {
                            wibVar.B(new sib(new IllegalStateException(wy1.j("WorkSpec with ", str4, ", that matches a name \"", str3, "\", wasn't found"))));
                            break;
                        } else if (!r5iVarP.d()) {
                            wibVar.B(new sib(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                            break;
                        } else if (p5iVar.b == w4i.X) {
                            s5iVarX.i(str4);
                            d6iVar.invoke();
                            break;
                        } else {
                            try {
                                ssi.q(c5iVar.f, c5iVar.c, c5iVar.b, c5iVar.e, r5i.b(workRequest.getWorkSpec(), p5iVar.a, null, null, null, 0, 0L, 0, 1048574), workRequest.getTags());
                                wibVar.B(vib.P);
                                break;
                            } catch (Throwable th2) {
                                wibVar.B(new sib(th2));
                            }
                        }
                    }
                }
        }
    }

    public /* synthetic */ ev1(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.o = str;
        this.c = obj2;
        this.d = obj3;
        this.X = obj4;
    }
}
