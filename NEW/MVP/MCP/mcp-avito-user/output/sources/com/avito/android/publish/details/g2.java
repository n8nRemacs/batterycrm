package com.avito.android.publish.details;

import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.PretendResult;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/PretendResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g2 extends kotlin.jvm.internal.N implements Y41.l<PretendResult, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f234635l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(K1 k12) {
        super(1);
        this.f234635l = k12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(PretendResult pretendResult) {
        PretendResult pretendResult2 = pretendResult;
        K1 k12 = this.f234635l;
        ItemDetailsView itemDetailsView = k12.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.C0();
        }
        ItemDetailsView itemDetailsView2 = k12.f232991n0;
        if (itemDetailsView2 != null) {
            itemDetailsView2.i();
        }
        k12.ne().applyPretendResult(pretendResult2.getErrors());
        if (!pretendResult2.getSuccess()) {
            k12.f232997t0.setValue(new K1.AbstractC33668b.j(k12.f232963L.a(null)));
            k12.e7();
        }
        return kotlin.G0.f406611a;
    }
}
