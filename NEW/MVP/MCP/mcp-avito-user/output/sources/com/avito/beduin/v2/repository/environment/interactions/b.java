package com.avito.beduin.v2.repository.environment.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.h;
import com.avito.beduin.v2.repository.environment.i;
import com.avito.beduin.v2.repository.environment.interactions.a;
import com.avito.beduin.v2.repository.environment.j;
import kotlin.Metadata;

/* compiled from: EnvironmentRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/interactions/b;", "Lcom/avito/beduin/v2/interaction/repository/flow/h;", "Lcom/avito/beduin/v2/repository/environment/interactions/a;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends h<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f338242c;

    public b(@k i iVar) {
        super(a.C10480a.f338241b);
        this.f338242c = iVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.h
    public final com.avito.beduin.v2.engine.field.d q(com.avito.beduin.v2.interaction.repository.flow.d dVar, C36272i c36272i) {
        return j.a(this.f338242c.e(), c36272i);
    }
}
