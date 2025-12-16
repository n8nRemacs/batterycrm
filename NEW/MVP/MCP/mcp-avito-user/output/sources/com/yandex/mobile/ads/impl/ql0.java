package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ql0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final bl0 f389219a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ik0 f389220b = new ik0();

    public ql0(@j.P bl0 bl0Var) {
        this.f389219a = bl0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        bl0 bl0Var = this.f389219a;
        if (bl0Var != null) {
            List<nj0> listE = bl0Var.e();
            ik0 ik0Var = this.f389220b;
            ik0Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator<nj0> it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(ik0Var.a(it.next()));
            }
            ArrayList arrayList = new ArrayList(hashSet);
            if (!arrayList.isEmpty()) {
                map.put("image_sizes", arrayList);
            }
        }
        return map;
    }
}
