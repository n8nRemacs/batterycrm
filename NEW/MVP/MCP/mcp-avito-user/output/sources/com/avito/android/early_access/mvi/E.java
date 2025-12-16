package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import com.avito.android.early_access.adapter.bundle.EarlyAccessSelectableBundleItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EarlyAccessScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f145402l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessSelectableBundleItem f145403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(Y41.l lVar, EarlyAccessSelectableBundleItem earlyAccessSelectableBundleItem) {
        super(0);
        this.f145402l = (kotlin.jvm.internal.N) lVar;
        this.f145403m = earlyAccessSelectableBundleItem;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        this.f145402l.invoke(new InterfaceC14538a.e(this.f145403m.f145100c));
        return G0.f406611a;
    }
}
