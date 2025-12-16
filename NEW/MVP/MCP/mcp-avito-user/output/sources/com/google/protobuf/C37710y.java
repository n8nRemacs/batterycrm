package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37710y implements R0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37708x f363005a;

    /* renamed from: b, reason: collision with root package name */
    public int f363006b;

    /* renamed from: c, reason: collision with root package name */
    public int f363007c;

    /* renamed from: d, reason: collision with root package name */
    public int f363008d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: com.google.protobuf.y$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f363009a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f363009a = iArr;
            try {
                iArr[WireFormat.FieldType.f362796k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f363009a[WireFormat.FieldType.f362800o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f363009a[WireFormat.FieldType.f362789d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f363009a[WireFormat.FieldType.f362802q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f363009a[WireFormat.FieldType.f362795j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f363009a[WireFormat.FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f363009a[WireFormat.FieldType.f362790e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f363009a[WireFormat.FieldType.f362793h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f363009a[WireFormat.FieldType.f362791f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f363009a[WireFormat.FieldType.f362799n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f363009a[WireFormat.FieldType.f362803r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f363009a[WireFormat.FieldType.f362804s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f363009a[WireFormat.FieldType.f362805t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f363009a[WireFormat.FieldType.f362806u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f363009a[WireFormat.FieldType.f362797l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f363009a[WireFormat.FieldType.f362801p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f363009a[WireFormat.FieldType.f362792g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C37710y(AbstractC37708x abstractC37708x) {
        C37670d0.a(abstractC37708x, "input");
        this.f363005a = abstractC37708x;
        abstractC37708x.f362970d = this;
    }

    public static void n(int i12) throws InvalidProtocolBufferException {
        if ((i12 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void o(int i12) throws InvalidProtocolBufferException {
        if ((i12 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.protobuf.R0
    public final <T> void a(T t12, T0<T> t02, M m12) throws InvalidProtocolBufferException {
        m(2);
        i(t12, t02, m12);
    }

    @Override // com.google.protobuf.R0
    public final <T> void b(List<T> list, T0<T> t02, M m12) throws InvalidProtocolBufferException {
        int iF2;
        int i12 = this.f363006b;
        if ((i12 & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            T tNewInstance = t02.newInstance();
            i(tNewInstance, t02, m12);
            t02.makeImmutable(tNewInstance);
            list.add(tNewInstance);
            AbstractC37708x abstractC37708x = this.f363005a;
            if (abstractC37708x.g() || this.f363008d != 0) {
                return;
            } else {
                iF2 = abstractC37708x.F();
            }
        } while (iF2 == i12);
        this.f363008d = iF2;
    }

    @Override // com.google.protobuf.R0
    @Deprecated
    public final <T> T c(Class<T> cls, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(3);
        T0<T> t0A = N0.f362717c.a(cls);
        T tNewInstance = t0A.newInstance();
        h(tNewInstance, t0A, m12);
        t0A.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    @Override // com.google.protobuf.R0
    public final <T> T d(Class<T> cls, M m12) throws InvalidProtocolBufferException {
        m(2);
        T0<T> t0A = N0.f362717c.a(cls);
        T tNewInstance = t0A.newInstance();
        i(tNewInstance, t0A, m12);
        t0A.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void e(java.util.Map<K, V> r10, com.google.protobuf.C37694p0.b<K, V> r11, com.google.protobuf.M r12) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.m(r0)
            com.google.protobuf.x r1 = r9.f363005a
            int r2 = r1.G()
            int r2 = r1.l(r2)
            r11.getClass()
            java.lang.String r3 = ""
            V r4 = r11.f362938c
            r5 = r4
        L16:
            int r6 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5c
            boolean r7 = r1.g()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L26
            goto L5c
        L26:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L47
            if (r6 == r0) goto L3c
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            if (r6 == 0) goto L34
            goto L16
        L34:
            com.google.protobuf.InvalidProtocolBufferException r6 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            throw r6     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
        L3a:
            r10 = move-exception
            goto L63
        L3c:
            com.google.protobuf.WireFormat$FieldType r6 = r11.f362937b     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Object r5 = r9.j(r6, r7, r12)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L47:
            com.google.protobuf.WireFormat$FieldType r6 = r11.f362936a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r7 = 0
            java.lang.Object r3 = r9.j(r6, r7, r7)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L4f:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L56
            goto L16
        L56:
            com.google.protobuf.InvalidProtocolBufferException r10 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r10     // Catch: java.lang.Throwable -> L3a
        L5c:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L3a
            r1.k(r2)
            return
        L63:
            r1.k(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37710y.e(java.util.Map, com.google.protobuf.p0$b, com.google.protobuf.M):void");
    }

    @Override // com.google.protobuf.R0
    public final <T> void f(T t12, T0<T> t02, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(3);
        h(t12, t02, m12);
    }

    @Override // com.google.protobuf.R0
    @Deprecated
    public final <T> void g(List<T> list, T0<T> t02, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF2;
        int i12 = this.f363006b;
        if ((i12 & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            T tNewInstance = t02.newInstance();
            h(tNewInstance, t02, m12);
            t02.makeImmutable(tNewInstance);
            list.add(tNewInstance);
            AbstractC37708x abstractC37708x = this.f363005a;
            if (abstractC37708x.g() || this.f363008d != 0) {
                return;
            } else {
                iF2 = abstractC37708x.F();
            }
        } while (iF2 == i12);
        this.f363008d = iF2;
    }

    @Override // com.google.protobuf.R0
    public final int getFieldNumber() {
        int i12 = this.f363008d;
        if (i12 != 0) {
            this.f363006b = i12;
            this.f363008d = 0;
        } else {
            this.f363006b = this.f363005a.F();
        }
        int i13 = this.f363006b;
        if (i13 == 0 || i13 == this.f363007c) {
            return Integer.MAX_VALUE;
        }
        return i13 >>> 3;
    }

    @Override // com.google.protobuf.R0
    public final int getTag() {
        return this.f363006b;
    }

    public final <T> void h(T t12, T0<T> t02, M m12) {
        int i12 = this.f363007c;
        this.f363007c = ((this.f363006b >>> 3) << 3) | 4;
        try {
            t02.e(t12, this, m12);
            if (this.f363006b == this.f363007c) {
            } else {
                throw InvalidProtocolBufferException.g();
            }
        } finally {
            this.f363007c = i12;
        }
    }

    public final <T> void i(T t12, T0<T> t02, M m12) throws InvalidProtocolBufferException {
        AbstractC37708x abstractC37708x = this.f363005a;
        int iG2 = abstractC37708x.G();
        if (abstractC37708x.f362967a >= abstractC37708x.f362968b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL2 = abstractC37708x.l(iG2);
        abstractC37708x.f362967a++;
        t02.e(t12, this, m12);
        abstractC37708x.a(0);
        abstractC37708x.f362967a--;
        abstractC37708x.k(iL2);
    }

    public final Object j(WireFormat.FieldType fieldType, Class<?> cls, M m12) {
        switch (a.f363009a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return d(cls, m12);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void k(List<String> list, boolean z12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF2;
        int iF3;
        if ((this.f363006b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z13 = list instanceof InterfaceC37684k0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z13 || z12) {
            do {
                list.add(z12 ? readStringRequireUtf8() : readString());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF2 = abstractC37708x.F();
                }
            } while (iF2 == this.f363006b);
            this.f363008d = iF2;
            return;
        }
        InterfaceC37684k0 interfaceC37684k0 = (InterfaceC37684k0) list;
        do {
            interfaceC37684k0.u0(readBytes());
            if (abstractC37708x.g()) {
                return;
            } else {
                iF3 = abstractC37708x.F();
            }
        } while (iF3 == this.f363006b);
        this.f363008d = iF3;
    }

    public final void l(int i12) throws InvalidProtocolBufferException {
        if (this.f363005a.f() != i12) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void m(int i12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f363006b & 7) != i12) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.R0
    public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.m();
    }

    @Override // com.google.protobuf.R0
    public final void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37693p;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC37708x.m()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Boolean.valueOf(abstractC37708x.m()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37693p c37693p = (C37693p) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37693p.addBoolean(abstractC37708x.m());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37693p.addBoolean(abstractC37708x.m());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final AbstractC37700t readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f363005a.n();
    }

    @Override // com.google.protobuf.R0
    public final void readBytesList(List<AbstractC37700t> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF2;
        if ((this.f363006b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(readBytes());
            AbstractC37708x abstractC37708x = this.f363005a;
            if (abstractC37708x.g()) {
                return;
            } else {
                iF2 = abstractC37708x.F();
            }
        } while (iF2 == this.f363006b);
        this.f363008d = iF2;
    }

    @Override // com.google.protobuf.R0
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f363005a.o();
    }

    @Override // com.google.protobuf.R0
    public final void readDoubleList(List<Double> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof B;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 1) {
                do {
                    list.add(Double.valueOf(abstractC37708x.o()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iG2 = abstractC37708x.G();
            o(iG2);
            int iF4 = abstractC37708x.f() + iG2;
            do {
                list.add(Double.valueOf(abstractC37708x.o()));
            } while (abstractC37708x.f() < iF4);
            return;
        }
        B b12 = (B) list;
        int i13 = this.f363006b & 7;
        if (i13 == 1) {
            do {
                b12.addDouble(abstractC37708x.o());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iG3 = abstractC37708x.G();
        o(iG3);
        int iF5 = abstractC37708x.f() + iG3;
        do {
            b12.addDouble(abstractC37708x.o());
        } while (abstractC37708x.f() < iF5);
    }

    @Override // com.google.protobuf.R0
    public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.p();
    }

    @Override // com.google.protobuf.R0
    public final void readEnumList(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC37708x.p()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Integer.valueOf(abstractC37708x.p()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37668c0.addInt(abstractC37708x.p());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37668c0.addInt(abstractC37708x.p());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f363005a.q();
    }

    @Override // com.google.protobuf.R0
    public final void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 2) {
                int iG2 = abstractC37708x.G();
                n(iG2);
                int iF4 = abstractC37708x.f() + iG2;
                do {
                    list.add(Integer.valueOf(abstractC37708x.q()));
                } while (abstractC37708x.f() < iF4);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(abstractC37708x.q()));
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF2 = abstractC37708x.F();
                }
            } while (iF2 == this.f363006b);
            this.f363008d = iF2;
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 2) {
            int iG3 = abstractC37708x.G();
            n(iG3);
            int iF5 = abstractC37708x.f() + iG3;
            do {
                c37668c0.addInt(abstractC37708x.q());
            } while (abstractC37708x.f() < iF5);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c37668c0.addInt(abstractC37708x.q());
            if (abstractC37708x.g()) {
                return;
            } else {
                iF3 = abstractC37708x.F();
            }
        } while (iF3 == this.f363006b);
        this.f363008d = iF3;
    }

    @Override // com.google.protobuf.R0
    public final long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f363005a.r();
    }

    @Override // com.google.protobuf.R0
    public final void readFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37690n0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(abstractC37708x.r()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iG2 = abstractC37708x.G();
            o(iG2);
            int iF4 = abstractC37708x.f() + iG2;
            do {
                list.add(Long.valueOf(abstractC37708x.r()));
            } while (abstractC37708x.f() < iF4);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 1) {
            do {
                c37690n0.addLong(abstractC37708x.r());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iG3 = abstractC37708x.G();
        o(iG3);
        int iF5 = abstractC37708x.f() + iG3;
        do {
            c37690n0.addLong(abstractC37708x.r());
        } while (abstractC37708x.f() < iF5);
    }

    @Override // com.google.protobuf.R0
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f363005a.s();
    }

    @Override // com.google.protobuf.R0
    public final void readFloatList(List<Float> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof W;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 2) {
                int iG2 = abstractC37708x.G();
                n(iG2);
                int iF4 = abstractC37708x.f() + iG2;
                do {
                    list.add(Float.valueOf(abstractC37708x.s()));
                } while (abstractC37708x.f() < iF4);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(abstractC37708x.s()));
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF2 = abstractC37708x.F();
                }
            } while (iF2 == this.f363006b);
            this.f363008d = iF2;
            return;
        }
        W w12 = (W) list;
        int i13 = this.f363006b & 7;
        if (i13 == 2) {
            int iG3 = abstractC37708x.G();
            n(iG3);
            int iF5 = abstractC37708x.f() + iG3;
            do {
                w12.addFloat(abstractC37708x.s());
            } while (abstractC37708x.f() < iF5);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            w12.addFloat(abstractC37708x.s());
            if (abstractC37708x.g()) {
                return;
            } else {
                iF3 = abstractC37708x.F();
            }
        } while (iF3 == this.f363006b);
        this.f363008d = iF3;
    }

    @Override // com.google.protobuf.R0
    public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.u();
    }

    @Override // com.google.protobuf.R0
    public final void readInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC37708x.u()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Integer.valueOf(abstractC37708x.u()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37668c0.addInt(abstractC37708x.u());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37668c0.addInt(abstractC37708x.u());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.v();
    }

    @Override // com.google.protobuf.R0
    public final void readInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37690n0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC37708x.v()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Long.valueOf(abstractC37708x.v()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37690n0.addLong(abstractC37708x.v());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37690n0.addLong(abstractC37708x.v());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f363005a.z();
    }

    @Override // com.google.protobuf.R0
    public final void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 2) {
                int iG2 = abstractC37708x.G();
                n(iG2);
                int iF4 = abstractC37708x.f() + iG2;
                do {
                    list.add(Integer.valueOf(abstractC37708x.z()));
                } while (abstractC37708x.f() < iF4);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(abstractC37708x.z()));
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF2 = abstractC37708x.F();
                }
            } while (iF2 == this.f363006b);
            this.f363008d = iF2;
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 2) {
            int iG3 = abstractC37708x.G();
            n(iG3);
            int iF5 = abstractC37708x.f() + iG3;
            do {
                c37668c0.addInt(abstractC37708x.z());
            } while (abstractC37708x.f() < iF5);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c37668c0.addInt(abstractC37708x.z());
            if (abstractC37708x.g()) {
                return;
            } else {
                iF3 = abstractC37708x.F();
            }
        } while (iF3 == this.f363006b);
        this.f363008d = iF3;
    }

    @Override // com.google.protobuf.R0
    public final long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f363005a.A();
    }

    @Override // com.google.protobuf.R0
    public final void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37690n0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(abstractC37708x.A()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iG2 = abstractC37708x.G();
            o(iG2);
            int iF4 = abstractC37708x.f() + iG2;
            do {
                list.add(Long.valueOf(abstractC37708x.A()));
            } while (abstractC37708x.f() < iF4);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 1) {
            do {
                c37690n0.addLong(abstractC37708x.A());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iG3 = abstractC37708x.G();
        o(iG3);
        int iF5 = abstractC37708x.f() + iG3;
        do {
            c37690n0.addLong(abstractC37708x.A());
        } while (abstractC37708x.f() < iF5);
    }

    @Override // com.google.protobuf.R0
    public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.B();
    }

    @Override // com.google.protobuf.R0
    public final void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC37708x.B()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Integer.valueOf(abstractC37708x.B()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37668c0.addInt(abstractC37708x.B());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37668c0.addInt(abstractC37708x.B());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.C();
    }

    @Override // com.google.protobuf.R0
    public final void readSInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37690n0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC37708x.C()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Long.valueOf(abstractC37708x.C()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37690n0.addLong(abstractC37708x.C());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37690n0.addLong(abstractC37708x.C());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f363005a.D();
    }

    @Override // com.google.protobuf.R0
    public final void readStringList(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, false);
    }

    @Override // com.google.protobuf.R0
    public final void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, true);
    }

    @Override // com.google.protobuf.R0
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f363005a.E();
    }

    @Override // com.google.protobuf.R0
    public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.G();
    }

    @Override // com.google.protobuf.R0
    public final void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37668c0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC37708x.G()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Integer.valueOf(abstractC37708x.G()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37668c0.addInt(abstractC37708x.G());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37668c0.addInt(abstractC37708x.G());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f363005a.H();
    }

    @Override // com.google.protobuf.R0
    public final void readUInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iF2;
        int iF3;
        boolean z12 = list instanceof C37690n0;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (!z12) {
            int i12 = this.f363006b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC37708x.H()));
                    if (abstractC37708x.g()) {
                        return;
                    } else {
                        iF2 = abstractC37708x.F();
                    }
                } while (iF2 == this.f363006b);
                this.f363008d = iF2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iF4 = abstractC37708x.f() + abstractC37708x.G();
            do {
                list.add(Long.valueOf(abstractC37708x.H()));
            } while (abstractC37708x.f() < iF4);
            l(iF4);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        int i13 = this.f363006b & 7;
        if (i13 == 0) {
            do {
                c37690n0.addLong(abstractC37708x.H());
                if (abstractC37708x.g()) {
                    return;
                } else {
                    iF3 = abstractC37708x.F();
                }
            } while (iF3 == this.f363006b);
            this.f363008d = iF3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iF5 = abstractC37708x.f() + abstractC37708x.G();
        do {
            c37690n0.addLong(abstractC37708x.H());
        } while (abstractC37708x.f() < iF5);
        l(iF5);
    }

    @Override // com.google.protobuf.R0
    public final boolean skipField() {
        int i12;
        AbstractC37708x abstractC37708x = this.f363005a;
        if (abstractC37708x.g() || (i12 = this.f363006b) == this.f363007c) {
            return false;
        }
        return abstractC37708x.I(i12);
    }
}
