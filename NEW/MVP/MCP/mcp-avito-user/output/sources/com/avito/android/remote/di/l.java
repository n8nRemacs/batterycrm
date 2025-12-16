package com.avito.android.remote.di;

import com.avito.android.remote.model.AdvertReport;
import com.avito.android.remote.parse.adapter.AdvertReportDeserializer;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: ItemReportJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes17.dex */
public final class l implements dagger.internal.h<Set<X5>> {

    /* compiled from: ItemReportJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {
        static {
            new l();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = k.f253370a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(AdvertReport.class, new AdvertReportDeserializer()));
        return linkedHashSet;
    }
}
