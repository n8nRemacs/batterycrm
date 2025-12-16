package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select;

import RJ0.a;
import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateSelectView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/h;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f317732c;

    public h(@k View view) {
        super(view);
        this.f317731b = view;
        Chips chips = (Chips) view.findViewById(R.id.dynamic_content_chips);
        this.f317732c = chips;
        SegmentType segmentType = SegmentType.f317718c;
        SegmentChip segmentChip = new SegmentChip(0, view.getContext().getString(R.string.user_stats_period_today));
        SegmentType segmentType2 = SegmentType.f317718c;
        SegmentChip segmentChip2 = new SegmentChip(1, view.getContext().getString(R.string.user_stats_period_week));
        SegmentType segmentType3 = SegmentType.f317718c;
        SegmentChip segmentChip3 = new SegmentChip(2, view.getContext().getString(R.string.user_stats_period_month));
        SegmentType segmentType4 = SegmentType.f317718c;
        chips.setData(C42745f0.U(segmentChip, segmentChip2, segmentChip3, new SegmentChip(3, view.getContext().getString(R.string.user_stats_period_year))));
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.g
    public final void wR(@k l lVar, @k DateSelectItem dateSelectItem) {
        a aVar = new a(lVar, dateSelectItem);
        Chips chips = this.f317732c;
        chips.setChipsSelectedListener(aVar);
        SegmentType segmentType = dateSelectItem.f317714c;
        if (segmentType == null) {
            chips.j();
            return;
        }
        List<Integer> listN = chips.n();
        boolean zIsEmpty = listN.isEmpty();
        int i12 = segmentType.f317724b;
        if (zIsEmpty || ((Number) C42745f0.E(listN)).intValue() != i12) {
            chips.p(i12, false);
        }
    }

    /* compiled from: DateSelectView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/h$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<RJ0.a, G0> f317733a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DateSelectItem f317734b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super RJ0.a, G0> lVar, DateSelectItem dateSelectItem) {
            this.f317733a = lVar;
            this.f317734b = dateSelectItem;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k com.avito.android.lib.design.chips.h hVar) {
            List<String> list = this.f317734b.f317715d;
            int i12 = ((SegmentChip) hVar).f317716b;
            this.f317733a.invoke(new a.e(i12, list.get(i12)));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
