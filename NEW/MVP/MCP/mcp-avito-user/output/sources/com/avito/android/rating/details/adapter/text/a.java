package com.avito.android.rating.details.adapter.text;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/adapter/text/a;", "LTV0/b;", "Lcom/avito/android/rating/details/adapter/text/d;", "Lcom/avito/android/rating/details/adapter/text/TextItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<d, TextItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f246566a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f246567b = new g.a<>(R.layout.text_rating_details_item, C7389a.f246568l);

    /* compiled from: TextItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating/details/adapter/text/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating/details/adapter/text/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating.details.adapter.text.a$a, reason: collision with other inner class name */
    public static final class C7389a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7389a f246568l = new C7389a();

        public C7389a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    public a(@k b bVar) {
        this.f246566a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f246566a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f246567b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TextItem;
    }
}
