package com.avito.android.rating_form.item.multiLineInput;

import Kh0.C14315a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiLineInputItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/multiLineInput/b;", "LTV0/b;", "Lcom/avito/android/rating_form/item/multiLineInput/j;", "Lcom/avito/android/rating_form/item/multiLineInput/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<j, com.avito.android.rating_form.item.multiLineInput.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f248466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14315a f248467b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248468c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f248469d = new g.a<>(R.layout.rating_form_multi_line_input_item, new a());

    /* compiled from: MultiLineInputItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_form/item/multiLineInput/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_form/item/multiLineInput/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, b.this.f248467b);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k C14315a c14315a, @com.avito.android.rating_form.di.c boolean z12) {
        this.f248466a = dVar;
        this.f248467b = c14315a;
        this.f248468c = z12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f248466a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f248469d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof com.avito.android.rating_form.item.multiLineInput.a) && !this.f248468c;
    }
}
