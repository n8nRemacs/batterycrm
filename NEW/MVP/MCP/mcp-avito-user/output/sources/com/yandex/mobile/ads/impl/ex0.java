package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
final class ex0 extends kotlin.jvm.internal.N implements Y41.a<List<? extends X509Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cx0 f385136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex0(cx0 cx0Var) {
        super(0);
        this.f385136a = cx0Var;
    }

    @Override // Y41.a
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> listC = this.f385136a.f384472e.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
