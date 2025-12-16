package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* loaded from: classes3.dex */
public class WritableTypeId {

    /* renamed from: a, reason: collision with root package name */
    public Object f341264a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f341265b;

    /* renamed from: c, reason: collision with root package name */
    public Object f341266c;

    /* renamed from: d, reason: collision with root package name */
    public String f341267d;

    /* renamed from: e, reason: collision with root package name */
    public Inclusion f341268e;

    /* renamed from: f, reason: collision with root package name */
    public final JsonToken f341269f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f341270g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Inclusion {

        /* renamed from: b, reason: collision with root package name */
        public static final Inclusion f341271b;

        /* renamed from: c, reason: collision with root package name */
        public static final Inclusion f341272c;

        /* renamed from: d, reason: collision with root package name */
        public static final Inclusion f341273d;

        /* renamed from: e, reason: collision with root package name */
        public static final Inclusion f341274e;

        /* renamed from: f, reason: collision with root package name */
        public static final Inclusion f341275f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Inclusion[] f341276g;

        static {
            Inclusion inclusion = new Inclusion("WRAPPER_ARRAY", 0);
            f341271b = inclusion;
            Inclusion inclusion2 = new Inclusion("WRAPPER_OBJECT", 1);
            f341272c = inclusion2;
            Inclusion inclusion3 = new Inclusion("METADATA_PROPERTY", 2);
            f341273d = inclusion3;
            Inclusion inclusion4 = new Inclusion("PAYLOAD_PROPERTY", 3);
            f341274e = inclusion4;
            Inclusion inclusion5 = new Inclusion("PARENT_PROPERTY", 4);
            f341275f = inclusion5;
            f341276g = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public Inclusion() {
            throw null;
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) f341276g.clone();
        }
    }

    public WritableTypeId() {
    }

    public WritableTypeId(JsonToken jsonToken, Object obj) {
        this.f341264a = obj;
        this.f341266c = null;
        this.f341269f = jsonToken;
    }
}
