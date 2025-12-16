package com.avito.android.analytics.screens;

import arrow.core.AbstractC23662a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrackerResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/analytics/screens/J;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/analytics/screens/J$a;", "Lcom/avito/android/analytics/screens/J$b;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class J {

    /* compiled from: TrackerResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/J$b;", "Lcom/avito/android/analytics/screens/J;", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends J {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f90385a = new b();

        public b() {
            super(null);
        }

        @Override // com.avito.android.analytics.screens.J
        @Y61.k
        public final String a() {
            return "success";
        }
    }

    public /* synthetic */ J(C42822w c42822w) {
        this();
    }

    @Y61.k
    public abstract String a();

    /* compiled from: TrackerResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/J$a;", "Lcom/avito/android/analytics/screens/J;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends J {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C2676a f90383b = new C2676a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC23662a<Throwable, ApiError> f90384a;

        /* compiled from: TrackerResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/J$a$a;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.analytics.screens.J$a$a, reason: collision with other inner class name */
        public static final class C2676a {
            public /* synthetic */ C2676a(C42822w c42822w) {
                this();
            }

            @Y61.k
            public static a a(@Y61.l ApiError apiError, @Y61.l Throwable th2) {
                return th2 != null ? new a(th2) : apiError != null ? new a(apiError) : d();
            }

            @Y61.k
            public static a b(@Y61.l ApiError apiError) {
                return apiError == null ? d() : new a(apiError);
            }

            @Y61.k
            public static a c(@Y61.l Throwable th2) {
                return th2 == null ? d() : new a(th2);
            }

            @Y61.k
            public static a d() {
                return new a(new RuntimeException("unknown"));
            }

            public C2676a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a) {
            super(null);
            this.f90384a = abstractC23662a;
        }

        @Override // com.avito.android.analytics.screens.J
        @Y61.k
        public final String a() {
            return "failure";
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f90384a, ((a) obj).f90384a);
        }

        public final int hashCode() {
            return this.f90384a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Failure(reason=" + this.f90384a + ')';
        }

        public a(@Y61.k Throwable th2) {
            this(new AbstractC23662a.b(th2));
        }

        public a(@Y61.k ApiError apiError) {
            this(new AbstractC23662a.c(apiError));
        }
    }

    public J() {
    }
}
