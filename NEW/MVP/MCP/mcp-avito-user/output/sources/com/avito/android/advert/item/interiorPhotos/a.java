package com.avito.android.advert.item.interiorPhotos;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotosBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/interiorPhotos/a;", "LTV0/b;", "Lcom/avito/android/advert/item/interiorPhotos/l;", "Lcom/avito/android/advert/item/interiorPhotos/InteriorPhotosItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<l, InteriorPhotosItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.interior_photos_block.a f76588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f76589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f76590c = new g.a<>(R.layout.advert_details_interior_photos, new C2270a());

    /* compiled from: InteriorPhotosBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/interiorPhotos/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/interiorPhotos/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.interiorPhotos.a$a, reason: collision with other inner class name */
    public static final class C2270a extends N implements p<ViewGroup, View, m> {
        public C2270a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m((ViewGroup) view, a.this.f76588a);
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.interior_photos_block.a aVar, @Y61.k g gVar) {
        this.f76588a = aVar;
        this.f76589b = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f76589b;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f76590c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof InteriorPhotosItem;
    }
}
