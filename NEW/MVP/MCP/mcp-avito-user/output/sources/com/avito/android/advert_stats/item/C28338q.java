package com.avito.android.advert_stats.item;

import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_stats.item.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28338q extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f86789l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28339s f86790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28338q(ArrayList arrayList, C28339s c28339s) {
        super(1);
        this.f86789l = arrayList;
        this.f86790m = c28339s;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            ArrayList arrayList = this.f86789l;
            if (iIntValue < arrayList.size()) {
                C28339s c28339s = this.f86790m;
                c28339s.f86794c.accept(arrayList.get(iIntValue));
            }
        }
        return G0.f406611a;
    }
}
