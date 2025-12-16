package com.avito.android.analytics.screens.tracker;

import kotlin.Metadata;

/* compiled from: ScreenTrackerFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/H;", "", "a", "c", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface H {

    /* compiled from: ScreenTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/H$a;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f90737a;

        static {
            new a();
            f90737a = new c("screen", true);
        }
    }

    /* compiled from: ScreenTrackerFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: ScreenTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/H$c;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f90738a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f90739b;

        public c(@Y61.k String str, boolean z12) {
            this.f90738a = str;
            this.f90739b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f90738a, cVar.f90738a) && this.f90739b == cVar.f90739b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90739b) + (this.f90738a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TrackedContentInfo(contentType=");
            sb2.append(this.f90738a);
            sb2.append(", isCoreContentType=");
            return androidx.appcompat.app.r.x(sb2, this.f90739b, ')');
        }
    }

    @Y61.k
    com.avito.android.analytics.screens.o a();

    @Y61.k
    InterfaceC28499v b(@Y61.k c cVar);

    @Y61.k
    InterfaceC28501x c(@Y61.k c cVar);
}
