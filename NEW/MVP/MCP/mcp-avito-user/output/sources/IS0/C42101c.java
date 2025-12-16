package is0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sc.C48156e;

/* compiled from: SerpAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis0/c;", "Lis0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: is0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42101c implements InterfaceC42100b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f405330a;

    /* renamed from: b, reason: collision with root package name */
    public final long f405331b;

    public C42101c(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.e eVar) {
        this.f405330a = interfaceC28373a;
        this.f405331b = eVar.a();
        C48156e c48156e = C48156e.f437918a;
    }

    @Override // is0.InterfaceC42100b
    @k
    public final TreeClickStreamParent getParent() {
        return new TreeClickStreamParent(this.f405331b, "SERP", null, null);
    }
}
