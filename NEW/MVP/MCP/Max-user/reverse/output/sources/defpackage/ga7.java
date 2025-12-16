package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ga7 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;

    public ga7(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = arrayList;
        this.h = str5;
        this.i = str6;
        this.a = fni.a(str, "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        return str.substring(vmf.C(str, ':', length, 4) + 1, vmf.C(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iC = vmf.C(str, '/', length, 4);
        return str.substring(iC, yxg.f(str, iC, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iC = vmf.C(str, '/', length, 4);
        int iF = yxg.f(str, iC, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iC < iF) {
            int i = iC + 1;
            int iE = yxg.e('/', i, iF, str);
            arrayList.add(str.substring(i, iE));
            iC = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iC = vmf.C(str, '?', 0, 6) + 1;
        return str.substring(iC, yxg.e('#', iC, str.length(), str));
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int iF = yxg.f(str, length, str.length(), ":@");
        if (str != null) {
            return str.substring(length, iF);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ga7) && fni.a(((ga7) obj).i, this.i);
    }

    public final an3 f() {
        an3 an3Var = new an3();
        String str = this.b;
        an3Var.e = str;
        an3Var.f = e();
        an3Var.g = a();
        an3Var.h = this.e;
        int iB = mni.B(str);
        int i = this.f;
        if (i == iB) {
            i = -1;
        }
        an3Var.b = i;
        ArrayList arrayList = an3Var.c;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        an3Var.d = strD != null ? mni.F(mni.y(strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(vmf.C(str2, '#', 0, 6) + 1);
        }
        an3Var.i = strSubstring;
        return an3Var;
    }

    public final String g(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        ro7 ro7VarG = n7j.g(n7j.h(0, list.size()), 2);
        int i = ro7VarG.a;
        int i2 = ro7VarG.b;
        int i3 = ro7VarG.c;
        if (i3 >= 0) {
            if (i > i2) {
                return null;
            }
        } else if (i < i2) {
            return null;
        }
        while (!str.equals((String) list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final String h() {
        an3 an3Var;
        try {
            an3Var = new an3();
            an3Var.j(this, "/...");
        } catch (IllegalArgumentException unused) {
            an3Var = null;
        }
        an3Var.getClass();
        an3Var.f = mni.y("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        an3Var.g = mni.y("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return an3Var.b().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        an3 an3VarF = f();
        ArrayList arrayList = an3VarF.c;
        String str = (String) an3VarF.h;
        an3VarF.h = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, mni.y((String) arrayList.get(i), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = an3VarF.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? mni.y(str2, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str3 = (String) an3VarF.i;
        an3VarF.i = str3 != null ? mni.y(str3, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = an3VarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
