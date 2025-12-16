package com.avito.android.passport.profile_add.onboarding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import j.e0;
import kotlin.Metadata;

/* compiled from: PassportOnboardingView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/onboarding/p;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f213603a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f213604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f213605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f213606d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f213607e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f213608f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f213609g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f213610h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f213611i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f213612j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f213613k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f213614l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f213615m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Banner f213616n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f213617o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f213618p;

    public p(@Y61.k View view) {
        this.f213603a = view;
        this.f213604b = (TextView) view.findViewById(R.id.passport_onboarding_title_tv);
        this.f213605c = (ImageView) view.findViewById(R.id.passport_onboarding_close_button);
        this.f213606d = (TextView) view.findViewById(R.id.passport_onboarding_description_tv);
        this.f213607e = (TextView) view.findViewById(R.id.passport_onboarding_item_1_title);
        this.f213608f = (TextView) view.findViewById(R.id.passport_onboarding_item_2_title);
        this.f213609g = (TextView) view.findViewById(R.id.passport_onboarding_item_3_title);
        this.f213610h = (TextView) view.findViewById(R.id.passport_onboarding_item_1_subtitle);
        this.f213611i = (TextView) view.findViewById(R.id.passport_onboarding_item_2_subtitle);
        this.f213612j = (TextView) view.findViewById(R.id.passport_onboarding_item_3_subtitle);
        this.f213613k = (TextView) view.findViewById(R.id.passport_onboarding_item_1_icon);
        this.f213614l = (TextView) view.findViewById(R.id.passport_onboarding_item_2_icon);
        this.f213615m = (TextView) view.findViewById(R.id.passport_onboarding_item_3_icon);
        this.f213616n = (Banner) view.findViewById(R.id.passport_onboarding_promoblock);
        this.f213617o = (Button) view.findViewById(R.id.passport_onboarding_button);
        this.f213618p = (Button) view.findViewById(R.id.passport_onboarding_secondary_button);
    }

    public static void a(TextView textView, @e0 Integer num) {
        I5.a(textView, num != null ? textView.getRootView().getContext().getString(num.intValue()) : null, false);
    }
}
