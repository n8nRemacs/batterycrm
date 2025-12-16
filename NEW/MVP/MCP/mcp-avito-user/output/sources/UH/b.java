package UH;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: GsmCallStarterStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUH/b;", "LUH/a;", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f16324a;

    @Inject
    public b(@k l lVar) {
        this.f16324a = lVar;
    }

    @Override // UH.a
    public final int a() {
        return this.f16324a.getInt("callClickCounter", 0);
    }

    @Override // UH.a
    public final void b(int i12) {
        this.f16324a.a(i12, "callClickCounter");
    }

    @Override // UH.a
    public final void c() {
        this.f16324a.putBoolean("wasOneClickGsmCallPermissionRequestedKey", true);
    }

    @Override // UH.a
    public final boolean d() {
        return this.f16324a.getBoolean("wasOneClickGsmCallPermissionRequestedKey", false);
    }
}
