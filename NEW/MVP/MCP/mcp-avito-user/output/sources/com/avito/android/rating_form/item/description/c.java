package com.avito.android.rating_form.item.description;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DescriptionItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/description/c;", "LTV0/b;", "Lcom/avito/android/rating_form/item/description/j;", "Lcom/avito/android/rating_form/item/description/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements TV0.b<j, com.avito.android.rating_form.item.description.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f248373a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f248375c = new g.a<>(R.layout.rating_form_description_item, new a());

    /* compiled from: DescriptionItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_form/item/description/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_form/item/description/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, c.this.f248374b);
        }
    }

    @Inject
    public c(@Y61.k e eVar, @com.avito.android.rating_form.di.c boolean z12) {
        this.f248373a = eVar;
        this.f248374b = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f248373a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f248375c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof com.avito.android.rating_form.item.description.a) && !this.f248374b;
    }
}
