package com.avito.android.auto_select.confirmation_dialog;

import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetFragment;
import ef.InterfaceC40099b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class a extends H implements Y41.l<InterfaceC40099b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC40099b interfaceC40099b) {
        InterfaceC40099b interfaceC40099b2 = interfaceC40099b;
        AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment = (AutoSelectConfirmationBottomSheetFragment) this.receiver;
        AutoSelectConfirmationBottomSheetFragment.a aVar = AutoSelectConfirmationBottomSheetFragment.f95853n0;
        autoSelectConfirmationBottomSheetFragment.getClass();
        if (interfaceC40099b2 instanceof InterfaceC40099b.a) {
            C22960s.a(C22777e.b(new Q("redirect_link", ((InterfaceC40099b.a) interfaceC40099b2).f395308a)), autoSelectConfirmationBottomSheetFragment, "auto_select_confirmation_result");
            autoSelectConfirmationBottomSheetFragment.dismissAllowingStateLoss();
        }
        return G0.f406611a;
    }
}
