package com.avito.android.similar_adverts.adapter.skeleton_title;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.serp.adapter.skeleton.k;
import com.avito.android.serp.adapter.skeleton.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SimilarSkeletonTitleBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/similar_adverts/adapter/skeleton_title/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/skeleton/k;", "Lcom/avito/android/similar_adverts/adapter/skeleton_title/c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<k, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f283818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f283819b = new g.a<>(R.layout.similar_title_skeleton, C8466a.f283820l);

    /* compiled from: SimilarSkeletonTitleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/skeleton/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/skeleton/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.similar_adverts.adapter.skeleton_title.a$a, reason: collision with other inner class name */
    public static final class C8466a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8466a f283820l = new C8466a();

        public C8466a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            l lVar = new l(view);
            lVar.itemView.setPadding(0, 0, 0, 0);
            return lVar;
        }
    }

    @Inject
    public a(@Y61.k d dVar) {
        this.f283818a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f283818a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f283819b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}
