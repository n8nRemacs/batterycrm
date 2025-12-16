package com.avito.android.cart_snippet_actions.feature;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: CartSnippetActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ltn/f;", "acc", "action", "<anonymous>", "(Ljava/util/List;Ltn/f;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$logQuantityChanges$1", f = "CartSnippetActionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.q<List<tn.f>, tn.f, Continuation<? super List<tn.f>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f116217q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ tn.f f116218r;

    public i() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(List<tn.f> list, tn.f fVar, Continuation<? super List<tn.f>> continuation) {
        i iVar = new i(3, continuation);
        iVar.f116217q = list;
        iVar.f116218r = fVar;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = this.f116217q;
        list.add(this.f116218r);
        return list;
    }
}
