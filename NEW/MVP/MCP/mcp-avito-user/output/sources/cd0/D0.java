package Cd0;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PublishSelectCategoryEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/D0;", "Lcom/avito/android/analytics/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D0 implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    public final int f2384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f2385c = C28461l.a(com.avito.android.analytics_adjust.t.a(AdjustTokenWithFirebaseName.f91185y));

    public D0(int i12) {
        this.f2384b = i12;
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f2385c.getEvents();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(D0.class, sb2, " with category: ");
        sb2.append(this.f2384b);
        return sb2.toString();
    }
}
