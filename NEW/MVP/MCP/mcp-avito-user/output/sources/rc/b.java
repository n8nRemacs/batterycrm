package RC;

import SC.d;
import SC.f;
import Y61.k;
import Y61.l;
import ac.C19864a;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28403a;
import com.avito.android.analytics.event.C28405b;
import com.avito.android.analytics.event.C28444v;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.W0;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import sc.C48156e;

/* compiled from: FavoritesAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRC/b;", "LRC/a;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f14191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f14192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C29640d f14193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f14194d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C19864a f14195e;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k E e12, @k C29640d c29640d, @k e eVar, @k C19864a c19864a) {
        this.f14191a = interfaceC28373a;
        this.f14192b = e12;
        this.f14193c = c29640d;
        this.f14194d = eVar;
        this.f14195e = c19864a;
    }

    @Override // RC.a
    public final void Y(@k String str, @l String str2, boolean z12) {
        this.f14191a.c(new com.avito.android.analytics.call.c(str, null, str2, z12 ? "xs" : "s", 0, null, null, this.f14195e.v().getValue().booleanValue(), 96, null));
    }

    @Override // RC.a
    public final void h0(@k String str, @k ContactSource contactSource, @l String str2, @l ScreenIdField screenIdField, @l String str3) {
        String str4 = contactSource.f89925b ? "xl" : "s";
        this.f14191a.c(new i1(this.f14193c, this.f14191a, this.f14194d.a(), null, str, str4, Integer.valueOf(contactSource.f89926c), screenIdField != null ? screenIdField.f90257b : null, str2, str3));
        C48156e.f437918a.a();
    }

    @Override // RC.a
    public final void i0(@k String str) {
        this.f14191a.c(new C28444v(str, this.f14192b.a()));
    }

    @Override // RC.a
    public final void j0() {
        this.f14191a.c(new SC.b());
    }

    @Override // RC.a
    public final void k(@k String str) {
        this.f14191a.c(new W0(str, "button"));
    }

    @Override // RC.a
    public final void k0(@k String str, @k String str2) {
        this.f14191a.c(new C28405b(str, str2));
    }

    @Override // RC.a
    public final void l0(@k String str, @k String str2) {
        this.f14191a.c(new C28403a(str, str2));
    }

    @Override // RC.a
    public final void m0() {
        this.f14191a.c(new f());
    }

    @Override // RC.a
    public final void n0(int i12, @l Map<String, String> map) {
        this.f14191a.c(new d(i12, map));
    }
}
