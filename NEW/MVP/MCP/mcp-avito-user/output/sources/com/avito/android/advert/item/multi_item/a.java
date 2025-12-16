package com.avito.android.advert.item.multi_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsMultiItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/multi_item/a;", "LTV0/b;", "Lcom/avito/android/advert/item/multi_item/d;", "Lcom/avito/android/advert/item/multi_item/AdvertDetailsMultiItemItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<d, AdvertDetailsMultiItemItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f77721a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TV0.b<?, ?> f77722b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TV0.b<?, ?> f77723c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f77724d = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g.a<f> f77725e = new g.a<>(R.layout.advert_details_multi_item_item, new C2297a());

    /* compiled from: AdvertDetailsMultiItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/multi_item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/multi_item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.multi_item.a$a, reason: collision with other inner class name */
    public static final class C2297a extends N implements p<ViewGroup, View, f> {
        public C2297a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new f(aVar.f77722b, aVar.f77723c, aVar.f77721a, view);
        }
    }

    public a(@k b bVar, @k TV0.b<?, ?> bVar2, @k TV0.b<?, ?> bVar3) {
        this.f77721a = bVar;
        this.f77722b = bVar2;
        this.f77723c = bVar3;
    }

    @Override // TV0.b
    @k
    public final TV0.d<d, AdvertDetailsMultiItemItem> a() {
        return this.f77724d;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f77725e;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsMultiItemItem;
    }
}
