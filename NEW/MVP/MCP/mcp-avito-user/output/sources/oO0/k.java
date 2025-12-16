package Oo0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SbcClientMetricsLogger.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/k;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f12544a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f12545b;

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k CreateDiscountDispatchArg createDiscountDispatchArg) {
        String str;
        this.f12544a = interfaceC28373a;
        if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcConfiguratorArgs) {
            str = "usecase";
        } else {
            if (!(createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "vas";
        }
        this.f12545b = str;
    }

    public final void a(@Y61.k AbstractC14720a abstractC14720a) {
        c("confirm_dispatch." + abstractC14720a.f12523a);
    }

    public final void b(@Y61.k AbstractC14721b abstractC14721b) {
        c("create_dispatch.initial." + abstractC14721b.f12528a);
    }

    public final void c(String str) {
        this.f12544a.c(new y.a(H.o(new StringBuilder("app_ver.sbc."), this.f12545b, '.', str), 0L, 2, null));
    }
}
