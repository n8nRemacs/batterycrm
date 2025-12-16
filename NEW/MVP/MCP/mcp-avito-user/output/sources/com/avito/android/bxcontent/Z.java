package com.avito.android.bxcontent;

import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109441l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(BxContentFragment bxContentFragment) {
        super(0);
        this.f109441l = bxContentFragment;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        BxContentFragment bxContentFragment = this.f109441l;
        com.avito.android.floating_views.f fVar = bxContentFragment.f108917J0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.c(bxContentFragment.K5());
        return kotlin.G0.f406611a;
    }
}
