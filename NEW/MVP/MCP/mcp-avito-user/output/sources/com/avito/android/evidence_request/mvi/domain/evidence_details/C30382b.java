package com.avito.android.evidence_request.mvi.domain.evidence_details;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstraintsValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/b;", "Lcom/avito/android/evidence_request/mvi/domain/evidence_details/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30382b implements InterfaceC30381a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public String[] f148679a;

    /* renamed from: b, reason: collision with root package name */
    public long f148680b;

    @Inject
    public C30382b() {
        C30387g.f148700a.getClass();
        this.f148679a = (String[]) C30387g.f148701b.getValue();
        this.f148680b = 16777216L;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a
    /* renamed from: O0, reason: from getter */
    public final long getF148680b() {
        return this.f148680b;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a
    public final void a(long j12) {
        this.f148680b = j12;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String[] getF148679a() {
        return this.f148679a;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a
    public final void c(@Y61.k String[] strArr) {
        this.f148679a = strArr;
    }

    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a
    public final boolean l1(long j12) {
        return j12 <= this.f148680b;
    }
}
