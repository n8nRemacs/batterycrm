package com.iab.omid.library.corpmailru.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.corpmailru.b.b;
import com.iab.omid.library.corpmailru.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class f implements com.iab.omid.library.corpmailru.a.c, b.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f363985a;

    /* renamed from: b, reason: collision with root package name */
    private float f363986b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.a.e f363987c;

    /* renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.a.b f363988d;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.a.d f363989e;

    /* renamed from: f, reason: collision with root package name */
    private a f363990f;

    public f(com.iab.omid.library.corpmailru.a.e eVar, com.iab.omid.library.corpmailru.a.b bVar) {
        this.f363987c = eVar;
        this.f363988d = bVar;
    }

    public static f a() {
        if (f363985a == null) {
            f363985a = new f(new com.iab.omid.library.corpmailru.a.e(), new com.iab.omid.library.corpmailru.a.b());
        }
        return f363985a;
    }

    private a e() {
        if (this.f363990f == null) {
            this.f363990f = a.a();
        }
        return this.f363990f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f363989e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f363989e.b();
    }

    public float d() {
        return this.f363986b;
    }

    @Override // com.iab.omid.library.corpmailru.a.c
    public void a(float f12) {
        this.f363986b = f12;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f12);
        }
    }

    public void a(Context context) {
        this.f363989e = this.f363987c.a(new Handler(), context, this.f363988d.a(), this);
    }

    @Override // com.iab.omid.library.corpmailru.b.b.a
    public void a(boolean z12) {
        if (z12) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}
