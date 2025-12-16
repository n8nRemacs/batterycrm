package com.avito.android.cart_snippet_actions.feature;

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

/* compiled from: CartSnippetActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Ltn/f;", "actions", "Lkotlinx/coroutines/flow/i;", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$logQuantityChanges$3", f = "CartSnippetActionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<List<tn.f>, Continuation<? super InterfaceC43160i<? extends G0>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f116219q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f116220r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f116221s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<tn.d> f116222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ArrayList arrayList, k kVar, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f116220r = arrayList;
        this.f116221s = kVar;
        this.f116222t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f116220r, this.f116221s, this.f116222t, continuation);
        jVar.f116219q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(List<tn.f> list, Continuation<? super InterfaceC43160i<? extends G0>> continuation) {
        return ((j) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List<tn.f> list = (List) this.f116219q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (tn.f fVar : list) {
            String f439413a = fVar.getF439413a();
            Object objR = linkedHashMap.get(f439413a);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, f439413a);
            }
            ((List) objR).add(new CartItemQuantityChange.WithPosition(fVar.getF439413a(), fVar.getF439414b(), fVar.getF439415c(), fVar.getF439416d(), fVar.getF439417e()));
        }
        this.f116220r.clear();
        k kVar = this.f116221s;
        kVar.f116224b.a(linkedHashMap, kVar.f116228f, null, false, kVar.f116229g, this.f116222t.invoke().f439437f);
        return new C43210w(G0.f406611a);
    }
}
