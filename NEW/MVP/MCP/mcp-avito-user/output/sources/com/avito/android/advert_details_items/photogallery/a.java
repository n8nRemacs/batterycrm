package com.avito.android.advert_details_items.photogallery;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsGalleryBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/photogallery/n;", "Lcom/avito/android/advert_details_items/photogallery/AdvertDetailsGalleryItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<n, AdvertDetailsGalleryItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f85027a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f85028b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f85029c;

    /* compiled from: AdvertDetailsGalleryBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.photogallery.a$a, reason: collision with other inner class name */
    public static final class C2528a extends N implements Y41.p<ViewGroup, View, com.avito.konveyor.adapter.b> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C29640d f85030l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f85031m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2528a(C29640d c29640d, a aVar) {
            super(2);
            this.f85030l = c29640d;
            this.f85031m = aVar;
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            C29640d c29640d = this.f85030l;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[4];
            boolean zBooleanValue = ((Boolean) c29640d.f132203f.a().invoke()).booleanValue();
            a aVar = this.f85031m;
            return zBooleanValue ? new p(view2, aVar.f85028b) : new o(view2, aVar.f85028b);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k C29640d c29640d) {
        this.f85027a = dVar;
        this.f85028b = interfaceC35845m2;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[4];
        this.f85029c = new g.a<>(((Boolean) c29640d.f132203f.a().invoke()).booleanValue() ? R.layout.part_photo_gallery2 : R.layout.part_photo_gallery, new C2528a(c29640d, this));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85027a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f85029c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof AdvertDetailsGalleryItem) && !((AdvertDetailsGalleryItem) aVar).f85024w;
    }
}
