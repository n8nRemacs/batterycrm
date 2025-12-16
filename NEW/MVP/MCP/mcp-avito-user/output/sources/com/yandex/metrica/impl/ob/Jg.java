package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.text.C43066x;

/* loaded from: classes7.dex */
public final class Jg {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f378618a;

    /* renamed from: b, reason: collision with root package name */
    private final C39136t2 f378619b;

    @j.k0
    public Jg(@Y61.k C39136t2 c39136t2) {
        this.f378619b = c39136t2;
        this.f378618a = a(new String[]{"https://startup.mobile.yandex.net/", "", "", ""});
    }

    @Y61.k
    public final Collection<String> a() {
        String[] strArrA = this.f378619b.a();
        if (strArrA != null) {
            List<String> listA = a(strArrA);
            if (listA.isEmpty()) {
                listA = null;
            }
            if (listA != null) {
                return listA;
            }
        }
        return this.f378618a;
    }

    private final List<String> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || C43066x.K(str)) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public Jg() {
        this(new C39136t2(F0.g().e(), "appmetrica_startup_hosts"));
    }
}
