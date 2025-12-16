package com.avito.android.str_seller_orders.orders_buyer.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nz0.C44494a;
import pz0.C47173d;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements InterfaceC43160i<StrOrdersBuyerInternalAction.ShowContent> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43137a0 f288968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C44494a f288969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C47173d f288970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f288971e;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f288972b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C44494a f288973c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C47173d f288974d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f288975e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_seller_orders.orders_buyer.domain.LoadBuyerOrdersUseCaseImpl$invoke$$inlined$map$2$2", f = "LoadBuyerOrdersUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_seller_orders.orders_buyer.domain.c$a$a, reason: collision with other inner class name */
        public static final class C8700a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f288976q;

            /* renamed from: r, reason: collision with root package name */
            public int f288977r;

            public C8700a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f288976q = obj;
                this.f288977r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C44494a c44494a, C47173d c47173d, f fVar) {
            this.f288972b = interfaceC43172j;
            this.f288973c = c44494a;
            this.f288974d = c47173d;
            this.f288975e = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r19, @Y61.k kotlin.coroutines.Continuation r20) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders.orders_buyer.domain.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public c(C43137a0 c43137a0, C44494a c44494a, C47173d c47173d, f fVar) {
        this.f288968b = c43137a0;
        this.f288969c = c44494a;
        this.f288970d = c47173d;
        this.f288971e = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super StrOrdersBuyerInternalAction.ShowContent> interfaceC43172j, @k Continuation continuation) throws Throwable {
        Object objCollect = this.f288968b.collect(new a(interfaceC43172j, this.f288969c, this.f288970d, this.f288971e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
