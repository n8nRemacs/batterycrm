package com.avito.android.user_advert.advert.items.gallery;

import TV0.g;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertGalleryItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/gallery/e;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/gallery/n;", "Lcom/avito/android/user_advert/advert/items/gallery/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.b<n, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f309418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f309419b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f309420c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f309421d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f309422e = new g.a<>(R.layout.my_advert_gallery_item, new d(this));

    @Inject
    public e(@Y61.k h hVar, @Y61.k r rVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k R0 r02) {
        this.f309418a = rVar;
        this.f309419b = interfaceC35845m2;
        this.f309420c = r02;
        this.f309421d = hVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<n, c> a() {
        return this.f309421d;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f309422e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}
