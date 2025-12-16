package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.mf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38979mf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public int f381055a;

    /* renamed from: b, reason: collision with root package name */
    public q f381056b;

    /* renamed from: c, reason: collision with root package name */
    public o f381057c;

    /* renamed from: d, reason: collision with root package name */
    public p f381058d;

    /* renamed from: e, reason: collision with root package name */
    public b f381059e;

    /* renamed from: f, reason: collision with root package name */
    public h f381060f;

    /* renamed from: com.yandex.metrica.impl.ob.mf$a */
    public static final class a extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile a[] f381061c;

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381062a;

        /* renamed from: b, reason: collision with root package name */
        public e f381063b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f381061c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381061c == null) {
                            f381061c = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f381061c;
        }

        public a a() {
            this.f381062a = WireFormatNano.EMPTY_BYTES;
            this.f381063b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f381062a, WireFormatNano.EMPTY_BYTES)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381062a);
            }
            e eVar = this.f381063b;
            return eVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, eVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381062a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    if (this.f381063b == null) {
                        this.f381063b = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f381063b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            if (!Arrays.equals(this.f381062a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381062a);
            }
            e eVar = this.f381063b;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$b */
    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public c f381064a;

        public b() {
            a();
        }

        public b a() {
            this.f381064a = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            c cVar = this.f381064a;
            return cVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, cVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381064a == null) {
                        this.f381064a = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f381064a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            c cVar = this.f381064a;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(1, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$c */
    public static final class c extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public k f381065a;

        /* renamed from: b, reason: collision with root package name */
        public m f381066b;

        /* renamed from: c, reason: collision with root package name */
        public e f381067c;

        /* renamed from: d, reason: collision with root package name */
        public j f381068d;

        public c() {
            a();
        }

        public c a() {
            this.f381065a = null;
            this.f381066b = null;
            this.f381067c = null;
            this.f381068d = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            k kVar = this.f381065a;
            if (kVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            m mVar = this.f381066b;
            if (mVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, mVar);
            }
            e eVar = this.f381067c;
            if (eVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, eVar);
            }
            j jVar = this.f381068d;
            return jVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, jVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381065a == null) {
                        this.f381065a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f381065a);
                } else if (tag == 18) {
                    if (this.f381066b == null) {
                        this.f381066b = new m();
                    }
                    codedInputByteBufferNano.readMessage(this.f381066b);
                } else if (tag == 26) {
                    if (this.f381067c == null) {
                        this.f381067c = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f381067c);
                } else if (tag == 34) {
                    if (this.f381068d == null) {
                        this.f381068d = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f381068d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            k kVar = this.f381065a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            m mVar = this.f381066b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            e eVar = this.f381067c;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar);
            }
            j jVar = this.f381068d;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(4, jVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$d */
    public static final class d extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[][] f381069a;

        public d() {
            a();
        }

        public d a() {
            this.f381069a = WireFormatNano.EMPTY_BYTES_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[][] bArr = this.f381069a;
            if (bArr == null || bArr.length <= 0) {
                return iComputeSerializedSize;
            }
            int i12 = 0;
            int iComputeBytesSizeNoTag = 0;
            int i13 = 0;
            while (true) {
                byte[][] bArr2 = this.f381069a;
                if (i12 >= bArr2.length) {
                    return iComputeSerializedSize + iComputeBytesSizeNoTag + i13;
                }
                byte[] bArr3 = bArr2[i12];
                if (bArr3 != null) {
                    i13++;
                    iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
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
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    byte[][] bArr = this.f381069a;
                    int length = bArr == null ? 0 : bArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    byte[][] bArr2 = new byte[i12][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        bArr2[length] = codedInputByteBufferNano.readBytes();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    this.f381069a = bArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[][] bArr = this.f381069a;
            if (bArr != null && bArr.length > 0) {
                int i12 = 0;
                while (true) {
                    byte[][] bArr2 = this.f381069a;
                    if (i12 >= bArr2.length) {
                        break;
                    }
                    byte[] bArr3 = bArr2[i12];
                    if (bArr3 != null) {
                        codedOutputByteBufferNano.writeBytes(1, bArr3);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$e */
    public static final class e extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f381070a;

        /* renamed from: b, reason: collision with root package name */
        public int f381071b;

        public e() {
            a();
        }

        public e a() {
            this.f381070a = 0L;
            this.f381071b = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            long j12 = this.f381070a;
            if (j12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j12);
            }
            int i12 = this.f381071b;
            return i12 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381070a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f381071b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            long j12 = this.f381070a;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeInt64(1, j12);
            }
            int i12 = this.f381071b;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$f */
    public static final class f extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381072a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f381073b;

        /* renamed from: c, reason: collision with root package name */
        public i f381074c;

        /* renamed from: d, reason: collision with root package name */
        public g[] f381075d;

        /* renamed from: e, reason: collision with root package name */
        public int f381076e;

        public f() {
            a();
        }

        public f a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381072a = bArr;
            this.f381073b = bArr;
            this.f381074c = null;
            this.f381075d = g.b();
            this.f381076e = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381072a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381072a);
            }
            if (!Arrays.equals(this.f381073b, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f381073b);
            }
            i iVar = this.f381074c;
            if (iVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, iVar);
            }
            g[] gVarArr = this.f381075d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    g[] gVarArr2 = this.f381075d;
                    if (i12 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i12];
                    if (gVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, gVar) + iComputeSerializedSize;
                    }
                    i12++;
                }
            }
            int i13 = this.f381076e;
            return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i13) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381072a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    this.f381073b = codedInputByteBufferNano.readBytes();
                } else if (tag == 26) {
                    if (this.f381074c == null) {
                        this.f381074c = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f381074c);
                } else if (tag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    g[] gVarArr = this.f381075d;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    g[] gVarArr2 = new g[i12];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        g gVar = new g();
                        gVarArr2[length] = gVar;
                        codedInputByteBufferNano.readMessage(gVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    g gVar2 = new g();
                    gVarArr2[length] = gVar2;
                    codedInputByteBufferNano.readMessage(gVar2);
                    this.f381075d = gVarArr2;
                } else if (tag == 40) {
                    this.f381076e = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381072a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381072a);
            }
            if (!Arrays.equals(this.f381073b, bArr2)) {
                codedOutputByteBufferNano.writeBytes(2, this.f381073b);
            }
            i iVar = this.f381074c;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(3, iVar);
            }
            g[] gVarArr = this.f381075d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    g[] gVarArr2 = this.f381075d;
                    if (i12 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i12];
                    if (gVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, gVar);
                    }
                    i12++;
                }
            }
            int i13 = this.f381076e;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$g */
    public static final class g extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile g[] f381077c;

        /* renamed from: a, reason: collision with root package name */
        public int f381078a;

        /* renamed from: b, reason: collision with root package name */
        public c f381079b;

        public g() {
            a();
        }

        public static g[] b() {
            if (f381077c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381077c == null) {
                            f381077c = new g[0];
                        }
                    } finally {
                    }
                }
            }
            return f381077c;
        }

        public g a() {
            this.f381078a = 0;
            this.f381079b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i12 = this.f381078a;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i12);
            }
            c cVar = this.f381079b;
            return cVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, cVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381078a = codedInputByteBufferNano.readUInt32();
                } else if (tag == 18) {
                    if (this.f381079b == null) {
                        this.f381079b = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f381079b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            int i12 = this.f381078a;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i12);
            }
            c cVar = this.f381079b;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(2, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$h */
    public static final class h extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public f f381080a;

        public h() {
            a();
        }

        public h a() {
            this.f381080a = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            f fVar = this.f381080a;
            return fVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, fVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381080a == null) {
                        this.f381080a = new f();
                    }
                    codedInputByteBufferNano.readMessage(this.f381080a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            f fVar = this.f381080a;
            if (fVar != null) {
                codedOutputByteBufferNano.writeMessage(1, fVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$i */
    public static final class i extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public a[] f381081a;

        /* renamed from: b, reason: collision with root package name */
        public int f381082b;

        /* renamed from: com.yandex.metrica.impl.ob.mf$i$a */
        public static final class a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile a[] f381083c;

            /* renamed from: a, reason: collision with root package name */
            public byte[] f381084a;

            /* renamed from: b, reason: collision with root package name */
            public byte[] f381085b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f381083c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f381083c == null) {
                                f381083c = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f381083c;
            }

            public a a() {
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f381084a = bArr;
                this.f381085b = bArr;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                byte[] bArr = this.f381084a;
                byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                if (!Arrays.equals(bArr, bArr2)) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381084a);
                }
                return !Arrays.equals(this.f381085b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f381085b) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f381084a = codedInputByteBufferNano.readBytes();
                    } else if (tag == 18) {
                        this.f381085b = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                byte[] bArr = this.f381084a;
                byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
                if (!Arrays.equals(bArr, bArr2)) {
                    codedOutputByteBufferNano.writeBytes(1, this.f381084a);
                }
                if (!Arrays.equals(this.f381085b, bArr2)) {
                    codedOutputByteBufferNano.writeBytes(2, this.f381085b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public i() {
            a();
        }

        public i a() {
            this.f381081a = a.b();
            this.f381082b = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            a[] aVarArr = this.f381081a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381081a;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i12];
                    if (aVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, aVar) + iComputeSerializedSize;
                    }
                    i12++;
                }
            }
            int i13 = this.f381082b;
            return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i13) : iComputeSerializedSize;
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
                    a[] aVarArr = this.f381081a;
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
                    this.f381081a = aVarArr2;
                } else if (tag == 16) {
                    this.f381082b = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            a[] aVarArr = this.f381081a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381081a;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i12];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i12++;
                }
            }
            int i13 = this.f381082b;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$j */
    public static final class j extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public a f381086a;

        /* renamed from: b, reason: collision with root package name */
        public a[] f381087b;

        public j() {
            a();
        }

        public j a() {
            this.f381086a = null;
            this.f381087b = a.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            a aVar = this.f381086a;
            if (aVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            a[] aVarArr = this.f381087b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381087b;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i12];
                    if (aVar2 != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, aVar2) + iComputeSerializedSize;
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
                    if (this.f381086a == null) {
                        this.f381086a = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f381086a);
                } else if (tag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    a[] aVarArr = this.f381087b;
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
                    this.f381087b = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            a aVar = this.f381086a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            a[] aVarArr = this.f381087b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f381087b;
                    if (i12 >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i12];
                    if (aVar2 != null) {
                        codedOutputByteBufferNano.writeMessage(2, aVar2);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$k */
    public static final class k extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381088a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f381089b;

        /* renamed from: c, reason: collision with root package name */
        public d f381090c;

        /* renamed from: d, reason: collision with root package name */
        public i f381091d;

        /* renamed from: e, reason: collision with root package name */
        public j f381092e;

        /* renamed from: f, reason: collision with root package name */
        public j f381093f;

        /* renamed from: g, reason: collision with root package name */
        public l[] f381094g;

        public k() {
            a();
        }

        public k a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381088a = bArr;
            this.f381089b = bArr;
            this.f381090c = null;
            this.f381091d = null;
            this.f381092e = null;
            this.f381093f = null;
            this.f381094g = l.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381088a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381088a);
            }
            if (!Arrays.equals(this.f381089b, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f381089b);
            }
            d dVar = this.f381090c;
            if (dVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, dVar);
            }
            i iVar = this.f381091d;
            if (iVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, iVar);
            }
            j jVar = this.f381092e;
            if (jVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, jVar);
            }
            j jVar2 = this.f381093f;
            if (jVar2 != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, jVar2);
            }
            l[] lVarArr = this.f381094g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    l[] lVarArr2 = this.f381094g;
                    if (i12 >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i12];
                    if (lVar != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, lVar) + iComputeSerializedSize;
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
                    this.f381088a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    this.f381089b = codedInputByteBufferNano.readBytes();
                } else if (tag == 26) {
                    if (this.f381090c == null) {
                        this.f381090c = new d();
                    }
                    codedInputByteBufferNano.readMessage(this.f381090c);
                } else if (tag == 34) {
                    if (this.f381091d == null) {
                        this.f381091d = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f381091d);
                } else if (tag == 42) {
                    if (this.f381092e == null) {
                        this.f381092e = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f381092e);
                } else if (tag == 50) {
                    if (this.f381093f == null) {
                        this.f381093f = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f381093f);
                } else if (tag == 58) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    l[] lVarArr = this.f381094g;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    l[] lVarArr2 = new l[i12];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        l lVar = new l();
                        lVarArr2[length] = lVar;
                        codedInputByteBufferNano.readMessage(lVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length] = lVar2;
                    codedInputByteBufferNano.readMessage(lVar2);
                    this.f381094g = lVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381088a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381088a);
            }
            if (!Arrays.equals(this.f381089b, bArr2)) {
                codedOutputByteBufferNano.writeBytes(2, this.f381089b);
            }
            d dVar = this.f381090c;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(3, dVar);
            }
            i iVar = this.f381091d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            j jVar = this.f381092e;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(5, jVar);
            }
            j jVar2 = this.f381093f;
            if (jVar2 != null) {
                codedOutputByteBufferNano.writeMessage(6, jVar2);
            }
            l[] lVarArr = this.f381094g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    l[] lVarArr2 = this.f381094g;
                    if (i12 >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i12];
                    if (lVar != null) {
                        codedOutputByteBufferNano.writeMessage(7, lVar);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$l */
    public static final class l extends MessageNano {

        /* renamed from: b, reason: collision with root package name */
        private static volatile l[] f381095b;

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381096a;

        public l() {
            a();
        }

        public static l[] b() {
            if (f381095b == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381095b == null) {
                            f381095b = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return f381095b;
        }

        public l a() {
            this.f381096a = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            return !Arrays.equals(this.f381096a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f381096a) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381096a = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            if (!Arrays.equals(this.f381096a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381096a);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$m */
    public static final class m extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381097a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f381098b;

        /* renamed from: c, reason: collision with root package name */
        public n f381099c;

        public m() {
            a();
        }

        public m a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381097a = bArr;
            this.f381098b = bArr;
            this.f381099c = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381097a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381097a);
            }
            if (!Arrays.equals(this.f381098b, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f381098b);
            }
            n nVar = this.f381099c;
            return nVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, nVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381097a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    this.f381098b = codedInputByteBufferNano.readBytes();
                } else if (tag == 26) {
                    if (this.f381099c == null) {
                        this.f381099c = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f381099c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381097a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381097a);
            }
            if (!Arrays.equals(this.f381098b, bArr2)) {
                codedOutputByteBufferNano.writeBytes(2, this.f381098b);
            }
            n nVar = this.f381099c;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(3, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$n */
    public static final class n extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381100a;

        /* renamed from: b, reason: collision with root package name */
        public d f381101b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f381102c;

        /* renamed from: d, reason: collision with root package name */
        public i f381103d;

        public n() {
            a();
        }

        public n a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381100a = bArr;
            this.f381101b = null;
            this.f381102c = bArr;
            this.f381103d = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381100a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381100a);
            }
            d dVar = this.f381101b;
            if (dVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dVar);
            }
            if (!Arrays.equals(this.f381102c, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f381102c);
            }
            i iVar = this.f381103d;
            return iVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, iVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381100a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    if (this.f381101b == null) {
                        this.f381101b = new d();
                    }
                    codedInputByteBufferNano.readMessage(this.f381101b);
                } else if (tag == 26) {
                    this.f381102c = codedInputByteBufferNano.readBytes();
                } else if (tag == 34) {
                    if (this.f381103d == null) {
                        this.f381103d = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f381103d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381100a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381100a);
            }
            d dVar = this.f381101b;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(2, dVar);
            }
            if (!Arrays.equals(this.f381102c, bArr2)) {
                codedOutputByteBufferNano.writeBytes(3, this.f381102c);
            }
            i iVar = this.f381103d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$o */
    public static final class o extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public k f381104a;

        /* renamed from: b, reason: collision with root package name */
        public n f381105b;

        public o() {
            a();
        }

        public o a() {
            this.f381104a = null;
            this.f381105b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            k kVar = this.f381104a;
            if (kVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            n nVar = this.f381105b;
            return nVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381104a == null) {
                        this.f381104a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f381104a);
                } else if (tag == 18) {
                    if (this.f381105b == null) {
                        this.f381105b = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f381105b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            k kVar = this.f381104a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            n nVar = this.f381105b;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(2, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$p */
    public static final class p extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public k f381106a;

        /* renamed from: b, reason: collision with root package name */
        public m f381107b;

        public p() {
            a();
        }

        public p a() {
            this.f381106a = null;
            this.f381107b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            k kVar = this.f381106a;
            if (kVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            m mVar = this.f381107b;
            return mVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, mVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381106a == null) {
                        this.f381106a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f381106a);
                } else if (tag == 18) {
                    if (this.f381107b == null) {
                        this.f381107b = new m();
                    }
                    codedInputByteBufferNano.readMessage(this.f381107b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            k kVar = this.f381106a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            m mVar = this.f381107b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$q */
    public static final class q extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public n f381108a;

        public q() {
            a();
        }

        public q a() {
            this.f381108a = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            n nVar = this.f381108a;
            return nVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, nVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f381108a == null) {
                        this.f381108a = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f381108a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            n nVar = this.f381108a;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(1, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C38979mf() {
        a();
    }

    public C38979mf a() {
        this.f381055a = 0;
        this.f381056b = null;
        this.f381057c = null;
        this.f381058d = null;
        this.f381059e = null;
        this.f381060f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i12 = this.f381055a;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i12);
        }
        q qVar = this.f381056b;
        if (qVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        o oVar = this.f381057c;
        if (oVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        p pVar = this.f381058d;
        if (pVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        b bVar = this.f381059e;
        if (bVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        h hVar = this.f381060f;
        return hVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, hVar) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
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
                            this.f381055a = int32;
                            break;
                    }
                } else if (tag == 18) {
                    if (this.f381056b == null) {
                        this.f381056b = new q();
                    }
                    codedInputByteBufferNano.readMessage(this.f381056b);
                } else if (tag == 26) {
                    if (this.f381057c == null) {
                        this.f381057c = new o();
                    }
                    codedInputByteBufferNano.readMessage(this.f381057c);
                } else if (tag == 34) {
                    if (this.f381058d == null) {
                        this.f381058d = new p();
                    }
                    codedInputByteBufferNano.readMessage(this.f381058d);
                } else if (tag == 42) {
                    if (this.f381059e == null) {
                        this.f381059e = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f381059e);
                } else if (tag == 50) {
                    if (this.f381060f == null) {
                        this.f381060f = new h();
                    }
                    codedInputByteBufferNano.readMessage(this.f381060f);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                }
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i12 = this.f381055a;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i12);
        }
        q qVar = this.f381056b;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(2, qVar);
        }
        o oVar = this.f381057c;
        if (oVar != null) {
            codedOutputByteBufferNano.writeMessage(3, oVar);
        }
        p pVar = this.f381058d;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(4, pVar);
        }
        b bVar = this.f381059e;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(5, bVar);
        }
        h hVar = this.f381060f;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(6, hVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
