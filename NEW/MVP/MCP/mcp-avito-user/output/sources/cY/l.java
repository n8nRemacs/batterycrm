package CY;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MessengerGraphiteCounter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCY/l;", "LCY/k;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f2243a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f2244b;

    public l(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k String str) {
        this.f2243a = str;
        this.f2244b = interfaceC28373a;
    }

    @Override // CY.k
    public final void a() {
        c("error");
    }

    @Override // CY.k
    public final void b() {
        c("success");
    }

    public final void c(String str) {
        StringBuilder sb2 = new StringBuilder("messenger.");
        String str2 = this.f2243a;
        y.a aVar = new y.a(H.o(sb2, str2, '.', str), 0L, 2, null);
        V2.f318762a.c("graphite", androidx.compose.ui.graphics.colorspace.e.n("counter hit: key=", str2, ", outcome=", str), null);
        this.f2244b.c(aVar);
    }
}
