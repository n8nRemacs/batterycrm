package com.avito.android.select.new_districts.compose;

import com.avito.android.select.new_districts.mvi.entity.ui.UiItem;
import eq0.InterfaceC40146a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectDistrictScreenContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40146a, G0> f265767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UiItem.DistrictItem f265768m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f265769n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Y41.l lVar, UiItem.DistrictItem districtItem, boolean z12) {
        super(0);
        this.f265767l = lVar;
        this.f265768m = districtItem;
        this.f265769n = z12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        UiItem.DistrictItem districtItem = this.f265768m;
        this.f265767l.invoke(new InterfaceC40146a.e(districtItem.f265840c, districtItem.f265843f, !this.f265769n));
        return G0.f406611a;
    }
}
