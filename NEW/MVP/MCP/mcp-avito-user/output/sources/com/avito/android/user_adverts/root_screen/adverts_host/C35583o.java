package com.avito.android.user_adverts.root_screen.adverts_host;

import Gq0.C13908a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.seller_coach.adverts_hint.view.f;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import yq0.InterfaceC50282b;
import zq0.AbstractC50612a;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHintsView$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35583o extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313112q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f313113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.seller_coach.adverts_hint.view.f f313114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SI0.a f313115t;

    /* compiled from: UserAdvertsHostFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHintsView$1$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {644}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313116q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313117r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.seller_coach.adverts_hint.view.f f313118s;

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C9594a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.seller_coach.adverts_hint.view.f f313119b;

            public C9594a(com.avito.android.seller_coach.adverts_hint.view.f fVar) {
                this.f313119b = fVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f313119b.a((f.d) obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f313119b, com.avito.android.seller_coach.adverts_hint.view.f.class, "renderState", "renderState(Lcom/avito/android/seller_coach/adverts_hint/view/ShortAdvicesView$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$a$b */
        public static final class b implements InterfaceC43160i<f.d> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n2 f313120b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$a$b$a, reason: collision with other inner class name */
            public static final class C9595a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f313121b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHintsView$1$1$invokeSuspend$$inlined$map$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$a$b$a$a, reason: collision with other inner class name */
                public static final class C9596a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f313122q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f313123r;

                    public C9596a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f313122q = obj;
                        this.f313123r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C9595a.this.emit(null, this);
                    }
                }

                public C9595a(InterfaceC43172j interfaceC43172j) {
                    this.f313121b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.avito.android.user_adverts.root_screen.adverts_host.C35583o.a.b.C9595a.C9596a
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.avito.android.user_adverts.root_screen.adverts_host.o$a$b$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.C35583o.a.b.C9595a.C9596a) r0
                        int r1 = r0.f313123r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f313123r = r1
                        goto L18
                    L13:
                        com.avito.android.user_adverts.root_screen.adverts_host.o$a$b$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.o$a$b$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f313122q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f313123r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r8)
                        goto L55
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.C42729a0.b(r8)
                        com.avito.android.seller_coach.adverts_hint.mvi.entity.ShortAdvicesState r7 = (com.avito.android.seller_coach.adverts_hint.mvi.entity.ShortAdvicesState) r7
                        com.avito.android.seller_coach.adverts_hint.view.f$d r8 = new com.avito.android.seller_coach.adverts_hint.view.f$d
                        com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem r2 = r7.f267273c
                        r4 = 0
                        if (r2 == 0) goto L40
                        java.lang.String r5 = r2.f267210c
                        goto L41
                    L40:
                        r5 = r4
                    L41:
                        if (r2 == 0) goto L45
                        java.lang.String r4 = r2.f267212e
                    L45:
                        java.util.List<com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem> r7 = r7.f267274d
                        r8.<init>(r5, r4, r7)
                        r0.f313123r = r3
                        kotlinx.coroutines.flow.j r7 = r6.f313121b
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L55
                        return r1
                    L55:
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.C35583o.a.b.C9595a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(n2 n2Var) {
                this.f313120b = n2Var;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super f.d> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f313120b.collect(new C9595a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserAdvertsHostFragment userAdvertsHostFragment, com.avito.android.seller_coach.adverts_hint.view.f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f313117r = userAdvertsHostFragment;
            this.f313118s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f313117r, this.f313118s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313116q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313117r;
                AbstractC50612a abstractC50612a = userAdvertsHostFragment.f312296F0;
                if (abstractC50612a == null) {
                    abstractC50612a = null;
                }
                InterfaceC43160i interfaceC43160iR = C43175k.r(new b(abstractC50612a.getState()));
                R0 r02 = userAdvertsHostFragment.f312300J0;
                InterfaceC43160i interfaceC43160iI = C43175k.I((r02 != null ? r02 : null).c(), interfaceC43160iR);
                C9594a c9594a = new C9594a(this.f313118s);
                this.f313116q = 1;
                if (interfaceC43160iI.collect(c9594a, this) == coroutine_suspended) {
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

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindHintsView$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {648}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313125q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313126r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SI0.a f313127s;

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyq0/b;", "event", "Lkotlin/G0;", "emit", "(Lyq0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.o$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f313128b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SI0.a f313129c;

            public a(UserAdvertsHostFragment userAdvertsHostFragment, SI0.a aVar) {
                this.f313128b = userAdvertsHostFragment;
                this.f313129c = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC50282b interfaceC50282b = (InterfaceC50282b) obj;
                boolean z12 = interfaceC50282b instanceof InterfaceC50282b.a;
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313128b;
                if (z12) {
                    UserAdvertsHostFragment.G5(userAdvertsHostFragment, ((InterfaceC50282b.a) interfaceC50282b).f443511a);
                } else if (interfaceC50282b instanceof InterfaceC50282b.C12920b) {
                    h.b bVar = userAdvertsHostFragment.f312308R0;
                    if (bVar == null) {
                        bVar = null;
                    }
                    com.avito.android.lib.util.g.a(bVar.a(new C13908a(((InterfaceC50282b.C12920b) interfaceC50282b).f443512a, "from_widget", true), userAdvertsHostFragment, this.f313129c));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserAdvertsHostFragment userAdvertsHostFragment, SI0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f313126r = userAdvertsHostFragment;
            this.f313127s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f313126r, this.f313127s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313125q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313126r;
                AbstractC50612a abstractC50612a = userAdvertsHostFragment.f312296F0;
                if (abstractC50612a == null) {
                    abstractC50612a = null;
                }
                InterfaceC43160i<InterfaceC50282b> events = abstractC50612a.getEvents();
                a aVar = new a(userAdvertsHostFragment, this.f313127s);
                this.f313125q = 1;
                if (events.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35583o(UserAdvertsHostFragment userAdvertsHostFragment, com.avito.android.seller_coach.adverts_hint.view.f fVar, SI0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f313113r = userAdvertsHostFragment;
        this.f313114s = fVar;
        this.f313115t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35583o c35583o = new C35583o(this.f313113r, this.f313114s, this.f313115t, continuation);
        c35583o.f313112q = obj;
        return c35583o;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35583o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f313112q;
        UserAdvertsHostFragment userAdvertsHostFragment = this.f313113r;
        C43259k.d(t12, null, null, new a(userAdvertsHostFragment, this.f313114s, null), 3);
        C43259k.d(t12, null, null, new b(userAdvertsHostFragment, this.f313115t, null), 3);
        return G0.f406611a;
    }
}
