package com.avito.android.inline_filters.dialog.calendar;

import Ag.CallableC13028a;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "LMN/c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171318b;

    public v(p pVar) {
        this.f171318b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DateRange f7064h;
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        p pVar = this.f171318b;
        if (!z12) {
            if (!(p22 instanceof P2.c)) {
                if (p22 instanceof P2.a) {
                    pVar.ke(new t(pVar, 1), null);
                    return;
                }
                return;
            } else {
                pVar.f9428J.setValue(null);
                pVar.f9429K.setValue(null);
                pVar.f9430L.setValue(null);
                pVar.f9432N.setValue(null);
                pVar.f9431M.setValue(G0.f406611a);
                return;
            }
        }
        HN.i iVarA = pVar.f171287X.a((List) ((P2.b) p22).f318720a);
        pVar.f9436R = iVarA;
        pVar.f9432N.setValue(null);
        pVar.f9431M.setValue(null);
        s sVar = new s(pVar);
        u uVar = new u(pVar);
        com.jakewharton.rxrelay3.b bVar = iVarA.f7062f;
        bVar.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = bVar.v0(sVar, uVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = pVar.f171297h0;
        cVar.b(dVarV0);
        HN.h hVar = pVar.f9436R;
        if (hVar != null && (f7064h = hVar.getF7064h()) != null) {
            C41948f0 c41948f0W = io.reactivex.rxjava3.core.z.W(new CallableC13028a(15, hVar, f7064h));
            InterfaceC35745a5 interfaceC35745a5 = pVar.f171284U;
            cVar.b(c41948f0W.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new q(pVar), r.f171313b, interfaceC43543a));
        }
        pVar.me();
    }
}
