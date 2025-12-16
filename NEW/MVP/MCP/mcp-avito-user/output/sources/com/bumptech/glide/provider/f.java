package com.bumptech.glide.provider;

import com.bumptech.glide.load.m;
import j.N;
import j.P;
import java.util.ArrayList;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f339534a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f339535a;

        /* renamed from: b, reason: collision with root package name */
        public final m<T> f339536b;

        public a(@N Class<T> cls, @N m<T> mVar) {
            this.f339535a = cls;
            this.f339536b = mVar;
        }
    }

    public final synchronized <Z> void a(@N Class<Z> cls, @N m<Z> mVar) {
        this.f339534a.add(new a(cls, mVar));
    }

    @P
    public final synchronized <Z> m<Z> b(@N Class<Z> cls) {
        int size = this.f339534a.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) this.f339534a.get(i12);
            if (aVar.f339535a.isAssignableFrom(cls)) {
                return (m<Z>) aVar.f339536b;
            }
        }
        return null;
    }
}
