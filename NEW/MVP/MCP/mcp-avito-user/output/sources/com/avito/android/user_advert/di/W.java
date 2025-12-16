package com.avito.android.user_advert.di;

import com.avito.android.user_advert.advert.AbstractC35385e;
import com.avito.android.user_advert.advert.C35388f;
import com.avito.android.user_advert.di.V;

/* compiled from: MyDraftDetailsComponent_DraftDetailsModule_ProvideAdvertIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class W implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f310900a;

    public W(dagger.internal.l lVar) {
        this.f310900a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        AbstractC35385e abstractC35385e = (AbstractC35385e) this.f310900a.f393949a;
        V.b.f310899a.getClass();
        String str = ((C35388f) abstractC35385e).f308897a;
        dagger.internal.t.d(str);
        return str;
    }
}
