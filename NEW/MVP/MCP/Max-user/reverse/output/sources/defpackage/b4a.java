package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public class b4a extends ml0 {
    public final List i;

    public b4a(List list, long j, long j2, long j3, ry ryVar, boolean z, int i, int i2) {
        super(j2, j, false, j3, ryVar, z, i, i2);
        this.i = list;
    }

    @Override // defpackage.f2h
    public final Uri a() {
        return xpi.q(((z3a) this.i.get(0)).a);
    }

    @Override // defpackage.ml0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.i.equals(((b4a) obj).i);
        }
        return false;
    }

    @Override // defpackage.f2h
    public final int getHeight() {
        List list = this.i;
        if (list.isEmpty()) {
            return 0;
        }
        return ((z3a) list.get(0)).c;
    }

    @Override // defpackage.f2h
    public final int getWidth() {
        List list = this.i;
        if (list.isEmpty()) {
            return 0;
        }
        return ((z3a) list.get(0)).b;
    }

    @Override // defpackage.ml0
    public int hashCode() {
        return this.i.hashCode() + (super.hashCode() * 31);
    }

    public b4a(long j, long j2, List list, boolean z) {
        this(list, j, j2, 0L, null, z, -1, -1);
    }
}
