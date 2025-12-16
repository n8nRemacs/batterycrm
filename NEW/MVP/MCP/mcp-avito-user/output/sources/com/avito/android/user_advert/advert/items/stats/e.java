package com.avito.android.user_advert.advert.items.stats;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.statistics.StatisticsView;

/* compiled from: MyAdvertStatsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/stats/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/stats/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StatisticsView f310292b;

    /* compiled from: MyAdvertStatsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f310293l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f310293l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = this.f310293l;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public e(@k View view) {
        super(view);
        this.f310292b = (StatisticsView) view.findViewById(R.id.statistics);
    }

    @Override // com.avito.android.user_advert.advert.items.stats.d
    public final void Py(int i12) {
        this.f310292b.setLikes(i12);
    }

    @Override // com.avito.android.user_advert.advert.items.stats.d
    public final void SB(int i12, int i13) {
        StatisticsView statisticsView = this.f310292b;
        I5.a(statisticsView.f430571e, statisticsView.a(i12, i13), false);
    }

    @Override // com.avito.android.user_advert.advert.items.stats.d
    public final void c10() {
        D6.w(this.f310292b.f430571e);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310292b.link.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.stats.d
    public final void pE(int i12, int i13) {
        StatisticsView statisticsView = this.f310292b;
        statisticsView.f430568b.setText(statisticsView.a(i12, i13));
    }

    @Override // com.avito.android.user_advert.advert.items.stats.d
    public final void ye(@l Y41.a<G0> aVar) {
        this.f310292b.setOnStatisticsClickListener(new a(aVar));
    }
}
