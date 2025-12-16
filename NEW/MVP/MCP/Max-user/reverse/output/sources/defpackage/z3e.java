package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class z3e {
    public static final z3e c;
    public final tl a;
    public final a2f b;

    static {
        z3e z3eVar = new z3e(a2f.d, tl.e);
        c = z3eVar;
        z3eVar.d(Uri.parse("https://api.odnoklassniki.ru"));
    }

    public z3e(a2f a2fVar, tl tlVar) {
        this.b = a2fVar;
        this.a = tlVar;
    }

    public final Uri a() {
        a2f a2fVar = this.b;
        int iBinarySearch = Arrays.binarySearch(a2fVar.a, "api");
        return (Uri) (iBinarySearch < 0 ? null : a2fVar.b[iBinarySearch]);
    }

    public final z3e b(String str) {
        tl tlVar = this.a;
        return Objects.equals(str, tlVar.a) ? this : new z3e(this.b, tlVar.a(str));
    }

    public final z3e c(String str, String str2) {
        tl tlVar = this.a;
        return (Objects.equals(str, tlVar.c) && Objects.equals(str2, tlVar.d)) ? this : new z3e(this.b, tlVar.b(str, str2));
    }

    public final z3e d(Uri uri) {
        a2f a2fVar;
        a2f a2fVar2 = this.b;
        int i = a2fVar2.c;
        Comparable[] comparableArr = a2fVar2.a;
        Object[] objArr = a2fVar2.b;
        int iBinarySearch = Arrays.binarySearch(comparableArr, "api");
        if (iBinarySearch < 0) {
            int i2 = -iBinarySearch;
            int i3 = i2 - 1;
            int i4 = i + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(comparableArr.getClass().getComponentType(), i4);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i3);
            comparableArr2[i3] = "api";
            System.arraycopy(comparableArr, i3, comparableArr2, i2, comparableArr.length - i3);
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr2[i3] = uri;
            System.arraycopy(objArr, i3, objArr2, i2, objArr.length - i3);
            a2fVar = new a2f(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[iBinarySearch], uri)) {
            a2fVar = a2fVar2;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iBinarySearch] = uri;
            a2fVar = new a2f(comparableArr, objArrCopyOf);
        }
        return a2fVar == a2fVar2 ? this : new z3e(a2fVar, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z3e.class == obj.getClass()) {
            z3e z3eVar = (z3e) obj;
            if (this.a.equals(z3eVar.a) && this.b.equals(z3eVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
