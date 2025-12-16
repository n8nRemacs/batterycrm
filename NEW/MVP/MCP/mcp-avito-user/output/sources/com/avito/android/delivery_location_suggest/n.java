package com.avito.android.delivery_location_suggest;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import tF.AbstractC48544a;

/* compiled from: DeliveryLocationSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LtF/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)LtF/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestInteractorImpl$searchSuggestions$1", f = "DeliveryLocationSuggestInteractor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super AbstractC48544a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135206q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f135207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f135208s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DeliveryLocationSuggestParams f135209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, String str, DeliveryLocationSuggestParams deliveryLocationSuggestParams, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f135207r = mVar;
        this.f135208s = str;
        this.f135209t = deliveryLocationSuggestParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f135207r, this.f135208s, this.f135209t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super AbstractC48544a> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135206q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
        C42729a0.b(obj);
        InterfaceC31564a interfaceC31564a = this.f135207r.f135140a;
        MapBounds mapBounds = ((DeliveryLocationSuggestParams.Bounds) this.f135209t).f135036b;
        Point point = mapBounds.f135040b;
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(point.f135042b, point.f135043c, null, 4, null);
        Point point2 = mapBounds.f135041c;
        AvitoMapBounds avitoMapBounds = new AvitoMapBounds(avitoMapPoint, new AvitoMapPoint(point2.f135042b, point2.f135043c, null, 4, null));
        this.f135206q = 1;
        Object objG = interfaceC31564a.g(this.f135208s, avitoMapBounds, this);
        return objG == coroutine_suspended ? coroutine_suspended : objG;
    }
}
