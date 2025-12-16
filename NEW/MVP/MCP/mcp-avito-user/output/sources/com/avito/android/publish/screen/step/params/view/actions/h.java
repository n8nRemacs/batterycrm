package com.avito.android.publish.screen.step.params.view.actions;

import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.details.InterfaceC33769m;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsNavigationButtonsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/h;", "Lcom/avito/android/publish/details/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements InterfaceC33769m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f241556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f241557b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ContextThemeWrapper f241558c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f241559d;

    /* compiled from: PublishDetailsNavigationButtonsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f241560a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f241561b;

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
            f241560a = iArr;
            int[] iArr2 = new int[CategoryPublishStep.Params.NavigationButtonStyle.values().length];
            try {
                iArr2[CategoryPublishStep.Params.NavigationButtonStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CategoryPublishStep.Params.NavigationButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f241561b = iArr2;
        }
    }

    public h(@Y61.k View view, @Y61.k k kVar, @Y61.k r rVar) {
        this.f241556a = kVar;
        this.f241557b = rVar;
        this.f241558c = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f241559d = (LinearLayout) view.findViewById(R.id.navigation_buttons_container);
    }

    public static Button a(h hVar, CategoryPublishStep.Params.NavigationButton navigationButton, CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, boolean z12) throws Resources.NotFoundException {
        int dimensionPixelOffset;
        LinearLayout.LayoutParams layoutParams;
        String title;
        if (z12) {
            hVar.getClass();
            dimensionPixelOffset = 0;
        } else {
            dimensionPixelOffset = hVar.f241558c.getResources().getDimensionPixelOffset(R.dimen.navigation_button_margin);
        }
        int[] iArr = a.f241560a;
        int i12 = iArr[navigationButtonsOrientation.ordinal()];
        if (i12 == 1) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
            layoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
            layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        }
        hVar.getClass();
        CategoryPublishStep.Params.NavigationButtonStyle style = navigationButton.getStyle();
        int i13 = style != null ? a.f241561b[style.ordinal()] : -1;
        int i14 = i13 != 1 ? i13 != 2 ? R.attr.buttonDefaultLarge : R.attr.buttonPrimaryLarge : R.attr.buttonSecondaryLarge;
        int i15 = iArr[navigationButtonsOrientation.ordinal()];
        if (i15 == 1) {
            title = navigationButton.getTitle();
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            title = navigationButton.getTitleVertical();
        }
        Button button = new Button(hVar.f241558c, null, i14, 0, 8, null);
        button.setLayoutParams(layoutParams);
        if (title == null) {
            title = navigationButton.getTitle();
        }
        button.setText(title);
        return button;
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) throws Resources.NotFoundException {
        int i12;
        LinearLayout linearLayout = this.f241559d;
        linearLayout.removeAllViews();
        int i13 = a.f241560a[navigationButtonsOrientation.ordinal()];
        if (i13 == 1) {
            i12 = 0;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 1;
        }
        linearLayout.setOrientation(i12);
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj;
            Button buttonA = a(this, navigationButton, navigationButtonsOrientation, i14 == list.size() - 1);
            buttonA.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(28, this, navigationButton));
            linearLayout.addView(buttonA);
            i14 = i15;
        }
        k kVar = this.f241556a;
        kVar.c(kVar.getF241566e() + kVar.b());
        D6.H(linearLayout);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) throws Resources.NotFoundException {
        int i12;
        LinearLayout linearLayout = this.f241559d;
        linearLayout.removeAllViews();
        int i13 = a.f241560a[navigationButtonsOrientation.ordinal()];
        if (i13 == 1) {
            i12 = 0;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 1;
        }
        linearLayout.setOrientation(i12);
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj;
            Button buttonA = a(this, navigationButton, navigationButtonsOrientation, i14 == list.size() - 1);
            buttonA.setOnClickListener(new com.avito.android.advert_core.advert.f(this, navigationButtonAction, navigationButton, deepLink, 9));
            linearLayout.addView(buttonA);
            i14 = i15;
        }
        if (attributedText != null) {
            boolean zF2 = L.f(bool, Boolean.TRUE);
            attributedText.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.publish.screen.step.params.view.actions.g
                /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.publish.screen.step.params.view.actions.r, java.lang.Object] */
                @Override // com.avito.android.deep_linking.links.w
                public final void i7(DeepLink deepLink2) {
                    this.f241555b.f241557b.n(deepLink2);
                }
            });
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f241558c, null, 0, 0, 14, null);
            aVar.setMovementMethod(LinkMovementMethod.getInstance());
            com.avito.android.util.text.j.a(aVar, attributedText, null);
            if (zF2) {
                aVar.setPadding(0, y6.b(12), 0, 0);
                aVar.setGravity(1);
            } else {
                aVar.setPadding(0, 0, 0, y6.b(10));
            }
            linearLayout.addView(aVar, zF2 ? -1 : 0);
        }
        D6.H(linearLayout);
        linearLayout.animate().translationY(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator());
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f241559d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        D6.w(this.f241559d);
        k kVar = this.f241556a;
        kVar.c(kVar.getF241566e() + kVar.b());
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        LinearLayout linearLayout = this.f241559d;
        if (z12) {
            linearLayout.setTranslationY(C35835l0.g(this.f241558c).y / 2);
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }
}
