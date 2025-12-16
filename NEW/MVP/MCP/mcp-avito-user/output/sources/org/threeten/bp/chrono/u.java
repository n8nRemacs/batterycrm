package org.threeten.bp.chrono;

import androidx.camera.camera2.internal.G;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: Ser.java */
/* loaded from: classes8.dex */
final class u implements Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;

    /* renamed from: b, reason: collision with root package name */
    public byte f421927b;

    /* renamed from: c, reason: collision with root package name */
    public Object f421928c;

    public u() {
    }

    private Object readResolve() {
        return this.f421928c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object qVar;
        Object objQ;
        byte b12 = objectInput.readByte();
        this.f421927b = b12;
        switch (b12) {
            case 1:
                org.threeten.bp.e eVar = q.f421912e;
                int i12 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                p.f421910e.getClass();
                qVar = new q(org.threeten.bp.e.N(i12, b13, b14));
                objQ = qVar;
                this.f421928c = objQ;
                return;
            case 2:
                r rVar = r.f421917e;
                objQ = r.q(objectInput.readByte());
                this.f421928c = objQ;
                return;
            case 3:
                int[] iArr = n.f421882i;
                int i13 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                m.f421876d.getClass();
                objQ = n.O(i13, b15, b16);
                this.f421928c = objQ;
                return;
            case 4:
                byte b17 = objectInput.readByte();
                if (b17 == 0) {
                    objQ = HijrahEra.f421851b;
                } else {
                    if (b17 != 1) {
                        throw new DateTimeException("HijrahEra not valid");
                    }
                    objQ = HijrahEra.f421852c;
                }
                this.f421928c = objQ;
                return;
            case 5:
                int i14 = t.f421924c;
                int i15 = objectInput.readInt();
                byte b18 = objectInput.readByte();
                byte b19 = objectInput.readByte();
                s.f421922d.getClass();
                qVar = new t(org.threeten.bp.e.N(i15 + 1911, b18, b19));
                objQ = qVar;
                this.f421928c = objQ;
                return;
            case 6:
                objQ = MinguoEra.d(objectInput.readByte());
                this.f421928c = objQ;
                return;
            case 7:
                int i16 = w.f421931c;
                int i17 = objectInput.readInt();
                byte b22 = objectInput.readByte();
                byte b23 = objectInput.readByte();
                v.f421929d.getClass();
                qVar = new w(org.threeten.bp.e.N(i17 - 543, b22, b23));
                objQ = qVar;
                this.f421928c = objQ;
                return;
            case 8:
                byte b24 = objectInput.readByte();
                if (b24 == 0) {
                    objQ = ThaiBuddhistEra.f421860b;
                } else {
                    if (b24 != 1) {
                        throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
                    }
                    objQ = ThaiBuddhistEra.f421861c;
                }
                this.f421928c = objQ;
                return;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                ConcurrentHashMap<String, j> concurrentHashMap = j.f421874b;
                String utf = objectInput.readUTF();
                j.m();
                j jVar = j.f421874b.get(utf);
                if (jVar == null && (jVar = j.f421875c.get(utf)) == null) {
                    throw new DateTimeException(G.f("Unknown chronology: ", utf));
                }
                objQ = jVar;
                this.f421928c = objQ;
                return;
            case 12:
                int i18 = e.f421864d;
                objQ = ((c) objectInput.readObject()).o((org.threeten.bp.g) objectInput.readObject());
                this.f421928c = objQ;
                return;
            case 13:
                int i19 = i.f421869e;
                objQ = ((d) objectInput.readObject()).o((org.threeten.bp.q) objectInput.readObject()).A((org.threeten.bp.o) objectInput.readObject());
                this.f421928c = objQ;
                return;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b12 = this.f421927b;
        Object obj = this.f421928c;
        objectOutput.writeByte(b12);
        switch (b12) {
            case 1:
                q qVar = (q) obj;
                qVar.getClass();
                objectOutput.writeInt(qVar.k(ChronoField.f422123E));
                objectOutput.writeByte(qVar.k(ChronoField.f422120B));
                objectOutput.writeByte(qVar.k(ChronoField.f422146w));
                return;
            case 2:
                objectOutput.writeByte(((r) obj).f421919b);
                return;
            case 3:
                n nVar = (n) obj;
                nVar.getClass();
                objectOutput.writeInt(nVar.k(ChronoField.f422123E));
                objectOutput.writeByte(nVar.k(ChronoField.f422120B));
                objectOutput.writeByte(nVar.k(ChronoField.f422146w));
                return;
            case 4:
                objectOutput.writeByte(((HijrahEra) obj).ordinal());
                return;
            case 5:
                t tVar = (t) obj;
                tVar.getClass();
                objectOutput.writeInt(tVar.k(ChronoField.f422123E));
                objectOutput.writeByte(tVar.k(ChronoField.f422120B));
                objectOutput.writeByte(tVar.k(ChronoField.f422146w));
                return;
            case 6:
                objectOutput.writeByte(((MinguoEra) obj).ordinal());
                return;
            case 7:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(wVar.k(ChronoField.f422123E));
                objectOutput.writeByte(wVar.k(ChronoField.f422120B));
                objectOutput.writeByte(wVar.k(ChronoField.f422146w));
                return;
            case 8:
                objectOutput.writeByte(((ThaiBuddhistEra) obj).ordinal());
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((j) obj).l());
                return;
            case 12:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.f421865b);
                objectOutput.writeObject(eVar.f421866c);
                return;
            case 13:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.f421870b);
                objectOutput.writeObject(iVar.f421871c);
                objectOutput.writeObject(iVar.f421872d);
                return;
        }
    }

    public u(byte b12, Object obj) {
        this.f421927b = b12;
        this.f421928c = obj;
    }
}
