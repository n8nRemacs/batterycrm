package com.avito.android.advertising.adapter.items.mytarget;

import android.view.View;
import com.avito.android.advertising.loaders.my_target.d;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: MyTargetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f87629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ WeakReference<View> f87630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Gb.d f87631n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, WeakReference<View> weakReference, Gb.d dVar) {
        super(0);
        this.f87629l = aVar;
        this.f87630m = weakReference;
        this.f87631n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f87629l;
        aVar.getBanner().f88408g.f88398a = null;
        d.a banner = aVar.getBanner();
        WeakReference<View> weakReference = banner.f88404c;
        View view = weakReference != null ? weakReference.get() : null;
        WeakReference<View> weakReference2 = this.f87630m;
        if (L.f(view, weakReference2 != null ? weakReference2.get() : null)) {
            banner.f88406e.j();
            banner.f88404c = null;
        }
        this.f87631n.CP();
        return G0.f406611a;
    }
}
