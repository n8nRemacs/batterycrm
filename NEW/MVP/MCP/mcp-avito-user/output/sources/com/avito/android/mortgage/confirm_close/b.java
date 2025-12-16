package com.avito.android.mortgage.confirm_close;

import androidx.core.os.C22777e;
import com.avito.android.mortgage.confirm_close.ConfirmCloseDialog;
import com.avito.android.mortgage.confirm_close.model.ConfirmCloseResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmCloseDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfirmCloseDialog f198486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConfirmCloseDialog confirmCloseDialog) {
        super(0);
        this.f198486l = confirmCloseDialog;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ConfirmCloseDialog.a aVar = ConfirmCloseDialog.f198479j0;
        ConfirmCloseDialog confirmCloseDialog = this.f198486l;
        confirmCloseDialog.getParentFragmentManager().o0(C22777e.b(new Q("CONFIRM_CLOSE_RESULT", ConfirmCloseResult.Confirmed.f198500b)), "CONFIRM_CLOSE_REQUEST_KEY");
        confirmCloseDialog.dismiss();
        return G0.f406611a;
    }
}
