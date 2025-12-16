package com.avito.android.home.tags_item;

import Oi0.C14701e;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionTagsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/tags_item/b;", "Lcom/avito/android/home/tags_item/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.home.tags_item.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.adapter.h> f162492a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14701e f162493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f162494c;

    /* compiled from: SectionTagsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/home/tags_item/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/home/tags_item/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            com.avito.konveyor.adapter.h hVar = bVar.f162492a.get();
            return new k(view, hVar, bVar.f162493b.a(hVar));
        }
    }

    @Inject
    public b(@AI.b @Y61.k Provider<com.avito.konveyor.adapter.h> provider, @AI.a @Y61.k C14701e c14701e, @Y61.k d dVar) {
        this.f162492a = provider;
        this.f162493b = c14701e;
        this.f162494c = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f162494c;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.section_tags_item, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SectionTagsItem;
    }
}
