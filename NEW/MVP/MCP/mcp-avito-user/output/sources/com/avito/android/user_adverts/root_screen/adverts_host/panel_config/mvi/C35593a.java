package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import II0.a;
import II0.b;
import II0.d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sd0.C48162a;

/* compiled from: PanelConfigActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LII0/a;", "LII0/b;", "LII0/d;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35593a implements com.avito.android.arch.mvi.a<II0.a, II0.b, II0.d> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f313326j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f313327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f313328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a f313329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i f313330d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c f313331e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f313332f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f313333g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f313334h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f313335i;

    /* compiled from: PanelConfigActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/a$a;", "", "<init>", "()V", "", "PANEL_CONFIG_OPEN_DELAY_MS", "J", "PANEL_CONFIG_REFRESH_ON_DEMAND_DEBOUNCE_MS", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a$a, reason: collision with other inner class name */
    public static final class C9617a {
        public /* synthetic */ C9617a(C42822w c42822w) {
            this();
        }

        public C9617a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a$b */
    public static final class b implements InterfaceC43160i<II0.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313336b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35593a f313337c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C9618a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313338b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C35593a f313339c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.PanelConfigActor$loadItemConfig$$inlined$map$1$2", f = "PanelConfigActor.kt", i = {0, 0}, l = {233, 237, 219}, m = "emit", n = {"this", "typedResult"}, s = {"L$0", "L$2"})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a$b$a$a, reason: collision with other inner class name */
            public static final class C9619a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313340q;

                /* renamed from: r, reason: collision with root package name */
                public int f313341r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f313342s;

                /* renamed from: u, reason: collision with root package name */
                public Object f313344u;

                /* renamed from: v, reason: collision with root package name */
                public TypedResult.Success f313345v;

                /* renamed from: w, reason: collision with root package name */
                public GI0.a f313346w;

                /* renamed from: x, reason: collision with root package name */
                public int f313347x;

                public C9619a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313340q = obj;
                    this.f313341r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9618a.this.emit(null, this);
                }
            }

            public C9618a(InterfaceC43172j interfaceC43172j, C35593a c35593a) {
                this.f313338b = interfaceC43172j;
                this.f313339c = c35593a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x010f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r5v2, types: [II0.b$b] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.C35593a.b.C9618a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, C35593a c35593a) {
            this.f313336b = interfaceC43160i;
            this.f313337c = c35593a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super II0.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313336b.collect(new C9618a(interfaceC43172j, this.f313337c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PanelConfigActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LII0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.PanelConfigActor$loadItemConfig$2", f = "PanelConfigActor.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super II0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313348q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313349r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f313349r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super II0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313348q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f313349r;
                b.c cVar = b.c.f8091a;
                this.f313348q = 1;
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
        new C9617a(null);
    }

    @Inject
    public C35593a(@Y61.k com.avito.android.account.plugin.rx.a aVar, @Y61.k E e12, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a aVar2, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i iVar, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c cVar, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f313327a = aVar;
        this.f313328b = e12;
        this.f313329c = aVar2;
        this.f313330d = iVar;
        this.f313331e = cVar;
        this.f313332f = r02;
        this.f313333g = interfaceC28373a;
        this.f313334h = interfaceC41196a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.Y(C43175k.r(new C43137a0(new v(this, null), kotlinx.coroutines.rx3.y.a(this.f313328b.g()))), new C35595c(null, this, c43197r1, aVar));
    }

    public final InterfaceC43160i<II0.b> c() {
        return C43175k.I(this.f313332f.a(), new C43137a0(new c(2, null), new b(this.f313329c.a(), this)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<II0.b> b(@Y61.k II0.a aVar, @Y61.k II0.d dVar) {
        C43210w c43210w;
        boolean z12 = aVar instanceof a.C0454a;
        d.a aVar2 = dVar.f8103b;
        if (z12) {
            if (aVar2 instanceof d.a.C0458d) {
                return c();
            }
            c43210w = new C43210w(b.d.f8092a);
        } else {
            if (aVar instanceof a.c) {
                return c();
            }
            if (aVar instanceof a.d) {
                if (aVar2 instanceof d.a.C0457a ? true : aVar2 instanceof d.a.C0458d) {
                    return c();
                }
                c43210w = new C43210w(b.d.f8092a);
            } else if (aVar instanceof a.b) {
                PanelConfigItem panelConfigItem = ((a.b) aVar).f8079a;
                PanelConfigItem.Type f313315c = panelConfigItem.getF313315c();
                PanelConfigItem.Type type = PanelConfigItem.Type.f313295e;
                InterfaceC28373a interfaceC28373a = this.f313333g;
                if (f313315c == type) {
                    interfaceC28373a.c(new pI0.m());
                    c43210w = new C43210w(b.f.f8094a);
                } else {
                    if (panelConfigItem.getF313315c() == PanelConfigItem.Type.f313294d) {
                        interfaceC28373a.c(new C48162a("my_items", null, 2, null));
                    }
                    DeepLink f313323g = panelConfigItem.getF313323g();
                    c43210w = f313323g == null ? new C43210w(b.d.f8092a) : new C43210w(new b.e(f313323g));
                }
            } else {
                if (aVar instanceof a.g) {
                    return C43175k.G(new r(this, null));
                }
                if (aVar instanceof a.e) {
                    c43210w = new C43210w(b.h.f8096a);
                } else {
                    if (aVar instanceof a.f) {
                        return C43175k.G(new q(this, null));
                    }
                    if (!(aVar instanceof a.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c43210w = new C43210w(b.j.f8098a);
                }
            }
        }
        return c43210w;
    }
}
