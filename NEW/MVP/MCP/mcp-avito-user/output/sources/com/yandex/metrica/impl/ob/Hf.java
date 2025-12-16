package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class Hf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    private static volatile Hf[] f378262c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f378263a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f378264b;

    public Hf() {
        a();
    }

    public static Hf[] b() {
        if (f378262c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f378262c == null) {
                        f378262c = new Hf[0];
                    }
                } finally {
                }
            }
        }
        return f378262c;
    }

    public Hf a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f378263a = bArr;
        this.f378264b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f378263a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f378263a);
        }
        return !Arrays.equals(this.f378264b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f378264b) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f378263a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f378264b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f378263a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f378263a);
        }
        if (!Arrays.equals(this.f378264b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f378264b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
