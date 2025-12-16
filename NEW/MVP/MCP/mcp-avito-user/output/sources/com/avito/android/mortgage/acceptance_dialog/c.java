package com.avito.android.mortgage.acceptance_dialog;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.mortgage.acceptance_dialog.AcceptanceDialog;
import com.avito.android.mortgage.acceptance_dialog.model.AcceptanceDialogArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AcceptanceDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AcceptanceDialog f198171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TZ.b f198172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AcceptanceDialog acceptanceDialog, TZ.b bVar) {
        super(2);
        this.f198171l = acceptanceDialog;
        this.f198172m = bVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            AcceptanceDialog.a aVar = AcceptanceDialog.f198162j0;
            AcceptanceDialog acceptanceDialog = this.f198171l;
            AcceptanceDialogArguments acceptanceDialogArgumentsF5 = acceptanceDialog.f5();
            String strK0 = acceptanceDialogArgumentsF5.f198189d.k0(acceptanceDialog.requireContext());
            AcceptanceDialogArguments acceptanceDialogArgumentsF52 = acceptanceDialog.f5();
            String strK02 = acceptanceDialogArgumentsF52.f198190e.k0(acceptanceDialog.requireContext());
            AcceptanceDialogArguments acceptanceDialogArgumentsF53 = acceptanceDialog.f5();
            AcceptanceDialogArguments acceptanceDialogArgumentsF54 = acceptanceDialog.f5();
            g.a(strK0, strK02, acceptanceDialogArgumentsF53.f198192g, acceptanceDialogArgumentsF54.f198191f.k0(acceptanceDialog.requireContext()), new a(acceptanceDialog), new b(this.f198172m), a13, 0);
        }
        return G0.f406611a;
    }
}
