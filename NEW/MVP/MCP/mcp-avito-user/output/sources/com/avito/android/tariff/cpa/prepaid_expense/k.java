package com.avito.android.tariff.cpa.prepaid_expense;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublicationAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff.cpa.prepaid_expense.ui.a f295058l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PublicationAdvanceFragment f295059m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.android.tariff.cpa.prepaid_expense.ui.a aVar, PublicationAdvanceFragment publicationAdvanceFragment) {
        super(2);
        this.f295058l = aVar;
        this.f295059m = publicationAdvanceFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        com.avito.android.tariff.cpa.prepaid_expense.ui.a aVar = this.f295058l;
        bVar2.setTitle(aVar.f295062a);
        bVar2.setButtonsOrientation(1);
        bVar2.setSubtitle(aVar.f295063b);
        bVar2.L3(aVar.f295064c.getTitle(), new i(this.f295059m, dialogInterface2));
        ButtonAction buttonAction = aVar.f295065d;
        if (buttonAction != null) {
            bVar2.M3(buttonAction.getTitle(), new j(dialogInterface2));
        }
        return G0.f406611a;
    }
}
