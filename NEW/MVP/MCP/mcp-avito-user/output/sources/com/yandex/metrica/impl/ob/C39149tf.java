package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.tf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39149tf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public String f381883a;

    /* renamed from: b, reason: collision with root package name */
    public long f381884b;

    /* renamed from: c, reason: collision with root package name */
    public long f381885c;

    /* renamed from: d, reason: collision with root package name */
    public int f381886d;

    public C39149tf() {
        a();
    }

    public C39149tf a() {
        this.f381883a = "";
        this.f381884b = 0L;
        this.f381885c = 0L;
        this.f381886d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f381883a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f381883a);
        }
        long j12 = this.f381884b;
        if (j12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j12);
        }
        long j13 = this.f381885c;
        if (j13 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j13);
        }
        int i12 = this.f381886d;
        return i12 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i12) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f381883a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f381884b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f381885c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f381886d = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        if (!this.f381883a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f381883a);
        }
        long j12 = this.f381884b;
        if (j12 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j12);
        }
        long j13 = this.f381885c;
        if (j13 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j13);
        }
        int i12 = this.f381886d;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C39149tf a(byte[] bArr) {
        return (C39149tf) MessageNano.mergeFrom(new C39149tf(), bArr);
    }
}
