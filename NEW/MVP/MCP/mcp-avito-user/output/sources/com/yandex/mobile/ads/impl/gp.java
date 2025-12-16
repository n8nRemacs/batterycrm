package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.io;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class gp implements xx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f385794a;

    /* renamed from: b, reason: collision with root package name */
    private final cp f385795b = new cp();

    /* renamed from: c, reason: collision with root package name */
    private ic0 f385796c = ic0.f386447a;

    public gp(Context context) {
        this.f385794a = context;
    }

    @Override // com.yandex.mobile.ads.impl.xx0
    public final ux0[] a(Handler handler, fi1 fi1Var, pc pcVar, v81 v81Var, ig0 ig0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mc0(this.f385794a, this.f385795b, this.f385796c, handler, fi1Var));
        io ioVarA = new io.e().a(lc.a(this.f385794a)).c().b().d().a();
        arrayList.add(new bc0(this.f385794a, this.f385795b, this.f385796c, handler, pcVar, ioVarA));
        arrayList.add(new w81(v81Var, handler.getLooper()));
        arrayList.add(new com.yandex.mobile.ads.exo.metadata.a(ig0Var, handler.getLooper()));
        arrayList.add(new di());
        return (ux0[]) arrayList.toArray(new ux0[0]);
    }
}
