package com.avito.android.str_calendar.seller.calandar_parameters.items.children_age;

import Gy0.InterfaceC13931a;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChildrenAgeSelectPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f287067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f287068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C29375c f287069n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ParameterElement.C.b bVar, ParameterElement.C29375c c29375c) {
        super(0);
        this.f287067l = iVar;
        this.f287068m = bVar;
        this.f287069n = c29375c;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<InterfaceC13931a, G0> lVar = this.f287067l.f287075b;
        String str = this.f287069n.f117394e;
        ParameterElement.C.b bVar = this.f287068m;
        if (str == null) {
            str = bVar.f117208d;
        }
        lVar.invoke(new InterfaceC13931a.e(bVar, str));
        return G0.f406611a;
    }
}
