package com.avito.android.advert_core.development_offers.carousel_bottomsheet;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.B;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.development_offers.carousel_bottomsheet.DevelopmentOffersBottomSheetDialog;
import com.avito.android.advert_core.development_offers.carousel_bottomsheet.DevelopmentOffersBottomSheetFragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.DevelopmentOffer;
import com.avito.android.remote.model.DevelopmentOffers;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.util.C35835l0;
import com.avito.android.verification.verification_input_inn.o;
import kotlin.Metadata;
import p9.e;
import q9.b;

/* compiled from: DevelopmentOffersBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/development_offers/carousel_bottomsheet/DevelopmentOffersBottomSheetDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DevelopmentOffersBottomSheetDialog extends DialogFragment implements InterfaceC28477j.a {

    /* renamed from: f0, reason: collision with root package name */
    @l
    public final Z0 f83314f0;

    /* renamed from: g0, reason: collision with root package name */
    @k
    public final DevelopmentOffers f83315g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f83316h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public final String f83317i0;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public final e f83318j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final AnalyticsData f83319k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public Button f83320l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public Button f83321m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public ViewPager f83322n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final b f83323o0 = new b(this);

    /* compiled from: DevelopmentOffersBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/development_offers/carousel_bottomsheet/DevelopmentOffersBottomSheetDialog$a", "Landroidx/fragment/app/B;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends B {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public final int c() {
            return DevelopmentOffersBottomSheetDialog.this.f83315g0.getOffers().size();
        }

        @Override // androidx.fragment.app.B
        @k
        public final Fragment o(int i12) {
            DevelopmentOffersBottomSheetFragment.a aVar = DevelopmentOffersBottomSheetFragment.f83325j0;
            DevelopmentOffer developmentOffer = DevelopmentOffersBottomSheetDialog.this.f83315g0.get(i12);
            aVar.getClass();
            DevelopmentOffersBottomSheetFragment developmentOffersBottomSheetFragment = new DevelopmentOffersBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("offer", developmentOffer);
            developmentOffersBottomSheetFragment.setArguments(bundle);
            return developmentOffersBottomSheetFragment;
        }
    }

    public DevelopmentOffersBottomSheetDialog(@l Z0 z02, @k DevelopmentOffers developmentOffers, int i12, @l String str, @l e eVar, @k AnalyticsData analyticsData) {
        this.f83314f0 = z02;
        this.f83315g0 = developmentOffers;
        this.f83316h0 = i12;
        this.f83317i0 = str;
        this.f83318j0 = eVar;
        this.f83319k0 = analyticsData;
    }

    public final void b5() {
        Button button = this.f83321m0;
        if (button != null) {
            int i12 = this.f83316h0;
            DevelopmentOffers developmentOffers = this.f83315g0;
            DevelopmentOffer developmentOffer = developmentOffers.get(i12);
            String title = null;
            if (developmentOffers.getShouldShowDevelopmentsAdvice()) {
                if (developmentOffer.isMoznoteka()) {
                    SimpleAdvertAction brandspaceButtonUri = developmentOffers.getBrandspaceButtonUri();
                    if (brandspaceButtonUri != null) {
                        title = brandspaceButtonUri.getTitle();
                    }
                } else {
                    title = this.f83317i0;
                }
            }
            com.avito.android.lib.design.button.b.a(button, title, false);
            button.setOnClickListener(new o(23, this, developmentOffer));
        }
    }

    public final void c5() {
        Button button = this.f83320l0;
        if (button != null) {
            int i12 = this.f83316h0;
            DevelopmentOffers developmentOffers = this.f83315g0;
            if (!developmentOffers.get(i12).isMoznoteka() || developmentOffers.getMoznotekaButtonUri() == null) {
                button.setText(developmentOffers.getOffersPhoneUri().getTitle());
                button.setAppearance(C35835l0.j(R.attr.buttonAccentLarge, button.getContext()));
                final int i13 = 1;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: q9.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ DevelopmentOffersBottomSheetDialog f429057c;

                    {
                        this.f429057c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog = this.f429057c;
                                Z0 z02 = developmentOffersBottomSheetDialog.f83314f0;
                                if (z02 != null) {
                                    SimpleAdvertAction moznotekaButtonUri = developmentOffersBottomSheetDialog.f83315g0.getMoznotekaButtonUri();
                                    if (moznotekaButtonUri == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    z02.u(moznotekaButtonUri, "item_button");
                                    return;
                                }
                                return;
                            default:
                                DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog2 = this.f429057c;
                                Z0 z03 = developmentOffersBottomSheetDialog2.f83314f0;
                                if (z03 != null) {
                                    z03.u(developmentOffersBottomSheetDialog2.f83315g0.getOffersPhoneUri(), "item_button");
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            SimpleAdvertAction moznotekaButtonUri = developmentOffers.getMoznotekaButtonUri();
            if (moznotekaButtonUri == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            button.setText(moznotekaButtonUri.getTitle());
            button.setAppearance(R.style.LookAndFeel_Button_AccentLarge_Moznoteka);
            final int i14 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: q9.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DevelopmentOffersBottomSheetDialog f429057c;

                {
                    this.f429057c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog = this.f429057c;
                            Z0 z02 = developmentOffersBottomSheetDialog.f83314f0;
                            if (z02 != null) {
                                SimpleAdvertAction moznotekaButtonUri2 = developmentOffersBottomSheetDialog.f83315g0.getMoznotekaButtonUri();
                                if (moznotekaButtonUri2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                z02.u(moznotekaButtonUri2, "item_button");
                                return;
                            }
                            return;
                        default:
                            DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog2 = this.f429057c;
                            Z0 z03 = developmentOffersBottomSheetDialog2.f83314f0;
                            if (z03 != null) {
                                z03.u(developmentOffersBottomSheetDialog2.f83315g0.getOffersPhoneUri(), "item_button");
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) throws Resources.NotFoundException {
        ViewPager viewPager;
        ViewPager viewPager2 = null;
        d dVar = new d(requireContext(), 0, 2, null);
        d.M(dVar, null, false, true, 7);
        dVar.D(R.layout.development_offers_bottom_sheet_layout, true);
        ViewPager viewPager3 = (ViewPager) dVar.findViewById(R.id.development_offers_bottom_sheet_pager);
        if (viewPager3 != null) {
            viewPager3.setAdapter(new a(getChildFragmentManager()));
            viewPager3.setOffscreenPageLimit(this.f83315g0.getOffers().size());
            viewPager2 = viewPager3;
        }
        this.f83322n0 = viewPager2;
        this.f83320l0 = (Button) dVar.findViewById(R.id.development_offers_bottom_sheet_call_button);
        c5();
        this.f83321m0 = (Button) dVar.findViewById(R.id.development_offers_bottom_sheet_advice_button);
        b5();
        PageIndicator pageIndicator = (PageIndicator) dVar.findViewById(R.id.development_offers_bottom_sheet_indicator);
        if (pageIndicator != null && (viewPager = this.f83322n0) != null) {
            pageIndicator.e(viewPager);
        }
        if (getResources().getBoolean(R.bool.is_landscape)) {
            dVar.T();
        } else {
            d.I(dVar, true);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        ViewPager viewPager = this.f83322n0;
        if (viewPager != null) {
            viewPager.x(this.f83316h0, false);
        }
        ViewPager viewPager2 = this.f83322n0;
        if (viewPager2 != null) {
            viewPager2.c(this.f83323o0);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        ViewPager viewPager = this.f83322n0;
        if (viewPager != null) {
            viewPager.u(this.f83323o0);
        }
        super.onStop();
    }
}
