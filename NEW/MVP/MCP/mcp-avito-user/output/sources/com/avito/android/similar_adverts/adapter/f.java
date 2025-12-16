package com.avito.android.similar_adverts.adapter;

import TV0.g;
import Vp0.InterfaceC15706a;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.section.title.with_action.SectionTitleWithActionItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SimilarTitleWithActionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/similar_adverts/adapter/f;", "LTV0/b;", "LVp0/a;", "Lcom/avito/android/section/title/with_action/SectionTitleWithActionItem;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.b<InterfaceC15706a, SectionTitleWithActionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Vp0.b f283814a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<Vp0.e> f283815b = new g.a<>(R.layout.similar_title, a.f283816l);

    /* compiled from: SimilarTitleWithActionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LVp0/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LVp0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, Vp0.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f283816l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Vp0.e invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            return new Vp0.e(view2, new com.avito.android.section.title.e(view2), new com.avito.android.section.action.f(view2));
        }
    }

    @Inject
    public f(@k Vp0.b bVar) {
        this.f283814a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f283814a;
    }

    @Override // TV0.b
    @k
    public final g.a<Vp0.e> b() {
        return this.f283815b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SectionTitleWithActionItem;
    }
}
