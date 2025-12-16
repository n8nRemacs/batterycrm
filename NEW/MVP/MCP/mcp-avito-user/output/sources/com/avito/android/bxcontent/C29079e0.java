package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.remote.model.serp.Onboarding;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.e0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29079e0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f111055l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Onboarding f111056m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29079e0(BxContentFragment bxContentFragment, Onboarding onboarding) {
        super(0);
        this.f111055l = bxContentFragment;
        this.f111056m = onboarding;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f111055l.Z5().accept(new InterfaceC29127b.C29144i0(this.f111056m));
        return kotlin.G0.f406611a;
    }
}
