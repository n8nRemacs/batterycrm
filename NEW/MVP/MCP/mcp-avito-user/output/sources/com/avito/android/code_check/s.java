package com.avito.android.code_check;

import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.PhoneList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CodeCheckDI.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/s;", "", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes12.dex */
public final class s {
    public static final void a(com.avito.android.code_check_public.a aVar, kotlin.collections.builders.d dVar) {
        com.avito.android.code_check_public.screen.h hVar;
        com.avito.android.code_check_public.a aVar2;
        com.avito.android.code_check_public.a aVar3;
        com.avito.android.code_check_public.a aVar4;
        a.InterfaceC3494a.d dVar2 = aVar instanceof a.InterfaceC3494a.d ? (a.InterfaceC3494a.d) aVar : null;
        if (dVar2 == null || (hVar = dVar2.f119274a) == null) {
            return;
        }
        dVar.put(hVar.getF119333a(), hVar);
        com.avito.android.code_check_public.screen.b bVar = hVar.getF119334b().f119387c;
        if (bVar != null && (aVar4 = bVar.f119330a) != null) {
            a(aVar4, dVar);
        }
        Iterator<T> it = hVar.getF119334b().f119388d.iterator();
        while (it.hasNext()) {
            a((a.InterfaceC3494a.d) it.next(), dVar);
        }
        a(hVar.getF119334b().f119386b, dVar);
        a(hVar.getF119334b().f119385a, dVar);
        PhoneList phoneList = hVar instanceof PhoneList ? (PhoneList) hVar : null;
        if (phoneList != null) {
            PhoneList.b bVar2 = phoneList.f119304d;
            PhoneList.a aVar5 = bVar2.f119321g;
            if (aVar5 != null && (aVar3 = aVar5.f119313b) != null) {
                a(aVar3, dVar);
            }
            PhoneList.a aVar6 = bVar2.f119322h;
            if (aVar6 == null || (aVar2 = aVar6.f119313b) == null) {
                return;
            }
            a(aVar2, dVar);
        }
    }
}
