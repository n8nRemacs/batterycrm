package com.avito.android.search.subscriptions.adapter;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchSubscriptionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/subscriptions/adapter/a;", "LTV0/b;", "Lcom/avito/android/search/subscriptions/adapter/k;", "Lcom/avito/android/search/subscriptions/adapter/d;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<k, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f263859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f263860b = new g.a<>(R.layout.saved_search_item, C7874a.f263861l);

    /* compiled from: SearchSubscriptionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/search/subscriptions/adapter/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/search/subscriptions/adapter/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.search.subscriptions.adapter.a$a, reason: collision with other inner class name */
    public static final class C7874a extends N implements p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7874a f263861l = new C7874a();

        public C7874a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view);
        }
    }

    @Inject
    public a(@Y61.k e eVar) {
        this.f263859a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f263859a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f263860b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof d;
    }
}
