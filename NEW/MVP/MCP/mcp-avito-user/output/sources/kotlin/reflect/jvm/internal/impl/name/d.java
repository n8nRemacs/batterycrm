package kotlin.reflect.jvm.internal.impl.name;

import Y41.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: FqNameUnsafe.java */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final f f409245e = f.h("<root>");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f409246f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    public static final l<String, f> f409247g = new a();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f409248a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f409249b;

    /* renamed from: c, reason: collision with root package name */
    public transient d f409250c;

    /* renamed from: d, reason: collision with root package name */
    public transient f f409251d;

    /* compiled from: FqNameUnsafe.java */
    public static class a implements l<String, f> {
        @Override // Y41.l
        public final f invoke(String str) {
            return f.d(str);
        }
    }

    public d(@Y61.k String str, @Y61.k c cVar) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (cVar == null) {
            a(1);
            throw null;
        }
        this.f409248a = str;
        this.f409249b = cVar;
    }

    public static /* synthetic */ void a(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i13 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        if (i12 != 1) {
            switch (i12) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = PluralsKeys.OTHER;
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i12) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Y61.k
    public final d b(@Y61.k f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
            throw null;
        }
        String str = this.f409248a;
        if (str.isEmpty()) {
            strB = fVar.b();
        } else {
            strB = str + "." + fVar.b();
        }
        return new d(strB, this, fVar);
    }

    public final void c() {
        String str = this.f409248a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f409251d = f.d(str.substring(iLastIndexOf + 1));
            this.f409250c = new d(str.substring(0, iLastIndexOf));
        } else {
            this.f409251d = f.d(str);
            this.f409250c = c.f409242c.i();
        }
    }

    public final boolean d() {
        if (this.f409249b == null) {
            String str = this.f409248a;
            if (str == null) {
                a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public final List<f> e() {
        List<f> listEmptyList;
        String str = this.f409248a;
        if (str.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            String[] strArrSplit = f409246f.split(str);
            l<String, f> lVar = f409247g;
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(((a) lVar).invoke(str2));
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f409248a.equals(((d) obj).f409248a);
    }

    @Y61.k
    public final f f() {
        f fVar = this.f409251d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            a(10);
            throw null;
        }
        if (this.f409248a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        f fVar2 = this.f409251d;
        if (fVar2 != null) {
            return fVar2;
        }
        a(11);
        throw null;
    }

    @Y61.k
    public final c g() {
        c cVar = this.f409249b;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f409249b = cVar2;
            return cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f409248a.hashCode();
    }

    @Y61.k
    public final String toString() {
        String strB = this.f409248a;
        if (strB.isEmpty()) {
            strB = f409245e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(18);
        throw null;
    }

    public d(@Y61.k String str) {
        if (str != null) {
            this.f409248a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public d(@Y61.k String str, d dVar, f fVar) {
        if (str != null) {
            this.f409248a = str;
            this.f409250c = dVar;
            this.f409251d = fVar;
            return;
        }
        a(3);
        throw null;
    }
}
