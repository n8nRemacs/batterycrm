package com.google.firebase.encoders.proto;

import rZ0.InterfaceC47621b;

@InterfaceC47621b
/* loaded from: classes6.dex */
public @interface Protobuf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntEncoding {

        /* renamed from: b, reason: collision with root package name */
        public static final IntEncoding f361565b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IntEncoding[] f361566c;

        static {
            IntEncoding intEncoding = new IntEncoding("DEFAULT", 0);
            f361565b = intEncoding;
            f361566c = new IntEncoding[]{intEncoding, new IntEncoding("SIGNED", 1), new IntEncoding("FIXED", 2)};
        }

        public IntEncoding() {
            throw null;
        }

        public static IntEncoding valueOf(String str) {
            return (IntEncoding) Enum.valueOf(IntEncoding.class, str);
        }

        public static IntEncoding[] values() {
            return (IntEncoding[]) f361566c.clone();
        }
    }

    IntEncoding intEncoding() default IntEncoding.f361565b;

    int tag();
}
