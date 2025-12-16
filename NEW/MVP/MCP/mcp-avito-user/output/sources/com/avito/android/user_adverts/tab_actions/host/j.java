package com.avito.android.user_adverts.tab_actions.host;

import Y41.p;
import YI0.a;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_actions.host.e;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_actions.host.items.n;
import com.avito.android.user_adverts.tab_actions.host.mvi.E;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;

/* compiled from: UserAdvertsActionsViewModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/j;", "Lcom/avito/android/arch/mvi/android/h;", "LYI0/a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "Lcom/avito/android/user_adverts/tab_actions/host/e;", "Lcom/avito/android/user_adverts/tab_actions/host/items/n$a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends com.avito.android.arch.mvi.android.h<YI0.a, UserAdvertsActionsState, com.avito.android.user_adverts.tab_actions.host.mvi.entity.a> implements e, n.a {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f314357P = 0;

    /* compiled from: UserAdvertsActionsViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/j$a;", "Landroidx/lifecycle/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC22993a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final E f314358d;

        /* compiled from: UserAdvertsActionsViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/j$a$a;", "", "<init>", "()V", "", "MODEL_CLASS_NON_VALID_MESSAGE", "Ljava/lang/String;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.j$a$a, reason: collision with other inner class name */
        public static final class C9700a {
            public /* synthetic */ C9700a(C42822w c42822w) {
                this();
            }

            public C9700a() {
            }
        }

        static {
            new C9700a(null);
        }

        @Inject
        public a(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k E e12) {
            super(interfaceC23487e, null);
            this.f314358d = e12;
        }

        @Override // androidx.view.AbstractC22993a
        @Y61.k
        public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
            if (!cls.isAssignableFrom(j.class)) {
                throw new IllegalArgumentException("Factory can create only UserAdvertsActionsViewModel");
            }
            i2.f411430a.getClass();
            return new j(this.f314358d, c23060r0, i2.a.f411433c);
        }
    }

    /* compiled from: UserAdvertsActionsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.UserAdvertsActionsViewModel$collect$2", f = "UserAdvertsActionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f314359q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<e.b> f314361s;

        /* compiled from: UserAdvertsActionsViewModel.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.UserAdvertsActionsViewModel$collect$2$1", f = "UserAdvertsActionsViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f314362q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ j f314363r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<e.b> f314364s;

            /* compiled from: SafeCollector.common.kt */
            @s0
            @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_actions.host.j$b$a$a, reason: collision with other inner class name */
            public static final class C9701a implements InterfaceC43160i<e.b> {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43160i f314365b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j f314366c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.user_adverts.tab_actions.host.j$b$a$a$a, reason: collision with other inner class name */
                public static final class C9702a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC43172j f314367b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.UserAdvertsActionsViewModel$collect$2$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "UserAdvertsActionsViewModel.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
                    /* renamed from: com.avito.android.user_adverts.tab_actions.host.j$b$a$a$a$a, reason: collision with other inner class name */
                    public static final class C9703a extends ContinuationImpl {

                        /* renamed from: q, reason: collision with root package name */
                        public /* synthetic */ Object f314368q;

                        /* renamed from: r, reason: collision with root package name */
                        public int f314369r;

                        public C9703a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Y61.l
                        public final Object invokeSuspend(@Y61.k Object obj) {
                            this.f314368q = obj;
                            this.f314369r |= BeduinInputModel.MIN_TEXT_VERSION;
                            return C9702a.this.emit(null, this);
                        }
                    }

                    public C9702a(InterfaceC43172j interfaceC43172j, j jVar) {
                        this.f314367b = interfaceC43172j;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    @Y61.l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_actions.host.j.b.a.C9701a.C9702a.C9703a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.avito.android.user_adverts.tab_actions.host.j$b$a$a$a$a r0 = (com.avito.android.user_adverts.tab_actions.host.j.b.a.C9701a.C9702a.C9703a) r0
                            int r1 = r0.f314369r
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f314369r = r1
                            goto L18
                        L13:
                            com.avito.android.user_adverts.tab_actions.host.j$b$a$a$a$a r0 = new com.avito.android.user_adverts.tab_actions.host.j$b$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f314368q
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.f314369r
                            r3 = 1
                            if (r2 == 0) goto L32
                            if (r2 != r3) goto L2a
                            kotlin.C42729a0.b(r6)
                            goto Lb0
                        L2a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L32:
                            kotlin.C42729a0.b(r6)
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a) r5
                            int r6 = com.avito.android.user_adverts.tab_actions.host.j.f314357P
                            boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.c
                            if (r6 == 0) goto L62
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$c r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.c) r5
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$a r6 = r5.f314489b
                            boolean r2 = r6 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.a.C9709a
                            java.lang.String r5 = r5.f314488a
                            if (r2 == 0) goto L4d
                            com.avito.android.user_adverts.tab_actions.host.e$b$a r6 = new com.avito.android.user_adverts.tab_actions.host.e$b$a
                            r6.<init>(r5)
                            goto La3
                        L4d:
                            boolean r2 = r6 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.a.b
                            if (r2 == 0) goto L5c
                            com.avito.android.user_adverts.tab_actions.host.e$b$c r2 = new com.avito.android.user_adverts.tab_actions.host.e$b$c
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$a$b r6 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.a.b) r6
                            java.lang.String r6 = r6.f314472a
                            r2.<init>(r5, r6)
                            r6 = r2
                            goto La3
                        L5c:
                            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                            r5.<init>()
                            throw r5
                        L62:
                            boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.f
                            if (r6 == 0) goto L70
                            com.avito.android.user_adverts.tab_actions.host.e$b$d r6 = new com.avito.android.user_adverts.tab_actions.host.e$b$d
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$f r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.f) r5
                            java.lang.String r5 = r5.f314497a
                            r6.<init>(r5)
                            goto La3
                        L70:
                            boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.b
                            if (r6 == 0) goto L82
                            com.avito.android.user_adverts.tab_actions.host.e$b$b r6 = new com.avito.android.user_adverts.tab_actions.host.e$b$b
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$b r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.b) r5
                            com.avito.android.user_adverts.model.UserAdvertActionPendingResult$Info r5 = r5.f314487a
                            java.lang.String r2 = r5.f312165b
                            java.lang.Object r5 = r5.f312166c
                            r6.<init>(r2, r5)
                            goto La3
                        L82:
                            boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.C9711a
                            if (r6 == 0) goto L92
                            com.avito.android.user_adverts.tab_actions.host.e$b$b r6 = new com.avito.android.user_adverts.tab_actions.host.e$b$b
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$a r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.C9711a) r5
                            java.lang.String r2 = r5.f314485b
                            java.lang.Object r5 = r5.f314486c
                            r6.<init>(r2, r5)
                            goto La3
                        L92:
                            boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.i
                            if (r6 == 0) goto La2
                            com.avito.android.user_adverts.tab_actions.host.e$b$c r6 = new com.avito.android.user_adverts.tab_actions.host.e$b$c
                            com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$i r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.a.i) r5
                            java.lang.String r2 = r5.f314503a
                            java.lang.String r5 = r5.f314504b
                            r6.<init>(r2, r5)
                            goto La3
                        La2:
                            r6 = 0
                        La3:
                            if (r6 == 0) goto Lb0
                            r0.f314369r = r3
                            kotlinx.coroutines.flow.j r5 = r4.f314367b
                            java.lang.Object r5 = r5.emit(r6, r0)
                            if (r5 != r1) goto Lb0
                            return r1
                        Lb0:
                            kotlin.G0 r5 = kotlin.G0.f406611a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.j.b.a.C9701a.C9702a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                public C9701a(InterfaceC43160i interfaceC43160i, j jVar) {
                    this.f314365b = interfaceC43160i;
                    this.f314366c = jVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43160i
                @Y61.l
                public final Object collect(@Y61.k InterfaceC43172j<? super e.b> interfaceC43172j, @Y61.k Continuation continuation) {
                    Object objCollect = this.f314365b.collect(new C9702a(interfaceC43172j, this.f314366c), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j jVar, InterfaceC43172j<? super e.b> interfaceC43172j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f314363r = jVar;
                this.f314364s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f314363r, this.f314364s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f314362q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    j jVar = this.f314363r;
                    C9701a c9701a = new C9701a(jVar.getEvents(), jVar);
                    this.f314362q = 1;
                    if (c9701a.collect(this.f314364s, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super e.b> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f314361s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = j.this.new b(this.f314361s, continuation);
            bVar.f314359q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((T) this.f314359q, null, null, new a(j.this, this.f314361s, null), 3);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.items.n.a
    public final void Yc(@Y61.k UserAdvertSingleActionItem userAdvertSingleActionItem) {
        accept(new a.f(userAdvertSingleActionItem));
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super e.b> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objC = U.c(new b(interfaceC43172j, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(e.a aVar, Continuation continuation) {
        Object hVar;
        e.a aVar2 = aVar;
        if (aVar2 instanceof e.a.C9697a) {
            String str = ((e.a.C9697a) aVar2).f314269a;
            e.a.C9697a c9697a = (e.a.C9697a) aVar2;
            hVar = new a.e(str, c9697a.f314270b, c9697a.f314271c);
        } else if (aVar2 instanceof e.a.c) {
            hVar = new a.i(((e.a.c) aVar2).f314276a);
        } else {
            if (!(aVar2 instanceof e.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((e.a.b) aVar2).f314272a;
            e.a.b bVar = (e.a.b) aVar2;
            hVar = new a.h(str2, bVar.f314273b, bVar.f314274c, bVar.f314275d);
        }
        accept(hVar);
        return G0.f406611a;
    }
}
