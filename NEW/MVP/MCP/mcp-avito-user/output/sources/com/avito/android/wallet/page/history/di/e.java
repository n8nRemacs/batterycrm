package com.avito.android.wallet.page.history.di;

import com.avito.android.util.X5;
import com.avito.android.wallet.page.history.details.remote.adapter.PaymentOperationTargetTypeAdapter;
import com.avito.android.wallet.page.history.remote.adapter.PaymentHistoryListElementTypeAdapter;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PaymentHistoryJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class e implements h<Set<X5>> {

    /* compiled from: PaymentHistoryJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f327986a = new e();
    }

    public static e a() {
        return a.f327986a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f327985a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(UO0.b.class, new PaymentOperationTargetTypeAdapter()));
        linkedHashSet.add(new X5(YO0.a.class, new PaymentHistoryListElementTypeAdapter()));
        return linkedHashSet;
    }
}
