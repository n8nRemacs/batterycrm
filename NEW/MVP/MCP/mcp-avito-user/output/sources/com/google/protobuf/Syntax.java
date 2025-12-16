package com.google.protobuf;

import com.google.protobuf.C37670d0;

/* loaded from: classes7.dex */
public enum Syntax implements C37670d0.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f362763b;

    public static final class b implements C37670d0.e {
        static {
            new b();
        }

        @Override // com.google.protobuf.C37670d0.e
        public final boolean isInRange(int i12) {
            return Syntax.a(i12) != null;
        }
    }

    static {
        new C37670d0.d<Syntax>() { // from class: com.google.protobuf.Syntax.a
            @Override // com.google.protobuf.C37670d0.d
            public final C37670d0.c findValueByNumber(int i12) {
                return Syntax.a(i12);
            }
        };
    }

    Syntax(int i12) {
        this.f362763b = i12;
    }

    public static Syntax a(int i12) {
        if (i12 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i12 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i12 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // com.google.protobuf.C37670d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f362763b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
