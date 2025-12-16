package com.avito.android.messenger.channels.mvi.list_feature;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "LHY/b;", "accumulator", "value", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToChannelTags$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31803p0 extends SuspendLambda implements Y41.q<Map<String, ? extends List<? extends HY.b>>, Map<String, ? extends List<? extends HY.b>>, Continuation<? super Map<String, ? extends List<? extends HY.b>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Map f188169q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Map f188170r;

    public C31803p0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(Map<String, ? extends List<? extends HY.b>> map, Map<String, ? extends List<? extends HY.b>> map2, Continuation<? super Map<String, ? extends List<? extends HY.b>>> continuation) {
        C31803p0 c31803p0 = new C31803p0(3, continuation);
        c31803p0.f188169q = map;
        c31803p0.f188170r = map2;
        return c31803p0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        LinkedHashMap linkedHashMapK = kotlin.collections.P0.k(this.f188169q, this.f188170r);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapK.entrySet()) {
            if (!((Collection) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
