package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
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

/* compiled from: CartSnippetActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$itemUpdates$4$1", f = "CartSnippetActionsActor.kt", i = {0, 1, 3, 3, 4, 4, 5, 5, 6, 6}, l = {136, 141, 144, 148, 149, 150, 157, 172}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TrueCartSnippetActionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult f116179q;

    /* renamed from: r, reason: collision with root package name */
    public int f116180r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116181s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f116182t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<C50271a> f116183u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<tn.d> f116184v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116185w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116186x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116187y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, List list, Y41.a aVar, Y41.a aVar2, LinkedHashMap linkedHashMap, Y41.a aVar3, Continuation continuation) {
        super(2, continuation);
        this.f116182t = kVar;
        this.f116183u = list;
        this.f116184v = aVar;
        this.f116185w = aVar2;
        this.f116186x = linkedHashMap;
        this.f116187y = aVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        LinkedHashMap linkedHashMap = this.f116186x;
        e eVar = new e(this.f116182t, this.f116183u, this.f116184v, this.f116185w, linkedHashMap, this.f116187y, continuation);
        eVar.f116181s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TrueCartSnippetActionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[LOOP:0: B:38:0x011d->B:40:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_snippet_actions.feature.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
