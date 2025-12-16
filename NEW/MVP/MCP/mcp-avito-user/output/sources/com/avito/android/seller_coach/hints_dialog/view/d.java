package com.avito.android.seller_coach.hints_dialog.view;

import Iq0.C14146c;
import android.content.DialogInterface;
import com.avito.android.remote.model.AdviceDetail;
import com.avito.android.remote.model.MenuAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HintItemsDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f267582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f267583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, DialogInterface dialogInterface) {
        super(0);
        this.f267582l = cVar;
        this.f267583m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdviceDetail adviceDetail;
        int i12 = c.f267553V;
        c cVar = this.f267582l;
        com.avito.android.seller_coach.hints_dialog.vm.a aVarV = cVar.V();
        MenuAction menuActionMe = com.avito.android.seller_coach.hints_dialog.vm.a.me(aVarV.f267596N);
        if (menuActionMe != null && (adviceDetail = aVarV.f267596N) != null) {
            com.avito.android.seller_coach.hints_dialog.vm.a.oe(aVarV, null, menuActionMe.getAction(), 1);
            aVarV.f267593K.c(new C14146c(adviceDetail.getTitle(), adviceDetail.getAdviceId(), aVarV.f267597O, menuActionMe.getButtonText(), com.avito.android.seller_coach.hints_dialog.vm.a.le(adviceDetail)));
        }
        this.f267583m.dismiss();
        cVar.r();
        return G0.f406611a;
    }
}
