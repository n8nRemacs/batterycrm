package i10;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectedAppealAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: i10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C41210c implements h<C41209b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f398341a;

    public C41210c(Provider<InterfaceC28373a> provider) {
        this.f398341a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41209b(this.f398341a.get());
    }
}
