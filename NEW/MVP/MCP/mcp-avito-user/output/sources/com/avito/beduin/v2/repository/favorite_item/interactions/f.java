package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.l;
import com.avito.beduin.v2.interaction.repository.flow.n;
import com.avito.beduin.v2.repository.favorite_item.interactions.d;
import jV0.InterfaceC42311a;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoriteItemRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/f;", "Lcom/avito/beduin/v2/interaction/repository/flow/n;", "Lcom/avito/beduin/v2/repository/favorite_item/interactions/d;", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends n<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42311a f338272c;

    public f(@k InterfaceC42311a interfaceC42311a) {
        super(d.a.f338263b);
        this.f338272c = interfaceC42311a;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.n
    public final InterfaceC43160i q(l lVar, C36272i c36272i) {
        return C43175k.d(new e(this, (d) lVar, c36272i, null));
    }
}
