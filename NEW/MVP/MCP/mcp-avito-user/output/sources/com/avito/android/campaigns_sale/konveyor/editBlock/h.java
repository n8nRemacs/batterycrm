package com.avito.android.campaigns_sale.konveyor.editBlock;

import com.avito.android.R;
import gm.C40705b;
import gm.C40707d;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaleEditBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "discount", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f113982l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40705b f113983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f113984n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, C40705b c40705b, k kVar) {
        super(1);
        this.f113982l = pVar;
        this.f113983m = c40705b;
        this.f113984n = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        String string;
        Integer num2 = num;
        p pVar = this.f113982l;
        C40705b c40705b = this.f113983m;
        if (num2 == null) {
            string = pVar.f114017r.getString(R.string.campaigns_sale_choose_discount);
        } else {
            int iIntValue = num2.intValue();
            C40707d c40707d = c40705b.f396775d;
            if (iIntValue < c40707d.f396785a) {
                string = c40707d.f396787c;
            } else {
                int iIntValue2 = num2.intValue();
                C40707d c40707d2 = c40705b.f396775d;
                string = iIntValue2 > c40707d2.f396786b ? c40707d2.f396788d : null;
            }
        }
        pVar.B80(string);
        Y41.l<InterfaceC41424a, G0> lVar = this.f113984n.f113989b;
        if (string == null) {
            lVar.invoke(new InterfaceC41424a.t(c40705b.f396773b, num2));
            lVar.invoke(new InterfaceC41424a.s(true));
        } else {
            lVar.invoke(new InterfaceC41424a.s(false));
        }
        return G0.f406611a;
    }
}
