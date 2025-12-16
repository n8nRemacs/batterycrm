package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.InterfaceC36871e4;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.i;
import j.K;
import j.N;
import j.P;
import j.a0;
import j.c0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f360703c;

    /* renamed from: a, reason: collision with root package name */
    public final zzdf f360704a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f360705b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public static final class ConsentStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ConsentStatus[] f360706b = {new ConsentStatus("GRANTED", 0), new ConsentStatus("DENIED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentStatus EF5;

        public ConsentStatus() {
            throw null;
        }

        @N
        public static ConsentStatus valueOf(@N String str) {
            return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
        }

        @N
        public static ConsentStatus[] values() {
            return (ConsentStatus[]) f360706b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public static final class ConsentType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ConsentType[] f360707b = {new ConsentType("AD_STORAGE", 0), new ConsentType("ANALYTICS_STORAGE", 1), new ConsentType("AD_USER_DATA", 2), new ConsentType("AD_PERSONALIZATION", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        ConsentType EF5;

        public ConsentType() {
            throw null;
        }

        @N
        public static ConsentType valueOf(@N String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        @N
        public static ConsentType[] values() {
            return (ConsentType[]) f360707b.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public static class a {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public static class b {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public static class c {
    }

    public FirebaseAnalytics(zzdf zzdfVar) {
        C36729v.j(zzdfVar);
        this.f360704a = zzdfVar;
    }

    @N
    @Keep
    @a0
    public static FirebaseAnalytics getInstance(@N Context context) {
        if (f360703c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f360703c == null) {
                        f360703c = new FirebaseAnalytics(zzdf.zza(context));
                    }
                } finally {
                }
            }
        }
        return f360703c;
    }

    @Keep
    @P
    public static InterfaceC36871e4 getScionFrontendApiImplementation(Context context, @P Bundle bundle) {
        zzdf zzdfVarZza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zzdfVarZza == null) {
            return null;
        }
        return new f(zzdfVarZza);
    }

    @N
    public final Task<String> a() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.f360705b == null) {
                        this.f360705b = new e(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    executorService = this.f360705b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return C37030m.c(new d(this), executorService);
        } catch (RuntimeException e12) {
            this.f360704a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return C37030m.e(e12);
        }
    }

    @N
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.g.f361637m;
            return (String) C37030m.b(((com.google.firebase.installations.g) com.google.firebase.g.c().b(i.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e12) {
            throw new IllegalStateException(e12);
        } catch (ExecutionException e13) {
            throw new IllegalStateException(e13.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @K
    @Deprecated
    public final void setCurrentScreen(@N Activity activity, @c0 @P String str, @c0 @P String str2) {
        this.f360704a.zza(activity, str, str2);
    }
}
