package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Mg;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ei, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38783ei {

    /* renamed from: a, reason: collision with root package name */
    private final C39108rm<String, InterfaceC38932ki> f380496a = new C39108rm<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, C39104ri> f380497b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private C39057pi f380498c = null;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC39032oi f380499d = new a();

    /* renamed from: com.yandex.metrica.impl.ob.ei$a */
    public class a implements InterfaceC39032oi {
        public a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ei$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final C38783ei f380501a = new C38783ei();
    }

    public static final C38783ei a() {
        return b.f380501a;
    }

    public C39104ri a(@j.N Context context, @j.N I3 i32, @j.N Mg.b bVar) {
        C39104ri c39104ri = this.f380497b.get(i32.b());
        boolean z12 = true;
        if (c39104ri == null) {
            synchronized (this.f380497b) {
                try {
                    c39104ri = this.f380497b.get(i32.b());
                    if (c39104ri == null) {
                        c39104ri = new C39104ri(context, i32.b(), bVar, this.f380499d);
                        this.f380497b.put(i32.b(), c39104ri);
                        z12 = false;
                    }
                } finally {
                }
            }
        }
        if (z12) {
            c39104ri.a(bVar);
        }
        return c39104ri;
    }

    public void a(@j.N I3 i32, @j.N InterfaceC38932ki interfaceC38932ki) {
        synchronized (this.f380497b) {
            try {
                this.f380496a.a(i32.b(), interfaceC38932ki);
                C39057pi c39057pi = this.f380498c;
                if (c39057pi != null) {
                    interfaceC38932ki.a(c39057pi);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
