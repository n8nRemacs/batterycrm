package zi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.w;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinScreenTracker_Factory.java */
@e
@y
@x
/* renamed from: zi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50570b implements h<C50569a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f444174a;

    /* renamed from: b, reason: collision with root package name */
    public final u f444175b;

    public C50570b(u uVar, Provider provider) {
        this.f444174a = provider;
        this.f444175b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50569a(this.f444174a.get(), (ScreenPerformanceTracker) this.f444175b.get());
    }
}
