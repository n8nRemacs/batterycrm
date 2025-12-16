package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.my.tracker.campaign.CampaignService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class vy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez1 ez1Var = (ez1) this.b;
                ez1Var.E0 = false;
                ez1Var.D0 = false;
                ez1Var.t("OpenCameraConfigAndClose is done, state: ".concat(wy1.u(ez1Var.R0)), null);
                int iV = az1.v(ez1Var.R0);
                if (iV == 1 || iV == 4) {
                    z5j.f(null, ez1Var.w0.isEmpty());
                    ez1Var.u();
                    return;
                } else {
                    if (iV != 6) {
                        ez1Var.t("OpenCameraConfigAndClose finished while in state: ".concat(wy1.u(ez1Var.R0)), null);
                        return;
                    }
                    int i = ez1Var.u0;
                    if (i == 0) {
                        ez1Var.J(false);
                        return;
                    } else {
                        ez1Var.t("OpenCameraConfigAndClose in error: ".concat(ez1.v(i)), null);
                        ez1Var.Z.b();
                        return;
                    }
                }
            case 1:
                ((CameraDevice) this.b).close();
                return;
            case 2:
                cz1 cz1Var = (cz1) this.b;
                if (cz1Var.b) {
                    return;
                }
                z5j.f(null, ((dz1) cz1Var.d).f.R0 == 7 || ((dz1) cz1Var.d).f.R0 == 6);
                if (((dz1) cz1Var.d).c()) {
                    ((dz1) cz1Var.d).f.I(true);
                    return;
                } else {
                    ((dz1) cz1Var.d).f.J(true);
                    return;
                }
            case 3:
                ((sz1) this.b).i.c();
                return;
            case 4:
                ((de7) this.b).clear();
                return;
            case 5:
                v12 v12Var = (v12) this.b;
                w12 w12Var = v12Var.c;
                dhd dhdVar = (dhd) w12Var.k.remove(v12Var);
                if (dhdVar == null || w12Var.j != dhdVar) {
                    return;
                }
                w12Var.j = null;
                return;
            case 6:
                ((s22) this.b).b.onCameraAccessPrioritiesChanged();
                return;
            case 7:
                yy1 yy1Var = (yy1) this.b;
                if (yy1Var.c.R0 == 4) {
                    yy1Var.c.J(false);
                    return;
                }
                return;
            case 8:
                ao6 ao6Var = (ao6) this.b;
                if (((ez1) ao6Var.b).R0 == 9) {
                    ((ez1) ao6Var.b).B();
                    return;
                }
                return;
            case 9:
                ((CampaignService) this.b).stopSelf();
                return;
            case 10:
                iac iacVar = (iac) ((kw6) ((l52) this.b).b).a;
                if (iacVar != null) {
                    iacVar.f.b();
                    return;
                }
                return;
            case 11:
                p52 p52Var = (p52) this.b;
                synchronized (p52Var.a) {
                    if (p52Var.b.isEmpty()) {
                        return;
                    }
                    try {
                        p52Var.i(p52Var.b);
                        return;
                    } finally {
                        p52Var.b.clear();
                    }
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                for (awf awfVar : (LinkedHashSet) this.b) {
                    awfVar.getClass();
                    awfVar.c(awfVar);
                }
                return;
            case 13:
                ((CarouselLayoutManager) this.b).x0();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                uc2 uc2Var = (uc2) this.b;
                uc2Var.V0 = false;
                uc2Var.requestLayout();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((yo2) this.b).invoke();
                return;
            case 16:
                ChatScreen chatScreen = (ChatScreen) this.b;
                yy7[] yy7VarArr = ChatScreen.l1;
                chatScreen.e1().f(true);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
                yy7[] yy7VarArr2 = ChatsListSearchScreen.I0;
                chatsListSearchScreen.C0();
                chatsListSearchScreen.D0(false);
                return;
            case 18:
                wqi.q(((ChatsListWidget) this.b).a, "Can't update chats list", new Object[0]);
                return;
            case 19:
                ((za3) this.b).t(true);
                return;
            case 20:
                kl3 kl3Var = (kl3) this.b;
                Runnable runnable = kl3Var.b;
                if (runnable != null) {
                    runnable.run();
                    kl3Var.b = null;
                    return;
                }
                return;
            case 21:
                pl3.a((pl3) this.b);
                return;
            case 22:
                Iterator it = ((bs3) this.b).k.iterator();
                while (it.hasNext()) {
                    ((tr3) it.next()).b();
                }
                return;
            case 23:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                if (constraintTrackingWorker.d.a instanceof c1) {
                    return;
                }
                String strE = constraintTrackingWorker.getInputData().e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                cei ceiVarG = cei.g();
                if (strE == null || strE.length() == 0) {
                    ceiVarG.e(xt3.a, "No worker to delegate to.");
                    constraintTrackingWorker.d.i(la8.a());
                    return;
                }
                ma8 ma8VarB = constraintTrackingWorker.getWorkerFactory().b(constraintTrackingWorker.getApplicationContext(), strE, constraintTrackingWorker.a);
                constraintTrackingWorker.o = ma8VarB;
                if (ma8VarB == null) {
                    ceiVarG.c(xt3.a, "No worker to delegate to.");
                    constraintTrackingWorker.d.i(la8.a());
                    return;
                }
                c5i c5iVarD = c5i.d(constraintTrackingWorker.getApplicationContext());
                r5i r5iVarP = c5iVarD.c.x().p(constraintTrackingWorker.getId().toString());
                if (r5iVarP == null) {
                    ike ikeVar = constraintTrackingWorker.d;
                    String str = xt3.a;
                    ikeVar.i(la8.a());
                    return;
                }
                jkc jkcVar = new jkc(c5iVarD.j, constraintTrackingWorker);
                jkcVar.w(Collections.singletonList(r5iVarP));
                if (!jkcVar.l(constraintTrackingWorker.getId().toString())) {
                    ceiVarG.c(xt3.a, "Constraints not met for delegate " + strE + ". Requesting retry.");
                    constraintTrackingWorker.d.i(new ja8());
                    return;
                }
                ceiVarG.c(xt3.a, "Constraints met for delegate ".concat(strE));
                try {
                    ha8 ha8VarStartWork = constraintTrackingWorker.o.startWork();
                    ha8VarStartWork.d(new my1(constraintTrackingWorker, 17, ha8VarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str2 = xt3.a;
                    ceiVarG.d(str2, ho7.i("Delegated worker ", strE, " threw exception in startWork."), th);
                    synchronized (constraintTrackingWorker.b) {
                        try {
                            if (!constraintTrackingWorker.c) {
                                constraintTrackingWorker.d.i(la8.a());
                                return;
                            } else {
                                ceiVarG.c(str2, "Constraints were unmet, Retrying.");
                                constraintTrackingWorker.d.i(new ja8());
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                Iterator it2 = ((w14) this.b).j.iterator();
                if (it2.hasNext()) {
                    throw ctd.h(it2);
                }
                return;
            case 25:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.b;
                if (coroutineWorker.b.a instanceof c1) {
                    coroutineWorker.a.cancel((CancellationException) null);
                    return;
                }
                return;
            case 26:
                int andSet = ((AtomicInteger) ((qs3) this.b).d).getAndSet(8) - 8;
                feg fegVar = feg.a;
                w55 w55VarB = feg.b();
                w55VarB.getClass();
                w55VarB.a(Collections.singletonList(new y55("non_fatal", "max_non_fatals_per_session_reached", andSet)));
                return;
            case 27:
                ((hv1) this.b).invoke();
                return;
            case 28:
                ((VpxDecoderWrapper) this.b).close();
                return;
            default:
                nj4 nj4Var = (nj4) this.b;
                nj4Var.I(nj4Var.D(), 1028, new vi4(16));
                nj4Var.X.d();
                return;
        }
    }
}
