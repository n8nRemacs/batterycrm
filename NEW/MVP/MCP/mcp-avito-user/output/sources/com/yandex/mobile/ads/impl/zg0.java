package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.impl.p21;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class zg0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f392262e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile zg0 f392263f;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ug0 f392264a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final yg0 f392265b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final k21 f392266c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private int f392267d = 1;

    public class a implements p21.a {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.p21.a
        public final void a(@j.N q8 q8Var, @j.N ts tsVar) {
            synchronized (zg0.f392262e) {
                zg0.this.f392267d = 3;
            }
            zg0.this.f392265b.a();
        }

        public /* synthetic */ a(zg0 zg0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.p21.a
        public final void a(@j.N w2 w2Var) {
            synchronized (zg0.f392262e) {
                zg0.this.f392267d = 1;
            }
            zg0.this.f392265b.a();
        }
    }

    private zg0(@j.N ug0 ug0Var, @j.N yg0 yg0Var, @j.N k21 k21Var) {
        this.f392264a = ug0Var;
        this.f392265b = yg0Var;
        this.f392266c = k21Var;
    }

    @j.N
    public static zg0 b() {
        if (f392263f == null) {
            synchronized (f392262e) {
                try {
                    if (f392263f == null) {
                        f392263f = new zg0(new ug0(new vg0()), new yg0(), new k21());
                    }
                } finally {
                }
            }
        }
        return f392263f;
    }

    public final void a(@j.N Context context, @j.N InitializationListener initializationListener) {
        this.f392264a.a(new H0(this, context, initializationListener, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(@j.N Context context, @j.N InitializationListener initializationListener) {
        boolean z12;
        int i12;
        boolean z13;
        synchronized (f392262e) {
            try {
                b40 b40Var = new b40(this.f392264a, initializationListener);
                z12 = true;
                i12 = 0;
                if (this.f392267d == 3) {
                    z13 = false;
                } else {
                    this.f392265b.a(b40Var);
                    if (this.f392267d == 1) {
                        this.f392267d = 2;
                        z13 = true;
                        z12 = false;
                    } else {
                        z13 = false;
                        z12 = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            ug0 ug0Var = this.f392264a;
            Objects.requireNonNull(initializationListener);
            ug0Var.b(new J(initializationListener, 3));
        }
        if (z13) {
            a aVar = new a(this, i12);
            C39314d0.a(context);
            this.f392264a.a(this.f392266c.a(context, aVar));
        }
    }
}
