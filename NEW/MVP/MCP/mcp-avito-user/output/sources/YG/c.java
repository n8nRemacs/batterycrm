package Yg;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeScannerIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C18263a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f19608a;

    public c(C30102l3 c30102l3) {
        this.f19608a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C18263a((Context) this.f19608a.get());
    }
}
