package Dc;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.u;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: SessionAwareTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc/b;", "LDc/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC13383a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final F f3261a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final I1 f3262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C f3263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f3264d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f3265e;

    public b(@k F f12, @k I1 i12, @k C c12, @k u uVar) {
        this.f3261a = f12;
        this.f3262b = i12;
        this.f3263c = c12;
        this.f3264d = uVar;
    }

    public final long a() {
        long jB2;
        I1 i12 = this.f3262b;
        i12.getClass();
        n<Object> nVar = I1.f67278k0[41];
        boolean zBooleanValue = ((Boolean) i12.f67294P.a().getValue()).booleanValue();
        u uVar = this.f3264d;
        if (zBooleanValue) {
            jB2 = b();
        } else {
            uVar.getClass();
            jB2 = u.b();
        }
        return u.c() - Math.max(uVar.f90959a, jB2);
    }

    public final long b() {
        if (this.f3265e != 0) {
            return this.f3265e;
        }
        if (!this.f3263c.l()) {
            V2.f318762a.j("SessionTimer", "Session was not started - timer.start() was not called", null);
        }
        this.f3264d.getClass();
        return u.b();
    }
}
