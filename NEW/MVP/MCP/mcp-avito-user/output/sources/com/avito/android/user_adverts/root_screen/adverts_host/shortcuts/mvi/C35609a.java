package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.a;
import TI0.c;
import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_adverts.events.UserAdvertsTabEvent;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import s90.C48016a;

/* compiled from: ShortcutsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LTI0/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "LTI0/c;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35609a implements com.avito.android.arch.mvi.a<TI0.a, ShortcutsInternalAction, TI0.c> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f313967k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f313968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f313969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.a f313970c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f313971d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f313972e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f313973f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Z0 f313974g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f313975h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final s90.b f313976i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final e2 f313977j = f2.b(0, 10, null, 5);

    /* compiled from: ShortcutsActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/a$a;", "", "<init>", "()V", "", "OPEN_TAB_DELAY_MS", "J", "PENDING_MSG_DELAY_MS", "", "POST_PROCESSOR_CAPACITY", "I", "REFRESH_TAB_DELAY_MS", "SHORTCUT_CHANGES_DELAY_MS", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$a, reason: collision with other inner class name */
    public static final class C9671a {
        public /* synthetic */ C9671a(C42822w c42822w) {
            this();
        }

        public C9671a() {
        }
    }

    /* compiled from: ShortcutsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processCurrentShortcutName$1", f = "ShortcutsActor.kt", i = {0}, l = {220, 221}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ShortcutsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313978q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313979r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f313980s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f313980s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f313980s, continuation);
            bVar.f313979r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313978q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f313979r;
                this.f313979r = interfaceC43172j;
                this.f313978q = 1;
                if (C43131e0.b(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f313979r;
                C42729a0.b(obj);
            }
            ShortcutsInternalAction.OpenTab openTab = new ShortcutsInternalAction.OpenTab(this.f313980s);
            this.f313979r = null;
            this.f313978q = 2;
            if (interfaceC43172j.emit(openTab, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c */
    public static final class c implements InterfaceC43160i<ShortcutsInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1 f313981b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f313982c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c$a, reason: collision with other inner class name */
        public static final class C9672a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313983b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f313984c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processLoad$$inlined$map$1$2", f = "ShortcutsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c$a$a, reason: collision with other inner class name */
            public static final class C9673a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313985q;

                /* renamed from: r, reason: collision with root package name */
                public int f313986r;

                public C9673a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313985q = obj;
                    this.f313986r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9672a.this.emit(null, this);
                }
            }

            public C9672a(InterfaceC43172j interfaceC43172j, boolean z12) {
                this.f313983b = interfaceC43172j;
                this.f313984c = z12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.c.C9672a.C9673a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.c.C9672a.C9673a) r0
                    int r1 = r0.f313986r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313986r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f313985q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313986r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L71
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    kotlin.Q r6 = (kotlin.Q) r6
                    A r7 = r6.f406619b
                    com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                    B r6 = r6.f406620c
                    UI0.c r6 = (UI0.c) r6
                    boolean r2 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r2 == 0) goto L52
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingError r6 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingError
                    com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                    com.avito.android.remote.error.ApiError r2 = r7.getError()
                    java.lang.Throwable r7 = r7.getCause()
                    r6.<init>(r2, r7)
                    goto L66
                L52:
                    boolean r2 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r2 == 0) goto L74
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingResult r2 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction$LoadingResult
                    com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                    java.lang.Object r7 = r7.getResult()
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts r7 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts) r7
                    boolean r4 = r5.f313984c
                    r2.<init>(r7, r4, r6)
                    r6 = r2
                L66:
                    r0.f313986r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f313983b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L71
                    return r1
                L71:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                L74:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.c.C9672a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(C1 c12, boolean z12) {
            this.f313981b = c12;
            this.f313982c = z12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313981b.collect(new C9672a(interfaceC43172j, this.f313982c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ShortcutsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$d */
    public /* synthetic */ class d extends C42801a implements Y41.q<TypedResult<UserAdvertsShortcuts>, UI0.c, Continuation<? super kotlin.Q<? extends TypedResult<UserAdvertsShortcuts>, ? extends UI0.c>>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final d f313988b = new d();

        public d() {
            super(3, kotlin.Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // Y41.q
        public final Object invoke(TypedResult<UserAdvertsShortcuts> typedResult, UI0.c cVar, Continuation<? super kotlin.Q<? extends TypedResult<UserAdvertsShortcuts>, ? extends UI0.c>> continuation) {
            int i12 = C35609a.f313967k;
            return new kotlin.Q(typedResult, cVar);
        }
    }

    /* compiled from: ShortcutsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processLoad$4", f = "ShortcutsActor.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ShortcutsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313989q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f313990r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f313990r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313989q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f313990r;
                ShortcutsInternalAction.LoadingStart loadingStart = new ShortcutsInternalAction.LoadingStart();
                this.f313989q = 1;
                if (interfaceC43172j.emit(loadingStart, this) == coroutine_suspended) {
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

    /* compiled from: ShortcutsActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "", "cause", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$processLoad$5", f = "ShortcutsActor.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$f */
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ShortcutsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313991q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f313992r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f313993s;

        public f() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ShortcutsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(3, continuation);
            fVar.f313992r = interfaceC43172j;
            fVar.f313993s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313991q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f313992r;
                ShortcutsInternalAction.LoadingError loadingError = new ShortcutsInternalAction.LoadingError(null, this.f313993s);
                this.f313992r = null;
                this.f313991q = 1;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g */
    public static final class g implements InterfaceC43160i<UI0.c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313994b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g$a, reason: collision with other inner class name */
        public static final class C9674a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313995b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$userInfo$$inlined$map$1$2", f = "ShortcutsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g$a$a, reason: collision with other inner class name */
            public static final class C9675a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313996q;

                /* renamed from: r, reason: collision with root package name */
                public int f313997r;

                public C9675a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f313996q = obj;
                    this.f313997r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9674a.this.emit(null, this);
                }
            }

            public C9674a(InterfaceC43172j interfaceC43172j) {
                this.f313995b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.g.C9674a.C9675a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.g.C9674a.C9675a) r0
                    int r1 = r0.f313997r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313997r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f313996q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313997r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                    if (r6 == 0) goto L41
                    UI0.c r5 = new UI0.c
                    r6 = 0
                    r5.<init>(r6, r6)
                    goto L55
                L41:
                    boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                    if (r6 == 0) goto L63
                    UI0.c r6 = new UI0.c
                    com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                    java.lang.Object r5 = r5.getResult()
                    s90.a r5 = (s90.C48016a) r5
                    boolean r5 = r5.f437498a
                    r6.<init>(r5, r3)
                    r5 = r6
                L55:
                    r0.f313997r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f313995b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L63:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35609a.g.C9674a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC43160i interfaceC43160i) {
            this.f313994b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super UI0.c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f313994b.collect(new C9674a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ShortcutsActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Ls90/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$userInfo$1", f = "ShortcutsActor.kt", i = {}, l = {441, 441}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.a$h */
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<C48016a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313999q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f314000r;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = C35609a.this.new h(continuation);
            hVar.f314000r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<C48016a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313999q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f314000r;
                s90.b bVar = C35609a.this.f313976i;
                this.f314000r = interfaceC43172j;
                this.f313999q = 1;
                obj = bVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f314000r;
                C42729a0.b(obj);
            }
            this.f314000r = null;
            this.f313999q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new C9671a(null);
    }

    @Inject
    public C35609a(@Y61.k com.avito.android.account.plugin.rx.a aVar, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.a aVar2, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Z0 z02, @Y61.k com.avito.android.clientEventBus.a aVar3, @Y61.k s90.b bVar) {
        this.f313968a = aVar;
        this.f313969b = e12;
        this.f313970c = aVar2;
        this.f313971d = r02;
        this.f313972e = interfaceC28373a;
        this.f313973f = interfaceC41196a;
        this.f313974g = z02;
        this.f313975h = aVar3;
        this.f313976i = bVar;
    }

    public static InterfaceC43160i d(a.k kVar, TI0.c cVar) {
        Iterator<c.a> it = cVar.f15557f.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(it.next().f15564c.f313853c, kVar.f15541a)) {
                break;
            }
            i12++;
        }
        return i12 != -1 ? C43175k.N(new C43210w(new ShortcutsInternalAction.ChangeShortcut(kVar.f15541a)), C43175k.G(new b(i12, null))) : new C43210w(ShortcutsInternalAction.NoChange.f314032b);
    }

    public static C43210w f(a.g gVar, TI0.c cVar) {
        return C42745f0.K(gVar.f15536a, cVar.f15557f) != null ? new C43210w(new ShortcutsInternalAction.RefreshTab(gVar.f15536a)) : new C43210w(ShortcutsInternalAction.NoChange.f314032b);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.Y(C43175k.r(new C43137a0(new T(this, null), kotlinx.coroutines.rx3.y.a(this.f313969b.g()))), new C35611c(null, this, c43197r1, aVar, c43197r1, aVar));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ShortcutsInternalAction> b(@Y61.k TI0.a aVar, @Y61.k TI0.c cVar) {
        InterfaceC43160i<ShortcutsInternalAction> c43210w;
        if (aVar instanceof a.b) {
            return cVar.f15561j instanceof c.b.a ? new C43210w(ShortcutsInternalAction.NoChange.f314032b) : e(cVar, false);
        }
        if (aVar instanceof a.h) {
            return e(cVar, ((a.h) aVar).f15537a);
        }
        if (aVar instanceof a.e) {
            return C43175k.I(this.f313971d.a(), new C43152f0(new C43137a0(new C(cVar, null), new A(new C1(this.f313970c.a(), g(cVar, false), B.f313872b), cVar)), new D(3, null)));
        }
        if (aVar instanceof a.d) {
            return new C43210w(new ShortcutsInternalAction.Login(cVar.f15554c));
        }
        if (aVar instanceof a.l) {
            String str = ((a.l) aVar).f15542a;
            if (str == null || str.length() == 0) {
                return new C43210w(ShortcutsInternalAction.NoChange.f314032b);
            }
            c43210w = new C43210w(new ShortcutsInternalAction.ShowStatus(str));
        } else {
            if (aVar instanceof a.k) {
                return d((a.k) aVar, cVar);
            }
            if (aVar instanceof a.j) {
                a.j jVar = (a.j) aVar;
                List<c.a> list = cVar.f15557f;
                int i12 = jVar.f15539a;
                c.a aVar2 = (c.a) C42745f0.K(i12, list);
                if (aVar2 != null) {
                    this.f313972e.c(new UserAdvertsTabEvent(aVar2.f15564c.f313853c, jVar.f15540b ? UserAdvertsTabEvent.Type.f312115c : UserAdvertsTabEvent.Type.f312116d));
                }
                if (C42745f0.K(i12, list) == null) {
                    return new C43210w(ShortcutsInternalAction.NoChange.f314032b);
                }
                c43210w = C43175k.N(new C43210w(new ShortcutsInternalAction.ChangeIndex(i12)), new C43210w(ShortcutsInternalAction.NoChange.f314032b));
            } else {
                boolean z12 = aVar instanceof a.i;
                UI0.a aVar3 = cVar.f15555d;
                if (z12) {
                    return d(new a.k(aVar3.f16330a), cVar);
                }
                if (aVar instanceof a.f) {
                    UI0.a.f16328d.getClass();
                    if (kotlin.jvm.internal.L.f(aVar3, UI0.a.f16329e)) {
                        return new C43210w(ShortcutsInternalAction.NoChange.f314032b);
                    }
                    c43210w = f(new a.g(aVar3.f16331b), cVar);
                } else {
                    if (aVar instanceof a.g) {
                        return f((a.g) aVar, cVar);
                    }
                    if (aVar instanceof a.n) {
                        c43210w = new C43210w(new ShortcutsInternalAction.UpdatePendingMsg(((a.n) aVar).f15544a));
                    } else {
                        if (!(aVar instanceof a.C1057a)) {
                            if (aVar instanceof a.c) {
                                return new C43210w(ShortcutsInternalAction.AddAdvert.f314023b);
                            }
                            if (aVar instanceof a.m) {
                                return new C43210w(ShortcutsInternalAction.ToastBarForUpdateAdvertsIsShown.f314043b);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        String str2 = cVar.f15559h;
                        if (str2 == null) {
                            return new C43210w(ShortcutsInternalAction.NoChange.f314032b);
                        }
                        c43210w = new C43210w(new ShortcutsInternalAction.ShowPendingMsg(str2));
                    }
                }
            }
        }
        return c43210w;
    }

    public final InterfaceC43160i<ShortcutsInternalAction> e(TI0.c cVar, boolean z12) {
        return C43175k.I(this.f313971d.a(), new C43152f0(new C43137a0(new e(2, null), new c(new C1(this.f313970c.a(), g(cVar, z12), d.f313988b), z12)), new f(3, null)));
    }

    public final InterfaceC43160i<UI0.c> g(TI0.c cVar, boolean z12) {
        if (!z12) {
            UI0.c cVar2 = cVar.f15553b;
            if (cVar2.f16336b) {
                return new C43210w(cVar2);
            }
        }
        return new g(C43175k.G(new h(null)));
    }
}
