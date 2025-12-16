package org.threeten.bp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: Ser.java */
/* loaded from: classes8.dex */
final class l implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: b, reason: collision with root package name */
    public byte f422092b;

    /* renamed from: c, reason: collision with root package name */
    public Object f422093c;

    public l() {
    }

    public static Serializable a(byte b12, ObjectInput objectInput) throws IOException {
        r rVar;
        r rVar2;
        if (b12 == 64) {
            int i12 = h.f422078d;
            return h.o(objectInput.readByte(), objectInput.readByte());
        }
        switch (b12) {
            case 1:
                c cVar = c.f421847d;
                long j12 = objectInput.readLong();
                long j13 = objectInput.readInt();
                return c.b(w81.d.e(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, j13), w81.d.h(j12, w81.d.c(j13, 1000000000L)));
            case 2:
                d dVar = d.f421934d;
                return d.q(objectInput.readLong(), objectInput.readInt());
            case 3:
                e eVar = e.f421939e;
                return e.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                f fVar = f.f421946d;
                e eVar2 = e.f421939e;
                return f.G(e.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.G(objectInput));
            case 5:
                return g.G(objectInput);
            case 6:
                int i13 = s.f422114e;
                f fVar2 = f.f421946d;
                e eVar3 = e.f421939e;
                f fVarG = f.G(e.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.G(objectInput));
                q qVarZ = q.z(objectInput);
                o oVar = (o) a(objectInput.readByte(), objectInput);
                w81.d.f(oVar, "zone");
                if (!(oVar instanceof q) || qVarZ.equals(oVar)) {
                    return new s(fVarG, oVar, qVarZ);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                Pattern pattern = r.f422111e;
                String utf = objectInput.readUTF();
                if (utf.equals("Z") || utf.startsWith("+") || utf.startsWith("-")) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(utf));
                }
                if (utf.equals("UTC") || utf.equals("GMT") || utf.equals("UT")) {
                    q qVar = q.f422106g;
                    qVar.getClass();
                    return new r(utf, org.threeten.bp.zone.f.g(qVar));
                }
                if (utf.startsWith("UTC+") || utf.startsWith("GMT+") || utf.startsWith("UTC-") || utf.startsWith("GMT-")) {
                    q qVarU = q.u(utf.substring(3));
                    if (qVarU.f422109c == 0) {
                        rVar = new r(utf.substring(0, 3), org.threeten.bp.zone.f.g(qVarU));
                    } else {
                        rVar = new r(utf.substring(0, 3) + qVarU.f422110d, org.threeten.bp.zone.f.g(qVarU));
                    }
                    return rVar;
                }
                if (!utf.startsWith("UT+") && !utf.startsWith("UT-")) {
                    return r.t(utf, false);
                }
                q qVarU2 = q.u(utf.substring(2));
                if (qVarU2.f422109c == 0) {
                    rVar2 = new r("UT", org.threeten.bp.zone.f.g(qVarU2));
                } else {
                    rVar2 = new r("UT" + qVarU2.f422110d, org.threeten.bp.zone.f.g(qVarU2));
                }
                return rVar2;
            case 8:
                return q.z(objectInput);
            default:
                switch (b12) {
                    case 66:
                        int i14 = j.f422086d;
                        return new j(g.G(objectInput), q.z(objectInput));
                    case 67:
                        int i15 = m.f422094c;
                        return m.q(objectInput.readInt());
                    case 68:
                        int i16 = n.f422098d;
                        int i17 = objectInput.readInt();
                        byte b13 = objectInput.readByte();
                        ChronoField.f422123E.i(i17);
                        ChronoField.f422120B.i(b13);
                        return new n(i17, b13);
                    case 69:
                        int i18 = i.f422082d;
                        e eVar4 = e.f421939e;
                        return new i(f.G(e.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.G(objectInput)), q.z(objectInput));
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f422093c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b12 = objectInput.readByte();
        this.f422092b = b12;
        this.f422093c = a(b12, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b12 = this.f422092b;
        Object obj = this.f422093c;
        objectOutput.writeByte(b12);
        if (b12 == 64) {
            h hVar = (h) obj;
            objectOutput.writeByte(hVar.f422079b);
            objectOutput.writeByte(hVar.f422080c);
            return;
        }
        switch (b12) {
            case 1:
                c cVar = (c) obj;
                objectOutput.writeLong(cVar.f421848b);
                objectOutput.writeInt(cVar.f421849c);
                return;
            case 2:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f421935b);
                objectOutput.writeInt(dVar.f421936c);
                return;
            case 3:
                e eVar = (e) obj;
                objectOutput.writeInt(eVar.f421941b);
                objectOutput.writeByte(eVar.f421942c);
                objectOutput.writeByte(eVar.f421943d);
                return;
            case 4:
                f fVar = (f) obj;
                e eVar2 = fVar.f421948b;
                objectOutput.writeInt(eVar2.f421941b);
                objectOutput.writeByte(eVar2.f421942c);
                objectOutput.writeByte(eVar2.f421943d);
                fVar.f421949c.O(objectOutput);
                return;
            case 5:
                ((g) obj).O(objectOutput);
                return;
            case 6:
                s sVar = (s) obj;
                f fVar2 = sVar.f422115b;
                e eVar3 = fVar2.f421948b;
                objectOutput.writeInt(eVar3.f421941b);
                objectOutput.writeByte(eVar3.f421942c);
                objectOutput.writeByte(eVar3.f421943d);
                fVar2.f421949c.O(objectOutput);
                sVar.f422116c.A(objectOutput);
                sVar.f422117d.s(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((r) obj).f422112c);
                return;
            case 8:
                ((q) obj).A(objectOutput);
                return;
            default:
                switch (b12) {
                    case 66:
                        j jVar = (j) obj;
                        jVar.f422087b.O(objectOutput);
                        jVar.f422088c.A(objectOutput);
                        return;
                    case 67:
                        objectOutput.writeInt(((m) obj).f422095b);
                        return;
                    case 68:
                        n nVar = (n) obj;
                        objectOutput.writeInt(nVar.f422099b);
                        objectOutput.writeByte(nVar.f422100c);
                        return;
                    case 69:
                        i iVar = (i) obj;
                        f fVar3 = iVar.f422083b;
                        e eVar4 = fVar3.f421948b;
                        objectOutput.writeInt(eVar4.f421941b);
                        objectOutput.writeByte(eVar4.f421942c);
                        objectOutput.writeByte(eVar4.f421943d);
                        fVar3.f421949c.O(objectOutput);
                        iVar.f422084c.A(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    public l(byte b12, Object obj) {
        this.f422092b = b12;
        this.f422093c = obj;
    }
}
