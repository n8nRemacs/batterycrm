package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34784g extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34797u f271172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271173n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271174o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271175p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34784g(InterfaceC34800x interfaceC34800x, C34797u c34797u, InterfaceC34800x interfaceC34800x2, AdvertItem advertItem, AdvertItem advertItem2) {
        super(0);
        this.f271171l = interfaceC34800x;
        this.f271172m = c34797u;
        this.f271173n = interfaceC34800x2;
        this.f271174o = advertItem;
        this.f271175p = advertItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC34800x interfaceC34800x = this.f271171l;
        interfaceC34800x.P1(null);
        interfaceC34800x.l5(null);
        interfaceC34800x.U40();
        interfaceC34800x.p7(null);
        interfaceC34800x.H0();
        interfaceC34800x.d(null);
        interfaceC34800x.w4();
        interfaceC34800x.wd(B0.f406639b);
        C34797u c34797u = this.f271172m;
        h31.e<InterfaceC28616b> eVar = c34797u.f271215f;
        if (eVar.get().N6()) {
            String str = this.f271174o.f268425c;
            c34797u.f271216g.p(this.f271173n, str);
        } else {
            eVar.get().M6(this.f271175p);
        }
        return G0.f406611a;
    }
}
