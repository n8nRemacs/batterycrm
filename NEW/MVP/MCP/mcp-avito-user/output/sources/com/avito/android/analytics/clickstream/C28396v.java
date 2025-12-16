package com.avito.android.analytics.clickstream;

import android.content.Context;
import android.content.SharedPreferences;
import cc.C27172a;
import cc.C27174c;
import com.avito.android.analytics.InterfaceC28373a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickStreamCrashReporter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/clickstream/v;", "Lcom/avito/android/analytics/clickstream/t;", "a", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.clickstream.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28396v implements InterfaceC28394t {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f89833g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f89834a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f89835b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.error_reporting.f> f89836c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.error_reporting.memory.b f89837d;

    /* renamed from: e, reason: collision with root package name */
    public volatile SharedPreferences f89838e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f89839f;

    /* compiled from: ClickStreamCrashReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/analytics/clickstream/v$a;", "", "<init>", "()V", "", "LAST_EXECUTION_FINISHED_WITH_CRASH", "Ljava/lang/String;", "TAG", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.clickstream.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ClickStreamCrashReporter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.clickstream.v$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            C28396v c28396v = (C28396v) this.receiver;
            com.avito.android.error_reporting.f fVar = c28396v.f89836c.get();
            if (!fVar.f147912g) {
                throw new IllegalStateException("Not initialized yet - please use either [initialized] or [callWhenInitialized]");
            }
            FirebaseCrashlytics firebaseCrashlytics = fVar.f147911f;
            if (firebaseCrashlytics == null) {
                firebaseCrashlytics = null;
            }
            boolean zDidCrashOnPreviousExecution = firebaseCrashlytics.didCrashOnPreviousExecution();
            SharedPreferences sharedPreferences = c28396v.f89838e;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            boolean z12 = sharedPreferences.getBoolean("last_execution_finished_with_crash", false);
            if (zDidCrashOnPreviousExecution) {
                c28396v.f89834a.c(new C27172a(z12));
            }
            if (z12) {
                SharedPreferences sharedPreferences2 = c28396v.f89838e;
                (sharedPreferences2 != null ? sharedPreferences2 : null).edit().remove("last_execution_finished_with_crash").apply();
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C28396v(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Context context, @Y61.k h31.e<com.avito.android.error_reporting.f> eVar, @Y61.k com.avito.android.error_reporting.memory.b bVar) {
        this.f89834a = interfaceC28373a;
        this.f89835b = context;
        this.f89836c = eVar;
        this.f89837d = bVar;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final synchronized void a() {
        if (!this.f89839f) {
            this.f89838e = this.f89835b.getSharedPreferences("clickstream_crash_reporter", 0);
            Thread.setDefaultUncaughtExceptionHandler(new C28395u(this, Thread.getDefaultUncaughtExceptionHandler(), 0));
            com.avito.android.error_reporting.f fVar = this.f89836c.get();
            b bVar = new b(0, this, C28396v.class, "performUnhandledExceptionsCheck", "performUnhandledExceptionsCheck()V", 0);
            if (fVar.f147912g) {
                bVar.invoke();
            } else {
                fVar.f147913h.add(bVar);
            }
            this.f89839f = true;
        }
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized, reason: from getter */
    public final boolean getF89839f() {
        return this.f89839f;
    }

    @j.k0
    public final void o(@Y61.k Throwable th2) {
        this.f89834a.c(new C27174c(th2));
        this.f89837d.getClass();
        this.f89834a.c(new cc.h(com.avito.android.error_reporting.memory.b.a(), th2));
        SharedPreferences sharedPreferences = this.f89838e;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        sharedPreferences.edit().putBoolean("last_execution_finished_with_crash", true).commit();
    }
}
