package defpackage;

import io.michaelrocks.libphonenumber.android.MissingMetadataException;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class aub {
    public static final Logger h = Logger.getLogger(aub.class.getName());
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public final h79 a;
    public final HashMap b;
    public final zid c = new zid(0);
    public final HashSet d = new HashSet(35);
    public final ao6 e = new ao6(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        j = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        k = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        i = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = j;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        l = Pattern.compile("[+＋]+");
        m = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        n = Pattern.compile("(\\p{Nd})");
        o = Pattern.compile("[+＋\\p{Nd}]");
        p = Pattern.compile("[\\\\/] *x");
        q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strI = ho7.i("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        s = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strI2 = az1.i(string, "\\p{Nd}");
        t = Pattern.compile("^(" + wy1.j("[", strI2, "]+((\\-)*[", strI2, "])*") + "\\.)*" + wy1.j("[", string, "]+((\\-)*[", strI2, "])*") + "\\.?$");
        StringBuilder sb2 = new StringBuilder("(?:");
        sb2.append(strA);
        sb2.append(")$");
        u = Pattern.compile(sb2.toString(), 66);
        v = Pattern.compile(strI + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        w = Pattern.compile("(\\$\\d)");
        x = Pattern.compile("\\(?\\$1\\)?");
    }

    public aub(h79 h79Var, HashMap map) {
        this.a = h79Var;
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z) {
        String str = ";ext=" + b(20);
        String str2 = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str3 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str4 = "[- ]+" + b(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        String strL = ho7.l(sb, "|", str4);
        if (!z) {
            return strL;
        }
        return strL + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return wy1.e(i2, "(\\p{Nd}{1,", "})");
    }

    public static String i(rub rubVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (rubVar.Y && (i2 = rubVar.s0) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(rubVar.c);
        return sb.toString();
    }

    public static qub j(pub pubVar, int i2) {
        switch (az1.v(i2)) {
            case 0:
            case 2:
                return pubVar.d;
            case 1:
                return pubVar.X;
            case 3:
                return pubVar.Z;
            case 4:
                return pubVar.t0;
            case 5:
                return pubVar.v0;
            case 6:
                return pubVar.z0;
            case 7:
                return pubVar.x0;
            case 8:
                return pubVar.B0;
            case 9:
                return pubVar.D0;
            case 10:
                return pubVar.H0;
            default:
                return pubVar.b;
        }
    }

    public static void r(StringBuilder sb) {
        if (r.matcher(sb).matches()) {
            sb.replace(0, sb.length(), t(sb, k));
        } else {
            sb.replace(0, sb.length(), s(sb));
        }
    }

    public static String s(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String t(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void v(int i2, int i3, StringBuilder sb) {
        int iV = az1.v(i3);
        if (iV == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (iV == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (iV != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static int w(StringBuilder sb, pub pubVar, int i2) {
        qub qubVarJ = j(pubVar, i2);
        ArrayList arrayList = qubVarJ.c.isEmpty() ? pubVar.b.c : qubVarJ.c;
        ArrayList arrayList2 = qubVarJ.d;
        if (i2 == 3) {
            qub qubVarJ2 = j(pubVar, 1);
            if (qubVarJ2.c.size() == 1 && ((Integer) qubVarJ2.c.get(0)).intValue() == -1) {
                return w(sb, pubVar, 2);
            }
            qub qubVarJ3 = j(pubVar, 2);
            boolean z = (qubVarJ3.c.size() == 1 && ((Integer) qubVarJ3.c.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList3 = qubVarJ3.d;
            if (z) {
                ArrayList arrayList4 = new ArrayList(arrayList);
                arrayList4.addAll(qubVarJ3.c.size() == 0 ? pubVar.b.c : qubVarJ3.c);
                Collections.sort(arrayList4);
                if (arrayList2.isEmpty()) {
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                } else {
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    arrayList5.addAll(arrayList3);
                    Collections.sort(arrayList5);
                    arrayList2 = arrayList5;
                    arrayList = arrayList4;
                }
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if (iIntValue != length) {
            if (iIntValue > length) {
                return 4;
            }
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
                return 6;
            }
            if (!arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
                return 5;
            }
        }
        return 1;
    }

    public final int c(StringBuilder sb, StringBuilder sb2) throws NumberFormatException {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final String d(rub rubVar, int i2) {
        ao6 ao6Var;
        nub nubVar;
        if (rubVar.c == 0) {
            String str = rubVar.t0;
            if (str.length() > 0 || !rubVar.a) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = rubVar.b;
        String strI = i(rubVar);
        if (i2 == 1) {
            sb.append(strI);
            v(i3, 1, sb);
        } else if (this.b.containsKey(Integer.valueOf(i3))) {
            String strL = l(i3);
            pub pubVarG = "001".equals(strL) ? g(i3) : h(strL);
            Iterator it = ((pubVarG.h1.size() == 0 || i2 == 3) ? pubVarG.g1 : pubVarG.h1).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ao6Var = this.e;
                if (!zHasNext) {
                    nubVar = null;
                    break;
                }
                nubVar = (nub) it.next();
                int size = nubVar.c.size();
                if (size != 0) {
                    if (!ao6Var.k((String) nubVar.c.get(size - 1)).matcher(strI).lookingAt()) {
                        continue;
                    }
                }
                if (ao6Var.k(nubVar.a).matcher(strI).matches()) {
                    break;
                }
            }
            if (nubVar != null) {
                String str2 = nubVar.b;
                Matcher matcher = ao6Var.k(nubVar.a).matcher(strI);
                String str3 = nubVar.o;
                strI = (i2 != 3 || str3 == null || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(w.matcher(str2).replaceFirst(str3));
                if (i2 == 4) {
                    Matcher matcher2 = m.matcher(strI);
                    if (matcher2.lookingAt()) {
                        strI = matcher2.replaceFirst("");
                    }
                    strI = matcher2.reset(strI).replaceAll("-");
                }
            }
            sb.append(strI);
            if (rubVar.d && rubVar.o.length() > 0) {
                if (i2 == 4) {
                    sb.append(";ext=");
                    sb.append(rubVar.o);
                } else if (pubVarG.Z0) {
                    sb.append(pubVarG.a1);
                    sb.append(rubVar.o);
                } else {
                    sb.append(" ext. ");
                    sb.append(rubVar.o);
                }
            }
            v(i3, i2, sb);
        } else {
            sb.append(strI);
        }
        return sb.toString();
    }

    public final int e(String str) {
        if (o(str)) {
            pub pubVarH = h(str);
            if (pubVarH != null) {
                return pubVarH.T0;
            }
            throw new IllegalArgumentException(wy1.h("Invalid region code: ", str));
        }
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        h.log(level, sb.toString());
        return 0;
    }

    public final rub f(String str) {
        boolean zO = o(str);
        Logger logger = h;
        if (!zO) {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: " + str);
            return null;
        }
        qub qubVarJ = j(h(str), 2);
        try {
            if (qubVarJ.o) {
                return u(qubVarJ.X, str);
            }
            return null;
        } catch (NumberParseException e) {
            logger.log(Level.SEVERE, e.toString());
            return null;
        }
    }

    public final pub g(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        h79 h79Var = this.a;
        h79Var.getClass();
        List list = (List) m7j.b().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i2 + " calling code belongs to a geo entity");
        }
        pub pubVar = (pub) ((ConcurrentHashMap) ((jm3) ((fa6) h79Var.c).w(((d47) h79Var.b).c(Integer.valueOf(i2)))).a.a).get(Integer.valueOf(i2));
        String strF = ho7.f(i2, "Missing metadata for country code ");
        if (pubVar != null) {
            return pubVar;
        }
        throw new MissingMetadataException(strF);
    }

    public final pub h(String str) {
        if (!o(str)) {
            return null;
        }
        h79 h79Var = this.a;
        h79Var.getClass();
        if (str.equals("001")) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        pub pubVar = (pub) ((ConcurrentHashMap) ((jm3) ((fa6) h79Var.c).w(((d47) h79Var.b).c(str))).b.a).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (pubVar != null) {
            return pubVar;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final int k(String str, pub pubVar) {
        if (!m(str, pubVar.b)) {
            return 12;
        }
        if (m(str, pubVar.t0)) {
            return 5;
        }
        if (m(str, pubVar.Z)) {
            return 4;
        }
        if (m(str, pubVar.v0)) {
            return 6;
        }
        if (m(str, pubVar.z0)) {
            return 7;
        }
        if (m(str, pubVar.x0)) {
            return 8;
        }
        if (m(str, pubVar.B0)) {
            return 9;
        }
        if (m(str, pubVar.D0)) {
            return 10;
        }
        if (m(str, pubVar.H0)) {
            return 11;
        }
        return m(str, pubVar.d) ? (pubVar.f1 || m(str, pubVar.X)) ? 3 : 1 : (pubVar.f1 || !m(str, pubVar.X)) ? 12 : 2;
    }

    public final String l(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean m(String str, qub qubVar) {
        int length = str.length();
        ArrayList arrayList = qubVar.c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.c.m(str, qubVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(defpackage.rub r10) {
        /*
            r9 = this;
            int r0 = r10.b
            java.util.HashMap r1 = r9.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            r2 = 12
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L30
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Missing/invalid country_code ("
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.util.logging.Logger r6 = defpackage.aub.h
            r6.log(r1, r0)
            goto L74
        L30:
            int r0 = r1.size()
            if (r0 != r4) goto L3e
            java.lang.Object r0 = r1.get(r3)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L74
        L3e:
            java.lang.String r0 = i(r10)
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            pub r7 = r9.h(r6)
            boolean r8 = r7.j1
            if (r8 == 0) goto L6d
            ao6 r8 = r9.e
            java.lang.String r7 = r7.k1
            java.util.regex.Pattern r7 = r8.k(r7)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r7 = r7.lookingAt()
            if (r7 == 0) goto L46
            goto L73
        L6d:
            int r7 = r9.k(r0, r7)
            if (r7 == r2) goto L46
        L73:
            r5 = r6
        L74:
            int r0 = r10.b
            java.lang.String r1 = "001"
            boolean r6 = r1.equals(r5)
            if (r6 == 0) goto L83
            pub r6 = r9.g(r0)
            goto L87
        L83:
            pub r6 = r9.h(r5)
        L87:
            if (r6 == 0) goto Lb1
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto La6
            pub r1 = r9.h(r5)
            if (r1 == 0) goto L9a
            int r1 = r1.T0
            if (r0 == r1) goto La6
            goto Lb1
        L9a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid region code: "
            java.lang.String r0 = defpackage.wy1.h(r0, r5)
            r10.<init>(r0)
            throw r10
        La6:
            java.lang.String r10 = i(r10)
            int r10 = r9.k(r10, r6)
            if (r10 == r2) goto Lb1
            return r4
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aub.n(rub):boolean");
    }

    public final boolean o(String str) {
        return str != null && this.f.contains(str);
    }

    public final int p(CharSequence charSequence, pub pubVar, StringBuilder sb, rub rubVar) throws NumberParseException, NumberFormatException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = pubVar != null ? pubVar.U0 : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = l.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                r(sb2);
            } else {
                Pattern patternK = this.e.k(str);
                r(sb2);
                Matcher matcher2 = patternK.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = n.matcher(sb2.substring(iEnd));
                    if (!matcher3.find() || !s(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, iEnd);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iC = c(sb2, sb);
            if (iC == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            rubVar.a = true;
            rubVar.b = iC;
            return iC;
        }
        if (pubVar != null) {
            int i2 = pubVar.T0;
            String strValueOf = String.valueOf(i2);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                qub qubVar = pubVar.b;
                q(sb3, pubVar, null);
                zid zidVar = this.c;
                if ((!zidVar.m(sb2, qubVar) && zidVar.m(sb3, qubVar)) || w(sb2, pubVar, 12) == 6) {
                    sb.append((CharSequence) sb3);
                    rubVar.a = true;
                    rubVar.b = i2;
                    return i2;
                }
            }
        }
        rubVar.a = true;
        rubVar.b = 0;
        return 0;
    }

    public final void q(StringBuilder sb, pub pubVar, StringBuilder sb2) {
        int length = sb.length();
        String str = pubVar.c1;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.e.k(str).matcher(sb);
        if (matcher.lookingAt()) {
            qub qubVar = pubVar.b;
            zid zidVar = this.c;
            boolean zM = zidVar.m(sb, qubVar);
            int iGroupCount = matcher.groupCount();
            String str2 = pubVar.e1;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zM || zidVar.m(sb.substring(matcher.end()), qubVar)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!zM || zidVar.m(sb3.toString(), qubVar)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final rub u(String str, String str2) throws NumberParseException, NumberFormatException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iP;
        rub rubVar = new rub();
        rubVar.b = 0;
        rubVar.c = 0L;
        String strGroup = "";
        rubVar.o = "";
        rubVar.Y = false;
        rubVar.s0 = 1;
        rubVar.t0 = "";
        rubVar.v0 = "";
        rubVar.u0 = 5;
        if (str == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 != -1 ? string.substring(i2, iIndexOf2) : string.substring(i2);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(s.matcher(strSubstring).matches() || t.matcher(strSubstring).matches()))) {
            throw new NumberParseException(2, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = o.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = q.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = p.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = v;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        boolean zO = o(str2);
        Pattern pattern2 = l;
        if (!zO && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = u.matcher(sb);
        if (matcher4.find()) {
            String strSubstring2 = sb.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (strGroup.length() > 0) {
            rubVar.d = true;
            rubVar.o = strGroup;
        }
        pub pubVarH = h(str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            iP = p(sb, pubVarH, sb2, rubVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            int i4 = e.a;
            if (i4 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i4, e.getMessage());
            }
            iP = p(sb.substring(matcher5.end()), pubVarH, sb2, rubVar);
            if (iP == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iP != 0) {
            String strL = l(iP);
            if (!strL.equals(str2)) {
                pubVarH = "001".equals(strL) ? g(iP) : h(strL);
            }
        } else {
            r(sb);
            sb2.append((CharSequence) sb);
            if (str2 != null) {
                int i5 = pubVarH.T0;
                rubVar.a = true;
                rubVar.b = i5;
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (pubVarH != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            q(sb4, pubVarH, sb3);
            int iW = w(sb4, pubVarH, 12);
            if (iW != 4 && iW != 2 && iW != 5) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            rubVar.X = true;
            rubVar.Y = true;
            int i6 = 1;
            while (i6 < sb2.length() - 1 && sb2.charAt(i6) == '0') {
                i6++;
            }
            if (i6 != 1) {
                rubVar.Z = true;
                rubVar.s0 = i6;
            }
        }
        rubVar.c = Long.parseLong(sb2.toString());
        return rubVar;
    }
}
