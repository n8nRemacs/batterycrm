package rz;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendReportIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C47944b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f437272a;

    public c(C30102l3 c30102l3) {
        this.f437272a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47944b((Context) this.f437272a.get());
    }
}
