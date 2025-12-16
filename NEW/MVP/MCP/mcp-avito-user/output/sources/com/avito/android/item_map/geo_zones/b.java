package com.avito.android.item_map.geo_zones;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;
import sO.InterfaceC48083a;
import tO.C48586c;
import tO.InterfaceC48584a;

/* compiled from: GeoZonesInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/remote/model/TypedResult;", "LtO/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.item_map.geo_zones.GeoZonesInteractorImpl$getGeoZones$1", f = "GeoZonesInteractor.kt", i = {0}, l = {40, 41}, m = "invokeSuspend", n = {"$this$rxObservable"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<I0<? super TypedResult<InterfaceC48584a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f173343q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f173344r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f173345s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C48586c f173346t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, C48586c c48586c, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f173345s = eVar;
        this.f173346t = c48586c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f173345s, this.f173346t, continuation);
        bVar.f173344r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super TypedResult<InterfaceC48584a>> i02, Continuation<? super G0> continuation) {
        return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f173343q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i02 = (I0) this.f173344r;
            InterfaceC48083a interfaceC48083a = this.f173345s.f173349a;
            this.f173344r = i02;
            this.f173343q = 1;
            obj = interfaceC48083a.a(this.f173346t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            i02 = (I0) this.f173344r;
            C42729a0.b(obj);
        }
        this.f173344r = null;
        this.f173343q = 2;
        if (i02.send((TypedResult) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
