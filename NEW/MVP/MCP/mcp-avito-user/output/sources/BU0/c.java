package Bu0;

import Cu0.InterfaceC13353a;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrderRequestObserver.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBu0/c;", "LBu0/b;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13353a f1778a;

    @Inject
    public c(@k InterfaceC13353a interfaceC13353a) {
        this.f1778a = interfaceC13353a;
    }

    @Override // Bu0.b
    @k
    public final InterfaceC43160i<Map<String, Map<String, Boolean>>> a() {
        return this.f1778a.a();
    }
}
