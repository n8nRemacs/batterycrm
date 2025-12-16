package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.g1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38816g1 {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C38816g1 f380611c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f380612d = new Object();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private List<String> f380613a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final List<a> f380614b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public interface a {
        void a();
    }

    @j.k0
    public C38816g1(Context context) {
        synchronized (this) {
            this.f380613a = a(context.getResources().getConfiguration());
        }
    }

    public static C38816g1 a(@j.N Context context) {
        if (f380611c == null) {
            synchronized (f380612d) {
                try {
                    if (f380611c == null) {
                        f380611c = new C38816g1(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f380611c;
    }

    public void b(@j.N Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f380613a = a(configuration);
            arrayList = new ArrayList(this.f380614b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    @j.N
    public List<String> a() {
        return this.f380613a;
    }

    public synchronized void a(@j.N a aVar) {
        this.f380614b.add(aVar);
    }

    private List<String> a(@j.N Configuration configuration) {
        if (A2.a(24)) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = configuration.getLocales();
            if (locales != null) {
                int size = locales.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Locale locale = locales.get(i12);
                    if (locale != null) {
                        arrayList.add(H1.a(locale));
                    }
                }
            }
            return arrayList;
        }
        return Collections.singletonList(H1.a(configuration.locale));
    }
}
