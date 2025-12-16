package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/i;", "LTV0/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/o;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/k;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements TV0.b<o, k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f212004a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f212005b = new g.a<>(R.layout.item_vertical_header, a.f212006l);

    /* compiled from: Header.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f212006l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view);
        }
    }

    @Inject
    public i(@Y61.k l lVar) {
        this.f212004a = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f212004a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f212005b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof k;
    }
}
