package com.avito.android.publish.slots.delivery_summary_edit.re23;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.slots.delivery_summary_edit.item.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: PublishDeliverySummaryEditItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/re23/a;", "LTV0/b;", "Lcom/avito/android/publish/slots/delivery_summary_edit/re23/h;", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<h, n> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f243830a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f243831b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f243832c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<j> f243833d = new g.a<>(R.layout.publish_delivery_summary_edit_item_container, new C7306a());

    /* compiled from: PublishDeliverySummaryEditItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/delivery_summary_edit/re23/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/delivery_summary_edit/re23/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.delivery_summary_edit.re23.a$a, reason: collision with other inner class name */
    public static final class C7306a extends N implements p<ViewGroup, View, j> {
        public C7306a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(viewGroup, view, a.this.f243831b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f243830a = cVar;
        this.f243831b = aVar;
        this.f243832c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243830a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f243833d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof n) && this.f243832c.f439745a.f439749b.b();
    }
}
