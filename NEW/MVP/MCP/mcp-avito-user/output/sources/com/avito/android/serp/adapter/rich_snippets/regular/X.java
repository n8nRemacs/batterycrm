package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class X extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f271103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271104m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AdvertXlItem advertXlItem, Z z12) {
        super(0);
        this.f271103l = z12;
        this.f271104m = advertXlItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f271103l.f271108b.get().Ld(this.f271104m, null);
        return G0.f406611a;
    }
}
