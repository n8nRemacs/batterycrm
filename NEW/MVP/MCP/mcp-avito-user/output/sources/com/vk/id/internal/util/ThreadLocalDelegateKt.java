package com.vk.id.internal.util;

import Y41.a;
import Y61.k;
import kotlin.Metadata;

/* compiled from: ThreadLocalDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lkotlin/Function0;", "factory", "Lcom/vk/id/internal/util/ThreadLocalDelegate;", "threadLocal", "(LY41/a;)Lcom/vk/id/internal/util/ThreadLocalDelegate;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadLocalDelegateKt {
    @k
    public static final <T> ThreadLocalDelegate<T> threadLocal(@k a<? extends T> aVar) {
        return new ThreadLocalDelegateImpl(aVar);
    }
}
