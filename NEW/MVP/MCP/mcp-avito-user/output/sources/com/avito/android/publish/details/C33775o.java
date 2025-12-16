package com.avito.android.publish.details;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: ItemDetailsNavigationButtonsView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/o;", "Lcom/avito/android/publish/details/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33775o implements InterfaceC33769m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f234857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ItemDetailsView.b f234858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f234859c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f234860d;

    /* renamed from: e, reason: collision with root package name */
    public final int f234861e;

    /* renamed from: f, reason: collision with root package name */
    public final int f234862f;

    /* renamed from: g, reason: collision with root package name */
    public final int f234863g;

    /* compiled from: ItemDetailsNavigationButtonsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.o$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f234864a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f234865b;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.NavigationButtonsOrientation.values().length];
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonsOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonsOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f234864a = iArr;
            int[] iArr2 = new int[CategoryPublishStep.Params.NavigationButtonStyle.values().length];
            try {
                iArr2[CategoryPublishStep.Params.NavigationButtonStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CategoryPublishStep.Params.NavigationButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f234865b = iArr2;
        }
    }

    public C33775o(@Y61.k View view, @Y61.k r rVar, @Y61.k ItemDetailsView.b bVar) {
        this.f234857a = rVar;
        this.f234858b = bVar;
        this.f234859c = view.getContext();
        this.f234860d = (LinearLayout) view.findViewById(R.id.navigation_buttons_container);
        this.f234861e = view.getResources().getDimensionPixelSize(R.dimen.publish_params_bottom_padding);
        this.f234862f = view.getResources().getDimensionPixelSize(R.dimen.publish_continue_button_vertical_margin);
        this.f234863g = D6.t(view, R.dimen.publish_params_continue_button_margin_horizontal_redesign);
    }

    public final Button a(CategoryPublishStep.Params.NavigationButton navigationButton, LinearLayout.LayoutParams layoutParams, CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        String title;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f234859c, R.style.Theme_DesignSystem_Re23);
        LinearLayout linearLayout = this.f234860d;
        int i12 = this.f234863g;
        D6.f(linearLayout, i12, 0, i12, 0, 10);
        CategoryPublishStep.Params.NavigationButtonStyle style = navigationButton.getStyle();
        int i13 = style == null ? -1 : a.f234865b[style.ordinal()];
        int i14 = i13 != 1 ? i13 != 2 ? R.attr.buttonDefaultLarge : R.attr.buttonPrimaryLarge : R.attr.buttonSecondaryLarge;
        int i15 = a.f234864a[navigationButtonsOrientation.ordinal()];
        if (i15 == 1) {
            title = navigationButton.getTitle();
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            title = navigationButton.getTitleVertical();
        }
        Button button = new Button(contextThemeWrapper, null, i14, 0, 8, null);
        button.setLayoutParams(layoutParams);
        if (title == null) {
            title = navigationButton.getTitle();
        }
        button.setText(title);
        return button;
    }

    public final LinearLayout.LayoutParams b(CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, int i12, boolean z12) {
        int dimensionPixelOffset = !z12 ? this.f234859c.getResources().getDimensionPixelOffset(R.dimen.navigation_button_margin) : 0;
        int i13 = a.f234864a[navigationButtonsOrientation.ordinal()];
        r rVar = this.f234857a;
        LinearLayout linearLayout = this.f234860d;
        if (i13 == 1) {
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
            layoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            rVar.a(rVar.f234905b + rVar.f234906c);
            return layoutParams;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams2.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        rVar.a((this.f234861e * i12) + this.f234862f);
        return layoutParams2;
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        LinearLayout linearLayout = this.f234860d;
        linearLayout.removeAllViews();
        int i12 = 0;
        LinearLayout.LayoutParams layoutParamsB = b(navigationButtonsOrientation, list.size(), false);
        LinearLayout.LayoutParams layoutParamsB2 = b(navigationButtonsOrientation, list.size(), true);
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj;
            Button buttonA = a(navigationButton, i12 == list.size() - 1 ? layoutParamsB2 : layoutParamsB, navigationButtonsOrientation);
            buttonA.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(17, this, navigationButton));
            linearLayout.addView(buttonA);
            i12 = i13;
        }
        D6.H(linearLayout);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) {
        com.avito.android.lib.design.text_view.a aVar;
        LinearLayout linearLayout = this.f234860d;
        linearLayout.removeAllViews();
        int i12 = 0;
        int i13 = 1;
        com.avito.android.lib.design.text_view.a aVar2 = null;
        if (attributedText != null) {
            boolean zF2 = kotlin.jvm.internal.L.f(bool, Boolean.TRUE);
            attributedText.setOnDeepLinkClickListener(new C33772n(this, 0));
            com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(new ContextThemeWrapper(this.f234859c, R.style.Theme_DesignSystem_Re23), null, 0, 0, 14, null);
            aVar3.setMovementMethod(LinkMovementMethod.getInstance());
            com.avito.android.util.text.j.a(aVar3, attributedText, null);
            if (zF2) {
                aVar3.setPadding(0, y6.b(12), 0, 0);
                aVar3.setGravity(1);
            } else {
                aVar3.setPadding(0, 0, 0, y6.b(10));
            }
            aVar = aVar3;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            com.avito.android.lib.design.text_view.a aVar4 = !kotlin.jvm.internal.L.f(bool, Boolean.TRUE) ? aVar : null;
            if (aVar4 != null) {
                linearLayout.addView(aVar4);
            }
        }
        LinearLayout.LayoutParams layoutParamsB = b(navigationButtonsOrientation, list.size(), false);
        LinearLayout.LayoutParams layoutParamsB2 = b(navigationButtonsOrientation, list.size(), true);
        for (Object obj : list) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj;
            Button buttonA = a(navigationButton, i12 == list.size() - i13 ? layoutParamsB2 : layoutParamsB, navigationButtonsOrientation);
            buttonA.setOnClickListener(new com.avito.android.advert_core.advert.f(this, navigationButtonAction, navigationButton, deepLink, 8));
            linearLayout.addView(buttonA);
            i12 = i14;
            i13 = 1;
            aVar2 = null;
        }
        com.avito.android.lib.design.text_view.a aVar5 = aVar2;
        if (aVar != null) {
            com.avito.android.lib.design.text_view.a aVar6 = kotlin.jvm.internal.L.f(bool, Boolean.TRUE) ? aVar : aVar5;
            if (aVar6 != null) {
                linearLayout.addView(aVar6);
            }
        }
        D6.D(linearLayout, R.drawable.bg_white_gradient_85);
        D6.H(linearLayout);
        linearLayout.animate().translationY(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator());
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f234860d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        D6.w(this.f234860d);
        r rVar = this.f234857a;
        rVar.a(rVar.f234905b + rVar.f234906c);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        LinearLayout linearLayout = this.f234860d;
        if (z12) {
            linearLayout.setTranslationY(C35835l0.g(this.f234859c).y / 2);
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }
}
