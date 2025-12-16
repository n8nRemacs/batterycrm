package com.vk.api.sdk.utils;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StartUpMethodPriorityBackoffBaseImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/g;", "Lcom/vk/api/sdk/utils/b;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f366731b;

    /* compiled from: StartUpMethodPriorityBackoffBaseImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/api/sdk/utils/g$a;", "", "<init>", "()V", "", "METHOD_WAIT_TIMEOUT", "J", "Ljava/util/concurrent/atomic/AtomicInteger;", "idGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f366731b = new AtomicInteger();
    }

    @Override // com.vk.api.sdk.utils.b
    public final boolean a() {
        throw null;
    }

    @Override // com.vk.api.sdk.utils.b
    public final int b() {
        f366731b.incrementAndGet();
        throw null;
    }

    @Override // com.vk.api.sdk.utils.b
    public final void c() {
        throw null;
    }

    @Override // com.vk.api.sdk.utils.b
    public final boolean isActive() {
        throw null;
    }
}
