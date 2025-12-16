package com.avito.android.master_plan.adapter.info;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InfoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InfoItem f186004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f186005m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InfoItem infoItem, e eVar) {
        super(0);
        this.f186004l = infoItem;
        this.f186005m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InfoItem infoItem = this.f186004l;
        DeepLink deepLink = infoItem.f185999e;
        if (deepLink != null) {
            this.f186005m.f186006b.invoke(deepLink, infoItem.f185996b);
        }
        return G0.f406611a;
    }
}
