package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.aee;
import defpackage.b32;
import defpackage.cm6;
import defpackage.k01;
import defpackage.ove;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.video.CameraManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/CameraManagerImpl;", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "Lk01;", "call", "Lkotlin/Function0;", "", "isInited", "isPrepared", "<init>", "(Lk01;Lcm6;Lcm6;)V", "Lb32;", "cameraParams", "Lqqg;", "switchCamera", "(Lb32;)V", "Lk01;", "Lcm6;", "isCapturingFromFrontCamera", "()Z", "", "getNumberOfCameras", "()I", "numberOfCameras", SdkMetricStatEvent.VALUE_KEY, "isCameraEnabled", "setCameraEnabled", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraManagerImpl implements CameraManager {
    private final k01 call;
    private final cm6 isInited;
    private final cm6 isPrepared;

    public CameraManagerImpl(k01 k01Var, cm6 cm6Var, cm6 cm6Var2) {
        this.call = k01Var;
        this.isInited = cm6Var;
        this.isPrepared = cm6Var2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public int getNumberOfCameras() {
        if (((Boolean) this.isInited.invoke()).booleanValue()) {
            return this.call.I;
        }
        return 0;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCameraEnabled() {
        return this.call.u0.f;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCapturingFromFrontCamera() {
        return this.call.g0.c() == 1;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void setCameraEnabled(boolean z) {
        if (((Boolean) this.isPrepared.invoke()).booleanValue()) {
            k01 k01Var = this.call;
            if (k01Var.j()) {
                k01Var.x("rtc.video.switch");
                k01Var.n(z);
                k01Var.J();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void switchCamera(b32 cameraParams) {
        k01 k01Var = this.call;
        if (k01Var.j() && k01Var.i0.d) {
            k01Var.P.log("OKRTCCall", "switchCamera");
            k01Var.x("rtc.switch_camera");
            ove oveVar = k01Var.g0;
            oveVar.k.log("SlmsSource", "switchCamera");
            oveVar.c.a.execute(new aee(oveVar, 9, cameraParams));
        }
    }
}
