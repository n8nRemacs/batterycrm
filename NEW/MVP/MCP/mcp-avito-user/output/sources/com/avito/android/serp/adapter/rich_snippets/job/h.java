package com.avito.android.serp.adapter.rich_snippets.job;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertRichJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f270796l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f270797m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f270798n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270799o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270800p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, j jVar, m mVar2, AdvertItem advertItem, AdvertItem advertItem2) {
        super(0);
        this.f270796l = mVar;
        this.f270797m = jVar;
        this.f270798n = mVar2;
        this.f270799o = advertItem;
        this.f270800p = advertItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m mVar = this.f270796l;
        mVar.H0();
        mVar.d(null);
        j jVar = this.f270797m;
        InterfaceC28616b interfaceC28616b = jVar.f270806e;
        if (interfaceC28616b.N6()) {
            String str = this.f270799o.f268425c;
            jVar.f270807f.p(this.f270798n, str);
        } else {
            interfaceC28616b.M6(this.f270800p);
        }
        return G0.f406611a;
    }
}
