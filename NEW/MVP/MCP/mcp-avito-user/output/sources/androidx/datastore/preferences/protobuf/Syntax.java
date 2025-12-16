package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22914m0;

/* loaded from: classes.dex */
public enum Syntax implements C22914m0.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);


    /* renamed from: b, reason: collision with root package name */
    public final int f45745b;

    public static final class b implements C22914m0.e {
        static {
            new b();
        }

        @Override // androidx.datastore.preferences.protobuf.C22914m0.e
        public final boolean isInRange(int i12) {
            Syntax syntax;
            if (i12 == 0) {
                syntax = Syntax.SYNTAX_PROTO2;
            } else if (i12 != 1) {
                Syntax syntax2 = Syntax.SYNTAX_PROTO2;
                syntax = null;
            } else {
                syntax = Syntax.SYNTAX_PROTO3;
            }
            return syntax != null;
        }
    }

    static {
        new C22914m0.d<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.a
        };
    }

    Syntax(int i12) {
        this.f45745b = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.C22914m0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45745b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
