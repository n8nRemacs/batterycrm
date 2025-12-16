package com.avito.android.advert_core.development_offers.carousel_bottomsheet;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.DevelopmentOffer;
import com.avito.android.remote.model.DevelopmentOfferParameter;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentOffersBottomSheetFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/development_offers/carousel_bottomsheet/DevelopmentOffersBottomSheetFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DevelopmentOffersBottomSheetFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f83325j0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @l
    public DevelopmentOffer f83326f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public TextView f83327g0;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public TextView f83328h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public LinearLayout f83329i0;

    /* compiled from: DevelopmentOffersBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/development_offers/carousel_bottomsheet/DevelopmentOffersBottomSheetFragment$a;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83326f0 = (DevelopmentOffer) arguments.getParcelable("offer");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) throws Resources.NotFoundException {
        LinearLayout linearLayout;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_development_offers_bottom_sheet, viewGroup, false);
        this.f83327g0 = (TextView) viewInflate.findViewById(R.id.carousel_bottom_sheet_item_header);
        this.f83328h0 = (TextView) viewInflate.findViewById(R.id.carousel_bottom_sheet_item_description);
        this.f83329i0 = (LinearLayout) viewInflate.findViewById(R.id.carousel_bottom_sheet_item_parameters);
        DevelopmentOffer developmentOffer = this.f83326f0;
        if (developmentOffer != null) {
            TextView textView = this.f83327g0;
            if (textView != null) {
                textView.setText(developmentOffer.getTitle());
            }
            TextView textView2 = this.f83328h0;
            if (textView2 != null) {
                textView2.setText(developmentOffer.getDescription());
            }
            List<DevelopmentOfferParameter> parameters = developmentOffer.getParameters();
            if (parameters != null && (linearLayout = this.f83329i0) != null) {
                int iD2 = C35835l0.d(R.attr.black, viewInflate.getContext());
                int iD3 = C35835l0.d(R.attr.gray48, viewInflate.getContext());
                int dimensionPixelSize = viewInflate.getResources().getDimensionPixelSize(R.dimen.development_offers_bottom_sheet_parameter_padding_top);
                int iJ2 = C35835l0.j(R.attr.textM1, viewInflate.getContext());
                for (DevelopmentOfferParameter developmentOfferParameter : parameters) {
                    com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(viewInflate.getContext(), null, 0, 0, 14, null);
                    aVar.setPadding(0, dimensionPixelSize, 0, 0);
                    aVar.setTextAppearance(iJ2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iD3);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) developmentOfferParameter.getTitle()).append((CharSequence) ": ");
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iD2);
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) developmentOfferParameter.getValue());
                    spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
                    aVar.setText(spannableStringBuilder);
                    linearLayout.addView(aVar);
                }
            }
        }
        return viewInflate;
    }
}
