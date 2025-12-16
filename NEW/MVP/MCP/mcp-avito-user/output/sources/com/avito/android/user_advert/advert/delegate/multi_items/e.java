package com.avito.android.user_advert.advert.delegate.multi_items;

import com.avito.android.C29640d;
import com.avito.android.util.Kundle;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiItemsBlockPresenterDelegate_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f308679a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308680b;

    public e(l lVar, u uVar) {
        this.f308679a = lVar;
        this.f308680b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Kundle) this.f308679a.f393949a, (C29640d) this.f308680b.get());
    }
}
