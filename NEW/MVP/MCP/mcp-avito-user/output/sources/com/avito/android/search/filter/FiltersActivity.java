package com.avito.android.search.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FiltersFragment;
import com.avito.android.search.filter.FiltersMode;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: FiltersActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/FiltersActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: FiltersActivity.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/FiltersActivity$a;", "", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && (fragment instanceof FiltersFragment)) {
                break;
            }
        }
        FiltersFragment filtersFragment = (FiltersFragment) (next instanceof FiltersFragment ? next : null);
        if (filtersFragment != null) {
            filtersFragment.i0();
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Object serializableExtra;
        super.onCreate(bundle);
        setTheme(R.style.Theme_DesignSystem_Re23);
        if (bundle == null) {
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            SearchParams searchParams = (SearchParams) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("search_params", SearchParams.class) : intent.getParcelableExtra("search_params"));
            if (searchParams == null) {
                throw new IllegalArgumentException("search_params intent parameter required");
            }
            Intent intent2 = getIntent();
            Area area = (Area) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("search_area", Area.class) : intent2.getParcelableExtra("search_area"));
            String stringExtra = getIntent().getStringExtra("map_search_state");
            String stringExtra2 = getIntent().getStringExtra("scroll_to_parameter_with_id");
            boolean booleanExtra = getIntent().getBooleanExtra("is_only_sort_shown", false);
            Intent intent3 = getIntent();
            FilterAnalyticsData filterAnalyticsData = (FilterAnalyticsData) (i12 >= 33 ? (Parcelable) intent3.getParcelableExtra("filtersAnalyticsData", FilterAnalyticsData.class) : intent3.getParcelableExtra("filtersAnalyticsData"));
            if (filterAnalyticsData == null) {
                throw new IllegalArgumentException("filtersAnalyticsData intent parameter required");
            }
            Intent intent4 = getIntent();
            if (i12 >= 33) {
                serializableExtra = intent4.getSerializableExtra(PresentationTypeKt.PRESENTATION_TYPE, PresentationType.class);
            } else {
                Object serializableExtra2 = intent4.getSerializableExtra(PresentationTypeKt.PRESENTATION_TYPE);
                if (!(serializableExtra2 instanceof PresentationType)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (PresentationType) serializableExtra2;
            }
            PresentationType presentationType = (PresentationType) serializableExtra;
            Intent intent5 = getIntent();
            FiltersMode filtersMode = (FiltersMode) (i12 >= 33 ? (Parcelable) intent5.getParcelableExtra("mode", FiltersMode.class) : intent5.getParcelableExtra("mode"));
            if (filtersMode == null) {
                filtersMode = FiltersMode.Default.f261858b;
            }
            FiltersMode filtersMode2 = filtersMode;
            String stringExtra3 = getIntent().getStringExtra("search_context");
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            FiltersFragment.a aVar = FiltersFragment.f261828O0;
            FiltersArguments filtersArguments = new FiltersArguments(searchParams, area, stringExtra, booleanExtra, filterAnalyticsData, presentationType, stringExtra2, filtersMode2, stringExtra3);
            aVar.getClass();
            hE2.j(R.id.fragment_container, FiltersFragment.a.a(filtersArguments), null, 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
