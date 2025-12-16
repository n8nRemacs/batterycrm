package defpackage;

/* loaded from: classes.dex */
public final class w6f {
    public static final bwf h = new bwf(new nte(9));
    public final s6f a;
    public final v6f b;
    public final s6f c;
    public final s6f d;
    public final s6f e;
    public final s6f f;
    public final boolean g;

    public w6f(s6f s6fVar, v6f v6fVar, s6f s6fVar2, s6f s6fVar3, s6f s6fVar4, s6f s6fVar5, boolean z) {
        this.a = s6fVar;
        this.b = v6fVar;
        this.c = s6fVar2;
        this.d = s6fVar3;
        this.e = s6fVar4;
        this.f = s6fVar5;
        this.g = z;
    }

    public static w6f a(w6f w6fVar, v6f v6fVar, boolean z, int i) {
        s6f s6fVar = w6fVar.a;
        if ((i & 2) != 0) {
            v6fVar = w6fVar.b;
        }
        s6f s6fVar2 = w6fVar.c;
        s6f s6fVar3 = w6fVar.d;
        s6f s6fVar4 = w6fVar.e;
        s6f s6fVar5 = w6fVar.f;
        w6fVar.getClass();
        return new w6f(s6fVar, v6fVar, s6fVar2, s6fVar3, s6fVar4, s6fVar5, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6f)) {
            return false;
        }
        w6f w6fVar = (w6f) obj;
        return this.a.equals(w6fVar.a) && fni.a(this.b, w6fVar.b) && this.c.equals(w6fVar.c) && this.d.equals(w6fVar.d) && this.e.equals(w6fVar.e) && this.f.equals(w6fVar.f) && this.g == w6fVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SoundConfig(end=");
        sb.append(this.a);
        sb.append(", ringtone=");
        sb.append(this.b);
        sb.append(", beep=");
        sb.append(this.c);
        sb.append(", connecting=");
        sb.append(this.d);
        sb.append(", connected=");
        sb.append(this.e);
        sb.append(", busy=");
        sb.append(this.f);
        sb.append(", canVibration=");
        return az1.k(sb, this.g, ")");
    }
}
