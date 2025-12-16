package com.avito.android.campaigns_sale.konveyor.editBlock;

import gm.C40705b;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaleEditBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "discount", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f113987l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40705b f113988m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, C40705b c40705b) {
        super(1);
        this.f113987l = kVar;
        this.f113988m = c40705b;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        k kVar = this.f113987l;
        C40705b c40705b = this.f113988m;
        InterfaceC41424a.t tVar = new InterfaceC41424a.t(c40705b.f396773b, num);
        Y41.l<InterfaceC41424a, G0> lVar = kVar.f113989b;
        lVar.invoke(tVar);
        lVar.invoke(new InterfaceC41424a.C11392a(c40705b.f396773b));
        return G0.f406611a;
    }
}
