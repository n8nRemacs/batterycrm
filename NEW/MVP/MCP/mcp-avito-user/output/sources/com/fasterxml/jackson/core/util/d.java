package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.e;

/* compiled from: DefaultIndenter.java */
/* loaded from: classes3.dex */
public class d extends e.c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f341289e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f341290f;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f341291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341292c;

    /* renamed from: d, reason: collision with root package name */
    public final String f341293d;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f341289e = property;
        f341290f = new d(property);
    }

    public d() {
        this(f341289e);
    }

    public final void a(JsonGenerator jsonGenerator, int i12) {
        jsonGenerator.X(this.f341293d);
        if (i12 <= 0) {
            return;
        }
        int length = i12 * this.f341292c;
        while (true) {
            char[] cArr = this.f341291b;
            if (length <= cArr.length) {
                jsonGenerator.V(length, cArr);
                return;
            } else {
                jsonGenerator.V(cArr.length, cArr);
                length -= cArr.length;
            }
        }
    }

    public d(String str) {
        this.f341292c = 2;
        this.f341291b = new char[32];
        int i12 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            "  ".getChars(0, 2, this.f341291b, i12);
            i12 += 2;
        }
        this.f341293d = str;
    }
}
