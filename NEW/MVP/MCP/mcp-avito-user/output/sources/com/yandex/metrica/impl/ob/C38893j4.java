package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.j4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38893j4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f380825a;

    /* renamed from: b, reason: collision with root package name */
    private final C39043p4 f380826b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<C38869i4, InterfaceC38918k4> f380827c;

    /* renamed from: d, reason: collision with root package name */
    private final C39108rm<a, C38869i4> f380828d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Context f380829e;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f380830f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38968m4 f380831g;

    /* renamed from: com.yandex.metrica.impl.ob.j4$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f380832a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private final Integer f380833b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private final String f380834c;

        public a(@j.N String str, @j.P Integer num, @j.P String str2) {
            this.f380832a = str;
            this.f380833b = num;
            this.f380834c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f380832a.equals(aVar.f380832a)) {
                return false;
            }
            Integer num = this.f380833b;
            if (num == null ? aVar.f380833b != null : !num.equals(aVar.f380833b)) {
                return false;
            }
            String str = this.f380834c;
            String str2 = aVar.f380834c;
            return str != null ? str.equals(str2) : str2 == null;
        }

        public int hashCode() {
            int iHashCode = this.f380832a.hashCode() * 31;
            Integer num = this.f380833b;
            int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f380834c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public C38893j4(@j.N Context context, @j.N C39043p4 c39043p4) {
        this(context, c39043p4, new C38968m4());
    }

    public InterfaceC38918k4 a(@j.N C38869i4 c38869i4, @j.N D3 d32) {
        InterfaceC38918k4 interfaceC38918k4A;
        synchronized (this.f380825a) {
            try {
                interfaceC38918k4A = this.f380827c.get(c38869i4);
                if (interfaceC38918k4A == null) {
                    interfaceC38918k4A = this.f380831g.a(c38869i4).a(this.f380829e, this.f380826b, c38869i4, d32);
                    this.f380827c.put(c38869i4, interfaceC38918k4A);
                    this.f380828d.a(new a(c38869i4.b(), c38869i4.c(), c38869i4.d()), c38869i4);
                    this.f380830f++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC38918k4A;
    }

    @j.k0
    public C38893j4(@j.N Context context, @j.N C39043p4 c39043p4, @j.N C38968m4 c38968m4) {
        this.f380825a = new Object();
        this.f380827c = new HashMap<>();
        this.f380828d = new C39108rm<>();
        this.f380830f = 0;
        this.f380829e = context.getApplicationContext();
        this.f380826b = c39043p4;
        this.f380831g = c38968m4;
    }

    public void a(@j.N String str, int i12, String str2) {
        Integer numValueOf = Integer.valueOf(i12);
        synchronized (this.f380825a) {
            try {
                Collection<C38869i4> collectionB = this.f380828d.b(new a(str, numValueOf, str2));
                if (!A2.b(collectionB)) {
                    this.f380830f -= collectionB.size();
                    ArrayList arrayList = new ArrayList(collectionB.size());
                    Iterator<C38869i4> it = collectionB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f380827c.remove(it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC38918k4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
