package com.avito.android.publish.slots.delivery_summary_edit.item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: DeliverySummaryEditItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/a;", "LTV0/b;", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/i;", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<i, n> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f243779a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f243780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f243781c = new g.a<>(R.layout.delivery_summary_edit_v2_item_view, C7305a.f243782l);

    /* compiled from: DeliverySummaryEditItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/delivery_summary_edit/item/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.delivery_summary_edit.item.a$a, reason: collision with other inner class name */
    public static final class C7305a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7305a f243782l = new C7305a();

        public C7305a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, viewGroup);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f243779a = cVar;
        this.f243780b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243779a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f243781c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof n) && !this.f243780b.f439745a.f439749b.b();
    }
}
