package com.avito.android.user_advert.di;

import com.avito.android.user_advert.advert.AbstractC35385e;
import com.avito.android.user_advert.advert.C35382d;
import com.avito.android.user_advert.di.InterfaceC35542v;

/* compiled from: MyAdvertDetailsComponent_AdvertDetailsModule_ProvideAdvertIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35543w implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f311816a;

    public C35543w(dagger.internal.l lVar) {
        this.f311816a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        AbstractC35385e abstractC35385e = (AbstractC35385e) this.f311816a.f393949a;
        InterfaceC35542v.a.f311815a.getClass();
        String str = ((C35382d) abstractC35385e).f308519a;
        dagger.internal.t.d(str);
        return str;
    }
}
