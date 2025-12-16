package com.avito.android.user_advert.advert;

import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class Z0 extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsItem f308454m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35426j0.b f308455n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C35435m0 c35435m0, MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
        super(0);
        this.f308453l = c35435m0;
        this.f308454m = myAdvertDetailsItem;
        this.f308455n = bVar;
    }

    @Override // Y41.a
    public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
        C35435m0 c35435m0 = this.f308453l;
        c35435m0.getClass();
        MyAdvertDetailsItem myAdvertDetailsItem = this.f308454m;
        boolean z12 = kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "active") || kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "inactive");
        boolean z13 = c35435m0.f310462d;
        InterfaceC35426j0.b bVar = this.f308455n;
        boolean z14 = z13 && (bVar instanceof InterfaceC35426j0.b.C9510b);
        boolean z15 = bVar instanceof InterfaceC35426j0.b.c;
        AdvertParameters advertParameters = myAdvertDetailsItem.f309092G;
        return (z12 && (z14 || z15) && ((advertParameters != null ? advertParameters.getPriceList() : null) != null)) ? c35435m0.f310496w.a() : io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
    }
}
