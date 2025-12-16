package com.avito.android.evidence_request;

import android.content.Context;
import android.content.Intent;
import cA.InterfaceC26995a;
import com.avito.android.C30829i0;
import com.avito.android.remote.C34384q0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: EvidenceRequestIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/f;", "LcA/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements InterfaceC26995a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f148623a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30829i0 f148624b;

    @Inject
    public f(@Y61.k Context context, @Y61.k C30829i0 c30829i0) {
        this.f148623a = context;
        this.f148624b = c30829i0;
    }

    @Override // cA.InterfaceC26995a
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        C30829i0 c30829i0 = this.f148624b;
        c30829i0.getClass();
        n<Object> nVar = C30829i0.f164266c[0];
        boolean zBooleanValue = ((Boolean) c30829i0.f164267b.a().invoke()).booleanValue();
        Context context = this.f148623a;
        if (!zBooleanValue) {
            return new Intent(context, (Class<?>) EvidenceRequestActivity.class).putExtra("key_appeal_id", new AppealId(str, str2, C34384q0.a(str3)));
        }
        com.avito.android.evidence_request.mvi.evidence_request.EvidenceRequestActivity.f149104r.getClass();
        return new Intent(context, (Class<?>) com.avito.android.evidence_request.mvi.evidence_request.EvidenceRequestActivity.class).putExtra("key_appeal_id", new com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId(str, str2, C34384q0.a(str3)));
    }
}
