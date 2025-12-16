package df0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.cpa_reassignment.CpaReassignmentSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_reassignment.CpaReassignmentSlotConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaReassignmentSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldf0/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: df0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39722a extends j<CpaReassignmentSlot> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CpaReassignmentSlot f393995b;

    public C39722a(@k CpaReassignmentSlot cpaReassignmentSlot) {
        this.f393995b = cpaReassignmentSlot;
    }

    @Override // com.avito.android.category_parameters.j
    @k
    public final f e(@k ParameterSlot parameterSlot) {
        if (!(parameterSlot instanceof SelectParameter.Flat)) {
            return f.c.f117644b;
        }
        if (!L.f(parameterSlot.getId(), ((CpaReassignmentSlotConfig) this.f393995b.getWidget().getConfig()).getOwner().getId())) {
            return f.c.f117644b;
        }
        i();
        return new f.b(SlotType.CPA_REASSIGNMENT, null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f393995b;
    }
}
