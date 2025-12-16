package com.google.common.io;

import java.io.Writer;

/* compiled from: CharStreams.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37516s {

    /* compiled from: CharStreams.java */
    /* renamed from: com.google.common.io.s$a */
    public static final class a extends Writer {
        static {
            new a();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(char c12) {
            return this;
        }

        public final String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public final void write(int i12) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(@I41.a CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i12, int i13) {
            com.google.common.base.M.l(i12, i13 + i12, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(char c12) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str, int i12, int i13) {
            com.google.common.base.M.l(i12, i13 + i12, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(@I41.a CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str) {
            str.getClass();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(@I41.a CharSequence charSequence, int i12, int i13) {
            append(charSequence, i12, i13);
            return this;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr) {
            cArr.getClass();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(@I41.a CharSequence charSequence, int i12, int i13) {
            com.google.common.base.M.l(i12, i13, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }
}
