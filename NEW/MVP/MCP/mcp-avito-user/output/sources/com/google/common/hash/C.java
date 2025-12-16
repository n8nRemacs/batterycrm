package com.google.common.hash;

import com.google.common.base.e0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LongAddables.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final e0<B> f360192a;

    /* compiled from: LongAddables.java */
    public class a implements e0<B> {
        @Override // com.google.common.base.e0
        public final B get() {
            return new D();
        }
    }

    /* compiled from: LongAddables.java */
    public class b implements e0<B> {
        @Override // com.google.common.base.e0
        public final B get() {
            return new c(null);
        }
    }

    /* compiled from: LongAddables.java */
    public static final class c extends AtomicLong implements B {
        public c() {
        }

        @Override // com.google.common.hash.B
        public final void add(long j12) {
            getAndAdd(j12);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        e0<B> bVar;
        try {
            new D();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f360192a = bVar;
    }
}
