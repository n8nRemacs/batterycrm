package com.avito.android.error_reporting;

import android.app.Application;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FirebaseCrashlyticsInstanceProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/c;", "", "_common_error-reporting-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f147859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147860b = C42727D.c(new a());

    /* compiled from: FirebaseCrashlyticsInstanceProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<FirebaseCrashlytics> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final FirebaseCrashlytics invoke() {
            com.google.firebase.g.g(c.this.f147859a);
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
            return FirebaseCrashlytics.getInstance();
        }
    }

    @Inject
    public c(@Y61.k Application application) {
        this.f147859a = application;
    }
}
