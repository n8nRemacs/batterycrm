package com.avito.android.advert.item.beduin.v2;

import com.avito.android.advert.item.beduin.v2.AdvertDetailsBeduinItemVisibilityTrackerImpl;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: AdvertDetailsBeduinItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.beduin.v2.AdvertDetailsBeduinItemVisibilityTrackerImpl$startTracking$1$1", f = "AdvertDetailsBeduinItemVisibilityTracker.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f73287q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f73288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WV0.a f73289s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.InterfaceC10495b f73290t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f73291u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo f73292v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j12, WV0.a aVar, b.InterfaceC10495b interfaceC10495b, int i12, AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo filterTrackInfo, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f73288r = j12;
        this.f73289s = aVar;
        this.f73290t = interfaceC10495b;
        this.f73291u = i12;
        this.f73292v = filterTrackInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f73288r, this.f73289s, this.f73290t, this.f73291u, this.f73292v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f73287q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f73287q = 1;
            if (C43131e0.b(this.f73288r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        b.InterfaceC10495b interfaceC10495b = this.f73290t;
        WV0.a aVar = this.f73289s;
        aVar.b(this.f73291u, interfaceC10495b);
        AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo filterTrackInfo = this.f73292v;
        filterTrackInfo.f73267c = aVar.f17931b;
        filterTrackInfo.f73268d = true;
        filterTrackInfo.f73270f = 0L;
        filterTrackInfo.f73269e = 0L;
        return G0.f406611a;
    }
}
