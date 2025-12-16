package com.avito.android.help_center.help_center_request;

import android.view.View;
import com.avito.android.R;
import com.avito.android.help_center.AbstractC30755l;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterRequestPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/help_center/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/help_center/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<AbstractC30755l, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f161808l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(1);
        this.f161808l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC30755l abstractC30755l) {
        AbstractC30755l abstractC30755l2 = abstractC30755l;
        boolean z12 = abstractC30755l2 instanceof AbstractC30755l.b;
        l lVar = this.f161808l;
        if (z12) {
            lVar.e();
        } else if (abstractC30755l2 instanceof AbstractC30755l.a) {
            p pVar = lVar.f161818h;
            if (pVar != null) {
                pVar.f161833d.f304687a.setVisibility(8);
            }
            p pVar2 = lVar.f161818h;
            if (pVar2 != null) {
                View view = pVar2.f161830a;
                L5.b(view.getContext(), view.getContext().getString(R.string.help_center_request_result_message), 0);
            }
            HelpCenterRequestFragment helpCenterRequestFragment = lVar.f161819i;
            if (helpCenterRequestFragment != null) {
                helpCenterRequestFragment.q5();
            }
        } else {
            boolean z13 = abstractC30755l2 instanceof AbstractC30755l.c;
        }
        return G0.f406611a;
    }
}
