package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ln.C43801b;
import on.C44825a;

/* compiled from: GetSimilarItemsUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/J;", "Lcom/avito/android/cart_similar_items/mvi/I;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f115960a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f115961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f115962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43801b f115963d;

    /* compiled from: GetSimilarItemsUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.GetSimilarItemsUseCaseImpl$invoke$1", f = "GetSimilarItemsUseCase.kt", i = {0, 1}, l = {33, 37, 51}, m = "invokeSuspend", n = {"$this$flow", "data"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C44825a f115964q;

        /* renamed from: r, reason: collision with root package name */
        public int f115965r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f115966s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = J.this.new a(continuation);
            aVar.f115966s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_similar_items.mvi.J.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GetSimilarItemsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.GetSimilarItemsUseCaseImpl$invoke$2", f = "GetSimilarItemsUseCase.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115968q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f115969r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f115970s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f115969r = interfaceC43172j;
            bVar.f115970s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115968q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f115969r;
                CartSimilarItemsInternalAction.HandleError handleError = new CartSimilarItemsInternalAction.HandleError(this.f115970s);
                this.f115969r = null;
                this.f115968q = 1;
                if (interfaceC43172j.emit(handleError, this) == coroutine_suspended) {
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
    public J(@Y61.k C c12, @Y61.k R0 r02, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.k C43801b c43801b) {
        this.f115960a = c12;
        this.f115961b = r02;
        this.f115962c = hVar;
        this.f115963d = c43801b;
    }

    @Override // com.avito.android.cart_similar_items.mvi.I
    @Y61.k
    public final InterfaceC43160i<CartSimilarItemsInternalAction> invoke() {
        return C43175k.I(this.f115961b.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
