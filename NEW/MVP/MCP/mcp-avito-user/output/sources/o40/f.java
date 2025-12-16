package o40;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.offlinization.beduin.analytics.BeduinPatternCacheErrorType;
import com.avito.android.offlinization.beduin.analytics.PatternCacheStartResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BeduinPatternCacheMetrics.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo40/f;", "Lo40/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements InterfaceC44578a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f419369b;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a) {
        this.f419369b = interfaceC28373a;
    }

    @Override // o40.InterfaceC44578a
    public final void a(@k String str, @l String str2, @l Long l12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
        i iVar = new i(str, str2, "aep", l12, null, beduinPatternCacheErrorType);
        InterfaceC28373a interfaceC28373a = this.f419369b;
        interfaceC28373a.c(iVar);
        if (l12 != null) {
            interfaceC28373a.c(new y.c(AK.c.k("performance.patternCache.", str, ".enrichTime"), l12, null));
        }
    }

    @Override // o40.InterfaceC44578a
    public final void b(@k String str, @l String str2, @l String str3, boolean z12, @l BeduinPatternCacheErrorType beduinPatternCacheErrorType) {
        if (str3 == null) {
            str3 = null;
            if (str2 != null) {
                int length = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (str2.charAt(i12) == '_') {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 > -1) {
                    str3 = C43066x.t0(i12, str2);
                }
            }
        }
        this.f419369b.c(new h(str, str2, str3, z12, null, beduinPatternCacheErrorType));
    }

    @Override // o40.InterfaceC44578a
    public final void c(@k PatternCacheStartResult patternCacheStartResult) {
        this.f419369b.c(new y.a("performance.patternCache.start.".concat(patternCacheStartResult.f208528b), 1L));
    }
}
