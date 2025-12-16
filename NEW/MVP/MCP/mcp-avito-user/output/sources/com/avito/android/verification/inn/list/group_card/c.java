package com.avito.android.verification.inn.list.group_card;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupCardItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GroupCardItem f324003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f324004m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupCardItem groupCardItem, d dVar) {
        super(0);
        this.f324003l = groupCardItem;
        this.f324004m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f324003l.f323988e;
        if (deepLink != null) {
            this.f324004m.f324005b.i7(deepLink);
        }
        return G0.f406611a;
    }
}
