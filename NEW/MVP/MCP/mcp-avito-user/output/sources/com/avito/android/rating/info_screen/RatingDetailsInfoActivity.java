package com.avito.android.rating.info_screen;

import Jg0.C14196a;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.publish.slots.delivery_addresses.f;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35974x2;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: RatingDetailsInfoActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/info_screen/RatingDetailsInfoActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingDetailsInfoActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f247616p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f247617m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f247618n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.provider.a f247619o;

    /* compiled from: RatingDetailsInfoActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/info_screen/RatingDetailsInfoActivity$a;", "", "<init>", "()V", "", "KEY_BUTTONS", "Ljava/lang/String;", "KEY_CONTENT", "KEY_REVIEW_ID", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingDetailsInfoActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            RatingDetailsInfoActivity.this.finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_rating_info;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.rating.info_screen.di.a.a().a(cv.c.a(this), (com.avito.android.rating.info_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.rating.info_screen.di.c.class)).a(this);
    }

    public final Button a2(BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButton reviewActionInfoButton, int i12) {
        String str;
        if (reviewActionInfoButton == null || (str = reviewActionInfoButton.f250285b) == null || C43066x.K(str)) {
            return null;
        }
        Button button = new Button(this, null, 0, 0, 14, null);
        button.setAppearanceFromAttr(i12);
        button.setText(str);
        button.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(layoutParams.getMarginStart(), y6.b(16), layoutParams.getMarginEnd(), layoutParams.bottomMargin);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new f(10, reviewActionInfoButton, this));
        return button;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ((NavBar) findViewById(R.id.info_popup_nav_bar)).c(R.attr.ic_close24, new b());
        TextView textView = (TextView) findViewById(R.id.rating_info_subtitle);
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        j.a(textView, (AttributedText) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("KEY_CONTENT", AttributedText.class) : intent.getParcelableExtra("KEY_CONTENT")), null);
        Intent intent2 = getIntent();
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons reviewActionInfoButtons = (BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("KEY_BUTTONS", BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons.class) : intent2.getParcelableExtra("KEY_BUTTONS"));
        if (reviewActionInfoButtons != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.container);
            Button buttonA2 = a2(reviewActionInfoButtons.f250287b, R.attr.buttonPrimaryLarge);
            if (buttonA2 != null) {
                linearLayout.addView(buttonA2);
            }
            Button buttonA22 = a2(reviewActionInfoButtons.f250288c, R.attr.buttonSecondaryLarge);
            if (buttonA22 != null) {
                linearLayout.addView(buttonA22);
            }
        }
        Long lC2 = C35974x2.c(getIntent(), "KEY_REVIEW_ID");
        InterfaceC28373a interfaceC28373a = this.f247618n;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.android.analytics.provider.a aVar = this.f247619o;
        String strA = (aVar != null ? aVar : null).a();
        if (strA == null) {
            strA = "";
        }
        interfaceC28373a.c(new C14196a(strA, lC2));
    }
}
