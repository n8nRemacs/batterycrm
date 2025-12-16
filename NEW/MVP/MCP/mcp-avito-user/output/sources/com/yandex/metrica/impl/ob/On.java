package com.yandex.metrica.impl.ob;

import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class On implements Kn<Revenue> {

    /* renamed from: a, reason: collision with root package name */
    private final Kn<List<In>> f379110a = new Jn();

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P Revenue revenue) {
        return this.f379110a.a(Arrays.asList(new Nn().a(revenue.quantity)));
    }
}
