package com.avito.android.evidence_request.di;

import Y61.k;
import aA.InterfaceC19746a;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.EvidenceRequestActivity;
import com.avito.android.evidence_request.details.di.InterfaceC30378c;
import h31.d;
import kotlin.Metadata;

/* compiled from: EvidenceRequestComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/di/b;", "LaA/a;", "Lcom/avito/android/evidence_request/details/di/c;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes13.dex */
public interface b extends InterfaceC19746a, InterfaceC30378c {

    /* compiled from: EvidenceRequestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/di/b$a;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k EvidenceRequestActivity evidenceRequestActivity, @k c cVar, @h31.b @k AppealId appealId);
    }

    void nk(@k EvidenceRequestActivity evidenceRequestActivity);
}
