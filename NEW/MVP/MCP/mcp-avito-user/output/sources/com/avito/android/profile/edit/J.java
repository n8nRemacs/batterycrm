package com.avito.android.profile.edit;

import com.avito.android.CalledFrom;
import com.avito.android.component.snackbar.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.edit.h0;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.ErrorLabelItem;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/h0;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/profile/edit/h0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfilePresenterImpl f221987b;

    public J(EditProfilePresenterImpl editProfilePresenterImpl) {
        this.f221987b = editProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIndexOf;
        h0 h0Var = (h0) obj;
        boolean z12 = h0Var instanceof h0.a;
        EditProfilePresenterImpl editProfilePresenterImpl = this.f221987b;
        if (z12) {
            EditProfileActivity editProfileActivity = editProfilePresenterImpl.f221966h;
            if (editProfileActivity != null) {
                CalledFrom calledFrom = editProfileActivity.f221956w;
                if (calledFrom == null || !(calledFrom instanceof CalledFrom.Push)) {
                    editProfileActivity.setResult(-1);
                } else {
                    l90.o oVar = editProfileActivity.f221951r;
                    if (oVar == null) {
                        oVar = null;
                    }
                    editProfileActivity.startActivity(oVar.b().setFlags(67108864));
                }
                editProfileActivity.finish();
            }
        } else if (h0Var instanceof h0.b) {
            S s5 = editProfilePresenterImpl.f221967i;
            if (s5 != null) {
                PrintableText printableTextA = InterfaceC35741a1.a.a(editProfilePresenterImpl.f221964f, ((h0.b) h0Var).f222212a, null, null, 6);
                D6.w(s5.f222000e);
                d.a.b(com.avito.android.component.snackbar.d.f125235c, s5.f221998c, printableTextA.k0(s5.f221996a.getContext()), 0, null, null, 0, null, null, 0, 0, 2040).b();
            }
        } else {
            boolean z13 = h0Var instanceof h0.c;
        }
        if (h0Var instanceof h0.e) {
            EditProfileActivity editProfileActivity2 = editProfilePresenterImpl.f221966h;
            if (editProfileActivity2 != null) {
                String str = ((h0.e) h0Var).f222215a;
                com.avito.android.phone_confirmation.P p12 = editProfileActivity2.f221950q;
                if (p12 == null) {
                    p12 = null;
                }
                editProfileActivity2.startActivity(p12.a(str, null, false, false));
                return;
            }
            return;
        }
        if (!(h0Var instanceof h0.c)) {
            if (h0Var instanceof h0.d) {
                editProfilePresenterImpl.g(((h0.d) h0Var).f222214b);
                return;
            } else {
                if (z12) {
                    return;
                }
                boolean z14 = h0Var instanceof h0.b;
                return;
            }
        }
        h0.c cVar = (h0.c) h0Var;
        List<? extends EditProfileItem> list = editProfilePresenterImpl.f221968j;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (T t12 : list) {
                if (!(((EditProfileItem) t12) instanceof ErrorLabelItem)) {
                    arrayList.add(t12);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.avito.android.profile.edit.refactoring.adapter.e.d((EditProfileItem) it.next(), false));
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            for (Map.Entry<Long, String> entry : cVar.f222213a.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                String value = entry.getValue();
                EditProfileItem editProfileItemA = com.avito.android.profile.edit.refactoring.adapter.e.a(jLongValue, arrayList3);
                if (editProfileItemA != null && (iIndexOf = arrayList3.indexOf(editProfileItemA)) >= 0) {
                    com.avito.android.profile.edit.refactoring.adapter.e.c(arrayList3, com.avito.android.profile.edit.refactoring.adapter.e.d(editProfileItemA, true));
                    long f72677b = Long.MAX_VALUE - editProfileItemA.getF72677b();
                    if (com.avito.android.profile.edit.refactoring.adapter.e.a(f72677b, arrayList3) == null) {
                        arrayList3.add(iIndexOf + 1, new ErrorLabelItem(f72677b, value));
                    }
                }
            }
            editProfilePresenterImpl.g(arrayList3);
        }
    }
}
