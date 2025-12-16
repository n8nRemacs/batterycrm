package com.avito.android.advert.deeplinks.delivery;

import android.content.DialogInterface;
import com.avito.android.advert.deeplinks.delivery.a;
import com.avito.android.deep_linking.links.RequestDeliveryLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RequestDeliveryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f68936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RequestDeliveryLink f68937m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f68938n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, RequestDeliveryLink requestDeliveryLink, DialogInterface dialogInterface) {
        super(0);
        this.f68936l = aVar;
        this.f68937m = requestDeliveryLink;
        this.f68938n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = new i(this.f68938n);
        a aVar = this.f68936l;
        iVar.invoke();
        aVar.f68905f.c(new Y3.a(aVar.f68906g.a(), this.f68937m.f133634b));
        aVar.j(a.AbstractC2160a.C2161a.f68919b);
        return G0.f406611a;
    }
}
