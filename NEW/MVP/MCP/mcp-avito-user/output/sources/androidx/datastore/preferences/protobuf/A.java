package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
final class A implements InterfaceC22891e1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC22940z f45586a;

    /* renamed from: b, reason: collision with root package name */
    public int f45587b;

    /* renamed from: c, reason: collision with root package name */
    public int f45588c;

    /* renamed from: d, reason: collision with root package name */
    public int f45589d = 0;

    /* compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45590a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45590a = iArr;
            try {
                iArr[WireFormat.FieldType.f45765k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45590a[WireFormat.FieldType.f45769o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45590a[WireFormat.FieldType.f45758d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45590a[WireFormat.FieldType.f45771q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45590a[WireFormat.FieldType.f45764j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45590a[WireFormat.FieldType.f45763i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45590a[WireFormat.FieldType.f45759e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45590a[WireFormat.FieldType.f45762h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45590a[WireFormat.FieldType.f45760f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45590a[WireFormat.FieldType.f45768n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45590a[WireFormat.FieldType.f45772r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45590a[WireFormat.FieldType.f45773s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45590a[WireFormat.FieldType.f45774t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45590a[WireFormat.FieldType.f45775u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45590a[WireFormat.FieldType.f45766l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45590a[WireFormat.FieldType.f45770p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45590a[WireFormat.FieldType.f45761g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public A(AbstractC22940z abstractC22940z) {
        C22914m0.a(abstractC22940z, "input");
        this.f45586a = abstractC22940z;
        abstractC22940z.f45951d = this;
    }

    public static void l(int i12) throws InvalidProtocolBufferException {
        if ((i12 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void m(int i12) throws InvalidProtocolBufferException {
        if ((i12 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final <T> T a(InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(2);
        return (T) h(interfaceC22897g1, t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final <T> void b(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX2;
        int i12 = this.f45587b;
        if ((i12 & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(h(interfaceC22897g1, t12));
            AbstractC22940z abstractC22940z = this.f45586a;
            if (abstractC22940z.e() || this.f45589d != 0) {
                return;
            } else {
                iX2 = abstractC22940z.x();
            }
        } while (iX2 == i12);
        this.f45589d = iX2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final <T> T c(InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(3);
        return (T) g(interfaceC22897g1, t12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void d(java.util.Map<K, V> r10, androidx.datastore.preferences.protobuf.C22939y0.b<K, V> r11, androidx.datastore.preferences.protobuf.T r12) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.k(r0)
            androidx.datastore.preferences.protobuf.z r1 = r9.f45586a
            int r2 = r1.y()
            int r2 = r1.h(r2)
            r11.getClass()
            java.lang.String r3 = ""
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r11.f45947c
            r5 = r4
        L16:
            int r6 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5c
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L26
            goto L5c
        L26:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L47
            if (r6 == r0) goto L3c
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            if (r6 == 0) goto L34
            goto L16
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            throw r6     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
        L3a:
            r10 = move-exception
            goto L63
        L3c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.f45946b     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            java.lang.Object r5 = r9.f(r6, r7, r12)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L47:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = r11.f45945a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            r7 = 0
            java.lang.Object r3 = r9.f(r6, r7, r7)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f
            goto L16
        L4f:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L56
            goto L16
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r10 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r10     // Catch: java.lang.Throwable -> L3a
        L5c:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L3a
            r1.g(r2)
            return
        L63:
            r1.g(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.A.d(java.util.Map, androidx.datastore.preferences.protobuf.y0$b, androidx.datastore.preferences.protobuf.T):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final <T> void e(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX2;
        int i12 = this.f45587b;
        if ((i12 & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(g(interfaceC22897g1, t12));
            AbstractC22940z abstractC22940z = this.f45586a;
            if (abstractC22940z.e() || this.f45589d != 0) {
                return;
            } else {
                iX2 = abstractC22940z.x();
            }
        } while (iX2 == i12);
        this.f45589d = iX2;
    }

    public final Object f(WireFormat.FieldType fieldType, Class<?> cls, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (a.f45590a[fieldType.ordinal()]) {
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
                k(2);
                return h(Z0.f45797c.a(cls), t12);
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
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T g(InterfaceC22897g1<T> interfaceC22897g1, T t12) {
        int i12 = this.f45588c;
        this.f45588c = ((this.f45587b >>> 3) << 3) | 4;
        try {
            T tNewInstance = interfaceC22897g1.newInstance();
            interfaceC22897g1.d(tNewInstance, this, t12);
            interfaceC22897g1.makeImmutable(tNewInstance);
            if (this.f45587b == this.f45588c) {
                return tNewInstance;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f45588c = i12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int getFieldNumber() {
        int i12 = this.f45589d;
        if (i12 != 0) {
            this.f45587b = i12;
            this.f45589d = 0;
        } else {
            this.f45587b = this.f45586a.x();
        }
        int i13 = this.f45587b;
        if (i13 == 0 || i13 == this.f45588c) {
            return Integer.MAX_VALUE;
        }
        return i13 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int getTag() {
        return this.f45587b;
    }

    public final <T> T h(InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException {
        AbstractC22940z abstractC22940z = this.f45586a;
        int iY2 = abstractC22940z.y();
        if (abstractC22940z.f45948a >= abstractC22940z.f45949b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iH2 = abstractC22940z.h(iY2);
        T tNewInstance = interfaceC22897g1.newInstance();
        abstractC22940z.f45948a++;
        interfaceC22897g1.d(tNewInstance, this, t12);
        interfaceC22897g1.makeImmutable(tNewInstance);
        abstractC22940z.a(0);
        abstractC22940z.f45948a--;
        abstractC22940z.g(iH2);
        return tNewInstance;
    }

    public final void i(List<String> list, boolean z12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX2;
        int iX3;
        if ((this.f45587b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z13 = list instanceof InterfaceC22927s0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z13 || z12) {
            do {
                list.add(z12 ? readStringRequireUtf8() : readString());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX2 = abstractC22940z.x();
                }
            } while (iX2 == this.f45587b);
            this.f45589d = iX2;
            return;
        }
        InterfaceC22927s0 interfaceC22927s0 = (InterfaceC22927s0) list;
        do {
            interfaceC22927s0.n4(readBytes());
            if (abstractC22940z.e()) {
                return;
            } else {
                iX3 = abstractC22940z.x();
            }
        } while (iX3 == this.f45587b);
        this.f45589d = iX3;
    }

    public final void j(int i12) throws InvalidProtocolBufferException {
        if (this.f45586a.d() != i12) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void k(int i12) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f45587b & 7) != i12) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22926s;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC22940z.i()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Boolean.valueOf(abstractC22940z.i()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22926s c22926s = (C22926s) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22926s.addBoolean(abstractC22940z.i());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22926s.addBoolean(abstractC22940z.i());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final AbstractC22934w readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(2);
        return this.f45586a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readBytesList(List<AbstractC22934w> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX2;
        if ((this.f45587b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(readBytes());
            AbstractC22940z abstractC22940z = this.f45586a;
            if (abstractC22940z.e()) {
                return;
            } else {
                iX2 = abstractC22940z.x();
            }
        } while (iX2 == this.f45587b);
        this.f45589d = iX2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(1);
        return this.f45586a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readDoubleList(List<Double> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 1) {
                do {
                    list.add(Double.valueOf(abstractC22940z.k()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iY2 = abstractC22940z.y();
            m(iY2);
            int iD2 = abstractC22940z.d() + iY2;
            do {
                list.add(Double.valueOf(abstractC22940z.k()));
            } while (abstractC22940z.d() < iD2);
            return;
        }
        C c12 = (C) list;
        int i13 = this.f45587b & 7;
        if (i13 == 1) {
            do {
                c12.addDouble(abstractC22940z.k());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iY3 = abstractC22940z.y();
        m(iY3);
        int iD3 = abstractC22940z.d() + iY3;
        do {
            c12.addDouble(abstractC22940z.k());
        } while (abstractC22940z.d() < iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readEnumList(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC22940z.l()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Integer.valueOf(abstractC22940z.l()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22911l0.addInt(abstractC22940z.l());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22911l0.addInt(abstractC22940z.l());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(5);
        return this.f45586a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 2) {
                int iY2 = abstractC22940z.y();
                l(iY2);
                int iD2 = abstractC22940z.d() + iY2;
                do {
                    list.add(Integer.valueOf(abstractC22940z.m()));
                } while (abstractC22940z.d() < iD2);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(abstractC22940z.m()));
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX2 = abstractC22940z.x();
                }
            } while (iX2 == this.f45587b);
            this.f45589d = iX2;
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 2) {
            int iY3 = abstractC22940z.y();
            l(iY3);
            int iD3 = abstractC22940z.d() + iY3;
            do {
                c22911l0.addInt(abstractC22940z.m());
            } while (abstractC22940z.d() < iD3);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c22911l0.addInt(abstractC22940z.m());
            if (abstractC22940z.e()) {
                return;
            } else {
                iX3 = abstractC22940z.x();
            }
        } while (iX3 == this.f45587b);
        this.f45589d = iX3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(1);
        return this.f45586a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22935w0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(abstractC22940z.n()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iY2 = abstractC22940z.y();
            m(iY2);
            int iD2 = abstractC22940z.d() + iY2;
            do {
                list.add(Long.valueOf(abstractC22940z.n()));
            } while (abstractC22940z.d() < iD2);
            return;
        }
        C22935w0 c22935w0 = (C22935w0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 1) {
            do {
                c22935w0.addLong(abstractC22940z.n());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iY3 = abstractC22940z.y();
        m(iY3);
        int iD3 = abstractC22940z.d() + iY3;
        do {
            c22935w0.addLong(abstractC22940z.n());
        } while (abstractC22940z.d() < iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(5);
        return this.f45586a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readFloatList(List<Float> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22887d0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 2) {
                int iY2 = abstractC22940z.y();
                l(iY2);
                int iD2 = abstractC22940z.d() + iY2;
                do {
                    list.add(Float.valueOf(abstractC22940z.o()));
                } while (abstractC22940z.d() < iD2);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(abstractC22940z.o()));
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX2 = abstractC22940z.x();
                }
            } while (iX2 == this.f45587b);
            this.f45589d = iX2;
            return;
        }
        C22887d0 c22887d0 = (C22887d0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 2) {
            int iY3 = abstractC22940z.y();
            l(iY3);
            int iD3 = abstractC22940z.d() + iY3;
            do {
                c22887d0.addFloat(abstractC22940z.o());
            } while (abstractC22940z.d() < iD3);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c22887d0.addFloat(abstractC22940z.o());
            if (abstractC22940z.e()) {
                return;
            } else {
                iX3 = abstractC22940z.x();
            }
        } while (iX3 == this.f45587b);
        this.f45589d = iX3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC22940z.p()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Integer.valueOf(abstractC22940z.p()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22911l0.addInt(abstractC22940z.p());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22911l0.addInt(abstractC22940z.p());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22935w0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC22940z.q()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Long.valueOf(abstractC22940z.q()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22935w0 c22935w0 = (C22935w0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22935w0.addLong(abstractC22940z.q());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22935w0.addLong(abstractC22940z.q());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(5);
        return this.f45586a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 2) {
                int iY2 = abstractC22940z.y();
                l(iY2);
                int iD2 = abstractC22940z.d() + iY2;
                do {
                    list.add(Integer.valueOf(abstractC22940z.r()));
                } while (abstractC22940z.d() < iD2);
                return;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(abstractC22940z.r()));
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX2 = abstractC22940z.x();
                }
            } while (iX2 == this.f45587b);
            this.f45589d = iX2;
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 2) {
            int iY3 = abstractC22940z.y();
            l(iY3);
            int iD3 = abstractC22940z.d() + iY3;
            do {
                c22911l0.addInt(abstractC22940z.r());
            } while (abstractC22940z.d() < iD3);
            return;
        }
        if (i13 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c22911l0.addInt(abstractC22940z.r());
            if (abstractC22940z.e()) {
                return;
            } else {
                iX3 = abstractC22940z.x();
            }
        } while (iX3 == this.f45587b);
        this.f45589d = iX3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(1);
        return this.f45586a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22935w0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(abstractC22940z.s()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iY2 = abstractC22940z.y();
            m(iY2);
            int iD2 = abstractC22940z.d() + iY2;
            do {
                list.add(Long.valueOf(abstractC22940z.s()));
            } while (abstractC22940z.d() < iD2);
            return;
        }
        C22935w0 c22935w0 = (C22935w0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 1) {
            do {
                c22935w0.addLong(abstractC22940z.s());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iY3 = abstractC22940z.y();
        m(iY3);
        int iD3 = abstractC22940z.d() + iY3;
        do {
            c22935w0.addLong(abstractC22940z.s());
        } while (abstractC22940z.d() < iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC22940z.t()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Integer.valueOf(abstractC22940z.t()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22911l0.addInt(abstractC22940z.t());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22911l0.addInt(abstractC22940z.t());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readSInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22935w0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC22940z.u()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Long.valueOf(abstractC22940z.u()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22935w0 c22935w0 = (C22935w0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22935w0.addLong(abstractC22940z.u());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22935w0.addLong(abstractC22940z.u());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(2);
        return this.f45586a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readStringList(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        i(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        i(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(2);
        return this.f45586a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22911l0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC22940z.y()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Integer.valueOf(abstractC22940z.y()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22911l0 c22911l0 = (C22911l0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22911l0.addInt(abstractC22940z.y());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22911l0.addInt(abstractC22940z.y());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(0);
        return this.f45586a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final void readUInt64List(List<Long> list) throws InvalidProtocolBufferException {
        int iX2;
        int iX3;
        boolean z12 = list instanceof C22935w0;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (!z12) {
            int i12 = this.f45587b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(abstractC22940z.z()));
                    if (abstractC22940z.e()) {
                        return;
                    } else {
                        iX2 = abstractC22940z.x();
                    }
                } while (iX2 == this.f45587b);
                this.f45589d = iX2;
                return;
            }
            if (i12 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD2 = abstractC22940z.d() + abstractC22940z.y();
            do {
                list.add(Long.valueOf(abstractC22940z.z()));
            } while (abstractC22940z.d() < iD2);
            j(iD2);
            return;
        }
        C22935w0 c22935w0 = (C22935w0) list;
        int i13 = this.f45587b & 7;
        if (i13 == 0) {
            do {
                c22935w0.addLong(abstractC22940z.z());
                if (abstractC22940z.e()) {
                    return;
                } else {
                    iX3 = abstractC22940z.x();
                }
            } while (iX3 == this.f45587b);
            this.f45589d = iX3;
            return;
        }
        if (i13 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD3 = abstractC22940z.d() + abstractC22940z.y();
        do {
            c22935w0.addLong(abstractC22940z.z());
        } while (abstractC22940z.d() < iD3);
        j(iD3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
    public final boolean skipField() {
        int i12;
        AbstractC22940z abstractC22940z = this.f45586a;
        if (abstractC22940z.e() || (i12 = this.f45587b) == this.f45588c) {
            return false;
        }
        return abstractC22940z.A(i12);
    }
}
