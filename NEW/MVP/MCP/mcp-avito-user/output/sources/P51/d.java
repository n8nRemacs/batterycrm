package p51;

import Y61.k;

/* compiled from: JvmClassName.java */
/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f428199a;

    public d(@k String str) {
        if (str != null) {
            this.f428199a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 3 || i12 == 6 || i12 == 7 || i12 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 3 || i12 == 6 || i12 == 7 || i12 == 8) ? 2 : 3];
        switch (i12) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i12 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i12 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i12 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i12 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i12) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 3 && i12 != 6 && i12 != 7 && i12 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @k
    public static d b(@k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar == null) {
            a(1);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVar.g();
        String strReplace = bVar.h().b().replace('.', '$');
        if (cVarG.d()) {
            return new d(strReplace);
        }
        return new d(cVarG.b().replace('.', '/') + "/" + strReplace);
    }

    @k
    public static d c(@k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar != null) {
            return new d(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    @k
    public static d d(@k String str) {
        if (str != null) {
            return new d(str);
        }
        a(0);
        throw null;
    }

    @k
    public final String e() {
        String str = this.f428199a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f428199a.equals(((d) obj).f428199a);
    }

    public final int hashCode() {
        return this.f428199a.hashCode();
    }

    public final String toString() {
        return this.f428199a;
    }
}
