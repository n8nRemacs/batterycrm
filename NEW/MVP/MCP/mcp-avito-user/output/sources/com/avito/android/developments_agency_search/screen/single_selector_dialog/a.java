package com.avito.android.developments_agency_search.screen.single_selector_dialog;

import com.avito.android.category_parameters.ParameterElement;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements UnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f139046b;

    public /* synthetic */ a(String str, int i12) {
        this.f139045a = i12;
        this.f139046b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f139045a) {
            case 0:
                com.avito.android.developments_agency_search.adapter.checkable_item.a aVar = (com.avito.android.developments_agency_search.adapter.checkable_item.a) obj;
                int i12 = b.f139047J;
                String str = aVar.f136215b;
                return new com.avito.android.developments_agency_search.adapter.checkable_item.a(str, aVar.f136216c, L.f(str, this.f139046b));
            default:
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj;
                if (!L.f(aVar2.getF76204c(), "extraGuestFee")) {
                    return aVar2;
                }
                ParameterElement.p pVar = (ParameterElement.p) (!(aVar2 instanceof ParameterElement.p) ? null : aVar2);
                return pVar != null ? ParameterElement.p.f(pVar, null, this.f139046b, null, null, 536870909) : aVar2;
        }
    }
}
