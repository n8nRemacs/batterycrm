package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;

/* loaded from: classes.dex */
public enum NullValue implements C22914m0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f45734b;

    public static final class b implements C22914m0.e {
        static {
            new b();
        }

        @Override // androidx.datastore.preferences.protobuf.C22914m0.e
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
        new C22914m0.d<NullValue>() { // from class: androidx.datastore.preferences.protobuf.NullValue.a
        };
    }

    NullValue(int i12) {
        this.f45734b = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45734b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
