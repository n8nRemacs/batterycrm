package hl;

import Y61.k;
import Y61.l;
import com.avito.android.active_orders.adapter.HomeActiveOrdersItem;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40954b implements InterfaceC43160i<HomeActiveOrdersItem> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f397384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C40953a f397385c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hl.b$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f397386b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C40953a f397387c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.activeOrders.ObserveActiveOrdersUpdatesUseCase$invoke$$inlined$map$1$2", f = "ObserveActiveOrdersUpdatesUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: hl.b$a$a, reason: collision with other inner class name */
        public static final class C11274a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f397388q;

            /* renamed from: r, reason: collision with root package name */
            public int f397389r;

            public C11274a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f397388q = obj;
                this.f397389r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C40953a c40953a) {
            this.f397386b = interfaceC43172j;
            this.f397387c = c40953a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r22, @Y61.k kotlin.coroutines.Continuation r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r23
                boolean r2 = r1 instanceof hl.C40954b.a.C11274a
                if (r2 == 0) goto L17
                r2 = r1
                hl.b$a$a r2 = (hl.C40954b.a.C11274a) r2
                int r3 = r2.f397389r
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f397389r = r3
                goto L1c
            L17:
                hl.b$a$a r2 = new hl.b$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f397388q
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r2.f397389r
                r5 = 1
                if (r4 == 0) goto L36
                if (r4 != r5) goto L2e
                kotlin.C42729a0.b(r1)
                goto Ld6
            L2e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L36:
                kotlin.C42729a0.b(r1)
                r1 = r22
                com.avito.android.activeOrders.OrdersNeedActionResponse r1 = (com.avito.android.activeOrders.OrdersNeedActionResponse) r1
                java.util.List r4 = r1.getItems()
                if (r4 == 0) goto Lae
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = kotlin.collections.C42745f0.q(r4, r7)
                r6.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
            L54:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto Laf
                java.lang.Object r7 = r4.next()
                com.avito.android.activeOrders.Item r7 = (com.avito.android.activeOrders.Item) r7
                com.avito.android.activeOrders.ItemContent r8 = r7.getContent()
                com.avito.android.remote.model.safedeal.BxActiveOrderItem r9 = new com.avito.android.remote.model.safedeal.BxActiveOrderItem
                com.avito.android.activeOrders.ItemType r7 = r7.getType()
                int[] r10 = hl.C40953a.C11273a.f397383a
                int r7 = r7.ordinal()
                r7 = r10[r7]
                if (r7 == r5) goto L80
                r10 = 2
                if (r7 != r10) goto L7a
                com.avito.android.remote.model.safedeal.BxActiveOrderItem$ItemType r7 = com.avito.android.remote.model.safedeal.BxActiveOrderItem.ItemType.SHOW_ALL
                goto L82
            L7a:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L80:
                com.avito.android.remote.model.safedeal.BxActiveOrderItem$ItemType r7 = com.avito.android.remote.model.safedeal.BxActiveOrderItem.ItemType.GOODS_ORDER
            L82:
                java.lang.String r11 = r8.getTitle()
                com.avito.android.remote.model.text.AttributedText r12 = r8.getSubtitle()
                com.avito.android.deep_linking.links.DeepLink r13 = r8.getOnTapDeepLink()
                java.lang.Boolean r15 = r8.getIsMultipleItems()
                com.avito.android.remote.model.Image r17 = r8.getImage()
                java.lang.String r20 = r8.getAttentionBadgeText()
                com.avito.android.remote.model.safedeal.BxActiveOrderItem$ItemContent r8 = new com.avito.android.remote.model.safedeal.BxActiveOrderItem$ItemContent
                r14 = 0
                r16 = 0
                r18 = 0
                r19 = 0
                r10 = r8
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r9.<init>(r7, r8)
                r6.add(r9)
                goto L54
            Lae:
                r6 = 0
            Laf:
                hl.a r4 = r0.f397387c
                I3.a r4 = r4.f397380c
                com.avito.android.remote.model.safedeal.BxActiveOrdersWidget r14 = new com.avito.android.remote.model.safedeal.BxActiveOrdersWidget
                com.avito.android.deep_linking.links.DeepLink r8 = r1.getOnShowDeepLink()
                if (r6 != 0) goto Lbd
                kotlin.collections.z0 r6 = kotlin.collections.C42784z0.f406748b
            Lbd:
                r9 = r6
                r10 = 0
                r11 = 0
                r12 = 12
                r13 = 0
                r7 = r14
                r7.<init>(r8, r9, r10, r11, r12, r13)
                com.avito.android.active_orders.adapter.HomeActiveOrdersItem r1 = r4.a(r14)
                r2.f397389r = r5
                kotlinx.coroutines.flow.j r4 = r0.f397386b
                java.lang.Object r1 = r4.emit(r1, r2)
                if (r1 != r3) goto Ld6
                return r3
            Ld6:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hl.C40954b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C40954b(InterfaceC43160i interfaceC43160i, C40953a c40953a) {
        this.f397384b = interfaceC43160i;
        this.f397385c = c40953a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super HomeActiveOrdersItem> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f397384b.collect(new a(interfaceC43172j, this.f397385c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
