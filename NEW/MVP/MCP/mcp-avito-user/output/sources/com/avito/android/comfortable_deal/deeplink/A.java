package com.avito.android.comfortable_deal.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.deal_income_details.DealIncomeDetailsDialog;
import com.avito.android.comfortable_deal.deal_income_details.model.DealIncomeDetailsDialogArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealIncomeDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class A extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DealIncomeDetailsDialogArguments f121841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CommissionDetailsDialogArguments f121842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments, CommissionDetailsDialogArguments commissionDetailsDialogArguments) {
        super(0);
        this.f121841l = dealIncomeDetailsDialogArguments;
        this.f121842m = commissionDetailsDialogArguments;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        DealIncomeDetailsDialog.a aVar = DealIncomeDetailsDialog.f121803m0;
        DealIncomeDetailsDialogArguments dealIncomeDetailsDialogArguments = this.f121841l;
        aVar.getClass();
        return DealIncomeDetailsDialog.a.a(dealIncomeDetailsDialogArguments, this.f121842m);
    }
}
