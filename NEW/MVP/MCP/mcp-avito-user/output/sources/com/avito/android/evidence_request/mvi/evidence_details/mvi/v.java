package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.C17068c;
import com.avito.android.evidence_request.mvi.domain.evidence_details.EvidenceDetailsContent;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceDetailsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "LXz/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements com.avito.android.arch.mvi.u<EvidenceDetailsInternalAction, C17068c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30384d f149102b;

    @Inject
    public v(@Y61.k InterfaceC30384d interfaceC30384d) {
        this.f149102b = interfaceC30384d;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C17068c a(EvidenceDetailsInternalAction evidenceDetailsInternalAction, C17068c c17068c) {
        EvidenceDetailsInternalAction evidenceDetailsInternalAction2 = evidenceDetailsInternalAction;
        C17068c c17068c2 = c17068c;
        boolean zEquals = evidenceDetailsInternalAction2.equals(EvidenceDetailsInternalAction.FilesUpload.f149031b);
        List<com.avito.conveyor_item.a> list = c17068c2.f19203c;
        InterfaceC30384d interfaceC30384d = this.f149102b;
        List<ParameterSlot> list2 = c17068c2.f19204d;
        if (zEquals) {
            interfaceC30384d.a(list, list2);
            return c17068c2;
        }
        if (evidenceDetailsInternalAction2.equals(EvidenceDetailsInternalAction.ShowItems.f149042b)) {
            interfaceC30384d.d(list, list2);
            return c17068c2;
        }
        if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.Initial) {
            ProofDetailsContent proofDetailsContent = ((EvidenceDetailsInternalAction.Initial) evidenceDetailsInternalAction2).f149036b;
            return C17068c.a(c17068c2, new EvidenceDetailsContent(proofDetailsContent.f148729c, proofDetailsContent.f148728b, proofDetailsContent.f148730d), proofDetailsContent.f148731e, proofDetailsContent.f148732f, null, false, 24);
        }
        if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.FormParametersSlots) {
            return C17068c.a(c17068c2, null, null, ((EvidenceDetailsInternalAction.FormParametersSlots) evidenceDetailsInternalAction2).f149033b, null, false, 27);
        }
        if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.IsLoading) {
            return C17068c.a(c17068c2, null, null, null, null, ((EvidenceDetailsInternalAction.IsLoading) evidenceDetailsInternalAction2).f149037b, 15);
        }
        if (!(evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.HasUploadData)) {
            return evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.ItemsUpdate ? C17068c.a(c17068c2, null, null, null, ((EvidenceDetailsInternalAction.ItemsUpdate) evidenceDetailsInternalAction2).f149038b, false, 23) : c17068c2;
        }
        PhotoParameter photoParameterB = interfaceC30384d.b(list2);
        ArrayList arrayList = new ArrayList(C42745f0.E0(((EvidenceDetailsInternalAction.HasUploadData) evidenceDetailsInternalAction2).f149034b, PhotoParameterKt.maxPhotos(photoParameterB)));
        if (photoParameterB == null) {
            return c17068c2;
        }
        PhotoParameter.ImageUploadListWrapper imageUploadListWrapper = new PhotoParameter.ImageUploadListWrapper(arrayList);
        if (L.f(photoParameterB.getValue(), imageUploadListWrapper)) {
            return c17068c2;
        }
        photoParameterB.setValue(imageUploadListWrapper);
        photoParameterB.setError(null);
        return c17068c2;
    }
}
