package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.q;

/* compiled from: ZoneRules.java */
/* loaded from: classes16.dex */
public abstract class f {

    /* compiled from: ZoneRules.java */
    public static final class a extends f implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;

        /* renamed from: b, reason: collision with root package name */
        public final q f422255b;

        public a(q qVar) {
            this.f422255b = qVar;
        }

        @Override // org.threeten.bp.zone.f
        public final q a(org.threeten.bp.d dVar) {
            return this.f422255b;
        }

        @Override // org.threeten.bp.zone.f
        public final e b(org.threeten.bp.f fVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.f
        public final List<q> c(org.threeten.bp.f fVar) {
            return Collections.singletonList(this.f422255b);
        }

        @Override // org.threeten.bp.zone.f
        public final boolean d(org.threeten.bp.d dVar) {
            return false;
        }

        @Override // org.threeten.bp.zone.f
        public final boolean e() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean z12 = obj instanceof a;
            q qVar = this.f422255b;
            if (z12) {
                return qVar.equals(((a) obj).f422255b);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.e() && qVar.equals(bVar.a(org.threeten.bp.d.f421934d));
        }

        @Override // org.threeten.bp.zone.f
        public final boolean f(org.threeten.bp.f fVar, q qVar) {
            return this.f422255b.equals(qVar);
        }

        public final int hashCode() {
            int i12 = this.f422255b.f422109c;
            return ((i12 + 31) ^ (i12 + 31)) ^ 1;
        }

        public final String toString() {
            return "FixedRules:" + this.f422255b;
        }
    }

    public static f g(q qVar) {
        w81.d.f(qVar, "offset");
        return new a(qVar);
    }

    public abstract q a(org.threeten.bp.d dVar);

    public abstract e b(org.threeten.bp.f fVar);

    public abstract List<q> c(org.threeten.bp.f fVar);

    public abstract boolean d(org.threeten.bp.d dVar);

    public abstract boolean e();

    public abstract boolean f(org.threeten.bp.f fVar, q qVar);
}
