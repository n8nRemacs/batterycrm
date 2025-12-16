package com.avito.android.str_calendar.seller.calandar_parameters.items.chips;

import Gy0.InterfaceC13931a;
import JO.m;
import Y41.p;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ChipsSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJO/m;", "value", "", "selected", "Lkotlin/G0;", "invoke", "(LJO/m;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements p<m, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f287100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f287101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.C.b bVar, c cVar) {
        super(2);
        this.f287100l = bVar;
        this.f287101m = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(m mVar, Boolean bool) {
        m mVar2 = mVar;
        if (bool.booleanValue()) {
            ParameterElement.C.b bVar = this.f287100l;
            if (!L.f(bVar.f117212h, mVar2)) {
                this.f287101m.f287098b.invoke(new InterfaceC13931a.i(mVar2, ParameterElement.C.b.L(bVar, mVar2, null, null, 268435327)));
            }
        }
        return G0.f406611a;
    }
}
