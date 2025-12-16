package com.avito.android.vas_union.ui.items.tabs;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2TabsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/tabs/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/tabs/h;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final TabGroup f323255b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f323256c;

    /* compiled from: VasUnionV2TabsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_union/ui/items/tabs/i$a", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tab_group.layout.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f323257a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, G0> lVar) {
            this.f323257a = lVar;
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@l d.c cVar) {
            if (cVar != null) {
                this.f323257a.invoke(Integer.valueOf(cVar.f180792b));
            }
        }
    }

    public i(@k View view) {
        super(view);
        this.f323255b = (TabGroup) view.findViewById(R.id.vas_union_v2_tabs_item);
    }

    @Override // com.avito.android.vas_union.ui.items.tabs.h
    public final void y6(@k List<com.avito.android.lib.design.tab_group.b> list, int i12, @k Y41.l<? super Integer, G0> lVar) {
        a aVar = this.f323256c;
        TabGroup tabGroup = this.f323255b;
        if (aVar != null) {
            tabGroup.m(aVar);
        }
        tabGroup.l();
        com.avito.android.lib.design.tab_group.c.a(tabGroup, list, Integer.valueOf(i12));
        a aVar2 = new a(lVar);
        tabGroup.d(aVar2);
        this.f323256c = aVar2;
    }
}
