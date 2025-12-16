package com.avito.android.search.filter.adapter.bottom_sheet_group;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f262001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.b f262002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f262003n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f262004o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ParameterElement.b bVar, j jVar, String str) {
        super(0);
        this.f262001l = hVar;
        this.f262002m = bVar;
        this.f262003n = jVar;
        this.f262004o = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f262001l;
        l41.g<ParameterElement.b> gVar = hVar.f262018c;
        ParameterElement.b bVar = this.f262002m;
        gVar.accept(bVar);
        h.k(hVar, this.f262003n, bVar.f262736h, this.f262004o);
        return G0.f406611a;
    }
}
