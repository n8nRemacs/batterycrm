package com.avito.android.user_advert.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.user_advert.advert.C35463z;
import com.avito.android.user_advert.advert.InterfaceC35461y;

/* compiled from: BaseAdvertDetailsModule_MyAdvertDetailsActionMenuConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35480g implements dagger.internal.h<InterfaceC35461y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f310905a;

    public C35480g(dagger.internal.l lVar) {
        this.f310905a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f310905a.f393949a;
        C35479f c35479f = C35479f.f310904a;
        return new C35463z(resources.getString(R.string.menu_share));
    }
}
