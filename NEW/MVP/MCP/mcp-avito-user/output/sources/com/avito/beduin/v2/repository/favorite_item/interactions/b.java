package com.avito.beduin.v2.repository.favorite_item.interactions;

import Y41.l;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import lV0.C43689a;

/* compiled from: FavoriteItemRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LlV0/a;", "isFavorite", "Lkotlin/G0;", "invoke", "(LlV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements l<C43689a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36272i f338259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<com.avito.beduin.v2.engine.field.d, G0> f338260m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(C36272i c36272i, l<? super com.avito.beduin.v2.engine.field.d, G0> lVar) {
        super(1);
        this.f338259l = c36272i;
        this.f338260m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(C43689a c43689a) {
        com.avito.beduin.v2.engine.field.d a12;
        C43689a c43689a2 = c43689a;
        if (c43689a2 != null) {
            a12 = new A(new Q("favorite", this.f338259l.f(c43689a2.f413819a)));
        } else {
            a12 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        this.f338260m.invoke(a12);
        return G0.f406611a;
    }
}
