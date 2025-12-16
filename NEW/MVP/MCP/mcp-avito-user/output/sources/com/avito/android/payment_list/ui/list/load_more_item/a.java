package com.avito.android.payment_list.ui.list.load_more_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentLoadMoreBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment_list/ui/list/load_more_item/a;", "LTV0/b;", "Lcom/avito/android/payment_list/ui/list/load_more_item/c;", "Lcom/avito/android/payment_list/ui/list/load_more_item/PaymentLoadMoreItem;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<c, PaymentLoadMoreItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f215038a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<c> f215039b = new g.a<>(R.layout.payment_load_more_item, C6448a.f215040l);

    /* compiled from: PaymentLoadMoreBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/payment_list/ui/list/load_more_item/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/payment_list/ui/list/load_more_item/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment_list.ui.list.load_more_item.a$a, reason: collision with other inner class name */
    public static final class C6448a extends N implements p<ViewGroup, View, c> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6448a f215040l = new C6448a();

        public C6448a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f215038a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f215038a;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f215039b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PaymentLoadMoreItem;
    }
}
