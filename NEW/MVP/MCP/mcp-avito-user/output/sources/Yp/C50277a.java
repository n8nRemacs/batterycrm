package yp;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;
import vp.C49363a;
import wp.InterfaceC49662a;

/* compiled from: DigitalRegistrationInstantItemFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyp/a;", "LWV0/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50277a extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC49662a f443503e;

    @Inject
    public C50277a(@k InterfaceC49662a interfaceC49662a) {
        super(true, true, 0.001f, 1L);
        this.f443503e = interfaceC49662a;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof C49363a;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        C49363a c49363a = interfaceC10495b instanceof C49363a ? (C49363a) interfaceC10495b : null;
        if (c49363a != null) {
            boolean z12 = c49363a.f440967c;
            InterfaceC49662a interfaceC49662a = this.f443503e;
            if (z12) {
                interfaceC49662a.i();
            } else {
                interfaceC49662a.h();
            }
        }
    }
}
