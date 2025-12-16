package com.google.common.cache;

import com.google.common.base.e0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LongAddables.java */
@XY0.b
@h
/* loaded from: classes6.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final e0<p> f359236a;

    /* compiled from: LongAddables.java */
    public class a implements e0<p> {
        @Override // com.google.common.base.e0
        public final p get() {
            return new r();
        }
    }

    /* compiled from: LongAddables.java */
    public class b implements e0<p> {
        @Override // com.google.common.base.e0
        public final p get() {
            return new c(null);
        }
    }

    /* compiled from: LongAddables.java */
    public static final class c extends AtomicLong implements p {
        public c() {
        }

        @Override // com.google.common.cache.p
        public final void a() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.p
        public final void add(long j12) {
            getAndAdd(j12);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        e0<p> bVar;
        try {
            new r();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f359236a = bVar;
    }

    public static p a() {
        return f359236a.get();
    }
}
