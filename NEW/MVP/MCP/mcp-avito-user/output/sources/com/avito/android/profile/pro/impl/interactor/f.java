package com.avito.android.profile.pro.impl.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import cK.InterfaceC27058a;
import com.avito.android.activeOrders.OrdersNeedActionResponse;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.converters.InterfaceC33349d;
import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileProInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/f;", "Lcom/avito/android/profile/pro/impl/interactor/e;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f222689j = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<ProfileProApi> f222690a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.activeOrders.a f222691b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC33349d f222692c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.profile.pro.impl.interactor.b f222693d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC27058a f222694e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.calltracking_core.f f222695f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final R0 f222696g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f222697h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC42726C f222698i = C42727D.c(c.f222702l);

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/f$a;", "", "<init>", "()V", "", "ORDERS_WIDGET", "Ljava/lang/String;", "SELLER_ITEMS_WIDGET", "SELLING_COACH_PRICE_WIDGET", "SELLING_COACH_PROMO_WIDGET", "SERVICE_QUALITY_CALLS_WIDGET", "SERVICE_QUALITY_CHATS_WIDGET", "SERVICE_QUALITY_DELIVERY_WIDGET", "SERVICE_QUALITY_GRADE_WIDGET", "STATISTIC_WIDGET", "WIDGETS_SLUG", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/f$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final B90.a f222699a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final OrdersNeedActionResponse f222700b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.profile.pro.impl.interactor.a f222701c;

        public b(@k B90.a aVar, @l OrdersNeedActionResponse ordersNeedActionResponse, @k com.avito.android.profile.pro.impl.interactor.a aVar2) {
            this.f222699a = aVar;
            this.f222700b = ordersNeedActionResponse;
            this.f222701c = aVar2;
        }
    }

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<List<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f222702l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends String> invoke() {
            return C42745f0.U("statisticsGeneral", "cptOrders", "sellerItemsStatuses", "serviceQualityDelivery", "serviceQualityCalls", "serviceQualityChats", "sellingCoachPromo", "serviceQualityGrade");
        }
    }

    /* compiled from: ProfileProInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProInteractorImpl$loadProfileData$1", f = "ProfileProInteractor.kt", i = {0, 2, 2, 2, 3}, l = {78, 79, 82, 97, 94}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "profileInfo", "idempotencyKey", "idempotencyKey"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f222703q;

        /* renamed from: r, reason: collision with root package name */
        public Object f222704r;

        /* renamed from: s, reason: collision with root package name */
        public int f222705s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f222706t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ProfileTabUserType f222708v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ProfileTabUserType profileTabUserType, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f222708v = profileTabUserType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = f.this.new d(this.f222708v, continuation);
            dVar.f222706t = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0118 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.interactor.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@k h31.e<ProfileProApi> eVar, @k com.avito.android.activeOrders.a aVar, @k InterfaceC33349d interfaceC33349d, @k com.avito.android.profile.pro.impl.interactor.b bVar, @k InterfaceC27058a interfaceC27058a, @k com.avito.android.calltracking_core.f fVar, @k R0 r02, @k InterfaceC35863o4 interfaceC35863o4) {
        this.f222690a = eVar;
        this.f222691b = aVar;
        this.f222692c = interfaceC33349d;
        this.f222693d = bVar;
        this.f222694e = interfaceC27058a;
        this.f222695f = fVar;
        this.f222696g = r02;
        this.f222697h = interfaceC35863o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final D90.b.a b(com.avito.android.profile.pro.impl.interactor.f r11, java.lang.String r12, com.avito.android.profile.pro.impl.ProfileTabUserType r13, com.avito.android.profile.pro.impl.interactor.f.b r14, com.avito.android.remote.model.TypedResult r15) {
        /*
            r11.getClass()
            B90.a r1 = r14.f222699a
            java.util.ArrayList r0 = r1.f918c
            com.avito.android.profile.pro.impl.converters.d r2 = r11.f222692c
            com.avito.android.activeOrders.OrdersNeedActionResponse r3 = r14.f222700b
            com.avito.android.profile.pro.impl.interactor.a r4 = r14.f222701c
            java.util.List r3 = r2.a(r0, r3, r15, r4)
            r0 = 0
            if (r15 == 0) goto L31
            boolean r4 = r15 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L1b
            com.avito.android.remote.model.TypedResult$Success r15 = (com.avito.android.remote.model.TypedResult.Success) r15
            goto L1c
        L1b:
            r15 = r0
        L1c:
            if (r15 == 0) goto L23
            java.lang.Object r15 = r15.getResult()
            goto L24
        L23:
            r15 = r0
        L24:
            x90.a r15 = (x90.C49797a) r15
            if (r15 == 0) goto L31
            x90.f r15 = r15.getResult()
            com.avito.android.profile.pro.impl.network.response.ProDashboardResponse r15 = v90.d.a(r15)
            goto L32
        L31:
            r15 = r0
        L32:
            B90.a r14 = r14.f222699a
            java.lang.Boolean r4 = r14.f919d
            java.util.ArrayList r5 = r14.f918c
            java.util.Iterator r5 = r5.iterator()
            r6 = r0
        L3d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4d
            java.lang.Object r7 = r5.next()
            boolean r8 = r7 instanceof com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget.k
            if (r8 == 0) goto L3d
            r6 = r7
            goto L3d
        L4d:
            boolean r5 = r6 instanceof com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget.k
            if (r5 != 0) goto L52
            goto L53
        L52:
            r0 = r6
        L53:
            com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget$k r0 = (com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget.k) r0
            com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams r5 = r2.b(r0)
            cK.a r0 = r11.f222694e
            kotlinx.coroutines.flow.n2 r0 = r0.a()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            com.avito.android.calltracking_core.f r11 = r11.f222695f
            int r7 = r11.a()
            com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r8 = r2.c(r14, r12, r13)
            java.util.List<com.avito.android.deep_linking.links.DeepLink> r11 = r14.f920e
            if (r11 != 0) goto L79
            kotlin.collections.z0 r11 = kotlin.collections.C42784z0.f406748b
        L79:
            r9 = r11
            D90.b$a r11 = new D90.b$a
            com.avito.android.deep_linking.links.DeepLink r10 = r14.f921f
            r0 = r11
            r2 = r3
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.interactor.f.b(com.avito.android.profile.pro.impl.interactor.f, java.lang.String, com.avito.android.profile.pro.impl.ProfileTabUserType, com.avito.android.profile.pro.impl.interactor.f$b, com.avito.android.remote.model.TypedResult):D90.b$a");
    }

    @Override // com.avito.android.profile.pro.impl.interactor.e
    @k
    public final InterfaceC43160i<D90.b> a(@k ProfileTabUserType profileTabUserType) {
        return C43175k.G(new d(profileTabUserType, null));
    }
}
