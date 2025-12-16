package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CharsToNameCanonicalizer.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b f341244a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C10544b> f341245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341246c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341247d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f341248e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f341249f;

    /* renamed from: g, reason: collision with root package name */
    public a[] f341250g;

    /* renamed from: h, reason: collision with root package name */
    public int f341251h;

    /* renamed from: i, reason: collision with root package name */
    public int f341252i;

    /* renamed from: j, reason: collision with root package name */
    public int f341253j;

    /* renamed from: k, reason: collision with root package name */
    public int f341254k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f341255l;

    /* renamed from: m, reason: collision with root package name */
    public BitSet f341256m;

    /* compiled from: CharsToNameCanonicalizer.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f341257a;

        /* renamed from: b, reason: collision with root package name */
        public final a f341258b;

        /* renamed from: c, reason: collision with root package name */
        public final int f341259c;

        public a(String str, a aVar) {
            this.f341257a = str;
            this.f341258b = aVar;
            this.f341259c = aVar != null ? 1 + aVar.f341259c : 1;
        }
    }

    public b(int i12) {
        this.f341244a = null;
        this.f341246c = i12;
        this.f341248e = true;
        this.f341247d = -1;
        this.f341255l = false;
        this.f341254k = 0;
        this.f341245b = new AtomicReference<>(new C10544b(new String[64], new a[32]));
    }

    public final int a(int i12) {
        int i13 = i12 + (i12 >>> 15);
        int i14 = i13 ^ (i13 << 7);
        return (i14 + (i14 >>> 3)) & this.f341253j;
    }

    public final int b(String str) {
        int length = str.length();
        int iCharAt = this.f341246c;
        for (int i12 = 0; i12 < length; i12++) {
            iCharAt = (iCharAt * 33) + str.charAt(i12);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0085 A[EDGE_INSN: B:113:0x0085->B:48:0x0085 BREAK  A[LOOP:1: B:34:0x0062->B:46:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081 A[LOOP:1: B:34:0x0062->B:46:0x0081, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(int r18, int r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.b.c(int, int, char[], int):java.lang.String");
    }

    public final b d(int i12) {
        return new b(this, i12, this.f341246c, this.f341245b.get());
    }

    public final void e() {
        b bVar;
        if (this.f341255l || (bVar = this.f341244a) == null || !this.f341248e) {
            return;
        }
        C10544b c10544b = new C10544b(this);
        AtomicReference<C10544b> atomicReference = bVar.f341245b;
        C10544b c10544b2 = atomicReference.get();
        int i12 = c10544b2.f341260a;
        int i13 = c10544b.f341260a;
        if (i13 != i12) {
            if (i13 > 12000) {
                c10544b = new C10544b(new String[64], new a[32]);
            }
            while (!atomicReference.compareAndSet(c10544b2, c10544b) && atomicReference.get() == c10544b2) {
            }
        }
        this.f341255l = true;
    }

    /* compiled from: CharsToNameCanonicalizer.java */
    /* renamed from: com.fasterxml.jackson.core.sym.b$b, reason: collision with other inner class name */
    public static final class C10544b {

        /* renamed from: a, reason: collision with root package name */
        public final int f341260a;

        /* renamed from: b, reason: collision with root package name */
        public final int f341261b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f341262c;

        /* renamed from: d, reason: collision with root package name */
        public final a[] f341263d;

        public C10544b(String[] strArr, a[] aVarArr) {
            this.f341260a = 0;
            this.f341261b = 0;
            this.f341262c = strArr;
            this.f341263d = aVarArr;
        }

        public C10544b(b bVar) {
            this.f341260a = bVar.f341251h;
            this.f341261b = bVar.f341254k;
            this.f341262c = bVar.f341249f;
            this.f341263d = bVar.f341250g;
        }
    }

    public b(b bVar, int i12, int i13, C10544b c10544b) {
        this.f341244a = bVar;
        this.f341246c = i13;
        this.f341245b = null;
        this.f341247d = i12;
        this.f341248e = JsonFactory.Feature.f341035c.c(i12);
        String[] strArr = c10544b.f341262c;
        this.f341249f = strArr;
        this.f341250g = c10544b.f341263d;
        this.f341251h = c10544b.f341260a;
        this.f341254k = c10544b.f341261b;
        int length = strArr.length;
        this.f341252i = length - (length >> 2);
        this.f341253j = length - 1;
        this.f341255l = true;
    }
}
