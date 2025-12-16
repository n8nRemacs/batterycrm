package com.avito.android.installmentsblock.compose;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsIcon f172919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172920m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(InstallmentsIcon installmentsIcon, Y41.l<? super DeepLink, G0> lVar) {
        super(0);
        this.f172919l = installmentsIcon;
        this.f172920m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f172919l.f172857e;
        if (deepLink != null) {
            this.f172920m.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
