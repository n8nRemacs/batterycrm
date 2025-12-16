package com.avito.android.related_products.bottom_sheet;

import androidx.view.M0;
import androidx.view.N0;
import cj0.C27210c;
import cj0.InterfaceC27208a;
import cj0.InterfaceC27209b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: RelatedProductsBottomSheetViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/p;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "Lcj0/a;", "Lcj0/c;", "Lcj0/b$e;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends M0 implements com.avito.android.arch.mvi.android.k<InterfaceC27208a, C27210c, InterfaceC27209b.e> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f252938E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f252939J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final R0 f252940K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ZS.b f252941L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final aU0.b f252942M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f252943N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f252944O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final n2<C27210c> f252945P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final d f252946Q;

    /* compiled from: RelatedProductsBottomSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f252947l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f252948m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n.a aVar, p pVar) {
            super(0);
            this.f252947l = aVar;
            this.f252948m = pVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f252947l.a(N0.a(this.f252948m));
        }
    }

    /* compiled from: RelatedProductsBottomSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "Lcj0/a;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcj0/c;", "Lcj0/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.related_products.bottom_sheet.mvi.f f252949l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f252950m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.related_products.bottom_sheet.mvi.f fVar, p pVar) {
            super(0);
            this.f252949l = fVar;
            this.f252950m = pVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b> invoke() {
            return this.f252949l.a(null, N0.a(this.f252950m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<AbstractC40048c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.beduin_v2.feature.mvi.x f252951b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f252952b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$filter$1$2", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.p$c$a$a, reason: collision with other inner class name */
            public static final class C7601a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252953q;

                /* renamed from: r, reason: collision with root package name */
                public int f252954r;

                public C7601a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252953q = obj;
                    this.f252954r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f252952b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.related_products.bottom_sheet.p.c.a.C7601a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.related_products.bottom_sheet.p$c$a$a r0 = (com.avito.android.related_products.bottom_sheet.p.c.a.C7601a) r0
                    int r1 = r0.f252954r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252954r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.p$c$a$a r0 = new com.avito.android.related_products.bottom_sheet.p$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252953q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252954r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    eT.c r6 = (kotlin.AbstractC40048c) r6
                    boolean r6 = r6 instanceof kotlin.AbstractC40048c.C11084c
                    if (r6 != 0) goto L46
                    r0.f252954r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f252952b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.p.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(com.avito.android.lib.beduin_v2.feature.mvi.x xVar) {
            this.f252951b = xVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super AbstractC40048c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f252951b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.m f252956b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f252957b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$filterIsInstance$1$2", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.p$d$a$a, reason: collision with other inner class name */
            public static final class C7602a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252958q;

                /* renamed from: r, reason: collision with root package name */
                public int f252959r;

                public C7602a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252958q = obj;
                    this.f252959r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f252957b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.related_products.bottom_sheet.p.d.a.C7602a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.related_products.bottom_sheet.p$d$a$a r0 = (com.avito.android.related_products.bottom_sheet.p.d.a.C7602a) r0
                    int r1 = r0.f252959r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252959r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.p$d$a$a r0 = new com.avito.android.related_products.bottom_sheet.p$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252958q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252959r
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
                    boolean r6 = r5 instanceof cj0.InterfaceC27209b.e
                    if (r6 == 0) goto L43
                    r0.f252959r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f252957b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.p.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.internal.m mVar) {
            this.f252956b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f252956b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$1", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super C27210c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252961q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252962r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f252963s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p f252964t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<C27210c> f252965b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f252966c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$1$1", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.p$e$a$a, reason: collision with other inner class name */
            public static final class C7603a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252967q;

                /* renamed from: r, reason: collision with root package name */
                public int f252968r;

                public C7603a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252967q = obj;
                    this.f252968r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, p pVar) {
                this.f252966c = pVar;
                this.f252965b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.related_products.bottom_sheet.p.e.a.C7603a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.related_products.bottom_sheet.p$e$a$a r0 = (com.avito.android.related_products.bottom_sheet.p.e.a.C7603a) r0
                    int r1 = r0.f252968r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252968r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.p$e$a$a r0 = new com.avito.android.related_products.bottom_sheet.p$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252967q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252968r
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
                    com.avito.android.related_products.bottom_sheet.p r6 = r4.f252966c
                    com.avito.android.arch.mvi.c r6 = r6.ke()
                    cj0.a$b r2 = new cj0.a$b
                    r2.<init>(r5)
                    r0.f252968r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.p.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c cVar, Continuation continuation, p pVar) {
            super(2, continuation);
            this.f252963s = cVar;
            this.f252964t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f252963s, continuation, this.f252964t);
            eVar.f252962r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super C27210c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252961q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f252962r, this.f252964t);
                this.f252961q = 1;
                if (this.f252963s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$2", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC27209b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252970q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252971r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f252972s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p f252973t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC27209b> f252974b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f252975c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$2$1", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.p$f$a$a, reason: collision with other inner class name */
            public static final class C7604a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252976q;

                /* renamed from: r, reason: collision with root package name */
                public int f252977r;

                public C7604a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252976q = obj;
                    this.f252977r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, p pVar) {
                this.f252975c = pVar;
                this.f252974b = interfaceC43172j;
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
                    boolean r0 = r7 instanceof com.avito.android.related_products.bottom_sheet.p.f.a.C7604a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.related_products.bottom_sheet.p$f$a$a r0 = (com.avito.android.related_products.bottom_sheet.p.f.a.C7604a) r0
                    int r1 = r0.f252977r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252977r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.p$f$a$a r0 = new com.avito.android.related_products.bottom_sheet.p$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f252976q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252977r
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
                    cj0.b r6 = (cj0.InterfaceC27209b) r6
                    boolean r7 = r6 instanceof cj0.InterfaceC27209b.e
                    if (r7 == 0) goto L49
                    r0.f252977r = r4
                    kotlinx.coroutines.flow.j<cj0.b> r7 = r5.f252974b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L72
                    return r1
                L49:
                    boolean r7 = r6 instanceof cj0.InterfaceC27209b.d
                    if (r7 == 0) goto L72
                    r7 = r6
                    cj0.b$d r7 = (cj0.InterfaceC27209b.d) r7
                    boolean r7 = r7 instanceof cj0.InterfaceC27209b.a
                    if (r7 == 0) goto L72
                    com.avito.android.related_products.bottom_sheet.p r7 = r5.f252975c
                    kotlin.C r2 = r7.f252944O
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    cj0.b$a r6 = (cj0.InterfaceC27209b.a) r6
                    java.lang.String r6 = r6.f58112a
                    ZS.b r7 = r7.f252941L
                    r4.<init>(r6, r7)
                    r0.f252977r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.p.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, p pVar) {
            super(2, continuation);
            this.f252972s = interfaceC43160i;
            this.f252973t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f252972s, continuation, this.f252973t);
            fVar.f252971r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC27209b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252970q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f252971r, this.f252973t);
                this.f252970q = 1;
                if (this.f252972s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$3", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC27209b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252979q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252980r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f252981s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p f252982t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC27209b> f252983b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f252984c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetViewModel$special$$inlined$transform$3$1", f = "RelatedProductsBottomSheetViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.p$g$a$a, reason: collision with other inner class name */
            public static final class C7605a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252985q;

                /* renamed from: r, reason: collision with root package name */
                public int f252986r;

                public C7605a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f252985q = obj;
                    this.f252986r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, p pVar) {
                this.f252984c = pVar;
                this.f252983b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.related_products.bottom_sheet.p.g.a.C7605a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.related_products.bottom_sheet.p$g$a$a r0 = (com.avito.android.related_products.bottom_sheet.p.g.a.C7605a) r0
                    int r1 = r0.f252986r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252986r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.p$g$a$a r0 = new com.avito.android.related_products.bottom_sheet.p$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252985q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252986r
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
                    com.avito.android.related_products.bottom_sheet.p r6 = r4.f252984c
                    com.avito.android.arch.mvi.c r6 = r6.ke()
                    cj0.a$a r2 = new cj0.a$a
                    r2.<init>(r5)
                    r0.f252986r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.p.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, p pVar) {
            super(2, continuation);
            this.f252981s = interfaceC43160i;
            this.f252982t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f252981s, continuation, this.f252982t);
            gVar.f252980r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC27209b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252979q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f252980r, this.f252982t);
                this.f252979q = 1;
                if (this.f252981s.collect(aVar, this) == coroutine_suspended) {
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
    public p(@Y61.k com.avito.android.related_products.bottom_sheet.mvi.f fVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<FV0.h> set, @Y61.k R0 r02, @Y61.k ZS.b bVar, @Y61.k aU0.b bVar2) {
        this.f252938E = b12;
        this.f252939J = set;
        this.f252940K = r02;
        this.f252941L = bVar;
        this.f252942M = bVar2;
        this.f252943N = C42727D.c(new b(fVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a(aVar, this));
        this.f252944O = interfaceC42726CC;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(ke(), C43175k.G(new e(new c((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        C27210c.f58116c.getClass();
        this.f252945P = C43175k.U(mVarN, aVarA, i2Var, C27210c.f58117d);
        this.f252946Q = new d(C43175k.N(C43175k.G(new f(ke().f91928q, null, this)), C43175k.G(new g(((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(N0.a(this), this.f252940K.b(), null, new o(this, (InterfaceC27208a) obj, null), 2);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC27209b.e> getEvents() {
        return this.f252946Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C27210c> getState() {
        return this.f252945P;
    }

    public final com.avito.android.arch.mvi.c<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c, InterfaceC27209b> ke() {
        return (com.avito.android.arch.mvi.c) this.f252943N.getValue();
    }
}
