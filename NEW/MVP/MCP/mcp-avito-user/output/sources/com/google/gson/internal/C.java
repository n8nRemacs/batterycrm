package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes6.dex */
public final class C {

    /* compiled from: Streams.java */
    public static final class a extends Writer {

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.internal.C$a$a, reason: collision with other inner class name */
        public static class C10731a implements CharSequence {

            /* renamed from: b, reason: collision with root package name */
            public char[] f362003b;

            @Override // java.lang.CharSequence
            public final char charAt(int i12) {
                return this.f362003b[i12];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f362003b.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i12, int i13) {
                return new String(this.f362003b, i12, i13 - i12);
            }
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i12, int i13) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(int i12) {
            throw null;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }

    public C() {
        throw new UnsupportedOperationException();
    }

    public static com.google.gson.i a(com.google.gson.stream.a aVar) {
        boolean z12;
        try {
            try {
                aVar.F();
                z12 = false;
                try {
                    return TypeAdapters.f362103z.read(aVar);
                } catch (EOFException e12) {
                    e = e12;
                    if (z12) {
                        return com.google.gson.j.f362193b;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e13) {
                e = e13;
                z12 = true;
            }
        } catch (MalformedJsonException e14) {
            throw new JsonSyntaxException(e14);
        } catch (IOException e15) {
            throw new JsonIOException(e15);
        } catch (NumberFormatException e16) {
            throw new JsonSyntaxException(e16);
        }
    }
}
