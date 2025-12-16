package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nb0;

/* loaded from: classes8.dex */
public final class wk implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final nb0.a f391431a = new nb0.a();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nb0[] f391432b;

    public wk(@j.N nb0... nb0VarArr) {
        this.f391432b = nb0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @j.N
    public final nb0.a a(int i12, int i13) {
        nb0[] nb0VarArr = this.f391432b;
        int length = nb0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            nb0.a aVarA = nb0VarArr[i14].a(i12, i13);
            int i15 = aVarA.f388198a;
            i14++;
            i13 = aVarA.f388199b;
            i12 = i15;
        }
        nb0.a aVar = this.f391431a;
        aVar.f388198a = i12;
        aVar.f388199b = i13;
        return aVar;
    }
}
