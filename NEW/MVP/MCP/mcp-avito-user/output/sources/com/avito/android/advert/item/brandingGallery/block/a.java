package com.avito.android.advert.item.brandingGallery.block;

import K4.i;
import Oi0.C14700d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.L0;
import com.avito.konveyor.adapter.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandingGalleryBlockBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/block/a;", "LTV0/b;", "Lcom/avito/android/advert/item/brandingGallery/block/e;", "Lcom/avito/android/advert/item/brandingGallery/block/BrandingGalleryBlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<e, BrandingGalleryBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f74126a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f74127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f74128c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final L0 f74129d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f74130e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<e> f74131f = new g.a<>(R.layout.advert_details_branding_gallery_block, new C2205a());

    /* compiled from: BrandingGalleryBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/brandingGallery/block/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/brandingGallery/block/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.brandingGallery.block.a$a, reason: collision with other inner class name */
    public static final class C2205a extends N implements p<ViewGroup, View, e> {
        public C2205a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            return new e(view2, aVar.f74127b, aVar.f74128c, aVar.f74129d, aVar.f74130e);
        }
    }

    @Inject
    public a(@k c cVar, @K4.a @k h hVar, @i @k C14700d c14700d, @k L0 l02, @k com.avito.android.advert_core.analytics.a aVar) {
        this.f74126a = cVar;
        this.f74127b = hVar;
        this.f74128c = c14700d;
        this.f74129d = l02;
        this.f74130e = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74126a;
    }

    @Override // TV0.b
    @k
    public final g.a<e> b() {
        return this.f74131f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BrandingGalleryBlockItem;
    }
}
