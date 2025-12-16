package com.avito.android.mortgage_invite.client_form.domain.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_form.domain.g;
import javax.inject.Inject;
import k20.C42477a;
import kotlin.Metadata;

/* compiled from: CreateParticipantResponseMapper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/mapper/b;", "Lcom/avito/android/mortgage_invite/client_form/domain/mapper/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_invite.common.domain.a f205184a;

    @Inject
    public b(@k com.avito.android.mortgage_invite.common.domain.a aVar) {
        this.f205184a = aVar;
    }

    @Override // com.avito.android.mortgage_invite.client_form.domain.mapper.a
    @k
    public final g a(@k C42477a c42477a) {
        return (c42477a.getDeeplink() == null || c42477a.getApplicantId() == null) ? c42477a.c() != null ? new g.b(this.f205184a.b(c42477a.c())) : new g.a(new IllegalStateException()) : new g.c(c42477a.getDeeplink(), c42477a.getApplicantId());
    }
}
