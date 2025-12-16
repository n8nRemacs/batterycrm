package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import j.N;
import java.util.HashMap;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a<?> f338856b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f338857a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public final e<Object> b(@N Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    public static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f338858a;

        public b(@N Object obj) {
            this.f338858a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @N
        public final Object a() {
            return this.f338858a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void b() {
        }
    }
}
