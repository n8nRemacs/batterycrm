package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes7.dex */
class N1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378966a;

    /* renamed from: b, reason: collision with root package name */
    private final C38715c0 f378967b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f378968c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38893j4 f378969d;

    public N1(@j.N Context context, C38715c0 c38715c0, Bundle bundle, @j.N C38893j4 c38893j4) {
        this.f378966a = context;
        this.f378967b = c38715c0;
        this.f378968c = bundle;
        this.f378969d = c38893j4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C39281z3 c39281z3 = new C39281z3(this.f378968c);
        if (C39281z3.a(c39281z3, this.f378966a)) {
            return;
        }
        C38869i4 c38869i4A = C38869i4.a(c39281z3);
        D3 d32 = new D3(c39281z3);
        this.f378969d.a(c38869i4A, d32).a(this.f378967b, d32);
    }
}
