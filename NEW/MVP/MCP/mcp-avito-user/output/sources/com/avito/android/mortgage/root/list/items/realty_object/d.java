package com.avito.android.mortgage.root.list.items.realty_object;

import com.avito.android.deep_linking.links.WebViewLink;
import f10.InterfaceC40199a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyObjectPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f202746l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f202747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, e eVar) {
        super(0);
        this.f202746l = cVar;
        this.f202747m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        WebViewLink.OnlyAvitoDomain onlyAvitoDomain = this.f202746l.f202745f;
        if (onlyAvitoDomain != null) {
            this.f202747m.f202748b.invoke(new InterfaceC40199a.C40214p(onlyAvitoDomain));
        }
        return G0.f406611a;
    }
}
