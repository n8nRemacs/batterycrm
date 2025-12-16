package com.avito.android.advertising.adapter.items.buzzoola.avl;

import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44738b;

/* compiled from: BuzzoolaAvlPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44738b>> f87272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BannerInfo f87273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f87274n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f87275o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaAVL f87276p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.deeplink_handler.handler.composite.a> f87277q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WeakReference<h31.e<InterfaceC44738b>> weakReference, BannerInfo bannerInfo, int i12, f fVar, BuzzoolaBanner.BuzzoolaAVL buzzoolaAVL, WeakReference<com.avito.android.deeplink_handler.handler.composite.a> weakReference2) {
        super(0);
        this.f87272l = weakReference;
        this.f87273m = bannerInfo;
        this.f87274n = i12;
        this.f87275o = fVar;
        this.f87276p = buzzoolaAVL;
        this.f87277q = weakReference2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44738b interfaceC44738b;
        h31.e<InterfaceC44738b> eVar = this.f87272l.get();
        if (eVar != null && (interfaceC44738b = eVar.get()) != null) {
            interfaceC44738b.C1(this.f87273m, this.f87274n);
        }
        f fVar = this.f87275o;
        BuzzoolaBanner.BuzzoolaAVL buzzoolaAVL = this.f87276p;
        fVar.f87279c.d(buzzoolaAVL.f88207m);
        fVar.f87280d.a(this.f87277q.get(), buzzoolaAVL.f88198d.f88304b);
        return G0.f406611a;
    }
}
