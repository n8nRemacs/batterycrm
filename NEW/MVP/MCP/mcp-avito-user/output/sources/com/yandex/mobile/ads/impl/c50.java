package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.l40;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class c50 implements yy0<ek1>, l40.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384176a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final l40 f384177b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a f384178c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final zr f384179d = new zr();

    public interface a {
        void a(@j.N o60 o60Var);

        void a(@j.N String str);
    }

    public c50(@j.N Context context, @j.N kf1 kf1Var, @j.N a aVar) {
        this.f384176a = context.getApplicationContext();
        this.f384178c = aVar;
        this.f384177b = new l40(kf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ek1 ek1Var) {
        List<C39366t1> listA = ek1Var.a();
        ArrayList arrayList = new ArrayList();
        for (C39366t1 c39366t1 : listA) {
            if (c39366t1.d().contains("linear")) {
                arrayList.add(c39366t1);
            }
        }
        if (arrayList.isEmpty()) {
            this.f384178c.a("Received response with no ad breaks");
        } else {
            this.f384177b.a(this.f384176a, arrayList, this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@j.N ye1 ye1Var) {
        this.f384178c.a(ye1Var.c());
    }

    public final void a(@j.N ArrayList arrayList) {
        this.f384179d.getClass();
        ArrayList arrayListA = zr.a(arrayList);
        if (!arrayListA.isEmpty()) {
            this.f384178c.a(new o60(arrayListA));
        } else {
            this.f384178c.a("Received response with no ad breaks");
        }
    }
}
