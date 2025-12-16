package hN;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.N0;
import com.avito.android.remote.model.imv_services.ImvServicesFeedback;
import com.avito.android.util.C35755b0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import mN.InterfaceC43983a;

/* compiled from: ImvServicesEventTrackerImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhN/a;", "LmN/a;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40856a implements InterfaceC43983a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final E f397187a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f397188b;

    @Inject
    public C40856a(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f397187a = e12;
        this.f397188b = interfaceC28373a;
    }

    @Override // mN.InterfaceC43983a
    public final void a(@l ImvServicesFeedback imvServicesFeedback, @l Float f12, @l Integer num, @l String str) {
        Integer clickStreamEventId;
        Integer pollId;
        if (imvServicesFeedback == null || (clickStreamEventId = imvServicesFeedback.getClickStreamEventId()) == null) {
            return;
        }
        int iIntValue = clickStreamEventId.intValue();
        Integer clickStreamVersion = imvServicesFeedback.getClickStreamVersion();
        if (clickStreamVersion != null) {
            int iIntValue2 = clickStreamVersion.intValue();
            String strA = this.f397187a.a();
            String itemId = imvServicesFeedback.getItemId();
            if (itemId == null || (pollId = imvServicesFeedback.getPollId()) == null) {
                return;
            }
            int iIntValue3 = pollId.intValue();
            String pollLabel = imvServicesFeedback.getPollLabel();
            if (pollLabel == null) {
                return;
            }
            this.f397188b.c(new N0(iIntValue, iIntValue2, strA, itemId, iIntValue3, C42745f0.V(num), pollLabel, C35755b0.c(P0.j(new Q("services_name", str), new Q("price", f12 != null ? f12.toString() : null)))));
        }
    }
}
