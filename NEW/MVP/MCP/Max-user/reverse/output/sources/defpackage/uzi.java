package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class uzi {
    public static final String a(Set set) {
        ArrayList arrayList = new ArrayList(we3.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((da6) it.next()).name());
        }
        return new JSONArray((Collection) arrayList).toString();
    }

    public static final Map b(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return id5.a;
        }
        hd6 hd6Var = new hd6(0);
        fl9.mergeFrom(hd6Var, bArr);
        EnumMap enumMap = new EnumMap(da6.class);
        long[] jArr = (long[]) hd6Var.b;
        if (jArr.length == 0) {
            return enumMap;
        }
        enumMap.put((EnumMap) da6.B0, (da6) jArr);
        return enumMap;
    }

    public static final List c(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (bArr == null) {
            return hd5.a;
        }
        hd6 hd6Var = new hd6(2);
        fl9.mergeFrom(hd6Var, bArr);
        id6[] id6VarArr = (id6[]) hd6Var.b;
        ArrayList arrayList = new ArrayList(id6VarArr.length);
        for (id6 id6Var : id6VarArr) {
            long j = id6Var.a;
            String str = id6Var.b;
            String str2 = id6Var.c;
            String str3 = id6Var.d;
            String str4 = str3.length() == 0 ? null : str3;
            long j2 = id6Var.e;
            Long lValueOf = Long.valueOf(j2);
            if (j2 == -1) {
                lValueOf = null;
            }
            String str5 = id6Var.f;
            String str6 = str5.length() == 0 ? null : str5;
            String str7 = id6Var.g;
            String str8 = str7.length() == 0 ? null : str7;
            String str9 = id6Var.h;
            arrayList.add(new db6(j, str, str2, str4, lValueOf, str9.length() == 0 ? null : str9, str6, str8));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable, long[]] */
    public static final byte[] d(Map map) {
        if (map == null) {
            return null;
        }
        hd6 hd6Var = new hd6(0);
        for (Map.Entry entry : map.entrySet()) {
            da6 da6Var = (da6) entry.getKey();
            Object value = entry.getValue();
            if (qo8.$EnumSwitchMapping$0[da6Var.ordinal()] == 1) {
                hd6Var.b = (long[]) value;
            }
        }
        return fl9.toByteArray(hd6Var);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [id6[], java.io.Serializable] */
    public static final byte[] e(List list) {
        if (list == null) {
            return null;
        }
        hd6 hd6Var = new hd6(2);
        int size = list.size();
        ?? r2 = new id6[size];
        for (int i = 0; i < size; i++) {
            db6 db6Var = (db6) list.get(i);
            id6 id6Var = new id6();
            id6Var.a = db6Var.a;
            id6Var.b = db6Var.b;
            id6Var.c = db6Var.c;
            String str = db6Var.d;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            id6Var.d = str;
            Long l = db6Var.e;
            id6Var.e = l != null ? l.longValue() : -1L;
            String str3 = db6Var.g;
            if (str3 == null) {
                str3 = "";
            }
            id6Var.f = str3;
            String str4 = db6Var.h;
            if (str4 == null) {
                str4 = "";
            }
            id6Var.g = str4;
            String str5 = db6Var.f;
            if (str5 != null) {
                str2 = str5;
            }
            id6Var.h = str2;
            r2[i] = id6Var;
        }
        hd6Var.b = r2;
        return fl9.toByteArray(hd6Var);
    }

    public static List f(String str, List list) {
        return y4e.a.i().d(m6g.d(str), list);
    }

    public static SpannableString g(CharSequence charSequence, List list, yeb yebVar) {
        if (charSequence == null || charSequence.length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() != 0 && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n7e n7eVar = (n7e) it.next();
                spannableString.setSpan(new l7g(yebVar, new dga(16)), n7eVar.a, n7eVar.b, 17);
            }
        }
        return spannableString;
    }

    public static SpannableString h(yeb yebVar, f7c f7cVar, List list) {
        CharSequence charSequence = f7cVar.a;
        return charSequence.length() == 0 ? new SpannableString("") : g(m6g.d(charSequence.toString()), list, yebVar);
    }

    public static boolean i(String str, List list) {
        return !y4e.a.i().d(str, list).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] j(defpackage.n8a r14) {
        /*
            if (r14 == 0) goto L58
            boolean r0 = r14.i()
            if (r0 == 0) goto L9
            goto L58
        L9:
            int r0 = r14.d
            r1 = 8
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long[] r2 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L53
            r4 = 0
            r5 = r4
        L1d:
            r6 = r14[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r4
        L35:
            if (r9 >= r8) goto L4c
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r6
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L48
            int r10 = r5 << 3
            int r10 = r10 + r9
            r10 = r2[r10]
            r0.putLong(r10)
        L48:
            long r6 = r6 >> r1
            int r9 = r9 + 1
            goto L35
        L4c:
            if (r8 != r1) goto L53
        L4e:
            if (r5 == r3) goto L53
            int r5 = r5 + 1
            goto L1d
        L53:
            byte[] r14 = r0.array()
            return r14
        L58:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzi.j(n8a):byte[]");
    }

    public static final EnumSet k(String str) {
        Object ipdVar;
        JSONArray jSONArray = new JSONArray(str);
        EnumSet enumSetNoneOf = EnumSet.noneOf(da6.class);
        Iterator it = n7j.h(0, jSONArray.length()).iterator();
        while (((so7) it).c) {
            try {
                ipdVar = da6.valueOf(jSONArray.getString(((so7) it).nextInt()));
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            if (ipdVar instanceof ipd) {
                ipdVar = null;
            }
            da6 da6Var = (da6) ipdVar;
            if (da6Var != null) {
                enumSetNoneOf.add(da6Var);
            }
        }
        return enumSetNoneOf;
    }

    public static CharSequence l(CharSequence charSequence, List list, String[] strArr) {
        if (charSequence.length() != 0 && !list.isEmpty() && strArr.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.length() != 0) {
                        String str2 = strArr[i];
                        Pattern pattern = m6g.a;
                        if (str2.regionMatches(true, 0, str, 0, str.length())) {
                            int iD = vmf.D(charSequence.toString(), strArr[i], 0, false, 6);
                            if (i != 0 && iD > 10) {
                                return new SpannableString(new SpannableStringBuilder().append((CharSequence) "...").append(charSequence.subSequence((int) Math.max(0.0d, iD - 10), charSequence.length())));
                            }
                        }
                    }
                }
                i++;
            }
        }
        return charSequence;
    }
}
