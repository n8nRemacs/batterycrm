package com.google.common.io;

import com.google.common.base.C37257c;
import com.google.common.base.b0;

/* compiled from: CharSource.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37515q {

    /* compiled from: CharSource.java */
    /* renamed from: com.google.common.io.q$a */
    public final class a extends AbstractC37511m {
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: CharSource.java */
    /* renamed from: com.google.common.io.q$b */
    public static class b extends AbstractC37515q {

        /* renamed from: a, reason: collision with root package name */
        public final String f360337a = "";

        static {
            b0.b();
        }

        public String toString() {
            return "CharSource.wrap(" + C37257c.d(this.f360337a) + ")";
        }
    }

    /* compiled from: CharSource.java */
    /* renamed from: com.google.common.io.q$c */
    public static final class c extends AbstractC37515q {
        public final String toString() {
            return "CharSource.concat(null)";
        }
    }

    /* compiled from: CharSource.java */
    /* renamed from: com.google.common.io.q$d */
    public static final class d extends e {
        static {
            new d();
        }

        @Override // com.google.common.io.AbstractC37515q.b
        public final String toString() {
            return "CharSource.empty()";
        }
    }

    /* compiled from: CharSource.java */
    /* renamed from: com.google.common.io.q$e */
    public static class e extends b {
    }
}
