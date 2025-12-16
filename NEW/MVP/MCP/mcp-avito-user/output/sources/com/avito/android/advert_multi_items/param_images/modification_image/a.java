package com.avito.android.advert_multi_items.param_images.modification_image;

import Qa.InterfaceC14873a;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModificationImageBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/modification_image/a;", "LTV0/b;", "Lcom/avito/android/advert_multi_items/param_images/modification_image/b;", "Lcom/avito/android/advert_multi_items/param_images/modification_image/ModificationImageItem;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<b, ModificationImageItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85959a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f85960b = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<c> f85961c = new g.a<>(R.layout.advert_details_multi_item_param_image_item, new C2563a());

    /* compiled from: ModificationImageBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_multi_items/param_images/modification_image/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_multi_items/param_images/modification_image/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_multi_items.param_images.modification_image.a$a, reason: collision with other inner class name */
    public static final class C2563a extends N implements p<ViewGroup, View, c> {
        public C2563a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(a.this.f85959a, view);
        }
    }

    public a(@k InterfaceC14873a interfaceC14873a) {
        this.f85959a = interfaceC14873a;
    }

    @Override // TV0.b
    @k
    public final TV0.d<b, ModificationImageItem> a() {
        return this.f85960b;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f85961c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ModificationImageItem;
    }
}
