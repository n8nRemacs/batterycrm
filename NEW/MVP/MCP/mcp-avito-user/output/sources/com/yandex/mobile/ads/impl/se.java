package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes8.dex */
final class se implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac1 f389888b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ re f389889c;

    public se(re reVar, ac1 ac1Var) {
        this.f389889c = reVar;
        this.f389888b = ac1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f389889c.k()) {
            return;
        }
        String strA = this.f389888b.a(this.f389889c.f389498f);
        if (TextUtils.isEmpty(strA)) {
            this.f389889c.b(i5.f386323o);
            return;
        }
        this.f389889c.f389502j.b(z3.f392170j);
        this.f389889c.f389498f.c(this.f389888b.a());
        re reVar = this.f389889c;
        n2 n2Var = reVar.f389498f;
        hz0 hz0Var = reVar.f389508p;
        Context context = this.f389889c.f389494b;
        hz0Var.getClass();
        n2Var.b(context.getResources().getConfiguration().orientation);
        ac1 ac1Var = this.f389888b;
        re reVar2 = this.f389889c;
        oe oeVarA = this.f389889c.a(strA, ac1Var.a(reVar2.f389494b, reVar2.f389498f, reVar2.f389500h));
        int i12 = g7.f385602b;
        oeVarA.b((Object) toString());
        this.f389889c.f389495c.a(oeVarA);
    }
}
