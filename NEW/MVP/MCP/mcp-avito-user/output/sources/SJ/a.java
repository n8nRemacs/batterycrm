package SJ;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AvCallsNetworkTestInternalStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSJ/a;", "LUJ/a;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements UJ.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f14893a;

    @Inject
    public a(@k l lVar) {
        this.f14893a = lVar;
    }

    @Override // UJ.a
    public final void a(@Y61.l Long l12) {
        l lVar = this.f14893a;
        if (l12 != null) {
            lVar.putLong("lastForegroundNetworkTestTimestampKey", l12.longValue());
        } else {
            lVar.remove("lastForegroundNetworkTestTimestampKey");
        }
    }

    @Override // UJ.a
    @Y61.l
    public final String b() {
        l lVar = this.f14893a;
        if (lVar.contains("lastForegroundNetworkTestIdKey")) {
            return lVar.getString("lastForegroundNetworkTestIdKey", "");
        }
        return null;
    }

    @Override // UJ.a
    @Y61.l
    public final Long c() {
        l lVar = this.f14893a;
        if (lVar.contains("lastForegroundNetworkTestTimestampKey")) {
            return Long.valueOf(lVar.getLong("lastForegroundNetworkTestTimestampKey", 0L));
        }
        return null;
    }

    @Override // UJ.a
    public final void d(@Y61.l String str) {
        this.f14893a.putString("lastForegroundNetworkTestIdKey", str);
    }
}
