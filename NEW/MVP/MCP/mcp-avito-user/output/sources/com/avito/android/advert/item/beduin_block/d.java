package com.avito.android.advert.item.beduin_block;

import com.avito.android.advert.item.beduin_block.a;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsBeduinFormModule_ProvideAdvertDetailsBeduinFormBlueprintsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<List<a>> {

    /* renamed from: a, reason: collision with root package name */
    public final b f73409a;

    public d(b bVar) {
        this.f73409a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.C2203a c2203a = (a.C2203a) this.f73409a.get();
        c.f73408a.getClass();
        List listU = C42745f0.U(new g(c2203a), new h(c2203a), new f(c2203a));
        t.d(listU);
        return listU;
    }
}
