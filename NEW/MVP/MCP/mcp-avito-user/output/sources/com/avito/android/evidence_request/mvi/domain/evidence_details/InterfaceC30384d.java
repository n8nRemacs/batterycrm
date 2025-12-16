package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.net.Uri;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EvidenceDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/d;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30384d {
    void a(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2);

    @Y61.l
    PhotoParameter b(@Y61.k List<? extends ParameterSlot> list);

    @Y61.k
    InterfaceC43160i<EvidenceDetailsInternalAction> c(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2);

    void d(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k List<? extends ParameterSlot> list2);

    void e(@Y61.k List<? extends Uri> list);
}
