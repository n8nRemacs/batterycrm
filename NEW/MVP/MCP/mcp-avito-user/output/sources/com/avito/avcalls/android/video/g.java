package com.avito.avcalls.android.video;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.webrtc.EglBase;

/* compiled from: EglBaseHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/video/g;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final g f332484a = new g();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static EglBase f332485b;

    @Y61.k
    public final synchronized EglBase a() {
        EglBase eglBaseCreate;
        eglBaseCreate = f332485b;
        if (eglBaseCreate == null) {
            eglBaseCreate = EglBase.create();
            f332485b = eglBaseCreate;
        }
        return eglBaseCreate;
    }
}
