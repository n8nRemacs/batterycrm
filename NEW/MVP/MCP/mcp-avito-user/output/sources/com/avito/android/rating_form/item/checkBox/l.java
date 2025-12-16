package com.avito.android.rating_form.item.checkBox;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.rating_form.step.di.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckableGroupItemRedesignBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/l;", "LTV0/b;", "Lcom/avito/android/rating_form/item/checkBox/n;", "Lcom/avito/android/rating_form/item/checkBox/CheckableGroupItem;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements TV0.b<n, CheckableGroupItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f248320a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248321b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248322c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f248323d = new g.a<>(R.layout.rating_form_checkable_group_item_redesign, new a());

    /* compiled from: CheckableGroupItemRedesignBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_form/item/checkBox/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_form/item/checkBox/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, o> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            l lVar = l.this;
            return new o(view, lVar.f248321b, lVar.f248322c);
        }
    }

    @Inject
    public l(@Y61.k h hVar, @com.avito.android.rating_form.di.c boolean z12, @e.c boolean z13) {
        this.f248320a = hVar;
        this.f248321b = z12;
        this.f248322c = z13;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f248320a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f248323d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof CheckableGroupItem) && this.f248321b;
    }
}
