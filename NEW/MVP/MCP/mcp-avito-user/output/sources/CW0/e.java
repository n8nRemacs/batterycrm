package Cw0;

import Cw0.InterfaceC13365a;
import Cw0.c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SilentUpdateDownloadAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw0/e;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f2802a;

    @Inject
    public e(@k InterfaceC28373a interfaceC28373a) {
        this.f2802a = interfaceC28373a;
    }

    public final void a(@k InterfaceC13365a interfaceC13365a, @l String str) {
        String str2;
        if (interfaceC13365a.equals(InterfaceC13365a.b.f2796a)) {
            str2 = "success";
        } else {
            if (!(interfaceC13365a instanceof InterfaceC13365a.C0138a)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "fail:" + ((InterfaceC13365a.C0138a) interfaceC13365a).f2795a;
        }
        this.f2802a.c(new C13366b(str2, str));
    }

    public final void b(@k c cVar, @l String str) {
        String strConcat;
        if (cVar.equals(c.b.f2799a)) {
            strConcat = "success:version_actual";
        } else if (cVar.equals(c.C0139c.f2800a)) {
            strConcat = "success:version_not_actual";
        } else {
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            strConcat = "fail:".concat(((c.a) cVar).f2798a);
        }
        this.f2802a.c(new d(strConcat, str));
    }
}
