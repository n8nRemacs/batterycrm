package com.avito.android.sbc.create.common;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.publish.slots.delivery_addresses.f;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogData;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogItem;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DiscountAlternativesBottomDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/common/DiscountAlternativesBottomDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscountAlternativesBottomDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f259170h0 = new a(null);

    /* compiled from: DiscountAlternativesBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/create/common/DiscountAlternativesBottomDialog$a;", "", "<init>", "()V", "", "CLICKED_DISCOUNT_ALTERNATIVE_SLUG", "Ljava/lang/String;", "DISCOUNT_ALTERNATIVES_DATA_KEY", "DISCOUNT_ALTERNATIVES_RESULT_KEY", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DiscountAlternativesBottomDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DiscountAlternativesDialogData f259172m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DiscountAlternativesDialogData discountAlternativesDialogData) {
            super(1);
            this.f259172m = discountAlternativesDialogData;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            a aVar = DiscountAlternativesBottomDialog.f259170h0;
            DiscountAlternativesBottomDialog discountAlternativesBottomDialog = DiscountAlternativesBottomDialog.this;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.menu_content);
            for (DiscountAlternativesDialogItem discountAlternativesDialogItem : this.f259172m.f259788c) {
                View viewInflate = discountAlternativesBottomDialog.getLayoutInflater().inflate(R.layout.sbc_create_discount_dispatch_alternative_item, (ViewGroup) linearLayout, false);
                viewInflate.setId(View.generateViewId());
                viewInflate.setTag("menu_item");
                viewInflate.setOnClickListener(new f(24, discountAlternativesBottomDialog, discountAlternativesDialogItem));
                TextView textView = (TextView) viewInflate.findViewById(R.id.item_title);
                textView.setText(discountAlternativesDialogItem.f259789b);
                if (discountAlternativesDialogItem.f259791d) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_new_feature_badge, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                linearLayout.addView(viewInflate);
            }
            return G0.f406611a;
        }
    }

    public DiscountAlternativesBottomDialog() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        DiscountAlternativesDialogData discountAlternativesDialogData = arguments != null ? (DiscountAlternativesDialogData) arguments.getParcelable("discount_alternatives_data_key") : null;
        d dVar = new d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        View viewInflate = View.inflate(dVar.getContext(), R.layout.sbc_offer_dialog_header, null);
        View viewFindViewById = viewInflate.findViewById(R.id.sbc_offer_dialog_header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(discountAlternativesDialogData.f259787b);
        View viewFindViewById2 = viewInflate.findViewById(R.id.sbc_offer_dialog_header_close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById2).setOnClickListener(new S7.a(dVar, 14));
        dVar.H(viewInflate);
        dVar.C(R.layout.design_bottom_sheet_menu_scrollable_content, new b(discountAlternativesDialogData));
        return dVar;
    }
}
