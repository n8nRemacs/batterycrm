package mH;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigApplyAnalyticsSender_Factory.java */
@e
@y
@x
/* renamed from: mH.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43963b implements h<C43962a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f414442a;

    public C43963b(Provider<InterfaceC28373a> provider) {
        this.f414442a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43962a(this.f414442a.get());
    }
}
