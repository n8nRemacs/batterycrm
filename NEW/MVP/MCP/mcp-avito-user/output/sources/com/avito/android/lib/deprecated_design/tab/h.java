package com.avito.android.lib.deprecated_design.tab;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;

/* compiled from: TabLayouts.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/h;", "Landroid/database/DataSetObserver;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f178157a;

    public h(TabLayout tabLayout) {
        this.f178157a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        l.b(this.f178157a);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        l.b(this.f178157a);
    }
}
