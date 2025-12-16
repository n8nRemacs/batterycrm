package com.yandex.metrica.impl.ob;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.qf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39078qf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public d[] f381495a;

    /* renamed from: b, reason: collision with root package name */
    public c f381496b;

    /* renamed from: c, reason: collision with root package name */
    public a[] f381497c;

    /* renamed from: d, reason: collision with root package name */
    public e[] f381498d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f381499e;

    /* renamed from: com.yandex.metrica.impl.ob.qf$a */
    public static final class a extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile a[] f381500c;

        /* renamed from: a, reason: collision with root package name */
        public String f381501a;

        /* renamed from: b, reason: collision with root package name */
        public String f381502b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f381500c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381500c == null) {
                            f381500c = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f381500c;
        }

        public a a() {
            this.f381501a = "";
            this.f381502b = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeStringSize(2, this.f381502b) + CodedOutputByteBufferNano.computeStringSize(1, this.f381501a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381501a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.f381502b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f381501a);
            codedOutputByteBufferNano.writeString(2, this.f381502b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$b */
    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public double f381503a;

        /* renamed from: b, reason: collision with root package name */
        public double f381504b;

        /* renamed from: c, reason: collision with root package name */
        public long f381505c;

        /* renamed from: d, reason: collision with root package name */
        public int f381506d;

        /* renamed from: e, reason: collision with root package name */
        public int f381507e;

        /* renamed from: f, reason: collision with root package name */
        public int f381508f;

        /* renamed from: g, reason: collision with root package name */
        public int f381509g;

        /* renamed from: h, reason: collision with root package name */
        public int f381510h;

        /* renamed from: i, reason: collision with root package name */
        public String f381511i;

        public b() {
            a();
        }

        public b a() {
            this.f381503a = 0.0d;
            this.f381504b = 0.0d;
            this.f381505c = 0L;
            this.f381506d = 0;
            this.f381507e = 0;
            this.f381508f = 0;
            this.f381509g = 0;
            this.f381510h = 0;
            this.f381511i = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f381504b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f381503a) + super.computeSerializedSize();
            long j12 = this.f381505c;
            if (j12 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j12);
            }
            int i12 = this.f381506d;
            if (i12 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i12);
            }
            int i13 = this.f381507e;
            if (i13 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i13);
            }
            int i14 = this.f381508f;
            if (i14 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i14);
            }
            int i15 = this.f381509g;
            if (i15 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i15);
            }
            int i16 = this.f381510h;
            if (i16 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i16);
            }
            return !this.f381511i.equals("") ? iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f381511i) : iComputeDoubleSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 9) {
                    this.f381503a = codedInputByteBufferNano.readDouble();
                } else if (tag == 17) {
                    this.f381504b = codedInputByteBufferNano.readDouble();
                } else if (tag == 24) {
                    this.f381505c = codedInputByteBufferNano.readUInt64();
                } else if (tag == 32) {
                    this.f381506d = codedInputByteBufferNano.readUInt32();
                } else if (tag == 40) {
                    this.f381507e = codedInputByteBufferNano.readUInt32();
                } else if (tag == 48) {
                    this.f381508f = codedInputByteBufferNano.readUInt32();
                } else if (tag == 56) {
                    this.f381509g = codedInputByteBufferNano.readInt32();
                } else if (tag == 64) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f381510h = int32;
                    }
                } else if (tag == 74) {
                    this.f381511i = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeDouble(1, this.f381503a);
            codedOutputByteBufferNano.writeDouble(2, this.f381504b);
            long j12 = this.f381505c;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j12);
            }
            int i12 = this.f381506d;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i12);
            }
            int i13 = this.f381507e;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i13);
            }
            int i14 = this.f381508f;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i14);
            }
            int i15 = this.f381509g;
            if (i15 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i15);
            }
            int i16 = this.f381510h;
            if (i16 != 0) {
                codedOutputByteBufferNano.writeInt32(8, i16);
            }
            if (!this.f381511i.equals("")) {
                codedOutputByteBufferNano.writeString(9, this.f381511i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$c */
    public static final class c extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public String f381512a;

        /* renamed from: b, reason: collision with root package name */
        public String f381513b;

        /* renamed from: c, reason: collision with root package name */
        public String f381514c;

        /* renamed from: d, reason: collision with root package name */
        public int f381515d;

        /* renamed from: e, reason: collision with root package name */
        public String f381516e;

        /* renamed from: f, reason: collision with root package name */
        public String f381517f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f381518g;

        /* renamed from: h, reason: collision with root package name */
        public int f381519h;

        /* renamed from: i, reason: collision with root package name */
        public String f381520i;

        /* renamed from: j, reason: collision with root package name */
        public String f381521j;

        /* renamed from: k, reason: collision with root package name */
        public int f381522k;

        /* renamed from: l, reason: collision with root package name */
        public a[] f381523l;

        /* renamed from: m, reason: collision with root package name */
        public String f381524m;

        /* renamed from: com.yandex.metrica.impl.ob.qf$c$a */
        public static final class a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile a[] f381525c;

            /* renamed from: a, reason: collision with root package name */
            public String f381526a;

            /* renamed from: b, reason: collision with root package name */
            public long f381527b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f381525c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f381525c == null) {
                                f381525c = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f381525c;
            }

            public a a() {
                this.f381526a = "";
                this.f381527b = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                return CodedOutputByteBufferNano.computeUInt64Size(2, this.f381527b) + CodedOutputByteBufferNano.computeStringSize(1, this.f381526a) + super.computeSerializedSize();
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f381526a = codedInputByteBufferNano.readString();
                    } else if (tag == 16) {
                        this.f381527b = codedInputByteBufferNano.readUInt64();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                codedOutputByteBufferNano.writeString(1, this.f381526a);
                codedOutputByteBufferNano.writeUInt64(2, this.f381527b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public c() {
            a();
        }

        public c a() {
            this.f381512a = "";
            this.f381513b = "";
            this.f381514c = "";
            this.f381515d = 0;
            this.f381516e = "";
            this.f381517f = "";
            this.f381518g = false;
            this.f381519h = 0;
            this.f381520i = "";
            this.f381521j = "";
            this.f381522k = 0;
            this.f381523l = a.b();
            this.f381524m = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f381512a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f381512a);
            }
            if (!this.f381513b.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f381513b);
            }
            if (!this.f381514c.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f381514c);
            }
            int i12 = this.f381515d;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i12);
            }
            if (!this.f381516e.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f381516e);
            }
            if (!this.f381517f.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f381517f);
            }
            boolean z12 = this.f381518g;
            if (z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z12);
            }
            int i13 = this.f381519h;
            if (i13 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i13);
            }
            if (!this.f381520i.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f381520i);
            }
            if (!this.f381521j.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f381521j);
            }
            int i14 = this.f381522k;
            if (i14 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i14);
            }
            a[] aVarArr = this.f381523l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i15 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381523l;
                    if (i15 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i15];
                    if (aVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, aVar) + iComputeSerializedSize;
                    }
                    i15++;
                }
            }
            return !this.f381524m.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f381524m) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 10:
                        this.f381512a = codedInputByteBufferNano.readString();
                        break;
                    case 18:
                        this.f381513b = codedInputByteBufferNano.readString();
                        break;
                    case 34:
                        this.f381514c = codedInputByteBufferNano.readString();
                        break;
                    case 40:
                        this.f381515d = codedInputByteBufferNano.readUInt32();
                        break;
                    case 82:
                        this.f381516e = codedInputByteBufferNano.readString();
                        break;
                    case 122:
                        this.f381517f = codedInputByteBufferNano.readString();
                        break;
                    case 136:
                        this.f381518g = codedInputByteBufferNano.readBool();
                        break;
                    case 144:
                        this.f381519h = codedInputByteBufferNano.readUInt32();
                        break;
                    case 154:
                        this.f381520i = codedInputByteBufferNano.readString();
                        break;
                    case 170:
                        this.f381521j = codedInputByteBufferNano.readString();
                        break;
                    case 176:
                        this.f381522k = codedInputByteBufferNano.readUInt32();
                        break;
                    case 186:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                        a[] aVarArr = this.f381523l;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i12 = repeatedFieldArrayLength + length;
                        a[] aVarArr2 = new a[i12];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i12 - 1) {
                            a aVar = new a();
                            aVarArr2[length] = aVar;
                            codedInputByteBufferNano.readMessage(aVar);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length] = aVar2;
                        codedInputByteBufferNano.readMessage(aVar2);
                        this.f381523l = aVarArr2;
                        break;
                    case 194:
                        this.f381524m = codedInputByteBufferNano.readString();
                        break;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f381512a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f381512a);
            }
            if (!this.f381513b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f381513b);
            }
            if (!this.f381514c.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.f381514c);
            }
            int i12 = this.f381515d;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i12);
            }
            if (!this.f381516e.equals("")) {
                codedOutputByteBufferNano.writeString(10, this.f381516e);
            }
            if (!this.f381517f.equals("")) {
                codedOutputByteBufferNano.writeString(15, this.f381517f);
            }
            boolean z12 = this.f381518g;
            if (z12) {
                codedOutputByteBufferNano.writeBool(17, z12);
            }
            int i13 = this.f381519h;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(18, i13);
            }
            if (!this.f381520i.equals("")) {
                codedOutputByteBufferNano.writeString(19, this.f381520i);
            }
            if (!this.f381521j.equals("")) {
                codedOutputByteBufferNano.writeString(21, this.f381521j);
            }
            int i14 = this.f381522k;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeUInt32(22, i14);
            }
            a[] aVarArr = this.f381523l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i15 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381523l;
                    if (i15 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i15];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(23, aVar);
                    }
                    i15++;
                }
            }
            if (!this.f381524m.equals("")) {
                codedOutputByteBufferNano.writeString(24, this.f381524m);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$d */
    public static final class d extends MessageNano {

        /* renamed from: d, reason: collision with root package name */
        private static volatile d[] f381528d;

        /* renamed from: a, reason: collision with root package name */
        public long f381529a;

        /* renamed from: b, reason: collision with root package name */
        public b f381530b;

        /* renamed from: c, reason: collision with root package name */
        public a[] f381531c;

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$a */
        public static final class a extends MessageNano {

            /* renamed from: y, reason: collision with root package name */
            private static volatile a[] f381532y;

            /* renamed from: a, reason: collision with root package name */
            public long f381533a;

            /* renamed from: b, reason: collision with root package name */
            public long f381534b;

            /* renamed from: c, reason: collision with root package name */
            public int f381535c;

            /* renamed from: d, reason: collision with root package name */
            public String f381536d;

            /* renamed from: e, reason: collision with root package name */
            public byte[] f381537e;

            /* renamed from: f, reason: collision with root package name */
            public b f381538f;

            /* renamed from: g, reason: collision with root package name */
            public c f381539g;

            /* renamed from: h, reason: collision with root package name */
            public String f381540h;

            /* renamed from: i, reason: collision with root package name */
            public C10961a f381541i;

            /* renamed from: j, reason: collision with root package name */
            public int f381542j;

            /* renamed from: k, reason: collision with root package name */
            public int f381543k;

            /* renamed from: l, reason: collision with root package name */
            public int f381544l;

            /* renamed from: m, reason: collision with root package name */
            public byte[] f381545m;

            /* renamed from: n, reason: collision with root package name */
            public int f381546n;

            /* renamed from: o, reason: collision with root package name */
            public long f381547o;

            /* renamed from: p, reason: collision with root package name */
            public long f381548p;

            /* renamed from: q, reason: collision with root package name */
            public int f381549q;

            /* renamed from: r, reason: collision with root package name */
            public int f381550r;

            /* renamed from: s, reason: collision with root package name */
            public int f381551s;

            /* renamed from: t, reason: collision with root package name */
            public int f381552t;

            /* renamed from: u, reason: collision with root package name */
            public int f381553u;

            /* renamed from: v, reason: collision with root package name */
            public boolean f381554v;

            /* renamed from: w, reason: collision with root package name */
            public long f381555w;

            /* renamed from: x, reason: collision with root package name */
            public b[] f381556x;

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$a, reason: collision with other inner class name */
            public static final class C10961a extends MessageNano {

                /* renamed from: a, reason: collision with root package name */
                public String f381557a;

                /* renamed from: b, reason: collision with root package name */
                public String f381558b;

                /* renamed from: c, reason: collision with root package name */
                public String f381559c;

                public C10961a() {
                    a();
                }

                public C10961a a() {
                    this.f381557a = "";
                    this.f381558b = "";
                    this.f381559c = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public int computeSerializedSize() {
                    int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f381557a) + super.computeSerializedSize();
                    if (!this.f381558b.equals("")) {
                        iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f381558b);
                    }
                    return !this.f381559c.equals("") ? iComputeStringSize + CodedOutputByteBufferNano.computeStringSize(3, this.f381559c) : iComputeStringSize;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                    while (true) {
                        int tag = codedInputByteBufferNano.readTag();
                        if (tag == 0) {
                            break;
                        }
                        if (tag == 10) {
                            this.f381557a = codedInputByteBufferNano.readString();
                        } else if (tag == 18) {
                            this.f381558b = codedInputByteBufferNano.readString();
                        } else if (tag == 26) {
                            this.f381559c = codedInputByteBufferNano.readString();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                    codedOutputByteBufferNano.writeString(1, this.f381557a);
                    if (!this.f381558b.equals("")) {
                        codedOutputByteBufferNano.writeString(2, this.f381558b);
                    }
                    if (!this.f381559c.equals("")) {
                        codedOutputByteBufferNano.writeString(3, this.f381559c);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$b */
            public static final class b extends MessageNano {

                /* renamed from: c, reason: collision with root package name */
                private static volatile b[] f381560c;

                /* renamed from: a, reason: collision with root package name */
                public byte[] f381561a;

                /* renamed from: b, reason: collision with root package name */
                public byte[] f381562b;

                public b() {
                    a();
                }

                public static b[] b() {
                    if (f381560c == null) {
                        synchronized (InternalNano.LAZY_INIT_LOCK) {
                            try {
                                if (f381560c == null) {
                                    f381560c = new b[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return f381560c;
                }

                public b a() {
                    byte[] bArr = WireFormatNano.EMPTY_BYTES;
                    this.f381561a = bArr;
                    this.f381562b = bArr;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public int computeSerializedSize() {
                    int iComputeSerializedSize = super.computeSerializedSize();
                    byte[] bArr = this.f381561a;
                    byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                    if (!Arrays.equals(bArr, bArr2)) {
                        iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381561a);
                    }
                    return !Arrays.equals(this.f381562b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f381562b) : iComputeSerializedSize;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                    while (true) {
                        int tag = codedInputByteBufferNano.readTag();
                        if (tag == 0) {
                            break;
                        }
                        if (tag == 10) {
                            this.f381561a = codedInputByteBufferNano.readBytes();
                        } else if (tag == 18) {
                            this.f381562b = codedInputByteBufferNano.readBytes();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                    byte[] bArr = this.f381561a;
                    byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                    if (!Arrays.equals(bArr, bArr2)) {
                        codedOutputByteBufferNano.writeBytes(1, this.f381561a);
                    }
                    if (!Arrays.equals(this.f381562b, bArr2)) {
                        codedOutputByteBufferNano.writeBytes(2, this.f381562b);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$c */
            public static final class c extends MessageNano {

                /* renamed from: a, reason: collision with root package name */
                public C39029of[] f381563a;

                /* renamed from: b, reason: collision with root package name */
                public C39101rf[] f381564b;

                /* renamed from: c, reason: collision with root package name */
                public int f381565c;

                /* renamed from: d, reason: collision with root package name */
                public String f381566d;

                public c() {
                    a();
                }

                public c a() {
                    this.f381563a = C39029of.b();
                    this.f381564b = C39101rf.b();
                    this.f381565c = 2;
                    this.f381566d = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public int computeSerializedSize() {
                    int iComputeSerializedSize = super.computeSerializedSize();
                    C39029of[] c39029ofArr = this.f381563a;
                    int i12 = 0;
                    if (c39029ofArr != null && c39029ofArr.length > 0) {
                        int i13 = 0;
                        while (true) {
                            C39029of[] c39029ofArr2 = this.f381563a;
                            if (i13 >= c39029ofArr2.length) {
                                break;
                            }
                            C39029of c39029of = c39029ofArr2[i13];
                            if (c39029of != null) {
                                iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c39029of) + iComputeSerializedSize;
                            }
                            i13++;
                        }
                    }
                    C39101rf[] c39101rfArr = this.f381564b;
                    if (c39101rfArr != null && c39101rfArr.length > 0) {
                        while (true) {
                            C39101rf[] c39101rfArr2 = this.f381564b;
                            if (i12 >= c39101rfArr2.length) {
                                break;
                            }
                            C39101rf c39101rf = c39101rfArr2[i12];
                            if (c39101rf != null) {
                                iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c39101rf) + iComputeSerializedSize;
                            }
                            i12++;
                        }
                    }
                    int i14 = this.f381565c;
                    if (i14 != 2) {
                        iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i14);
                    }
                    return !this.f381566d.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f381566d) : iComputeSerializedSize;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                    while (true) {
                        int tag = codedInputByteBufferNano.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                                C39029of[] c39029ofArr = this.f381563a;
                                int length = c39029ofArr == null ? 0 : c39029ofArr.length;
                                int i12 = repeatedFieldArrayLength + length;
                                C39029of[] c39029ofArr2 = new C39029of[i12];
                                if (length != 0) {
                                    System.arraycopy(c39029ofArr, 0, c39029ofArr2, 0, length);
                                }
                                while (length < i12 - 1) {
                                    C39029of c39029of = new C39029of();
                                    c39029ofArr2[length] = c39029of;
                                    codedInputByteBufferNano.readMessage(c39029of);
                                    codedInputByteBufferNano.readTag();
                                    length++;
                                }
                                C39029of c39029of2 = new C39029of();
                                c39029ofArr2[length] = c39029of2;
                                codedInputByteBufferNano.readMessage(c39029of2);
                                this.f381563a = c39029ofArr2;
                            } else if (tag == 18) {
                                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                                C39101rf[] c39101rfArr = this.f381564b;
                                int length2 = c39101rfArr == null ? 0 : c39101rfArr.length;
                                int i13 = repeatedFieldArrayLength2 + length2;
                                C39101rf[] c39101rfArr2 = new C39101rf[i13];
                                if (length2 != 0) {
                                    System.arraycopy(c39101rfArr, 0, c39101rfArr2, 0, length2);
                                }
                                while (length2 < i13 - 1) {
                                    C39101rf c39101rf = new C39101rf();
                                    c39101rfArr2[length2] = c39101rf;
                                    codedInputByteBufferNano.readMessage(c39101rf);
                                    codedInputByteBufferNano.readTag();
                                    length2++;
                                }
                                C39101rf c39101rf2 = new C39101rf();
                                c39101rfArr2[length2] = c39101rf2;
                                codedInputByteBufferNano.readMessage(c39101rf2);
                                this.f381564b = c39101rfArr2;
                            } else if (tag == 24) {
                                int int32 = codedInputByteBufferNano.readInt32();
                                switch (int32) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f381565c = int32;
                                        break;
                                }
                            } else if (tag == 34) {
                                this.f381566d = codedInputByteBufferNano.readString();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            }
                        }
                    }
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                    C39029of[] c39029ofArr = this.f381563a;
                    int i12 = 0;
                    if (c39029ofArr != null && c39029ofArr.length > 0) {
                        int i13 = 0;
                        while (true) {
                            C39029of[] c39029ofArr2 = this.f381563a;
                            if (i13 >= c39029ofArr2.length) {
                                break;
                            }
                            C39029of c39029of = c39029ofArr2[i13];
                            if (c39029of != null) {
                                codedOutputByteBufferNano.writeMessage(1, c39029of);
                            }
                            i13++;
                        }
                    }
                    C39101rf[] c39101rfArr = this.f381564b;
                    if (c39101rfArr != null && c39101rfArr.length > 0) {
                        while (true) {
                            C39101rf[] c39101rfArr2 = this.f381564b;
                            if (i12 >= c39101rfArr2.length) {
                                break;
                            }
                            C39101rf c39101rf = c39101rfArr2[i12];
                            if (c39101rf != null) {
                                codedOutputByteBufferNano.writeMessage(2, c39101rf);
                            }
                            i12++;
                        }
                    }
                    int i14 = this.f381565c;
                    if (i14 != 2) {
                        codedOutputByteBufferNano.writeInt32(3, i14);
                    }
                    if (!this.f381566d.equals("")) {
                        codedOutputByteBufferNano.writeString(4, this.f381566d);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public a() {
                a();
            }

            public static a[] b() {
                if (f381532y == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f381532y == null) {
                                f381532y = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f381532y;
            }

            public a a() {
                this.f381533a = 0L;
                this.f381534b = 0L;
                this.f381535c = 0;
                this.f381536d = "";
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f381537e = bArr;
                this.f381538f = null;
                this.f381539g = null;
                this.f381540h = "";
                this.f381541i = null;
                this.f381542j = 0;
                this.f381543k = 0;
                this.f381544l = -1;
                this.f381545m = bArr;
                this.f381546n = -1;
                this.f381547o = 0L;
                this.f381548p = 0L;
                this.f381549q = 0;
                this.f381550r = 0;
                this.f381551s = -1;
                this.f381552t = 0;
                this.f381553u = 0;
                this.f381554v = false;
                this.f381555w = 1L;
                this.f381556x = b.b();
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f381535c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f381534b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f381533a) + super.computeSerializedSize();
                if (!this.f381536d.equals("")) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f381536d);
                }
                byte[] bArr = this.f381537e;
                byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                if (!Arrays.equals(bArr, bArr2)) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f381537e);
                }
                b bVar = this.f381538f;
                if (bVar != null) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, bVar);
                }
                c cVar = this.f381539g;
                if (cVar != null) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, cVar);
                }
                if (!this.f381540h.equals("")) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f381540h);
                }
                C10961a c10961a = this.f381541i;
                if (c10961a != null) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(9, c10961a);
                }
                int i12 = this.f381542j;
                if (i12 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i12);
                }
                int i13 = this.f381543k;
                if (i13 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i13);
                }
                int i14 = this.f381544l;
                if (i14 != -1) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i14);
                }
                if (!Arrays.equals(this.f381545m, bArr2)) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f381545m);
                }
                int i15 = this.f381546n;
                if (i15 != -1) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i15);
                }
                long j12 = this.f381547o;
                if (j12 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j12);
                }
                long j13 = this.f381548p;
                if (j13 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j13);
                }
                int i16 = this.f381549q;
                if (i16 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(18, i16);
                }
                int i17 = this.f381550r;
                if (i17 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(19, i17);
                }
                int i18 = this.f381551s;
                if (i18 != -1) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(20, i18);
                }
                int i19 = this.f381552t;
                if (i19 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(21, i19);
                }
                int i22 = this.f381553u;
                if (i22 != 0) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i22);
                }
                boolean z12 = this.f381554v;
                if (z12) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z12);
                }
                long j14 = this.f381555w;
                if (j14 != 1) {
                    iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j14);
                }
                b[] bVarArr = this.f381556x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i23 = 0;
                    while (true) {
                        b[] bVarArr2 = this.f381556x;
                        if (i23 >= bVarArr2.length) {
                            break;
                        }
                        b bVar2 = bVarArr2[i23];
                        if (bVar2 != null) {
                            iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, bVar2) + iComputeUInt32Size;
                        }
                        i23++;
                    }
                }
                return iComputeUInt32Size;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    switch (tag) {
                        case 0:
                            break;
                        case 8:
                            this.f381533a = codedInputByteBufferNano.readUInt64();
                            break;
                        case 16:
                            this.f381534b = codedInputByteBufferNano.readUInt64();
                            break;
                        case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                            this.f381535c = codedInputByteBufferNano.readUInt32();
                            break;
                        case 34:
                            this.f381536d = codedInputByteBufferNano.readString();
                            break;
                        case 42:
                            this.f381537e = codedInputByteBufferNano.readBytes();
                            break;
                        case 50:
                            if (this.f381538f == null) {
                                this.f381538f = new b();
                            }
                            codedInputByteBufferNano.readMessage(this.f381538f);
                            break;
                        case 58:
                            if (this.f381539g == null) {
                                this.f381539g = new c();
                            }
                            codedInputByteBufferNano.readMessage(this.f381539g);
                            break;
                        case 66:
                            this.f381540h = codedInputByteBufferNano.readString();
                            break;
                        case 74:
                            if (this.f381541i == null) {
                                this.f381541i = new C10961a();
                            }
                            codedInputByteBufferNano.readMessage(this.f381541i);
                            break;
                        case 80:
                            this.f381542j = codedInputByteBufferNano.readUInt32();
                            break;
                        case 96:
                            int int32 = codedInputByteBufferNano.readInt32();
                            if (int32 != 0 && int32 != 1 && int32 != 2) {
                                break;
                            } else {
                                this.f381543k = int32;
                                break;
                            }
                            break;
                        case 104:
                            int int322 = codedInputByteBufferNano.readInt32();
                            if (int322 != -1 && int322 != 0 && int322 != 1) {
                                break;
                            } else {
                                this.f381544l = int322;
                                break;
                            }
                            break;
                        case 114:
                            this.f381545m = codedInputByteBufferNano.readBytes();
                            break;
                        case 120:
                            int int323 = codedInputByteBufferNano.readInt32();
                            if (int323 != -1 && int323 != 0 && int323 != 1) {
                                break;
                            } else {
                                this.f381546n = int323;
                                break;
                            }
                        case 128:
                            this.f381547o = codedInputByteBufferNano.readUInt64();
                            break;
                        case 136:
                            this.f381548p = codedInputByteBufferNano.readUInt64();
                            break;
                        case 144:
                            int int324 = codedInputByteBufferNano.readInt32();
                            if (int324 != 0 && int324 != 1 && int324 != 2 && int324 != 3 && int324 != 4) {
                                break;
                            } else {
                                this.f381549q = int324;
                                break;
                            }
                        case 152:
                            int int325 = codedInputByteBufferNano.readInt32();
                            if (int325 != 0 && int325 != 1 && int325 != 2 && int325 != 3) {
                                break;
                            } else {
                                this.f381550r = int325;
                                break;
                            }
                            break;
                        case 160:
                            int int326 = codedInputByteBufferNano.readInt32();
                            if (int326 != -1 && int326 != 0 && int326 != 1) {
                                break;
                            } else {
                                this.f381551s = int326;
                                break;
                            }
                            break;
                        case 168:
                            int int327 = codedInputByteBufferNano.readInt32();
                            if (int327 != 0 && int327 != 1 && int327 != 2 && int327 != 3) {
                                break;
                            } else {
                                this.f381552t = int327;
                                break;
                            }
                            break;
                        case 176:
                            int int328 = codedInputByteBufferNano.readInt32();
                            if (int328 != 0 && int328 != 1) {
                                break;
                            } else {
                                this.f381553u = int328;
                                break;
                            }
                            break;
                        case 184:
                            this.f381554v = codedInputByteBufferNano.readBool();
                            break;
                        case 192:
                            this.f381555w = codedInputByteBufferNano.readUInt64();
                            break;
                        case 202:
                            int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                            b[] bVarArr = this.f381556x;
                            int length = bVarArr == null ? 0 : bVarArr.length;
                            int i12 = repeatedFieldArrayLength + length;
                            b[] bVarArr2 = new b[i12];
                            if (length != 0) {
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                            }
                            while (length < i12 - 1) {
                                b bVar = new b();
                                bVarArr2[length] = bVar;
                                codedInputByteBufferNano.readMessage(bVar);
                                codedInputByteBufferNano.readTag();
                                length++;
                            }
                            b bVar2 = new b();
                            bVarArr2[length] = bVar2;
                            codedInputByteBufferNano.readMessage(bVar2);
                            this.f381556x = bVarArr2;
                            break;
                        default:
                            if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                codedOutputByteBufferNano.writeUInt64(1, this.f381533a);
                codedOutputByteBufferNano.writeUInt64(2, this.f381534b);
                codedOutputByteBufferNano.writeUInt32(3, this.f381535c);
                if (!this.f381536d.equals("")) {
                    codedOutputByteBufferNano.writeString(4, this.f381536d);
                }
                byte[] bArr = this.f381537e;
                byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                if (!Arrays.equals(bArr, bArr2)) {
                    codedOutputByteBufferNano.writeBytes(5, this.f381537e);
                }
                b bVar = this.f381538f;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(6, bVar);
                }
                c cVar = this.f381539g;
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, cVar);
                }
                if (!this.f381540h.equals("")) {
                    codedOutputByteBufferNano.writeString(8, this.f381540h);
                }
                C10961a c10961a = this.f381541i;
                if (c10961a != null) {
                    codedOutputByteBufferNano.writeMessage(9, c10961a);
                }
                int i12 = this.f381542j;
                if (i12 != 0) {
                    codedOutputByteBufferNano.writeUInt32(10, i12);
                }
                int i13 = this.f381543k;
                if (i13 != 0) {
                    codedOutputByteBufferNano.writeInt32(12, i13);
                }
                int i14 = this.f381544l;
                if (i14 != -1) {
                    codedOutputByteBufferNano.writeInt32(13, i14);
                }
                if (!Arrays.equals(this.f381545m, bArr2)) {
                    codedOutputByteBufferNano.writeBytes(14, this.f381545m);
                }
                int i15 = this.f381546n;
                if (i15 != -1) {
                    codedOutputByteBufferNano.writeInt32(15, i15);
                }
                long j12 = this.f381547o;
                if (j12 != 0) {
                    codedOutputByteBufferNano.writeUInt64(16, j12);
                }
                long j13 = this.f381548p;
                if (j13 != 0) {
                    codedOutputByteBufferNano.writeUInt64(17, j13);
                }
                int i16 = this.f381549q;
                if (i16 != 0) {
                    codedOutputByteBufferNano.writeInt32(18, i16);
                }
                int i17 = this.f381550r;
                if (i17 != 0) {
                    codedOutputByteBufferNano.writeInt32(19, i17);
                }
                int i18 = this.f381551s;
                if (i18 != -1) {
                    codedOutputByteBufferNano.writeInt32(20, i18);
                }
                int i19 = this.f381552t;
                if (i19 != 0) {
                    codedOutputByteBufferNano.writeInt32(21, i19);
                }
                int i22 = this.f381553u;
                if (i22 != 0) {
                    codedOutputByteBufferNano.writeInt32(22, i22);
                }
                boolean z12 = this.f381554v;
                if (z12) {
                    codedOutputByteBufferNano.writeBool(23, z12);
                }
                long j14 = this.f381555w;
                if (j14 != 1) {
                    codedOutputByteBufferNano.writeUInt64(24, j14);
                }
                b[] bVarArr = this.f381556x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i23 = 0;
                    while (true) {
                        b[] bVarArr2 = this.f381556x;
                        if (i23 >= bVarArr2.length) {
                            break;
                        }
                        b bVar2 = bVarArr2[i23];
                        if (bVar2 != null) {
                            codedOutputByteBufferNano.writeMessage(25, bVar2);
                        }
                        i23++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$b */
        public static final class b extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public f f381567a;

            /* renamed from: b, reason: collision with root package name */
            public String f381568b;

            /* renamed from: c, reason: collision with root package name */
            public int f381569c;

            public b() {
                a();
            }

            public b a() {
                this.f381567a = null;
                this.f381568b = "";
                this.f381569c = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                f fVar = this.f381567a;
                if (fVar != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, fVar);
                }
                int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f381568b) + iComputeSerializedSize;
                int i12 = this.f381569c;
                return i12 != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i12) : iComputeStringSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        if (this.f381567a == null) {
                            this.f381567a = new f();
                        }
                        codedInputByteBufferNano.readMessage(this.f381567a);
                    } else if (tag == 18) {
                        this.f381568b = codedInputByteBufferNano.readString();
                    } else if (tag == 40) {
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2) {
                            this.f381569c = int32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                f fVar = this.f381567a;
                if (fVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, fVar);
                }
                codedOutputByteBufferNano.writeString(2, this.f381568b);
                int i12 = this.f381569c;
                if (i12 != 0) {
                    codedOutputByteBufferNano.writeInt32(5, i12);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public d() {
            a();
        }

        public static d[] b() {
            if (f381528d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381528d == null) {
                            f381528d = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return f381528d;
        }

        public d a() {
            this.f381529a = 0L;
            this.f381530b = null;
            this.f381531c = a.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f381529a) + super.computeSerializedSize();
            b bVar = this.f381530b;
            if (bVar != null) {
                iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
            }
            a[] aVarArr = this.f381531c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381531c;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i12];
                    if (aVar != null) {
                        iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, aVar) + iComputeUInt64Size;
                    }
                    i12++;
                }
            }
            return iComputeUInt64Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381529a = codedInputByteBufferNano.readUInt64();
                } else if (tag == 18) {
                    if (this.f381530b == null) {
                        this.f381530b = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f381530b);
                } else if (tag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    a[] aVarArr = this.f381531c;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    a[] aVarArr2 = new a[i12];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        codedInputByteBufferNano.readMessage(aVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    codedInputByteBufferNano.readMessage(aVar2);
                    this.f381531c = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeUInt64(1, this.f381529a);
            b bVar = this.f381530b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            a[] aVarArr = this.f381531c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381531c;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i12];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$e */
    public static final class e extends MessageNano {

        /* renamed from: e, reason: collision with root package name */
        private static volatile e[] f381570e;

        /* renamed from: a, reason: collision with root package name */
        public int f381571a;

        /* renamed from: b, reason: collision with root package name */
        public int f381572b;

        /* renamed from: c, reason: collision with root package name */
        public String f381573c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f381574d;

        public e() {
            a();
        }

        public static e[] b() {
            if (f381570e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381570e == null) {
                            f381570e = new e[0];
                        }
                    } finally {
                    }
                }
            }
            return f381570e;
        }

        public e a() {
            this.f381571a = 0;
            this.f381572b = 0;
            this.f381573c = "";
            this.f381574d = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i12 = this.f381571a;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i12);
            }
            int i13 = this.f381572b;
            if (i13 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i13);
            }
            if (!this.f381573c.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f381573c);
            }
            boolean z12 = this.f381574d;
            return z12 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381571a = codedInputByteBufferNano.readUInt32();
                } else if (tag == 16) {
                    this.f381572b = codedInputByteBufferNano.readUInt32();
                } else if (tag == 26) {
                    this.f381573c = codedInputByteBufferNano.readString();
                } else if (tag == 32) {
                    this.f381574d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            int i12 = this.f381571a;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i12);
            }
            int i13 = this.f381572b;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i13);
            }
            if (!this.f381573c.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.f381573c);
            }
            boolean z12 = this.f381574d;
            if (z12) {
                codedOutputByteBufferNano.writeBool(4, z12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$f */
    public static final class f extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f381575a;

        /* renamed from: b, reason: collision with root package name */
        public int f381576b;

        /* renamed from: c, reason: collision with root package name */
        public long f381577c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f381578d;

        public f() {
            a();
        }

        public f a() {
            this.f381575a = 0L;
            this.f381576b = 0;
            this.f381577c = 0L;
            this.f381578d = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f381576b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f381575a) + super.computeSerializedSize();
            long j12 = this.f381577c;
            if (j12 != 0) {
                iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j12);
            }
            boolean z12 = this.f381578d;
            return z12 ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z12) : iComputeSInt32Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381575a = codedInputByteBufferNano.readUInt64();
                } else if (tag == 16) {
                    this.f381576b = codedInputByteBufferNano.readSInt32();
                } else if (tag == 24) {
                    this.f381577c = codedInputByteBufferNano.readInt64();
                } else if (tag == 32) {
                    this.f381578d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeUInt64(1, this.f381575a);
            codedOutputByteBufferNano.writeSInt32(2, this.f381576b);
            long j12 = this.f381577c;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeInt64(3, j12);
            }
            boolean z12 = this.f381578d;
            if (z12) {
                codedOutputByteBufferNano.writeBool(4, z12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39078qf() {
        a();
    }

    public C39078qf a() {
        this.f381495a = d.b();
        this.f381496b = null;
        this.f381497c = a.b();
        this.f381498d = e.b();
        this.f381499e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        d[] dVarArr = this.f381495a;
        int i12 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                d[] dVarArr2 = this.f381495a;
                if (i13 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i13];
                if (dVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, dVar) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        c cVar = this.f381496b;
        if (cVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, cVar);
        }
        a[] aVarArr = this.f381497c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                a[] aVarArr2 = this.f381497c;
                if (i14 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i14];
                if (aVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, aVar) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        e[] eVarArr = this.f381498d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                e[] eVarArr2 = this.f381498d;
                if (i15 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i15];
                if (eVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, eVar) + iComputeSerializedSize;
                }
                i15++;
            }
        }
        String[] strArr = this.f381499e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i16 = 0;
        while (true) {
            String[] strArr2 = this.f381499e;
            if (i12 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i16;
            }
            String str = strArr2[i12];
            if (str != null) {
                i16++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i12++;
        }
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                d[] dVarArr = this.f381495a;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i12 = repeatedFieldArrayLength + length;
                d[] dVarArr2 = new d[i12];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i12 - 1) {
                    d dVar = new d();
                    dVarArr2[length] = dVar;
                    codedInputByteBufferNano.readMessage(dVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                d dVar2 = new d();
                dVarArr2[length] = dVar2;
                codedInputByteBufferNano.readMessage(dVar2);
                this.f381495a = dVarArr2;
            } else if (tag == 34) {
                if (this.f381496b == null) {
                    this.f381496b = new c();
                }
                codedInputByteBufferNano.readMessage(this.f381496b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                a[] aVarArr = this.f381497c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i13 = repeatedFieldArrayLength2 + length2;
                a[] aVarArr2 = new a[i13];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i13 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    codedInputByteBufferNano.readMessage(aVar);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                codedInputByteBufferNano.readMessage(aVar2);
                this.f381497c = aVarArr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                e[] eVarArr = this.f381498d;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i14 = repeatedFieldArrayLength3 + length3;
                e[] eVarArr2 = new e[i14];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i14 - 1) {
                    e eVar = new e();
                    eVarArr2[length3] = eVar;
                    codedInputByteBufferNano.readMessage(eVar);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                e eVar2 = new e();
                eVarArr2[length3] = eVar2;
                codedInputByteBufferNano.readMessage(eVar2);
                this.f381498d = eVarArr2;
            } else if (tag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f381499e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i15 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i15];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i15 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f381499e = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        d[] dVarArr = this.f381495a;
        int i12 = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                d[] dVarArr2 = this.f381495a;
                if (i13 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i13];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, dVar);
                }
                i13++;
            }
        }
        c cVar = this.f381496b;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(4, cVar);
        }
        a[] aVarArr = this.f381497c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i14 = 0;
            while (true) {
                a[] aVarArr2 = this.f381497c;
                if (i14 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i14];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, aVar);
                }
                i14++;
            }
        }
        e[] eVarArr = this.f381498d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                e[] eVarArr2 = this.f381498d;
                if (i15 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i15];
                if (eVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, eVar);
                }
                i15++;
            }
        }
        String[] strArr = this.f381499e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f381499e;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i12];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
