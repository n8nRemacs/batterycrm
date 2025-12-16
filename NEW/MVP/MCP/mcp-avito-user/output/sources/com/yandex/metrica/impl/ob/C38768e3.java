package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C39205w;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.e3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38768e3 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private InterfaceC38913k f380422a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f380423b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Executor f380424c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Executor f380425d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.billing_interface.b f380426e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final InterfaceC38988n f380427f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final InterfaceC38963m f380428g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C39205w f380429h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C38743d3 f380430i;

    /* renamed from: com.yandex.metrica.impl.ob.e3$a */
    public class a implements C39205w.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C39205w.b
        public void a(@j.N C39205w.a aVar) {
            C38768e3.a(C38768e3.this, aVar);
        }
    }

    public C38768e3(@j.N Context context, @j.N Executor executor, @j.N Executor executor2, @j.N com.yandex.metrica.billing_interface.b bVar, @j.N InterfaceC38988n interfaceC38988n, @j.N InterfaceC38963m interfaceC38963m, @j.N C39205w c39205w, @j.N C38743d3 c38743d3) {
        this.f380423b = context;
        this.f380424c = executor;
        this.f380425d = executor2;
        this.f380426e = bVar;
        this.f380427f = interfaceC38988n;
        this.f380428g = interfaceC38963m;
        this.f380429h = c39205w;
        this.f380430i = c38743d3;
    }

    public static void a(C38768e3 c38768e3, C39205w.a aVar) {
        c38768e3.getClass();
        if (aVar == C39205w.a.VISIBLE) {
            try {
                InterfaceC38913k interfaceC38913k = c38768e3.f380422a;
                if (interfaceC38913k != null) {
                    interfaceC38913k.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(@j.N C39057pi c39057pi, @j.P Boolean bool) {
        InterfaceC38913k interfaceC38913kA;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                interfaceC38913kA = this.f380430i.a(this.f380423b, this.f380424c, this.f380425d, this.f380426e, this.f380427f, this.f380428g);
                this.f380422a = interfaceC38913kA;
            }
            interfaceC38913kA.a(c39057pi.c());
            if (this.f380429h.a(new a()) == C39205w.a.VISIBLE) {
                try {
                    InterfaceC38913k interfaceC38913k = this.f380422a;
                    if (interfaceC38913k != null) {
                        interfaceC38913k.b();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void a(@j.N C39057pi c39057pi) {
        InterfaceC38913k interfaceC38913k;
        synchronized (this) {
            interfaceC38913k = this.f380422a;
        }
        if (interfaceC38913k != null) {
            interfaceC38913k.a(c39057pi.c());
        }
    }
}
