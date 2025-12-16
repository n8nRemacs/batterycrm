package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToggleV2Blueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/a;", "LTV0/b;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/c;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Item;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<c, ToggleV2Item> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f281730a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f281731b = new g.a<>(R.layout.short_term_rent_booking_form_toggle_v2_item, C8397a.f281732l);

    /* compiled from: ToggleV2Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.short_term_rent.bookingform.items.toggle_v2.a$a, reason: collision with other inner class name */
    public static final class C8397a extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8397a f281732l = new C8397a();

        public C8397a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    @Inject
    public a(@k f fVar) {
        this.f281730a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f281730a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f281731b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ToggleV2Item;
    }
}
