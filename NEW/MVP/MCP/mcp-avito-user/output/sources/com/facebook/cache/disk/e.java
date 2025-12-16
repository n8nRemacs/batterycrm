package com.facebook.cache.disk;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import pW0.C47024c;
import pW0.InterfaceC47022a;

/* compiled from: DiskStorage.java */
@Nullsafe
/* loaded from: classes5.dex */
public interface e {

    /* compiled from: DiskStorage.java */
    public static class a {
        public a() {
            new ArrayList();
            new HashMap();
        }
    }

    /* compiled from: DiskStorage.java */
    public static class b {
    }

    /* compiled from: DiskStorage.java */
    public interface c {
        long a();

        String getId();

        long getSize();
    }

    /* compiled from: DiskStorage.java */
    public interface d {
        void a(com.facebook.cache.common.k kVar);

        C47024c commit();

        boolean s();
    }

    void a();

    long b(c cVar);

    @I41.h
    InterfaceC47022a c(String str, com.facebook.cache.common.c cVar);

    d d(String str, com.facebook.cache.common.c cVar);

    boolean e(String str, com.facebook.cache.common.c cVar);

    Collection<c> f();

    boolean isExternal();

    long remove(String str);
}
