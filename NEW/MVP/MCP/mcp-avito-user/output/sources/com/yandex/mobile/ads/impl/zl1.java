package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.im;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class zl1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ne1 f392295b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dm1 f392294a = new dm1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ma1 f392296c = new ma1();

    public zl1(@j.N ne1 ne1Var) {
        this.f392295b = ne1Var;
    }

    @j.N
    public final ArrayList a(@j.N ne1 ne1Var) {
        ArrayList arrayListE = this.f392295b.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            im imVar = (im) it.next();
            this.f392296c.getClass();
            arrayList.addAll(ma1.a(imVar));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ne1Var.e().iterator();
        while (it2.hasNext()) {
            im imVar2 = (im) it2.next();
            this.f392294a.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayListE.iterator();
            while (it3.hasNext()) {
                arrayList3.addAll(((im) it3.next()).e());
            }
            HashSet hashSet = new HashSet();
            Iterator<y10> it4 = imVar2.e().iterator();
            while (it4.hasNext()) {
                hashSet.add(it4.next().a());
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                y10 y10Var = (y10) it5.next();
                String strA = y10Var.a();
                if (!hashSet.contains(strA)) {
                    arrayList4.add(y10Var);
                    hashSet.add(strA);
                }
            }
            this.f392296c.getClass();
            arrayList2.add(new im.a().b(imVar2.f()).a(imVar2.e()).a(arrayList).a(imVar2.b()).a(imVar2.g()).a(imVar2.d()).a((List) arrayList4).a(ma1.a(imVar2)).a());
        }
        return arrayList2;
    }
}
