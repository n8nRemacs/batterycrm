package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;

/* renamed from: com.yandex.metrica.impl.ob.sf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39125sf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f381828a;

    /* renamed from: b, reason: collision with root package name */
    public long f381829b;

    /* renamed from: c, reason: collision with root package name */
    public long f381830c;

    /* renamed from: d, reason: collision with root package name */
    public int f381831d;

    public C39125sf() {
        a();
    }

    public C39125sf a() {
        this.f381828a = WireFormatNano.EMPTY_BYTES;
        this.f381829b = 0L;
        this.f381830c = 0L;
        this.f381831d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f381828a) + super.computeSerializedSize();
        long j12 = this.f381829b;
        if (j12 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j12);
        }
        long j13 = this.f381830c;
        if (j13 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j13);
        }
        int i12 = this.f381831d;
        return i12 != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i12) : iComputeBytesSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f381828a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f381829b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f381830c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f381831d = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeBytes(1, this.f381828a);
        long j12 = this.f381829b;
        if (j12 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j12);
        }
        long j13 = this.f381830c;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j13);
        }
        int i12 = this.f381831d;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
