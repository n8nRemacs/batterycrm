package com.my.target.common.models;

import e11.D0;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class e extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f364778e;

    public e(@N String str, int i12, int i13) {
        super(str);
        this.f394305b = i12;
        this.f394306c = i13;
        this.f364778e = !str.endsWith(".m3u8");
    }

    @P
    public static e a(int i12, @N ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        e eVar = null;
        int i13 = 0;
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            int i14 = eVar2.f394306c;
            if (eVar == null || ((i14 <= i12 && i13 > i12) || ((i14 <= i12 && i14 > i13) || (i14 > i12 && i14 < i13)))) {
                eVar = eVar2;
                i13 = i14;
            }
        }
        return eVar;
    }
}
