package com.avito.android.seller_room.mvi;

import Vq0.InterfaceC15708a;
import Vq0.b;
import Y41.p;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.seller_room.mvi.entity.SellerRoomInternalAction;
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
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: SellerRoomViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_room/mvi/m;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LVq0/a$d;", "LVq0/c;", "LVq0/b$f;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends M0 implements com.avito.android.arch.mvi.android.k<InterfaceC15708a.d, Vq0.c, b.f> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f268160E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final R0 f268161J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final ZS.b f268162K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final B f268163L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final aU0.b f268164M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268165N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268166O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final n2<Vq0.c> f268167P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final d f268168Q;

    /* compiled from: SellerRoomViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$accept$1", f = "SellerRoomViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268169q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15708a.d f268171s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15708a.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f268171s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return m.this.new a(this.f268171s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268169q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b> cVarLe = m.this.le();
                this.f268169q = 1;
                if (cVarLe.ya(this.f268171s, this) == coroutine_suspended) {
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

    /* compiled from: SellerRoomViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f268172l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ m f268173m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, m mVar) {
            super(0);
            this.f268172l = aVar;
            this.f268173m = mVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f268172l.a(N0.a(this.f268173m));
        }
    }

    /* compiled from: SellerRoomViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LVq0/a;", "Lcom/avito/android/seller_room/mvi/entity/SellerRoomInternalAction;", "LVq0/c;", "LVq0/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f268174l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ m f268175m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, m mVar) {
            super(0);
            this.f268174l = iVar;
            this.f268175m = mVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b> invoke() {
            return this.f268174l.a(null, N0.a(this.f268175m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.m f268176b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f268177b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$filterIsInstance$1$2", f = "SellerRoomViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.seller_room.mvi.m$d$a$a, reason: collision with other inner class name */
            public static final class C8022a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f268178q;

                /* renamed from: r, reason: collision with root package name */
                public int f268179r;

                public C8022a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f268178q = obj;
                    this.f268179r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f268177b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.seller_room.mvi.m.d.a.C8022a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.seller_room.mvi.m$d$a$a r0 = (com.avito.android.seller_room.mvi.m.d.a.C8022a) r0
                    int r1 = r0.f268179r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f268179r = r1
                    goto L18
                L13:
                    com.avito.android.seller_room.mvi.m$d$a$a r0 = new com.avito.android.seller_room.mvi.m$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f268178q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f268179r
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
                    boolean r6 = r5 instanceof Vq0.b.f
                    if (r6 == 0) goto L43
                    r0.f268179r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f268177b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_room.mvi.m.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.internal.m mVar) {
            this.f268176b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f268176b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$1", f = "SellerRoomViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super Vq0.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268181q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f268182r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f268183s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f268184t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Vq0.c> f268185b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f268186c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$1$1", f = "SellerRoomViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.seller_room.mvi.m$e$a$a, reason: collision with other inner class name */
            public static final class C8023a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f268187q;

                /* renamed from: r, reason: collision with root package name */
                public int f268188r;

                public C8023a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f268187q = obj;
                    this.f268188r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, m mVar) {
                this.f268186c = mVar;
                this.f268185b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.seller_room.mvi.m.e.a.C8023a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.seller_room.mvi.m$e$a$a r0 = (com.avito.android.seller_room.mvi.m.e.a.C8023a) r0
                    int r1 = r0.f268188r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f268188r = r1
                    goto L18
                L13:
                    com.avito.android.seller_room.mvi.m$e$a$a r0 = new com.avito.android.seller_room.mvi.m$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f268187q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f268188r
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
                    com.avito.android.seller_room.mvi.m r6 = r4.f268186c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    Vq0.a$e r2 = new Vq0.a$e
                    r2.<init>(r5)
                    r0.f268188r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_room.mvi.m.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, m mVar) {
            super(2, continuation);
            this.f268183s = c43188o0;
            this.f268184t = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f268183s, continuation, this.f268184t);
            eVar.f268182r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vq0.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268181q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f268182r, this.f268184t);
                this.f268181q = 1;
                if (this.f268183s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$2", f = "SellerRoomViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super Vq0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268190q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f268191r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f268192s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f268193t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Vq0.b> f268194b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f268195c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$2$1", f = "SellerRoomViewModel.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.seller_room.mvi.m$f$a$a, reason: collision with other inner class name */
            public static final class C8024a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f268196q;

                /* renamed from: r, reason: collision with root package name */
                public int f268197r;

                public C8024a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f268196q = obj;
                    this.f268197r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, m mVar) {
                this.f268195c = mVar;
                this.f268194b = interfaceC43172j;
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
                    boolean r0 = r7 instanceof com.avito.android.seller_room.mvi.m.f.a.C8024a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.seller_room.mvi.m$f$a$a r0 = (com.avito.android.seller_room.mvi.m.f.a.C8024a) r0
                    int r1 = r0.f268197r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f268197r = r1
                    goto L18
                L13:
                    com.avito.android.seller_room.mvi.m$f$a$a r0 = new com.avito.android.seller_room.mvi.m$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f268196q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f268197r
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
                    Vq0.b r6 = (Vq0.b) r6
                    boolean r7 = r6 instanceof Vq0.b.f
                    if (r7 == 0) goto L49
                    r0.f268197r = r4
                    kotlinx.coroutines.flow.j<Vq0.b> r7 = r5.f268194b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L72
                    return r1
                L49:
                    boolean r7 = r6 instanceof Vq0.b.e
                    if (r7 == 0) goto L72
                    r7 = r6
                    Vq0.b$e r7 = (Vq0.b.e) r7
                    boolean r7 = r7 instanceof Vq0.b.a
                    if (r7 == 0) goto L72
                    com.avito.android.seller_room.mvi.m r7 = r5.f268195c
                    kotlin.C r2 = r7.f268166O
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    Vq0.b$a r6 = (Vq0.b.a) r6
                    java.lang.String r6 = r6.f17415a
                    ZS.b r7 = r7.f268162K
                    r4.<init>(r6, r7)
                    r0.f268197r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_room.mvi.m.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, m mVar) {
            super(2, continuation);
            this.f268192s = interfaceC43160i;
            this.f268193t = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f268192s, continuation, this.f268193t);
            fVar.f268191r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vq0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268190q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f268191r, this.f268193t);
                this.f268190q = 1;
                if (this.f268192s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$3", f = "SellerRoomViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super Vq0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268199q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f268200r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f268201s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f268202t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Vq0.b> f268203b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f268204c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.seller_room.mvi.SellerRoomViewModel$special$$inlined$transform$3$1", f = "SellerRoomViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.seller_room.mvi.m$g$a$a, reason: collision with other inner class name */
            public static final class C8025a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f268205q;

                /* renamed from: r, reason: collision with root package name */
                public int f268206r;

                public C8025a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f268205q = obj;
                    this.f268206r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, m mVar) {
                this.f268204c = mVar;
                this.f268203b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.seller_room.mvi.m.g.a.C8025a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.seller_room.mvi.m$g$a$a r0 = (com.avito.android.seller_room.mvi.m.g.a.C8025a) r0
                    int r1 = r0.f268206r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f268206r = r1
                    goto L18
                L13:
                    com.avito.android.seller_room.mvi.m$g$a$a r0 = new com.avito.android.seller_room.mvi.m$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f268205q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f268206r
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
                    com.avito.android.seller_room.mvi.m r6 = r4.f268204c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    Vq0.a$a r2 = new Vq0.a$a
                    r2.<init>(r5)
                    r0.f268206r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_room.mvi.m.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, m mVar) {
            super(2, continuation);
            this.f268201s = interfaceC43160i;
            this.f268202t = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f268201s, continuation, this.f268202t);
            gVar.f268200r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vq0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268199q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f268200r, this.f268202t);
                this.f268199q = 1;
                if (this.f268201s.collect(aVar, this) == coroutine_suspended) {
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
    public m(@Y61.k i iVar, @Y61.k n.a aVar, @Y61.k Set<FV0.h> set, @Y61.k R0 r02, @Y61.k ZS.b bVar, @Y61.k B b12, @Y61.k aU0.b bVar2) {
        this.f268160E = set;
        this.f268161J = r02;
        this.f268162K = bVar;
        this.f268163L = b12;
        this.f268164M = bVar2;
        this.f268165N = C42727D.c(new c(iVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f268166O = interfaceC42726CC;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        Vq0.c.f17420c.getClass();
        this.f268167P = C43175k.U(mVarN, aVarA, i2Var, Vq0.c.f17421d);
        this.f268168Q = new d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new g(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<b.f> getEvents() {
        return this.f268168Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<Vq0.c> getState() {
        return this.f268167P;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC15708a.d dVar) {
        C43259k.d(N0.a(this), this.f268161J.b(), null, new a(dVar, null), 2);
    }

    public final com.avito.android.arch.mvi.c<InterfaceC15708a, SellerRoomInternalAction, Vq0.c, Vq0.b> le() {
        return (com.avito.android.arch.mvi.c) this.f268165N.getValue();
    }
}
