package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);


    /* renamed from: b, reason: collision with root package name */
    public final String f341096b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f341097c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f341098d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341099e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341100f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341101g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f341102h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f341103i;

    JsonToken(String str, int i12) {
        boolean z12 = false;
        if (str == null) {
            this.f341096b = null;
            this.f341097c = null;
            this.f341098d = null;
        } else {
            this.f341096b = str;
            char[] charArray = str.toCharArray();
            this.f341097c = charArray;
            int length = charArray.length;
            this.f341098d = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                this.f341098d[i13] = (byte) this.f341097c[i13];
            }
        }
        this.f341099e = i12;
        if (i12 != 10) {
        }
        this.f341102h = i12 == 7 || i12 == 8;
        boolean z13 = i12 == 1 || i12 == 3;
        this.f341100f = z13;
        boolean z14 = i12 == 2 || i12 == 4;
        this.f341101g = z14;
        if (!z13 && !z14 && i12 != 5 && i12 != -1) {
            z12 = true;
        }
        this.f341103i = z12;
    }
}
