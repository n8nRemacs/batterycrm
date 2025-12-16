package Bp0;

import Y61.k;
import com.avito.android.search.filter.converter.common.ParameterCard;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationCardsParameterAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBp0/d;", "LBp0/c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.search.filter.analytics.c f1726a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AtomicBoolean f1727b = new AtomicBoolean(false);

    @Inject
    public d(@k com.avito.android.search.filter.analytics.c cVar) {
        this.f1726a = cVar;
    }

    @Override // Bp0.c
    public final void a(@k ParameterCard parameterCard) {
        Object objSingletonList;
        String f262924c = parameterCard.getF262924c();
        if (f262924c == null) {
            f262924c = parameterCard.getF262923b();
        }
        if (parameterCard instanceof ParameterCard.MultiSelect) {
            objSingletonList = Collections.singletonList(((ParameterCard.MultiSelect) parameterCard).f262922i);
        } else {
            if (!(parameterCard instanceof ParameterCard.Select)) {
                throw new NoWhenBranchMatchedException();
            }
            objSingletonList = ((ParameterCard.Select) parameterCard).f262930i;
        }
        this.f1726a.h(Collections.singletonMap(f262924c, objSingletonList));
    }

    @Override // Bp0.c
    public final void b() {
        AtomicBoolean atomicBoolean = this.f1727b;
        if (atomicBoolean.get()) {
            return;
        }
        this.f1726a.e();
        atomicBoolean.set(true);
    }
}
