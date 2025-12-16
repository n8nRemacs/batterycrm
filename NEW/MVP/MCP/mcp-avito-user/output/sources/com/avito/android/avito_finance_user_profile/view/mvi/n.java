package com.avito.android.avito_finance_user_profile.view.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceAction;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCard;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCardBackground;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCardButton;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import og.C44772a;
import pg.C47078d;
import pg.InterfaceC47077c;

/* compiled from: AvitoFinanceBlockReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lpg/c;", "Lpg/d;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements u<InterfaceC47077c, C47078d> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C47078d a(InterfaceC47077c interfaceC47077c, C47078d c47078d) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        com.avito.android.avito_finance_user_profile.view.item.i iVar;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        InterfaceC47077c interfaceC47077c2 = interfaceC47077c;
        C47078d c47078d2 = c47078d;
        if (!(interfaceC47077c2 instanceof InterfaceC47077c.b)) {
            if (interfaceC47077c2 instanceof InterfaceC47077c.a) {
                InterfaceC47077c.a aVar = (InterfaceC47077c.a) interfaceC47077c2;
                return new C47078d(c47078d2.f428728a, new C47078d.a.c(aVar.f428721a, aVar.f428722b));
            }
            if (interfaceC47077c2 instanceof InterfaceC47077c.f) {
                return new C47078d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            if (interfaceC47077c2 instanceof InterfaceC47077c.g ? true : interfaceC47077c2 instanceof InterfaceC47077c.C12283c ? true : interfaceC47077c2 instanceof InterfaceC47077c.d ? true : interfaceC47077c2 instanceof InterfaceC47077c.e) {
                return c47078d2;
            }
            throw new NoWhenBranchMatchedException();
        }
        C44772a c44772a = ((InterfaceC47077c.b) interfaceC47077c2).f428723a;
        if (c44772a == null || (str = c44772a.f419987a) == null) {
            str = "Финансы";
        }
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        if (c44772a != null) {
            ArrayList arrayList10 = c44772a.f419988b;
            arrayList = new ArrayList(C42745f0.q(arrayList10, 10));
            Iterator it2 = arrayList10.iterator();
            while (it2.hasNext()) {
                List<AvitoFinanceCard> list = (List) it2.next();
                ArrayList arrayList11 = new ArrayList(C42745f0.q(list, 10));
                for (AvitoFinanceCard avitoFinanceCard : list) {
                    String str2 = avitoFinanceCard.f98019b;
                    AvitoFinanceCardBackground avitoFinanceCardBackground = avitoFinanceCard.f98024g;
                    com.avito.android.avito_finance_user_profile.view.item.h hVar = avitoFinanceCardBackground != null ? new com.avito.android.avito_finance_user_profile.view.item.h(avitoFinanceCardBackground.f98029b, avitoFinanceCardBackground.f98030c) : null;
                    AvitoFinanceCardButton avitoFinanceCardButton = avitoFinanceCard.f98025h;
                    if (avitoFinanceCardButton != null) {
                        ArrayList arrayList12 = avitoFinanceCardButton.f98033d;
                        if (arrayList12 != null) {
                            arrayList8 = new ArrayList(C42745f0.q(arrayList12, 10));
                            Iterator it3 = arrayList12.iterator();
                            while (it3.hasNext()) {
                                arrayList8.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it3.next()));
                            }
                        } else {
                            arrayList8 = null;
                        }
                        ArrayList arrayList13 = avitoFinanceCardButton.f98034e;
                        if (arrayList13 != null) {
                            it = it2;
                            arrayList9 = new ArrayList(C42745f0.q(arrayList13, 10));
                            Iterator it4 = arrayList13.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it4.next()));
                            }
                        } else {
                            it = it2;
                            arrayList9 = null;
                        }
                        iVar = new com.avito.android.avito_finance_user_profile.view.item.i(avitoFinanceCardButton.f98031b, avitoFinanceCardButton.f98032c, arrayList8, arrayList9);
                    } else {
                        it = it2;
                        iVar = null;
                    }
                    ArrayList arrayList14 = avitoFinanceCard.f98027j;
                    if (arrayList14 != null) {
                        ArrayList arrayList15 = new ArrayList(C42745f0.q(arrayList14, 10));
                        Iterator it5 = arrayList14.iterator();
                        while (it5.hasNext()) {
                            arrayList15.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it5.next()));
                        }
                        arrayList6 = arrayList15;
                    } else {
                        arrayList6 = null;
                    }
                    ArrayList arrayList16 = avitoFinanceCard.f98028k;
                    if (arrayList16 != null) {
                        ArrayList arrayList17 = new ArrayList(C42745f0.q(arrayList16, 10));
                        Iterator it6 = arrayList16.iterator();
                        while (it6.hasNext()) {
                            arrayList17.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it6.next()));
                        }
                        arrayList7 = arrayList17;
                    } else {
                        arrayList7 = null;
                    }
                    arrayList11.add(new com.avito.android.avito_finance_user_profile.view.item.f(str2, avitoFinanceCard.f98020c, avitoFinanceCard.f98021d, avitoFinanceCard.f98022e, avitoFinanceCard.f98023f, hVar, iVar, avitoFinanceCard.f98026i, arrayList6, arrayList7));
                    it2 = it;
                }
                arrayList.add(arrayList11);
            }
        } else {
            arrayList = null;
        }
        if (c44772a == null || (arrayList5 = c44772a.f419989c) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(C42745f0.q(arrayList5, 10));
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                arrayList2.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it7.next()));
            }
        }
        if (c44772a == null || (arrayList4 = c44772a.f419990d) == null) {
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList(C42745f0.q(arrayList4, 10));
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                arrayList3.add(com.avito.android.avito_finance_user_profile.view.item.c.a((AvitoFinanceAction) it8.next()));
            }
        }
        return new C47078d(c47078d2.f428728a, new C47078d.a.C12284a(new com.avito.android.avito_finance_user_profile.view.item.a(printableTextF, arrayList, arrayList2, arrayList3)));
    }
}
