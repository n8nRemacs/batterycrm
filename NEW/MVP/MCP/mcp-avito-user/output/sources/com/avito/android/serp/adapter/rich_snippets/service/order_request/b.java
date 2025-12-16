package com.avito.android.serp.adapter.rich_snippets.service.order_request;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.component.service_order_button.BeduinServiceOrderButtonModel;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.service_order_widget.domain.f;
import com.avito.android.service_order_widget.link.o;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: BxServiceItemOrderRequestInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/order_request/b;", "Lcom/avito/android/serp/adapter/rich_snippets/service/order_request/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.rich_snippets.service.order_request.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f271342e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f271343a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f271344b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f271345c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final x f271346d;

    /* compiled from: BxServiceItemOrderRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/order_request/b$a;", "", "<init>", "()V", "", "LEGACY_THEME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxServiceItemOrderRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.serp.adapter.rich_snippets.service.order_request.BxServiceItemOrderRequestInteractorImpl$getItemIdsWithIncorrectState$1", f = "BxServiceItemOrderRequestInteractor.kt", i = {0}, l = {201}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.service.order_request.b$b, reason: collision with other inner class name */
    public static final class C8074b extends SuspendLambda implements p<InterfaceC43172j<? super String>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Iterator f271347q;

        /* renamed from: r, reason: collision with root package name */
        public int f271348r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f271349s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<l1> f271350t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map<String, Map<String, Boolean>> f271351u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f271352v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8074b(List<? extends l1> list, Map<String, ? extends Map<String, Boolean>> map, b bVar, Continuation<? super C8074b> continuation) {
            super(2, continuation);
            this.f271350t = list;
            this.f271351u = map;
            this.f271352v = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8074b c8074b = new C8074b(this.f271350t, this.f271351u, this.f271352v, continuation);
            c8074b.f271349s = obj;
            return c8074b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super String> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8074b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Iterator<l1> it;
            InterfaceC43172j interfaceC43172j;
            boolean zD2;
            Boolean bool;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f271348r;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f271349s;
                it = this.f271350t.iterator();
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f271347q;
                interfaceC43172j = (InterfaceC43172j) this.f271349s;
                C42729a0.b(obj);
            }
            while (it.hasNext()) {
                l1 next = it.next();
                Map<String, Boolean> map = this.f271351u.get(next.getF273226b());
                if (map != null) {
                    int i13 = b.f271342e;
                    b bVar = this.f271352v;
                    bVar.getClass();
                    if (next instanceof AdvertXlItem) {
                        zD2 = b.d(((AdvertXlItem) next).f268752E, map);
                    } else if (next instanceof AdvertItem) {
                        zD2 = b.d(((AdvertItem) next).f268408U, map);
                    } else {
                        boolean zBooleanValue = false;
                        if (next instanceof SerpConstructorAdvertItem) {
                            List<BeduinModel> freeForm = ((SerpConstructorAdvertItem) next).getFreeForm();
                            com.avito.android.service_order_widget.link.a aVar = null;
                            BeduinModel beduinModelB = freeForm != null ? com.avito.android.beduin_shared.model.utils.f.b(com.avito.android.serp.adapter.rich_snippets.service.order_request.c.f271355l, freeForm) : null;
                            BeduinServiceOrderButtonModel beduinServiceOrderButtonModel = beduinModelB instanceof BeduinServiceOrderButtonModel ? (BeduinServiceOrderButtonModel) beduinModelB : null;
                            if (beduinServiceOrderButtonModel != null) {
                                String strFindServiceOrderDeeplinkAsString = beduinServiceOrderButtonModel.findServiceOrderDeeplinkAsString();
                                if (strFindServiceOrderDeeplinkAsString != null) {
                                    Parcelable parcelableB = bVar.f271346d.b(strFindServiceOrderDeeplinkAsString);
                                    if (parcelableB instanceof com.avito.android.service_order_widget.link.a) {
                                        aVar = (com.avito.android.service_order_widget.link.a) parcelableB;
                                    }
                                }
                                if (aVar != null && (bool = map.get(aVar.getF278943b())) != null) {
                                    zBooleanValue = bool.booleanValue();
                                }
                            }
                        }
                        zD2 = zBooleanValue;
                    }
                    if (zD2) {
                        String f270463j = next.getF273226b();
                        this.f271349s = interfaceC43172j;
                        this.f271347q = it;
                        this.f271348r = 1;
                        if (interfaceC43172j.emit(f270463j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BxServiceItemOrderRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "freeModel", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f271353l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
            BeduinModel beduinModel2 = beduinModel;
            return beduinModel2 instanceof ServiceOrderButtonModel ? Collections.singletonList(((ServiceOrderButtonModel) beduinModel2).copyModel(null, null, null, false)) : Collections.singletonList(beduinModel2);
        }
    }

    /* compiled from: BxServiceItemOrderRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "freeModel", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o.b f271354l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o.b bVar) {
            super(1);
            this.f271354l = bVar;
        }

        @Override // Y41.l
        public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
            BeduinModel beduinModel2 = beduinModel;
            if (!(beduinModel2 instanceof ServiceOrderButtonModel)) {
                return Collections.singletonList(beduinModel2);
            }
            ServiceOrderButtonModel serviceOrderButtonModel = (ServiceOrderButtonModel) beduinModel2;
            boolean zF2 = L.f(serviceOrderButtonModel.getTheme(), "avito");
            o.b bVar = this.f271354l;
            DeepLink deepLink = bVar.getF279047c().f278840c;
            String str = bVar.getF279047c().f278838a;
            f.b bVar2 = bVar.getF279047c().f278839b;
            return Collections.singletonList(serviceOrderButtonModel.copyModel(deepLink, str, bVar2 != null ? zF2 ? bVar2.f278841a : bVar2.f278842b : null, false));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k h hVar, @k InterfaceC40691b interfaceC40691b, @k R0 r02, @k x xVar) {
        this.f271343a = hVar;
        this.f271344b = interfaceC40691b;
        this.f271345c = r02;
        this.f271346d = xVar;
        U.a(r02.c());
    }

    public static boolean d(AdvertActions advertActions, Map map) {
        AdvertAction advertAction;
        Boolean bool;
        List<AdvertAction> actions;
        Object next;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            advertAction = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                    break;
                }
            }
            advertAction = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = advertAction instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) advertAction : null;
        if (serviceOrderRequest == null) {
            return false;
        }
        Parcelable deepLink = serviceOrderRequest.getDeepLink();
        com.avito.android.service_order_widget.link.a aVar = deepLink instanceof com.avito.android.service_order_widget.link.a ? (com.avito.android.service_order_widget.link.a) deepLink : null;
        if (aVar == null || (bool = (Boolean) map.get(aVar.getF278943b())) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.a
    @k
    public final l1 a(@k l1 l1Var, @k o.b bVar) {
        boolean z12 = l1Var instanceof AdvertXlItem;
        h hVar = this.f271343a;
        if (z12) {
            AdvertXlItem advertXlItem = (AdvertXlItem) l1Var;
            if (L.f(advertXlItem.f268777c, bVar.getItemId())) {
                AdvertXlItem advertXlItemB = AdvertXlItem.b(advertXlItem, -1);
                hVar.b(advertXlItemB, bVar.getF279047c());
                return advertXlItemB;
            }
        }
        if (l1Var instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) l1Var;
            if (L.f(advertItem.f268425c, bVar.getItemId())) {
                AdvertItem advertItemB = AdvertItem.b(advertItem, null, false, null, null, -1, -1, -1);
                hVar.c(advertItemB, bVar.getF279047c());
                return advertItemB;
            }
        }
        if (!(l1Var instanceof SerpConstructorAdvertItem) || !L.f(l1Var.getF273226b(), bVar.getItemId())) {
            return l1Var;
        }
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) l1Var;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        SerpConstructorAdvertItem serpConstructorAdvertItemCopy = serpConstructorAdvertItem.copy(((-16385) & 1) != 0 ? serpConstructorAdvertItem.id : 0L, ((-16385) & 2) != 0 ? serpConstructorAdvertItem.stringId : null, ((-16385) & 4) != 0 ? serpConstructorAdvertItem.size : null, ((-16385) & 8) != 0 ? serpConstructorAdvertItem.title : null, ((-16385) & 16) != 0 ? serpConstructorAdvertItem.price : null, ((-16385) & 32) != 0 ? serpConstructorAdvertItem.deepLink : null, ((-16385) & 64) != 0 ? serpConstructorAdvertItem.imageList : null, ((-16385) & 128) != 0 ? serpConstructorAdvertItem.galleryItemsList : null, ((-16385) & 256) != 0 ? serpConstructorAdvertItem.badgeBar : null, ((-16385) & 512) != 0 ? serpConstructorAdvertItem.badgeSticker : null, ((-16385) & 1024) != 0 ? serpConstructorAdvertItem.isDelivery : false, ((-16385) & 2048) != 0 ? serpConstructorAdvertItem.hasDiscount : false, ((-16385) & 4096) != 0 ? serpConstructorAdvertItem.nativeVideoABCategory : null, ((-16385) & 8192) != 0 ? serpConstructorAdvertItem.exposureParams : null, ((-16385) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.freeForm : freeForm != null ? C28809e.c(new d(bVar), freeForm) : null, ((-16385) & 32768) != 0 ? serpConstructorAdvertItem.reserved : null, ((-16385) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpConstructorAdvertItem.isViewed : false, ((-16385) & 131072) != 0 ? serpConstructorAdvertItem.isFavorite : false, ((-16385) & 262144) != 0 ? serpConstructorAdvertItem.canBeHidden : false, ((-16385) & 524288) != 0 ? serpConstructorAdvertItem.isHidden : false, ((-16385) & 1048576) != 0 ? serpConstructorAdvertItem.analyticsContext : null, ((-16385) & 2097152) != 0 ? serpConstructorAdvertItem.verticalAlias : null, ((-16385) & 4194304) != 0 ? serpConstructorAdvertItem.favoritesToast : null, ((-16385) & 8388608) != 0 ? serpConstructorAdvertItem.displayType : null, ((-16385) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpConstructorAdvertItem.analyticParams : null, ((-16385) & 33554432) != 0 ? serpConstructorAdvertItem.additionalAnalyticsParams : null, ((-16385) & 67108864) != 0 ? serpConstructorAdvertItem.isExternalAd : false, ((-16385) & 134217728) != 0 ? serpConstructorAdvertItem.hasVideo : false, ((-16385) & 268435456) != 0 ? serpConstructorAdvertItem.hasRealtyLayout : false, ((-16385) & 536870912) != 0 ? serpConstructorAdvertItem.isRedesign : false, ((-16385) & 1073741824) != 0 ? serpConstructorAdvertItem.isStrRedesign : false, ((-16385) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? serpConstructorAdvertItem.isUnavailable : false, (32767 & 1) != 0 ? serpConstructorAdvertItem.isExtendedGallery : false, (32767 & 2) != 0 ? serpConstructorAdvertItem.cvViewed : null, (32767 & 4) != 0 ? serpConstructorAdvertItem.isCvHidden : null, (32767 & 8) != 0 ? serpConstructorAdvertItem.categoryId : null, (32767 & 16) != 0 ? serpConstructorAdvertItem.sellerInfo : null, (32767 & 32) != 0 ? serpConstructorAdvertItem.sellerOnline : null, (32767 & 64) != 0 ? serpConstructorAdvertItem.newAdvertBadge : null, (32767 & 128) != 0 ? serpConstructorAdvertItem.hasStablePosition : false, (32767 & 256) != 0 ? serpConstructorAdvertItem.isFeatured : false, (32767 & 512) != 0 ? serpConstructorAdvertItem.featuredSectionTitle : null, (32767 & 1024) != 0 ? serpConstructorAdvertItem.featuredSectionPosition : 0, (32767 & 2048) != 0 ? serpConstructorAdvertItem.featuredSectionType : null, (32767 & 4096) != 0 ? serpConstructorAdvertItem.xHash : null, (32767 & 8192) != 0 ? serpConstructorAdvertItem.galleryConfig : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.gigShiftId : null);
        List<BeduinModel> freeForm2 = serpConstructorAdvertItemCopy.getFreeForm();
        serpConstructorAdvertItemCopy.setFreeFormConverted(freeForm2 != null ? com.avito.android.beduin_shared.model.utils.b.a(this.f271344b, l1Var.getF273226b(), freeForm2) : null);
        return serpConstructorAdvertItemCopy;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.a
    @k
    public final l1 b(@k l1 l1Var, @k o.a aVar) {
        boolean z12 = l1Var instanceof AdvertXlItem;
        String str = aVar.f279045b;
        h hVar = this.f271343a;
        if (z12) {
            AdvertXlItem advertXlItem = (AdvertXlItem) l1Var;
            if (L.f(advertXlItem.f268777c, str)) {
                AdvertXlItem advertXlItemB = AdvertXlItem.b(advertXlItem, -1);
                hVar.d(advertXlItemB);
                return advertXlItemB;
            }
        }
        if (l1Var instanceof AdvertItem) {
            AdvertItem advertItem = (AdvertItem) l1Var;
            if (L.f(advertItem.f268425c, str)) {
                AdvertItem advertItemB = AdvertItem.b(advertItem, null, false, null, null, -1, -1, -1);
                hVar.a(advertItemB);
                return advertItemB;
            }
        }
        if (!(l1Var instanceof SerpConstructorAdvertItem) || !L.f(l1Var.getF273226b(), str)) {
            return l1Var;
        }
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) l1Var;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        SerpConstructorAdvertItem serpConstructorAdvertItemCopy = serpConstructorAdvertItem.copy(((-16385) & 1) != 0 ? serpConstructorAdvertItem.id : 0L, ((-16385) & 2) != 0 ? serpConstructorAdvertItem.stringId : null, ((-16385) & 4) != 0 ? serpConstructorAdvertItem.size : null, ((-16385) & 8) != 0 ? serpConstructorAdvertItem.title : null, ((-16385) & 16) != 0 ? serpConstructorAdvertItem.price : null, ((-16385) & 32) != 0 ? serpConstructorAdvertItem.deepLink : null, ((-16385) & 64) != 0 ? serpConstructorAdvertItem.imageList : null, ((-16385) & 128) != 0 ? serpConstructorAdvertItem.galleryItemsList : null, ((-16385) & 256) != 0 ? serpConstructorAdvertItem.badgeBar : null, ((-16385) & 512) != 0 ? serpConstructorAdvertItem.badgeSticker : null, ((-16385) & 1024) != 0 ? serpConstructorAdvertItem.isDelivery : false, ((-16385) & 2048) != 0 ? serpConstructorAdvertItem.hasDiscount : false, ((-16385) & 4096) != 0 ? serpConstructorAdvertItem.nativeVideoABCategory : null, ((-16385) & 8192) != 0 ? serpConstructorAdvertItem.exposureParams : null, ((-16385) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.freeForm : freeForm != null ? C28809e.c(c.f271353l, freeForm) : null, ((-16385) & 32768) != 0 ? serpConstructorAdvertItem.reserved : null, ((-16385) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpConstructorAdvertItem.isViewed : false, ((-16385) & 131072) != 0 ? serpConstructorAdvertItem.isFavorite : false, ((-16385) & 262144) != 0 ? serpConstructorAdvertItem.canBeHidden : false, ((-16385) & 524288) != 0 ? serpConstructorAdvertItem.isHidden : false, ((-16385) & 1048576) != 0 ? serpConstructorAdvertItem.analyticsContext : null, ((-16385) & 2097152) != 0 ? serpConstructorAdvertItem.verticalAlias : null, ((-16385) & 4194304) != 0 ? serpConstructorAdvertItem.favoritesToast : null, ((-16385) & 8388608) != 0 ? serpConstructorAdvertItem.displayType : null, ((-16385) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpConstructorAdvertItem.analyticParams : null, ((-16385) & 33554432) != 0 ? serpConstructorAdvertItem.additionalAnalyticsParams : null, ((-16385) & 67108864) != 0 ? serpConstructorAdvertItem.isExternalAd : false, ((-16385) & 134217728) != 0 ? serpConstructorAdvertItem.hasVideo : false, ((-16385) & 268435456) != 0 ? serpConstructorAdvertItem.hasRealtyLayout : false, ((-16385) & 536870912) != 0 ? serpConstructorAdvertItem.isRedesign : false, ((-16385) & 1073741824) != 0 ? serpConstructorAdvertItem.isStrRedesign : false, ((-16385) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? serpConstructorAdvertItem.isUnavailable : false, (32767 & 1) != 0 ? serpConstructorAdvertItem.isExtendedGallery : false, (32767 & 2) != 0 ? serpConstructorAdvertItem.cvViewed : null, (32767 & 4) != 0 ? serpConstructorAdvertItem.isCvHidden : null, (32767 & 8) != 0 ? serpConstructorAdvertItem.categoryId : null, (32767 & 16) != 0 ? serpConstructorAdvertItem.sellerInfo : null, (32767 & 32) != 0 ? serpConstructorAdvertItem.sellerOnline : null, (32767 & 64) != 0 ? serpConstructorAdvertItem.newAdvertBadge : null, (32767 & 128) != 0 ? serpConstructorAdvertItem.hasStablePosition : false, (32767 & 256) != 0 ? serpConstructorAdvertItem.isFeatured : false, (32767 & 512) != 0 ? serpConstructorAdvertItem.featuredSectionTitle : null, (32767 & 1024) != 0 ? serpConstructorAdvertItem.featuredSectionPosition : 0, (32767 & 2048) != 0 ? serpConstructorAdvertItem.featuredSectionType : null, (32767 & 4096) != 0 ? serpConstructorAdvertItem.xHash : null, (32767 & 8192) != 0 ? serpConstructorAdvertItem.galleryConfig : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.gigShiftId : null);
        List<BeduinModel> freeForm2 = serpConstructorAdvertItemCopy.getFreeForm();
        serpConstructorAdvertItemCopy.setFreeFormConverted(freeForm2 != null ? com.avito.android.beduin_shared.model.utils.b.a(this.f271344b, l1Var.getF273226b(), freeForm2) : null);
        return serpConstructorAdvertItemCopy;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.a
    @k
    public final InterfaceC43160i<String> c(@k List<? extends l1> list, @k Map<String, ? extends Map<String, Boolean>> map) {
        return C43175k.I(this.f271345c.c(), C43175k.G(new C8074b(list, map, this, null)));
    }
}
