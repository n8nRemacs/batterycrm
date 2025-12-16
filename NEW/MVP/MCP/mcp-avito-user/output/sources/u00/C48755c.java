package u00;

import com.avito.android.util.Kundle;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemScrollStateProviderImpl_Factory.java */
@e
@y
@x
/* renamed from: u00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48755c implements h<C48754b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f439722a;

    public C48755c(l lVar) {
        this.f439722a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Kundle kundle = (Kundle) this.f439722a.f393949a;
        C48754b c48754b = new C48754b();
        if (kundle == null) {
            kundle = new Kundle();
        }
        c48754b.f439721a = kundle;
        return c48754b;
    }
}
