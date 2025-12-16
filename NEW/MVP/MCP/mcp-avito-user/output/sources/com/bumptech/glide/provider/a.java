package com.bumptech.glide.provider;

import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339520a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    public static final class C10516a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f339521a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.a<T> f339522b;

        public C10516a(@N Class<T> cls, @N com.bumptech.glide.load.a<T> aVar) {
            this.f339521a = cls;
            this.f339522b = aVar;
        }
    }

    public final synchronized <T> void a(@N Class<T> cls, @N com.bumptech.glide.load.a<T> aVar) {
        this.f339520a.add(new C10516a(cls, aVar));
    }

    @P
    public final synchronized <T> com.bumptech.glide.load.a<T> b(@N Class<T> cls) {
        Iterator it = this.f339520a.iterator();
        while (it.hasNext()) {
            C10516a c10516a = (C10516a) it.next();
            if (c10516a.f339521a.isAssignableFrom(cls)) {
                return c10516a.f339522b;
            }
        }
        return null;
    }
}
