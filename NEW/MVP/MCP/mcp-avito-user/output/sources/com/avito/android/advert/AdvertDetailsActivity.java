package com.avito.android.advert;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.advert.di.InterfaceC27692a;
import com.avito.android.advert.di.InterfaceC27693b;
import com.avito.android.advert.item.AdvertDetailsArguments;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.rec.ScreenSource;
import com.avito.android.util.C35974x2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsActivity.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/AdvertDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: AdvertDetailsActivity.kt */
    @androidx.compose.runtime.internal.P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/AdvertDetailsActivity$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        InterfaceC27692a.InterfaceC2165a interfaceC2165aA = com.avito.android.advert.di.s0.a();
        interfaceC2165aA.a((InterfaceC27693b) C29972i.a(C29972i.b(this), InterfaceC27693b.class));
        interfaceC2165aA.build();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentH = getSupportFragmentManager().H("AdvertDetailsFragment");
        AdvertDetailsFragment advertDetailsFragment = fragmentH instanceof AdvertDetailsFragment ? (AdvertDetailsFragment) fragmentH : null;
        if (advertDetailsFragment != null) {
            advertDetailsFragment.i0();
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Fragment fragmentH = getSupportFragmentManager().H("AdvertDetailsFragment");
            if ((fragmentH instanceof AdvertDetailsFragment ? (AdvertDetailsFragment) fragmentH : null) == null) {
                String stringExtra = getIntent().getStringExtra("advert_id");
                if (stringExtra == null) {
                    throw new IllegalStateException("");
                }
                Integer numB = C35974x2.b(getIntent(), "address_id");
                String stringExtra2 = getIntent().getStringExtra("advert_context");
                Parcelable parcelableExtra = getIntent().getParcelableExtra("fast_open_params");
                if (parcelableExtra == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AdvertDetailsFastOpenParams advertDetailsFastOpenParams = (AdvertDetailsFastOpenParams) parcelableExtra;
                long longExtra = getIntent().getLongExtra("advert_click_time", 0L);
                Bundle extras = getIntent().getExtras();
                TreeClickStreamParent treeClickStreamParent = extras != null ? (TreeClickStreamParent) extras.getParcelable("treeAnalyticsParent") : null;
                int intExtra = getIntent().getIntExtra("serp_gallery_position", 0);
                ScreenSource screenSource = (ScreenSource) getIntent().getParcelableExtra("advert_screen_source");
                if (screenSource == null) {
                    screenSource = ScreenSource.EMPTY.f251779d;
                }
                ScreenSource screenSource2 = screenSource;
                String stringExtra3 = getIntent().getStringExtra("selected_page_for_stories");
                String stringExtra4 = getIntent().getStringExtra("call_id_for_emit_call");
                AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
                AdvertDetailsArguments advertDetailsArguments = new AdvertDetailsArguments(stringExtra, numB, stringExtra2, advertDetailsFastOpenParams, treeClickStreamParent, longExtra, Integer.valueOf(intExtra), screenSource2, stringExtra4, null, stringExtra3, null, null, 6144, null);
                c27803a.getClass();
                AdvertDetailsFragment advertDetailsFragmentA = AdvertDetailsFragment.C27803a.a(advertDetailsArguments);
                androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
                hE2.j(R.id.fragment_container, advertDetailsFragmentA, "AdvertDetailsFragment", 1);
                hE2.f();
            }
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
