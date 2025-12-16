package com.google.protobuf;

import com.google.protobuf.C37670d0;

/* loaded from: classes7.dex */
public enum NullValue implements C37670d0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f362723b;

    public static final class b implements C37670d0.e {
        static {
            new b();
        }

        @Override // com.google.protobuf.C37670d0.e
        public final boolean isInRange(int i12) {
            NullValue nullValue;
            if (i12 != 0) {
                NullValue nullValue2 = NullValue.NULL_VALUE;
                nullValue = null;
            } else {
                nullValue = NullValue.NULL_VALUE;
            }
            return nullValue != null;
        }
    }

    static {
        new C37670d0.d<NullValue>() { // from class: com.google.protobuf.NullValue.a
            @Override // com.google.protobuf.C37670d0.d
            public final C37670d0.c findValueByNumber(int i12) {
                if (i12 == 0) {
                    return NullValue.NULL_VALUE;
                }
                NullValue nullValue = NullValue.NULL_VALUE;
                return null;
            }
        };
    }

    NullValue(int i12) {
        this.f362723b = i12;
    }

    @Override // com.google.protobuf.C37670d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f362723b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
