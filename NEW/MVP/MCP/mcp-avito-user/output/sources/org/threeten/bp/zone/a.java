package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import org.threeten.bp.q;

/* compiled from: Ser.java */
/* loaded from: classes16.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: b, reason: collision with root package name */
    public byte f422236b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f422237c;

    public a() {
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static Serializable b(byte b12, DataInput dataInput) throws IOException {
        if (b12 != 1) {
            if (b12 != 2) {
                if (b12 == 3) {
                    return ZoneOffsetTransitionRule.a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long jA2 = a(dataInput);
            q qVarC = c(dataInput);
            q qVarC2 = c(dataInput);
            if (qVarC.equals(qVarC2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            return new e(jA2, qVarC, qVarC2);
        }
        int i12 = dataInput.readInt();
        long[] jArr = new long[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            jArr[i13] = a(dataInput);
        }
        int i14 = i12 + 1;
        q[] qVarArr = new q[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            qVarArr[i15] = c(dataInput);
        }
        int i16 = dataInput.readInt();
        long[] jArr2 = new long[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            jArr2[i17] = a(dataInput);
        }
        int i18 = i16 + 1;
        q[] qVarArr2 = new q[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            qVarArr2[i19] = c(dataInput);
        }
        int i22 = dataInput.readByte();
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = new ZoneOffsetTransitionRule[i22];
        for (int i23 = 0; i23 < i22; i23++) {
            zoneOffsetTransitionRuleArr[i23] = ZoneOffsetTransitionRule.a(dataInput);
        }
        return new b(jArr, qVarArr, jArr2, qVarArr2, zoneOffsetTransitionRuleArr);
    }

    public static q c(DataInput dataInput) throws IOException {
        byte b12 = dataInput.readByte();
        return b12 == 127 ? q.w(dataInput.readInt()) : q.w(b12 * 900);
    }

    public static void d(long j12, ObjectOutput objectOutput) throws IOException {
        if (j12 < -4575744000L || j12 >= 10413792000L || j12 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j12);
        } else {
            int i12 = (int) ((j12 + 4575744000L) / 900);
            objectOutput.writeByte((i12 >>> 16) & 255);
            objectOutput.writeByte((i12 >>> 8) & 255);
            objectOutput.writeByte(i12 & 255);
        }
    }

    public static void e(q qVar, ObjectOutput objectOutput) throws IOException {
        int i12 = qVar.f422109c;
        int i13 = i12 % 900 == 0 ? i12 / 900 : 127;
        objectOutput.writeByte(i13);
        if (i13 == 127) {
            objectOutput.writeInt(i12);
        }
    }

    private Object readResolve() {
        return this.f422237c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b12 = objectInput.readByte();
        this.f422236b = b12;
        this.f422237c = b(b12, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b12 = this.f422236b;
        Serializable serializable = this.f422237c;
        objectOutput.writeByte(b12);
        if (b12 != 1) {
            if (b12 != 2) {
                if (b12 != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((ZoneOffsetTransitionRule) serializable).writeExternal(objectOutput);
                return;
            } else {
                e eVar = (e) serializable;
                org.threeten.bp.f fVar = eVar.f422252b;
                q qVar = eVar.f422253c;
                d(fVar.s(qVar), objectOutput);
                e(qVar, objectOutput);
                e(eVar.f422254d, objectOutput);
                return;
            }
        }
        b bVar = (b) serializable;
        long[] jArr = bVar.f422238b;
        objectOutput.writeInt(jArr.length);
        for (long j12 : jArr) {
            d(j12, objectOutput);
        }
        for (q qVar2 : bVar.f422239c) {
            e(qVar2, objectOutput);
        }
        long[] jArr2 = bVar.f422240d;
        objectOutput.writeInt(jArr2.length);
        for (long j13 : jArr2) {
            d(j13, objectOutput);
        }
        for (q qVar3 : bVar.f422242f) {
            e(qVar3, objectOutput);
        }
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = bVar.f422243g;
        objectOutput.writeByte(zoneOffsetTransitionRuleArr.length);
        for (ZoneOffsetTransitionRule zoneOffsetTransitionRule : zoneOffsetTransitionRuleArr) {
            zoneOffsetTransitionRule.writeExternal(objectOutput);
        }
    }

    public a(byte b12, Serializable serializable) {
        this.f422236b = b12;
        this.f422237c = serializable;
    }
}
