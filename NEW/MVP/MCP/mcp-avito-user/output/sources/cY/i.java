package CY;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GraphiteTimer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LCY/i;", "T", "Lcom/avito/android/analytics/timer/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i<T> implements com.avito.android.analytics.timer.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.timer.d<T> f2240a;

    public i(@Y61.k com.avito.android.server_time.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Map map) {
        this.f2240a = new com.avito.android.analytics.timer.d<>(aVar, new j(interfaceC28373a, map));
    }

    @Override // com.avito.android.analytics.timer.a
    public final void a() {
        this.f2240a.a();
    }

    @Override // com.avito.android.analytics.timer.a
    public final void b(T t12) {
        this.f2240a.b(t12);
    }
}
