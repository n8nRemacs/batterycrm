package org.threeten.bp;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.zone.ZoneRulesException;

/* compiled from: ZoneRegion.java */
/* loaded from: classes8.dex */
final class r extends o implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f422111e = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: c, reason: collision with root package name */
    public final String f422112c;

    /* renamed from: d, reason: collision with root package name */
    public final transient org.threeten.bp.zone.f f422113d;

    public r(String str, org.threeten.bp.zone.f fVar) {
        this.f422112c = str;
        this.f422113d = fVar;
    }

    private Object readResolve() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static r t(String str, boolean z12) {
        org.threeten.bp.zone.f fVarG;
        w81.d.f(str, "zoneId");
        if (str.length() < 2 || !f422111e.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        try {
            fVarG = org.threeten.bp.zone.i.a(str, true);
        } catch (ZoneRulesException e12) {
            if (str.equals("GMT0")) {
                q qVar = q.f422106g;
                qVar.getClass();
                fVarG = org.threeten.bp.zone.f.g(qVar);
            } else {
                if (z12) {
                    throw e12;
                }
                fVarG = null;
            }
        }
        return new r(str, fVarG);
    }

    private Object writeReplace() {
        return new l((byte) 7, this);
    }

    @Override // org.threeten.bp.o
    public final String h() {
        return this.f422112c;
    }

    @Override // org.threeten.bp.o
    public final org.threeten.bp.zone.f o() {
        org.threeten.bp.zone.f fVar = this.f422113d;
        return fVar != null ? fVar : org.threeten.bp.zone.i.a(this.f422112c, false);
    }

    @Override // org.threeten.bp.o
    public final void s(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f422112c);
    }
}
