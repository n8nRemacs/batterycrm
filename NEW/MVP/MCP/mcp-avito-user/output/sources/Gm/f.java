package gM;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import hM.C40851c;
import hM.InterfaceC40849a;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: IacProblemStartupTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f396462a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f396463b;

    /* renamed from: c, reason: collision with root package name */
    public final C40851c f396464c;

    public f(Provider provider, dagger.internal.f fVar, C40851c c40851c) {
        this.f396462a = provider;
        this.f396463b = fVar;
        this.f396464c = c40851c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f396462a.get(), (InterfaceC28373a) this.f396463b.get(), (InterfaceC40849a) this.f396464c.get());
    }
}
