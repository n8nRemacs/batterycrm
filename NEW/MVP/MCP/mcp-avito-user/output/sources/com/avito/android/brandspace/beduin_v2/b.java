package com.avito.android.brandspace.beduin_v2;

import FV0.h;
import Y41.p;
import Y61.l;
import androidx.view.M0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.arch.mvi.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.brandspace.beduin_v2.mvi.entity.BrandspaceBeduinV2InternalAction;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceAdjustParameters;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.beduin.v2.engine.component.B;
import ik.C41418c;
import ik.InterfaceC41416a;
import ik.InterfaceC41417b;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.n2;

/* compiled from: BrandspaceBeduinV2ViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/b;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "Lik/a;", "Lik/c;", "Lik/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends M0 implements k<InterfaceC41416a, C41418c, InterfaceC41417b> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f107518E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<h> f107519J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f107520K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ZS.b f107521L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f107522M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final x f107523N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f107524O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f107525P;

    /* renamed from: Q, reason: collision with root package name */
    public BrandspaceAdjustParameters f107526Q;

    /* renamed from: R, reason: collision with root package name */
    public Brandspace.BeduinV2 f107527R;

    /* renamed from: S, reason: collision with root package name */
    @l
    public N0 f107528S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final n2<C41418c> f107529T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<InterfaceC41417b> f107530U;

    /* compiled from: BrandspaceBeduinV2ViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$accept$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107531q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41416a f107533s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC41416a interfaceC41416a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f107533s = interfaceC41416a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new a(this.f107533s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107531q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) b.this.f107524O.getValue();
                this.f107531q = 1;
                if (cVar.ya(this.f107533s, this) == coroutine_suspended) {
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

    /* compiled from: BrandspaceBeduinV2ViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.brandspace.beduin_v2.b$b, reason: collision with other inner class name */
    public static final class C3211b extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f107534l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f107535m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3211b(n.a aVar, b bVar) {
            super(0);
            this.f107534l = aVar;
            this.f107535m = bVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f107534l.a(androidx.view.N0.a(this.f107535m));
        }
    }

    /* compiled from: BrandspaceBeduinV2ViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Lik/a;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lik/c;", "Lik/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC41416a, BrandspaceBeduinV2InternalAction, C41418c, InterfaceC41417b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.brandspace.beduin_v2.mvi.d f107536l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f107537m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.brandspace.beduin_v2.mvi.d dVar, b bVar) {
            super(0);
            this.f107536l = dVar;
            this.f107537m = bVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC41416a, BrandspaceBeduinV2InternalAction, C41418c, InterfaceC41417b> invoke() {
            return q.b(this.f107536l, null, androidx.view.N0.a(this.f107537m), 1);
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$special$$inlined$transform$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super C41418c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107538q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107539r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f107540s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f107541t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<C41418c> f107542b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f107543c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$special$$inlined$transform$1$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.brandspace.beduin_v2.b$d$a$a, reason: collision with other inner class name */
            public static final class C3212a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f107544q;

                /* renamed from: r, reason: collision with root package name */
                public int f107545r;

                public C3212a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f107544q = obj;
                    this.f107545r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f107543c = bVar;
                this.f107542b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.brandspace.beduin_v2.b.d.a.C3212a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.brandspace.beduin_v2.b$d$a$a r0 = (com.avito.android.brandspace.beduin_v2.b.d.a.C3212a) r0
                    int r1 = r0.f107545r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f107545r = r1
                    goto L18
                L13:
                    com.avito.android.brandspace.beduin_v2.b$d$a$a r0 = new com.avito.android.brandspace.beduin_v2.b$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f107544q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f107545r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    eT.c r5 = (kotlin.AbstractC40048c) r5
                    com.avito.android.brandspace.beduin_v2.b r6 = r4.f107543c
                    kotlin.C r6 = r6.f107524O
                    java.lang.Object r6 = r6.getValue()
                    com.avito.android.arch.mvi.c r6 = (com.avito.android.arch.mvi.c) r6
                    ik.a$b r2 = new ik.a$b
                    r2.<init>(r5)
                    r0.f107545r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.brandspace.beduin_v2.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C43188o0 c43188o0, Continuation continuation, b bVar) {
            super(2, continuation);
            this.f107540s = c43188o0;
            this.f107541t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f107540s, continuation, this.f107541t);
            dVar.f107539r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super C41418c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107538q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f107539r, this.f107541t);
                this.f107538q = 1;
                if (this.f107540s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$special$$inlined$transform$2", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC41417b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107547q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107548r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f107549s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f107550t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC41417b> f107551b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f107552c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$special$$inlined$transform$2$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.brandspace.beduin_v2.b$e$a$a, reason: collision with other inner class name */
            public static final class C3213a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f107553q;

                /* renamed from: r, reason: collision with root package name */
                public int f107554r;

                public C3213a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f107553q = obj;
                    this.f107554r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f107552c = bVar;
                this.f107551b = interfaceC43172j;
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
                    boolean r0 = r7 instanceof com.avito.android.brandspace.beduin_v2.b.e.a.C3213a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.brandspace.beduin_v2.b$e$a$a r0 = (com.avito.android.brandspace.beduin_v2.b.e.a.C3213a) r0
                    int r1 = r0.f107554r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f107554r = r1
                    goto L18
                L13:
                    com.avito.android.brandspace.beduin_v2.b$e$a$a r0 = new com.avito.android.brandspace.beduin_v2.b$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f107553q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f107554r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L58
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    ik.b r6 = (ik.InterfaceC41417b) r6
                    boolean r7 = r6 instanceof ik.InterfaceC41417b.a
                    if (r7 == 0) goto L58
                    com.avito.android.brandspace.beduin_v2.b r7 = r5.f107552c
                    kotlin.C r2 = r7.f107525P
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    ik.b$a r6 = (ik.InterfaceC41417b.a) r6
                    java.lang.String r6 = r6.f398708a
                    ZS.b r7 = r7.f107521L
                    r4.<init>(r6, r7)
                    r0.f107554r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L58
                    return r1
                L58:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.brandspace.beduin_v2.b.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC43160i interfaceC43160i, Continuation continuation, b bVar) {
            super(2, continuation);
            this.f107549s = interfaceC43160i;
            this.f107550t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f107549s, continuation, this.f107550t);
            eVar.f107548r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC41417b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107547q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f107548r, this.f107550t);
                this.f107547q = 1;
                if (this.f107549s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: BrandspaceBeduinV2ViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lik/c;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lik/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$state$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<C41418c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f107556q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f107556q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(C41418c c41418c, Continuation<? super G0> continuation) {
            return ((f) create(c41418c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C41418c.a aVar = ((C41418c) this.f107556q).f398711b;
            if (!(aVar instanceof C41418c.a.C11391a) && (aVar instanceof C41418c.a.b)) {
                b bVar = b.this;
                N0 n02 = bVar.f107528S;
                if (n02 != null) {
                    ((V0) n02).c(null);
                }
                bVar.f107528S = C43259k.d(androidx.view.N0.a(bVar), null, null, new com.avito.android.brandspace.beduin_v2.c(bVar, null), 3);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k com.avito.android.brandspace.beduin_v2.mvi.d dVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<h> set, @Y61.k aU0.b bVar, @Y61.k ZS.b bVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k x xVar) {
        this.f107518E = b12;
        this.f107519J = set;
        this.f107520K = bVar;
        this.f107521L = bVar2;
        this.f107522M = aVar2;
        this.f107523N = xVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new c(dVar, this));
        this.f107524O = interfaceC42726CC;
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new C3211b(aVar, this));
        this.f107525P = interfaceC42726CC2;
        m mVarN = C43175k.N(new C43197r1(new f(null), (com.avito.android.arch.mvi.c) interfaceC42726CC.getValue()), C43175k.G(new d(C43175k.t((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC2.getValue(), 1), null, this)));
        A1.a aVarA = androidx.view.N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        C41418c.f398709c.getClass();
        this.f107529T = C43175k.U(mVarN, aVarA, i2Var, C41418c.f398710d);
        this.f107530U = C43175k.G(new e(((com.avito.android.arch.mvi.c) interfaceC42726CC.getValue()).f91928q, null, this));
    }

    public static final void le(b bVar, List list) {
        bVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.a.a(bVar.f107522M, bVar.f107523N.b((String) it.next()), null, null, 6);
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC41417b> getEvents() {
        return this.f107530U;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C41418c> getState() {
        return this.f107529T;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC41416a interfaceC41416a) {
        if (interfaceC41416a instanceof InterfaceC41416a.C11390a) {
            InterfaceC41416a.C11390a c11390a = (InterfaceC41416a.C11390a) interfaceC41416a;
            this.f107526Q = c11390a.f398705a;
            this.f107527R = c11390a.f398706b;
            C43259k.d(androidx.view.N0.a(this), null, null, new a(interfaceC41416a, null), 3);
        }
    }
}
