package Y71;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: StringUtil.java */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19338a = Pattern.compile("([A-Z\\d][^A-Z\\d]*)");

    public static String a(String str, String str2, List list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        for (Object obj : list) {
            sb2.append(str2);
            sb2.append(obj);
            sb2.append("\n");
        }
        return sb2.substring(0, sb2.length() - 1);
    }

    public static String b(Object... objArr) {
        return a("\n", "", Arrays.asList(objArr));
    }
}
