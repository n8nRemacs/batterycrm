package com.avito.android.campaigns_sale.konveyor.editBlock;

import com.avito.android.campaigns_sale.network.remote.model.TooltipButton;
import com.avito.android.deep_linking.links.DeepLink;
import gm.C40705b;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaleEditBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40705b f113980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f113981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, C40705b c40705b) {
        super(0);
        this.f113980l = c40705b;
        this.f113981m = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri;
        TooltipButton button = this.f113980l.f396781j.f396769b.getButton();
        if (button != null && (uri = button.getUri()) != null) {
            this.f113981m.f113989b.invoke(new InterfaceC41424a.f(uri));
        }
        return G0.f406611a;
    }
}
