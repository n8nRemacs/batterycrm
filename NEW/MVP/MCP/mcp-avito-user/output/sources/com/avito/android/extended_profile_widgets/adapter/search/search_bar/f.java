package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import oB.z;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_widgets.adapter.search.search_bar.SearchBarItemPresenterImpl$bindView$1$2", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f154749q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f154750r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f154751s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, k kVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f154750r = dVar;
        this.f154751s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f154750r, this.f154751s, continuation);
        fVar.f154749q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((f) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f154749q;
        d dVar = this.f154750r;
        dVar.f154745b.invoke(new z.b.C12171b(str, true));
        this.f154751s.Am();
        return G0.f406611a;
    }
}
