package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.l;
import kotlin.Metadata;

/* compiled from: FavoriteItemRepositoryObserveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/d;", "Lcom/avito/beduin/v2/interaction/repository/flow/l;", "a", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends l {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f338262e;

    /* compiled from: FavoriteItemRepositoryObserveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/d$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/l$a;", "<init>", "()V", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends l.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338263b = new a();

        public a() {
            super("FavoriteItem", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.l.a
        @k
        public final l c(@k z zVar, @k m mVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
            return new d(mVar.l(zVar, "itemId"), lVar, aVar, lVar2, aVar2);
        }
    }

    public d(@k String str, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
        super(lVar, aVar, lVar2, aVar2);
        this.f338262e = str;
    }
}
