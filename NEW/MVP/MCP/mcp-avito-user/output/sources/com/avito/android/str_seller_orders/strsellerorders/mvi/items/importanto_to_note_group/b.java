package com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImportantToNoteGroupItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/b;", "LTV0/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/g;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<g, com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f289982a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f289983b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f289984c = new g.a<>(R.layout.str_orders_seller_important_to_note_group_item, new a());

    /* compiled from: ImportantToNoteGroupItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, b.this.f289983b);
        }
    }

    @Inject
    public b(@k e eVar, @k com.avito.android.util.text.a aVar) {
        this.f289982a = eVar;
        this.f289983b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f289982a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f289984c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.a;
    }
}
