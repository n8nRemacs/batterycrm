package com.avito.android.bxcontent.call;

import com.avito.android.B2;
import com.avito.android.deal_confirmation.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DialogsAfterCallHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f109650a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f109651b;

    /* renamed from: c, reason: collision with root package name */
    public final u f109652c;

    public c(l lVar, u uVar, Provider provider) {
        this.f109650a = lVar;
        this.f109651b = provider;
        this.f109652c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((DialogsAfterCallState) this.f109650a.f393949a, this.f109651b.get(), (d) this.f109652c.get());
    }
}
