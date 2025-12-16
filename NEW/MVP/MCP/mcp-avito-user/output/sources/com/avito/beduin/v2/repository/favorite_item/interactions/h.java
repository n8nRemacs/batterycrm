package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y61.k;
import com.avito.beduin.v2.interaction.repository.flow.B;
import com.avito.beduin.v2.interaction.repository.flow.x;
import com.avito.beduin.v2.repository.favorite_item.interactions.g;
import jV0.InterfaceC42311a;
import kotlin.Metadata;
import lV0.C43690b;

/* compiled from: FavoriteItemRepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/h;", "Lcom/avito/beduin/v2/interaction/repository/flow/B;", "Lcom/avito/beduin/v2/repository/favorite_item/interactions/g;", "LFV0/h;", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends B<g> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42311a f338279c;

    public h(@k InterfaceC42311a interfaceC42311a) {
        super(g.a.f338278b);
        this.f338279c = interfaceC42311a;
    }

    @Override // FV0.h
    public final void P() {
        this.f338279c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f338279c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.B
    public final void q(x xVar) {
        g gVar = (g) xVar;
        this.f338279c.j(new C43690b(gVar.f338273d, gVar.f338275f, gVar.f338274e, gVar.f338276g, gVar.f338277h));
    }
}
