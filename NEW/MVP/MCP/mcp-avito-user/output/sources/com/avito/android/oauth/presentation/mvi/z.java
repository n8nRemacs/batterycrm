package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthFeatureBuilder_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/z;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/mvi/y;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f208383f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f208384a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f208385b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f208386c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I f208387d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f208388e;

    /* compiled from: OAuthFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/z$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public z(@Y61.k w wVar, @Y61.k u uVar, @Y61.k G g12, @Y61.k I i12, @Y61.k dagger.internal.u uVar2) {
        this.f208384a = wVar;
        this.f208385b = uVar;
        this.f208386c = g12;
        this.f208387d = i12;
        this.f208388e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = (v) this.f208384a.get();
        C32904a c32904a = (C32904a) this.f208385b.get();
        F f12 = (F) this.f208386c.get();
        this.f208387d.getClass();
        H h12 = new H();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f208388e.get();
        f208383f.getClass();
        l40.c.f413473b.getClass();
        return new y("OAuth", l40.c.f413474c, new x(vVar, c32904a, screenPerformanceTracker, h12, f12));
    }
}
