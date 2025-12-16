package com.avito.android.multigeo_flow.mvi.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.mvi.entity.InternalAction;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.ranges.l;

/* compiled from: JobMultiGeoReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/logics/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements u<InternalAction, JobMultiGeoState> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final JobMultiGeoState a(InternalAction internalAction, JobMultiGeoState jobMultiGeoState) {
        InternalAction internalAction2 = internalAction;
        JobMultiGeoState jobMultiGeoState2 = jobMultiGeoState;
        boolean z12 = internalAction2 instanceof InternalAction.a;
        List<AddressItem> list = jobMultiGeoState2.f207001d;
        if (z12) {
            InternalAction.a aVar = (InternalAction.a) internalAction2;
            return JobMultiGeoState.a(jobMultiGeoState2, aVar.f206991b, C42745f0.h0(list, Collections.singletonList(aVar.f206992c)), null, false, 26);
        }
        boolean z13 = internalAction2 instanceof InternalAction.DeleteAddress;
        Integer num = jobMultiGeoState2.f207002e;
        if (z13) {
            InternalAction.DeleteAddress deleteAddress = (InternalAction.DeleteAddress) internalAction2;
            ArrayList arrayList = new ArrayList(list);
            if (num != null && new l(0, arrayList.size() - 1, 1).h(num.intValue())) {
                arrayList.remove(num.intValue());
            }
            return JobMultiGeoState.a(jobMultiGeoState2, deleteAddress.f206985b, arrayList, null, false, 2);
        }
        if (internalAction2 instanceof InternalAction.d) {
            InternalAction.d dVar = (InternalAction.d) internalAction2;
            ArrayList arrayList2 = new ArrayList(list);
            if (num != null && new l(0, arrayList2.size() - 1, 1).h(num.intValue())) {
                arrayList2.set(num.intValue(), dVar.f206996c);
            }
            G0 g02 = G0.f406611a;
            return JobMultiGeoState.a(jobMultiGeoState2, dVar.f206995b, arrayList2, null, false, 18);
        }
        if (internalAction2 instanceof InternalAction.f) {
            return JobMultiGeoState.a(jobMultiGeoState2, null, null, Integer.valueOf(((InternalAction.f) internalAction2).f206998b), false, 23);
        }
        if (internalAction2 instanceof InternalAction.ShowLoading) {
            return JobMultiGeoState.a(jobMultiGeoState2, null, null, null, true, 15);
        }
        if (internalAction2 instanceof InternalAction.ShowError) {
            return JobMultiGeoState.a(jobMultiGeoState2, null, null, null, false, 7);
        }
        if (internalAction2 instanceof InternalAction.e ? true : internalAction2 instanceof InternalAction.c ? true : internalAction2 instanceof InternalAction.b) {
            return jobMultiGeoState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
