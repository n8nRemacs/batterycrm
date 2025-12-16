package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;

/* loaded from: classes7.dex */
public final class Gf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public Hf[] f378187a;

    public Gf() {
        a();
    }

    public Gf a() {
        this.f378187a = Hf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Hf[] hfArr = this.f378187a;
        if (hfArr != null && hfArr.length > 0) {
            int i12 = 0;
            while (true) {
                Hf[] hfArr2 = this.f378187a;
                if (i12 >= hfArr2.length) {
                    break;
                }
                Hf hf2 = hfArr2[i12];
                if (hf2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, hf2) + iComputeSerializedSize;
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
                Hf[] hfArr = this.f378187a;
                int length = hfArr == null ? 0 : hfArr.length;
                int i12 = repeatedFieldArrayLength + length;
                Hf[] hfArr2 = new Hf[i12];
                if (length != 0) {
                    System.arraycopy(hfArr, 0, hfArr2, 0, length);
                }
                while (length < i12 - 1) {
                    Hf hf2 = new Hf();
                    hfArr2[length] = hf2;
                    codedInputByteBufferNano.readMessage(hf2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Hf hf3 = new Hf();
                hfArr2[length] = hf3;
                codedInputByteBufferNano.readMessage(hf3);
                this.f378187a = hfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        Hf[] hfArr = this.f378187a;
        if (hfArr != null && hfArr.length > 0) {
            int i12 = 0;
            while (true) {
                Hf[] hfArr2 = this.f378187a;
                if (i12 >= hfArr2.length) {
                    break;
                }
                Hf hf2 = hfArr2[i12];
                if (hf2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, hf2);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
