package com.avito.android.analytics.screens.compose;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ComposeScreenTracker.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "", "a", "c", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C2677a f90568a = C2677a.f90569a;

    /* compiled from: ComposeScreenTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a$a;", "", "<init>", "()V", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.compose.a$a, reason: collision with other inner class name */
    public static final class C2677a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C2677a f90569a = new C2677a();

        @Y61.k
        public static com.avito.android.analytics.screens.compose.b a(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
            AbstractC23662a.f56267a.getClass();
            return new com.avito.android.analytics.screens.compose.b(new AbstractC23662a.c(screenPerformanceTracker));
        }
    }

    /* compiled from: ComposeScreenTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: ComposeScreenTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a$c;", "Lcom/avito/android/analytics/screens/compose/a;", "<init>", "()V", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f90570b = new c();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f90571c = "LocalComposeScreenTracker не инициализирован.Используйте функции трекеров только внутри ScreenTracker.";

        @Override // com.avito.android.analytics.screens.compose.a
        public final void a(long j12) {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar) {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void d() {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void e() {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void f() {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void g(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar) {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void l() {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void m(@Y61.k String str) {
            V2.f318762a.e(f90571c, null);
        }

        @Override // com.avito.android.analytics.screens.compose.a
        public final void n(@Y61.k String str, @Y61.k J j12, @Y61.l Integer num) {
            V2.f318762a.e(f90571c, null);
        }
    }

    void a(long j12);

    void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar);

    void d();

    void e();

    void f();

    void g(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar);

    void l();

    void m(@Y61.k String str);

    void n(@Y61.k String str, @Y61.k J j12, @Y61.l Integer num);
}
