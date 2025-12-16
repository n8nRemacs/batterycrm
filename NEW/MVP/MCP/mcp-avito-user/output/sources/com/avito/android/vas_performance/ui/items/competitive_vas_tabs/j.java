package com.avito.android.vas_performance.ui.items.competitive_vas_tabs;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CompetitiveVasTabsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas_tabs/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas_tabs/i;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Chips f321674b;

    public j(@k View view) {
        super(view);
        this.f321674b = (Chips) view.findViewById(R.id.competitive_vas_tabs);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas_tabs.i
    public final void X1(@k l<? super com.avito.android.lib.design.chips.h, G0> lVar) {
        this.f321674b.setChipsSelectedListener(new a(lVar));
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas_tabs.i
    public final void mc(@k List<com.avito.android.vas_performance.ui.items.competitive_vas_tabs.a> list) {
        this.f321674b.setData(list);
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas_tabs.i
    public final void nw(int i12) {
        this.f321674b.p(i12, false);
    }

    /* compiled from: CompetitiveVasTabsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_performance/ui/items/competitive_vas_tabs/j$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<com.avito.android.lib.design.chips.h, G0> f321675a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super com.avito.android.lib.design.chips.h, G0> lVar) {
            this.f321675a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            ((f) this.f321675a).invoke(hVar);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
