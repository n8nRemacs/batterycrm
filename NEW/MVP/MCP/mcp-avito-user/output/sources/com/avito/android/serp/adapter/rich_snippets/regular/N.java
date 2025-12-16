package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f271081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271082n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271083o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271084p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC34800x interfaceC34800x, Z z12, InterfaceC34800x interfaceC34800x2, AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2) {
        super(0);
        this.f271080l = interfaceC34800x;
        this.f271081m = z12;
        this.f271082n = interfaceC34800x2;
        this.f271083o = advertXlItem;
        this.f271084p = advertXlItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC34800x interfaceC34800x = this.f271080l;
        interfaceC34800x.P1(null);
        interfaceC34800x.l5(null);
        interfaceC34800x.U40();
        interfaceC34800x.p7(null);
        interfaceC34800x.H0();
        interfaceC34800x.d(null);
        interfaceC34800x.w4();
        interfaceC34800x.wd(B0.f406639b);
        Z z12 = this.f271081m;
        h31.e<InterfaceC28616b> eVar = z12.f271113g;
        if (eVar.get().N6()) {
            String str = this.f271083o.f268777c;
            z12.f271114h.p(this.f271082n, str);
        } else {
            eVar.get().M6(this.f271084p);
        }
        return G0.f406611a;
    }
}
