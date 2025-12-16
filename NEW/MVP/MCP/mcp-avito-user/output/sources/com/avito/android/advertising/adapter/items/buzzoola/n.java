package com.avito.android.advertising.adapter.items.buzzoola;

import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f87364l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaDirectBannerItem f87365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.advertising.ui.buzzoola.d> f87366n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44739c>> f87367o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, BuzzoolaDirectBannerItem buzzoolaDirectBannerItem, WeakReference<com.avito.android.advertising.ui.buzzoola.d> weakReference, WeakReference<h31.e<InterfaceC44739c>> weakReference2) {
        super(0);
        this.f87364l = pVar;
        this.f87365m = buzzoolaDirectBannerItem;
        this.f87366n = weakReference;
        this.f87367o = weakReference2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44739c interfaceC44739c;
        boolean zB2 = this.f87364l.f87376h.b();
        BuzzoolaDirectBannerItem buzzoolaDirectBannerItem = this.f87365m;
        if (zB2) {
            buzzoolaDirectBannerItem.setHidden(true);
            com.avito.android.advertising.ui.buzzoola.d dVar = this.f87366n.get();
            if (dVar != null) {
                dVar.Xa(false);
            }
        }
        h31.e<InterfaceC44739c> eVar = this.f87367o.get();
        if (eVar != null && (interfaceC44739c = eVar.get()) != null) {
            interfaceC44739c.A(buzzoolaDirectBannerItem.getStringId());
        }
        return G0.f406611a;
    }
}
