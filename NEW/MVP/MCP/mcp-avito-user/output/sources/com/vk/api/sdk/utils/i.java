package com.vk.api.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ThreadLocalDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/i;", "T", "Lcom/vk/api/sdk/utils/h;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f366732a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f366733b = new a(this);

    /* compiled from: ThreadLocalDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/vk/api/sdk/utils/i$a", "Ljava/lang/ThreadLocal;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends ThreadLocal<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f366734a;

        public a(i<T> iVar) {
            this.f366734a = iVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return (T) this.f366734a.f366732a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k Y41.a<? extends T> aVar) {
        this.f366732a = (N) aVar;
    }
}
