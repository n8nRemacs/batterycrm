package com.avito.android.campaigns_sale.konveyor.editBlock;

import gm.C40705b;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaleEditBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "discount", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f113985l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40705b f113986m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, C40705b c40705b) {
        super(1);
        this.f113985l = kVar;
        this.f113986m = c40705b;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        k kVar = this.f113985l;
        String str = this.f113986m.f396773b;
        kVar.f113989b.invoke(new InterfaceC41424a.c(kVar.f113990c.a(num, str)));
        return G0.f406611a;
    }
}
