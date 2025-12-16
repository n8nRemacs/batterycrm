package com.avito.android.comfortable_deal.end_deal;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.comfortable_deal.end_deal.EndDealDialogFragment;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/comfortable_deal/end_deal/model/EndDealResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal.end_deal.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29474d extends kotlin.jvm.internal.N implements Y41.l<EndDealResult, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealDialogFragment f122160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EndDealDialogFragment.d f122161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29474d(EndDealDialogFragment endDealDialogFragment, EndDealDialogFragment.d dVar) {
        super(1);
        this.f122160l = endDealDialogFragment;
        this.f122161m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(EndDealResult endDealResult) {
        EndDealResult endDealResult2 = endDealResult;
        EndDealDialogFragment.a aVar = EndDealDialogFragment.f122033p0;
        EndDealDialogFragment endDealDialogFragment = this.f122160l;
        FragmentManager parentFragmentManager = endDealDialogFragment.getParentFragmentManager();
        String str = ((EndDealArguments) endDealDialogFragment.f122040n0.getValue()).f122241c;
        Bundle bundle = new Bundle();
        bundle.putParcelable("result.key", endDealResult2);
        G0 g02 = G0.f406611a;
        parentFragmentManager.o0(bundle, str);
        if (endDealResult2.f122277b == StagesTransitionResultStrategy.f122959b) {
            endDealDialogFragment.getParentFragmentManager().o0(Bundle.EMPTY, "reload_clients_list_request");
        }
        this.f122161m.dismiss();
        return G0.f406611a;
    }
}
