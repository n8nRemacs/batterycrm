package y3;

import Y61.k;
import Y61.l;
import com.avito.android.account.e0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.Session;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import z3.C50361a;
import z3.C50363c;

/* compiled from: SessionChangeTrackerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly3/a;", "Lcom/avito/android/account/e0;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50045a implements e0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f442869a;

    @Inject
    public C50045a(@k InterfaceC28373a interfaceC28373a) {
        this.f442869a = interfaceC28373a;
    }

    @Override // com.avito.android.account.e0
    public final void a(@l String str, boolean z12) {
        if (str == null) {
            str = "";
        }
        this.f442869a.c(new C50361a(str, z12));
    }

    @Override // com.avito.android.account.e0
    public final void b(@l Session session, @l String str) {
        boolean z12 = session != null;
        boolean z13 = (session != null ? session.getRefreshToken() : null) != null;
        if (str == null) {
            str = "";
        }
        this.f442869a.c(new C50363c(z12, z13, str));
    }
}
