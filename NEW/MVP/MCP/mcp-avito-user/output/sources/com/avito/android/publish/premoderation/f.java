package com.avito.android.publish.premoderation;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDuplicatePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f238300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(1);
        this.f238300l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        AdvertDuplicateFragment advertDuplicateFragment = this.f238300l.f238304c;
        if (advertDuplicateFragment != null) {
            a aVar = advertDuplicateFragment.f238264i0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.Q1();
            advertDuplicateFragment.dismissAllowingStateLoss();
        }
        return G0.f406611a;
    }
}
