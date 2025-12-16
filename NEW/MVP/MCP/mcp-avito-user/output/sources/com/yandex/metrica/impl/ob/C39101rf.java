package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.rf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39101rf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    private static volatile C39101rf[] f381756f;

    /* renamed from: a, reason: collision with root package name */
    public String f381757a;

    /* renamed from: b, reason: collision with root package name */
    public int f381758b;

    /* renamed from: c, reason: collision with root package name */
    public String f381759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f381760d;

    /* renamed from: e, reason: collision with root package name */
    public long f381761e;

    public C39101rf() {
        a();
    }

    public static C39101rf[] b() {
        if (f381756f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f381756f == null) {
                        f381756f = new C39101rf[0];
                    }
                } finally {
                }
            }
        }
        return f381756f;
    }

    public C39101rf a() {
        this.f381757a = "";
        this.f381758b = 0;
        this.f381759c = "";
        this.f381760d = false;
        this.f381761e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f381757a) + super.computeSerializedSize();
        int i12 = this.f381758b;
        if (i12 != 0) {
            iComputeStringSize += CodedOutputByteBufferNano.computeSInt32Size(2, i12);
        }
        if (!this.f381759c.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(3, this.f381759c);
        }
        boolean z12 = this.f381760d;
        if (z12) {
            iComputeStringSize += CodedOutputByteBufferNano.computeBoolSize(4, z12);
        }
        long j12 = this.f381761e;
        return j12 != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeUInt64Size(5, j12) : iComputeStringSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f381757a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f381758b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 26) {
                this.f381759c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f381760d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f381761e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        codedOutputByteBufferNano.writeString(1, this.f381757a);
        int i12 = this.f381758b;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i12);
        }
        if (!this.f381759c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f381759c);
        }
        boolean z12 = this.f381760d;
        if (z12) {
            codedOutputByteBufferNano.writeBool(4, z12);
        }
        long j12 = this.f381761e;
        if (j12 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
