package com.avito.android.evidence_request;

import com.avito.android.account.G;
import com.avito.android.evidence_request.repository.model.EvidenceContent;
import com.avito.android.evidence_request.repository.model.ProofDetailsContent;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceRequestInfoInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/d;", "Lcom/avito/android/evidence_request/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.repository.a f148214a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f148215b;

    @Inject
    public d(@Y61.k com.avito.android.evidence_request.repository.a aVar, @Y61.k G g12) {
        this.f148214a = aVar;
        this.f148215b = g12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    @Override // com.avito.android.evidence_request.c
    @Y61.k
    public final EvidenceContent a(@Y61.k ModerationEvidence moderationEvidence) {
        Object next;
        CharParameter charParameter;
        Object next2;
        EvidenceContent evidenceContentA = this.f148214a.a(moderationEvidence);
        ProfileInfo profileInfoE = this.f148215b.e();
        for (ProofDetailsContent proofDetailsContent : evidenceContentA.f149200c.values()) {
            Iterator it = proofDetailsContent.f149205f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), "fullName")) {
                    break;
                }
            }
            ParameterSlot parameterSlot = (ParameterSlot) next;
            if (parameterSlot != null) {
                if (!(parameterSlot instanceof CharParameter)) {
                    parameterSlot = null;
                }
                charParameter = (CharParameter) parameterSlot;
            } else {
                charParameter = null;
            }
            if (charParameter != null) {
                charParameter.set_value(profileInfoE.getName());
            }
            Iterator it2 = proofDetailsContent.f149205f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), "email")) {
                    break;
                }
            }
            ?? r32 = (ParameterSlot) next2;
            EmailParameter emailParameter = r32 != 0 ? r32 instanceof EmailParameter ? r32 : null : null;
            if (emailParameter != null) {
                emailParameter.set_value(profileInfoE.getEmail());
            }
        }
        return evidenceContentA;
    }
}
