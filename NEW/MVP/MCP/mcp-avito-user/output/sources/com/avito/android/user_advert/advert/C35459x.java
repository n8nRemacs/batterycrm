package com.avito.android.user_advert.advert;

import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.user_advert.advert.C35453u;
import java.util.Set;

/* compiled from: MyAdvertBeduinViewModel_Factory_Impl.java */
@dagger.internal.e
/* renamed from: com.avito.android.user_advert.advert.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35459x implements C35453u.a {

    /* renamed from: a, reason: collision with root package name */
    public final C35457w f310659a;

    public C35459x(C35457w c35457w) {
        this.f310659a = c35457w;
    }

    @Override // com.avito.android.user_advert.advert.C35453u.a
    public final C35453u create() {
        C35457w c35457w = this.f310659a;
        return new C35453u((n.a) c35457w.f310653a.get(), (Set) c35457w.f310654b.get(), (com.avito.beduin.v2.engine.component.B) c35457w.f310655c.get(), (aU0.b) c35457w.f310656d.get());
    }
}
