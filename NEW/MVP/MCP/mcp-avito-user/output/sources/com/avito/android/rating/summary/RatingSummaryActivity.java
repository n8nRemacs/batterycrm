package com.avito.android.rating.summary;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.rating.RatingSummaryScreen;
import com.avito.android.rating.summary.di.b;
import com.avito.android.rating.summary.di.c;
import com.avito.android.ratings.SummaryScoreData;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: RatingSummaryActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/summary/RatingSummaryActivity;", "Lcom/avito/android/ui/activity/a;", "Lru/avito/component/toolbar/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingSummaryActivity extends com.avito.android.ui.activity.a implements ru.avito.component.toolbar.a, InterfaceC28477j.b {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f247640n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f247641m;

    /* compiled from: RatingSummaryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating/summary/RatingSummaryActivity$a;", "", "<init>", "()V", "", "KEY_SUMMARY_SCORES_DATA", "Ljava/lang/String;", "KEY_TITLE", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingSummaryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[SummaryScoreData.SummaryScoreStateData.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SummaryScoreData.SummaryScoreStateData summaryScoreStateData = SummaryScoreData.SummaryScoreStateData.f250529b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.rating.summary.di.a.a();
        RatingSummaryScreen ratingSummaryScreen = RatingSummaryScreen.f246404d;
        r rVarA = s.a(this);
        ratingSummaryScreen.getClass();
        aVarA.a(new C28478k(ratingSummaryScreen, rVarA, RatingSummaryScreen.f246405e), (c) C29972i.a(C29972i.b(this), c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247641m;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        int i12;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247641m;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.activity_rating_summary);
        String stringExtra = getIntent().getStringExtra("KEY_TITLE");
        if (stringExtra == null) {
            throw new IllegalStateException("Title must be specified");
        }
        Intent intent = getIntent();
        ArrayList<SummaryScoreData> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("KEY_SUMMARY_SCORES_DATA", SummaryScoreData.class) : intent.getParcelableArrayListExtra("KEY_SUMMARY_SCORES_DATA");
        if (parcelableArrayListExtra == null) {
            throw new IllegalStateException("Summary scores data must be specified");
        }
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) findViewById(R.id.summary_details_app_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.summary_details);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247641m;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f247641m;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.m(screenPerformanceTracker3.getF90716d());
        collapsingTitleAppBarLayout.setTitle(stringExtra);
        collapsingTitleAppBarLayout.setShortTitle(stringExtra);
        collapsingTitleAppBarLayout.setClickListener(this);
        for (SummaryScoreData summaryScoreData : parcelableArrayListExtra) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.summary_score_details_item, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.summary_score_details_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.summary_score_details_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.summary_score_details_image);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById3;
            textView.setText(summaryScoreData.f250526d.f250527b);
            textView2.setText(summaryScoreData.f250526d.f250528c);
            int iOrdinal = summaryScoreData.f250525c.ordinal();
            if (iOrdinal == 0) {
                i12 = R.drawable.ic_summary_score_positive;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_summary_score_negative;
            }
            imageView.setImageDrawable(imageView.getContext().getDrawable(i12));
            linearLayout.addView(viewInflate);
        }
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f247641m;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker4, null, null, null, 7);
    }

    @Override // ru.avito.component.toolbar.a
    public final void u() {
    }
}
