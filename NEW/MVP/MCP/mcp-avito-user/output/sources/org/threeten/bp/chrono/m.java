package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.ChronoField;

/* compiled from: HijrahChronology.java */
/* loaded from: classes8.dex */
public final class m extends j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final m f421876d = new m();
    private static final long serialVersionUID = 3127340209035924785L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BH", "HE"});
        map2.put("en", new String[]{"B.H.", "H.E."});
        map3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private Object readResolve() {
        return f421876d;
    }

    @Override // org.threeten.bp.chrono.j
    public final c a(int i12, int i13, int i14) {
        return n.O(i12, i13, i14);
    }

    @Override // org.threeten.bp.chrono.j
    public final c b(org.threeten.bp.temporal.d dVar) {
        return dVar instanceof n ? (n) dVar : new n(dVar.m(ChronoField.f422148y));
    }

    @Override // org.threeten.bp.chrono.j
    public final c c(long j12) {
        org.threeten.bp.e eVarP = org.threeten.bp.e.P(j12);
        int[] iArr = n.f421882i;
        return new n(eVarP.v());
    }

    @Override // org.threeten.bp.chrono.j
    public final l h(int i12) {
        if (i12 == 0) {
            return HijrahEra.f421851b;
        }
        if (i12 == 1) {
            return HijrahEra.f421852c;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    @Override // org.threeten.bp.chrono.j
    public final String k() {
        return "islamic-umalqura";
    }

    @Override // org.threeten.bp.chrono.j
    public final String l() {
        return "Hijrah-umalqura";
    }

    @Override // org.threeten.bp.chrono.j
    public final h<n> q(org.threeten.bp.d dVar, org.threeten.bp.o oVar) {
        return i.C(this, dVar, oVar);
    }
}
