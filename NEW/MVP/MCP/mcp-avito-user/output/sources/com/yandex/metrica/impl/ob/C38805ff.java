package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ff, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38805ff extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C38805ff[] f380590c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f380591a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f380592b;

    public C38805ff() {
        a();
    }

    public static C38805ff[] b() {
        if (f380590c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f380590c == null) {
                        f380590c = new C38805ff[0];
                    }
                } finally {
                }
            }
        }
        return f380590c;
    }

    public C38805ff a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f380591a = bArr;
        this.f380592b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f380591a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f380591a);
        }
        return !Arrays.equals(this.f380592b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f380592b) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f380591a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f380592b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f380591a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f380591a);
        }
        if (!Arrays.equals(this.f380592b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f380592b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
