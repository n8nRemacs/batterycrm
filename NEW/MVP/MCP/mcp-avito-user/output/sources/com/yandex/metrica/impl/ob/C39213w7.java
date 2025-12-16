package com.yandex.metrica.impl.ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@j.X
/* renamed from: com.yandex.metrica.impl.ob.w7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39213w7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f382102a;

    /* renamed from: b, reason: collision with root package name */
    private LocalServerSocket f382103b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f382104c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final B7 f382105d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<String> f382106e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final String f382107f;

    /* renamed from: g, reason: collision with root package name */
    private List<InterfaceC38986mm<String>> f382108g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread f382109h;

    /* renamed from: com.yandex.metrica.impl.ob.w7$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C39213w7.this.f382104c) {
                try {
                    LocalSocket localSocketAccept = C39213w7.this.f382103b.accept();
                    byte[] bArr = new byte[256];
                    int i12 = localSocketAccept.getInputStream().read(bArr);
                    localSocketAccept.close();
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, 0, bArr2, 0, i12);
                    C39213w7.a(C39213w7.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w7$b */
    public class b implements InterfaceC38986mm<String> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            CrashpadServiceHelper.setUpServiceHelper(str);
        }
    }

    public C39213w7(@j.N String str, @j.P String str2) {
        this(str, str2, B7.a(), new b());
    }

    @j.k0
    public C39213w7(@j.N String str, @j.P String str2, @j.N B7 b72, @j.N InterfaceC38986mm<String> interfaceC38986mm) {
        this.f382104c = false;
        this.f382108g = new LinkedList();
        this.f382109h = new a();
        this.f382102a = str;
        this.f382107f = str2;
        this.f382105d = b72;
        this.f382106e = interfaceC38986mm;
    }

    public void a(@j.N InterfaceC38986mm<String> interfaceC38986mm) {
        synchronized (this) {
            this.f382108g.add(interfaceC38986mm);
        }
        if (this.f382104c || this.f382107f == null) {
            return;
        }
        synchronized (this) {
            if (!this.f382104c) {
                try {
                    if (this.f382105d.b()) {
                        this.f382103b = new LocalServerSocket(this.f382102a);
                        this.f382104c = true;
                        this.f382106e.b(this.f382107f);
                        this.f382109h.start();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void b(@j.N InterfaceC38986mm<String> interfaceC38986mm) {
        this.f382108g.remove(interfaceC38986mm);
    }

    public static void a(C39213w7 c39213w7, String str) {
        synchronized (c39213w7) {
            Iterator<InterfaceC38986mm<String>> it = c39213w7.f382108g.iterator();
            while (it.hasNext()) {
                it.next().b(str);
            }
        }
    }
}
