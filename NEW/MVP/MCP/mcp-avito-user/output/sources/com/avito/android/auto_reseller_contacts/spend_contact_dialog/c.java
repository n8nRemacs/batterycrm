package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import Y41.l;
import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SpendContactDialogActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SpendContactDialogActivity f95801l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SpendContactDialogActivity spendContactDialogActivity) {
        super(1);
        this.f95801l = spendContactDialogActivity;
    }

    @Override // Y41.l
    public final G0 invoke(DialogInterface dialogInterface) {
        this.f95801l.finish();
        return G0.f406611a;
    }
}
