package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class pf4 {
    public static final Pattern d = Pattern.compile("\\|[^\\|]*\\|");
    public static final Pattern e = Pattern.compile("f{1,9}");
    public static final ArrayList f;
    public final String a;
    public ArrayList b;
    public ArrayList c;

    static {
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add("YYYY");
        arrayList.add("YY");
        arrayList.add("MMMM");
        arrayList.add("MMM");
        arrayList.add("MM");
        arrayList.add("M");
        arrayList.add("DD");
        arrayList.add("D");
        arrayList.add("WWWW");
        arrayList.add("WWW");
        arrayList.add("hh12");
        arrayList.add("h12");
        arrayList.add("hh");
        arrayList.add("h");
        arrayList.add("mm");
        arrayList.add("m");
        arrayList.add("ss");
        arrayList.add("s");
        arrayList.add("a");
        arrayList.add("fffffffff");
        arrayList.add("ffffffff");
        arrayList.add("fffffff");
        arrayList.add("ffffff");
        arrayList.add("fffff");
        arrayList.add("ffff");
        arrayList.add("fff");
        arrayList.add("ff");
        arrayList.add("f");
    }

    public pf4(String str) {
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        this.a = str;
        if (!qoi.c(str)) {
            throw new IllegalArgumentException("DateTime format has no content.");
        }
    }

    public static String a(String str) {
        return (qoi.c(str) && str.length() == 1) ? "0".concat(str) : str;
    }

    public static String b(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }
}
