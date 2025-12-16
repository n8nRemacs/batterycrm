package com.avito.android.installments.form;

import WN.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsFormActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsFormActivity f172611l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InstallmentsFormActivity installmentsFormActivity) {
        super(0);
        this.f172611l = installmentsFormActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InstallmentsFormActivity installmentsFormActivity = this.f172611l;
        com.avito.android.lib.design.modal.a aVar = installmentsFormActivity.f172587v;
        if (aVar != null) {
            aVar.dismiss();
        }
        installmentsFormActivity.c2().accept(a.e.f17895a);
        return G0.f406611a;
    }
}
