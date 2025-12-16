package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.a;
import MI0.b;
import MI0.d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: PanelSoaActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LMI0/a;", "LMI0/b;", "LMI0/d;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35597a implements com.avito.android.arch.mvi.a<MI0.a, MI0.b, MI0.d> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f313514j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f313515a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f313516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.i f313517c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c f313518d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f313519e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f313520f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f313521g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.l f313522h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e2 f313523i = f2.b(0, 10, null, 5);

    /* compiled from: PanelSoaActor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/a$a;", "", "<init>", "()V", "", "PAGE_TYPE_SOLD_ITEMS_LANDING", "Ljava/lang/String;", "", "POST_PROCESSOR_CAPACITY", "I", "", "SOA_STATS_INFO_DIALOG_DELAY_MS", "J", "SOA_STATS_REFRESH_ON_DEMAND_DEBOUNCE_MS", "SOA_STATS_UPDATE_DELAY_MS", "SOA_STATS_UPDATE_TIMEOUT_MS", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$a, reason: collision with other inner class name */
    public static final class C9636a {
        public /* synthetic */ C9636a(C42822w c42822w) {
            this();
        }

        public C9636a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b */
    public static final class b implements InterfaceC43160i<MI0.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35597a f313525c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C9637a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313526b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C35597a f313527c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$loadSoaStats$$inlined$map$1$2", f = "PanelSoaActor.kt", i = {}, l = {228, 219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b$a$a, reason: collision with other inner class name */
            public static final class C9638a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313528q;

                /* renamed from: r, reason: collision with root package name */
                public int f313529r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f313530s;

                /* renamed from: u, reason: collision with root package name */
                public KI0.b f313532u;

                public C9638a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313528q = obj;
                    this.f313529r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9637a.this.emit(null, this);
                }
            }

            public C9637a(InterfaceC43172j interfaceC43172j, C35597a c35597a) {
                this.f313526b = interfaceC43172j;
                this.f313527c = c35597a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r4v2, types: [MI0.b$b] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.C35597a.b.C9637a.C9638a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.C35597a.b.C9637a.C9638a) r0
                    int r1 = r0.f313529r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313529r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f313528q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313529r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r7)
                    goto L8e
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    KI0.b r6 = r0.f313532u
                    kotlinx.coroutines.flow.j r2 = r0.f313530s
                    kotlin.C42729a0.b(r7)
                    goto L74
                L3c:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                    kotlinx.coroutines.flow.j r2 = r5.f313526b
                    if (r7 == 0) goto L57
                    MI0.b$a r7 = new MI0.b$a
                    com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                    com.avito.android.remote.error.ApiError r4 = r6.getError()
                    java.lang.Throwable r6 = r6.getCause()
                    r7.<init>(r4, r6)
                    goto L80
                L57:
                    boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r7 == 0) goto L91
                    com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                    java.lang.Object r6 = r6.getResult()
                    KI0.b r6 = (KI0.b) r6
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a r7 = r5.f313527c
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.l r7 = r7.f313522h
                    r0.f313530s = r2
                    r0.f313532u = r6
                    r0.f313529r = r4
                    java.lang.Object r7 = r7.b(r0)
                    if (r7 != r1) goto L74
                    return r1
                L74:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    MI0.b$b r4 = new MI0.b$b
                    r4.<init>(r6, r7)
                    r7 = r4
                L80:
                    r6 = 0
                    r0.f313530s = r6
                    r0.f313532u = r6
                    r0.f313529r = r3
                    java.lang.Object r6 = r2.emit(r7, r0)
                    if (r6 != r1) goto L8e
                    return r1
                L8e:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L91:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.C35597a.b.C9637a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, C35597a c35597a) {
            this.f313524b = interfaceC43160i;
            this.f313525c = c35597a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super MI0.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313524b.collect(new C9637a(interfaceC43172j, this.f313525c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PanelSoaActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LMI0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$loadSoaStats$2", f = "PanelSoaActor.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MI0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313533q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313534r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f313534r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313533q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f313534r;
                b.c cVar = b.c.f10560a;
                this.f313533q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
        new C9636a(null);
    }

    @Inject
    public C35597a(@Y61.k com.avito.android.account.plugin.rx.a aVar, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.i iVar, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c cVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.l lVar) {
        this.f313515a = aVar;
        this.f313516b = e12;
        this.f313517c = iVar;
        this.f313518d = cVar;
        this.f313519e = r02;
        this.f313520f = interfaceC28373a;
        this.f313521g = interfaceC41196a;
        this.f313522h = lVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.Y(C43175k.r(new C43137a0(new B(this, null), kotlinx.coroutines.rx3.y.a(this.f313516b.g()))), new C35600d(null, this, c43197r1, aVar));
    }

    public final InterfaceC43160i<MI0.b> c() {
        return C43175k.I(this.f313519e.a(), new C43137a0(new c(2, null), new b(this.f313517c.a(), this)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<MI0.b> b(@Y61.k MI0.a aVar, @Y61.k MI0.d dVar) {
        C43210w c43210w;
        if (aVar instanceof a.d) {
            return c();
        }
        boolean z12 = aVar instanceof a.C0670a;
        d.a aVar2 = dVar.f10579c;
        if (!z12) {
            boolean z13 = aVar instanceof a.c;
            R0 r02 = this.f313519e;
            com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c cVar = this.f313518d;
            KI0.a aVar3 = dVar.f10578b;
            if (z13) {
                return new C43197r1(new r(this, null), aVar3 != null ? new C43210w(new b.e(aVar3)) : C43175k.Y(C43175k.I(r02.a(), new C35598b(cVar.a(), false)), new q(3, null)));
            }
            if (aVar instanceof a.e) {
                if (aVar2 instanceof d.a.b ? true : aVar2 instanceof d.a.e) {
                    return c();
                }
                c43210w = new C43210w(b.d.f10561a);
            } else {
                if (aVar instanceof a.g) {
                    return C43175k.Y(C43175k.G(new w(((a.g) aVar).f10555a, null)), new v(this, null));
                }
                if (!(aVar instanceof a.b)) {
                    if (aVar instanceof a.f) {
                        return C43175k.G(new u(this, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar3 == null) {
                    return C43175k.I(r02.a(), new C35598b(cVar.a(), true));
                }
                c43210w = new C43210w(b.d.f10561a);
            }
        } else {
            if (L.f(aVar2, d.a.e.f10585a)) {
                return c();
            }
            c43210w = new C43210w(b.d.f10561a);
        }
        return c43210w;
    }
}
