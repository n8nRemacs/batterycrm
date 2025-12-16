package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import Y41.p;
import com.avito.android.R;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import oB.z;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_widgets.adapter.search.search_bar.SearchBarItemPresenterImpl$bindView$1$1", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f154747q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f154748r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f154748r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f154748r, continuation);
        eVar.f154747q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((e) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Integer num = (Integer) this.f154747q;
        if (num != null && num.intValue() == R.id.menu_clarify) {
            this.f154748r.f154745b.invoke(z.b.a.f419542b);
        }
        return G0.f406611a;
    }
}
