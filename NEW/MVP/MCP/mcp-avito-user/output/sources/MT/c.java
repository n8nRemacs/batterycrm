package Mt;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvUploadIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C14526a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f11044a;

    public c(C30102l3 c30102l3) {
        this.f11044a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14526a((Context) this.f11044a.get());
    }
}
