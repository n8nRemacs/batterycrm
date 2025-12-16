package com.avito.android.extended_profile_selection_create.select.mvi;

import RA.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileSelectionCreateActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.mvi.ExtendedProfileSelectionCreateActor$process$2", f = "ExtendedProfileSelectionCreateActor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152295q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152296r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RA.a f152297s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSelectionCreateState f152298t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f152299u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RA.a aVar, ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState, f fVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f152297s = aVar;
        this.f152298t = extendedProfileSelectionCreateState;
        this.f152299u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f152297s, this.f152298t, this.f152299u, continuation);
        cVar.f152296r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSelectionCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f152295q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152296r;
            a.m mVar = (a.m) this.f152297s;
            String str = mVar.f14175a;
            ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState = this.f152298t;
            String query = extendedProfileSelectionCreateState.f152343d.getQuery();
            if (query == null) {
                query = "";
            }
            if (!L.f(str, query)) {
                InterfaceC30498c interfaceC30498c = this.f152299u.f152372b;
                String str2 = mVar.f14175a;
                SearchParams searchParams = extendedProfileSelectionCreateState.f152343d;
                InterfaceC43160i interfaceC43160iA = InterfaceC30498c.a.a(interfaceC30498c, 0, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : str2, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), 5);
                this.f152295q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
