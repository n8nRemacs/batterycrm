package com.avito.android.lib.deprecated_design.tab;

import android.database.DataSetObserver;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import kotlin.Metadata;

/* compiled from: TabLayouts.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/j;", "Landroid/database/DataSetObserver;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AvitoTabLayout f178159a;

    public j(AvitoTabLayout avitoTabLayout) {
        this.f178159a = avitoTabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        l.a(this.f178159a);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        l.a(this.f178159a);
    }
}
