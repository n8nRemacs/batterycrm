package com.fasterxml.jackson.core.io;

import java.io.Writer;

/* compiled from: SegmentedStringWriter.java */
/* loaded from: classes3.dex */
public final class m extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.core.util.p f341184b;

    public m(com.fasterxml.jackson.core.util.a aVar) {
        this.f341184b = new com.fasterxml.jackson.core.util.p(aVar);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        this.f341184b.b(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i12, int i13) {
        append(charSequence, i12, i13);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i12, int i13) {
        this.f341184b.b(cArr, i12, i13);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c12) {
        write(c12);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.f341184b.a(0, str.length(), str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c12) {
        write(c12);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i12, int i13) {
        this.f341184b.a(i12, i13, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f341184b.a(0, string.length(), string);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i12) {
        char c12 = (char) i12;
        com.fasterxml.jackson.core.util.p pVar = this.f341184b;
        if (pVar.f341315c >= 0) {
            pVar.r(16);
        }
        pVar.f341322j = null;
        pVar.f341323k = null;
        char[] cArr = pVar.f341320h;
        if (pVar.f341321i >= cArr.length) {
            pVar.i();
            cArr = pVar.f341320h;
        }
        int i13 = pVar.f341321i;
        pVar.f341321i = i13 + 1;
        cArr[i13] = c12;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i12, int i13) {
        String string = charSequence.subSequence(i12, i13).toString();
        this.f341184b.a(0, string.length(), string);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
