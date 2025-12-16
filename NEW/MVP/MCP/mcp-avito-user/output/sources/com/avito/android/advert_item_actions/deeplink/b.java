package com.avito.android.advert_item_actions.deeplink;

import Y41.l;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertItemActionsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "it", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements l<TypedResult<G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f85837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItemActionsDeeplink f85838m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, AdvertItemActionsDeeplink advertItemActionsDeeplink) {
        super(1);
        this.f85837l = fVar;
        this.f85838m = advertItemActionsDeeplink;
    }

    @Override // Y41.l
    public final G0 invoke(TypedResult<G0> typedResult) {
        AdvertItemActionsDeeplink.b.c cVar = new AdvertItemActionsDeeplink.b.c(this.f85838m.f85810b);
        f fVar = this.f85837l;
        fVar.j(cVar);
        com.avito.android.lib.design.bottom_sheet.d dVar = fVar.f85850l;
        if (dVar != null) {
            N0.a(dVar);
        }
        return G0.f406611a;
    }
}
