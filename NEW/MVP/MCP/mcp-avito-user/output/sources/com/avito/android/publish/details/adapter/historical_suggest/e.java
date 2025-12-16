package com.avito.android.publish.details.adapter.historical_suggest;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.W1;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/e;", "Lcom/avito/android/publish/details/adapter/historical_suggest/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AddressParameter.Value> f233236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f233237c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<AddressParameter.Value> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233236b = cVar;
        this.f233237c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.details.adapter.historical_suggest.c
    @Y61.k
    /* renamed from: H, reason: from getter */
    public final C41981q0 getF233237c() {
        return this.f233237c;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (JO.d) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        JO.d dVar = (JO.d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof W1) {
                obj = obj2;
            }
        }
        W1 w12 = (W1) (obj instanceof W1 ? obj : null);
        if (w12 == null) {
            k(gVar, dVar);
            return;
        }
        String str = w12.f318768a;
        if (str != null) {
            gVar.O7(str);
        } else {
            gVar.ja();
        }
    }

    public final void k(@Y61.k g gVar, @Y61.k JO.d dVar) {
        gVar.t7();
        gVar.setTitle(dVar.f8943c);
        int i12 = 0;
        for (Object obj : dVar.f8945e) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            JO.c cVar = (JO.c) obj;
            gVar.Ld(String.valueOf(i12), cVar.f8939b, cVar.f8940c, cVar.equals(dVar.f8944d));
            i12 = i13;
        }
        gVar.Yb(new d(dVar, this));
    }
}
