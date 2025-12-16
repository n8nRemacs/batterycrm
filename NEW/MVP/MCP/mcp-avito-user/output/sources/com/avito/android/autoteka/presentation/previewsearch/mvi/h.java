package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Of.InterfaceC14680a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.items.readyToPreviewSearch.ReadyToPreviewSearchItem;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AutotekaPreviewSearchFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/h;", "Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "LOf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends q<AutotekaPreviewSearchAction, AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState, InterfaceC14680a> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f97648k;

    /* compiled from: AutotekaPreviewSearchFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "LOf/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<q<AutotekaPreviewSearchAction, AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState, InterfaceC14680a>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97649l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f97650m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l f97651n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ j f97652o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
            super(1);
            this.f97649l = aVar;
            this.f97650m = screenPerformanceTracker;
            this.f97651n = lVar;
            this.f97652o = jVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<AutotekaPreviewSearchAction, AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState, InterfaceC14680a> qVar) {
            q<AutotekaPreviewSearchAction, AutotekaPreviewSearchInternalAction, AutotekaPreviewSearchState, InterfaceC14680a> qVar2 = qVar;
            qVar2.f92009e = this.f97649l;
            qVar2.f92011g = new o(this.f97650m, this.f97651n);
            qVar2.f92010f = this.f97652o;
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar, @Y61.k j jVar, @Y61.k l lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k AutotekaPreviewSearchDetails autotekaPreviewSearchDetails) {
        ReadyToPreviewSearchItem readyToPreviewSearchItem = new ReadyToPreviewSearchItem(null, 1, 0 == true ? 1 : 0);
        String str = autotekaPreviewSearchDetails.f96224b;
        super("PreviewSearch", new AutotekaPreviewSearchState.ReadyToPreviewSearch(readyToPreviewSearchItem, null, str != null ? C43066x.K(str) : true, 2, null), new a(aVar, screenPerformanceTracker, lVar, jVar));
        this.f97648k = screenPerformanceTracker;
    }
}
