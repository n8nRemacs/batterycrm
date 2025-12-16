package xz0;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
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
/* renamed from: xz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50024a implements InterfaceC43160i<StrSellerOrdersInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f442814b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xz0.a$a, reason: collision with other inner class name */
    public static final class C12882a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f442815b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.usecase.LoadBannerUseCase$invoke$$inlined$map$1$2", f = "LoadBannerUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: xz0.a$a$a, reason: collision with other inner class name */
        public static final class C12883a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f442816q;

            /* renamed from: r, reason: collision with root package name */
            public int f442817r;

            public C12883a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f442816q = obj;
                this.f442817r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C12882a.this.emit(null, this);
            }
        }

        public C12882a(InterfaceC43172j interfaceC43172j) {
            this.f442815b = interfaceC43172j;
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
                boolean r0 = r6 instanceof xz0.C50024a.C12882a.C12883a
                if (r0 == 0) goto L13
                r0 = r6
                xz0.a$a$a r0 = (xz0.C50024a.C12882a.C12883a) r0
                int r1 = r0.f442817r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f442817r = r1
                goto L18
            L13:
                xz0.a$a$a r0 = new xz0.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f442816q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f442817r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L5d
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                yF0.a r5 = (yF0.InterfaceC50107a) r5
                boolean r6 = r5 instanceof yF0.InterfaceC50107a.c
                if (r6 == 0) goto L3d
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$BannerLoading r5 = com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction.BannerLoading.f289862b
                goto L52
            L3d:
                boolean r6 = r5 instanceof yF0.InterfaceC50107a.b
                if (r6 == 0) goto L4c
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$BannerLoaded r6 = new com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$BannerLoaded
                yF0.a$b r5 = (yF0.InterfaceC50107a.b) r5
                BF0.a r5 = r5.f443003a
                r6.<init>(r5)
                r5 = r6
                goto L52
            L4c:
                boolean r5 = r5 instanceof yF0.InterfaceC50107a.C12895a
                if (r5 == 0) goto L60
                com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction$BannerLoadingError r5 = com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction.BannerLoadingError.f289863b
            L52:
                r0.f442817r = r3
                kotlinx.coroutines.flow.j r6 = r4.f442815b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L5d
                return r1
            L5d:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L60:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xz0.C50024a.C12882a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C50024a(InterfaceC43160i interfaceC43160i) {
        this.f442814b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f442814b.collect(new C12882a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
