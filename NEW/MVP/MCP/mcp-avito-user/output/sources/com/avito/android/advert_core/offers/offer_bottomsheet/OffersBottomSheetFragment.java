package com.avito.android.advert_core.offers.offer_bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OffersBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/OffersBottomSheetFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OffersBottomSheetFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public OfferItem f83864f0;

    /* compiled from: OffersBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/OffersBottomSheetFragment$a;", "", "<init>", "()V", "", "ARG_OFFER", "Ljava/lang/String;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83864f0 = (OfferItem) arguments.getParcelable("offer");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_offers_bottom_sheet, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.bottom_sheet_offer_header);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.bottom_sheet_offer_description);
        OfferItem offerItem = this.f83864f0;
        if (offerItem != null) {
            if (textView != null) {
                textView.setText(offerItem.getF83828c());
            }
            if (textView2 != null) {
                textView2.setText(offerItem.getF83829d());
            }
        }
        return viewInflate;
    }
}
