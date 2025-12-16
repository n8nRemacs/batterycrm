package ru.tinkoff.scrollingpagerindicator;

import android.database.DataSetObserver;

/* compiled from: ViewPagerAttacher.java */
/* loaded from: classes9.dex */
class j extends DataSetObserver {
    @Override // android.database.DataSetObserver
    public final void onChanged() {
        throw null;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }
}
