package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceValidationFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/C;", "Lcom/avito/android/evidence_request/mvi/domain/evidence_details/z;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class C implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.evidence_request.mvi.data.evidence_details.a f148652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f148653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f148654c;

    @Inject
    public C(@Y61.k com.avito.android.evidence_request.mvi.data.evidence_details.a aVar, @Y61.k u uVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f148652a = aVar;
        this.f148653b = uVar;
        this.f148654c = interfaceC35745a5;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.z
    @Y61.k
    public final S a(@Y61.k List list) {
        return this.f148652a.a().n(new B(this, list)).s(this.f148654c.e());
    }
}
