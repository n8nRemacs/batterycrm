package com.google.gson.internal.bind;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AdvertStatus;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes6.dex */
public final class b extends com.google.gson.stream.c {

    /* renamed from: q, reason: collision with root package name */
    public static final Writer f362127q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final m f362128r = new m(AdvertStatus.CLOSED);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f362129n;

    /* renamed from: o, reason: collision with root package name */
    public String f362130o;

    /* renamed from: p, reason: collision with root package name */
    public i f362131p;

    /* compiled from: JsonTreeWriter.java */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i12, int i13) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f362127q);
        this.f362129n = new ArrayList();
        this.f362131p = j.f362193b;
    }

    public final void A(i iVar) {
        if (this.f362130o != null) {
            iVar.getClass();
            if (!(iVar instanceof j) || this.f362233j) {
                ((k) z()).t(this.f362130o, iVar);
            }
            this.f362130o = null;
            return;
        }
        if (this.f362129n.isEmpty()) {
            this.f362131p = iVar;
            return;
        }
        i iVarZ = z();
        if (!(iVarZ instanceof f)) {
            throw new IllegalStateException();
        }
        ((f) iVarZ).t(iVar);
    }

    @Override // com.google.gson.stream.c
    public final void b() {
        f fVar = new f();
        A(fVar);
        this.f362129n.add(fVar);
    }

    @Override // com.google.gson.stream.c
    public final void c() {
        k kVar = new k();
        A(kVar);
        this.f362129n.add(kVar);
    }

    @Override // com.google.gson.stream.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f362129n;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f362128r);
    }

    @Override // com.google.gson.stream.c
    public final void f() {
        ArrayList arrayList = this.f362129n;
        if (arrayList.isEmpty() || this.f362130o != null) {
            throw new IllegalStateException();
        }
        if (!(z() instanceof f)) {
            throw new IllegalStateException();
        }
        C22026a.e(1, arrayList);
    }

    @Override // com.google.gson.stream.c
    public final void g() {
        ArrayList arrayList = this.f362129n;
        if (arrayList.isEmpty() || this.f362130o != null) {
            throw new IllegalStateException();
        }
        if (!(z() instanceof k)) {
            throw new IllegalStateException();
        }
        C22026a.e(1, arrayList);
    }

    @Override // com.google.gson.stream.c
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f362129n.isEmpty() || this.f362130o != null) {
            throw new IllegalStateException();
        }
        if (!(z() instanceof k)) {
            throw new IllegalStateException();
        }
        this.f362130o = str;
    }

    @Override // com.google.gson.stream.c
    public final com.google.gson.stream.c j() {
        A(j.f362193b);
        return this;
    }

    @Override // com.google.gson.stream.c
    public final void n(long j12) {
        A(new m(Long.valueOf(j12)));
    }

    @Override // com.google.gson.stream.c
    public final void o(Boolean bool) {
        if (bool == null) {
            A(j.f362193b);
        } else {
            A(new m(bool));
        }
    }

    @Override // com.google.gson.stream.c
    public final void p(Number number) {
        if (number == null) {
            A(j.f362193b);
            return;
        }
        if (!this.f362230g) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        A(new m(number));
    }

    @Override // com.google.gson.stream.c
    public final void q(String str) {
        if (str == null) {
            A(j.f362193b);
        } else {
            A(new m(str));
        }
    }

    @Override // com.google.gson.stream.c
    public final void u(boolean z12) {
        A(new m(Boolean.valueOf(z12)));
    }

    public final i y() {
        ArrayList arrayList = this.f362129n;
        if (arrayList.isEmpty()) {
            return this.f362131p;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final i z() {
        return (i) r.j(1, this.f362129n);
    }

    @Override // com.google.gson.stream.c, java.io.Flushable
    public final void flush() {
    }
}
