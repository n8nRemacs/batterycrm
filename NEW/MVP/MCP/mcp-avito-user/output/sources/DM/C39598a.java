package dM;

import Y61.k;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.squareup.anvil.annotations.ContributesBinding;
import hM.InterfaceC40849a;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.text.C43066x;
import mM.InterfaceC43981a;

/* compiled from: IacCrashRegisterImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdM/a;", "LmM/a;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: dM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39598a implements InterfaceC43981a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f393829a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40849a f393830b;

    @Inject
    public C39598a(@k InterfaceC28373a interfaceC28373a, @k InterfaceC40849a interfaceC40849a) {
        this.f393829a = interfaceC28373a;
        this.f393830b = interfaceC40849a;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public static boolean c(Throwable th2) {
        String message = th2.getMessage();
        if (message != null && C43066x.q(message, "CallStyle notifications must be", true)) {
            return true;
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            return c(cause);
        }
        return false;
    }

    @Override // mM.InterfaceC43981a
    @k
    public final Map<String, Integer> a() {
        return this.f393830b.a();
    }

    @Override // mM.InterfaceC43981a
    public final void b(@k Throwable th2) {
        boolean zC2 = c(th2);
        InterfaceC28373a interfaceC28373a = this.f393829a;
        if (zC2) {
            interfaceC28373a.c(new y.a(AK.c.g(this.f393830b.d(), "iac.registered_crash.on_crash.CALL_STYLE_NOTIFICATION.count_"), 0L, 2, null));
        } else {
            interfaceC28373a.c(new y.a("iac.registered_crash.on_crash.other", 0L, 2, null));
        }
    }
}
