package com.avito.android.crm_paid_cvs.view.list_items.range_filter;

import Y41.l;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: RangeFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "range", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements l<Q<? extends Integer, ? extends Integer>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f130944l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FilterItem f130945m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, FilterItem filterItem) {
        super(1);
        this.f130944l = gVar;
        this.f130945m = filterItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends Integer, ? extends Integer> q12) {
        this.f130944l.f130946b.invoke(this.f130945m.f130357b, q12);
        return G0.f406611a;
    }
}
