package q80;

import android.content.ContentResolver;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryPickerRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: q80.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47258e implements h<C47257d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.x> f429055b;

    public C47258e(u uVar, Provider provider) {
        this.f429054a = uVar;
        this.f429055b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47257d((ContentResolver) this.f429054a.get(), this.f429055b.get());
    }
}
