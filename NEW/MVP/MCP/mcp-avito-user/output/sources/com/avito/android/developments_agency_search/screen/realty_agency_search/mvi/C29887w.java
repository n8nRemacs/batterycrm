package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ri0.InterfaceC47661a;

/* compiled from: RealtyAgencySearchBootstrap.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/w;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29887w implements com.avito.android.arch.mvi.b<RealtyAgencySearchInternalAction> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f138969h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f138970a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f138971b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RealtyAgencySearchArguments f138972c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f138973d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f138974e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.use_case.a f138975f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f138976g;

    /* compiled from: RealtyAgencySearchBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/w$a;", "", "<init>", "()V", "", "CLIENT_ID_DEEPLINK_RESULT_KEY", "Ljava/lang/String;", "DEEPLINK_URI_RESULT_KEY", "LOCATION_ID_DEEPLINK_RESULT_KEY", "LOT_ID_DEEPLINK_RESULT_KEY", "PARENT_SCREEN_DEEPLINK_RESULT_KEY", "SELECTION_NAME_DEEPLINK_RESULT_KEY", "SESSION_ID_DEEPLINK_RESULT_KEY", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.w$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyAgencySearchBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchBootstrap$produce$1", f = "RealtyAgencySearchBootstrap.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.w$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138977q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138978r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = C29887w.this.new b(continuation);
            bVar.f138978r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f138977q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138978r;
                C29887w c29887w = C29887w.this;
                if (c29887w.f138976g) {
                    return G0.f406611a;
                }
                c29887w.f138976g = true;
                RealtyAgencySearchArguments realtyAgencySearchArguments = c29887w.f138972c;
                if (realtyAgencySearchArguments.f138669g == null) {
                    Tab tab = Tab.f138450c;
                }
                c29887w.f138970a.a();
                DevelopmentSort.f138655b.getClass();
                LotSort.f138659b.getClass();
                InterfaceC43160i interfaceC43160iC = c29887w.f138971b.c(realtyAgencySearchArguments.f138672j, realtyAgencySearchArguments.f138673k);
                this.f138977q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
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

    static {
        new a(null);
    }

    @Inject
    public C29887w(@Y61.k InterfaceC47661a interfaceC47661a, @Y61.k E e12, @Y61.k RealtyAgencySearchArguments realtyAgencySearchArguments, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.realty_agency.use_case.a aVar2) {
        this.f138970a = interfaceC47661a;
        this.f138971b = e12;
        this.f138972c = realtyAgencySearchArguments;
        this.f138973d = aVar;
        this.f138974e = xVar;
        this.f138975f = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RealtyAgencySearchInternalAction> a() {
        return C43175k.N(C43175k.G(new b(null)), C43175k.B(new C29890z(this, null), new C29889y(kotlinx.coroutines.rx3.y.a(this.f138973d.V9()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
