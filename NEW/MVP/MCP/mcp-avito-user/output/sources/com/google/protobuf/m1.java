package com.google.protobuf;

/* compiled from: UnknownFieldSchema.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
abstract class m1<T, B> {
    public abstract void a(B b12, int i12, int i13);

    public abstract void b(B b12, int i12, long j12);

    public abstract void c(B b12, int i12, T t12);

    public abstract void d(B b12, int i12, AbstractC37700t abstractC37700t);

    public abstract void e(B b12, int i12, long j12);

    public abstract n1 f(Object obj);

    public abstract n1 g(Object obj);

    public abstract int h(T t12);

    public abstract int i(T t12);

    public abstract void j(Object obj);

    public abstract n1 k(Object obj, Object obj2);

    public final boolean l(B b12, R0 r02) throws InvalidProtocolBufferException {
        int tag = r02.getTag();
        int i12 = tag >>> 3;
        int i13 = tag & 7;
        if (i13 == 0) {
            e(b12, i12, r02.readInt64());
            return true;
        }
        if (i13 == 1) {
            b(b12, i12, r02.readFixed64());
            return true;
        }
        if (i13 == 2) {
            d(b12, i12, r02.readBytes());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(b12, i12, r02.readFixed32());
            return true;
        }
        n1 n1VarM = m();
        int i14 = (i12 << 3) | 4;
        while (r02.getFieldNumber() != Integer.MAX_VALUE && l(n1VarM, r02)) {
        }
        if (i14 != r02.getTag()) {
            throw InvalidProtocolBufferException.a();
        }
        c(b12, i12, p(n1VarM));
        return true;
    }

    public abstract n1 m();

    public abstract void n(Object obj, B b12);

    public abstract void o(Object obj, T t12);

    public abstract n1 p(Object obj);

    public abstract void q(T t12, Writer writer);

    public abstract void r(T t12, Writer writer);
}
