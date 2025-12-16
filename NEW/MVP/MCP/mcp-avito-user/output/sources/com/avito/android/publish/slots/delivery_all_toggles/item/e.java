package com.avito.android.publish.slots.delivery_all_toggles.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryAllTogglesItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/e;", "LTV0/b;", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/k;", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.b<k, r> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f243495a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f243496b = new g.a<>(R.layout.delivery_all_toggles_content, a.f243497l);

    /* compiled from: DeliveryAllTogglesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/delivery_all_toggles/item/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f243497l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view, viewGroup);
        }
    }

    @Inject
    public e(@Y61.k g gVar) {
        this.f243495a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243495a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f243496b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof r;
    }
}
