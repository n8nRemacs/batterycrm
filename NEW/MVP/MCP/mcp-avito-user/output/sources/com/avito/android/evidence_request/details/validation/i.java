package com.avito.android.evidence_request.details.validation;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceValidationFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/validation/i;", "Lcom/avito/android/evidence_request/details/validation/f;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f148573a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f148574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f148575c;

    @Inject
    public i(@Y61.k k kVar, @Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f148573a = kVar;
        this.f148574b = aVar;
        this.f148575c = interfaceC35745a5;
    }

    @Override // com.avito.android.evidence_request.details.validation.f
    @Y61.k
    public final S a(@Y61.k List list) {
        return this.f148573a.a().n(new h(this, list)).s(this.f148575c.e());
    }
}
