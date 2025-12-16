package com.google.android.gms.internal.mlkit_common;

import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23088b;
import com.huawei.hms.framework.common.ContainerUtils;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzar {

    /* renamed from: a, reason: collision with root package name */
    public final Object f351188a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f351189b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f351190c;

    public zzar(Object obj, Object obj2, Object obj3) {
        this.f351188a = obj;
        this.f351189b = obj2;
        this.f351190c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f351188a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f351189b);
        return new IllegalArgumentException(G.g(C23088b.b("Multiple entries with same key: ", strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2, " and "), String.valueOf(obj), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f351190c)));
    }
}
