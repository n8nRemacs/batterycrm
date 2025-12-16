package com.avito.android.blueprints.publish.reg_number;

import android.text.TextWatcher;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;

/* compiled from: VehicleRegNumberInputItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z<String>> f106429a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106430b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106431c;

    public q(u uVar, u uVar2, Provider provider) {
        this.f106429a = provider;
        this.f106430b = uVar;
        this.f106431c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f106429a.get(), (TextWatcher) this.f106430b.get(), (com.avito.android.util.text.a) this.f106431c.get());
    }
}
