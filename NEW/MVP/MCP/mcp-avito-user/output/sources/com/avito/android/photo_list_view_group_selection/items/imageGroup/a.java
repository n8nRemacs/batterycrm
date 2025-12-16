package com.avito.android.photo_list_view_group_selection.items.imageGroup;

import TV0.g;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemRadio;
import e80.InterfaceC39964a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhotoItemGroupSelectionImageGroupBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/a;", "LTV0/b;", "Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/f;", "Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/PhotoItemGroupSelectionImageGroupItem;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<f, PhotoItemGroupSelectionImageGroupItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f218428a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f218429b;

    /* compiled from: PhotoItemGroupSelectionImageGroupBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_list_view_group_selection.items.imageGroup.a$a, reason: collision with other inner class name */
    public static final class C6556a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC39964a, G0> f218430l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6556a(l<? super InterfaceC39964a, G0> lVar) {
            super(2);
            this.f218430l = lVar;
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g((ListItemRadio) view, this.f218430l);
        }
    }

    @Inject
    public a(@k d dVar, @k l<? super InterfaceC39964a, G0> lVar) {
        this.f218428a = dVar;
        this.f218429b = new g.a<>(R.layout.photo_item_group_selection_image_group, new C6556a(lVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f218428a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f218429b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PhotoItemGroupSelectionImageGroupItem;
    }
}
