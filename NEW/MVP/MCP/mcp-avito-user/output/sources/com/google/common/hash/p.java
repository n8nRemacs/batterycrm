package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: Funnels.java */
@InterfaceC37497l
@XY0.a
/* loaded from: classes6.dex */
public final class p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Funnels.java */
    public static final class a implements o<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360275b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360275b.clone();
        }

        @Override // com.google.common.hash.o
        public final void F3(byte[] bArr, J j12) {
            j12.c(bArr);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Funnels.java */
    public static final class b implements o<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f360276b = {new b("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360276b.clone();
        }

        @Override // com.google.common.hash.o
        public final void F3(Integer num, J j12) {
            j12.a(num.intValue());
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Funnels.java */
    public static final class c implements o<Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f360277b = {new c("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f360277b.clone();
        }

        @Override // com.google.common.hash.o
        public final void F3(Long l12, J j12) {
            j12.b(l12.longValue());
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.longFunnel()";
        }
    }

    /* compiled from: Funnels.java */
    public static class d<E> implements o<Iterable<? extends E>>, Serializable {
        @Override // com.google.common.hash.o
        public final void F3(Object obj, J j12) {
            Iterator it = ((Iterable) obj).iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }

        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            d.class.hashCode();
            throw null;
        }

        public final String toString() {
            return "Funnels.sequentialFunnel(null)";
        }
    }

    /* compiled from: Funnels.java */
    public static class e extends OutputStream {
        public final String toString() {
            return "Funnels.asOutputStream(null)";
        }

        @Override // java.io.OutputStream
        public final void write(int i12) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i12, int i13) {
            throw null;
        }
    }

    /* compiled from: Funnels.java */
    public static class f implements o<CharSequence>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Charset f360278b;

        /* compiled from: Funnels.java */
        public static class a implements Serializable {
            private static final long serialVersionUID = 0;

            /* renamed from: b, reason: collision with root package name */
            public final String f360279b;

            public a(Charset charset) {
                this.f360279b = charset.name();
            }

            private Object readResolve() {
                return new f(Charset.forName(this.f360279b));
            }
        }

        public f(Charset charset) {
            charset.getClass();
            this.f360278b = charset;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.hash.o
        public final void F3(CharSequence charSequence, J j12) {
            j12.d(charSequence, this.f360278b);
        }

        public final boolean equals(@I41.a Object obj) {
            if (obj instanceof f) {
                return this.f360278b.equals(((f) obj).f360278b);
            }
            return false;
        }

        public final int hashCode() {
            return f.class.hashCode() ^ this.f360278b.hashCode();
        }

        public final String toString() {
            return "Funnels.stringFunnel(" + this.f360278b.name() + ")";
        }

        public Object writeReplace() {
            return new a(this.f360278b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Funnels.java */
    public static final class g implements o<CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ g[] f360280b = {new g("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        g EF5;

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f360280b.clone();
        }

        @Override // com.google.common.hash.o
        public final void F3(CharSequence charSequence, J j12) {
            CharSequence charSequence2 = charSequence;
            AbstractC37490e abstractC37490e = (AbstractC37490e) j12;
            abstractC37490e.getClass();
            int length = charSequence2.length();
            for (int i12 = 0; i12 < length; i12++) {
                abstractC37490e.i(charSequence2.charAt(i12));
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }
}
