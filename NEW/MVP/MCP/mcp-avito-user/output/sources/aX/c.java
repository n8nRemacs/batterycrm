package Ax;

import com.avito.android.util.Kundle;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DisclaimerPDViewedInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C13096b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f709a;

    public c(l lVar) {
        this.f709a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Kundle kundle = (Kundle) this.f709a.f393949a;
        C13096b c13096b = new C13096b();
        if (kundle == null) {
            kundle = new Kundle();
        }
        c13096b.f708a = kundle;
        return c13096b;
    }
}
