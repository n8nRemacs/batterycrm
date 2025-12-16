package v50;

import Y61.k;
import androidx.core.content.j;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: PaidServicesExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_paid-services_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: v50.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49166b {
    @k
    public static final d a(@k Fragment fragment) {
        d dVarU1;
        j jVarL1 = fragment.l1();
        e eVar = jVarL1 instanceof e ? (e) jVarL1 : null;
        if (eVar == null || (dVarU1 = eVar.u1()) == null) {
            throw new IllegalStateException("Activity must implement PaidServicesLaunchInteractorProvider");
        }
        return dVarU1;
    }

    @k
    public static final PaidServicesResultRepository b(@k BaseFragment baseFragment) {
        PaidServicesResultRepository paidServicesResultRepositoryW0;
        j jVarL1 = baseFragment.l1();
        f fVar = jVarL1 instanceof f ? (f) jVarL1 : null;
        if (fVar == null || (paidServicesResultRepositoryW0 = fVar.W0()) == null) {
            throw new IllegalStateException("Activity must implement PaidServicesResultRepositoryProvider");
        }
        return paidServicesResultRepositoryW0;
    }

    public static final void c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k d dVar) {
        aVar.Qb(C22777e.b(new Q("paid_services_key_should_start_for_result", Boolean.valueOf(dVar.getF210650a()))));
    }
}
