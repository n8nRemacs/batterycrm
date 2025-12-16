package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f361567a;

    /* compiled from: AtProtobuf.java */
    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    public static final class C10722a implements Protobuf {

        /* renamed from: A, reason: collision with root package name */
        public final int f361568A;

        public C10722a(int i12) {
            this.f361568A = i12;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f361568A == protobuf.tag() && Protobuf.IntEncoding.f361565b.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f361568A) + (Protobuf.IntEncoding.f361565b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final Protobuf.IntEncoding intEncoding() {
            return Protobuf.IntEncoding.f361565b;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final int tag() {
            return this.f361568A;
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f361568A + "intEncoding=" + Protobuf.IntEncoding.f361565b + ')';
        }
    }

    public final Protobuf a() {
        return new C10722a(this.f361567a);
    }
}
