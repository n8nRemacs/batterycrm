package b61;

import java.util.Collections;
import java.util.Map;

/* compiled from: SimpleRemapper.java */
/* loaded from: classes7.dex */
public class j extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f56933a;

    public j(String str, String str2) {
        this.f56933a = Collections.singletonMap(str, str2);
    }

    @Override // b61.h
    public final String a(String str) {
        return this.f56933a.get(str);
    }

    @Override // b61.h
    public final String b(String str, String str2) {
        String strA = a(str + '.' + str2);
        return strA == null ? str2 : strA;
    }

    @Override // b61.h
    public final String d(String str, String str2) {
        String strA = a(str + '.' + str2);
        return strA == null ? str2 : strA;
    }

    @Override // b61.h
    public final String e(String str, String str2) {
        String strA = a("." + str + str2);
        return strA == null ? str : strA;
    }

    @Override // b61.h
    public final String g(String str, String str2, String str3) {
        String strA = a(str + '.' + str2 + str3);
        return strA == null ? str2 : strA;
    }
}
