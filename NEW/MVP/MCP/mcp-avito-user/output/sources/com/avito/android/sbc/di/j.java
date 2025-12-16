package com.avito.android.sbc.di;

import com.avito.android.sbc.CreateDiscountDispatchOffersTypeAdapter;
import com.avito.android.sbc.Offer;
import com.avito.android.util.X5;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: DiscountDispatchJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@y
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<Set<X5>> {

    /* compiled from: DiscountDispatchJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f260011a = new j();
    }

    public static j a() {
        return a.f260011a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = i.f260010a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(Offer.class, new CreateDiscountDispatchOffersTypeAdapter()));
        return linkedHashSet;
    }
}
