package com.google.common.io;

import java.io.IOException;
import java.io.Writer;

/* compiled from: AppendableWriter.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37499a extends Writer {
    public final void a() throws IOException {
        throw new IOException("Cannot write to a closed writer.");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i12, int i13) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(int i12) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(@I41.a CharSequence charSequence) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        str.getClass();
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(@I41.a CharSequence charSequence) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(@I41.a CharSequence charSequence, int i12, int i13) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer
    public final void write(String str, int i12, int i13) throws IOException {
        str.getClass();
        a();
        throw null;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(@I41.a CharSequence charSequence, int i12, int i13) throws IOException {
        a();
        throw null;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
