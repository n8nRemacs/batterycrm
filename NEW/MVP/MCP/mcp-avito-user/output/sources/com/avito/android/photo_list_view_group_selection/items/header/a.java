package com.avito.android.photo_list_view_group_selection.items.header;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhotoItemGroupSelectionHeaderBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/header/a;", "LTV0/b;", "Lcom/avito/android/photo_list_view_group_selection/items/header/f;", "Lcom/avito/android/photo_list_view_group_selection/items/header/PhotoItemGroupSelectionHeaderItem;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<f, PhotoItemGroupSelectionHeaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f218417a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f218418b = new g.a<>(R.layout.photo_item_group_selection_header, C6555a.f218419l);

    /* compiled from: PhotoItemGroupSelectionHeaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_list_view_group_selection/items/header/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_list_view_group_selection/items/header/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_list_view_group_selection.items.header.a$a, reason: collision with other inner class name */
    public static final class C6555a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6555a f218419l = new C6555a();

        public C6555a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g((TextView) view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f218417a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f218417a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f218418b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PhotoItemGroupSelectionHeaderItem;
    }
}
