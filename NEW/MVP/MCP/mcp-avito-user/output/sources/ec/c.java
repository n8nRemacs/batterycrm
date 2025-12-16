package Ec;

import Y61.k;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GraphitePrefix.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEc/c;", "LEc/b;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes11.dex */
public final class c implements InterfaceC13473b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f4112a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f4113b;

    @Inject
    public c(@k C c12) {
        String str;
        String strN = c12.n();
        String strR = c12.r();
        String strM0 = C43066x.m0(strN, strR + '.', strN);
        boolean zR2 = C43066x.r(strM0, '.');
        boolean zQ2 = C43066x.q(strM0, "demo", false);
        boolean zQ3 = C43066x.q(strM0, "test", false);
        boolean zQ4 = C43066x.q(strM0, "design", false);
        if (!L.f(strN, strR) && zR2 && !zQ2 && !zQ3 && !zQ4) {
            throw new IllegalArgumentException(AK.c.k("Unknown application [", strN, "]. Please support this prefix explicitly.").toString());
        }
        if (!C43066x.h0(strN, c12.r(), false)) {
            throw new IllegalStateException(("Unsupported application [" + strN + ']').toString());
        }
        String str2 = c12.o().f318576a;
        if (L.f(str2, "release")) {
            str = "android";
        } else if (L.f(str2, "benchmark")) {
            str = "android-benchmark-" + c12.i();
        } else {
            str = "android-" + c12.o().f318576a;
        }
        this.f4112a = str;
        this.f4113b = c12.a() + ".os." + c12.j();
    }

    @Override // Ec.InterfaceC13473b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF4112a() {
        return this.f4112a;
    }

    @Override // Ec.InterfaceC13473b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF4113b() {
        return this.f4113b;
    }
}
