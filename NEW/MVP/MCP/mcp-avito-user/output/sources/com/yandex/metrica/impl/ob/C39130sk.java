package com.yandex.metrica.impl.ob;

import android.util.SparseIntArray;

/* renamed from: com.yandex.metrica.impl.ob.sk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39130sk implements Qk {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f381845a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private final int f381846b;

    public C39130sk(int i12) {
        this.f381846b = i12;
    }

    @Override // com.yandex.metrica.impl.ob.Qk
    public void a(@j.N C39107rl c39107rl) {
        SparseIntArray sparseIntArray = this.f381845a;
        int i12 = c39107rl.f381780d;
        sparseIntArray.put(i12, sparseIntArray.get(i12) + 1);
    }

    public int a(int i12) {
        return this.f381846b - Integer.valueOf(this.f381845a.get(i12)).intValue();
    }
}
