package com.avito.android.mortgage.phone_confirm;

import androidx.core.os.C22777e;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmed;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: PhoneConfirmDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneConfirmDialog f201564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TZ.b f201565m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PhoneConfirmDialog phoneConfirmDialog, TZ.b bVar) {
        super(0);
        this.f201564l = phoneConfirmDialog;
        this.f201565m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f201564l.getParentFragmentManager().o0(C22777e.b(new Q("PHONE_CONFIRM_DIALOG_RESULT", PhoneConfirmed.f201586b)), "PHONE_CONFIRM_DIALOG_KEY");
        this.f201565m.dismiss();
        return G0.f406611a;
    }
}
