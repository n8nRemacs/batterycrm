package com.avito.android.important_addresses.presentation;

import com.avito.android.important_addresses.presentation.ImportantAddressesState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ImportantAddressesPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$loadImportantAddressesData$3", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class s extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f169686q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f169687r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f169687r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f169687r, continuation);
        sVar.f169686q = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((s) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f169686q;
        m mVar = this.f169687r;
        mVar.f169652g.b(mVar.f169654i.getF169612b(), "block");
        mVar.e(new ImportantAddressesState.Error(mVar.f169654i.getF169612b(), mVar.f169654i.getF169613c(), str));
        return G0.f406611a;
    }
}
