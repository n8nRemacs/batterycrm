package defpackage;

import android.app.Activity;
import androidx.camera.core.ImageCaptureException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class xtd implements NativeDoubleArrayConsumer.Consumer, vva, nva, gu3, uu1, nve, b9e, ox7, xl, tza, ot1, VideoTracker, CallsAudioManager.OnAudioDeviceInfoChangeListener, yu, kf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xtd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        ((uq) this.b).invoke(obj);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                wqi.e("j00", "Can't download attach", null);
                ((j00) obj2).a.j(false);
                break;
            case 5:
                ((kr8) obj2).putAll((Map) obj);
                break;
            default:
                m10 m10Var = (m10) obj2;
                x00 x00Var = (x00) obj;
                if (x00Var.e != null || x00Var.d != null || x00Var.r != null) {
                    if (x00Var.x != m10.c) {
                        x00Var.x = m10Var;
                        break;
                    } else {
                        wqi.e("d20", "Try to update processingOnServerStatus from PROCESSED. Ignore", null);
                        break;
                    }
                } else {
                    wqi.e("d20", "Attach is not audio/video/file. Ignore", null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        sz1 sz1Var = (sz1) this.b;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return ag7.c;
        }
        long j = sz1Var.g;
        ScheduledExecutorService scheduledExecutorService = sz1Var.c;
        ry1 ry1Var = sz1Var.d;
        uy0 uy0Var = new uy0(22);
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        vz1 vz1Var = new vz1(uy0Var);
        ry1Var.p(vz1Var);
        my1 my1Var = new my1(ry1Var, 6, vz1Var);
        qee qeeVar = ry1Var.c;
        wu1 wu1Var = vz1Var.b;
        wu1Var.b.d(my1Var, qeeVar);
        return ixi.a(new pv3(wu1Var, scheduledExecutorService, millis, 3));
    }

    @Override // defpackage.nve
    public void b(ee8 ee8Var) {
        ((enb) this.b).c = ee8Var;
    }

    @Override // defpackage.ot1
    public void c(boolean z) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                vs1.K((vs1) this.b, z);
                break;
            default:
                it1.v((it1) this.b, z);
                break;
        }
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        zh zhVar = (zh) this.b;
        if (zhVar.i && zhVar.j) {
            Iterator it = zhVar.g.iterator();
            while (it.hasNext()) {
                ((ti) it.next()).a(dArr);
            }
        }
        ((AtomicInteger) zhVar.e.Y).incrementAndGet();
    }

    @Override // defpackage.kf7
    public void d(lf7 lf7Var) throws Exception {
        boolean z;
        kw6 kw6Var = (kw6) this.b;
        boolean z2 = false;
        try {
            jf7 jf7VarE = lf7Var.e();
            if (jf7VarE != null) {
                kw6Var.f(jf7VarE);
                return;
            }
            iac iacVar = (iac) kw6Var.a;
            if (iacVar != null) {
                int i = iacVar.a;
                ImageCaptureException imageCaptureException = new ImageCaptureException("Failed to acquire latest image", null);
                jei.b();
                iac iacVar2 = (iac) kw6Var.a;
                if (iacVar2 == null || iacVar2.a != i) {
                    return;
                }
                knd kndVar = iacVar2.f;
                yb0 yb0Var = kndVar.a;
                jei.b();
                if (kndVar.g) {
                    return;
                }
                jei.b();
                int i2 = yb0Var.a;
                if (i2 > 0) {
                    yb0Var.a = i2 - 1;
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    jei.b();
                    yb0Var.b.execute(new aee(yb0Var, 22, imageCaptureException));
                }
                kndVar.a();
                kndVar.e.d(imageCaptureException);
                if (z) {
                    kndVar.b.d(yb0Var);
                }
            }
        } catch (IllegalStateException e) {
            iac iacVar3 = (iac) kw6Var.a;
            if (iacVar3 != null) {
                int i3 = iacVar3.a;
                ImageCaptureException imageCaptureException2 = new ImageCaptureException("Failed to acquire latest image", e);
                jei.b();
                iac iacVar4 = (iac) kw6Var.a;
                if (iacVar4 == null || iacVar4.a != i3) {
                    return;
                }
                knd kndVar2 = iacVar4.f;
                yb0 yb0Var2 = kndVar2.a;
                jei.b();
                if (kndVar2.g) {
                    return;
                }
                jei.b();
                int i4 = yb0Var2.a;
                if (i4 > 0) {
                    yb0Var2.a = i4 - 1;
                    z2 = true;
                }
                if (!z2) {
                    jei.b();
                    yb0Var2.b.execute(new aee(yb0Var2, 22, imageCaptureException2));
                }
                kndVar2.a();
                kndVar2.e.d(imageCaptureException2);
                if (z2) {
                    kndVar2.b.d(yb0Var2);
                }
            }
        }
    }

    @Override // defpackage.tza
    public void e(int i) {
        final v11 v11Var;
        ParticipantStatesManager participantStatesManagerF;
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
        if (i == j0b.i1) {
            ci1 ci1VarE0 = callOpponentsListWidget.E0();
            xfh.r(ci1VarE0.D0, new lm1(dqi.u(((mb4) ((tcf) ci1VarE0.X.b()).getValue()).d)));
            return;
        }
        if (i == j0b.g1) {
            ci1 ci1VarE02 = callOpponentsListWidget.E0();
            ci5 ci5Var = ci1VarE02.D0;
            Long l = ((n41) ((c51) ci1VarE02.b).j.getValue()).a;
            if (l != null) {
                long jLongValue = l.longValue();
                pe8 pe8Var = (pe8) ((pb3) ci1VarE02.v0.getValue());
                if (!((Boolean) pe8Var.v0.D(pe8Var, pe8.U0[9])).booleanValue()) {
                    xfh.r(ci5Var, om1.D);
                    return;
                }
                ug1.c.getClass();
                xc0.l(":profile/add-members?chat_id=" + jLongValue + "&is_chat=true", ci5Var);
                return;
            }
            return;
        }
        if (i == j0b.h1) {
            ci1 ci1VarE03 = callOpponentsListWidget.E0();
            xfh.r(ci1VarE03.D0, new ym1(dqi.u(((mb4) ((tcf) ci1VarE03.X.b()).getValue()).d)));
            return;
        }
        int i2 = j0b.b;
        h29 h29Var = h29.b;
        if (i == i2) {
            ci1 ci1VarE04 = callOpponentsListWidget.E0();
            final v11 v11Var2 = (v11) ((z01) ci1VarE04.s0.getValue());
            MediaMuteManager mediaMuteManagerE = v11Var2.e();
            if (mediaMuteManagerE != null) {
                nn8 nn8Var = new nn8();
                nn8Var.put(g29.b, h29Var);
                final int i3 = 1;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE, nn8Var.b(), null, new e11(v11Var2, 3), new em6() { // from class: h11
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                v11 v11Var3 = v11Var2;
                                Throwable th = (Throwable) obj;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", wy1.h("Low hands for all failed due to: ", th.getMessage()), null);
                                    }
                                }
                                v11Var3.C0.h(new db(false));
                                break;
                            case 1:
                                v11 v11Var4 = v11Var2;
                                Throwable th2 = (Throwable) obj;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", wy1.h("Disable cameras for all once failed due to: ", th2.getMessage()), null);
                                    }
                                }
                                v11Var4.C0.h(new ab(false));
                                break;
                            default:
                                v11 v11Var5 = v11Var2;
                                Throwable th3 = (Throwable) obj;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", wy1.h("Disable microphone for all once failed due to: ", th3.getMessage()), null);
                                    }
                                }
                                v11Var5.C0.h(new cb(false));
                                break;
                        }
                        return qqg.a;
                    }
                }, 2, null);
            }
            xfh.r(ci1VarE04.D0, hm1.D);
            return;
        }
        final int i4 = 2;
        if (i != j0b.d) {
            if (i != j0b.c || (participantStatesManagerF = (v11Var = (v11) ((z01) callOpponentsListWidget.E0().s0.getValue())).f()) == null) {
                return;
            }
            e11 e11Var = new e11(v11Var, i4);
            final int i5 = 0;
            participantStatesManagerF.lowerHandForAll(e11Var, new em6() { // from class: h11
                @Override // defpackage.em6
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            v11 v11Var3 = v11Var;
                            Throwable th = (Throwable) obj;
                            l6b l6bVar = wqi.a;
                            if (l6bVar != null) {
                                lg8 lg8Var = lg8.d;
                                if (l6bVar.b(lg8Var)) {
                                    l6bVar.c(lg8Var, "CallAdminSettingsController", wy1.h("Low hands for all failed due to: ", th.getMessage()), null);
                                }
                            }
                            v11Var3.C0.h(new db(false));
                            break;
                        case 1:
                            v11 v11Var4 = v11Var;
                            Throwable th2 = (Throwable) obj;
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null) {
                                lg8 lg8Var2 = lg8.d;
                                if (l6bVar2.b(lg8Var2)) {
                                    l6bVar2.c(lg8Var2, "CallAdminSettingsController", wy1.h("Disable cameras for all once failed due to: ", th2.getMessage()), null);
                                }
                            }
                            v11Var4.C0.h(new ab(false));
                            break;
                        default:
                            v11 v11Var5 = v11Var;
                            Throwable th3 = (Throwable) obj;
                            l6b l6bVar3 = wqi.a;
                            if (l6bVar3 != null) {
                                lg8 lg8Var3 = lg8.d;
                                if (l6bVar3.b(lg8Var3)) {
                                    l6bVar3.c(lg8Var3, "CallAdminSettingsController", wy1.h("Disable microphone for all once failed due to: ", th3.getMessage()), null);
                                }
                            }
                            v11Var5.C0.h(new cb(false));
                            break;
                    }
                    return qqg.a;
                }
            });
            return;
        }
        ci1 ci1VarE05 = callOpponentsListWidget.E0();
        final v11 v11Var3 = (v11) ((z01) ci1VarE05.s0.getValue());
        MediaMuteManager mediaMuteManagerE2 = v11Var3.e();
        if (mediaMuteManagerE2 != null) {
            nn8 nn8Var2 = new nn8();
            nn8Var2.put(g29.a, h29Var);
            MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE2, nn8Var2.b(), null, new e11(v11Var3, 4), new em6() { // from class: h11
                @Override // defpackage.em6
                public final Object invoke(Object obj) {
                    switch (i4) {
                        case 0:
                            v11 v11Var32 = v11Var3;
                            Throwable th = (Throwable) obj;
                            l6b l6bVar = wqi.a;
                            if (l6bVar != null) {
                                lg8 lg8Var = lg8.d;
                                if (l6bVar.b(lg8Var)) {
                                    l6bVar.c(lg8Var, "CallAdminSettingsController", wy1.h("Low hands for all failed due to: ", th.getMessage()), null);
                                }
                            }
                            v11Var32.C0.h(new db(false));
                            break;
                        case 1:
                            v11 v11Var4 = v11Var3;
                            Throwable th2 = (Throwable) obj;
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null) {
                                lg8 lg8Var2 = lg8.d;
                                if (l6bVar2.b(lg8Var2)) {
                                    l6bVar2.c(lg8Var2, "CallAdminSettingsController", wy1.h("Disable cameras for all once failed due to: ", th2.getMessage()), null);
                                }
                            }
                            v11Var4.C0.h(new ab(false));
                            break;
                        default:
                            v11 v11Var5 = v11Var3;
                            Throwable th3 = (Throwable) obj;
                            l6b l6bVar3 = wqi.a;
                            if (l6bVar3 != null) {
                                lg8 lg8Var3 = lg8.d;
                                if (l6bVar3.b(lg8Var3)) {
                                    l6bVar3.c(lg8Var3, "CallAdminSettingsController", wy1.h("Disable microphone for all once failed due to: ", th3.getMessage()), null);
                                }
                            }
                            v11Var5.C0.h(new cb(false));
                            break;
                    }
                    return qqg.a;
                }
            }, 2, null);
        }
        xfh.r(ci1VarE05.D0, hm1.D);
    }

    public void f() {
        ytd ytdVar = (ytd) this.b;
        if (ytdVar.f) {
            Iterator it = ytdVar.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                bva bvaVar = ((bud) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && ytdVar.e == 1) {
                    z = false;
                }
                bvaVar.f(z);
                i = i2;
            }
        }
    }

    @Override // defpackage.b9e
    public int g(int i) {
        switch (this.a) {
            case 10:
                e21 e21Var = (e21) ((t98) ((CallAdminSettingsScreen) this.b).c.C(i));
                int iF = e21Var.f();
                if (e21Var.g()) {
                    return iF;
                }
                return 0;
            case 11:
                i61 i61Var = (i61) ((t98) ((CallDebugMenuScreen) this.b).c.C(i));
                int iF2 = i61Var.f();
                if (i61Var.g()) {
                    return iF2;
                }
                return 0;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                return 0;
            case 13:
                return ((te1) ((t98) ((CallLinkInfoScreen) this.b).y0.C(i))).u();
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 7:
                a60 a60Var = (a60) this.b;
                a60Var.a.execute(new ud(a60Var, 12, tu1Var));
                return "AudioSource-release";
            case 21:
                ry1 ry1Var = (ry1) this.b;
                ry1Var.c.execute(new my1(ry1Var, 0, tu1Var));
                return "updateSessionConfigAsync";
            case 23:
                mz1 mz1Var = (mz1) this.b;
                mz1Var.a.h.e(tu1Var);
                mz1Var.b.b = true;
                return "AePreCapture";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((oz1) this.b).b.i.c();
                tu1Var.b(null);
                return "invokePostCaptureFuture";
            case 25:
                ((w30) this.b).b(new rz1(tu1Var, 0));
                return "submitStillCapture";
            default:
                ((vz1) this.b).a = tu1Var;
                return "waitFor3AResult";
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnAudioDeviceInfoChangeListener
    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        Object value;
        qv1 qv1Var = (qv1) this.b;
        wqi.c(qv1.class.getName(), "setOnAudioDeviceChangeListener: old: " + audioDeviceInfoChangedEvent.getOldDevice().getDeviceType() + ", new: " + audioDeviceInfoChangedEvent.getNewDevice().getDeviceType(), new Object[0]);
        f9a f9aVar = (f9a) qv1Var.q.getValue();
        do {
            value = f9aVar.getValue();
        } while (!f9aVar.c(value, audioDeviceInfoChangedEvent.getNewDevice()));
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        Activity activity = (Activity) this.b;
        tq.a.getClass();
        e6j.c(activity, sq.b);
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        return ((CallInfo.Companion) this.b).parse(xx7Var);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.VideoTracker
    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((tv) this.b).get()).booleanValue();
    }

    public /* synthetic */ xtd(sz1 sz1Var, w30 w30Var) {
        this.a = 25;
        this.b = w30Var;
    }
}
