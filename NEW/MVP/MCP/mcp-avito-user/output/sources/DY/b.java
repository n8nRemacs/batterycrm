package DY;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31661q;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpamActionAnalyticsManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDY/b;", "LDY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f3234a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashSet f3235b = new LinkedHashSet();

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f3234a = interfaceC28373a;
    }

    @Override // DY.a
    public final void a(@k String str, @k String str2) {
        LinkedHashSet linkedHashSet = this.f3235b;
        if (linkedHashSet.contains(str2)) {
            return;
        }
        linkedHashSet.add(str2);
        this.f3234a.c(new C31661q(str, str2));
    }
}
