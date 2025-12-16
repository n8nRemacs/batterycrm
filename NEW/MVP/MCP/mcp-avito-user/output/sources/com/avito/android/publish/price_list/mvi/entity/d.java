package com.avito.android.publish.price_list.mvi.entity;

import androidx.view.N0;
import com.avito.android.publish.price_list.domain.j;
import com.avito.android.publish.price_list.mvi.m;
import com.avito.android.publish.price_list.mvi.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: SelectPriceListMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final n f238833a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f238834b;

    public d(n nVar, Provider provider) {
        this.f238833a = nVar;
        this.f238834b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f238833a.get();
        j jVar = this.f238834b.get();
        c cVar = new c(mVar, null, 2, null);
        C43175k.K(new C43197r1(new b(cVar, null), jVar.b(N0.a(cVar))), N0.a(cVar));
        return cVar;
    }
}
