package oP0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import cP0.C27083a;
import com.avito.android.analytics.InterfaceC28373a;
import dP0.C39614a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletPinVerificationAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LoP0/a;", "", "a", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44676a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f419758a;

    /* compiled from: WalletPinVerificationAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LoP0/a$a;", "", "<init>", "()V", "", "BIOMETRY_USED", "Ljava/lang/String;", "ERROR_DESCRIPTION", "IS_BIOMETRY_ENABLED", "PASSCODE_ATTEMPT_RANK", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oP0.a$a, reason: collision with other inner class name */
    public static final class C12186a {
        public /* synthetic */ C12186a(C42822w c42822w) {
            this();
        }

        public C12186a() {
        }
    }

    static {
        new C12186a(null);
    }

    @Inject
    public C44676a(@k InterfaceC28373a interfaceC28373a) {
        this.f419758a = interfaceC28373a;
    }

    public static void a(C44676a c44676a, C39614a c39614a, Integer num, Boolean bool, Boolean bool2, String str, int i12) {
        if ((i12 & 2) != 0) {
            num = null;
        }
        if ((i12 & 4) != 0) {
            bool = null;
        }
        if ((i12 & 8) != 0) {
            bool2 = null;
        }
        if ((i12 & 16) != 0) {
            str = null;
        }
        c44676a.getClass();
        d dVar = new d();
        if (num != null) {
            dVar.put("wallet_passcode_attempt_rank", num);
        }
        if (bool != null) {
            dVar.put("is_biometry_enabled", bool);
        }
        if (bool2 != null) {
            dVar.put("biometry_used", bool2);
        }
        if (str != null) {
            dVar.put("error_description", str);
        }
        G0 g02 = G0.f406611a;
        C27083a.a(c44676a.f419758a, c39614a, dVar.b());
    }
}
