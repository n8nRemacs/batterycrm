package com.avito.android.analytics.screens.tracker;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnknownScreenTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/Z;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface Z {

    /* compiled from: UnknownScreenTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/Z$a;", "Lcom/avito/android/analytics/screens/tracker/Z;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.analytics.screens.F f90798a = new com.avito.android.analytics.screens.F();

        /* renamed from: b, reason: collision with root package name */
        public long f90799b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f90800c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f90801d = -1;

        @Inject
        public a(@Y61.k com.avito.android.analytics.screens.D d12) {
        }

        @Override // com.avito.android.analytics.screens.tracker.Z
        public final void a(long j12) {
            this.f90801d = j12;
        }

        @Override // com.avito.android.analytics.screens.tracker.Z
        public final void b(long j12) {
            this.f90799b = j12;
        }

        @Override // com.avito.android.analytics.screens.tracker.Z
        public final void c() {
            this.f90798a.c();
        }

        @Override // com.avito.android.analytics.screens.tracker.Z
        @Y61.k
        public final ScreenTransfer d() {
            return new ScreenTransfer(this.f90799b, this.f90800c, this.f90801d);
        }

        @Override // com.avito.android.analytics.screens.tracker.Z
        public final void f() {
            this.f90800c = this.f90798a.b();
        }
    }

    void a(long j12);

    void b(long j12);

    void c();

    @Y61.k
    ScreenTransfer d();

    void f();
}
