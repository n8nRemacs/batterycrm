package com.avito.android.evidence_request.mvi.evidence_request.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.evidence_request.EvidenceRequestActivity;
import h31.d;
import kotlin.Metadata;

/* compiled from: EvidenceRequestComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/di/b;", "Lcom/avito/android/evidence_request/mvi/evidence_details/di/c;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes13.dex */
public interface b extends com.avito.android.evidence_request.mvi.evidence_details.di.c {

    /* compiled from: EvidenceRequestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/di/b$a;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC30106l7 interfaceC30106l7, @h31.b @k C28478k c28478k, @h31.b @k EvidenceRequestActivity evidenceRequestActivity, @h31.b @k AppealId appealId, @h31.b @k Resources resources);
    }

    void zd(@k EvidenceRequestActivity evidenceRequestActivity);
}
