package kotlin.reflect.jvm.internal.impl.name;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;

/* compiled from: FqName.java */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f409242c = new c("");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f409243a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f409244b;

    public c(@Y61.k String str) {
        if (str != null) {
            this.f409243a = new d(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i13 = 2;
                break;
            case 8:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = PluralsKeys.OTHER;
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i12) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i12) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Y61.k
    public static c j(@Y61.k f fVar) {
        if (fVar == null) {
            a(14);
            throw null;
        }
        if (fVar != null) {
            return new c(new d(fVar.b(), f409242c.i(), fVar));
        }
        d.a(17);
        throw null;
    }

    @Y61.k
    public final String b() {
        String str = this.f409243a.f409248a;
        if (str != null) {
            return str;
        }
        d.a(4);
        throw null;
    }

    @Y61.k
    public final c c(@Y61.k f fVar) {
        if (fVar != null) {
            return new c(this.f409243a.b(fVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f409243a.f409248a.isEmpty();
    }

    @Y61.k
    public final c e() {
        c cVar = this.f409244b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        d dVar = this.f409243a;
        d dVar2 = dVar.f409250c;
        if (dVar2 == null) {
            if (dVar.f409248a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            dVar.c();
            dVar2 = dVar.f409250c;
            if (dVar2 == null) {
                d.a(8);
                throw null;
            }
        }
        c cVar2 = new c(dVar2);
        this.f409244b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f409243a.equals(((c) obj).f409243a);
    }

    @Y61.k
    public final f f() {
        f fVarF = this.f409243a.f();
        if (fVarF != null) {
            return fVarF;
        }
        a(9);
        throw null;
    }

    @Y61.k
    public final f g() {
        f fVarF;
        d dVar = this.f409243a;
        if (dVar.f409248a.isEmpty()) {
            fVarF = d.f409245e;
            if (fVarF == null) {
                d.a(12);
                throw null;
            }
        } else {
            fVarF = dVar.f();
            if (fVarF == null) {
                d.a(13);
                throw null;
            }
        }
        return fVarF;
    }

    public final boolean h(@Y61.k f fVar) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        String str = this.f409243a.f409248a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = fVar.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f409243a.f409248a.hashCode();
    }

    @Y61.k
    public final d i() {
        d dVar = this.f409243a;
        if (dVar != null) {
            return dVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f409243a.toString();
    }

    public c(@Y61.k d dVar) {
        if (dVar != null) {
            this.f409243a = dVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(@Y61.k d dVar, c cVar) {
        this.f409243a = dVar;
        this.f409244b = cVar;
    }
}
