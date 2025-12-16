package com.avito.android.important_addresses.presentation;

import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ImportantAddressesPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;", "result", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses.presentation.ImportantAddressesPresenterImpl$loadImportantAddressesData$2", f = "ImportantAddressesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class r extends SuspendLambda implements Y41.p<ImportantAddressesData, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f169683q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f169684r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f169685s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z12, m mVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f169684r = z12;
        this.f169685s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f169684r, this.f169685s, continuation);
        rVar.f169683q = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(ImportantAddressesData importantAddressesData, Continuation<? super G0> continuation) {
        return ((r) create(importantAddressesData, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ImportantAddressesData importantAddressesData = (ImportantAddressesData) this.f169683q;
        boolean z12 = this.f169684r;
        m mVar = this.f169685s;
        if (z12) {
            mVar.f169652g.a(mVar.f169654i.getF169612b(), importantAddressesData.getAnalyticsType());
        }
        mVar.e(m.d(mVar, importantAddressesData));
        m.b(mVar);
        return G0.f406611a;
    }
}
