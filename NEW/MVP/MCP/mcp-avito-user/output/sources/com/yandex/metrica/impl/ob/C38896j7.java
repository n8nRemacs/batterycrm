package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.j7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38896j7 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private String f380839a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f380840b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC38921k7> f380841c;

    /* renamed from: d, reason: collision with root package name */
    private final C38697b7 f380842d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f380843e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f380844f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private InterfaceC38921k7 f380845g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final B0 f380846h;

    public C38896j7(@j.N Context context, @j.N A3 a32) {
        this(context, A2.a(21) ? Arrays.asList(new A7(context, a32), new C39021o7()) : Collections.singletonList(new C39021o7()), new B0(), new C38697b7());
    }

    private void a() {
        InterfaceC38921k7 next;
        if (!this.f380844f) {
            Iterator<InterfaceC38921k7> it = this.f380841c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                try {
                    C38697b7 c38697b7 = this.f380842d;
                    String strC = next.c();
                    c38697b7.getClass();
                    System.loadLibrary(strC);
                    break;
                } catch (Throwable unused) {
                }
            }
            this.f380845g = next;
            if (next != null) {
                try {
                    next.a(false);
                } catch (Throwable unused2) {
                }
                this.f380839a = this.f380846h.b(this.f380840b, this.f380845g.a());
            }
        }
        this.f380844f = true;
    }

    @j.k0
    public C38896j7(@j.N Context context, @j.N List<InterfaceC38921k7> list, @j.N B0 b02, @j.N C38697b7 c38697b7) {
        this.f380840b = context;
        this.f380841c = list;
        this.f380846h = b02;
        this.f380842d = c38697b7;
    }

    @j.l0
    public synchronized void a(boolean z12, @j.N String str, @j.P String str2) {
        String str3;
        try {
            if (z12) {
                a();
                synchronized (this) {
                    InterfaceC38921k7 interfaceC38921k7 = this.f380845g;
                    if ((interfaceC38921k7 != null) && (str3 = this.f380839a) != null && !this.f380843e) {
                        interfaceC38921k7.a(str, str3, str2);
                        this.f380843e = true;
                    }
                }
            } else {
                synchronized (this) {
                    synchronized (this) {
                        InterfaceC38921k7 interfaceC38921k72 = this.f380845g;
                        if ((interfaceC38921k72 != null) && this.f380843e) {
                            interfaceC38921k72.b();
                        }
                        this.f380843e = false;
                    }
                }
            }
        } catch (Throwable unused) {
            this.f380843e = false;
        } finally {
        }
    }

    public void a(@j.N String str) {
        InterfaceC38921k7 interfaceC38921k7 = this.f380845g;
        if (interfaceC38921k7 != null) {
            interfaceC38921k7.a(str);
        }
    }
}
