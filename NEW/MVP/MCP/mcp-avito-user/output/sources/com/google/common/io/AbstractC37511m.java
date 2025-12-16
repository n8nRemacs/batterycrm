package com.google.common.io;

import com.google.common.base.C37257c;
import com.google.common.io.BaseEncoding;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: ByteSource.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37511m {

    /* compiled from: ByteSource.java */
    /* renamed from: com.google.common.io.m$a */
    public class a extends AbstractC37515q {
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: ByteSource.java */
    /* renamed from: com.google.common.io.m$b */
    public static class b extends AbstractC37511m {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f360329a;

        /* renamed from: b, reason: collision with root package name */
        public final int f360330b;

        public b(byte[] bArr) {
            int length = bArr.length;
            this.f360329a = bArr;
            this.f360330b = length;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ByteSource.wrap(");
            BaseEncoding baseEncoding = BaseEncoding.f360297a;
            baseEncoding.getClass();
            byte[] bArr = this.f360329a;
            int length = bArr.length;
            int i12 = this.f360330b;
            com.google.common.base.M.l(0, i12, length);
            BaseEncoding.a aVar = ((BaseEncoding.e) baseEncoding).f360305b;
            StringBuilder sb3 = new StringBuilder(com.google.common.math.f.a(i12, aVar.f360302e, RoundingMode.CEILING) * aVar.f360301d);
            try {
                BaseEncoding.b bVar = (BaseEncoding.b) baseEncoding;
                com.google.common.base.M.l(0, i12, bArr.length);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = bArr[i13] & 255;
                    char[] cArr = bVar.f360304d;
                    sb3.append(cArr[i14]);
                    sb3.append(cArr[i14 | 256]);
                }
                sb2.append(C37257c.d(sb3.toString()));
                sb2.append(")");
                return sb2.toString();
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    /* compiled from: ByteSource.java */
    /* renamed from: com.google.common.io.m$c */
    public static final class c extends AbstractC37511m {
        public final String toString() {
            return "ByteSource.concat(null)";
        }
    }

    /* compiled from: ByteSource.java */
    /* renamed from: com.google.common.io.m$d */
    public static final class d extends b {
        static {
            new d();
        }

        public d() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.AbstractC37511m.b
        public final String toString() {
            return "ByteSource.empty()";
        }
    }

    /* compiled from: ByteSource.java */
    /* renamed from: com.google.common.io.m$e */
    public final class e extends AbstractC37511m {
        public final String toString() {
            throw null;
        }
    }
}
