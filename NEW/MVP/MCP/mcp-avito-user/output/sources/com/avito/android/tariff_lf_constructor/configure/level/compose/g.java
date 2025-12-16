package com.avito.android.tariff_lf_constructor.configure.level.compose;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mD0.C43950b;
import mD0.InterfaceC43949a;

/* compiled from: ConstructorConfigureLevelItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43950b f299762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC43949a, G0> f299763m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(C43950b c43950b, Y41.l<? super InterfaceC43949a, G0> lVar) {
        super(0);
        this.f299762l = c43950b;
        this.f299763m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink = this.f299762l.f414420h.getDeeplink();
        if (deeplink != null) {
            this.f299763m.invoke(new InterfaceC43949a.c(deeplink));
        }
        return G0.f406611a;
    }
}
