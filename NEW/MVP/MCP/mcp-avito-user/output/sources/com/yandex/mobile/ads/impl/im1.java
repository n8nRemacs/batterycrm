package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class im1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final em1 f386549a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ArrayList f386550b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private yy0<List<ne1>> f386551c;

    /* renamed from: d, reason: collision with root package name */
    private int f386552d;

    public class a implements yy0<List<ne1>> {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N List<ne1> list) {
            im1.b(im1.this);
            im1.this.f386550b.addAll(list);
            a();
        }

        public /* synthetic */ a(im1 im1Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N ye1 ye1Var) {
            im1.b(im1.this);
            a();
        }

        private void a() {
            if (im1.this.f386552d != 0 || im1.this.f386551c == null) {
                return;
            }
            im1.this.f386551c.a((yy0) im1.this.f386550b);
        }
    }

    public im1(@j.N Context context, @j.N cd1 cd1Var) {
        this.f386549a = new em1(context, cd1Var);
    }

    public static /* synthetic */ void b(im1 im1Var) {
        im1Var.f386552d--;
    }

    public final void a(@j.N Context context, @j.N List<ne1> list, @j.N yy0<List<ne1>> yy0Var) {
        if (list.isEmpty()) {
            yy0Var.a((yy0<List<ne1>>) this.f386550b);
            return;
        }
        this.f386551c = yy0Var;
        for (ne1 ne1Var : list) {
            this.f386552d++;
            this.f386549a.a(context, ne1Var, new a(this, 0));
        }
    }
}
