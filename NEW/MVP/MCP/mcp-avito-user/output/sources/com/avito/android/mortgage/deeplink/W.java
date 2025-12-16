package com.avito.android.mortgage.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.mortgage.manager_usp.ManagerUspDialogFragment;
import com.avito.android.mortgage.manager_usp.model.ManagerUspArguments;
import kotlin.Metadata;

/* compiled from: MortgageManagerUspDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class W extends kotlin.jvm.internal.N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageManagerUspLink f198779l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(MortgageManagerUspLink mortgageManagerUspLink) {
        super(0);
        this.f198779l = mortgageManagerUspLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        ManagerUspDialogFragment.a aVar = ManagerUspDialogFragment.f200335n0;
        MortgageManagerUspLink mortgageManagerUspLink = this.f198779l;
        ManagerUspArguments managerUspArguments = new ManagerUspArguments(mortgageManagerUspLink.f198745b, mortgageManagerUspLink.f198746c, mortgageManagerUspLink.f198747d);
        aVar.getClass();
        return ManagerUspDialogFragment.a.a(managerUspArguments);
    }
}
