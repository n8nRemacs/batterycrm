package com.avito.android.publish.slots.delivery_summary.re23;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.slots.delivery_summary.item.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: PublishDeliverySummaryAddItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/re23/a;", "LTV0/b;", "Lcom/avito/android/publish/slots/delivery_summary/re23/n;", "Lcom/avito/android/publish/slots/delivery_summary/item/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<n, y> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f243687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f243688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f243689c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<q> f243690d = new g.a<>(R.layout.publish_delivery_summary_add_item_container, new C7302a());

    /* compiled from: PublishDeliverySummaryAddItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/delivery_summary/re23/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/delivery_summary/re23/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.delivery_summary.re23.a$a, reason: collision with other inner class name */
    public static final class C7302a extends N implements Y41.p<ViewGroup, View, q> {
        public C7302a() {
            super(2);
        }

        @Override // Y41.p
        public final q invoke(ViewGroup viewGroup, View view) {
            return new q(viewGroup, view, a.this.f243688b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f243687a = cVar;
        this.f243688b = aVar;
        this.f243689c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243687a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<q> b() {
        return this.f243690d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof y) && this.f243689c.f439745a.f439749b.b();
    }
}
