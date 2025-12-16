package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.io.File;

/* loaded from: classes7.dex */
public class Eh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378073a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Mh f378074b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39175uh f378075c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private Jh f378076d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Jh f378077e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private C39057pi f378078f;

    public Eh(@j.N Context context) {
        this(context, new Mh(), new C39175uh(context));
    }

    public synchronized void a(@j.N C39057pi c39057pi) {
        try {
            this.f378078f = c39057pi;
            Jh jh2 = this.f378076d;
            if (jh2 == null) {
                Mh mh2 = this.f378074b;
                Context context = this.f378073a;
                mh2.getClass();
                this.f378076d = new Jh(context, c39057pi, new C39103rh(), new Kh(mh2), new C39223wh("open", "http"), new C39223wh("port_already_in_use", "http"), "Http");
            } else {
                jh2.a(c39057pi);
            }
            this.f378075c.a(c39057pi, this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            Jh jh2 = this.f378076d;
            if (jh2 != null) {
                jh2.b();
            }
            Jh jh3 = this.f378077e;
            if (jh3 != null) {
                jh3.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public Eh(@j.N Context context, @j.N Mh mh2, @j.N C39175uh c39175uh) {
        this.f378073a = context;
        this.f378074b = mh2;
        this.f378075c = c39175uh;
    }

    public synchronized void b(@j.N C39057pi c39057pi) {
        try {
            this.f378078f = c39057pi;
            this.f378075c.a(c39057pi, this);
            Jh jh2 = this.f378076d;
            if (jh2 != null) {
                jh2.b(c39057pi);
            }
            Jh jh3 = this.f378077e;
            if (jh3 != null) {
                jh3.b(c39057pi);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a() {
        try {
            Jh jh2 = this.f378076d;
            if (jh2 != null) {
                jh2.a();
            }
            Jh jh3 = this.f378077e;
            if (jh3 != null) {
                jh3.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(@j.N File file) {
        try {
            Jh jh2 = this.f378077e;
            if (jh2 == null) {
                Mh mh2 = this.f378074b;
                Context context = this.f378073a;
                C39057pi c39057pi = this.f378078f;
                mh2.getClass();
                this.f378077e = new Jh(context, c39057pi, new C39199vh(file), new Lh(mh2), new C39223wh("open", Constants.SCHEME), new C39223wh("port_already_in_use", Constants.SCHEME), "Https");
            } else {
                jh2.a(this.f378078f);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
