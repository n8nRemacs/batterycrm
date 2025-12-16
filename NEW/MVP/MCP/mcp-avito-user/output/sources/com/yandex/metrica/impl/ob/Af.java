package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;

/* loaded from: classes7.dex */
public final class Af extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public boolean f377771a;

    /* renamed from: b, reason: collision with root package name */
    public int f377772b;

    /* renamed from: c, reason: collision with root package name */
    public int f377773c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f377774d;

    public Af() {
        a();
    }

    public Af a() {
        this.f377771a = false;
        this.f377772b = 0;
        this.f377773c = 0;
        this.f377774d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f377773c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f377772b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f377771a) + super.computeSerializedSize();
        int[] iArr = this.f377774d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i12 = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f377774d;
            if (i12 >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i12]);
            i12++;
        }
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f377771a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f377772b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f377773c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f377774d;
                int length = iArr == null ? 0 : iArr.length;
                int i12 = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i12];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i12 - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f377774d = iArr2;
            } else if (tag == 34) {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i13 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i13++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f377774d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i14 = i13 + length2;
                int[] iArr4 = new int[i14];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i14) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f377774d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeBool(1, this.f377771a);
        codedOutputByteBufferNano.writeUInt32(2, this.f377772b);
        codedOutputByteBufferNano.writeUInt32(3, this.f377773c);
        int[] iArr = this.f377774d;
        if (iArr != null && iArr.length > 0) {
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.f377774d;
                if (i12 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i12]);
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
