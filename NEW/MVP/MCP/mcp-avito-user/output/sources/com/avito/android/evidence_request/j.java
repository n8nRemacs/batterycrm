package com.avito.android.evidence_request;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.evidence_request.details.files.q;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceRequestViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/j;", "Landroidx/lifecycle/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f148634d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final q f148635e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AppealId f148636f;

    @Inject
    public j(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k c cVar, @Y61.k q qVar, @Y61.k AppealId appealId) {
        super(interfaceC23487e, null);
        this.f148634d = cVar;
        this.f148635e = qVar;
        this.f148636f = appealId;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(i.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new i(c23060r0, this.f148634d, this.f148635e, this.f148636f);
    }
}
