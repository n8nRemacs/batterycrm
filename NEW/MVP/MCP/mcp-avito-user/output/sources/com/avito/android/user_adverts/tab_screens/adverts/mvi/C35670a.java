package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import cJ0.InterfaceC27047a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertsListNextPageDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import com.avito.android.util.R0;
import fJ0.InterfaceC40301a;
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
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nE.C44240b;

/* compiled from: UserAdvertsListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LfJ0/a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "a", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35670a implements com.avito.android.arch.mvi.a<InterfaceC40301a, UserAdvertsListInternalAction, UserAdvertsListState> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f315271j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_screens.adverts.domain.a f315272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_actions.host.domain.f f315273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f315274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final nI0.f f315275d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27047a f315276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f315277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a f315278g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g f315279h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C44240b f315280i;

    /* compiled from: UserAdvertsListActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$a;", "", "<init>", "()V", "", "LOADING_DEBOUNCE_MS", "J", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$a, reason: collision with other inner class name */
    public static final class C9753a {
        public /* synthetic */ C9753a(C42822w c42822w) {
            this();
        }

        public C9753a() {
        }
    }

    /* compiled from: UserAdvertsListActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b;", "Lcom/avito/android/arch/mvi/utils/n;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b */
    public static final class b implements com.avito.android.arch.mvi.utils.n<InterfaceC9754a, b, b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.o f315281b;

        /* compiled from: UserAdvertsListActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a$b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC9754a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9755a f315282a = C9755a.f315283a;

            /* compiled from: UserAdvertsListActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$a, reason: collision with other inner class name */
            public static final class C9755a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ C9755a f315283a = new C9755a();
            }

            /* compiled from: UserAdvertsListActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a$b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$b, reason: collision with other inner class name */
            public static final /* data */ class C9756b implements InterfaceC9754a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C9756b f315284b = new C9756b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C9756b);
                }

                public final int hashCode() {
                    return -1350350228;
                }

                @Y61.k
                public final String toString() {
                    return "None";
                }
            }

            /* compiled from: UserAdvertsListActor.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a$c;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/a$b$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$c */
            public static final /* data */ class c implements InterfaceC9754a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final UserAdvertsListParams f315285b;

                public c(@Y61.k UserAdvertsListParams userAdvertsListParams) {
                    this.f315285b = userAdvertsListParams;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f315285b, ((c) obj).f315285b);
                }

                public final int hashCode() {
                    return this.f315285b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Params(params=" + this.f315285b + ')';
                }
            }
        }

        public b(@Y61.k UserAdvertsListState userAdvertsListState) {
            InterfaceC9754a.f315282a.getClass();
            UserAdvertsListParams userAdvertsListParams = userAdvertsListState.f315399q;
            Object cVar = userAdvertsListParams == null ? InterfaceC9754a.C9756b.f315284b : new InterfaceC9754a.c(userAdvertsListParams);
            com.avito.android.arch.mvi.utils.n.f92111a.getClass();
            this.f315281b = new com.avito.android.arch.mvi.utils.o(cVar);
        }

        @Override // com.avito.android.arch.mvi.utils.n
        public final o.a a(Object obj) {
            return this.f315281b.f92114c;
        }

        @Override // com.avito.android.arch.mvi.utils.n
        public final com.avito.android.arch.mvi.utils.x<InterfaceC9754a> b(Object obj) {
            return this.f315281b.f92114c;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c */
    public static final class c implements InterfaceC43160i<UserAdvertsListInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f315286b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListState f315287c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C35670a f315288d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c$a, reason: collision with other inner class name */
        public static final class C9757a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f315289b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsListState f315290c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C35670a f315291d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoad$$inlined$map$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c$a$a, reason: collision with other inner class name */
            public static final class C9758a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f315292q;

                /* renamed from: r, reason: collision with root package name */
                public int f315293r;

                public C9758a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f315292q = obj;
                    this.f315293r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9757a.this.emit(null, this);
                }
            }

            public C9757a(InterfaceC43172j interfaceC43172j, UserAdvertsListState userAdvertsListState, C35670a c35670a) {
                this.f315289b = interfaceC43172j;
                this.f315290c = userAdvertsListState;
                this.f315291d = c35670a;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.c.C9757a.C9758a
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.c.C9757a.C9758a) r0
                    int r1 = r0.f315293r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f315293r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.a$c$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.f315292q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f315293r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r14)
                    goto L74
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.C42729a0.b(r14)
                    eJ0.c r13 = (eJ0.C40016c) r13
                    eJ0.b r13 = r13.f395108a
                    boolean r14 = r13 instanceof eJ0.InterfaceC40015b.a
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r2 = r12.f315290c
                    if (r14 == 0) goto L4d
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError r14 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError
                    r5 = r13
                    eJ0.b$a r5 = (eJ0.InterfaceC40015b.a) r5
                    java.lang.String r6 = r2.f315384b
                    r9 = 0
                    r7 = 0
                    r8 = 4
                    r4 = r14
                    r4.<init>(r5, r6, r7, r8, r9)
                    goto L69
                L4d:
                    boolean r14 = r13 instanceof eJ0.InterfaceC40015b.C11066b
                    if (r14 == 0) goto L77
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult r14 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult
                    r5 = r13
                    eJ0.b$b r5 = (eJ0.InterfaceC40015b.C11066b) r5
                    java.lang.String r7 = r2.f315384b
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a r13 = r12.f315291d
                    nI0.f r13 = r13.f315275d
                    boolean r9 = r13.a(r5)
                    r6 = 0
                    r8 = 0
                    r10 = 8
                    r11 = 0
                    r4 = r14
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                L69:
                    r0.f315293r = r3
                    kotlinx.coroutines.flow.j r13 = r12.f315289b
                    java.lang.Object r13 = r13.emit(r14, r0)
                    if (r13 != r1) goto L74
                    return r1
                L74:
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    return r13
                L77:
                    kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                    r13.<init>()
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.c.C9757a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, UserAdvertsListState userAdvertsListState, C35670a c35670a) {
            this.f315286b = interfaceC43160i;
            this.f315287c = userAdvertsListState;
            this.f315288d = c35670a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f315286b.collect(new C9757a(interfaceC43172j, this.f315287c, this.f315288d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d */
    public static final class d implements InterfaceC43160i<UserAdvertsListInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f315295b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListState f315296c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListParams f315297d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C35670a f315298e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d$a, reason: collision with other inner class name */
        public static final class C9759a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f315299b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsListState f315300c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsListParams f315301d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C35670a f315302e;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoad$$inlined$map$2$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d$a$a, reason: collision with other inner class name */
            public static final class C9760a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f315303q;

                /* renamed from: r, reason: collision with root package name */
                public int f315304r;

                public C9760a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f315303q = obj;
                    this.f315304r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9759a.this.emit(null, this);
                }
            }

            public C9759a(InterfaceC43172j interfaceC43172j, UserAdvertsListState userAdvertsListState, UserAdvertsListParams userAdvertsListParams, C35670a c35670a) {
                this.f315299b = interfaceC43172j;
                this.f315300c = userAdvertsListState;
                this.f315301d = userAdvertsListParams;
                this.f315302e = c35670a;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, @Y61.k kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.d.C9759a.C9760a
                    if (r0 == 0) goto L13
                    r0 = r13
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.d.C9759a.C9760a) r0
                    int r1 = r0.f315304r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f315304r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.a$d$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f315303q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f315304r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r13)
                    goto L8f
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.C42729a0.b(r13)
                    eJ0.c r12 = (eJ0.C40016c) r12
                    eJ0.b r13 = r12.f395108a
                    boolean r2 = r13 instanceof eJ0.InterfaceC40015b.a
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r4 = r11.f315300c
                    if (r2 == 0) goto L4d
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError r12 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError
                    r6 = r13
                    eJ0.b$a r6 = (eJ0.InterfaceC40015b.a) r6
                    java.lang.String r7 = r4.f315384b
                    r10 = 0
                    r8 = 0
                    r9 = 4
                    r5 = r12
                    r5.<init>(r6, r7, r8, r9, r10)
                    goto L84
                L4d:
                    boolean r2 = r13 instanceof eJ0.InterfaceC40015b.C11066b
                    if (r2 == 0) goto L92
                    com.avito.android.user_adverts.tab_screens.UserAdvertsListParams r2 = r11.f315301d
                    com.avito.android.user_adverts.tab_screens.UserAdvertsListParams$SearchInfo r2 = r2.f314698d
                    java.lang.String r5 = r2.f314700b
                    boolean r5 = kotlin.text.C43066x.K(r5)
                    if (r5 == 0) goto L6b
                    java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f314702d
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f314703e
                    boolean r2 = kotlin.jvm.internal.L.f(r5, r2)
                    if (r2 != 0) goto L68
                    goto L6b
                L68:
                    r2 = 0
                    r9 = r2
                    goto L6c
                L6b:
                    r9 = r3
                L6c:
                    java.lang.String r8 = r4.f315384b
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.a r2 = r11.f315302e
                    nI0.f r2 = r2.f315275d
                    eJ0.b r12 = r12.f395108a
                    eJ0.b$b r12 = (eJ0.InterfaceC40015b.C11066b) r12
                    boolean r10 = r2.a(r12)
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult r12 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult
                    r6 = r13
                    eJ0.b$b r6 = (eJ0.InterfaceC40015b.C11066b) r6
                    r7 = 0
                    r5 = r12
                    r5.<init>(r6, r7, r8, r9, r10)
                L84:
                    r0.f315304r = r3
                    kotlinx.coroutines.flow.j r13 = r11.f315299b
                    java.lang.Object r12 = r13.emit(r12, r0)
                    if (r12 != r1) goto L8f
                    return r1
                L8f:
                    kotlin.G0 r12 = kotlin.G0.f406611a
                    return r12
                L92:
                    kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                    r12.<init>()
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.d.C9759a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i, UserAdvertsListState userAdvertsListState, UserAdvertsListParams userAdvertsListParams, C35670a c35670a) {
            this.f315295b = interfaceC43160i;
            this.f315296c = userAdvertsListState;
            this.f315297d = userAdvertsListParams;
            this.f315298e = c35670a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f315295b.collect(new C9759a(interfaceC43172j, this.f315296c, this.f315297d, this.f315298e), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoad$2", f = "UserAdvertsListActor.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAdvertsListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315306q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f315307r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f315308s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f315308s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f315308s, continuation);
            eVar.f315307r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315306q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f315307r;
                if (this.f315308s) {
                    UserAdvertsListInternalAction.LoadingStart loadingStart = new UserAdvertsListInternalAction.LoadingStart();
                    this.f315306q = 1;
                    if (interfaceC43172j.emit(loadingStart, this) == coroutine_suspended) {
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

    /* compiled from: UserAdvertsListActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoad$4", f = "UserAdvertsListActor.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.a$f */
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAdvertsListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315309q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f315310r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f315311s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z12, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f315311s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f315311s, continuation);
            fVar.f315310r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315309q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f315310r;
                if (this.f315311s) {
                    UserAdvertsListInternalAction.LoadingStart loadingStart = new UserAdvertsListInternalAction.LoadingStart();
                    this.f315309q = 1;
                    if (interfaceC43172j.emit(loadingStart, this) == coroutine_suspended) {
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

    static {
        new C9753a(null);
    }

    @Inject
    public C35670a(@Y61.k com.avito.android.user_adverts.tab_screens.adverts.domain.a aVar, @Y61.k com.avito.android.user_adverts.tab_actions.host.domain.f fVar, @Y61.k R0 r02, @Y61.k nI0.f fVar2, @Y61.k InterfaceC27047a interfaceC27047a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a aVar2, @Y61.k com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g gVar, @Y61.k C44240b c44240b) {
        this.f315272a = aVar;
        this.f315273b = fVar;
        this.f315274c = r02;
        this.f315275d = fVar2;
        this.f315276e = interfaceC27047a;
        this.f315277f = interfaceC28373a;
        this.f315278g = aVar2;
        this.f315279h = gVar;
        this.f315280i = c44240b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iY;
        if (this.f315280i.v().invoke().booleanValue()) {
            b bVar = new b((UserAdvertsListState) aVar.invoke());
            interfaceC43160iY = C43175k.N(C43175k.Y(C43175k.N(new C35690v(new C35688t(new C35689u(aVar, this, this.f315279h.a(((UserAdvertsListState) aVar.invoke()).f315384b)), bVar, aVar), bVar, this), new C35672c(aVar, this, C43175k.o(new C35683n(new C35682m(c43197r1)), C35671b.f315312l))), new C35684o(null, this, aVar, bVar)), new x(new w(bVar.f315281b.f92113b)));
        } else {
            C35679j c35679j = new C35679j(c43197r1);
            InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b> interfaceC43160iOa = this.f315278g.Oa();
            nI0.i iVar = nI0.i.f414995a;
            UserAdvertsListState userAdvertsListState = (UserAdvertsListState) aVar.invoke();
            iVar.getClass();
            interfaceC43160iY = C43175k.Y(new C35672c(aVar, this, new C43137a0(new C35681l(this, null), C43175k.o(C43175k.N(c35679j, userAdvertsListState.f315384b.equals("draft") ? C43175k.w() : new C35673d(C43175k.r(interfaceC43160iOa))), C35671b.f315312l))), new C35680k(aVar, this, null));
        }
        return C43175k.N(interfaceC43160iY, C43175k.B(new D(aVar, this, null), new C(c43197r1)), C43175k.Y(new E(C43175k.N(new F(c43197r1), new G(c43197r1)), aVar), new H(aVar, this, null)), C43175k.B(new C35678i(aVar, this, null), new C35677h(c43197r1)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UserAdvertsListInternalAction> b(@Y61.k InterfaceC40301a interfaceC40301a, @Y61.k UserAdvertsListState userAdvertsListState) {
        C43210w c43210w;
        String str;
        InterfaceC43160i<UserAdvertsListInternalAction> c43210w2;
        UserAdvertsListNextPageDomain userAdvertsListNextPageDomain;
        String str2;
        if ((interfaceC40301a instanceof InterfaceC40301a.b.C11139a) || (interfaceC40301a instanceof InterfaceC40301a.b.e)) {
            c43210w2 = e(userAdvertsListState, true);
        } else if (interfaceC40301a instanceof InterfaceC40301a.b.d) {
            c43210w2 = C43175k.G(new z(userAdvertsListState, this, null));
        } else {
            boolean z12 = interfaceC40301a instanceof InterfaceC40301a.b.C11140b;
            UserAdvertsSpace userAdvertsSpace = userAdvertsListState.f315385c;
            R0 r02 = this.f315274c;
            if (!z12) {
                if (interfaceC40301a instanceof InterfaceC40301a.b.f) {
                    InterfaceC40301a.b.f fVar = (InterfaceC40301a.b.f) interfaceC40301a;
                    InterfaceC43160i c43137a0 = new C43137a0(new B(fVar, null), new A(C43175k.G(new L(fVar.f395819a, fVar.f395821c, fVar.f395822d, userAdvertsListState.f315384b, userAdvertsListState.f315387e, userAdvertsSpace.f314193b, null, userAdvertsListState.f315386d, 0, this, fVar.f395823e, null)), userAdvertsListState));
                    String str3 = fVar.f395824f;
                    if (str3 == null || C43066x.K(str3) || str3.equals(userAdvertsListState.f315384b)) {
                        c43137a0 = new C43197r1(new J(this, fVar, null), c43137a0);
                    }
                    return C43175k.I(r02.a(), c43137a0);
                }
                if (interfaceC40301a instanceof InterfaceC40301a.b.c) {
                    InterfaceC40301a.b.c cVar = (InterfaceC40301a.b.c) interfaceC40301a;
                    String str4 = cVar.f395815a;
                    boolean zF2 = kotlin.jvm.internal.L.f(str4, userAdvertsListState.f315389g);
                    String str5 = cVar.f395816b;
                    return (zF2 && kotlin.jvm.internal.L.f(str5, userAdvertsListState.f315390h)) ? C43175k.w() : C43175k.N(new C43210w(new UserAdvertsListInternalAction.ProfileStatesChanged(str4, str5)), e(userAdvertsListState, true));
                }
                if (interfaceC40301a instanceof InterfaceC40301a.c.C11141a) {
                    InterfaceC40301a.c.C11141a c11141a = (InterfaceC40301a.c.C11141a) interfaceC40301a;
                    return new C43210w(new UserAdvertsListInternalAction.AdvertSelected(c11141a.f395825a, c11141a.f395826b, c11141a.f395827c));
                }
                if (interfaceC40301a instanceof InterfaceC40301a.c.b) {
                    InterfaceC40301a.c.b bVar = (InterfaceC40301a.c.b) interfaceC40301a;
                    return new C43210w(new UserAdvertsListInternalAction.AdvertsGroupSelected(bVar.f395828a, bVar.f395829b));
                }
                if (interfaceC40301a instanceof InterfaceC40301a.c.C11142c) {
                    c43210w = new C43210w(UserAdvertsListInternalAction.AdvertsUnselected.f315341c);
                } else if (interfaceC40301a instanceof InterfaceC40301a.AbstractC11137a.C11138a) {
                    c43210w = new C43210w(UserAdvertsListInternalAction.ClosePositionAnimation.f315343b);
                } else if (interfaceC40301a instanceof InterfaceC40301a.d.C11143a) {
                    UserAdvertItemDomain userAdvertItemDomainC = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.c(userAdvertsListState, ((InterfaceC40301a.d.C11143a) interfaceC40301a).f395831a);
                    if (userAdvertItemDomainC != null) {
                        return new C43137a0(new C35676g(userAdvertItemDomainC, null), new C35674e(C43175k.G(new C35675f(this, userAdvertItemDomainC, null)), userAdvertItemDomainC));
                    }
                    c43210w = new C43210w(UserAdvertsListInternalAction.NoChange.f315366b);
                } else {
                    if (!(interfaceC40301a instanceof InterfaceC40301a.d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserAdvertItemDomain userAdvertItemDomainC2 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.c(userAdvertsListState, ((InterfaceC40301a.d.b) interfaceC40301a).f395832a);
                    if (userAdvertItemDomainC2 != null) {
                        return new C43210w(new UserAdvertsListInternalAction.SingleUnselect(userAdvertItemDomainC2.f315030P));
                    }
                    c43210w = new C43210w(UserAdvertsListInternalAction.NoChange.f315366b);
                }
                return c43210w;
            }
            UserAdvertsListState.DataState.Loaded loadedB = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState);
            if (loadedB == null || (userAdvertsListNextPageDomain = loadedB.f315410c) == null) {
                str = null;
            } else {
                if (userAdvertsListNextPageDomain instanceof UserAdvertsListNextPageDomain.ByOffset) {
                    str2 = ((UserAdvertsListNextPageDomain.ByOffset) userAdvertsListNextPageDomain).f315012b;
                } else {
                    if (!(userAdvertsListNextPageDomain instanceof UserAdvertsListNextPageDomain.Empty)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = null;
                }
                str = str2;
            }
            if (str == null || str.length() == 0) {
                c43210w2 = new C43210w(UserAdvertsListInternalAction.NoChange.f315366b);
            } else {
                String str6 = userAdvertsSpace.f314193b;
                UserAdvertsListState.DataState.Loaded loadedB2 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.b(userAdvertsListState);
                c43210w2 = C43175k.I(r02.a(), new C43137a0(new C35687s(2, null), new C35686q(C43175k.G(new L(userAdvertsListState.f315391i, userAdvertsListState.f315393k, userAdvertsListState.f315394l, userAdvertsListState.f315384b, userAdvertsListState.f315387e, str6, str, userAdvertsListState.f315386d, loadedB2 != null ? loadedB2.f315414g : 0, this, userAdvertsListState.f315395m, null)), userAdvertsListState, this)));
            }
        }
        return c43210w2;
    }

    public final InterfaceC43160i<UserAdvertsListInternalAction> d(UserAdvertsListParams userAdvertsListParams, UserAdvertsListState userAdvertsListState, boolean z12) {
        C43197r1 c43197r1 = new C43197r1(new I(userAdvertsListState.f315384b, this, null), new d(C43175k.G(new M(userAdvertsListParams, userAdvertsListState.f315384b, null, 0, this, null)), userAdvertsListState, userAdvertsListParams, this));
        if (userAdvertsListParams.f314696b.f314713f) {
            c43197r1 = new C43197r1(new K(this, userAdvertsListParams, null), c43197r1);
        }
        return C43175k.I(this.f315274c.a(), new C43137a0(new f(z12, null), c43197r1));
    }

    public final InterfaceC43160i<UserAdvertsListInternalAction> e(UserAdvertsListState userAdvertsListState, boolean z12) {
        return C43175k.I(this.f315274c.a(), new C43137a0(new e(z12, null), new C43197r1(new I(userAdvertsListState.f315384b, this, null), new c(C43175k.G(new L(userAdvertsListState.f315391i, userAdvertsListState.f315393k, userAdvertsListState.f315394l, userAdvertsListState.f315384b, userAdvertsListState.f315387e, userAdvertsListState.f315385c.f314193b, null, userAdvertsListState.f315386d, 0, this, userAdvertsListState.f315395m, null)), userAdvertsListState, this))));
    }
}
