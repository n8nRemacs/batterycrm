package com.yandex.div.core.dagger;

import com.yandex.div.core.C37923s;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38043z;
import u21.C48774a;

/* compiled from: Div2Module_ProvideDivPreloaderFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class d implements dagger.internal.h<h0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f367400a;

    /* renamed from: b, reason: collision with root package name */
    public final C37923s f367401b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f367402c;

    public d(dagger.internal.u uVar, C37923s c37923s, dagger.internal.u uVar2) {
        this.f367400a = uVar;
        this.f367401b = c37923s;
        this.f367402c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h0((C38043z) this.f367400a.get(), this.f367401b.f367651a.f367579j, (C48774a) this.f367402c.get());
    }
}
