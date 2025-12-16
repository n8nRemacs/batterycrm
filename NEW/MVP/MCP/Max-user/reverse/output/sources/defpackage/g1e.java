package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* loaded from: classes.dex */
public final class g1e {
    public final k18 a;
    public final tcf b = ucf.a(Boolean.FALSE);

    public g1e(k18 k18Var) {
        this.a = k18Var;
    }

    public final void a(boolean z) {
        Object value;
        tcf tcfVar = this.b;
        do {
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(z)));
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ScreenCaptureController", xc0.f("ScreenCaptureController screen sharing audio changed=", z), null);
            }
        }
        Conversation conversationA = ((n64) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ScreenCaptureController", xc0.f("ScreenCaptureController screen sharing changed=", z), null);
            }
        }
        Conversation conversationA = ((n64) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA != null ? conversationA.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        k18 k18Var = this.a;
        Conversation conversationA = ((n64) k18Var.getValue()).a();
        if (conversationA == null || !conversationA.isPrepared()) {
            return false;
        }
        Conversation conversationA2 = ((n64) k18Var.getValue()).a();
        ScreenCaptureManager screenCaptureManager = conversationA2 != null ? conversationA2.getScreenCaptureManager() : null;
        return screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled();
    }
}
