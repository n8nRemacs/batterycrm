package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.ef, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38780ef extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public C38755df f380486a;

    /* renamed from: b, reason: collision with root package name */
    public String f380487b;

    /* renamed from: c, reason: collision with root package name */
    public int f380488c;

    public C38780ef() {
        a();
    }

    public C38780ef a() {
        this.f380486a = null;
        this.f380487b = "";
        this.f380488c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C38755df c38755df = this.f380486a;
        if (c38755df != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c38755df);
        }
        if (!this.f380487b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f380487b);
        }
        int i12 = this.f380488c;
        return i12 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i12) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f380486a == null) {
                    this.f380486a = new C38755df();
                }
                codedInputByteBufferNano.readMessage(this.f380486a);
            } else if (tag == 18) {
                this.f380487b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f380488c = int32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        C38755df c38755df = this.f380486a;
        if (c38755df != null) {
            codedOutputByteBufferNano.writeMessage(1, c38755df);
        }
        if (!this.f380487b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f380487b);
        }
        int i12 = this.f380488c;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
