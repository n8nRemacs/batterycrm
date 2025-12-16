package com.avito.android.seller_promotions.mvi;

import Oq0.InterfaceC14727a;
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

/* compiled from: SellerPromotionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "LOq0/a;", "actions", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$logQuantityChanges$3", f = "SellerPromotionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements Y41.p<List<InterfaceC14727a>, Continuation<? super InterfaceC43160i<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f268009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f268010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34670a f268011s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Oq0.g> f268012t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ArrayList arrayList, C34670a c34670a, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f268010r = arrayList;
        this.f268011s = c34670a;
        this.f268012t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f268010r, this.f268011s, this.f268012t, continuation);
        jVar.f268009q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(List<InterfaceC14727a> list, Continuation<? super InterfaceC43160i<? extends G0>> continuation) {
        return ((j) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List<InterfaceC14727a> list = (List) this.f268009q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC14727a interfaceC14727a : list) {
            String f12579a = interfaceC14727a.getF12579a();
            Object objR = linkedHashMap.get(f12579a);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, f12579a);
            }
            ((List) objR).add(new CartItemQuantityChange.Default(interfaceC14727a.getF12579a(), interfaceC14727a.getF12580b(), interfaceC14727a.getF12581c(), interfaceC14727a.getF12582d()));
        }
        this.f268010r.clear();
        a.C3391a.a(this.f268011s.f267933h, linkedHashMap, FromPage.f115330e, this.f268012t.invoke().f12616b, true, null, 48);
        return new C43210w(G0.f406611a);
    }
}
