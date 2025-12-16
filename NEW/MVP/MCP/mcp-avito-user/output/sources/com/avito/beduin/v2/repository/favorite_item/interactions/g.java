package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.x;
import kotlin.Metadata;

/* compiled from: FavoriteItemRepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/g;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "a", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends x {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f338273d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f338274e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f338275f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f338276g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f338277h;

    /* compiled from: FavoriteItemRepositoryUpdateInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/favorite_item/interactions/g$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/x$a;", "<init>", "()V", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends x.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338278b = new a();

        public a() {
            super("FavoriteItem", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.x.a
        @k
        public final x c(@k z zVar, @k m mVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) throws BeduinPropertyException {
            String strL = mVar.l(zVar, "itemId");
            boolean zE2 = mVar.e(zVar, "favorite");
            String strL2 = mVar.l(zVar, "fromPage");
            String strW = mVar.w(zVar, "context");
            Boolean boolO = mVar.o(zVar, "advertCollectionEnabled");
            return new g(strL, zE2, strL2, strW, boolO != null ? boolO.booleanValue() : true, aVar, lVar, aVar2);
        }
    }

    public g(@k String str, boolean z12, @k String str2, @l String str3, boolean z13, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f338273d = str;
        this.f338274e = z12;
        this.f338275f = str2;
        this.f338276g = str3;
        this.f338277h = z13;
    }
}
