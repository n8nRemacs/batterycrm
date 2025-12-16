package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class Pm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Om f379226a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379227b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379228c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379229d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private volatile IHandlerExecutor f379230e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379231f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379232g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379233h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f379234i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private volatile Executor f379235j;

    public Pm() {
        this(new Om());
    }

    @j.N
    public ICommonExecutor a() {
        if (this.f379233h == null) {
            synchronized (this) {
                try {
                    if (this.f379233h == null) {
                        this.f379226a.getClass();
                        this.f379233h = new Jm("YMM-DE");
                    }
                } finally {
                }
            }
        }
        return this.f379233h;
    }

    @j.N
    public IHandlerExecutor b() {
        if (this.f379230e == null) {
            synchronized (this) {
                try {
                    if (this.f379230e == null) {
                        this.f379226a.getClass();
                        this.f379230e = new Jm("YMM-UH-1");
                    }
                } finally {
                }
            }
        }
        return this.f379230e;
    }

    @j.N
    public ICommonExecutor c() {
        if (this.f379227b == null) {
            synchronized (this) {
                try {
                    if (this.f379227b == null) {
                        this.f379226a.getClass();
                        this.f379227b = new Jm("YMM-MC");
                    }
                } finally {
                }
            }
        }
        return this.f379227b;
    }

    @j.N
    public ICommonExecutor d() {
        if (this.f379231f == null) {
            synchronized (this) {
                try {
                    if (this.f379231f == null) {
                        this.f379226a.getClass();
                        this.f379231f = new Jm("YMM-CTH");
                    }
                } finally {
                }
            }
        }
        return this.f379231f;
    }

    @j.N
    public ICommonExecutor e() {
        if (this.f379228c == null) {
            synchronized (this) {
                try {
                    if (this.f379228c == null) {
                        this.f379226a.getClass();
                        this.f379228c = new Jm("YMM-MSTE");
                    }
                } finally {
                }
            }
        }
        return this.f379228c;
    }

    @j.N
    public ICommonExecutor f() {
        if (this.f379234i == null) {
            synchronized (this) {
                try {
                    if (this.f379234i == null) {
                        this.f379226a.getClass();
                        this.f379234i = new Jm("YMM-RTM");
                    }
                } finally {
                }
            }
        }
        return this.f379234i;
    }

    @j.N
    public ICommonExecutor g() {
        if (this.f379232g == null) {
            synchronized (this) {
                try {
                    if (this.f379232g == null) {
                        this.f379226a.getClass();
                        this.f379232g = new Jm("YMM-SIO");
                    }
                } finally {
                }
            }
        }
        return this.f379232g;
    }

    @j.N
    public ICommonExecutor h() {
        if (this.f379229d == null) {
            synchronized (this) {
                try {
                    if (this.f379229d == null) {
                        this.f379226a.getClass();
                        this.f379229d = new Jm("YMM-TP");
                    }
                } finally {
                }
            }
        }
        return this.f379229d;
    }

    @j.N
    public Executor i() {
        if (this.f379235j == null) {
            synchronized (this) {
                try {
                    if (this.f379235j == null) {
                        Om om2 = this.f379226a;
                        om2.getClass();
                        this.f379235j = new Nm(om2, new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f379235j;
    }

    @j.k0
    public Pm(@j.N Om om2) {
        this.f379226a = om2;
    }

    @j.N
    public Lm a(@j.N Runnable runnable) {
        this.f379226a.getClass();
        return Mm.a("YMM-HMSR", runnable);
    }

    @j.N
    public Lm b(@j.N Runnable runnable) {
        this.f379226a.getClass();
        return Mm.a("YMM-IB", runnable);
    }
}
