package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.ob.C39038p;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.f2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38792f2 implements C39038p.b {

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @j.P
    private static volatile C38792f2 f380519g;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380520a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private C38717c2 f380521b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private WeakReference<Activity> f380522c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38699b9 f380523d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38742d2 f380524e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f380525f;

    @j.k0
    public C38792f2(@j.N Context context, @j.N C38699b9 c38699b9, @j.N C38742d2 c38742d2) {
        this.f380520a = context;
        this.f380523d = c38699b9;
        this.f380524e = c38742d2;
        this.f380521b = c38699b9.s();
        this.f380525f = c38699b9.x();
        P.g().a().a(this);
    }

    @j.N
    public static C38792f2 a(@j.N Context context) {
        if (f380519g == null) {
            synchronized (C38792f2.class) {
                try {
                    if (f380519g == null) {
                        f380519g = new C38792f2(context, new C38699b9(C38899ja.a(context).c()), new C38742d2());
                    }
                } finally {
                }
            }
        }
        return f380519g;
    }

    private void b(@j.P Context context) {
        C38717c2 c38717c2A;
        if (context == null || (c38717c2A = this.f380524e.a(context)) == null || c38717c2A.equals(this.f380521b)) {
            return;
        }
        this.f380521b = c38717c2A;
        this.f380523d.a(c38717c2A);
    }

    @j.P
    @j.l0
    public synchronized C38717c2 a() {
        try {
            b(this.f380522c.get());
            if (this.f380521b == null) {
                if (A2.a(30)) {
                    if (!this.f380525f) {
                        b(this.f380520a);
                        this.f380525f = true;
                        this.f380523d.z();
                    }
                } else {
                    b(this.f380520a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380521b;
    }

    @Override // com.yandex.metrica.impl.ob.C39038p.b
    @j.l0
    public synchronized void a(@j.N Activity activity) {
        this.f380522c = new WeakReference<>(activity);
        if (this.f380521b == null) {
            b(activity);
        }
    }
}
