package Jz;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaSdkIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: Jz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14267d implements h<C14265b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f9203a;

    public C14267d(C30102l3 c30102l3) {
        this.f9203a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14265b((Context) this.f9203a.get());
    }
}
