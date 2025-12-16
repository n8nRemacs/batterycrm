package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import android.content.DialogInterface;
import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SpendContactDialogActivity.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f95797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SpendContactDialogActivity f95798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DialogInterface dialogInterface, SpendContactDialogActivity spendContactDialogActivity) {
        super(0);
        this.f95797l = dialogInterface;
        this.f95798m = spendContactDialogActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f95797l.dismiss();
        Intent intent = new Intent();
        SpendContactDialogActivity spendContactDialogActivity = this.f95798m;
        intent.putExtra("key_call_link", spendContactDialogActivity.a2().f95796b.getActionButton().getUri());
        G0 g02 = G0.f406611a;
        spendContactDialogActivity.setResult(-1, intent);
        spendContactDialogActivity.finish();
        return G0.f406611a;
    }
}
