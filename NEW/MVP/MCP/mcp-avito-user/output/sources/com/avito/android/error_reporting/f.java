package com.avito.android.error_reporting;

import com.avito.android.error_reporting.error_reporter.n;
import com.avito.android.util.C;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import j.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FirebaseErrorReporter.kt */
@k0
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/f;", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/util/J5;", "a", "_common_error-reporting-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class f extends J5 implements n {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f147908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C f147909d;

    /* renamed from: f, reason: collision with root package name */
    public volatile FirebaseCrashlytics f147911f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f147912g;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HashSet f147910e = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f147913h = new ArrayList();

    /* compiled from: FirebaseErrorReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/error_reporting/f$a;", "", "<init>", "()V", "", "CUSTOM_KEYS_LIMIT", "I", "STRING_VALUE_LENGTH_LIMIT", "_common_error-reporting-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k c cVar, @Y61.k C c12) {
        this.f147908c = cVar;
        this.f147909d = c12;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final synchronized void b(@Y61.k String str, @Y61.k String str2) {
        if (p(str)) {
            return;
        }
        FirebaseCrashlytics firebaseCrashlytics = this.f147911f;
        if (firebaseCrashlytics == null) {
            firebaseCrashlytics = null;
        }
        if (str2.length() > 896) {
            this.f147909d.o().getClass();
            str2 = "[TRUNCATED]:".concat(str2.substring(0, 884));
        }
        firebaseCrashlytics.setCustomKey(str, str2);
        this.f147910e.add(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final int d() {
        return 896;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void e(@Y61.k String str) {
        FirebaseCrashlytics firebaseCrashlytics = this.f147911f;
        if (firebaseCrashlytics == null) {
            firebaseCrashlytics = null;
        }
        firebaseCrashlytics.setUserId(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void g(@Y61.k Throwable th2) {
        FirebaseCrashlytics firebaseCrashlytics = this.f147911f;
        if (firebaseCrashlytics == null) {
            firebaseCrashlytics = null;
        }
        firebaseCrashlytics.recordException(th2);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void log(@Y61.k String str) {
        FirebaseCrashlytics firebaseCrashlytics = this.f147911f;
        if (firebaseCrashlytics == null) {
            firebaseCrashlytics = null;
        }
        firebaseCrashlytics.log(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final synchronized void n(int i12, @Y61.k String str) {
        if (p(str)) {
            return;
        }
        FirebaseCrashlytics firebaseCrashlytics = this.f147911f;
        if (firebaseCrashlytics == null) {
            firebaseCrashlytics = null;
        }
        firebaseCrashlytics.setCustomKey(str, i12);
        this.f147910e.add(str);
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        this.f147911f = (FirebaseCrashlytics) this.f147908c.f147860b.getValue();
        this.f147912g = true;
        V2.f318762a.c("FirebaseCrashReporterFacade", "initialized", null);
        Iterator it = this.f147913h.iterator();
        while (it.hasNext()) {
            ((Y41.a) it.next()).invoke();
        }
        this.f147913h.clear();
    }

    public final boolean p(String str) {
        HashSet hashSet = this.f147910e;
        if (hashSet.size() <= 64 || hashSet.contains(str)) {
            return false;
        }
        this.f147909d.o().getClass();
        return true;
    }
}
