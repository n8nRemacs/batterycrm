package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: Name.java */
/* loaded from: classes8.dex */
public final class f implements Comparable<f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f409252b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f409253c;

    public f(@Y61.k String str, boolean z12) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f409252b = str;
        this.f409253c = z12;
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) ? 2 : 3];
        if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i12 == 1) {
            objArr[1] = "asString";
        } else if (i12 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i12 == 3 || i12 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Y61.k
    public static f d(@Y61.k String str) {
        if (str != null) {
            return str.startsWith("<") ? h(str) : e(str);
        }
        a(9);
        throw null;
    }

    @Y61.k
    public static f e(@Y61.k String str) {
        if (str != null) {
            return new f(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(@Y61.k String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public static f h(@Y61.k String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Y61.k
    public final String b() {
        String str = this.f409252b;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    @Y61.k
    public final String c() {
        if (this.f409253c) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        return this.f409252b.compareTo(fVar.f409252b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f409253c == fVar.f409253c && this.f409252b.equals(fVar.f409252b);
    }

    public final int hashCode() {
        return (this.f409252b.hashCode() * 31) + (this.f409253c ? 1 : 0);
    }

    public final String toString() {
        return this.f409252b;
    }
}
