package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SpendContactDialogActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f95799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SpendContactDialogActivity f95800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogInterface dialogInterface, SpendContactDialogActivity spendContactDialogActivity) {
        super(0);
        this.f95799l = dialogInterface;
        this.f95800m = spendContactDialogActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f95799l.dismiss();
        this.f95800m.finish();
        return G0.f406611a;
    }
}
