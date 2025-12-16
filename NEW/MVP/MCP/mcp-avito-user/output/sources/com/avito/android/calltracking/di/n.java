package com.avito.android.calltracking.di;

import android.content.Context;
import cm.C27215a;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalltrackingModule_ProvideTabAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<C27215a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f113675a;

    public n(dagger.internal.l lVar) {
        this.f113675a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f113675a.f393949a;
        int i12 = m.f113674a;
        return new C27215a(new com.avito.android.lib.deprecated_design.tab.adapter.k(), context, R.layout.tab_with_counter_redesign);
    }
}
