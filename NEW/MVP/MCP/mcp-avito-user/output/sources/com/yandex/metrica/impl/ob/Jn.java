package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class Jn implements Kn<List<In>> {
    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P List<In> list) {
        LinkedList linkedList = new LinkedList();
        boolean z12 = true;
        for (In in2 : list) {
            if (!in2.b()) {
                linkedList.add(in2.a());
                z12 = false;
            }
        }
        return z12 ? In.a(this) : In.a(this, TextUtils.join(", ", linkedList));
    }
}
