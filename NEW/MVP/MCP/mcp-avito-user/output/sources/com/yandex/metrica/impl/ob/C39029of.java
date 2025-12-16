package com.yandex.metrica.impl.ob;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.of, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39029of extends MessageNano {

    /* renamed from: q, reason: collision with root package name */
    private static volatile C39029of[] f381250q;

    /* renamed from: a, reason: collision with root package name */
    public int f381251a;

    /* renamed from: b, reason: collision with root package name */
    public int f381252b;

    /* renamed from: c, reason: collision with root package name */
    public int f381253c;

    /* renamed from: d, reason: collision with root package name */
    public int f381254d;

    /* renamed from: e, reason: collision with root package name */
    public int f381255e;

    /* renamed from: f, reason: collision with root package name */
    public String f381256f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f381257g;

    /* renamed from: h, reason: collision with root package name */
    public int f381258h;

    /* renamed from: i, reason: collision with root package name */
    public int f381259i;

    /* renamed from: j, reason: collision with root package name */
    public long f381260j;

    /* renamed from: k, reason: collision with root package name */
    public int f381261k;

    /* renamed from: l, reason: collision with root package name */
    public int f381262l;

    /* renamed from: m, reason: collision with root package name */
    public int f381263m;

    /* renamed from: n, reason: collision with root package name */
    public int f381264n;

    /* renamed from: o, reason: collision with root package name */
    public int f381265o;

    /* renamed from: p, reason: collision with root package name */
    public int f381266p;

    public C39029of() {
        a();
    }

    public static C39029of[] b() {
        if (f381250q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f381250q == null) {
                        f381250q = new C39029of[0];
                    }
                } finally {
                }
            }
        }
        return f381250q;
    }

    public C39029of a() {
        this.f381251a = -1;
        this.f381252b = 0;
        this.f381253c = -1;
        this.f381254d = -1;
        this.f381255e = -1;
        this.f381256f = "";
        this.f381257g = false;
        this.f381258h = 0;
        this.f381259i = -1;
        this.f381260j = 0L;
        this.f381261k = Integer.MAX_VALUE;
        this.f381262l = Integer.MAX_VALUE;
        this.f381263m = Integer.MAX_VALUE;
        this.f381264n = -1;
        this.f381265o = -1;
        this.f381266p = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i12 = this.f381251a;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i12);
        }
        int i13 = this.f381252b;
        if (i13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i13);
        }
        int i14 = this.f381253c;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i14);
        }
        int i15 = this.f381254d;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i15);
        }
        int i16 = this.f381255e;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i16);
        }
        if (!this.f381256f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f381256f);
        }
        boolean z12 = this.f381257g;
        if (z12) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z12);
        }
        int i17 = this.f381258h;
        if (i17 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i17);
        }
        int i18 = this.f381259i;
        if (i18 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, i18);
        }
        long j12 = this.f381260j;
        if (j12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(10, j12);
        }
        int i19 = this.f381261k;
        if (i19 != Integer.MAX_VALUE) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(11, i19);
        }
        int i22 = this.f381262l;
        if (i22 != Integer.MAX_VALUE) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(12, i22);
        }
        int i23 = this.f381263m;
        if (i23 != Integer.MAX_VALUE) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(13, i23);
        }
        int i24 = this.f381264n;
        if (i24 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(14, i24);
        }
        int i25 = this.f381265o;
        if (i25 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(15, i25);
        }
        int i26 = this.f381266p;
        return i26 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(16, i26) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f381251a = codedInputByteBufferNano.readUInt32();
                    break;
                case 16:
                    this.f381252b = codedInputByteBufferNano.readSInt32();
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    this.f381253c = codedInputByteBufferNano.readUInt32();
                    break;
                case 32:
                    this.f381254d = codedInputByteBufferNano.readUInt32();
                    break;
                case 40:
                    this.f381255e = codedInputByteBufferNano.readUInt32();
                    break;
                case 50:
                    this.f381256f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    this.f381257g = codedInputByteBufferNano.readBool();
                    break;
                case 64:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2 && int32 != 3 && int32 != 4) {
                        break;
                    } else {
                        this.f381258h = int32;
                        break;
                    }
                    break;
                case 72:
                    this.f381259i = codedInputByteBufferNano.readUInt32();
                    break;
                case 80:
                    this.f381260j = codedInputByteBufferNano.readUInt64();
                    break;
                case 88:
                    this.f381261k = codedInputByteBufferNano.readSInt32();
                    break;
                case 96:
                    this.f381262l = codedInputByteBufferNano.readSInt32();
                    break;
                case 104:
                    this.f381263m = codedInputByteBufferNano.readSInt32();
                    break;
                case 112:
                    this.f381264n = codedInputByteBufferNano.readUInt32();
                    break;
                case 120:
                    this.f381265o = codedInputByteBufferNano.readUInt32();
                    break;
                case 128:
                    this.f381266p = codedInputByteBufferNano.readUInt32();
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
        int i12 = this.f381251a;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeUInt32(1, i12);
        }
        int i13 = this.f381252b;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i13);
        }
        int i14 = this.f381253c;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeUInt32(3, i14);
        }
        int i15 = this.f381254d;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeUInt32(4, i15);
        }
        int i16 = this.f381255e;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeUInt32(5, i16);
        }
        if (!this.f381256f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f381256f);
        }
        boolean z12 = this.f381257g;
        if (z12) {
            codedOutputByteBufferNano.writeBool(7, z12);
        }
        int i17 = this.f381258h;
        if (i17 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i17);
        }
        int i18 = this.f381259i;
        if (i18 != -1) {
            codedOutputByteBufferNano.writeUInt32(9, i18);
        }
        long j12 = this.f381260j;
        if (j12 != 0) {
            codedOutputByteBufferNano.writeUInt64(10, j12);
        }
        int i19 = this.f381261k;
        if (i19 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(11, i19);
        }
        int i22 = this.f381262l;
        if (i22 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(12, i22);
        }
        int i23 = this.f381263m;
        if (i23 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(13, i23);
        }
        int i24 = this.f381264n;
        if (i24 != -1) {
            codedOutputByteBufferNano.writeUInt32(14, i24);
        }
        int i25 = this.f381265o;
        if (i25 != -1) {
            codedOutputByteBufferNano.writeUInt32(15, i25);
        }
        int i26 = this.f381266p;
        if (i26 != -1) {
            codedOutputByteBufferNano.writeUInt32(16, i26);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
