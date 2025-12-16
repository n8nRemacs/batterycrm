package com.avito.android.sbc.create.common;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.review_gallery.g;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CreateDiscountDispatchHardcodedHowItWorksBottomDialog.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/create/common/CreateDiscountDispatchHardcodedHowItWorksBottomDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateDiscountDispatchHardcodedHowItWorksBottomDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* compiled from: CreateDiscountDispatchHardcodedHowItWorksBottomDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            CreateDiscountDispatchHardcodedHowItWorksBottomDialog createDiscountDispatchHardcodedHowItWorksBottomDialog = (CreateDiscountDispatchHardcodedHowItWorksBottomDialog) this.receiver;
            createDiscountDispatchHardcodedHowItWorksBottomDialog.getClass();
            Button button = (Button) view.findViewById(R.id.close_button);
            if (button != null) {
                button.setOnClickListener(new g(createDiscountDispatchHardcodedHowItWorksBottomDialog, 7));
            }
            return G0.f406611a;
        }
    }

    public CreateDiscountDispatchHardcodedHowItWorksBottomDialog() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        d dVar = new d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.sbc_create_discount_dispatch_about_dialog, new a(1, this, CreateDiscountDispatchHardcodedHowItWorksBottomDialog.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        return dVar;
    }
}
