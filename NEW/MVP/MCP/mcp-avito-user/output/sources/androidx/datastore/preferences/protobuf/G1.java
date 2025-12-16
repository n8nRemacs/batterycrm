package androidx.datastore.preferences.protobuf;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
abstract class G1<T, B> {
    public abstract void a(B b12, int i12, int i13);

    public abstract void b(B b12, int i12, long j12);

    public abstract void c(B b12, int i12, T t12);

    public abstract void d(B b12, int i12, AbstractC22934w abstractC22934w);

    public abstract void e(B b12, int i12, long j12);

    public abstract H1 f(Object obj);

    public abstract H1 g(Object obj);

    public abstract int h(T t12);

    public abstract int i(T t12);

    public abstract void j(Object obj);

    public abstract H1 k(Object obj, Object obj2);

    public final boolean l(B b12, InterfaceC22891e1 interfaceC22891e1) throws InvalidProtocolBufferException {
        int tag = interfaceC22891e1.getTag();
        int i12 = tag >>> 3;
        int i13 = tag & 7;
        if (i13 == 0) {
            e(b12, i12, interfaceC22891e1.readInt64());
            return true;
        }
        if (i13 == 1) {
            b(b12, i12, interfaceC22891e1.readFixed64());
            return true;
        }
        if (i13 == 2) {
            d(b12, i12, interfaceC22891e1.readBytes());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(b12, i12, interfaceC22891e1.readFixed32());
            return true;
        }
        H1 h1M = m();
        int i14 = (i12 << 3) | 4;
        while (interfaceC22891e1.getFieldNumber() != Integer.MAX_VALUE && l(h1M, interfaceC22891e1)) {
        }
        if (i14 != interfaceC22891e1.getTag()) {
            throw InvalidProtocolBufferException.a();
        }
        c(b12, i12, p(h1M));
        return true;
    }

    public abstract H1 m();

    public abstract void n(Object obj, B b12);

    public abstract void o(GeneratedMessageLite generatedMessageLite, Object obj);

    public abstract H1 p(Object obj);

    public abstract void q(T t12, Writer writer);

    public abstract void r(T t12, Writer writer);
}
