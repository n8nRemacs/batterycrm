package com.avito.android.serp.adapter.images_and_links_item;

import TV0.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import sr0.C48406d;
import sr0.InterfaceC48403a;
import sr0.InterfaceC48404b;

/* compiled from: ImagesWithLinksItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/images_and_links_item/l;", "Lcom/avito/android/serp/adapter/images_and_links_item/ImagesWithLinksItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<l, ImagesWithLinksItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f270176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f270177b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48406d f270178c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f270179d = new g.a<>(R.layout.images_with_links_item, new a(this));

    @Inject
    public b(@Y61.k g gVar, @InterfaceC48404b @Y61.k com.avito.konveyor.a aVar, @Y61.k @InterfaceC48403a C48406d c48406d) {
        this.f270176a = gVar;
        this.f270177b = aVar;
        this.f270178c = c48406d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270176a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f270179d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ImagesWithLinksItem;
    }
}
