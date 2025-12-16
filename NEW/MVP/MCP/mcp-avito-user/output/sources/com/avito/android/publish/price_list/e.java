package com.avito.android.publish.price_list;

import com.avito.android.publish.price_list.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectPriceListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectPriceListFragment f238617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectPriceListFragment selectPriceListFragment) {
        super(1);
        this.f238617l = selectPriceListFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ((com.avito.android.publish.price_list.mvi.entity.c) this.f238617l.f238389p0.getValue()).accept(new a.k(str));
        return G0.f406611a;
    }
}
