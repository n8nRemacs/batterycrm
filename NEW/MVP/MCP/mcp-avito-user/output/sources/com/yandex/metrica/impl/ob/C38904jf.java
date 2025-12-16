package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.jf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38904jf extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    private static volatile C38904jf[] f380898g;

    /* renamed from: a, reason: collision with root package name */
    public String f380899a;

    /* renamed from: b, reason: collision with root package name */
    public String f380900b;

    /* renamed from: c, reason: collision with root package name */
    public int f380901c;

    /* renamed from: d, reason: collision with root package name */
    public String f380902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f380903e;

    /* renamed from: f, reason: collision with root package name */
    public int f380904f;

    public C38904jf() {
        a();
    }

    public static C38904jf[] b() {
        if (f380898g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f380898g == null) {
                        f380898g = new C38904jf[0];
                    }
                } finally {
                }
            }
        }
        return f380898g;
    }

    public C38904jf a() {
        this.f380899a = "";
        this.f380900b = "";
        this.f380901c = -1;
        this.f380902d = "";
        this.f380903e = false;
        this.f380904f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f380899a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f380899a);
        }
        if (!this.f380900b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f380900b);
        }
        int i12 = this.f380901c;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i12);
        }
        if (!this.f380902d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f380902d);
        }
        boolean z12 = this.f380903e;
        if (z12) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z12);
        }
        int i13 = this.f380904f;
        return i13 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i13) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f380899a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f380900b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f380901c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f380902d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f380903e = codedInputByteBufferNano.readBool();
            } else if (tag == 48) {
                this.f380904f = codedInputByteBufferNano.readSInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        if (!this.f380899a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f380899a);
        }
        if (!this.f380900b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f380900b);
        }
        int i12 = this.f380901c;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i12);
        }
        if (!this.f380902d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f380902d);
        }
        boolean z12 = this.f380903e;
        if (z12) {
            codedOutputByteBufferNano.writeBool(5, z12);
        }
        int i13 = this.f380904f;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i13);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
