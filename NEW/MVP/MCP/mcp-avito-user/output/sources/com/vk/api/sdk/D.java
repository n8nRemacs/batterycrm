package com.vk.api.sdk;

import com.vk.api.sdk.C;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class D implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C.b bVar = C.b.f366527l;
        return new Thread(runnable, L.j(Integer.valueOf(C.f366523b.getAndIncrement()), "vk-api-network-thread-"));
    }
}
