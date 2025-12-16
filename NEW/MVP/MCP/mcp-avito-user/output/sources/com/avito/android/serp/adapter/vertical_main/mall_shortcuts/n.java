package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MallShortcutsWidgetView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/n;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.android.serp.c implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f273025b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f273026c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f273027d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public N f273028e;

    /* compiled from: MallShortcutsWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<MallShortcutItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f273029l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(MallShortcutItem mallShortcutItem) {
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) throws BlueprintCollisionException {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mall_shortcuts_recycler);
        this.f273025b = recyclerView;
        this.f273028e = a.f273029l;
        com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.a aVar = new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.a(new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.d(new m(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f273026c = hVar;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
        boolean z12 = C35835l0.p(recyclerView.getContext()) || recyclerView.getContext().getResources().getBoolean(R.bool.is_tablet);
        int i12 = z12 ? 4 : 3;
        k kVar = new k(z12);
        this.f273027d = kVar;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12);
        gridLayoutManager.f53667M = kVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.l(new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.b(i12, kVar), -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.vertical_main.mall_shortcuts.l
    @SuppressLint({"NotifyDataSetChanged"})
    public final void Mq(@Y61.k MallShortcutsWidgetItem mallShortcutsWidgetItem, @Y61.k Y41.l<? super MallShortcutItem, G0> lVar) {
        ArrayList arrayList = mallShortcutsWidgetItem.f272974c;
        this.f273027d.f272997f = arrayList;
        com.avito.konveyor.util.a.a(this.f273026c, arrayList);
        RecyclerView.Adapter adapter = this.f273025b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f273028e = (N) lVar;
    }
}
