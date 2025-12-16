package PX;

import android.content.ContentResolver;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationModule_ProvideContentResolverFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<ContentResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f13115a;

    public k(C30102l3 c30102l3) {
        this.f13115a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f13115a.get();
        i.f13113a.getClass();
        return context.getContentResolver();
    }
}
