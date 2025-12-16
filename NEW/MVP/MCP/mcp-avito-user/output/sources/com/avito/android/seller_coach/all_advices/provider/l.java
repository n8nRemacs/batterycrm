package com.avito.android.seller_coach.all_advices.provider;

import Bq0.C13176a;
import Bq0.C13178c;
import com.avito.android.deep_linking.links.AllAdvicesLink;
import lv.C43834a;

/* compiled from: AllAdvicesLinkHandlerModule_ProvideAllAdvicesLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13178c f267357a;

    public l(C13178c c13178c) {
        this.f267357a = c13178c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13178c c13178c = this.f267357a;
        k.f267356a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AllAdvicesLink.class, new C13176a(), new C43834a.b.C11809b(c13178c));
    }
}
