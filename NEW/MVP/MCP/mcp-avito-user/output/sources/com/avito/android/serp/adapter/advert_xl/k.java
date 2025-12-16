package com.avito.android.serp.adapter.advert_xl;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f268842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AdvertXlItem advertXlItem, u uVar) {
        super(0);
        this.f268841l = advertXlItem;
        this.f268842m = uVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<String> list = this.f268841l.f268771X;
        if (list != null) {
            this.f268842m.f268879n.c(list);
        }
        return G0.f406611a;
    }
}
