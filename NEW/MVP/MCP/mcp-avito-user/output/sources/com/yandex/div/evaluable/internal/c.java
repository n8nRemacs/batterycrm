package com.yandex.div.evaluable.internal;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: Tokenizer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/c;", "", "<init>", "()V", "a", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f369985a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String[] f369986b = {"'", "@{"};

    /* compiled from: Tokenizer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/internal/c$a;", "", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f369987a;

        /* renamed from: b, reason: collision with root package name */
        public int f369988b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f369989c = new ArrayList();

        public a(@k String str) {
            this.f369987a = str;
        }

        public static char c(a aVar) {
            int i12 = aVar.f369988b + 1;
            String str = aVar.f369987a;
            if (i12 >= str.length()) {
                return (char) 0;
            }
            return str.charAt(aVar.f369988b + 1);
        }

        public static char d(a aVar) {
            int i12 = aVar.f369988b - 1;
            if (i12 >= 0) {
                return aVar.f369987a.charAt(i12);
            }
            return (char) 0;
        }

        public final char a() {
            int i12 = this.f369988b;
            String str = this.f369987a;
            if (i12 >= str.length()) {
                return (char) 0;
            }
            return str.charAt(this.f369988b);
        }

        public final int b(int i12) {
            int i13 = this.f369988b;
            this.f369988b = i12 + i13;
            return i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f369987a, ((a) obj).f369987a);
        }

        public final int hashCode() {
            return this.f369987a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TokenizationState(source="), this.f369987a, ')');
        }
    }

    public static EvaluableException a(a aVar) {
        return new EvaluableException("Invalid token '" + aVar.a() + "' at position " + aVar.f369988b, null, 2, null);
    }

    public static boolean b(char c12) {
        return ('a' <= c12 && c12 < '{') || ('A' <= c12 && c12 < '[') || c12 == '_';
    }

    public static boolean c(char c12, a aVar) {
        if (c12 != '\'') {
            return false;
        }
        int i12 = aVar.f369988b;
        String str = aVar.f369987a;
        if (i12 < str.length()) {
            int i13 = 0;
            for (int i14 = aVar.f369988b - 1; i14 > 0 && str.charAt(i14) == '\\'; i14--) {
                i13++;
            }
            if (i13 % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(char c12, char c13, char c14) {
        if (Character.isDigit(c12)) {
            return true;
        }
        return c12 == '.' ? Character.isDigit(c14) : c12 != 'e' && c12 != 'E' ? !((c12 != '+' && c12 != '-') || ((c13 != 'e' && c13 != 'E') || !Character.isDigit(c14))) : !(!Character.isDigit(c13) || (!Character.isDigit(c14) && c14 != '+' && c14 != '-'));
    }

    public static boolean e(ArrayList arrayList) {
        if (arrayList.isEmpty() || (C42745f0.Q(arrayList) instanceof b.d.e)) {
            return false;
        }
        return (C42745f0.Q(arrayList) instanceof b.c) || (C42745f0.Q(arrayList) instanceof b.a.C10895b);
    }

    public static boolean f(char c12, a aVar) {
        return c12 == '@' && a.d(aVar) != '\\' && a.c(aVar) == '{';
    }

    public static boolean g(ArrayList arrayList) {
        return (e(arrayList) || (C42745f0.S(arrayList) instanceof b.d.e)) ? false : true;
    }

    public static String h(a aVar, boolean z12) {
        int i12;
        int i13 = aVar.f369988b;
        while (true) {
            if ((aVar.a() == 0) || f(aVar.a(), aVar) || (z12 && c(aVar.a(), aVar))) {
                break;
            }
            aVar.b(1);
        }
        String strSubstring = aVar.f369987a.substring(i13, aVar.f369988b);
        StringBuilder sb2 = new StringBuilder();
        for (int i14 = 0; i14 < strSubstring.length(); i14 = i12) {
            if (strSubstring.charAt(i14) == '\\') {
                i12 = i14;
                while (i12 < strSubstring.length() && strSubstring.charAt(i12) == '\\') {
                    i12++;
                }
                int i15 = i12 - i14;
                int i16 = i15 / 2;
                int i17 = 0;
                while (i17 < i16) {
                    i17++;
                    sb2.append('\\');
                }
                if (i15 % 2 != 1) {
                    continue;
                } else {
                    if (i12 == strSubstring.length() || strSubstring.charAt(i12) == ' ') {
                        throw new TokenizingException(L.j(Integer.valueOf(i12 - 1), "Alone backslash at "), null, 2, null);
                    }
                    LinkedHashSet linkedHashSetJ0 = C42756l.j0(f369986b);
                    int i18 = 0;
                    String str = null;
                    while (true) {
                        if ((str != null && str.length() != 0) || linkedHashSetJ0.isEmpty() || i12 >= strSubstring.length()) {
                            break;
                        }
                        Iterator it = linkedHashSetJ0.iterator();
                        while (true) {
                            if (!it.hasNext() || i12 >= strSubstring.length()) {
                                break;
                            }
                            String str2 = (String) it.next();
                            if (str2.charAt(i18) == strSubstring.charAt(i12)) {
                                if (i18 == str2.length() - 1) {
                                    str = str2;
                                    break;
                                }
                            } else {
                                it.remove();
                            }
                        }
                        i18++;
                        i12++;
                    }
                    if (str == null || str.length() == 0) {
                        throw new EvaluableException("Incorrect string escape", null, 2, null);
                    }
                    sb2.append(str);
                }
            } else {
                i12 = i14 + 1;
                sb2.append(strSubstring.charAt(i14));
            }
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x037e, code lost:
    
        r7 = r3 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0384, code lost:
    
        if (r16.a() != '}') goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0386, code lost:
    
        r16.b(r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03db, code lost:
    
        throw new com.yandex.div.evaluable.TokenizingException(kotlin.jvm.internal.L.j(java.lang.Integer.valueOf(r16.f369988b), "'}' expected at end of expression at "), null, 2, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.yandex.div.evaluable.internal.b$d$e$c] */
    /* JADX WARN: Type inference failed for: r6v24, types: [com.yandex.div.evaluable.internal.b$d$e$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(com.yandex.div.evaluable.internal.c.a r16, java.util.ArrayList r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.c.i(com.yandex.div.evaluable.internal.c$a, java.util.ArrayList, boolean):void");
    }

    @k
    public static ArrayList j(@k String str) {
        a aVar = new a(str);
        ArrayList arrayList = aVar.f369989c;
        try {
            i(aVar, arrayList, false);
            return arrayList;
        } catch (EvaluableException e12) {
            if (e12 instanceof TokenizingException) {
                throw new EvaluableException(AK.c.k("Error tokenizing '", str, "'."), e12);
            }
            throw e12;
        }
    }
}
