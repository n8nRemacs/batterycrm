package com.avito.android.extended_profile.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile.search.d;
import com.avito.android.remote.model.ActiveItemsPreview;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$onSearchSubmitted$1", f = "ExtendedProfileActor.kt", i = {}, l = {678, 691}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30463m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150336q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150337r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150338s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f150339t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f150340u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C30451a f150341v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30463m(com.avito.android.extended_profile.mvi.entity.a aVar, String str, boolean z12, C30451a c30451a, Continuation<? super C30463m> continuation) {
        super(2, continuation);
        this.f150338s = aVar;
        this.f150339t = str;
        this.f150340u = z12;
        this.f150341v = c30451a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30463m c30463m = new C30463m(this.f150338s, this.f150339t, this.f150340u, this.f150341v, continuation);
        c30463m.f150337r = obj;
        return c30463m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30463m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150336q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f150337r;
            com.avito.android.extended_profile.mvi.entity.a aVar = this.f150338s;
            a.C4397a c4397a = aVar.f150247i;
            if (c4397a != null && !kotlin.jvm.internal.L.f(this.f150339t, c4397a.f150258h)) {
                a.C4397a c4397a2 = aVar.f150247i;
                ActiveItemsPreview activeItemsPreview = c4397a2.f150260j;
                DeepLink searchButtonDeeplink = activeItemsPreview != null ? activeItemsPreview.getSearchButtonDeeplink() : null;
                C30451a c30451a = this.f150341v;
                if (searchButtonDeeplink == null) {
                    SearchParams searchParams = c4397a2.f150257g;
                    a.C4397a c4397aA = a.C4397a.a(c4397a2, false, false, null, null, searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : this.f150339t, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), this.f150339t, null, false, null, null, null, null, 1048383);
                    c30451a.getClass();
                    InterfaceC43160i interfaceC43160iG = C43175k.G(new r(c4397aA, c30451a, false, null));
                    this.f150336q = 2;
                    if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (this.f150340u) {
                    InterfaceC43160i interfaceC43160iA = d.a.a(c30451a.f150072f, searchButtonDeeplink, "search_button", this.f150339t, null, 8);
                    this.f150336q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
