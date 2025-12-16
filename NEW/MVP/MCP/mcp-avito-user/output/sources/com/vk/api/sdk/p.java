package com.vk.api.sdk;

import com.vk.api.sdk.utils.f;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VKApiManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/p;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f366676a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final t f366678c;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366677b = C42727D.c(new b());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366679d = C42727D.c(new a());

    /* compiled from: VKApiManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/l;", "<anonymous>", "()Lcom/vk/api/sdk/okhttp/l;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<com.vk.api.sdk.okhttp.l> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.vk.api.sdk.okhttp.l invoke() {
            return new com.vk.api.sdk.okhttp.l(new com.vk.api.sdk.okhttp.n(p.this.f366676a));
        }
    }

    /* compiled from: VKApiManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/utils/f;", "<anonymous>", "()Lcom/vk/api/sdk/utils/f;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.a<com.vk.api.sdk.utils.f> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.vk.api.sdk.utils.f invoke() {
            p pVar = p.this;
            return new com.vk.api.sdk.utils.f(new f.c(pVar.f366676a.f366591a), pVar.f366676a.f366609s, 0L, 0.0f, null, 28, null);
        }
    }

    public p(@Y61.k g gVar) {
        this.f366676a = gVar;
        this.f366678c = gVar.f366593c;
    }
}
