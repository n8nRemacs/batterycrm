package com.avito.android.serp.adapter.rich_snippets.regular;

import android.os.Parcelable;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f271105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271106m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271107n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z12, AdvertXlItem advertXlItem, InterfaceC34800x interfaceC34800x) {
        super(1);
        this.f271105l = z12;
        this.f271106m = advertXlItem;
        this.f271107n = interfaceC34800x;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        Z z12 = this.f271105l;
        String str = this.f271106m.f268777c;
        Parcelable parcelableK2 = this.f271107n.k2();
        if (parcelableK2 != null) {
            z12.f271121o.f270773b.put(str, parcelableK2);
        }
        return G0.f406611a;
    }
}
