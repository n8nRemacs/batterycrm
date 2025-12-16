package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class wg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391407a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hm1 f391408b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final vg1 f391409c = new vg1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ArrayList f391410d = new ArrayList();

    public wg1(@j.N Context context, @j.N cd1 cd1Var) {
        this.f391407a = context.getApplicationContext();
        this.f391408b = new hm1(context, cd1Var);
    }

    public final void a(@j.N List<ne1> list, @j.N yy0<List<ne1>> yy0Var) {
        this.f391409c.getClass();
        ug1 ug1VarA = vg1.a(list);
        this.f391410d.addAll(ug1VarA.a());
        this.f391408b.a(this.f391407a, ug1VarA.b(), new a(yy0Var));
    }

    public class a implements yy0<List<ne1>> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final yy0<List<ne1>> f391411a;

        public a(yy0<List<ne1>> yy0Var) {
            this.f391411a = yy0Var;
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N List<ne1> list) {
            wg1.this.f391409c.getClass();
            ug1 ug1VarA = vg1.a(list);
            wg1.this.f391410d.addAll(ug1VarA.a());
            List<ne1> listB = ug1VarA.b();
            if (listB.isEmpty()) {
                a();
            } else {
                wg1.this.f391408b.a(wg1.this.f391407a, listB, this);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N ye1 ye1Var) {
            a();
        }

        private void a() {
            if (!wg1.this.f391410d.isEmpty()) {
                this.f391411a.a((yy0<List<ne1>>) wg1.this.f391410d);
            } else {
                this.f391411a.a(ye1.a(new ms()));
            }
        }
    }
}
