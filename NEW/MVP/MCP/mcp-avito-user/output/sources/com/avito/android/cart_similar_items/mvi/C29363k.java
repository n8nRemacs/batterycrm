package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_snippet_actions.a;
import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mn.C44104d;
import mn.InterfaceC44105e;

/* compiled from: CartSimilarItemsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lmn/e;", "actions", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$logQuantityChanges$3", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cart_similar_items.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29363k extends SuspendLambda implements Y41.p<List<InterfaceC44105e>, Continuation<? super InterfaceC43160i<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f116076q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f116077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29353a f116078s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C44104d> f116079t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29363k(ArrayList arrayList, C29353a c29353a, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f116077r = arrayList;
        this.f116078s = c29353a;
        this.f116079t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29363k c29363k = new C29363k(this.f116077r, this.f116078s, this.f116079t, continuation);
        c29363k.f116076q = obj;
        return c29363k;
    }

    @Override // Y41.p
    public final Object invoke(List<InterfaceC44105e> list, Continuation<? super InterfaceC43160i<? extends G0>> continuation) {
        return ((C29363k) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List<InterfaceC44105e> list = (List) this.f116076q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC44105e interfaceC44105e : list) {
            String f414677a = interfaceC44105e.getF414677a();
            Object objR = linkedHashMap.get(f414677a);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, f414677a);
            }
            ((List) objR).add(new CartItemQuantityChange.Default(interfaceC44105e.getF414677a(), interfaceC44105e.getF414678b(), interfaceC44105e.getF414679c(), interfaceC44105e.getF414680d()));
        }
        this.f116077r.clear();
        C29353a c29353a = this.f116078s;
        com.avito.android.cart_snippet_actions.a aVar = c29353a.f115979e;
        FromPage fromPage = FromPage.f115331f;
        String str = this.f116079t.invoke().f414706b;
        if (str == null) {
            str = c29353a.f115982h.f115928f;
        }
        a.C3391a.a(aVar, linkedHashMap, fromPage, str, false, null, 48);
        return new C43210w(G0.f406611a);
    }
}
