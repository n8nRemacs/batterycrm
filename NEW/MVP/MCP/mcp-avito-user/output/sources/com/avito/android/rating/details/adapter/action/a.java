package com.avito.android.rating.details.adapter.action;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/adapter/action/a;", "LTV0/b;", "Lcom/avito/android/rating/details/adapter/action/g;", "Lcom/avito/android/rating/details/adapter/action/ActionItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<g, ActionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f246482a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f246483b = new g.a<>(R.layout.rating_details_action, C7386a.f246484l);

    /* compiled from: ActionItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating/details/adapter/action/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating/details/adapter/action/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating.details.adapter.action.a$a, reason: collision with other inner class name */
    public static final class C7386a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7386a f246484l = new C7386a();

        public C7386a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f246482a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f246482a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f246483b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ActionItem;
    }
}
