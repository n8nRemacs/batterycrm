package com.yandex.metrica.impl.ob;

import com.facebook.imageutils.JfifUtil;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class If extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public String f378288A;

    /* renamed from: B, reason: collision with root package name */
    public String f378289B;

    /* renamed from: C, reason: collision with root package name */
    public long f378290C;

    /* renamed from: D, reason: collision with root package name */
    public long f378291D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f378292E;

    /* renamed from: F, reason: collision with root package name */
    public n f378293F;

    /* renamed from: G, reason: collision with root package name */
    public j f378294G;

    /* renamed from: H, reason: collision with root package name */
    public int f378295H;

    /* renamed from: I, reason: collision with root package name */
    public int f378296I;

    /* renamed from: J, reason: collision with root package name */
    public w f378297J;

    /* renamed from: K, reason: collision with root package name */
    public v f378298K;

    /* renamed from: L, reason: collision with root package name */
    public v f378299L;

    /* renamed from: M, reason: collision with root package name */
    public v f378300M;

    /* renamed from: N, reason: collision with root package name */
    public t f378301N;

    /* renamed from: O, reason: collision with root package name */
    public c f378302O;

    /* renamed from: P, reason: collision with root package name */
    public f f378303P;

    /* renamed from: Q, reason: collision with root package name */
    public String[] f378304Q;

    /* renamed from: R, reason: collision with root package name */
    public b f378305R;

    /* renamed from: S, reason: collision with root package name */
    public a f378306S;

    /* renamed from: T, reason: collision with root package name */
    public h f378307T;

    /* renamed from: U, reason: collision with root package name */
    public g f378308U;

    /* renamed from: V, reason: collision with root package name */
    public r f378309V;

    /* renamed from: W, reason: collision with root package name */
    public l[] f378310W;

    /* renamed from: a, reason: collision with root package name */
    public String f378311a;

    /* renamed from: b, reason: collision with root package name */
    public long f378312b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f378313c;

    /* renamed from: d, reason: collision with root package name */
    public String f378314d;

    /* renamed from: e, reason: collision with root package name */
    public String f378315e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f378316f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f378317g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f378318h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f378319i;

    /* renamed from: j, reason: collision with root package name */
    public d[] f378320j;

    /* renamed from: k, reason: collision with root package name */
    public i f378321k;

    /* renamed from: l, reason: collision with root package name */
    public k[] f378322l;

    /* renamed from: m, reason: collision with root package name */
    public q f378323m;

    /* renamed from: n, reason: collision with root package name */
    public o[] f378324n;

    /* renamed from: o, reason: collision with root package name */
    public String f378325o;

    /* renamed from: p, reason: collision with root package name */
    public String f378326p;

    /* renamed from: q, reason: collision with root package name */
    public String f378327q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f378328r;

    /* renamed from: s, reason: collision with root package name */
    public String f378329s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f378330t;

    /* renamed from: u, reason: collision with root package name */
    public s f378331u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f378332v;

    /* renamed from: w, reason: collision with root package name */
    public m[] f378333w;

    /* renamed from: x, reason: collision with root package name */
    public p f378334x;

    /* renamed from: y, reason: collision with root package name */
    public String f378335y;

    /* renamed from: z, reason: collision with root package name */
    public String f378336z;

    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public b[] f378337a;

        /* renamed from: com.yandex.metrica.impl.ob.If$a$a, reason: collision with other inner class name */
        public static final class C10952a extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public String f378338a;

            public C10952a() {
                a();
            }

            public C10952a a() {
                this.f378338a = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                return !this.f378338a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f378338a) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f378338a = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                if (!this.f378338a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f378338a);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile b[] f378339c;

            /* renamed from: a, reason: collision with root package name */
            public String f378340a;

            /* renamed from: b, reason: collision with root package name */
            public C10952a f378341b;

            public b() {
                a();
            }

            public static b[] b() {
                if (f378339c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f378339c == null) {
                                f378339c = new b[0];
                            }
                        } finally {
                        }
                    }
                }
                return f378339c;
            }

            public b a() {
                this.f378340a = "";
                this.f378341b = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                if (!this.f378340a.equals("")) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f378340a);
                }
                C10952a c10952a = this.f378341b;
                return c10952a != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c10952a) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f378340a = codedInputByteBufferNano.readString();
                    } else if (tag == 18) {
                        if (this.f378341b == null) {
                            this.f378341b = new C10952a();
                        }
                        codedInputByteBufferNano.readMessage(this.f378341b);
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                if (!this.f378340a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f378340a);
                }
                C10952a c10952a = this.f378341b;
                if (c10952a != null) {
                    codedOutputByteBufferNano.writeMessage(2, c10952a);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public a a() {
            this.f378337a = b.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            b[] bVarArr = this.f378337a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    b[] bVarArr2 = this.f378337a;
                    if (i12 >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i12];
                    if (bVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, bVar) + iComputeSerializedSize;
                    }
                    i12++;
                }
            }
            return iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    b[] bVarArr = this.f378337a;
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
                    this.f378337a = bVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            b[] bVarArr = this.f378337a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    b[] bVarArr2 = this.f378337a;
                    if (i12 >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i12];
                    if (bVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, bVar);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public int f378342a;

        /* renamed from: b, reason: collision with root package name */
        public int f378343b;

        public b() {
            a();
        }

        public b a() {
            this.f378342a = 86400;
            this.f378343b = 86400;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i12 = this.f378342a;
            if (i12 != 86400) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i12);
            }
            int i13 = this.f378343b;
            return i13 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i13) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378342a = codedInputByteBufferNano.readInt32();
                } else if (tag == 16) {
                    this.f378343b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            int i12 = this.f378342a;
            if (i12 != 86400) {
                codedOutputByteBufferNano.writeInt32(1, i12);
            }
            int i13 = this.f378343b;
            if (i13 != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378344a;

        /* renamed from: b, reason: collision with root package name */
        public long f378345b;

        /* renamed from: c, reason: collision with root package name */
        public long f378346c;

        /* renamed from: d, reason: collision with root package name */
        public long f378347d;

        public c() {
            a();
        }

        public c a() {
            this.f378344a = 10000L;
            this.f378345b = 10000L;
            this.f378346c = 10000L;
            this.f378347d = 10000L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            long j12 = this.f378344a;
            if (j12 != 10000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j12);
            }
            long j13 = this.f378345b;
            if (j13 != 10000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j13);
            }
            long j14 = this.f378346c;
            if (j14 != 10000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j14);
            }
            long j15 = this.f378347d;
            return j15 != 10000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j15) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378344a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f378345b = codedInputByteBufferNano.readInt64();
                } else if (tag == 24) {
                    this.f378346c = codedInputByteBufferNano.readInt64();
                } else if (tag == 32) {
                    this.f378347d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            long j12 = this.f378344a;
            if (j12 != 10000) {
                codedOutputByteBufferNano.writeInt64(1, j12);
            }
            long j13 = this.f378345b;
            if (j13 != 10000) {
                codedOutputByteBufferNano.writeInt64(2, j13);
            }
            long j14 = this.f378346c;
            if (j14 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j14);
            }
            long j15 = this.f378347d;
            if (j15 != 10000) {
                codedOutputByteBufferNano.writeInt64(4, j15);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class d extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile d[] f378348c;

        /* renamed from: a, reason: collision with root package name */
        public String f378349a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f378350b;

        public d() {
            a();
        }

        public static d[] b() {
            if (f378348c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378348c == null) {
                            f378348c = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return f378348c;
        }

        public d a() {
            this.f378349a = "";
            this.f378350b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f378349a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f378349a);
            }
            String[] strArr = this.f378350b;
            if (strArr == null || strArr.length <= 0) {
                return iComputeSerializedSize;
            }
            int i12 = 0;
            int iComputeStringSizeNoTag = 0;
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f378350b;
                if (i12 >= strArr2.length) {
                    return iComputeSerializedSize + iComputeStringSizeNoTag + i13;
                }
                String str = strArr2[i12];
                if (str != null) {
                    i13++;
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
                if (tag == 10) {
                    this.f378349a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f378350b;
                    int length = strArr == null ? 0 : strArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i12];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f378350b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f378349a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f378349a);
            }
            String[] strArr = this.f378350b;
            if (strArr != null && strArr.length > 0) {
                int i12 = 0;
                while (true) {
                    String[] strArr2 = this.f378350b;
                    if (i12 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i12];
                    if (str != null) {
                        codedOutputByteBufferNano.writeString(2, str);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class e extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378351a;

        /* renamed from: b, reason: collision with root package name */
        public int f378352b;

        public e() {
            a();
        }

        public e a() {
            this.f378351a = 0L;
            this.f378352b = 86400;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(1, this.f378351a) + super.computeSerializedSize();
            int i12 = this.f378352b;
            return i12 != 86400 ? iComputeInt64Size + CodedOutputByteBufferNano.computeInt32Size(2, i12) : iComputeInt64Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378351a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f378352b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt64(1, this.f378351a);
            int i12 = this.f378352b;
            if (i12 != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class f extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public e f378353a;

        /* renamed from: b, reason: collision with root package name */
        public e f378354b;

        /* renamed from: c, reason: collision with root package name */
        public e f378355c;

        public f() {
            a();
        }

        public f a() {
            this.f378353a = null;
            this.f378354b = null;
            this.f378355c = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            e eVar = this.f378353a;
            if (eVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, eVar);
            }
            e eVar2 = this.f378354b;
            if (eVar2 != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, eVar2);
            }
            e eVar3 = this.f378355c;
            return eVar3 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, eVar3) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f378353a == null) {
                        this.f378353a = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f378353a);
                } else if (tag == 18) {
                    if (this.f378354b == null) {
                        this.f378354b = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f378354b);
                } else if (tag == 26) {
                    if (this.f378355c == null) {
                        this.f378355c = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f378355c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            e eVar = this.f378353a;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(1, eVar);
            }
            e eVar2 = this.f378354b;
            if (eVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar2);
            }
            e eVar3 = this.f378355c;
            if (eVar3 != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class g extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378356a;

        public g() {
            a();
        }

        public g a() {
            this.f378356a = 1209600L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            long j12 = this.f378356a;
            return j12 != 1209600 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378356a = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            long j12 = this.f378356a;
            if (j12 != 1209600) {
                codedOutputByteBufferNano.writeUInt64(1, j12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class h extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public String f378357a;

        /* renamed from: b, reason: collision with root package name */
        public int f378358b;

        /* renamed from: c, reason: collision with root package name */
        public int f378359c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f378360d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f378361e;

        public h() {
            a();
        }

        public h a() {
            this.f378357a = "";
            this.f378358b = 600;
            this.f378359c = 300;
            this.f378360d = false;
            this.f378361e = true;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f378357a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f378357a);
            }
            int i12 = this.f378358b;
            if (i12 != 600) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i12);
            }
            int i13 = this.f378359c;
            if (i13 != 300) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i13);
            }
            boolean z12 = this.f378360d;
            if (z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z12);
            }
            boolean z13 = this.f378361e;
            return !z13 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(5, z13) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f378357a = codedInputByteBufferNano.readString();
                } else if (tag == 16) {
                    this.f378358b = codedInputByteBufferNano.readUInt32();
                } else if (tag == 24) {
                    this.f378359c = codedInputByteBufferNano.readUInt32();
                } else if (tag == 32) {
                    this.f378360d = codedInputByteBufferNano.readBool();
                } else if (tag == 40) {
                    this.f378361e = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f378357a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f378357a);
            }
            int i12 = this.f378358b;
            if (i12 != 600) {
                codedOutputByteBufferNano.writeUInt32(2, i12);
            }
            int i13 = this.f378359c;
            if (i13 != 300) {
                codedOutputByteBufferNano.writeUInt32(3, i13);
            }
            boolean z12 = this.f378360d;
            if (z12) {
                codedOutputByteBufferNano.writeBool(4, z12);
            }
            boolean z13 = this.f378361e;
            if (!z13) {
                codedOutputByteBufferNano.writeBool(5, z13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class i extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public boolean f378362a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f378363b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f378364c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f378365d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f378366e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f378367f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f378368g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f378369h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f378370i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f378371j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f378372k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f378373l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f378374m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f378375n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f378376o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f378377p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f378378q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f378379r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f378380s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f378381t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f378382u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f378383v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f378384w;

        /* renamed from: x, reason: collision with root package name */
        public int f378385x;

        public i() {
            a();
        }

        public i a() {
            this.f378362a = false;
            this.f378363b = false;
            this.f378364c = false;
            this.f378365d = false;
            this.f378366e = false;
            this.f378367f = false;
            this.f378368g = false;
            this.f378369h = false;
            this.f378370i = false;
            this.f378371j = false;
            this.f378372k = true;
            this.f378373l = false;
            this.f378374m = false;
            this.f378375n = false;
            this.f378376o = false;
            this.f378377p = false;
            this.f378378q = false;
            this.f378379r = false;
            this.f378380s = false;
            this.f378381t = true;
            this.f378382u = false;
            this.f378383v = false;
            this.f378384w = false;
            this.f378385x = -1;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(28, this.f378382u) + CodedOutputByteBufferNano.computeBoolSize(27, this.f378381t) + CodedOutputByteBufferNano.computeBoolSize(26, this.f378380s) + CodedOutputByteBufferNano.computeBoolSize(25, this.f378379r) + CodedOutputByteBufferNano.computeBoolSize(24, this.f378378q) + CodedOutputByteBufferNano.computeBoolSize(23, this.f378377p) + CodedOutputByteBufferNano.computeBoolSize(22, this.f378376o) + CodedOutputByteBufferNano.computeBoolSize(21, this.f378375n) + CodedOutputByteBufferNano.computeBoolSize(19, this.f378374m) + CodedOutputByteBufferNano.computeBoolSize(18, this.f378373l) + CodedOutputByteBufferNano.computeBoolSize(16, this.f378372k) + CodedOutputByteBufferNano.computeBoolSize(15, this.f378371j) + CodedOutputByteBufferNano.computeBoolSize(12, this.f378370i) + CodedOutputByteBufferNano.computeBoolSize(11, this.f378369h) + CodedOutputByteBufferNano.computeBoolSize(9, this.f378368g) + CodedOutputByteBufferNano.computeBoolSize(8, this.f378367f) + CodedOutputByteBufferNano.computeBoolSize(6, this.f378366e) + CodedOutputByteBufferNano.computeBoolSize(4, this.f378365d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f378364c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f378363b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f378362a) + super.computeSerializedSize();
            boolean z12 = this.f378383v;
            if (z12) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(29, z12);
            }
            boolean z13 = this.f378384w;
            if (z13) {
                iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(33, z13);
            }
            int i12 = this.f378385x;
            return i12 != -1 ? iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(34, i12) : iComputeBoolSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        this.f378362a = codedInputByteBufferNano.readBool();
                        break;
                    case 16:
                        this.f378363b = codedInputByteBufferNano.readBool();
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        this.f378364c = codedInputByteBufferNano.readBool();
                        break;
                    case 32:
                        this.f378365d = codedInputByteBufferNano.readBool();
                        break;
                    case 48:
                        this.f378366e = codedInputByteBufferNano.readBool();
                        break;
                    case 64:
                        this.f378367f = codedInputByteBufferNano.readBool();
                        break;
                    case 72:
                        this.f378368g = codedInputByteBufferNano.readBool();
                        break;
                    case 88:
                        this.f378369h = codedInputByteBufferNano.readBool();
                        break;
                    case 96:
                        this.f378370i = codedInputByteBufferNano.readBool();
                        break;
                    case 120:
                        this.f378371j = codedInputByteBufferNano.readBool();
                        break;
                    case 128:
                        this.f378372k = codedInputByteBufferNano.readBool();
                        break;
                    case 144:
                        this.f378373l = codedInputByteBufferNano.readBool();
                        break;
                    case 152:
                        this.f378374m = codedInputByteBufferNano.readBool();
                        break;
                    case 168:
                        this.f378375n = codedInputByteBufferNano.readBool();
                        break;
                    case 176:
                        this.f378376o = codedInputByteBufferNano.readBool();
                        break;
                    case 184:
                        this.f378377p = codedInputByteBufferNano.readBool();
                        break;
                    case 192:
                        this.f378378q = codedInputByteBufferNano.readBool();
                        break;
                    case 200:
                        this.f378379r = codedInputByteBufferNano.readBool();
                        break;
                    case JfifUtil.MARKER_RST0 /* 208 */:
                        this.f378380s = codedInputByteBufferNano.readBool();
                        break;
                    case JfifUtil.MARKER_SOI /* 216 */:
                        this.f378381t = codedInputByteBufferNano.readBool();
                        break;
                    case 224:
                        this.f378382u = codedInputByteBufferNano.readBool();
                        break;
                    case 232:
                        this.f378383v = codedInputByteBufferNano.readBool();
                        break;
                    case 264:
                        this.f378384w = codedInputByteBufferNano.readBool();
                        break;
                    case 272:
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 != -1 && int32 != 0 && int32 != 1) {
                            break;
                        } else {
                            this.f378385x = int32;
                            break;
                        }
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
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeBool(1, this.f378362a);
            codedOutputByteBufferNano.writeBool(2, this.f378363b);
            codedOutputByteBufferNano.writeBool(3, this.f378364c);
            codedOutputByteBufferNano.writeBool(4, this.f378365d);
            codedOutputByteBufferNano.writeBool(6, this.f378366e);
            codedOutputByteBufferNano.writeBool(8, this.f378367f);
            codedOutputByteBufferNano.writeBool(9, this.f378368g);
            codedOutputByteBufferNano.writeBool(11, this.f378369h);
            codedOutputByteBufferNano.writeBool(12, this.f378370i);
            codedOutputByteBufferNano.writeBool(15, this.f378371j);
            codedOutputByteBufferNano.writeBool(16, this.f378372k);
            codedOutputByteBufferNano.writeBool(18, this.f378373l);
            codedOutputByteBufferNano.writeBool(19, this.f378374m);
            codedOutputByteBufferNano.writeBool(21, this.f378375n);
            codedOutputByteBufferNano.writeBool(22, this.f378376o);
            codedOutputByteBufferNano.writeBool(23, this.f378377p);
            codedOutputByteBufferNano.writeBool(24, this.f378378q);
            codedOutputByteBufferNano.writeBool(25, this.f378379r);
            codedOutputByteBufferNano.writeBool(26, this.f378380s);
            codedOutputByteBufferNano.writeBool(27, this.f378381t);
            codedOutputByteBufferNano.writeBool(28, this.f378382u);
            boolean z12 = this.f378383v;
            if (z12) {
                codedOutputByteBufferNano.writeBool(29, z12);
            }
            boolean z13 = this.f378384w;
            if (z13) {
                codedOutputByteBufferNano.writeBool(33, z13);
            }
            int i12 = this.f378385x;
            if (i12 != -1) {
                codedOutputByteBufferNano.writeInt32(34, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class j extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378386a;

        public j() {
            a();
        }

        public j a() {
            this.f378386a = 900L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeInt64Size(1, this.f378386a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378386a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt64(1, this.f378386a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class k extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile k[] f378387c;

        /* renamed from: a, reason: collision with root package name */
        public a f378388a;

        /* renamed from: b, reason: collision with root package name */
        public b f378389b;

        public static final class a extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public long f378390a;

            /* renamed from: b, reason: collision with root package name */
            public float f378391b;

            /* renamed from: c, reason: collision with root package name */
            public int f378392c;

            /* renamed from: d, reason: collision with root package name */
            public int f378393d;

            /* renamed from: e, reason: collision with root package name */
            public long f378394e;

            /* renamed from: f, reason: collision with root package name */
            public int f378395f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f378396g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f378397h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f378398i;

            /* renamed from: j, reason: collision with root package name */
            public long f378399j;

            /* renamed from: k, reason: collision with root package name */
            public C10953a f378400k;

            /* renamed from: l, reason: collision with root package name */
            public C10953a f378401l;

            /* renamed from: m, reason: collision with root package name */
            public C10953a f378402m;

            /* renamed from: n, reason: collision with root package name */
            public C10953a f378403n;

            /* renamed from: o, reason: collision with root package name */
            public b f378404o;

            /* renamed from: p, reason: collision with root package name */
            public boolean f378405p;

            /* renamed from: q, reason: collision with root package name */
            public boolean f378406q;

            /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a, reason: collision with other inner class name */
            public static final class C10953a extends MessageNano {

                /* renamed from: a, reason: collision with root package name */
                public boolean f378407a;

                /* renamed from: b, reason: collision with root package name */
                public boolean f378408b;

                /* renamed from: c, reason: collision with root package name */
                public C10954a f378409c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a$a, reason: collision with other inner class name */
                public static final class C10954a extends MessageNano {

                    /* renamed from: a, reason: collision with root package name */
                    public long f378410a;

                    /* renamed from: b, reason: collision with root package name */
                    public long f378411b;

                    public C10954a() {
                        a();
                    }

                    public C10954a a() {
                        this.f378410a = 0L;
                        this.f378411b = 0L;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public int computeSerializedSize() {
                        return CodedOutputByteBufferNano.computeInt64Size(2, this.f378411b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f378410a) + super.computeSerializedSize();
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                        while (true) {
                            int tag = codedInputByteBufferNano.readTag();
                            if (tag == 0) {
                                break;
                            }
                            if (tag == 8) {
                                this.f378410a = codedInputByteBufferNano.readInt64();
                            } else if (tag == 16) {
                                this.f378411b = codedInputByteBufferNano.readInt64();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                        codedOutputByteBufferNano.writeInt64(1, this.f378410a);
                        codedOutputByteBufferNano.writeInt64(2, this.f378411b);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public C10953a() {
                    a();
                }

                public C10953a a() {
                    this.f378407a = true;
                    this.f378408b = false;
                    this.f378409c = null;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public int computeSerializedSize() {
                    int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(2, this.f378408b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f378407a) + super.computeSerializedSize();
                    C10954a c10954a = this.f378409c;
                    return c10954a != null ? iComputeBoolSize + CodedOutputByteBufferNano.computeMessageSize(3, c10954a) : iComputeBoolSize;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                    while (true) {
                        int tag = codedInputByteBufferNano.readTag();
                        if (tag == 0) {
                            break;
                        }
                        if (tag == 8) {
                            this.f378407a = codedInputByteBufferNano.readBool();
                        } else if (tag == 16) {
                            this.f378408b = codedInputByteBufferNano.readBool();
                        } else if (tag == 26) {
                            if (this.f378409c == null) {
                                this.f378409c = new C10954a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378409c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                    codedOutputByteBufferNano.writeBool(1, this.f378407a);
                    codedOutputByteBufferNano.writeBool(2, this.f378408b);
                    C10954a c10954a = this.f378409c;
                    if (c10954a != null) {
                        codedOutputByteBufferNano.writeMessage(3, c10954a);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public static final class b extends MessageNano {

                /* renamed from: a, reason: collision with root package name */
                public boolean f378412a;

                /* renamed from: b, reason: collision with root package name */
                public boolean f378413b;

                /* renamed from: c, reason: collision with root package name */
                public C10955a f378414c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$b$a, reason: collision with other inner class name */
                public static final class C10955a extends MessageNano {

                    /* renamed from: a, reason: collision with root package name */
                    public long f378415a;

                    /* renamed from: b, reason: collision with root package name */
                    public long f378416b;

                    /* renamed from: c, reason: collision with root package name */
                    public int f378417c;

                    public C10955a() {
                        a();
                    }

                    public C10955a a() {
                        this.f378415a = 0L;
                        this.f378416b = 0L;
                        this.f378417c = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public int computeSerializedSize() {
                        return CodedOutputByteBufferNano.computeInt32Size(3, this.f378417c) + CodedOutputByteBufferNano.computeInt64Size(2, this.f378416b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f378415a) + super.computeSerializedSize();
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                        while (true) {
                            int tag = codedInputByteBufferNano.readTag();
                            if (tag == 0) {
                                break;
                            }
                            if (tag == 8) {
                                this.f378415a = codedInputByteBufferNano.readInt64();
                            } else if (tag == 16) {
                                this.f378416b = codedInputByteBufferNano.readInt64();
                            } else if (tag == 24) {
                                int int32 = codedInputByteBufferNano.readInt32();
                                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                                    this.f378417c = int32;
                                }
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.nano.ym.MessageNano
                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                        codedOutputByteBufferNano.writeInt64(1, this.f378415a);
                        codedOutputByteBufferNano.writeInt64(2, this.f378416b);
                        codedOutputByteBufferNano.writeInt32(3, this.f378417c);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public b() {
                    a();
                }

                public b a() {
                    this.f378412a = true;
                    this.f378413b = false;
                    this.f378414c = null;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public int computeSerializedSize() {
                    int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(2, this.f378413b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f378412a) + super.computeSerializedSize();
                    C10955a c10955a = this.f378414c;
                    return c10955a != null ? iComputeBoolSize + CodedOutputByteBufferNano.computeMessageSize(3, c10955a) : iComputeBoolSize;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                    while (true) {
                        int tag = codedInputByteBufferNano.readTag();
                        if (tag == 0) {
                            break;
                        }
                        if (tag == 8) {
                            this.f378412a = codedInputByteBufferNano.readBool();
                        } else if (tag == 16) {
                            this.f378413b = codedInputByteBufferNano.readBool();
                        } else if (tag == 26) {
                            if (this.f378414c == null) {
                                this.f378414c = new C10955a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378414c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                            break;
                        }
                    }
                    return this;
                }

                @Override // com.google.protobuf.nano.ym.MessageNano
                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                    codedOutputByteBufferNano.writeBool(1, this.f378412a);
                    codedOutputByteBufferNano.writeBool(2, this.f378413b);
                    C10955a c10955a = this.f378414c;
                    if (c10955a != null) {
                        codedOutputByteBufferNano.writeMessage(3, c10955a);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public a() {
                a();
            }

            public a a() {
                this.f378390a = 5000L;
                this.f378391b = 10.0f;
                this.f378392c = 20;
                this.f378393d = 200;
                this.f378394e = 60000L;
                this.f378395f = 10000;
                this.f378396g = false;
                this.f378397h = false;
                this.f378398i = true;
                this.f378399j = 60000L;
                this.f378400k = null;
                this.f378401l = null;
                this.f378402m = null;
                this.f378403n = null;
                this.f378404o = null;
                this.f378405p = false;
                this.f378406q = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(9, this.f378399j) + CodedOutputByteBufferNano.computeBoolSize(8, this.f378397h) + CodedOutputByteBufferNano.computeBoolSize(7, this.f378396g) + CodedOutputByteBufferNano.computeInt32Size(6, this.f378395f) + CodedOutputByteBufferNano.computeInt64Size(5, this.f378394e) + CodedOutputByteBufferNano.computeInt32Size(4, this.f378393d) + CodedOutputByteBufferNano.computeInt32Size(3, this.f378392c) + CodedOutputByteBufferNano.computeFloatSize(2, this.f378391b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f378390a) + super.computeSerializedSize();
                C10953a c10953a = this.f378400k;
                if (c10953a != null) {
                    iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(10, c10953a);
                }
                C10953a c10953a2 = this.f378401l;
                if (c10953a2 != null) {
                    iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(11, c10953a2);
                }
                C10953a c10953a3 = this.f378402m;
                if (c10953a3 != null) {
                    iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(12, c10953a3);
                }
                int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f378398i) + iComputeInt64Size;
                C10953a c10953a4 = this.f378403n;
                if (c10953a4 != null) {
                    iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(14, c10953a4);
                }
                b bVar = this.f378404o;
                if (bVar != null) {
                    iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(15, bVar);
                }
                boolean z12 = this.f378405p;
                if (z12) {
                    iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(16, z12);
                }
                boolean z13 = this.f378406q;
                return z13 ? iComputeBoolSize + CodedOutputByteBufferNano.computeBoolSize(17, z13) : iComputeBoolSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    switch (tag) {
                        case 0:
                            break;
                        case 8:
                            this.f378390a = codedInputByteBufferNano.readInt64();
                            break;
                        case 21:
                            this.f378391b = codedInputByteBufferNano.readFloat();
                            break;
                        case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                            this.f378392c = codedInputByteBufferNano.readInt32();
                            break;
                        case 32:
                            this.f378393d = codedInputByteBufferNano.readInt32();
                            break;
                        case 40:
                            this.f378394e = codedInputByteBufferNano.readInt64();
                            break;
                        case 48:
                            this.f378395f = codedInputByteBufferNano.readInt32();
                            break;
                        case 56:
                            this.f378396g = codedInputByteBufferNano.readBool();
                            break;
                        case 64:
                            this.f378397h = codedInputByteBufferNano.readBool();
                            break;
                        case 72:
                            this.f378399j = codedInputByteBufferNano.readInt64();
                            break;
                        case 82:
                            if (this.f378400k == null) {
                                this.f378400k = new C10953a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378400k);
                            break;
                        case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                            if (this.f378401l == null) {
                                this.f378401l = new C10953a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378401l);
                            break;
                        case 98:
                            if (this.f378402m == null) {
                                this.f378402m = new C10953a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378402m);
                            break;
                        case 104:
                            this.f378398i = codedInputByteBufferNano.readBool();
                            break;
                        case 114:
                            if (this.f378403n == null) {
                                this.f378403n = new C10953a();
                            }
                            codedInputByteBufferNano.readMessage(this.f378403n);
                            break;
                        case 122:
                            if (this.f378404o == null) {
                                this.f378404o = new b();
                            }
                            codedInputByteBufferNano.readMessage(this.f378404o);
                            break;
                        case 128:
                            this.f378405p = codedInputByteBufferNano.readBool();
                            break;
                        case 136:
                            this.f378406q = codedInputByteBufferNano.readBool();
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
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                codedOutputByteBufferNano.writeInt64(1, this.f378390a);
                codedOutputByteBufferNano.writeFloat(2, this.f378391b);
                codedOutputByteBufferNano.writeInt32(3, this.f378392c);
                codedOutputByteBufferNano.writeInt32(4, this.f378393d);
                codedOutputByteBufferNano.writeInt64(5, this.f378394e);
                codedOutputByteBufferNano.writeInt32(6, this.f378395f);
                codedOutputByteBufferNano.writeBool(7, this.f378396g);
                codedOutputByteBufferNano.writeBool(8, this.f378397h);
                codedOutputByteBufferNano.writeInt64(9, this.f378399j);
                C10953a c10953a = this.f378400k;
                if (c10953a != null) {
                    codedOutputByteBufferNano.writeMessage(10, c10953a);
                }
                C10953a c10953a2 = this.f378401l;
                if (c10953a2 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c10953a2);
                }
                C10953a c10953a3 = this.f378402m;
                if (c10953a3 != null) {
                    codedOutputByteBufferNano.writeMessage(12, c10953a3);
                }
                codedOutputByteBufferNano.writeBool(13, this.f378398i);
                C10953a c10953a4 = this.f378403n;
                if (c10953a4 != null) {
                    codedOutputByteBufferNano.writeMessage(14, c10953a4);
                }
                b bVar = this.f378404o;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(15, bVar);
                }
                boolean z12 = this.f378405p;
                if (z12) {
                    codedOutputByteBufferNano.writeBool(16, z12);
                }
                boolean z13 = this.f378406q;
                if (z13) {
                    codedOutputByteBufferNano.writeBool(17, z13);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public int[] f378418a;

            /* renamed from: b, reason: collision with root package name */
            public int[] f378419b;

            public b() {
                a();
            }

            public b a() {
                int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
                this.f378418a = iArr;
                this.f378419b = iArr;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int[] iArr;
                int iComputeSerializedSize = super.computeSerializedSize();
                int[] iArr2 = this.f378418a;
                int i12 = 0;
                if (iArr2 != null && iArr2.length > 0) {
                    int i13 = 0;
                    int iComputeInt32SizeNoTag = 0;
                    while (true) {
                        iArr = this.f378418a;
                        if (i13 >= iArr.length) {
                            break;
                        }
                        iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i13]);
                        i13++;
                    }
                    iComputeSerializedSize = iComputeSerializedSize + iComputeInt32SizeNoTag + iArr.length;
                }
                int[] iArr3 = this.f378419b;
                if (iArr3 == null || iArr3.length <= 0) {
                    return iComputeSerializedSize;
                }
                int iComputeInt32SizeNoTag2 = 0;
                while (true) {
                    int[] iArr4 = this.f378419b;
                    if (i12 >= iArr4.length) {
                        return iComputeSerializedSize + iComputeInt32SizeNoTag2 + iArr4.length;
                    }
                    iComputeInt32SizeNoTag2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr4[i12]);
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
                    if (tag != 8) {
                        if (tag != 10) {
                            if (tag != 16) {
                                if (tag != 18) {
                                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                        break;
                                    }
                                } else {
                                    int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                                    int position = codedInputByteBufferNano.getPosition();
                                    int i12 = 0;
                                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                        int int32 = codedInputByteBufferNano.readInt32();
                                        if (int32 == 0 || int32 == 2 || int32 == 3) {
                                            i12++;
                                        }
                                    }
                                    if (i12 != 0) {
                                        codedInputByteBufferNano.rewindToPosition(position);
                                        int[] iArr = this.f378419b;
                                        int length = iArr == null ? 0 : iArr.length;
                                        int[] iArr2 = new int[i12 + length];
                                        if (length != 0) {
                                            System.arraycopy(iArr, 0, iArr2, 0, length);
                                        }
                                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                            int int322 = codedInputByteBufferNano.readInt32();
                                            if (int322 == 0 || int322 == 2 || int322 == 3) {
                                                iArr2[length] = int322;
                                                length++;
                                            }
                                        }
                                        this.f378419b = iArr2;
                                    }
                                    codedInputByteBufferNano.popLimit(iPushLimit);
                                }
                            } else {
                                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                                int[] iArr3 = new int[repeatedFieldArrayLength];
                                int i13 = 0;
                                for (int i14 = 0; i14 < repeatedFieldArrayLength; i14++) {
                                    if (i14 != 0) {
                                        codedInputByteBufferNano.readTag();
                                    }
                                    int int323 = codedInputByteBufferNano.readInt32();
                                    if (int323 == 0 || int323 == 2 || int323 == 3) {
                                        iArr3[i13] = int323;
                                        i13++;
                                    }
                                }
                                if (i13 != 0) {
                                    int[] iArr4 = this.f378419b;
                                    int length2 = iArr4 == null ? 0 : iArr4.length;
                                    if (length2 == 0 && i13 == repeatedFieldArrayLength) {
                                        this.f378419b = iArr3;
                                    } else {
                                        int[] iArr5 = new int[length2 + i13];
                                        if (length2 != 0) {
                                            System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                        }
                                        System.arraycopy(iArr3, 0, iArr5, length2, i13);
                                        this.f378419b = iArr5;
                                    }
                                }
                            }
                        } else {
                            int iPushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                            int position2 = codedInputByteBufferNano.getPosition();
                            int i15 = 0;
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int int324 = codedInputByteBufferNano.readInt32();
                                if (int324 == 0 || int324 == 1 || int324 == 2 || int324 == 3 || int324 == 4) {
                                    i15++;
                                }
                            }
                            if (i15 != 0) {
                                codedInputByteBufferNano.rewindToPosition(position2);
                                int[] iArr6 = this.f378418a;
                                int length3 = iArr6 == null ? 0 : iArr6.length;
                                int[] iArr7 = new int[i15 + length3];
                                if (length3 != 0) {
                                    System.arraycopy(iArr6, 0, iArr7, 0, length3);
                                }
                                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                    int int325 = codedInputByteBufferNano.readInt32();
                                    if (int325 == 0 || int325 == 1 || int325 == 2 || int325 == 3 || int325 == 4) {
                                        iArr7[length3] = int325;
                                        length3++;
                                    }
                                }
                                this.f378418a = iArr7;
                            }
                            codedInputByteBufferNano.popLimit(iPushLimit2);
                        }
                    } else {
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                        int[] iArr8 = new int[repeatedFieldArrayLength2];
                        int i16 = 0;
                        for (int i17 = 0; i17 < repeatedFieldArrayLength2; i17++) {
                            if (i17 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int int326 = codedInputByteBufferNano.readInt32();
                            if (int326 == 0 || int326 == 1 || int326 == 2 || int326 == 3 || int326 == 4) {
                                iArr8[i16] = int326;
                                i16++;
                            }
                        }
                        if (i16 != 0) {
                            int[] iArr9 = this.f378418a;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            if (length4 == 0 && i16 == repeatedFieldArrayLength2) {
                                this.f378418a = iArr8;
                            } else {
                                int[] iArr10 = new int[length4 + i16];
                                if (length4 != 0) {
                                    System.arraycopy(iArr9, 0, iArr10, 0, length4);
                                }
                                System.arraycopy(iArr8, 0, iArr10, length4, i16);
                                this.f378418a = iArr10;
                            }
                        }
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                int[] iArr = this.f378418a;
                int i12 = 0;
                if (iArr != null && iArr.length > 0) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr2 = this.f378418a;
                        if (i13 >= iArr2.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(1, iArr2[i13]);
                        i13++;
                    }
                }
                int[] iArr3 = this.f378419b;
                if (iArr3 != null && iArr3.length > 0) {
                    while (true) {
                        int[] iArr4 = this.f378419b;
                        if (i12 >= iArr4.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(2, iArr4[i12]);
                        i12++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public k() {
            a();
        }

        public static k[] b() {
            if (f378387c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378387c == null) {
                            f378387c = new k[0];
                        }
                    } finally {
                    }
                }
            }
            return f378387c;
        }

        public k a() {
            this.f378388a = null;
            this.f378389b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            a aVar = this.f378388a;
            if (aVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            b bVar = this.f378389b;
            return bVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, bVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f378388a == null) {
                        this.f378388a = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f378388a);
                } else if (tag == 18) {
                    if (this.f378389b == null) {
                        this.f378389b = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f378389b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            a aVar = this.f378388a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            b bVar = this.f378389b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class l extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile l[] f378420c;

        /* renamed from: a, reason: collision with root package name */
        public String f378421a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f378422b;

        public l() {
            a();
        }

        public static l[] b() {
            if (f378420c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378420c == null) {
                            f378420c = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return f378420c;
        }

        public l a() {
            this.f378421a = "";
            this.f378422b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f378421a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f378421a);
            }
            return !Arrays.equals(this.f378422b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f378422b) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f378421a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.f378422b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f378421a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f378421a);
            }
            if (!Arrays.equals(this.f378422b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f378422b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class m extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile m[] f378423c;

        /* renamed from: a, reason: collision with root package name */
        public String f378424a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f378425b;

        public m() {
            a();
        }

        public static m[] b() {
            if (f378423c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378423c == null) {
                            f378423c = new m[0];
                        }
                    } finally {
                    }
                }
            }
            return f378423c;
        }

        public m a() {
            this.f378424a = "";
            this.f378425b = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeBoolSize(2, this.f378425b) + CodedOutputByteBufferNano.computeStringSize(1, this.f378424a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f378424a = codedInputByteBufferNano.readString();
                } else if (tag == 16) {
                    this.f378425b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f378424a);
            codedOutputByteBufferNano.writeBool(2, this.f378425b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class n extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378426a;

        /* renamed from: b, reason: collision with root package name */
        public long f378427b;

        public n() {
            a();
        }

        public n a() {
            this.f378426a = 86400L;
            this.f378427b = 432000L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeInt64Size(2, this.f378427b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f378426a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378426a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f378427b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt64(1, this.f378426a);
            codedOutputByteBufferNano.writeInt64(2, this.f378427b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class o extends MessageNano {

        /* renamed from: g, reason: collision with root package name */
        private static volatile o[] f378428g;

        /* renamed from: a, reason: collision with root package name */
        public String f378429a;

        /* renamed from: b, reason: collision with root package name */
        public String f378430b;

        /* renamed from: c, reason: collision with root package name */
        public String f378431c;

        /* renamed from: d, reason: collision with root package name */
        public a[] f378432d;

        /* renamed from: e, reason: collision with root package name */
        public long f378433e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f378434f;

        public static final class a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile a[] f378435c;

            /* renamed from: a, reason: collision with root package name */
            public String f378436a;

            /* renamed from: b, reason: collision with root package name */
            public String f378437b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f378435c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f378435c == null) {
                                f378435c = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f378435c;
            }

            public a a() {
                this.f378436a = "";
                this.f378437b = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                return CodedOutputByteBufferNano.computeStringSize(2, this.f378437b) + CodedOutputByteBufferNano.computeStringSize(1, this.f378436a) + super.computeSerializedSize();
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f378436a = codedInputByteBufferNano.readString();
                    } else if (tag == 18) {
                        this.f378437b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                codedOutputByteBufferNano.writeString(1, this.f378436a);
                codedOutputByteBufferNano.writeString(2, this.f378437b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public o() {
            a();
        }

        public static o[] b() {
            if (f378428g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378428g == null) {
                            f378428g = new o[0];
                        }
                    } finally {
                    }
                }
            }
            return f378428g;
        }

        public o a() {
            this.f378429a = "";
            this.f378430b = "";
            this.f378431c = "";
            this.f378432d = a.b();
            this.f378433e = 0L;
            this.f378434f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(3, this.f378431c) + CodedOutputByteBufferNano.computeStringSize(2, this.f378430b) + CodedOutputByteBufferNano.computeStringSize(1, this.f378429a) + super.computeSerializedSize();
            a[] aVarArr = this.f378432d;
            int i12 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i13 = 0;
                while (true) {
                    a[] aVarArr2 = this.f378432d;
                    if (i13 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i13];
                    if (aVar != null) {
                        iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(4, aVar) + iComputeStringSize;
                    }
                    i13++;
                }
            }
            int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(5, this.f378433e) + iComputeStringSize;
            int[] iArr = this.f378434f;
            if (iArr == null || iArr.length <= 0) {
                return iComputeInt64Size;
            }
            int iComputeInt32SizeNoTag = 0;
            while (true) {
                int[] iArr2 = this.f378434f;
                if (i12 >= iArr2.length) {
                    return iComputeInt64Size + iComputeInt32SizeNoTag + iArr2.length;
                }
                iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i12]);
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
                if (tag != 10) {
                    if (tag != 18) {
                        if (tag != 26) {
                            if (tag != 34) {
                                if (tag != 40) {
                                    if (tag != 48) {
                                        if (tag != 50) {
                                            if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                                break;
                                            }
                                        } else {
                                            int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                                            int position = codedInputByteBufferNano.getPosition();
                                            int i12 = 0;
                                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                                int int32 = codedInputByteBufferNano.readInt32();
                                                if (int32 == 1 || int32 == 2) {
                                                    i12++;
                                                }
                                            }
                                            if (i12 != 0) {
                                                codedInputByteBufferNano.rewindToPosition(position);
                                                int[] iArr = this.f378434f;
                                                int length = iArr == null ? 0 : iArr.length;
                                                int[] iArr2 = new int[i12 + length];
                                                if (length != 0) {
                                                    System.arraycopy(iArr, 0, iArr2, 0, length);
                                                }
                                                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                                    int int322 = codedInputByteBufferNano.readInt32();
                                                    if (int322 == 1 || int322 == 2) {
                                                        iArr2[length] = int322;
                                                        length++;
                                                    }
                                                }
                                                this.f378434f = iArr2;
                                            }
                                            codedInputByteBufferNano.popLimit(iPushLimit);
                                        }
                                    } else {
                                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 48);
                                        int[] iArr3 = new int[repeatedFieldArrayLength];
                                        int i13 = 0;
                                        for (int i14 = 0; i14 < repeatedFieldArrayLength; i14++) {
                                            if (i14 != 0) {
                                                codedInputByteBufferNano.readTag();
                                            }
                                            int int323 = codedInputByteBufferNano.readInt32();
                                            if (int323 == 1 || int323 == 2) {
                                                iArr3[i13] = int323;
                                                i13++;
                                            }
                                        }
                                        if (i13 != 0) {
                                            int[] iArr4 = this.f378434f;
                                            int length2 = iArr4 == null ? 0 : iArr4.length;
                                            if (length2 == 0 && i13 == repeatedFieldArrayLength) {
                                                this.f378434f = iArr3;
                                            } else {
                                                int[] iArr5 = new int[length2 + i13];
                                                if (length2 != 0) {
                                                    System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                                }
                                                System.arraycopy(iArr3, 0, iArr5, length2, i13);
                                                this.f378434f = iArr5;
                                            }
                                        }
                                    }
                                } else {
                                    this.f378433e = codedInputByteBufferNano.readInt64();
                                }
                            } else {
                                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                                a[] aVarArr = this.f378432d;
                                int length3 = aVarArr == null ? 0 : aVarArr.length;
                                int i15 = repeatedFieldArrayLength2 + length3;
                                a[] aVarArr2 = new a[i15];
                                if (length3 != 0) {
                                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length3);
                                }
                                while (length3 < i15 - 1) {
                                    a aVar = new a();
                                    aVarArr2[length3] = aVar;
                                    codedInputByteBufferNano.readMessage(aVar);
                                    codedInputByteBufferNano.readTag();
                                    length3++;
                                }
                                a aVar2 = new a();
                                aVarArr2[length3] = aVar2;
                                codedInputByteBufferNano.readMessage(aVar2);
                                this.f378432d = aVarArr2;
                            }
                        } else {
                            this.f378431c = codedInputByteBufferNano.readString();
                        }
                    } else {
                        this.f378430b = codedInputByteBufferNano.readString();
                    }
                } else {
                    this.f378429a = codedInputByteBufferNano.readString();
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f378429a);
            codedOutputByteBufferNano.writeString(2, this.f378430b);
            codedOutputByteBufferNano.writeString(3, this.f378431c);
            a[] aVarArr = this.f378432d;
            int i12 = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i13 = 0;
                while (true) {
                    a[] aVarArr2 = this.f378432d;
                    if (i13 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i13];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, aVar);
                    }
                    i13++;
                }
            }
            codedOutputByteBufferNano.writeInt64(5, this.f378433e);
            int[] iArr = this.f378434f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f378434f;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(6, iArr2[i12]);
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class p extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378438a;

        /* renamed from: b, reason: collision with root package name */
        public long f378439b;

        /* renamed from: c, reason: collision with root package name */
        public long f378440c;

        /* renamed from: d, reason: collision with root package name */
        public long f378441d;

        public p() {
            a();
        }

        public p a() {
            this.f378438a = 432000000L;
            this.f378439b = 86400000L;
            this.f378440c = 10000L;
            this.f378441d = 3600000L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            long j12 = this.f378438a;
            if (j12 != 432000000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j12);
            }
            long j13 = this.f378439b;
            if (j13 != 86400000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j13);
            }
            long j14 = this.f378440c;
            if (j14 != 10000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j14);
            }
            long j15 = this.f378441d;
            return j15 != 3600000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j15) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378438a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f378439b = codedInputByteBufferNano.readInt64();
                } else if (tag == 24) {
                    this.f378440c = codedInputByteBufferNano.readInt64();
                } else if (tag == 32) {
                    this.f378441d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            long j12 = this.f378438a;
            if (j12 != 432000000) {
                codedOutputByteBufferNano.writeInt64(1, j12);
            }
            long j13 = this.f378439b;
            if (j13 != 86400000) {
                codedOutputByteBufferNano.writeInt64(2, j13);
            }
            long j14 = this.f378440c;
            if (j14 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j14);
            }
            long j15 = this.f378441d;
            if (j15 != 3600000) {
                codedOutputByteBufferNano.writeInt64(4, j15);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class q extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378442a;

        /* renamed from: b, reason: collision with root package name */
        public String f378443b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f378444c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f378445d;

        /* renamed from: e, reason: collision with root package name */
        public long f378446e;

        /* renamed from: f, reason: collision with root package name */
        public int f378447f;

        /* renamed from: g, reason: collision with root package name */
        public long f378448g;

        /* renamed from: h, reason: collision with root package name */
        public long f378449h;

        /* renamed from: i, reason: collision with root package name */
        public long f378450i;

        /* renamed from: j, reason: collision with root package name */
        public long f378451j;

        public q() {
            a();
        }

        public q a() {
            this.f378442a = 0L;
            this.f378443b = "";
            int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
            this.f378444c = iArr;
            this.f378445d = iArr;
            this.f378446e = 259200L;
            this.f378447f = 10;
            this.f378448g = 43200L;
            this.f378449h = 3600L;
            this.f378450i = 86400L;
            this.f378451j = 30L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int[] iArr;
            int[] iArr2;
            int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f378443b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f378442a) + super.computeSerializedSize();
            int[] iArr3 = this.f378444c;
            int i12 = 0;
            if (iArr3 != null && iArr3.length > 0) {
                int i13 = 0;
                int iComputeInt32SizeNoTag = 0;
                while (true) {
                    iArr2 = this.f378444c;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i13]);
                    i13++;
                }
                iComputeStringSize = iComputeStringSize + iComputeInt32SizeNoTag + iArr2.length;
            }
            int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(5, this.f378447f) + CodedOutputByteBufferNano.computeInt64Size(4, this.f378446e) + iComputeStringSize;
            long j12 = this.f378448g;
            if (j12 != 43200) {
                iComputeInt32Size += CodedOutputByteBufferNano.computeInt64Size(6, j12);
            }
            long j13 = this.f378449h;
            if (j13 != 3600) {
                iComputeInt32Size += CodedOutputByteBufferNano.computeInt64Size(7, j13);
            }
            long j14 = this.f378450i;
            if (j14 != 86400) {
                iComputeInt32Size += CodedOutputByteBufferNano.computeInt64Size(8, j14);
            }
            int[] iArr4 = this.f378445d;
            if (iArr4 != null && iArr4.length > 0) {
                int iComputeInt32SizeNoTag2 = 0;
                while (true) {
                    iArr = this.f378445d;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    iComputeInt32SizeNoTag2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i12]);
                    i12++;
                }
                iComputeInt32Size = iComputeInt32Size + iComputeInt32SizeNoTag2 + iArr.length;
            }
            long j15 = this.f378451j;
            return j15 != 30 ? iComputeInt32Size + CodedOutputByteBufferNano.computeInt64Size(10, j15) : iComputeInt32Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        this.f378442a = codedInputByteBufferNano.readInt64();
                        break;
                    case 18:
                        this.f378443b = codedInputByteBufferNano.readString();
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 24);
                        int[] iArr = this.f378444c;
                        int length = iArr == null ? 0 : iArr.length;
                        int i12 = repeatedFieldArrayLength + length;
                        int[] iArr2 = new int[i12];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i12 - 1) {
                            iArr2[length] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        iArr2[length] = codedInputByteBufferNano.readInt32();
                        this.f378444c = iArr2;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i13 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i13++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr3 = this.f378444c;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i14 = i13 + length2;
                        int[] iArr4 = new int[i14];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i14) {
                            iArr4[length2] = codedInputByteBufferNano.readInt32();
                            length2++;
                        }
                        this.f378444c = iArr4;
                        codedInputByteBufferNano.popLimit(iPushLimit);
                        break;
                    case 32:
                        this.f378446e = codedInputByteBufferNano.readInt64();
                        break;
                    case 40:
                        this.f378447f = codedInputByteBufferNano.readInt32();
                        break;
                    case 48:
                        this.f378448g = codedInputByteBufferNano.readInt64();
                        break;
                    case 56:
                        this.f378449h = codedInputByteBufferNano.readInt64();
                        break;
                    case 64:
                        this.f378450i = codedInputByteBufferNano.readInt64();
                        break;
                    case 72:
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 72);
                        int[] iArr5 = this.f378445d;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i15 = repeatedFieldArrayLength2 + length3;
                        int[] iArr6 = new int[i15];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i15 - 1) {
                            iArr6[length3] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length3++;
                        }
                        iArr6[length3] = codedInputByteBufferNano.readInt32();
                        this.f378445d = iArr6;
                        break;
                    case 74:
                        int iPushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position2 = codedInputByteBufferNano.getPosition();
                        int i16 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i16++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position2);
                        int[] iArr7 = this.f378445d;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i17 = i16 + length4;
                        int[] iArr8 = new int[i17];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i17) {
                            iArr8[length4] = codedInputByteBufferNano.readInt32();
                            length4++;
                        }
                        this.f378445d = iArr8;
                        codedInputByteBufferNano.popLimit(iPushLimit2);
                        break;
                    case 80:
                        this.f378451j = codedInputByteBufferNano.readInt64();
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
            codedOutputByteBufferNano.writeInt64(1, this.f378442a);
            codedOutputByteBufferNano.writeString(2, this.f378443b);
            int[] iArr = this.f378444c;
            int i12 = 0;
            if (iArr != null && iArr.length > 0) {
                int i13 = 0;
                while (true) {
                    int[] iArr2 = this.f378444c;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(3, iArr2[i13]);
                    i13++;
                }
            }
            codedOutputByteBufferNano.writeInt64(4, this.f378446e);
            codedOutputByteBufferNano.writeInt32(5, this.f378447f);
            long j12 = this.f378448g;
            if (j12 != 43200) {
                codedOutputByteBufferNano.writeInt64(6, j12);
            }
            long j13 = this.f378449h;
            if (j13 != 3600) {
                codedOutputByteBufferNano.writeInt64(7, j13);
            }
            long j14 = this.f378450i;
            if (j14 != 86400) {
                codedOutputByteBufferNano.writeInt64(8, j14);
            }
            int[] iArr3 = this.f378445d;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f378445d;
                    if (i12 >= iArr4.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(9, iArr4[i12]);
                    i12++;
                }
            }
            long j15 = this.f378451j;
            if (j15 != 30) {
                codedOutputByteBufferNano.writeInt64(10, j15);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class r extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public int f378452a;

        public r() {
            a();
        }

        public r a() {
            this.f378452a = 86400;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i12 = this.f378452a;
            return i12 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378452a = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            int i12 = this.f378452a;
            if (i12 != 86400) {
                codedOutputByteBufferNano.writeUInt32(1, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class s extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f378453a;

        public s() {
            a();
        }

        public s a() {
            this.f378453a = 18000000L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeInt64Size(1, this.f378453a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378453a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt64(1, this.f378453a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class t extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public u f378454a;

        /* renamed from: b, reason: collision with root package name */
        public u f378455b;

        public t() {
            a();
        }

        public t a() {
            this.f378454a = null;
            this.f378455b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            u uVar = this.f378454a;
            if (uVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, uVar);
            }
            u uVar2 = this.f378455b;
            return uVar2 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, uVar2) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f378454a == null) {
                        this.f378454a = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f378454a);
                } else if (tag == 18) {
                    if (this.f378455b == null) {
                        this.f378455b = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f378455b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            u uVar = this.f378454a;
            if (uVar != null) {
                codedOutputByteBufferNano.writeMessage(1, uVar);
            }
            u uVar2 = this.f378455b;
            if (uVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, uVar2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class u extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public int f378456a;

        /* renamed from: b, reason: collision with root package name */
        public long f378457b;

        public u() {
            a();
        }

        public u a() {
            this.f378456a = 100;
            this.f378457b = 60L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i12 = this.f378456a;
            if (i12 != 100) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i12);
            }
            long j12 = this.f378457b;
            return j12 != 60 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378456a = codedInputByteBufferNano.readInt32();
                } else if (tag == 16) {
                    this.f378457b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            int i12 = this.f378456a;
            if (i12 != 100) {
                codedOutputByteBufferNano.writeInt32(1, i12);
            }
            long j12 = this.f378457b;
            if (j12 != 60) {
                codedOutputByteBufferNano.writeInt64(2, j12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class v extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public boolean f378458a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f378459b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f378460c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f378461d;

        /* renamed from: e, reason: collision with root package name */
        public int f378462e;

        /* renamed from: f, reason: collision with root package name */
        public int f378463f;

        /* renamed from: g, reason: collision with root package name */
        public int f378464g;

        /* renamed from: h, reason: collision with root package name */
        public int f378465h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f378466i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f378467j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f378468k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f378469l;

        /* renamed from: m, reason: collision with root package name */
        public y[] f378470m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f378471n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f378472o;

        /* renamed from: p, reason: collision with root package name */
        public int f378473p;

        public v() {
            a();
        }

        public v a() {
            this.f378458a = true;
            this.f378459b = true;
            this.f378460c = true;
            this.f378461d = true;
            this.f378462e = 10000;
            this.f378463f = 1000;
            this.f378464g = 1000;
            this.f378465h = 200000;
            this.f378466i = false;
            this.f378467j = false;
            this.f378468k = false;
            this.f378469l = false;
            this.f378470m = y.b();
            this.f378471n = false;
            this.f378472o = false;
            this.f378473p = 4000;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            boolean z12 = this.f378458a;
            if (!z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z12);
            }
            boolean z13 = this.f378459b;
            if (!z13) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, z13);
            }
            boolean z14 = this.f378460c;
            if (!z14) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z14);
            }
            boolean z15 = this.f378461d;
            if (!z15) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z15);
            }
            int i12 = this.f378462e;
            if (i12 != 10000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i12);
            }
            int i13 = this.f378463f;
            if (i13 != 1000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i13);
            }
            int i14 = this.f378464g;
            if (i14 != 1000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i14);
            }
            int i15 = this.f378465h;
            if (i15 != 200000) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i15);
            }
            boolean z16 = this.f378466i;
            if (z16) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(9, z16);
            }
            boolean z17 = this.f378467j;
            if (z17) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, z17);
            }
            boolean z18 = this.f378468k;
            if (z18) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, z18);
            }
            boolean z19 = this.f378469l;
            if (z19) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(12, z19);
            }
            y[] yVarArr = this.f378470m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i16 = 0;
                while (true) {
                    y[] yVarArr2 = this.f378470m;
                    if (i16 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i16];
                    if (yVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(13, yVar) + iComputeSerializedSize;
                    }
                    i16++;
                }
            }
            boolean z22 = this.f378471n;
            if (z22) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(14, z22);
            }
            boolean z23 = this.f378472o;
            if (z23) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(15, z23);
            }
            int i17 = this.f378473p;
            return i17 != 4000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(16, i17) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        this.f378458a = codedInputByteBufferNano.readBool();
                        break;
                    case 16:
                        this.f378459b = codedInputByteBufferNano.readBool();
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        this.f378460c = codedInputByteBufferNano.readBool();
                        break;
                    case 32:
                        this.f378461d = codedInputByteBufferNano.readBool();
                        break;
                    case 40:
                        this.f378462e = codedInputByteBufferNano.readInt32();
                        break;
                    case 48:
                        this.f378463f = codedInputByteBufferNano.readInt32();
                        break;
                    case 56:
                        this.f378464g = codedInputByteBufferNano.readInt32();
                        break;
                    case 64:
                        this.f378465h = codedInputByteBufferNano.readInt32();
                        break;
                    case 72:
                        this.f378466i = codedInputByteBufferNano.readBool();
                        break;
                    case 80:
                        this.f378467j = codedInputByteBufferNano.readBool();
                        break;
                    case 88:
                        this.f378468k = codedInputByteBufferNano.readBool();
                        break;
                    case 96:
                        this.f378469l = codedInputByteBufferNano.readBool();
                        break;
                    case 106:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 106);
                        y[] yVarArr = this.f378470m;
                        int length = yVarArr == null ? 0 : yVarArr.length;
                        int i12 = repeatedFieldArrayLength + length;
                        y[] yVarArr2 = new y[i12];
                        if (length != 0) {
                            System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                        }
                        while (length < i12 - 1) {
                            y yVar = new y();
                            yVarArr2[length] = yVar;
                            codedInputByteBufferNano.readMessage(yVar);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        y yVar2 = new y();
                        yVarArr2[length] = yVar2;
                        codedInputByteBufferNano.readMessage(yVar2);
                        this.f378470m = yVarArr2;
                        break;
                    case 112:
                        this.f378471n = codedInputByteBufferNano.readBool();
                        break;
                    case 120:
                        this.f378472o = codedInputByteBufferNano.readBool();
                        break;
                    case 128:
                        this.f378473p = codedInputByteBufferNano.readInt32();
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
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            boolean z12 = this.f378458a;
            if (!z12) {
                codedOutputByteBufferNano.writeBool(1, z12);
            }
            boolean z13 = this.f378459b;
            if (!z13) {
                codedOutputByteBufferNano.writeBool(2, z13);
            }
            boolean z14 = this.f378460c;
            if (!z14) {
                codedOutputByteBufferNano.writeBool(3, z14);
            }
            boolean z15 = this.f378461d;
            if (!z15) {
                codedOutputByteBufferNano.writeBool(4, z15);
            }
            int i12 = this.f378462e;
            if (i12 != 10000) {
                codedOutputByteBufferNano.writeInt32(5, i12);
            }
            int i13 = this.f378463f;
            if (i13 != 1000) {
                codedOutputByteBufferNano.writeInt32(6, i13);
            }
            int i14 = this.f378464g;
            if (i14 != 1000) {
                codedOutputByteBufferNano.writeInt32(7, i14);
            }
            int i15 = this.f378465h;
            if (i15 != 200000) {
                codedOutputByteBufferNano.writeInt32(8, i15);
            }
            boolean z16 = this.f378466i;
            if (z16) {
                codedOutputByteBufferNano.writeBool(9, z16);
            }
            boolean z17 = this.f378467j;
            if (z17) {
                codedOutputByteBufferNano.writeBool(10, z17);
            }
            boolean z18 = this.f378468k;
            if (z18) {
                codedOutputByteBufferNano.writeBool(11, z18);
            }
            boolean z19 = this.f378469l;
            if (z19) {
                codedOutputByteBufferNano.writeBool(12, z19);
            }
            y[] yVarArr = this.f378470m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i16 = 0;
                while (true) {
                    y[] yVarArr2 = this.f378470m;
                    if (i16 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i16];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(13, yVar);
                    }
                    i16++;
                }
            }
            boolean z22 = this.f378471n;
            if (z22) {
                codedOutputByteBufferNano.writeBool(14, z22);
            }
            boolean z23 = this.f378472o;
            if (z23) {
                codedOutputByteBufferNano.writeBool(15, z23);
            }
            int i17 = this.f378473p;
            if (i17 != 4000) {
                codedOutputByteBufferNano.writeInt32(16, i17);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class w extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public int f378474a;

        /* renamed from: b, reason: collision with root package name */
        public int f378475b;

        /* renamed from: c, reason: collision with root package name */
        public int f378476c;

        /* renamed from: d, reason: collision with root package name */
        public long f378477d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f378478e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f378479f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f378480g;

        /* renamed from: h, reason: collision with root package name */
        public y[] f378481h;

        public w() {
            a();
        }

        public w a() {
            this.f378474a = 10000;
            this.f378475b = 1000;
            this.f378476c = 100;
            this.f378477d = 5000L;
            this.f378478e = true;
            this.f378479f = false;
            this.f378480g = true;
            this.f378481h = y.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(7, this.f378480g) + CodedOutputByteBufferNano.computeBoolSize(6, this.f378479f) + CodedOutputByteBufferNano.computeBoolSize(5, this.f378478e) + CodedOutputByteBufferNano.computeInt64Size(4, this.f378477d) + CodedOutputByteBufferNano.computeInt32Size(3, this.f378476c) + CodedOutputByteBufferNano.computeInt32Size(2, this.f378475b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f378474a) + super.computeSerializedSize();
            y[] yVarArr = this.f378481h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    y[] yVarArr2 = this.f378481h;
                    if (i12 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i12];
                    if (yVar != null) {
                        iComputeBoolSize = CodedOutputByteBufferNano.computeMessageSize(8, yVar) + iComputeBoolSize;
                    }
                    i12++;
                }
            }
            return iComputeBoolSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378474a = codedInputByteBufferNano.readInt32();
                } else if (tag == 16) {
                    this.f378475b = codedInputByteBufferNano.readInt32();
                } else if (tag == 24) {
                    this.f378476c = codedInputByteBufferNano.readInt32();
                } else if (tag == 32) {
                    this.f378477d = codedInputByteBufferNano.readInt64();
                } else if (tag == 40) {
                    this.f378478e = codedInputByteBufferNano.readBool();
                } else if (tag == 48) {
                    this.f378479f = codedInputByteBufferNano.readBool();
                } else if (tag == 56) {
                    this.f378480g = codedInputByteBufferNano.readBool();
                } else if (tag == 66) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    y[] yVarArr = this.f378481h;
                    int length = yVarArr == null ? 0 : yVarArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    y[] yVarArr2 = new y[i12];
                    if (length != 0) {
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        y yVar = new y();
                        yVarArr2[length] = yVar;
                        codedInputByteBufferNano.readMessage(yVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    y yVar2 = new y();
                    yVarArr2[length] = yVar2;
                    codedInputByteBufferNano.readMessage(yVar2);
                    this.f378481h = yVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt32(1, this.f378474a);
            codedOutputByteBufferNano.writeInt32(2, this.f378475b);
            codedOutputByteBufferNano.writeInt32(3, this.f378476c);
            codedOutputByteBufferNano.writeInt64(4, this.f378477d);
            codedOutputByteBufferNano.writeBool(5, this.f378478e);
            codedOutputByteBufferNano.writeBool(6, this.f378479f);
            codedOutputByteBufferNano.writeBool(7, this.f378480g);
            y[] yVarArr = this.f378481h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    y[] yVarArr2 = this.f378481h;
                    if (i12 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i12];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(8, yVar);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class x extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public boolean f378482a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f378483b;

        public x() {
            a();
        }

        public x a() {
            this.f378482a = true;
            this.f378483b = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeBoolSize(2, this.f378483b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f378482a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f378482a = codedInputByteBufferNano.readBool();
                } else if (tag == 16) {
                    this.f378483b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeBool(1, this.f378482a);
            codedOutputByteBufferNano.writeBool(2, this.f378483b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class y extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile y[] f378484c;

        /* renamed from: a, reason: collision with root package name */
        public int f378485a;

        /* renamed from: b, reason: collision with root package name */
        public String f378486b;

        public y() {
            a();
        }

        public static y[] b() {
            if (f378484c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378484c == null) {
                            f378484c = new y[0];
                        }
                    } finally {
                    }
                }
            }
            return f378484c;
        }

        public y a() {
            this.f378485a = 0;
            this.f378486b = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeStringSize(2, this.f378486b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f378485a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f378485a = int32;
                    }
                } else if (tag == 18) {
                    this.f378486b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeInt32(1, this.f378485a);
            codedOutputByteBufferNano.writeString(2, this.f378486b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public If() {
        a();
    }

    public If a() {
        this.f378311a = "";
        this.f378312b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f378313c = strArr;
        this.f378314d = "";
        this.f378315e = "";
        this.f378316f = strArr;
        this.f378317g = strArr;
        this.f378318h = strArr;
        this.f378319i = strArr;
        this.f378320j = d.b();
        this.f378321k = null;
        this.f378322l = k.b();
        this.f378323m = null;
        this.f378324n = o.b();
        this.f378325o = "";
        this.f378326p = "";
        this.f378327q = "";
        this.f378328r = false;
        this.f378329s = "";
        this.f378330t = strArr;
        this.f378331u = null;
        this.f378332v = false;
        this.f378333w = m.b();
        this.f378334x = null;
        this.f378335y = "";
        this.f378336z = "";
        this.f378288A = "";
        this.f378289B = "";
        this.f378290C = 0L;
        this.f378291D = 0L;
        this.f378292E = false;
        this.f378293F = null;
        this.f378294G = null;
        this.f378295H = 600;
        this.f378296I = 1;
        this.f378297J = null;
        this.f378298K = null;
        this.f378299L = null;
        this.f378300M = null;
        this.f378301N = null;
        this.f378302O = null;
        this.f378303P = null;
        this.f378304Q = strArr;
        this.f378305R = null;
        this.f378306S = null;
        this.f378307T = null;
        this.f378308U = null;
        this.f378309V = null;
        this.f378310W = l.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f378311a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f378311a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(3, this.f378312b) + iComputeSerializedSize;
        String[] strArr = this.f378313c;
        int i12 = 0;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            int iComputeStringSizeNoTag = 0;
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f378313c;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    i14++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i13++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i14;
        }
        if (!this.f378314d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f378314d);
        }
        if (!this.f378315e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(6, this.f378315e);
        }
        String[] strArr3 = this.f378316f;
        if (strArr3 != null && strArr3.length > 0) {
            int i15 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr4 = this.f378316f;
                if (i15 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i15];
                if (str2 != null) {
                    i16++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i15++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i16;
        }
        String[] strArr5 = this.f378317g;
        if (strArr5 != null && strArr5.length > 0) {
            int i17 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr6 = this.f378317g;
                if (i17 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i17];
                if (str3 != null) {
                    i18++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i17++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i18;
        }
        String[] strArr7 = this.f378318h;
        if (strArr7 != null && strArr7.length > 0) {
            int i19 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i22 = 0;
            while (true) {
                String[] strArr8 = this.f378318h;
                if (i19 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i19];
                if (str4 != null) {
                    i22++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i19++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag4 + i22;
        }
        i iVar = this.f378321k;
        if (iVar != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(10, iVar);
        }
        k[] kVarArr = this.f378322l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i23 = 0;
            while (true) {
                k[] kVarArr2 = this.f378322l;
                if (i23 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i23];
                if (kVar != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(11, kVar) + iComputeInt64Size;
                }
                i23++;
            }
        }
        q qVar = this.f378323m;
        if (qVar != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(13, qVar);
        }
        o[] oVarArr = this.f378324n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i24 = 0;
            while (true) {
                o[] oVarArr2 = this.f378324n;
                if (i24 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i24];
                if (oVar != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(14, oVar) + iComputeInt64Size;
                }
                i24++;
            }
        }
        if (!this.f378325o.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(15, this.f378325o);
        }
        if (!this.f378326p.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(16, this.f378326p);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(17, this.f378328r) + iComputeInt64Size;
        if (!this.f378329s.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(19, this.f378329s);
        }
        String[] strArr9 = this.f378330t;
        if (strArr9 != null && strArr9.length > 0) {
            int i25 = 0;
            int iComputeStringSizeNoTag5 = 0;
            int i26 = 0;
            while (true) {
                String[] strArr10 = this.f378330t;
                if (i25 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i25];
                if (str5 != null) {
                    i26++;
                    iComputeStringSizeNoTag5 += CodedOutputByteBufferNano.computeStringSizeNoTag(str5);
                }
                i25++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag5 + (i26 * 2);
        }
        s sVar = this.f378331u;
        if (sVar != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(21, sVar);
        }
        boolean z12 = this.f378332v;
        if (z12) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(22, z12);
        }
        m[] mVarArr = this.f378333w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i27 = 0;
            while (true) {
                m[] mVarArr2 = this.f378333w;
                if (i27 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i27];
                if (mVar != null) {
                    iComputeBoolSize = CodedOutputByteBufferNano.computeMessageSize(23, mVar) + iComputeBoolSize;
                }
                i27++;
            }
        }
        p pVar = this.f378334x;
        if (pVar != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(24, pVar);
        }
        if (!this.f378335y.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(25, this.f378335y);
        }
        if (!this.f378336z.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(26, this.f378336z);
        }
        if (!this.f378288A.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(27, this.f378288A);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(29, this.f378291D) + CodedOutputByteBufferNano.computeInt64Size(28, this.f378290C) + iComputeBoolSize;
        boolean z13 = this.f378292E;
        if (z13) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(30, z13);
        }
        n nVar = this.f378293F;
        if (nVar != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(32, nVar);
        }
        j jVar = this.f378294G;
        if (jVar != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(33, jVar);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(36, this.f378296I) + CodedOutputByteBufferNano.computeInt32Size(35, this.f378295H) + iComputeInt64Size2;
        w wVar = this.f378297J;
        if (wVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(37, wVar);
        }
        v vVar = this.f378298K;
        if (vVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(38, vVar);
        }
        v vVar2 = this.f378299L;
        if (vVar2 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(39, vVar2);
        }
        t tVar = this.f378301N;
        if (tVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(41, tVar);
        }
        c cVar = this.f378302O;
        if (cVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(42, cVar);
        }
        v vVar3 = this.f378300M;
        if (vVar3 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(43, vVar3);
        }
        if (!this.f378327q.equals("")) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeStringSize(44, this.f378327q);
        }
        f fVar = this.f378303P;
        if (fVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(45, fVar);
        }
        String[] strArr11 = this.f378319i;
        if (strArr11 != null && strArr11.length > 0) {
            int i28 = 0;
            int iComputeStringSizeNoTag6 = 0;
            int i29 = 0;
            while (true) {
                String[] strArr12 = this.f378319i;
                if (i28 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i28];
                if (str6 != null) {
                    i29++;
                    iComputeStringSizeNoTag6 += CodedOutputByteBufferNano.computeStringSizeNoTag(str6);
                }
                i28++;
            }
            iComputeInt32Size = iComputeInt32Size + iComputeStringSizeNoTag6 + (i29 * 2);
        }
        String[] strArr13 = this.f378304Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i32 = 0;
            int iComputeStringSizeNoTag7 = 0;
            int i33 = 0;
            while (true) {
                String[] strArr14 = this.f378304Q;
                if (i32 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i32];
                if (str7 != null) {
                    i33++;
                    iComputeStringSizeNoTag7 += CodedOutputByteBufferNano.computeStringSizeNoTag(str7);
                }
                i32++;
            }
            iComputeInt32Size = iComputeInt32Size + iComputeStringSizeNoTag7 + (i33 * 2);
        }
        b bVar = this.f378305R;
        if (bVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(48, bVar);
        }
        if (!this.f378289B.equals("")) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeStringSize(49, this.f378289B);
        }
        a aVar = this.f378306S;
        if (aVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(51, aVar);
        }
        h hVar = this.f378307T;
        if (hVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(52, hVar);
        }
        g gVar = this.f378308U;
        if (gVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(53, gVar);
        }
        d[] dVarArr = this.f378320j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i34 = 0;
            while (true) {
                d[] dVarArr2 = this.f378320j;
                if (i34 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i34];
                if (dVar != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(54, dVar) + iComputeInt32Size;
                }
                i34++;
            }
        }
        r rVar = this.f378309V;
        if (rVar != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(55, rVar);
        }
        l[] lVarArr = this.f378310W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                l[] lVarArr2 = this.f378310W;
                if (i12 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i12];
                if (lVar != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(56, lVar) + iComputeInt32Size;
                }
                i12++;
            }
        }
        return iComputeInt32Size;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f378311a = codedInputByteBufferNano.readString();
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    this.f378312b = codedInputByteBufferNano.readInt64();
                    break;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    String[] strArr = this.f378313c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i12];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f378313c = strArr2;
                    break;
                case 42:
                    this.f378314d = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f378315e = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr3 = this.f378316f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i13 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i13];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i13 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f378316f = strArr4;
                    break;
                case 66:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    String[] strArr5 = this.f378317g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i14 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i14];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i14 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f378317g = strArr6;
                    break;
                case 74:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    String[] strArr7 = this.f378318h;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i15 = repeatedFieldArrayLength4 + length4;
                    String[] strArr8 = new String[i15];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i15 - 1) {
                        strArr8[length4] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    strArr8[length4] = codedInputByteBufferNano.readString();
                    this.f378318h = strArr8;
                    break;
                case 82:
                    if (this.f378321k == null) {
                        this.f378321k = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f378321k);
                    break;
                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    k[] kVarArr = this.f378322l;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i16 = repeatedFieldArrayLength5 + length5;
                    k[] kVarArr2 = new k[i16];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i16 - 1) {
                        k kVar = new k();
                        kVarArr2[length5] = kVar;
                        codedInputByteBufferNano.readMessage(kVar);
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    k kVar2 = new k();
                    kVarArr2[length5] = kVar2;
                    codedInputByteBufferNano.readMessage(kVar2);
                    this.f378322l = kVarArr2;
                    break;
                case 106:
                    if (this.f378323m == null) {
                        this.f378323m = new q();
                    }
                    codedInputByteBufferNano.readMessage(this.f378323m);
                    break;
                case 114:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 114);
                    o[] oVarArr = this.f378324n;
                    int length6 = oVarArr == null ? 0 : oVarArr.length;
                    int i17 = repeatedFieldArrayLength6 + length6;
                    o[] oVarArr2 = new o[i17];
                    if (length6 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length6);
                    }
                    while (length6 < i17 - 1) {
                        o oVar = new o();
                        oVarArr2[length6] = oVar;
                        codedInputByteBufferNano.readMessage(oVar);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    o oVar2 = new o();
                    oVarArr2[length6] = oVar2;
                    codedInputByteBufferNano.readMessage(oVar2);
                    this.f378324n = oVarArr2;
                    break;
                case 122:
                    this.f378325o = codedInputByteBufferNano.readString();
                    break;
                case 130:
                    this.f378326p = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f378328r = codedInputByteBufferNano.readBool();
                    break;
                case 154:
                    this.f378329s = codedInputByteBufferNano.readString();
                    break;
                case 162:
                    int repeatedFieldArrayLength7 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 162);
                    String[] strArr9 = this.f378330t;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i18 = repeatedFieldArrayLength7 + length7;
                    String[] strArr10 = new String[i18];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i18 - 1) {
                        strArr10[length7] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length7++;
                    }
                    strArr10[length7] = codedInputByteBufferNano.readString();
                    this.f378330t = strArr10;
                    break;
                case 170:
                    if (this.f378331u == null) {
                        this.f378331u = new s();
                    }
                    codedInputByteBufferNano.readMessage(this.f378331u);
                    break;
                case 176:
                    this.f378332v = codedInputByteBufferNano.readBool();
                    break;
                case 186:
                    int repeatedFieldArrayLength8 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    m[] mVarArr = this.f378333w;
                    int length8 = mVarArr == null ? 0 : mVarArr.length;
                    int i19 = repeatedFieldArrayLength8 + length8;
                    m[] mVarArr2 = new m[i19];
                    if (length8 != 0) {
                        System.arraycopy(mVarArr, 0, mVarArr2, 0, length8);
                    }
                    while (length8 < i19 - 1) {
                        m mVar = new m();
                        mVarArr2[length8] = mVar;
                        codedInputByteBufferNano.readMessage(mVar);
                        codedInputByteBufferNano.readTag();
                        length8++;
                    }
                    m mVar2 = new m();
                    mVarArr2[length8] = mVar2;
                    codedInputByteBufferNano.readMessage(mVar2);
                    this.f378333w = mVarArr2;
                    break;
                case 194:
                    if (this.f378334x == null) {
                        this.f378334x = new p();
                    }
                    codedInputByteBufferNano.readMessage(this.f378334x);
                    break;
                case 202:
                    this.f378335y = codedInputByteBufferNano.readString();
                    break;
                case 210:
                    this.f378336z = codedInputByteBufferNano.readString();
                    break;
                case JfifUtil.MARKER_SOS /* 218 */:
                    this.f378288A = codedInputByteBufferNano.readString();
                    break;
                case 224:
                    this.f378290C = codedInputByteBufferNano.readInt64();
                    break;
                case 232:
                    this.f378291D = codedInputByteBufferNano.readInt64();
                    break;
                case 240:
                    this.f378292E = codedInputByteBufferNano.readBool();
                    break;
                case 258:
                    if (this.f378293F == null) {
                        this.f378293F = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f378293F);
                    break;
                case 266:
                    if (this.f378294G == null) {
                        this.f378294G = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f378294G);
                    break;
                case 280:
                    this.f378295H = codedInputByteBufferNano.readInt32();
                    break;
                case 288:
                    this.f378296I = codedInputByteBufferNano.readInt32();
                    break;
                case 298:
                    if (this.f378297J == null) {
                        this.f378297J = new w();
                    }
                    codedInputByteBufferNano.readMessage(this.f378297J);
                    break;
                case 306:
                    if (this.f378298K == null) {
                        this.f378298K = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.f378298K);
                    break;
                case 314:
                    if (this.f378299L == null) {
                        this.f378299L = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.f378299L);
                    break;
                case 330:
                    if (this.f378301N == null) {
                        this.f378301N = new t();
                    }
                    codedInputByteBufferNano.readMessage(this.f378301N);
                    break;
                case 338:
                    if (this.f378302O == null) {
                        this.f378302O = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f378302O);
                    break;
                case 346:
                    if (this.f378300M == null) {
                        this.f378300M = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.f378300M);
                    break;
                case 354:
                    this.f378327q = codedInputByteBufferNano.readString();
                    break;
                case 362:
                    if (this.f378303P == null) {
                        this.f378303P = new f();
                    }
                    codedInputByteBufferNano.readMessage(this.f378303P);
                    break;
                case 370:
                    int repeatedFieldArrayLength9 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 370);
                    String[] strArr11 = this.f378319i;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i22 = repeatedFieldArrayLength9 + length9;
                    String[] strArr12 = new String[i22];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i22 - 1) {
                        strArr12[length9] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length9++;
                    }
                    strArr12[length9] = codedInputByteBufferNano.readString();
                    this.f378319i = strArr12;
                    break;
                case 378:
                    int repeatedFieldArrayLength10 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 378);
                    String[] strArr13 = this.f378304Q;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i23 = repeatedFieldArrayLength10 + length10;
                    String[] strArr14 = new String[i23];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i23 - 1) {
                        strArr14[length10] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length10++;
                    }
                    strArr14[length10] = codedInputByteBufferNano.readString();
                    this.f378304Q = strArr14;
                    break;
                case 386:
                    if (this.f378305R == null) {
                        this.f378305R = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f378305R);
                    break;
                case 394:
                    this.f378289B = codedInputByteBufferNano.readString();
                    break;
                case 410:
                    if (this.f378306S == null) {
                        this.f378306S = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f378306S);
                    break;
                case 418:
                    if (this.f378307T == null) {
                        this.f378307T = new h();
                    }
                    codedInputByteBufferNano.readMessage(this.f378307T);
                    break;
                case 426:
                    if (this.f378308U == null) {
                        this.f378308U = new g();
                    }
                    codedInputByteBufferNano.readMessage(this.f378308U);
                    break;
                case 434:
                    int repeatedFieldArrayLength11 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 434);
                    d[] dVarArr = this.f378320j;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i24 = repeatedFieldArrayLength11 + length11;
                    d[] dVarArr2 = new d[i24];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i24 - 1) {
                        d dVar = new d();
                        dVarArr2[length11] = dVar;
                        codedInputByteBufferNano.readMessage(dVar);
                        codedInputByteBufferNano.readTag();
                        length11++;
                    }
                    d dVar2 = new d();
                    dVarArr2[length11] = dVar2;
                    codedInputByteBufferNano.readMessage(dVar2);
                    this.f378320j = dVarArr2;
                    break;
                case 442:
                    if (this.f378309V == null) {
                        this.f378309V = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f378309V);
                    break;
                case 450:
                    int repeatedFieldArrayLength12 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 450);
                    l[] lVarArr = this.f378310W;
                    int length12 = lVarArr == null ? 0 : lVarArr.length;
                    int i25 = repeatedFieldArrayLength12 + length12;
                    l[] lVarArr2 = new l[i25];
                    if (length12 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length12);
                    }
                    while (length12 < i25 - 1) {
                        l lVar = new l();
                        lVarArr2[length12] = lVar;
                        codedInputByteBufferNano.readMessage(lVar);
                        codedInputByteBufferNano.readTag();
                        length12++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length12] = lVar2;
                    codedInputByteBufferNano.readMessage(lVar2);
                    this.f378310W = lVarArr2;
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
        if (!this.f378311a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f378311a);
        }
        codedOutputByteBufferNano.writeInt64(3, this.f378312b);
        String[] strArr = this.f378313c;
        int i12 = 0;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f378313c;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(4, str);
                }
                i13++;
            }
        }
        if (!this.f378314d.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f378314d);
        }
        if (!this.f378315e.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f378315e);
        }
        String[] strArr3 = this.f378316f;
        if (strArr3 != null && strArr3.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f378316f;
                if (i14 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i14];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(7, str2);
                }
                i14++;
            }
        }
        String[] strArr5 = this.f378317g;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr6 = this.f378317g;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(8, str3);
                }
                i15++;
            }
        }
        String[] strArr7 = this.f378318h;
        if (strArr7 != null && strArr7.length > 0) {
            int i16 = 0;
            while (true) {
                String[] strArr8 = this.f378318h;
                if (i16 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i16];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(9, str4);
                }
                i16++;
            }
        }
        i iVar = this.f378321k;
        if (iVar != null) {
            codedOutputByteBufferNano.writeMessage(10, iVar);
        }
        k[] kVarArr = this.f378322l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i17 = 0;
            while (true) {
                k[] kVarArr2 = this.f378322l;
                if (i17 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i17];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(11, kVar);
                }
                i17++;
            }
        }
        q qVar = this.f378323m;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(13, qVar);
        }
        o[] oVarArr = this.f378324n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i18 = 0;
            while (true) {
                o[] oVarArr2 = this.f378324n;
                if (i18 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i18];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(14, oVar);
                }
                i18++;
            }
        }
        if (!this.f378325o.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f378325o);
        }
        if (!this.f378326p.equals("")) {
            codedOutputByteBufferNano.writeString(16, this.f378326p);
        }
        codedOutputByteBufferNano.writeBool(17, this.f378328r);
        if (!this.f378329s.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f378329s);
        }
        String[] strArr9 = this.f378330t;
        if (strArr9 != null && strArr9.length > 0) {
            int i19 = 0;
            while (true) {
                String[] strArr10 = this.f378330t;
                if (i19 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i19];
                if (str5 != null) {
                    codedOutputByteBufferNano.writeString(20, str5);
                }
                i19++;
            }
        }
        s sVar = this.f378331u;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(21, sVar);
        }
        boolean z12 = this.f378332v;
        if (z12) {
            codedOutputByteBufferNano.writeBool(22, z12);
        }
        m[] mVarArr = this.f378333w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i22 = 0;
            while (true) {
                m[] mVarArr2 = this.f378333w;
                if (i22 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i22];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(23, mVar);
                }
                i22++;
            }
        }
        p pVar = this.f378334x;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(24, pVar);
        }
        if (!this.f378335y.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f378335y);
        }
        if (!this.f378336z.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f378336z);
        }
        if (!this.f378288A.equals("")) {
            codedOutputByteBufferNano.writeString(27, this.f378288A);
        }
        codedOutputByteBufferNano.writeInt64(28, this.f378290C);
        codedOutputByteBufferNano.writeInt64(29, this.f378291D);
        boolean z13 = this.f378292E;
        if (z13) {
            codedOutputByteBufferNano.writeBool(30, z13);
        }
        n nVar = this.f378293F;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(32, nVar);
        }
        j jVar = this.f378294G;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(33, jVar);
        }
        codedOutputByteBufferNano.writeInt32(35, this.f378295H);
        codedOutputByteBufferNano.writeInt32(36, this.f378296I);
        w wVar = this.f378297J;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(37, wVar);
        }
        v vVar = this.f378298K;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(38, vVar);
        }
        v vVar2 = this.f378299L;
        if (vVar2 != null) {
            codedOutputByteBufferNano.writeMessage(39, vVar2);
        }
        t tVar = this.f378301N;
        if (tVar != null) {
            codedOutputByteBufferNano.writeMessage(41, tVar);
        }
        c cVar = this.f378302O;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(42, cVar);
        }
        v vVar3 = this.f378300M;
        if (vVar3 != null) {
            codedOutputByteBufferNano.writeMessage(43, vVar3);
        }
        if (!this.f378327q.equals("")) {
            codedOutputByteBufferNano.writeString(44, this.f378327q);
        }
        f fVar = this.f378303P;
        if (fVar != null) {
            codedOutputByteBufferNano.writeMessage(45, fVar);
        }
        String[] strArr11 = this.f378319i;
        if (strArr11 != null && strArr11.length > 0) {
            int i23 = 0;
            while (true) {
                String[] strArr12 = this.f378319i;
                if (i23 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i23];
                if (str6 != null) {
                    codedOutputByteBufferNano.writeString(46, str6);
                }
                i23++;
            }
        }
        String[] strArr13 = this.f378304Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i24 = 0;
            while (true) {
                String[] strArr14 = this.f378304Q;
                if (i24 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i24];
                if (str7 != null) {
                    codedOutputByteBufferNano.writeString(47, str7);
                }
                i24++;
            }
        }
        b bVar = this.f378305R;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(48, bVar);
        }
        if (!this.f378289B.equals("")) {
            codedOutputByteBufferNano.writeString(49, this.f378289B);
        }
        a aVar = this.f378306S;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(51, aVar);
        }
        h hVar = this.f378307T;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(52, hVar);
        }
        g gVar = this.f378308U;
        if (gVar != null) {
            codedOutputByteBufferNano.writeMessage(53, gVar);
        }
        d[] dVarArr = this.f378320j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i25 = 0;
            while (true) {
                d[] dVarArr2 = this.f378320j;
                if (i25 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i25];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(54, dVar);
                }
                i25++;
            }
        }
        r rVar = this.f378309V;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(55, rVar);
        }
        l[] lVarArr = this.f378310W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                l[] lVarArr2 = this.f378310W;
                if (i12 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i12];
                if (lVar != null) {
                    codedOutputByteBufferNano.writeMessage(56, lVar);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
