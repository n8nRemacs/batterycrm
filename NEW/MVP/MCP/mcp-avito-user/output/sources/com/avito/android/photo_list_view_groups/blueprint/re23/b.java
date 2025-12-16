package com.avito.android.photo_list_view_groups.blueprint.re23;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PhotoItemGroupsRe23Blueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/re23/b;", "Lcom/avito/android/photo_list_view_groups/blueprint/re23/a;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.photo_list_view_groups.blueprint.re23.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f218514a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f218515b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f218516c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view_groups.h f218517d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g80.d f218518e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f218519f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g.a<i> f218520g = new g.a<>(R.layout.photo_item_groups_re23_container, new a());

    /* compiled from: PhotoItemGroupsRe23Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/photo_list_view_groups/blueprint/re23/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_list_view_groups/blueprint/re23/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new i(view, bVar.f218515b, bVar.f218516c, new com.avito.android.photo_list_view_groups.view_holders.k(), bVar.f218517d, bVar.f218518e);
        }
    }

    @Inject
    public b(@k d dVar, @k com.avito.android.util.text.a aVar, @k R0 r02, @k com.avito.android.photo_list_view_groups.h hVar, @k g80.d dVar2, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f218514a = dVar;
        this.f218515b = aVar;
        this.f218516c = r02;
        this.f218517d = hVar;
        this.f218518e = dVar2;
        this.f218519f = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f218514a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f218520g;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.z) && this.f218519f.f439745a.f439749b.b();
    }
}
