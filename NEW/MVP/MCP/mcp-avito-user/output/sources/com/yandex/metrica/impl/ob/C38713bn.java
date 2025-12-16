package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.bn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38713bn {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38688an f380249a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Zm f380250b;

    public C38713bn(@j.N C38737cm c38737cm, @j.N String str) {
        this(new C38688an(30, 50, 4000, str, c38737cm), new Zm(4500, str, c38737cm));
    }

    public synchronized boolean a(@j.N C38687am c38687am, @j.N String str, @j.P String str2) {
        try {
            if (c38687am.size() >= this.f380249a.a().a() && (this.f380249a.a().a() != c38687am.size() || !c38687am.containsKey(str))) {
                this.f380249a.a(str);
            } else {
                if (!this.f380250b.a(c38687am, str, str2)) {
                    c38687am.put(str, str2);
                    return true;
                }
                this.f380250b.a(str);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean b(@j.P C38687am c38687am, @j.N String str, @j.P String str2) {
        if (c38687am == null) {
            return false;
        }
        String strA = this.f380249a.b().a(str);
        String strA2 = this.f380249a.c().a(str2);
        if (!c38687am.containsKey(strA)) {
            if (strA2 != null) {
                return a(c38687am, strA, strA2);
            }
            return false;
        }
        String str3 = c38687am.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(c38687am, strA, strA2);
        }
        return false;
    }

    @j.k0
    public C38713bn(@j.N C38688an c38688an, @j.N Zm zm2) {
        this.f380249a = c38688an;
        this.f380250b = zm2;
    }
}
