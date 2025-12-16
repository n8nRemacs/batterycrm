package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class o10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f388414a;

    /* renamed from: b, reason: collision with root package name */
    private final List<dz> f388415b;

    /* renamed from: c, reason: collision with root package name */
    private final int f388416c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final InputStream f388417d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final byte[] f388418e;

    public o10(int i12, ArrayList arrayList) {
        this(i12, arrayList, -1, null);
    }

    @j.P
    public final InputStream a() {
        InputStream inputStream = this.f388417d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f388418e != null) {
            return new ByteArrayInputStream(this.f388418e);
        }
        return null;
    }

    public final int b() {
        return this.f388416c;
    }

    public final List<dz> c() {
        return Collections.unmodifiableList(this.f388415b);
    }

    public final int d() {
        return this.f388414a;
    }

    public o10(int i12, ArrayList arrayList, int i13, InputStream inputStream) {
        this.f388414a = i12;
        this.f388415b = arrayList;
        this.f388416c = i13;
        this.f388417d = inputStream;
        this.f388418e = null;
    }

    public o10(int i12, ArrayList arrayList, byte[] bArr) {
        this.f388414a = i12;
        this.f388415b = arrayList;
        this.f388416c = bArr.length;
        this.f388418e = bArr;
        this.f388417d = null;
    }
}
