package com.avito.android.publish.slots.delivery_summary.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: DeliverySummaryItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/d;", "LTV0/b;", "Lcom/avito/android/publish/slots/delivery_summary/item/s;", "Lcom/avito/android/publish/slots/delivery_summary/item/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.b<s, y> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f243579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f243580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<w> f243581c = new g.a<>(R.layout.delivery_summary_v2_item_view, a.f243582l);

    /* compiled from: DeliverySummaryItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/delivery_summary/item/w;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/delivery_summary/item/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, w> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f243582l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final w invoke(ViewGroup viewGroup, View view) {
            return new w(view, viewGroup);
        }
    }

    @Inject
    public d(@Y61.k f fVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f243579a = fVar;
        this.f243580b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243579a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<w> b() {
        return this.f243581c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof y) && !this.f243580b.f439745a.f439749b.b();
    }
}
