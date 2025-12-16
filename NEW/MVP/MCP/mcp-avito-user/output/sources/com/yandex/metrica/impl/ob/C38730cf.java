package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.cf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38730cf extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    private static byte[] f380327l;

    /* renamed from: m, reason: collision with root package name */
    private static volatile boolean f380328m;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f380329a;

    /* renamed from: b, reason: collision with root package name */
    public a f380330b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f380331c;

    /* renamed from: d, reason: collision with root package name */
    public int f380332d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f380333e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f380334f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f380335g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f380336h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f380337i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f380338j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f380339k;

    /* renamed from: com.yandex.metrica.impl.ob.cf$a */
    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public long f380340a;

        /* renamed from: b, reason: collision with root package name */
        public int f380341b;

        public a() {
            a();
        }

        public a a() {
            this.f380340a = 0L;
            this.f380341b = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            long j12 = this.f380340a;
            if (j12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j12);
            }
            int i12 = this.f380341b;
            return i12 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f380340a = codedInputByteBufferNano.readInt64();
                } else if (tag == 16) {
                    this.f380341b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            long j12 = this.f380340a;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeInt64(1, j12);
            }
            int i12 = this.f380341b;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C38730cf() {
        if (!f380328m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f380328m) {
                        f380327l = InternalNano.bytesDefaultValue("manual");
                        f380328m = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public C38730cf a() {
        this.f380329a = (byte[]) f380327l.clone();
        this.f380330b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f380331c = bArr;
        this.f380332d = 0;
        this.f380333e = bArr;
        this.f380334f = bArr;
        this.f380335g = bArr;
        this.f380336h = bArr;
        this.f380337i = bArr;
        this.f380338j = bArr;
        this.f380339k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f380329a, f380327l)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f380329a);
        }
        a aVar = this.f380330b;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        byte[] bArr = this.f380331c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f380331c);
        }
        int i12 = this.f380332d;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i12);
        }
        if (!Arrays.equals(this.f380333e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f380333e);
        }
        if (!Arrays.equals(this.f380334f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f380334f);
        }
        if (!Arrays.equals(this.f380335g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f380335g);
        }
        if (!Arrays.equals(this.f380336h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f380336h);
        }
        if (!Arrays.equals(this.f380337i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f380337i);
        }
        if (!Arrays.equals(this.f380338j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f380338j);
        }
        return !Arrays.equals(this.f380339k, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f380339k) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f380329a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f380330b == null) {
                        this.f380330b = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f380330b);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.f380331c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f380332d = int32;
                            break;
                    }
                case 42:
                    this.f380333e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f380334f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f380335g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f380336h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f380337i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f380338j = codedInputByteBufferNano.readBytes();
                    break;
                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f380339k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!Arrays.equals(this.f380329a, f380327l)) {
            codedOutputByteBufferNano.writeBytes(1, this.f380329a);
        }
        a aVar = this.f380330b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        byte[] bArr = this.f380331c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f380331c);
        }
        int i12 = this.f380332d;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i12);
        }
        if (!Arrays.equals(this.f380333e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f380333e);
        }
        if (!Arrays.equals(this.f380334f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f380334f);
        }
        if (!Arrays.equals(this.f380335g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f380335g);
        }
        if (!Arrays.equals(this.f380336h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f380336h);
        }
        if (!Arrays.equals(this.f380337i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f380337i);
        }
        if (!Arrays.equals(this.f380338j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f380338j);
        }
        if (!Arrays.equals(this.f380339k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f380339k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
