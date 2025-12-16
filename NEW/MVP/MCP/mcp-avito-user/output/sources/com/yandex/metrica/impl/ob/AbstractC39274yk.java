package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.yk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC39274yk<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private List<Object> f382266a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39202vk f382267b;

    public AbstractC39274yk(@j.P T t12, @j.N C39202vk c39202vk) {
        this.f382266a = c(t12);
        this.f382267b = c39202vk;
    }

    @j.N
    private List<Object> c(@j.P T t12) {
        Object c39154tk;
        Pattern patternCompile;
        Pattern patternCompile2;
        ArrayList arrayList = new ArrayList();
        if (t12 == null) {
            return arrayList;
        }
        int iB2 = b(t12);
        List<C39299zl> listA = a(t12);
        arrayList.add(new Zk(iB2));
        for (C39299zl c39299zl : listA) {
            int iOrdinal = c39299zl.f382327a.ordinal();
            if (iOrdinal == 0) {
                c39154tk = new C39154tk(c39299zl.f382328b);
            } else if (iOrdinal != 1) {
                c39154tk = null;
                if (iOrdinal == 2) {
                    try {
                        patternCompile = Pattern.compile(c39299zl.f382328b);
                    } catch (Throwable unused) {
                        patternCompile = null;
                    }
                    if (patternCompile != null) {
                        c39154tk = new Nk(patternCompile);
                    }
                } else if (iOrdinal == 3) {
                    try {
                        patternCompile2 = Pattern.compile(c39299zl.f382328b);
                    } catch (Throwable unused2) {
                        patternCompile2 = null;
                    }
                    if (patternCompile2 != null) {
                        c39154tk = new C39034ok(patternCompile2);
                    }
                }
            } else {
                c39154tk = new C38909jk(c39299zl.f382328b);
            }
            if (c39154tk != null) {
                arrayList.add(c39154tk);
            }
        }
        return A2.c(arrayList);
    }

    @j.N
    public C39202vk a() {
        return this.f382267b;
    }

    public abstract List<C39299zl> a(@j.N T t12);

    public abstract int b(@j.N T t12);

    @j.N
    public List<Object> b() {
        return this.f382266a;
    }

    public void d(@j.P T t12) {
        this.f382267b.a();
        this.f382266a = c(t12);
    }
}
