package Ve0;

import com.avito.android.util.S3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupContactConverter_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ve0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15671b implements dagger.internal.h<C15670a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f17338a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f17339b;

    public C15671b(h hVar, S3 s32) {
        this.f17338a = hVar;
        this.f17339b = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f17338a.get();
        this.f17339b.getClass();
        return new C15670a(gVar, S3.a());
    }
}
