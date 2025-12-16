package com.avito.android.advert.item;

import Ca1.ViewOnClickListenerC13236c;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.advert_details.reviews.ReviewsOnboarding;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.y0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28225y0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f80762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeepLink f80763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ItemReviewsHeader f80764d;

    public C28225y0(C28136i0 c28136i0, DeepLink deepLink, ItemReviewsHeader itemReviewsHeader) {
        this.f80762b = c28136i0;
        this.f80763c = deepLink;
        this.f80764d = itemReviewsHeader;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ButtonAction secondaryButton;
        String title;
        ButtonAction actionButton;
        String title2;
        String title3;
        TextView textView;
        ((Number) obj).longValue();
        C28136i0 c28136i0 = this.f80762b;
        final I1 i12 = c28136i0.f76350h1;
        if (i12 != null) {
            ReviewsOnboarding onboarding = this.f80764d.getOnboarding();
            DeepLink deepLink = this.f80763c;
            final com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(i12.f71740s0, R.style.Re23_BottomSheet_Default);
            View viewInflate = View.inflate(dVar.getContext(), R.layout.advert_details_house_reviews_onboarding, null);
            if (onboarding != null && (title3 = onboarding.getTitle()) != null && (textView = (TextView) viewInflate.findViewById(R.id.title)) != null) {
                textView.setText(title3);
            }
            Button button = (Button) viewInflate.findViewById(R.id.button_show_reviews);
            if (onboarding != null && (actionButton = onboarding.getActionButton()) != null && (title2 = actionButton.getTitle()) != null) {
                button.setText(title2);
            }
            button.setOnClickListener(new ViewOnClickListenerC13236c(dVar, i12, deepLink, 3));
            Button button2 = (Button) viewInflate.findViewById(R.id.button_close);
            if (onboarding != null && (secondaryButton = onboarding.getSecondaryButton()) != null && (title = secondaryButton.getTitle()) != null) {
                button2.setText(title);
            }
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dVar.dismiss();
                    i12.f71706f0.f7();
                }
            });
            dVar.G(viewInflate, true);
            com.avito.android.lib.design.bottom_sheet.j.b(dVar, true, 4);
            com.avito.android.lib.util.g.a(dVar);
            i12.f71706f0.a7();
        }
        c28136i0.f76301N0.e("key_house_reviews_onboarding_shown");
    }
}
