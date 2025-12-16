package com.avito.android.mortgage_calculator.internal.mvi.builder;

import E10.a;
import F10.a;
import G10.a;
import G10.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.internal.items.offers.OfferPreviewRenderType;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y10.C50036a;
import z10.C50349b;
import z10.InterfaceC50351d;

/* compiled from: CalculatorViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/builder/b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/builder/a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage_calculator.internal.mvi.builder.a
    @k
    public final E10.c a(@k E10.c cVar) {
        G10.b aVar;
        G10.b bVar;
        a.b bVar2 = cVar.f3686k;
        E10.d dVar = new E10.d(bVar2.f4479a, bVar2.f4484f, bVar2.f4483e);
        a.C0271a c0271a = cVar.f3687l;
        PrintableText printableText = c0271a.f4474a;
        CalculatorTabType calculatorTabType = c0271a.f4478e;
        boolean z12 = c0271a.f4477d;
        List listU = C42745f0.U(dVar, new E10.d(printableText, calculatorTabType, z12));
        C50036a c50036a = cVar.f3688m;
        E10.a c0210a = z12 ? new a.C0210a(c0271a.f4475b, c0271a.f4476c, c50036a) : new a.b(bVar2.f4480b, bVar2.f4481c, bVar2.f4482d, c50036a);
        G10.a aVar2 = cVar.f3689n;
        if (aVar2 instanceof a.e) {
            bVar = b.d.f6190a;
        } else {
            if (!(aVar2 instanceof a.d)) {
                if (aVar2 instanceof a.b) {
                    aVar = new b.C0326b(((a.b) aVar2).f6180a);
                } else {
                    if (!(aVar2 instanceof a.C0325a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.C0325a c0325a = (a.C0325a) aVar2;
                    AttributedText attributedText = c0325a.f6176a;
                    ArrayList arrayList = c0325a.f6178c;
                    OfferPreviewRenderType offerPreviewRenderType = arrayList.size() == 1 ? OfferPreviewRenderType.f204392c : OfferPreviewRenderType.f204391b;
                    G10.c cVar2 = c0325a.f6179d;
                    List<C50349b> list = cVar2.f6191a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        C50349b c50349b = (C50349b) obj;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (L.f(((InterfaceC50351d) it.next()).getF443779b(), c50349b.f443772f)) {
                                    arrayList2.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                    aVar = new b.a(attributedText, c0325a.f6177b, arrayList, offerPreviewRenderType, G10.c.a(cVar2, arrayList2, 0, false, 14));
                }
                return E10.c.a(cVar, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new E10.e(cVar.f3685j, listU, c0210a, aVar, cVar.f3690o, cVar.f3691p, cVar.f3692q, cVar.f3693r), 131071);
            }
            bVar = b.c.f6189a;
        }
        aVar = bVar;
        return E10.c.a(cVar, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new E10.e(cVar.f3685j, listU, c0210a, aVar, cVar.f3690o, cVar.f3691p, cVar.f3692q, cVar.f3693r), 131071);
    }
}
