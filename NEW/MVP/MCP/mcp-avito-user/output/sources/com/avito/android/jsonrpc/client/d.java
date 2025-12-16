package com.avito.android.jsonrpc.client;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: JsonRpcServiceBuilder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/jsonrpc/client/d;", "T", "B", "", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d<T, B> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b<B> f174726a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.jsonrpc.client.a<B> f174727b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<? super String, G0> f174728c;

    /* compiled from: JsonRpcServiceBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "B", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f174729l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    public d(@k Class<T> cls, @k b<B> bVar, @k com.avito.android.jsonrpc.client.a<B> aVar, @k l<? super String, G0> lVar) {
        this.f174726a = bVar;
        this.f174727b = aVar;
        this.f174728c = lVar;
    }

    public /* synthetic */ d(Class cls, b bVar, com.avito.android.jsonrpc.client.a aVar, l lVar, int i12, C42822w c42822w) {
        this(cls, bVar, aVar, (i12 & 8) != 0 ? a.f174729l : lVar);
    }
}
