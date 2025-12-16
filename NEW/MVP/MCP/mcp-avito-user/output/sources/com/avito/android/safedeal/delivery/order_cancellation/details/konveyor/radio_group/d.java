package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group;

import Dn0.InterfaceC13421a;
import JO.m;
import Y41.p;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RadioGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJO/m;", "value", "", "selected", "Lkotlin/G0;", "invoke", "(LJO/m;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements p<m, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f256217l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f256218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.C.b bVar, e eVar) {
        super(2);
        this.f256217l = bVar;
        this.f256218m = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(m mVar, Boolean bool) {
        m mVar2 = mVar;
        if (bool.booleanValue()) {
            ParameterElement.C.b bVar = this.f256217l;
            bVar.f117212h = mVar2;
            e eVar = this.f256218m;
            eVar.f256219b.a(new InterfaceC13421a.c(bVar));
        }
        return G0.f406611a;
    }
}
