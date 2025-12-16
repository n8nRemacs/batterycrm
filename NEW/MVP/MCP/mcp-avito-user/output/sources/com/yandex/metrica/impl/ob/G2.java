package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
class G2 implements InterfaceC38961lm<Context, Intent, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ V f378170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f378171b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ H2 f378172c;

    public G2(H2 h22, V v12, CountDownLatch countDownLatch) {
        this.f378172c = h22;
        this.f378170a = v12;
        this.f378171b = countDownLatch;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38961lm
    public Void a(Context context, Intent intent) {
        this.f378170a.a(this.f378172c.c());
        this.f378171b.countDown();
        this.f378172c.f378239k.b(this);
        return null;
    }
}
