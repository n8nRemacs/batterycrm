package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.df, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38755df extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public C38929kf f380372a;

    /* renamed from: b, reason: collision with root package name */
    public C38929kf[] f380373b;

    /* renamed from: c, reason: collision with root package name */
    public String f380374c;

    public C38755df() {
        a();
    }

    public C38755df a() {
        this.f380372a = null;
        this.f380373b = C38929kf.b();
        this.f380374c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C38929kf c38929kf = this.f380372a;
        if (c38929kf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c38929kf);
        }
        C38929kf[] c38929kfArr = this.f380373b;
        if (c38929kfArr != null && c38929kfArr.length > 0) {
            int i12 = 0;
            while (true) {
                C38929kf[] c38929kfArr2 = this.f380373b;
                if (i12 >= c38929kfArr2.length) {
                    break;
                }
                C38929kf c38929kf2 = c38929kfArr2[i12];
                if (c38929kf2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c38929kf2) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        return !this.f380374c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f380374c) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f380372a == null) {
                    this.f380372a = new C38929kf();
                }
                codedInputByteBufferNano.readMessage(this.f380372a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C38929kf[] c38929kfArr = this.f380373b;
                int length = c38929kfArr == null ? 0 : c38929kfArr.length;
                int i12 = repeatedFieldArrayLength + length;
                C38929kf[] c38929kfArr2 = new C38929kf[i12];
                if (length != 0) {
                    System.arraycopy(c38929kfArr, 0, c38929kfArr2, 0, length);
                }
                while (length < i12 - 1) {
                    C38929kf c38929kf = new C38929kf();
                    c38929kfArr2[length] = c38929kf;
                    codedInputByteBufferNano.readMessage(c38929kf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C38929kf c38929kf2 = new C38929kf();
                c38929kfArr2[length] = c38929kf2;
                codedInputByteBufferNano.readMessage(c38929kf2);
                this.f380373b = c38929kfArr2;
            } else if (tag == 26) {
                this.f380374c = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        C38929kf c38929kf = this.f380372a;
        if (c38929kf != null) {
            codedOutputByteBufferNano.writeMessage(1, c38929kf);
        }
        C38929kf[] c38929kfArr = this.f380373b;
        if (c38929kfArr != null && c38929kfArr.length > 0) {
            int i12 = 0;
            while (true) {
                C38929kf[] c38929kfArr2 = this.f380373b;
                if (i12 >= c38929kfArr2.length) {
                    break;
                }
                C38929kf c38929kf2 = c38929kfArr2[i12];
                if (c38929kf2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c38929kf2);
                }
                i12++;
            }
        }
        if (!this.f380374c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f380374c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
