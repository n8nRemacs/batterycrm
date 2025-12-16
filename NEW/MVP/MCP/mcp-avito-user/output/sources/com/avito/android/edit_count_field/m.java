package com.avito.android.edit_count_field;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import uy.InterfaceC49125a;

/* compiled from: EditCountFieldView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luy/a$b;", "it", "Lkotlin/G0;", "<anonymous>", "(Luy/a$b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_count_field.EditCountFieldViewImpl$emitActionDone$2", f = "EditCountFieldView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC49125a.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146621q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f146622r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f146622r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f146622r, continuation);
        mVar.f146621q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC49125a.b bVar, Continuation<? super G0> continuation) {
        return ((m) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f146622r.f146660d.invoke((InterfaceC49125a.b) this.f146621q);
        return G0.f406611a;
    }
}
