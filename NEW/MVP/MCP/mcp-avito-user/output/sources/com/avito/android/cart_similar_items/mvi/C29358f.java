package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.remote.model.TypedResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yn.C50271a;

/* compiled from: CartSimilarItemsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$itemUpdates$4$1", f = "CartSimilarItemsActor.kt", i = {0, 1, 2, 2, 4, 4, 5, 5}, l = {231, 232, 233, 238, 242, 243, 253}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.cart_similar_items.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29358f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSimilarItemsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult f116054q;

    /* renamed from: r, reason: collision with root package name */
    public int f116055r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116056s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29353a f116057t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<C50271a> f116058u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116059v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116060w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116061x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29358f(C29353a c29353a, List list, Y41.a aVar, LinkedHashMap linkedHashMap, Y41.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f116057t = c29353a;
        this.f116058u = list;
        this.f116059v = aVar;
        this.f116060w = linkedHashMap;
        this.f116061x = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        LinkedHashMap linkedHashMap = this.f116060w;
        C29358f c29358f = new C29358f(this.f116057t, this.f116058u, this.f116059v, linkedHashMap, this.f116061x, continuation);
        c29358f.f116056s = obj;
        return c29358f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CartSimilarItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29358f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_similar_items.mvi.C29358f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
