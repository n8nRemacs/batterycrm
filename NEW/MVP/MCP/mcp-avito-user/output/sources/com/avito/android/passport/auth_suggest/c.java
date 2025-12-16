package com.avito.android.passport.auth_suggest;

import F50.b;
import FV0.h;
import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import com.avito.android.passport.auth_suggest.mvi.g;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.n2;

/* compiled from: PassportAuthSuggestViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/auth_suggest/c;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LF50/a;", "LF50/c;", "LF50/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends M0 implements k<F50.a, F50.c, F50.b> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f210947E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<h> f210948J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f210949K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f210950L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ZS.b f210951M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f210952N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f210953O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final n2<F50.c> f210954P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C6300c f210955Q;

    /* compiled from: PassportAuthSuggestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f210956l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f210957m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.a aVar, c cVar) {
            super(0);
            this.f210956l = aVar;
            this.f210957m = cVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f210956l.a(N0.a(this.f210957m));
        }
    }

    /* compiled from: PassportAuthSuggestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LF50/a;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "LF50/c;", "LF50/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.arch.mvi.c<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f210958l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f210959m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, c cVar) {
            super(0);
            this.f210958l = gVar;
            this.f210959m = cVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b> invoke() {
            return this.f210958l.a(null, N0.a(this.f210959m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport.auth_suggest.c$c, reason: collision with other inner class name */
    public static final class C6300c implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f210960b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.auth_suggest.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f210961b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$filterIsInstance$1$2", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.auth_suggest.c$c$a$a, reason: collision with other inner class name */
            public static final class C6301a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210962q;

                /* renamed from: r, reason: collision with root package name */
                public int f210963r;

                public C6301a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210962q = obj;
                    this.f210963r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f210961b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.passport.auth_suggest.c.C6300c.a.C6301a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.passport.auth_suggest.c$c$a$a r0 = (com.avito.android.passport.auth_suggest.c.C6300c.a.C6301a) r0
                    int r1 = r0.f210963r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210963r = r1
                    goto L18
                L13:
                    com.avito.android.passport.auth_suggest.c$c$a$a r0 = new com.avito.android.passport.auth_suggest.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f210962q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210963r
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
                    boolean r6 = r5 instanceof F50.b.e
                    if (r6 == 0) goto L43
                    r0.f210963r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f210961b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.c.C6300c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C6300c(m mVar) {
            this.f210960b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f210960b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$1", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super F50.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210965q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210966r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f210967s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f210968t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<F50.c> f210969b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f210970c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$1$1", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.auth_suggest.c$d$a$a, reason: collision with other inner class name */
            public static final class C6302a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210971q;

                /* renamed from: r, reason: collision with root package name */
                public int f210972r;

                public C6302a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210971q = obj;
                    this.f210972r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f210970c = cVar;
                this.f210969b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.passport.auth_suggest.c.d.a.C6302a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.passport.auth_suggest.c$d$a$a r0 = (com.avito.android.passport.auth_suggest.c.d.a.C6302a) r0
                    int r1 = r0.f210972r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210972r = r1
                    goto L18
                L13:
                    com.avito.android.passport.auth_suggest.c$d$a$a r0 = new com.avito.android.passport.auth_suggest.c$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f210971q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210972r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    eT.c r5 = (kotlin.AbstractC40048c) r5
                    com.avito.android.passport.auth_suggest.c r6 = r4.f210970c
                    com.avito.android.arch.mvi.c r6 = r6.ke()
                    F50.a$c r2 = new F50.a$c
                    r2.<init>(r5)
                    r0.f210972r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.c.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C43188o0 c43188o0, Continuation continuation, c cVar) {
            super(2, continuation);
            this.f210967s = c43188o0;
            this.f210968t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f210967s, continuation, this.f210968t);
            dVar.f210966r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super F50.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210965q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f210966r, this.f210968t);
                this.f210965q = 1;
                if (this.f210967s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$2", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super F50.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210974q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210975r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f210976s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f210977t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<F50.b> f210978b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f210979c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$2$1", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.auth_suggest.c$e$a$a, reason: collision with other inner class name */
            public static final class C6303a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210980q;

                /* renamed from: r, reason: collision with root package name */
                public int f210981r;

                public C6303a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210980q = obj;
                    this.f210981r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f210979c = cVar;
                this.f210978b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.passport.auth_suggest.c.e.a.C6303a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.passport.auth_suggest.c$e$a$a r0 = (com.avito.android.passport.auth_suggest.c.e.a.C6303a) r0
                    int r1 = r0.f210981r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210981r = r1
                    goto L18
                L13:
                    com.avito.android.passport.auth_suggest.c$e$a$a r0 = new com.avito.android.passport.auth_suggest.c$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f210980q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210981r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L35
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    goto L72
                L35:
                    kotlin.C42729a0.b(r7)
                    F50.b r6 = (F50.b) r6
                    boolean r7 = r6 instanceof F50.b.e
                    if (r7 == 0) goto L49
                    r0.f210981r = r4
                    kotlinx.coroutines.flow.j<F50.b> r7 = r5.f210978b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L72
                    return r1
                L49:
                    boolean r7 = r6 instanceof F50.b.d
                    if (r7 == 0) goto L72
                    r7 = r6
                    F50.b$d r7 = (F50.b.d) r7
                    boolean r7 = r7 instanceof F50.b.c
                    if (r7 == 0) goto L72
                    com.avito.android.passport.auth_suggest.c r7 = r5.f210979c
                    kotlin.C r2 = r7.f210953O
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    F50.b$c r6 = (F50.b.c) r6
                    java.lang.String r6 = r6.f4539a
                    ZS.b r7 = r7.f210951M
                    r4.<init>(r6, r7)
                    r0.f210981r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.c.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC43160i interfaceC43160i, Continuation continuation, c cVar) {
            super(2, continuation);
            this.f210976s = interfaceC43160i;
            this.f210977t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f210976s, continuation, this.f210977t);
            eVar.f210975r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super F50.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210974q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f210975r, this.f210977t);
                this.f210974q = 1;
                if (this.f210976s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$3", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super F50.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f210983q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f210984r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f210985s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f210986t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<F50.b> f210987b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f210988c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.auth_suggest.PassportAuthSuggestViewModel$special$$inlined$transform$3$1", f = "PassportAuthSuggestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.auth_suggest.c$f$a$a, reason: collision with other inner class name */
            public static final class C6304a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f210989q;

                /* renamed from: r, reason: collision with root package name */
                public int f210990r;

                public C6304a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f210989q = obj;
                    this.f210990r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f210988c = cVar;
                this.f210987b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.passport.auth_suggest.c.f.a.C6304a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.passport.auth_suggest.c$f$a$a r0 = (com.avito.android.passport.auth_suggest.c.f.a.C6304a) r0
                    int r1 = r0.f210990r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f210990r = r1
                    goto L18
                L13:
                    com.avito.android.passport.auth_suggest.c$f$a$a r0 = new com.avito.android.passport.auth_suggest.c$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f210989q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f210990r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent r5 = (com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent) r5
                    com.avito.android.passport.auth_suggest.c r6 = r4.f210988c
                    com.avito.android.arch.mvi.c r6 = r6.ke()
                    F50.a$a r2 = new F50.a$a
                    r2.<init>(r5)
                    r0.f210990r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.c.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, c cVar) {
            super(2, continuation);
            this.f210985s = interfaceC43160i;
            this.f210986t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f210985s, continuation, this.f210986t);
            fVar.f210984r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super F50.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f210983q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f210984r, this.f210986t);
                this.f210983q = 1;
                if (this.f210985s.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public c(@Y61.k g gVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<h> set, @Y61.k aU0.b bVar, @Y61.k R0 r02, @Y61.k ZS.b bVar2) {
        this.f210947E = b12;
        this.f210948J = set;
        this.f210949K = bVar;
        this.f210950L = r02;
        this.f210951M = bVar2;
        this.f210952N = C42727D.c(new b(gVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a(aVar, this));
        this.f210953O = interfaceC42726CC;
        m mVarN = C43175k.N(ke(), C43175k.G(new d(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        F50.c.f4540c.getClass();
        this.f210954P = C43175k.U(mVarN, aVarA, i2Var, F50.c.f4541d);
        this.f210955Q = new C6300c(C43175k.N(C43175k.G(new e(ke().f91928q, null, this)), C43175k.G(new f(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(N0.a(this), this.f210950L.b(), null, new com.avito.android.passport.auth_suggest.b(this, (F50.a) obj, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<b.e> getEvents() {
        return this.f210955Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<F50.c> getState() {
        return this.f210954P;
    }

    public final com.avito.android.arch.mvi.c<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b> ke() {
        return (com.avito.android.arch.mvi.c) this.f210952N.getValue();
    }
}
