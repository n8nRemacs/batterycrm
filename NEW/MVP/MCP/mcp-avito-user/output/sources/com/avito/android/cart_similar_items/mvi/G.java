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
import on.C44826b;

/* compiled from: GetNextPageUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/G;", "Lcom/avito/android/cart_similar_items/mvi/F;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f115944a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f115945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f115946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f115947d;

    /* compiled from: GetNextPageUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.GetNextPageUseCaseImpl$invoke$1", f = "GetNextPageUseCase.kt", i = {0, 1, 2}, l = {31, 32, 35, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "data"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C44826b f115948q;

        /* renamed from: r, reason: collision with root package name */
        public int f115949r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f115950s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f115952u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115952u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = G.this.new a(this.f115952u, continuation);
            aVar.f115950s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_similar_items.mvi.G.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GetNextPageUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.GetNextPageUseCaseImpl$invoke$2", f = "GetNextPageUseCase.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f115953q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f115954r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f115955s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f115954r = interfaceC43172j;
            bVar.f115955s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115953q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f115954r;
                CartSimilarItemsInternalAction.PageLoadingError pageLoadingError = new CartSimilarItemsInternalAction.PageLoadingError(this.f115955s);
                this.f115954r = null;
                this.f115953q = 1;
                if (interfaceC43172j.emit(pageLoadingError, this) == coroutine_suspended) {
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
    public G(int i12, @Y61.k C c12, @Y61.k R0 r02, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar) {
        this.f115944a = i12;
        this.f115945b = c12;
        this.f115946c = r02;
        this.f115947d = hVar;
    }

    @Override // com.avito.android.cart_similar_items.mvi.F
    @Y61.k
    public final InterfaceC43160i<CartSimilarItemsInternalAction> a(@Y61.k String str) {
        return C43175k.I(this.f115946c.a(), new C43152f0(C43175k.G(new a(str, null)), new b(3, null)));
    }
}
