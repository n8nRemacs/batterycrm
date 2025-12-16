package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* loaded from: classes7.dex */
public class Im {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Hm f378531a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile IHandlerExecutor f378532b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f378533c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private volatile ICommonExecutor f378534d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private volatile Handler f378535e;

    public Im() {
        this(new Hm());
    }

    @j.N
    public ICommonExecutor a() {
        if (this.f378533c == null) {
            synchronized (this) {
                try {
                    if (this.f378533c == null) {
                        this.f378531a.getClass();
                        this.f378533c = new Jm("YMM-APT");
                    }
                } finally {
                }
            }
        }
        return this.f378533c;
    }

    @j.N
    public IHandlerExecutor b() {
        if (this.f378532b == null) {
            synchronized (this) {
                try {
                    if (this.f378532b == null) {
                        this.f378531a.getClass();
                        this.f378532b = new Jm("YMM-YM");
                    }
                } finally {
                }
            }
        }
        return this.f378532b;
    }

    @j.N
    public Handler c() {
        if (this.f378535e == null) {
            synchronized (this) {
                try {
                    if (this.f378535e == null) {
                        this.f378531a.getClass();
                        this.f378535e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return this.f378535e;
    }

    @j.N
    public ICommonExecutor d() {
        if (this.f378534d == null) {
            synchronized (this) {
                try {
                    if (this.f378534d == null) {
                        this.f378531a.getClass();
                        this.f378534d = new Jm("YMM-RS");
                    }
                } finally {
                }
            }
        }
        return this.f378534d;
    }

    @j.k0
    public Im(@j.N Hm hm2) {
        this.f378531a = hm2;
    }
}
