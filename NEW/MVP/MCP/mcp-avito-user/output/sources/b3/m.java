package B3;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LastUserStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB3/m;", "LB3/g;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f849a;

    @Inject
    public m(@Y61.k AK0.l lVar) {
        this.f849a = lVar;
    }

    @Override // B3.g
    public final void setUserId(@Y61.l String str) {
        AK0.h.f304a.getClass();
        this.f849a.putString(AK0.h.f308e, str);
    }
}
