package com.avito.android.advert.item.items_list_builder.realty;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyItemListBuilder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f76981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f76982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f76983n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, AdvertDetails advertDetails, String str) {
        super(0);
        this.f76981l = aVar;
        this.f76982m = advertDetails;
        this.f76983n = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f76981l.f76888d.v3(this.f76982m.getId(), this.f76983n, null);
        return G0.f406611a;
    }
}
