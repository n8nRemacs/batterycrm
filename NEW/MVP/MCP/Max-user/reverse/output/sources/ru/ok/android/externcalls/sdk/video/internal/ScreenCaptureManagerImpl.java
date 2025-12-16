package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.ds1;
import defpackage.k01;
import defpackage.p8a;
import defpackage.r8a;
import defpackage.sf1;
import defpackage.tv;
import defpackage.us8;
import defpackage.x71;
import defpackage.zpb;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ScreenCaptureManagerImpl;", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "Lk01;", "call", "<init>", "(Lk01;)V", "", "enabled", "isFastScreenShareEnabled", "Lqqg;", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "Lk01;", "isScreenCaptureEnabled", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final k01 call;

    public ScreenCaptureManagerImpl(k01 k01Var) {
        this.call = k01Var;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public boolean isScreenCaptureEnabled() {
        return this.call.u0.b;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setAudioCaptureEnabled(boolean enabled) {
        this.call.E(enabled);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setScreenCaptureEnabled(boolean enabled, boolean isFastScreenShareEnabled) {
        k01 k01Var = this.call;
        r8a r8aVar = k01Var.u0;
        if (k01Var.j() && k01Var.j()) {
            if (enabled) {
                k01Var.x("rtc.screencapture.enabled");
            }
            sf1 sf1Var = k01Var.G0;
            sf1Var.getClass();
            if (!enabled || sf1.d(new tv(0, 12, p8a.class, sf1Var.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                if (r8aVar.b != enabled) {
                    r8aVar.b = enabled;
                    r8aVar.c = isFastScreenShareEnabled;
                    r8aVar.a();
                    k01Var.J();
                    k01Var.l(x71.o, null);
                }
                ds1 ds1Var = k01Var.o0;
                if (ds1Var != null) {
                    zpb zpbVar = (!r8aVar.b || k01Var.Y0) ? k01Var.h1 : k01Var.g1;
                    if (zpbVar != null) {
                        if (ds1Var.F()) {
                            ds1 ds1Var2 = k01Var.o0;
                            ds1Var2.r = zpbVar;
                            us8 us8Var = ds1Var2.m;
                            if (us8Var != null) {
                                us8Var.f = zpbVar;
                                us8Var.c();
                            }
                        } else {
                            ds1 ds1Var3 = k01Var.o0;
                            ds1Var3.r = zpbVar;
                            us8 us8Var2 = ds1Var3.m;
                            if (us8Var2 != null) {
                                us8Var2.f = zpbVar;
                                us8Var2.c();
                            } else {
                                ds1Var3.R(zpbVar);
                            }
                        }
                    }
                }
            }
        }
        if (enabled) {
            return;
        }
        k01Var.E(false);
    }
}
