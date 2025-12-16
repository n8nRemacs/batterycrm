package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.if, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cif extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public int f380788a;

    /* renamed from: b, reason: collision with root package name */
    public String f380789b;

    public Cif() {
        a();
    }

    public Cif a() {
        this.f380788a = 0;
        this.f380789b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i12 = this.f380788a;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i12);
        }
        return !this.f380789b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f380789b) : iComputeSerializedSize;
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
                    this.f380788a = int32;
                }
            } else if (tag == 18) {
                this.f380789b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        int i12 = this.f380788a;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i12);
        }
        if (!this.f380789b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f380789b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
