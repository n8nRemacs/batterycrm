package com.avito.android.publish_limits_info.history;

import android.os.Parcelable;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.publish_limits_info.history.tab.HistoryTabItem;
import com.avito.android.publish_limits_info.history.tab.PublishAdvertsHistoryFragment;
import kotlin.Metadata;

/* compiled from: TabPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/q;", "Landroidx/fragment/app/F;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q extends F {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k f245876j;

    public q(@Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.k kVar) {
        super(fragmentManager, 0);
        this.f245876j = kVar;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f245876j.getCount();
    }

    @Override // androidx.viewpager.widget.a
    @Y61.k
    public final CharSequence e(int i12) {
        return ((HistoryTabItem) this.f245876j.getItem(i12)).f245877d;
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    @Y61.l
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        String str = ((HistoryTabItem) this.f245876j.getItem(i12)).f245878e;
        PublishAdvertsHistoryFragment.f245880r0.getClass();
        return PublishAdvertsHistoryFragment.a.a(str);
    }
}
