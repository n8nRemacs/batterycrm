package com.avito.android.map.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: MapActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction;", "internalAction", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/map/mvi/entity/MapInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$16", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31620i extends SuspendLambda implements Y41.p<MapInternalAction, Continuation<? super InterfaceC43160i<? extends MapInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f185262q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31612a f185263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185264s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31620i(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, Continuation<? super C31620i> continuation) {
        super(2, continuation);
        this.f185263r = c31612a;
        this.f185264s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31620i c31620i = new C31620i(this.f185263r, this.f185264s, continuation);
        c31620i.f185262q = obj;
        return c31620i;
    }

    @Override // Y41.p
    public final Object invoke(MapInternalAction mapInternalAction, Continuation<? super InterfaceC43160i<? extends MapInternalAction>> continuation) {
        return ((C31620i) create(mapInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MapInternalAction mapInternalAction = (MapInternalAction) this.f185262q;
        if (!(mapInternalAction instanceof MapInternalAction.AreaSaved)) {
            return new C43210w(mapInternalAction);
        }
        com.avito.android.map.mvi.entity.a aVar = this.f185264s;
        SearchParams searchParams = aVar.f185151b;
        return C43175k.N(C31612a.e(this.f185263r, com.avito.android.map.mvi.entity.a.a(aVar, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : ((MapInternalAction.AreaSaved) mapInternalAction).f185062b), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870910), 2), new C43210w(mapInternalAction));
    }
}
