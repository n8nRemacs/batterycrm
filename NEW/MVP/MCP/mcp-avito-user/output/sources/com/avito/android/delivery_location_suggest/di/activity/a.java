package com.avito.android.delivery_location_suggest.di.activity;

import com.avito.android.delivery_location_suggest.di.activity.b;
import dagger.internal.e;

/* compiled from: DaggerDeliveryLocationSuggestActivityComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDeliveryLocationSuggestActivityComponent.java */
    public static final class b implements com.avito.android.delivery_location_suggest.di.activity.b {
        public b(com.avito.android.delivery_location_suggest.di.activity.c cVar, C4086a c4086a) {
        }
    }

    /* compiled from: DaggerDeliveryLocationSuggestActivityComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.delivery_location_suggest.di.activity.b.a
        public final com.avito.android.delivery_location_suggest.di.activity.b a(com.avito.android.delivery_location_suggest.di.activity.c cVar) {
            return new b(cVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
