package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import Y41.p;
import android.content.DialogInterface;
import android.view.View;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SpendContactDialogActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SpendContactDialogActivity f95802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f95803m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SpendContactDialogActivity spendContactDialogActivity, View view) {
        super(2);
        this.f95802l = spendContactDialogActivity;
        this.f95803m = view;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        SpendContactDialogActivity spendContactDialogActivity = this.f95802l;
        bVar2.setTitle(spendContactDialogActivity.a2().f95796b.getTitle());
        bVar2.setSubtitle(spendContactDialogActivity.a2().f95796b.getSubtitle());
        bVar2.setCustomView(this.f95803m);
        bVar2.P3(com.avito.android.lib.design.modal.c.f179719l);
        bVar2.setButtonsOrientation(1);
        bVar2.L3(spendContactDialogActivity.a2().f95796b.getActionButton().getTitle(), new a(dialogInterface2, spendContactDialogActivity));
        bVar2.M3(spendContactDialogActivity.a2().f95796b.getCancelButton().getTitle(), new b(dialogInterface2, spendContactDialogActivity));
        bVar2.b(new c(spendContactDialogActivity));
        return G0.f406611a;
    }
}
