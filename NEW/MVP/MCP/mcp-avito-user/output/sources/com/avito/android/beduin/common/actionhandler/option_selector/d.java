package com.avito.android.beduin.common.actionhandler.option_selector;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Selector.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/beduin/common/actionhandler/option_selector/k;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final String f100303E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final List<OpenOptionSelectorAction.Option> f100304F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final Y41.l<OpenOptionSelectorAction.Option, G0> f100305G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f100306H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f100307I;

    public d(@Y61.k androidx.appcompat.view.d dVar, @Y61.l String str, @Y61.k List list, @Y61.k Y41.l lVar) throws BlueprintCollisionException {
        super(dVar, 0, 2, null);
        this.f100303E = str;
        this.f100304F = list;
        this.f100305G = lVar;
        com.avito.android.beduin.common.actionhandler.option_selector.konveyor.c cVar = new com.avito.android.beduin.common.actionhandler.option_selector.konveyor.c(new com.avito.android.beduin.common.actionhandler.option_selector.konveyor.e(new c(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f100306H = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        hVar.f338510e = new UV0.c(V(new a(this), list));
        jVar.notifyDataSetChanged();
        this.f100307I = jVar;
        D(R.layout.beduin_option_selector_bottom_sheet_content, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.option_selector_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
        recyclerView.l(new com.avito.android.beduin.common.component.select_option.dialog.c(y6.b(4)), -1);
    }

    public static ArrayList V(Y41.l lVar, List list) {
        List<OpenOptionSelectorAction.Option> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (OpenOptionSelectorAction.Option option : list2) {
            arrayList.add(new com.avito.android.beduin.common.actionhandler.option_selector.konveyor.a(option.getId(), ((Boolean) lVar.invoke(option)).booleanValue(), option.getTitle()));
        }
        return arrayList;
    }
}
