package com.avito.android.search.filter.adapter.bottom_sheet_group;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Cp0.e f262012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f262013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.b f262014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f262015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f262016p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Cp0.e eVar, h hVar, ParameterElement.b bVar, j jVar, String str) {
        super(1);
        this.f262012l = eVar;
        this.f262013m = hVar;
        this.f262014n = bVar;
        this.f262015o = jVar;
        this.f262016p = str;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        this.f262012l.f2700e = bool.booleanValue();
        h hVar = this.f262013m;
        l41.g<ParameterElement.b> gVar = hVar.f262020e;
        ParameterElement.b bVar = this.f262014n;
        gVar.accept(bVar);
        h.k(hVar, this.f262015o, bVar.f262736h, this.f262016p);
        return G0.f406611a;
    }
}
