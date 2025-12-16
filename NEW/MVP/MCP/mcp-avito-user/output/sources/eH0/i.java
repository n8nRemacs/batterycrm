package eH0;

import com.avito.android.advert.item.delivery_suggests.l;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsInfoCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeH0/i;", "LeH0/h;", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f395086a = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public i() {
    }

    @Override // eH0.h
    public final void a(int i12) {
        this.f395086a.accept(Integer.valueOf(i12));
    }

    @Override // eH0.h
    @Y61.k
    public final C41981q0 b() {
        com.jakewharton.rxrelay3.c<Integer> cVar = this.f395086a;
        return l.l(cVar, cVar);
    }
}
