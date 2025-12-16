package com.avito.android.delivery_location_suggest.mvi.useCase;

import Fv.C13838a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.delivery_location_suggest.Coordinates;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadCoordsUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction$SuggestSelected;", "it", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.mvi.useCase.LoadCoordsUseCase$invoke$1", f = "LoadCoordsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<CoordsByAddressResult, Continuation<? super DeliveryLocationSuggestInternalAction.SuggestSelected>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f135193q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C13838a f135194r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C13838a c13838a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f135194r = c13838a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f135194r, continuation);
        aVar.f135193q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(CoordsByAddressResult coordsByAddressResult, Continuation<? super DeliveryLocationSuggestInternalAction.SuggestSelected> continuation) {
        return ((a) create(coordsByAddressResult, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CoordsByAddressResult.Point point = ((CoordsByAddressResult) this.f135193q).getPoint();
        Coordinates coordinates = new Coordinates(point.getLatitude(), point.getLongitude());
        C13838a c13838a = this.f135194r;
        return new DeliveryLocationSuggestInternalAction.SuggestSelected(new C13838a(c13838a.f6017a, c13838a.f6018b, coordinates));
    }
}
