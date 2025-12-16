package com.avito.android.photo_list_view_groups.blueprint;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PhotoItemGroupsBlueprint.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/b;", "Lcom/avito/android/photo_list_view_groups/blueprint/a;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.photo_list_view_groups.blueprint.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f218489a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f218490b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f218491c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g80.d f218492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f218493e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f218494f = new g.a<>(R.layout.photo_item_groups_container, new a());

    /* compiled from: PhotoItemGroupsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_list_view_groups/blueprint/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_list_view_groups/blueprint/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            com.avito.android.photo_list_view_groups.view_holders.l lVar = new com.avito.android.photo_list_view_groups.view_holders.l();
            b bVar = b.this;
            return new j(view2, lVar, bVar.f218490b, bVar.f218491c, bVar.f218492d);
        }
    }

    @Inject
    public b(@Y61.k e eVar, @Y61.k R0 r02, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar, @l0 @Y61.k l<SimpleTestGroupWithNone> lVar) {
        this.f218489a = eVar;
        this.f218490b = r02;
        this.f218491c = hVar;
        this.f218492d = dVar;
        this.f218493e = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f218489a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f218494f;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.z) && !this.f218493e.f439745a.f439749b.b();
    }
}
