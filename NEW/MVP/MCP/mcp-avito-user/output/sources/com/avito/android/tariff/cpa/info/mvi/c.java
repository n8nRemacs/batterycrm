package com.avito.android.tariff.cpa.info.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import bB0.C25490c;
import bB0.InterfaceC25488a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: CpaInfoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LbB0/a;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "LbB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC25488a, CpaInfoInternalAction, C25490c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.info.domain.a f294729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f294730b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.info.mvi.CpaInfoActor$process$$inlined$transform$1", f = "CpaInfoActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CpaInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f294731q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f294732r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f294733s;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff.cpa.info.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C8959a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<CpaInfoInternalAction> f294734b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.tariff.cpa.info.mvi.CpaInfoActor$process$$inlined$transform$1$1", f = "CpaInfoActor.kt", i = {0, 0}, l = {219, 223, 229}, m = "emit", n = {"value", "$this$process_u24lambda_u241"}, s = {"L$0", "L$1"})
            /* renamed from: com.avito.android.tariff.cpa.info.mvi.c$a$a$a, reason: collision with other inner class name */
            public static final class C8960a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f294735q;

                /* renamed from: r, reason: collision with root package name */
                public int f294736r;

                /* renamed from: t, reason: collision with root package name */
                public CpaInfoInternalAction f294738t;

                /* renamed from: u, reason: collision with root package name */
                public InterfaceC43172j f294739u;

                public C8960a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f294735q = obj;
                    this.f294736r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8959a.this.emit(null, this);
                }
            }

            public C8959a(InterfaceC43172j interfaceC43172j) {
                this.f294734b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.tariff.cpa.info.mvi.c.a.C8959a.C8960a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.tariff.cpa.info.mvi.c$a$a$a r0 = (com.avito.android.tariff.cpa.info.mvi.c.a.C8959a.C8960a) r0
                    int r1 = r0.f294736r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f294736r = r1
                    goto L18
                L13:
                    com.avito.android.tariff.cpa.info.mvi.c$a$a$a r0 = new com.avito.android.tariff.cpa.info.mvi.c$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f294735q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f294736r
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r5) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    goto L34
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.C42729a0.b(r8)
                    goto L94
                L38:
                    kotlinx.coroutines.flow.j r7 = r0.f294739u
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction r2 = r0.f294738t
                    kotlin.C42729a0.b(r8)
                    goto L55
                L40:
                    kotlin.C42729a0.b(r8)
                    r2 = r7
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction r2 = (com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction) r2
                    r0.f294738t = r2
                    kotlinx.coroutines.flow.j<com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction> r7 = r6.f294734b
                    r0.f294739u = r7
                    r0.f294736r = r5
                    java.lang.Object r8 = r7.emit(r2, r0)
                    if (r8 != r1) goto L55
                    return r1
                L55:
                    boolean r8 = r2 instanceof com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction.RefillContent
                    r5 = 0
                    if (r8 == 0) goto L76
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillContent r2 = (com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction.RefillContent) r2
                    bC0.f r8 = r2.f294757b
                    com.avito.android.deep_linking.links.DeepLink r8 = r8.getDeeplink()
                    if (r8 == 0) goto L94
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$OpenDeeplink r2 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$OpenDeeplink
                    r2.<init>(r8)
                    r0.f294738t = r5
                    r0.f294739u = r5
                    r0.f294736r = r4
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L94
                    return r1
                L76:
                    boolean r8 = r2 instanceof com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction.RefillError
                    if (r8 == 0) goto L94
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillError r2 = (com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction.RefillError) r2
                    com.avito.android.remote.error.ApiError r8 = r2.f294758b
                    java.lang.String r8 = com.avito.android.error.z.k(r8)
                    com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$ShowErrorRefillMsg r2 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$ShowErrorRefillMsg
                    r2.<init>(r8)
                    r0.f294738t = r5
                    r0.f294739u = r5
                    r0.f294736r = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L94
                    return r1
                L94:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.mvi.c.a.C8959a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, Continuation continuation) {
            super(2, continuation);
            this.f294733s = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f294733s, continuation);
            aVar.f294732r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CpaInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f294731q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C8959a c8959a = new C8959a((InterfaceC43172j) this.f294732r);
                this.f294731q = 1;
                if (this.f294733s.collect(c8959a, this) == coroutine_suspended) {
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
    public c(@Y61.k com.avito.android.tariff.cpa.info.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f294729a = aVar;
        this.f294730b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new b(new com.avito.android.tariff.cpa.info.mvi.a(y.a(this.f294730b.d9())), null, aVar, this)), com.avito.android.arch.mvi.utils.h.e(c43197r1, d.f294740l, new e(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CpaInfoInternalAction> b(@Y61.k InterfaceC25488a interfaceC25488a, @Y61.k C25490c c25490c) {
        C43210w c43210w;
        if (interfaceC25488a instanceof InterfaceC25488a.C1995a) {
            return new C43210w(CpaInfoInternalAction.CloseScreen.f294743b);
        }
        boolean z12 = true;
        boolean z13 = interfaceC25488a instanceof InterfaceC25488a.f ? true : interfaceC25488a instanceof InterfaceC25488a.e;
        com.avito.android.tariff.cpa.info.domain.a aVar = this.f294729a;
        if (z13) {
            if (c25490c.f57003g) {
                return C43175k.w();
            }
            if (!c25490c.f57004h && !c25490c.f57005i) {
                z12 = false;
            }
            return aVar.b(z12);
        }
        if (interfaceC25488a instanceof InterfaceC25488a.d) {
            c43210w = new C43210w(new CpaInfoInternalAction.InputChange(((InterfaceC25488a.d) interfaceC25488a).f56983a));
        } else {
            if (interfaceC25488a instanceof InterfaceC25488a.g) {
                return C43175k.G(new a(aVar.a(((InterfaceC25488a.g) interfaceC25488a).f56986a), null));
            }
            if (interfaceC25488a instanceof InterfaceC25488a.c) {
                c43210w = new C43210w(new CpaInfoInternalAction.OpenDeeplink(((InterfaceC25488a.c) interfaceC25488a).f56982a));
            } else {
                if (!(interfaceC25488a instanceof InterfaceC25488a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new CpaInfoInternalAction.OpenDialog(((InterfaceC25488a.b) interfaceC25488a).f56981a));
            }
        }
        return c43210w;
    }
}
