package com.avito.android.serp.adapter.rich_snippets.regular;

import android.os.Parcelable;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34795s extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34797u f271204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34795s(C34797u c34797u, AdvertItem advertItem, InterfaceC34800x interfaceC34800x) {
        super(1);
        this.f271204l = c34797u;
        this.f271205m = advertItem;
        this.f271206n = interfaceC34800x;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        C34797u c34797u = this.f271204l;
        String str = this.f271205m.f268425c;
        Parcelable parcelableK2 = this.f271206n.k2();
        if (parcelableK2 != null) {
            c34797u.f271223n.f270773b.put(str, parcelableK2);
        }
        return G0.f406611a;
    }
}
