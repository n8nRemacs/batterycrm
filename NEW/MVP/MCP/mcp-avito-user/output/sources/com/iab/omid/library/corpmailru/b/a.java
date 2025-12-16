package com.iab.omid.library.corpmailru.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f363968a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.corpmailru.adsession.a> f363969b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.corpmailru.adsession.a> f363970c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f363968a;
    }

    public Collection<com.iab.omid.library.corpmailru.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f363969b);
    }

    public Collection<com.iab.omid.library.corpmailru.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f363970c);
    }

    public boolean d() {
        return this.f363970c.size() > 0;
    }

    public void a(com.iab.omid.library.corpmailru.adsession.a aVar) {
        this.f363969b.add(aVar);
    }

    public void b(com.iab.omid.library.corpmailru.adsession.a aVar) {
        boolean zD2 = d();
        this.f363970c.add(aVar);
        if (zD2) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.corpmailru.adsession.a aVar) {
        boolean zD2 = d();
        this.f363969b.remove(aVar);
        this.f363970c.remove(aVar);
        if (!zD2 || d()) {
            return;
        }
        f.a().c();
    }
}
