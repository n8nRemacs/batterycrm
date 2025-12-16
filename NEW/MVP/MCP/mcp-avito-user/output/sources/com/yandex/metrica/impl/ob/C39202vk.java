package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.C39107rl;

/* renamed from: com.yandex.metrica.impl.ob.vk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39202vk {

    /* renamed from: a, reason: collision with root package name */
    private final C39061pm<C39226wk, Pair<Boolean, C39107rl.b>> f382082a;

    /* renamed from: b, reason: collision with root package name */
    private final int f382083b;

    public C39202vk(int i12, int i13) {
        this.f382082a = new C39250xk(i12);
        this.f382083b = i13;
    }

    public void a(int i12, @j.N String str, boolean z12, @j.P C39107rl.b bVar) {
        if (str.length() <= this.f382083b) {
            this.f382082a.a(new C39226wk(i12, str), new Pair<>(Boolean.valueOf(z12), bVar));
        }
    }

    @j.P
    public Pair<Boolean, C39107rl.b> a(int i12, @j.N String str) {
        if (str.length() > this.f382083b) {
            return null;
        }
        return this.f382082a.a((C39061pm<C39226wk, Pair<Boolean, C39107rl.b>>) new C39226wk(i12, str));
    }

    public void a() {
        this.f382082a.a();
    }
}
