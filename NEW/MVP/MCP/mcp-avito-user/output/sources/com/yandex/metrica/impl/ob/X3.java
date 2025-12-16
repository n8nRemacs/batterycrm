package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.D3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class X3 implements InterfaceC38932ki, R3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f379842a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I3 f379843b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39018o4<S3> f379844c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39104ri f379845d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38719c4 f379846e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private S3 f379847f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private Q3 f379848g;

    /* renamed from: h, reason: collision with root package name */
    private List<InterfaceC38932ki> f379849h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final J3 f379850i;

    public X3(@j.N Context context, @j.N I3 i32, @j.N D3 d32, @j.N C38719c4 c38719c4, @j.N InterfaceC39018o4 interfaceC39018o4, @j.N J3 j32, @j.N C38783ei c38783ei) {
        this.f379842a = context;
        this.f379843b = i32;
        this.f379846e = c38719c4;
        this.f379844c = interfaceC39018o4;
        this.f379850i = j32;
        this.f379845d = c38783ei.a(context, i32, d32.f377929a);
        c38783ei.a(i32, this);
    }

    public void a(@j.N C38715c0 c38715c0, @j.N D3 d32) {
        S3 s3A;
        ((C39282z4) a()).a();
        if (C39278z0.a(c38715c0.o())) {
            s3A = a();
        } else {
            if (this.f379847f == null) {
                synchronized (this) {
                    S3 s3A2 = this.f379844c.a(this.f379842a, this.f379843b, this.f379846e.a(), this.f379845d);
                    this.f379847f = s3A2;
                    this.f379849h.add(s3A2);
                }
            }
            s3A = this.f379847f;
        }
        if (!C39278z0.b(c38715c0.o())) {
            D3.a aVar = d32.f377930b;
            synchronized (this) {
                try {
                    this.f379846e.a(aVar);
                    Q3 q32 = this.f379848g;
                    if (q32 != null) {
                        ((C39282z4) q32).a(aVar);
                    }
                    S3 s32 = this.f379847f;
                    if (s32 != null) {
                        s32.a(aVar);
                    }
                } finally {
                }
            }
        }
        s3A.a(c38715c0);
    }

    public synchronized void b(@j.N InterfaceC38918k4 interfaceC38918k4) {
        this.f379850i.b(interfaceC38918k4);
    }

    public synchronized void a(@j.N InterfaceC38918k4 interfaceC38918k4) {
        this.f379850i.a(interfaceC38918k4);
    }

    private Q3 a() {
        if (this.f379848g == null) {
            synchronized (this) {
                Q3 q3B = this.f379844c.b(this.f379842a, this.f379843b, this.f379846e.a(), this.f379845d);
                this.f379848g = q3B;
                this.f379849h.add(q3B);
            }
        }
        return this.f379848g;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public synchronized void a(@j.N C39057pi c39057pi) {
        Iterator<InterfaceC38932ki> it = this.f379849h.iterator();
        while (it.hasNext()) {
            it.next().a(c39057pi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public synchronized void a(@j.N EnumC38833gi enumC38833gi, @j.P C39057pi c39057pi) {
        Iterator<InterfaceC38932ki> it = this.f379849h.iterator();
        while (it.hasNext()) {
            it.next().a(enumC38833gi, c39057pi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.R3
    public void a(@j.N D3 d32) {
        this.f379845d.a(d32.f377929a);
        D3.a aVar = d32.f377930b;
        synchronized (this) {
            try {
                this.f379846e.a(aVar);
                Q3 q32 = this.f379848g;
                if (q32 != null) {
                    ((C39282z4) q32).a(aVar);
                }
                S3 s32 = this.f379847f;
                if (s32 != null) {
                    s32.a(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
