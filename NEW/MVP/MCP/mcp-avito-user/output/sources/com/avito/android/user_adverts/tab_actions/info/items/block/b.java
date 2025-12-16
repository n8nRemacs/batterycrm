package com.avito.android.user_adverts.tab_actions.info.items.block;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionBlockInfoItemViewBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/items/block/b;", "LTV0/b;", "Lcom/avito/android/user_adverts/tab_actions/info/items/block/d;", "Lcom/avito/android/user_adverts/tab_actions/info/items/block/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements TV0.b<d, com.avito.android.user_adverts.tab_actions.info.items.block.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f314661a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f314662b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f314663c = new g.a<>(R.layout.user_adverts_action_result_block_item_re23, new a());

    /* compiled from: ActionBlockInfoItemViewBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_adverts/tab_actions/info/items/block/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_adverts/tab_actions/info/items/block/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, d> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view, b.this.f314662b);
        }
    }

    @Inject
    public b(@k e eVar, @k com.avito.android.util.text.a aVar) {
        this.f314661a = eVar;
        this.f314662b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f314661a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f314663c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_adverts.tab_actions.info.items.block.a;
    }
}
