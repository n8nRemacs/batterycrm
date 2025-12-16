package com.avito.android.code_check.phone_list.mvi;

import Y61.k;
import com.avito.android.code_check.phone_list.adapter.phone.PhoneItem;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PhoneSearchFilter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/mvi/i;", "Lcom/avito/android/code_check/phone_list/mvi/h;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f119004a;

    @Inject
    public i(@N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f119004a = interfaceC35945t1;
    }

    @Override // com.avito.android.code_check.phone_list.mvi.h
    @k
    public final ArrayList a(@k String str, @k List list) {
        PhoneItem phoneItem;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        boolean zK2 = C43066x.K(string);
        InterfaceC35945t1<String> interfaceC35945t1 = this.f119004a;
        if (zK2) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str2 = ((Phone) it.next()).f119296b;
                arrayList.add(new PhoneItem(interfaceC35945t1.a(Phone.b(str2)), str2, 0, 0, null, 28, null));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (C43066x.q(Phone.b(((Phone) obj).f119296b), string, false)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str3 = ((Phone) it2.next()).f119296b;
            String strA = interfaceC35945t1.a(Phone.b(str3));
            ArrayList arrayList4 = new ArrayList(strA.length());
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= strA.length()) {
                    phoneItem = new PhoneItem(strA, str3, 0, 0, null, 28, null);
                    break;
                }
                int i15 = i14 + 1;
                if (strA.charAt(i13) == string.charAt(0)) {
                    int i16 = 0;
                    int i17 = i14;
                    while (true) {
                        if (strA.charAt(i17) == string.charAt(i16) || !Character.isDigit(strA.charAt(i17))) {
                            if (Character.isDigit(strA.charAt(i17))) {
                                i16++;
                            }
                            if (string.length() == i16) {
                                phoneItem = new PhoneItem(strA, str3, i14, i17, null, 16, null);
                                break;
                            }
                            i17++;
                        }
                    }
                }
                arrayList4.add(G0.f406611a);
                i13++;
                i14 = i15;
            }
            arrayList3.add(phoneItem);
        }
        return arrayList3;
    }
}
