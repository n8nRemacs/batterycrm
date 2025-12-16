package RH0;

import SK0.b;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerItemCloseWithPortfolioUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRH0/d;", "LRH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f14257a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f14258b;

    @Inject
    public d(@k f fVar, @k SK0.b bVar) {
        this.f14257a = fVar;
        this.f14258b = bVar;
    }

    @Override // RH0.b
    public final void a() {
        if (this.f14257a.a()) {
            c cVar = new c(this);
            b.a.a(this.f14258b, new a(), null, null, cVar, 6);
        }
    }
}
