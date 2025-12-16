package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import j.InterfaceC42164u;
import j.P;
import j.X;

@X
/* loaded from: classes8.dex */
final class h {
    @InterfaceC42164u
    public static boolean a(@P Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    @InterfaceC42164u
    public static boolean b(@P Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
