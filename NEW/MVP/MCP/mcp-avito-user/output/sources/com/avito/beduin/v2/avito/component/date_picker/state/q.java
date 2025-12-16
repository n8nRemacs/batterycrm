package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: AvitoDatePickerStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/q;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q extends com.avito.beduin.v2.theme.o<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final q f334218b = new q();

    public q() {
        super("DatePicker");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        q qVar = f334218b;
        String str = qVar.f338364a;
        String string = g12.getString("themeName");
        String strC = qVar.c(g12);
        com.avito.beduin.v2.theme.f fVarA = com.avito.beduin.v2.theme.h.a(g12, "dayStyle", l.f334213l);
        com.avito.beduin.v2.theme.f<r.b> fVarB = com.avito.beduin.v2.theme.s.b(g12, "backgroundColor");
        com.avito.beduin.v2.avito.component.text.state.n nVar = com.avito.beduin.v2.avito.component.text.state.n.f335362b;
        return new k(strC, string, fVarA, fVarB, com.avito.beduin.v2.theme.h.c(g12, "monthTextStyle", nVar), com.avito.beduin.v2.theme.h.c(g12, "weekDayTextStyle", nVar), com.avito.beduin.v2.theme.h.a(g12, "horizontalPadding", m.f334214l), com.avito.beduin.v2.theme.h.a(g12, "monthTitleBottomPadding", n.f334215l), com.avito.beduin.v2.theme.h.a(g12, "daysRowPaddingBottom", p.f334217l), com.avito.beduin.v2.theme.h.a(g12, "monthVerticalPadding", o.f334216l));
    }
}
