package com.avito.android.wallet.page.topup.form.items.shortcut_section;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortcutSectionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/shortcut_section/a;", "LTV0/b;", "Lcom/avito/android/wallet/page/topup/form/items/shortcut_section/d;", "Lcom/avito/android/wallet/page/topup/form/items/shortcut_section/c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<d, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f328329a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f328330b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<d> f328331c = new g.a<>(R.layout.top_ups_shortcut_section_item, new C10182a());

    /* compiled from: ShortcutSectionBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/wallet/page/topup/form/items/shortcut_section/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/wallet/page/topup/form/items/shortcut_section/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.wallet.page.topup.form.items.shortcut_section.a$a, reason: collision with other inner class name */
    public static final class C10182a extends N implements p<ViewGroup, View, d> {
        public C10182a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            j jVar = a.this.f328330b;
            d dVar = new d(view2);
            RecyclerView recyclerView = (RecyclerView) view2;
            recyclerView.l(new com.avito.android.wallet.page.topup.form.items.bubble.d(recyclerView.getResources()), -1);
            recyclerView.setItemAnimator(null);
            view2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(jVar);
            return dVar;
        }
    }

    @Inject
    public a(@k e eVar, @com.avito.android.wallet.page.topup.form.di.e @k j jVar) {
        this.f328329a = eVar;
        this.f328330b = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f328329a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f328331c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
