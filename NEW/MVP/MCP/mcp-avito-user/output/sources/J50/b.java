package J50;

import K50.b;
import K50.d;
import K50.f;
import K50.g;
import K50.l;
import Y61.k;
import com.avito.android.util.C35866p0;
import dagger.internal.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: PassportJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJ50/b;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f8752a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        a.f8751a.getClass();
        return b1.g(new C35866p0(l.class, P0.j(new Q("ok", l.c.class), new Q("failure", l.a.class), new Q("no_active_session", l.b.class))), new C35866p0(d.class, P0.j(new Q("ok", d.b.class), new Q("no_active_session", d.a.class))), new C35866p0(f.class, P0.j(new Q("ok", f.b.class), new Q("no_active_session", f.a.class))), new C35866p0(g.class, P0.j(new Q("ok", g.b.class), new Q("no_active_session", g.a.class))), new C35866p0(K50.b.class, P0.j(new Q("ok", b.c.class), new Q("error-dialog", b.a.class), new Q("no_active_session", b.C0553b.class))));
    }
}
