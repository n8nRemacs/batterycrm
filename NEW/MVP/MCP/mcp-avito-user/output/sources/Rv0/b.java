package rV0;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.h;
import kotlin.Metadata;
import rV0.C47602a;

/* compiled from: PersistentRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrV0/b;", "Lcom/avito/beduin/v2/interaction/repository/flow/h;", "LrV0/a;", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends h<C47602a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final pV0.e f429845c;

    public b(@k pV0.e eVar) {
        super(C47602a.C12377a.f429844b);
        this.f429845c = eVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.h
    public final com.avito.beduin.v2.engine.field.d q(com.avito.beduin.v2.interaction.repository.flow.d dVar, C36272i c36272i) {
        com.avito.beduin.v2.engine.field.d dVarA = this.f429845c.a(c36272i, ((C47602a) dVar).f429843d);
        return dVarA == null ? com.avito.beduin.v2.engine.field.entity.f.f336800b : dVarA;
    }
}
