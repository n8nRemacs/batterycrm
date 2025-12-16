package defpackage;

import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class q11 implements MediaMuteManagerListener {
    public final /* synthetic */ v11 a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ k18 c;
    public final /* synthetic */ k18 d;

    public q11(v11 v11Var, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = v11Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteChanged(h9a h9aVar) {
        boolean zC;
        Object value;
        Object value2;
        boolean z;
        Object value3;
        h29 h29Var = h29.a;
        lg8 lg8Var = lg8.d;
        h29 h29Var2 = (h29) h9aVar.a.get(g29.b);
        if (h29Var2 != null) {
            v11 v11Var = this.a;
            k18 k18Var = this.b;
            boolean z2 = h29Var2 == h29Var;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", "Video was disabled by admin to " + h29Var2, null);
            }
            if (z2) {
                z = false;
            } else {
                CameraManager cameraManagerA = ((f41) k18Var.getValue()).a();
                z = cameraManagerA != null && cameraManagerA.isCameraEnabled();
                ((f41) k18Var.getValue()).c(false);
            }
            tcf tcfVar = v11Var.E0;
            do {
                value3 = tcfVar.getValue();
            } while (!tcfVar.c(value3, ca.a((ca) value3, false, v11.h(h29Var2), false, false, false, false, 125)));
            if (!v11.h(h29Var2)) {
                v11Var.C0.h(new za(true, false));
            } else if (z) {
                v11Var.C0.h(ta.a);
            }
        }
        h29 h29Var3 = (h29) h9aVar.a.get(g29.a);
        if (h29Var3 != null) {
            v11 v11Var2 = this.a;
            k18 k18Var2 = this.c;
            boolean z3 = h29Var3 == h29Var;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, "CallAdminSettingsController", "Microphone was changed by admin to " + h29Var3, null);
            }
            if (!z3) {
                ((w21) ((v21) k18Var2.getValue())).d();
                ((w21) ((v21) k18Var2.getValue())).e(false);
            }
            tcf tcfVar2 = v11Var2.E0;
            do {
                value2 = tcfVar2.getValue();
            } while (!tcfVar2.c(value2, ca.a((ca) value2, false, false, v11.h(h29Var3), false, false, false, 123)));
            Conversation conversationA = v11Var2.d().a();
            if (!(conversationA != null ? conversationA.isMeCreatorOrAdmin() : false)) {
                if (!v11.h(h29Var3)) {
                    v11Var2.C0.h(new bb(true, false));
                } else if (!z3) {
                    v11Var2.C0.h(ua.a);
                }
            }
        }
        h29 h29Var4 = (h29) h9aVar.a.get(g29.c);
        if (h29Var4 != null) {
            v11 v11Var3 = this.a;
            k18 k18Var3 = this.d;
            boolean z4 = h29Var4 == h29Var;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, "CallAdminSettingsController", "Screen sharing was disabled by admin to " + h29Var4, null);
            }
            if (z4) {
                zC = false;
            } else {
                zC = ((g1e) k18Var3.getValue()).c();
                ((g1e) k18Var3.getValue()).b(false);
            }
            tcf tcfVar3 = v11Var3.E0;
            do {
                value = tcfVar3.getValue();
            } while (!tcfVar3.c(value, ca.a((ca) value, false, false, false, v11.h(h29Var4), false, false, 119)));
            if (!v11.h(h29Var4) && zC) {
                v11Var3.C0.h(new fb(true, false));
            } else if (zC) {
                v11Var3.C0.h(xa.a);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteStateInitialized(h9a h9aVar) {
        boolean zH;
        i29 mediaOptionsForCall$default;
        h29 h29Var;
        boolean zH2;
        i29 mediaOptionsForCall$default2;
        h29 h29Var2;
        boolean zH3;
        i29 mediaOptionsForCall$default3;
        h29 h29Var3;
        AbstractMap abstractMap = h9aVar.a;
        v11 v11Var = this.a;
        AtomicBoolean atomicBoolean = v11Var.u0;
        if (atomicBoolean.get()) {
            return;
        }
        h29 h29Var4 = (h29) abstractMap.get(g29.b);
        boolean zH4 = false;
        if (h29Var4 != null) {
            zH = v11.h(h29Var4);
        } else {
            MediaMuteManager mediaMuteManagerE = v11Var.e();
            zH = (mediaMuteManagerE == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE, null, 1, null)) == null || (h29Var = mediaOptionsForCall$default.b) == null) ? false : v11.h(h29Var);
        }
        h29 h29Var5 = (h29) abstractMap.get(g29.a);
        if (h29Var5 != null) {
            zH2 = v11.h(h29Var5);
        } else {
            MediaMuteManager mediaMuteManagerE2 = v11Var.e();
            zH2 = (mediaMuteManagerE2 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (h29Var2 = mediaOptionsForCall$default2.a) == null) ? false : v11.h(h29Var2);
        }
        h29 h29Var6 = (h29) abstractMap.get(g29.c);
        if (h29Var6 != null) {
            zH3 = v11.h(h29Var6);
        } else {
            MediaMuteManager mediaMuteManagerE3 = v11Var.e();
            if (mediaMuteManagerE3 != null && (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) != null && (h29Var3 = mediaOptionsForCall$default3.c) != null) {
                zH4 = v11.h(h29Var3);
            }
            zH3 = zH4;
        }
        v11Var.l(zH, zH2, zH3);
        atomicBoolean.set(true);
        v11Var.k();
    }
}
