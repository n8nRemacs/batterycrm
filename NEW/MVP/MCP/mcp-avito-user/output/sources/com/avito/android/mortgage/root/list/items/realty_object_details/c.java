package com.avito.android.mortgage.root.list.items.realty_object_details;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyObjectDetailsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/c;", "LTV0/b;", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/q;", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements TV0.b<q, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f202771a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<s> f202772b = new g.a<>(R.layout.mortgage_root_item_realty_object_details, a.f202773l);

    /* compiled from: RealtyObjectDetailsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/mortgage/root/list/items/realty_object_details/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f202773l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            return new s(view);
        }
    }

    @Inject
    public c(@Y61.k o oVar) {
        this.f202771a = oVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f202771a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<s> b() {
        return this.f202772b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof e;
    }
}
