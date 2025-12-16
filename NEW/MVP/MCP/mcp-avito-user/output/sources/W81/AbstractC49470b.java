package w81;

import org.threeten.bp.e;
import org.threeten.bp.temporal.k;

/* compiled from: DefaultInterfaceTemporal.java */
/* renamed from: w81.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49470b extends AbstractC49471c implements org.threeten.bp.temporal.c {
    /* renamed from: e */
    public org.threeten.bp.temporal.c x(e eVar) {
        return eVar.a(this);
    }

    public org.threeten.bp.temporal.c i(long j12, k kVar) {
        return j12 == Long.MIN_VALUE ? r(Long.MAX_VALUE, kVar).r(1L, kVar) : r(-j12, kVar);
    }
}
