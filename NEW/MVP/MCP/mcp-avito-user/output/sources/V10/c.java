package V10;

import com.avito.android.util.S3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientSearchResponseMapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f16895a;

    public c(S3 s32) {
        this.f16895a = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f16895a.getClass();
        return new b(S3.a());
    }
}
