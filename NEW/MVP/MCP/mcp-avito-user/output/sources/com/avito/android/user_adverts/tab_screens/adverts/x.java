package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_actions.host.e;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.avito.android.util.R0;
import fJ0.InterfaceC40301a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsListMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectSelectedActionV2$2", f = "UserAdvertsListMviFragment.kt", i = {}, l = {520}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class x extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315738q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315739r;

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements Y41.q<e.b, String, Continuation<? super Q<? extends e.b, ? extends String>>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final a f315740b = new a();

        public a() {
            super(3, Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // Y41.q
        public final Object invoke(e.b bVar, String str, Continuation<? super Q<? extends e.b, ? extends String>> continuation) {
            return new Q(bVar, str);
        }
    }

    /* compiled from: UserAdvertsListMviFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315741b;

        public b(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f315741b = userAdvertsListMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            e.b bVar = (e.b) ((Q) obj).f406619b;
            boolean z12 = bVar instanceof e.b.a ? true : bVar instanceof e.b.d;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315741b;
            if (z12) {
                UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
                userAdvertsListMviFragment.u5().accept(InterfaceC40301a.c.C11142c.f395830a);
            } else if (bVar instanceof e.b.c) {
                UserAdvertsListMviFragment.C35649a c35649a2 = UserAdvertsListMviFragment.f314828R0;
                userAdvertsListMviFragment.u5().accept(new InterfaceC40301a.d.b(((e.b.c) bVar).f314281b.toString()));
            } else {
                boolean z13 = bVar instanceof e.b.C9698b;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Q<? extends e.b, ? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1 f315742b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f315743b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectSelectedActionV2$2$invokeSuspend$$inlined$filter$1$2", f = "UserAdvertsListMviFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.x$c$a$a, reason: collision with other inner class name */
            public static final class C9784a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f315744q;

                /* renamed from: r, reason: collision with root package name */
                public int f315745r;

                public C9784a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f315744q = obj;
                    this.f315745r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f315743b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.x.c.a.C9784a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.tab_screens.adverts.x$c$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.x.c.a.C9784a) r0
                    int r1 = r0.f315745r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f315745r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.x$c$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.x$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f315744q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f315745r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L54
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kotlin.Q r6 = (kotlin.Q) r6
                    A r2 = r6.f406619b
                    com.avito.android.user_adverts.tab_actions.host.e$b r2 = (com.avito.android.user_adverts.tab_actions.host.e.b) r2
                    B r6 = r6.f406620c
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.String r2 = r2.getF314282a()
                    boolean r6 = kotlin.jvm.internal.L.f(r2, r6)
                    if (r6 == 0) goto L54
                    r0.f315745r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f315743b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L54
                    return r1
                L54:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.x.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(C1 c12) {
            this.f315742b = c12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Q<? extends e.b, ? extends String>> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f315742b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f315747b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f315748b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectSelectedActionV2$2$invokeSuspend$$inlined$map$1$2", f = "UserAdvertsListMviFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.x$d$a$a, reason: collision with other inner class name */
            public static final class C9785a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f315749q;

                /* renamed from: r, reason: collision with root package name */
                public int f315750r;

                public C9785a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f315749q = obj;
                    this.f315750r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f315748b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.x.d.a.C9785a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.tab_screens.adverts.x$d$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.x.d.a.C9785a) r0
                    int r1 = r0.f315750r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f315750r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.x$d$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.x$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f315749q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f315750r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r5 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r5
                    java.lang.String r5 = r5.f315384b
                    r0.f315750r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f315748b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.x.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(n2 n2Var) {
            this.f315747b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super String> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f315747b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f315739r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new x(this.f315739r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((x) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315738q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315739r;
            com.avito.android.user_adverts.tab_actions.host.e eVar = userAdvertsListMviFragment.f314854w0;
            if (eVar == null) {
                eVar = null;
            }
            c cVar = new c(new C1(eVar, C43175k.r(new d(userAdvertsListMviFragment.u5().getState())), a.f315740b));
            R0 r02 = userAdvertsListMviFragment.f314855x0;
            InterfaceC43160i interfaceC43160iI = C43175k.I((r02 != null ? r02 : null).c(), cVar);
            b bVar = new b(userAdvertsListMviFragment);
            this.f315738q = 1;
            if (interfaceC43160iI.collect(bVar, this) == coroutine_suspended) {
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
