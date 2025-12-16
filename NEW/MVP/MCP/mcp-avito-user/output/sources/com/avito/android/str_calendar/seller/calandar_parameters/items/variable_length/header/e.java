package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header;

import Gy0.InterfaceC13931a;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VariableParameterHeaderPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.VariableLengthParameter.b f287302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f287303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ParameterElement.VariableLengthParameter.b bVar, f fVar) {
        super(0);
        this.f287302l = bVar;
        this.f287303m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f287302l.f117384g;
        if (deepLink != null) {
            this.f287303m.f287304b.invoke(new InterfaceC13931a.j(deepLink));
        }
        return G0.f406611a;
    }
}
