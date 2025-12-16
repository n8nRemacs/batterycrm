package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.C28379d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ErrorDialogInstantEventFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/U;", "Lcom/avito/android/analytics/clickstream/d$e;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class U implements C28379d.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.inhouse_transport.o f89772a;

    /* compiled from: ErrorDialogInstantEventFilter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f89773l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public U(@Y61.k com.avito.android.analytics.inhouse_transport.o oVar) {
        this.f89772a = oVar;
    }

    @Override // com.avito.android.analytics.clickstream.C28379d.e
    public final boolean a(@Y61.k com.avito.android.analytics.provider.clickstream.a aVar) {
        if (aVar.getF19677b() != 5596) {
            return false;
        }
        com.avito.android.analytics.inhouse_transport.o oVar = this.f89772a;
        if (oVar.isRunning()) {
            return false;
        }
        oVar.a(V.f89774a, a.f89773l);
        return true;
    }
}
