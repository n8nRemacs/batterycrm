package Dw0;

import Dw0.InterfaceC13450c;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SilentUpdateInstallAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDw0/e;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dw0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13452e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f3560a;

    @Inject
    public C13452e(@k InterfaceC28373a interfaceC28373a) {
        this.f3560a = interfaceC28373a;
    }

    public final void a(@k InterfaceC13450c interfaceC13450c, @l String str) {
        String strConcat;
        if (interfaceC13450c.equals(InterfaceC13450c.b.f3558a)) {
            strConcat = "success";
        } else {
            if (!(interfaceC13450c instanceof InterfaceC13450c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            strConcat = "fail:".concat(((InterfaceC13450c.a) interfaceC13450c).f3557a);
        }
        this.f3560a.c(new C13451d(strConcat, str));
    }
}
