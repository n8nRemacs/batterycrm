package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.r;

/* compiled from: TypeSerializer.java */
/* loaded from: classes4.dex */
public abstract class o {

    /* compiled from: TypeSerializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342183a;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            f342183a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342183a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342183a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342183a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342183a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract o a(com.fasterxml.jackson.databind.c cVar);

    public abstract String b();

    public abstract JsonTypeInfo.As c();

    public final WritableTypeId d(JsonToken jsonToken, Object obj) {
        WritableTypeId writableTypeId = new WritableTypeId(jsonToken, obj);
        int iOrdinal = c().ordinal();
        if (iOrdinal == 0) {
            writableTypeId.f341268e = WritableTypeId.Inclusion.f341273d;
            writableTypeId.f341267d = b();
        } else if (iOrdinal == 1) {
            writableTypeId.f341268e = WritableTypeId.Inclusion.f341272c;
        } else if (iOrdinal == 2) {
            writableTypeId.f341268e = WritableTypeId.Inclusion.f341271b;
        } else if (iOrdinal == 3) {
            writableTypeId.f341268e = WritableTypeId.Inclusion.f341275f;
            writableTypeId.f341267d = b();
        } else {
            if (iOrdinal != 4) {
                r.c();
                throw null;
            }
            writableTypeId.f341268e = WritableTypeId.Inclusion.f341274e;
            writableTypeId.f341267d = b();
        }
        return writableTypeId;
    }

    public abstract WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);

    public abstract WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId);
}
