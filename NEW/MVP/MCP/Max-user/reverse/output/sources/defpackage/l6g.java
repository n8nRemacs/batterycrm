package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class l6g {
    public static final String[] b;
    public static final rw0 c;
    public static final rw0 d;
    public final k18 a;

    static {
        Pattern.compile("#u([0-9a-f]{2,16})(#\\d+:\\d+)?s#");
        b = new String[]{"B", "kB", "MB", "GB", "TB"};
        c = new rw0(9);
        d = new rw0(10);
    }

    public l6g(k18 k18Var) {
        this.a = k18Var;
    }

    public static CharSequence a(String str, ku3 ku3Var, f7b f7bVar, boolean z) {
        String strE = ku3Var.e();
        int iIndexOf = str.indexOf(strE);
        if (iIndexOf < 0) {
            return str;
        }
        int length = strE.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!z) {
            if (f7bVar.f == -1) {
                Context context = f7bVar.a;
                bwf bwfVar = q1g.a0;
                f7bVar.f = nca.d(context).t;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(f7bVar.f), iIndexOf, length, 33);
            spannableStringBuilder.setSpan(new jv3(ku3Var.p()), iIndexOf, length, 33);
        }
        f7bVar.d(spannableStringBuilder, ku3Var.x(), z, length);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b(String str, d10 d10Var, ku3 ku3Var, f7b f7bVar, qv3 qv3Var, boolean z) {
        int iIndexOf;
        xs xsVar = new xs(0);
        xsVar.add(Long.valueOf(ku3Var.p()));
        xsVar.addAll(d10Var.c);
        xsVar.add(Long.valueOf(d10Var.b));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (f7bVar.f == -1) {
            Context context = f7bVar.a;
            bwf bwfVar = q1g.a0;
            f7bVar.f = nca.d(context).t;
        }
        int i = f7bVar.f;
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            Long l = (Long) qsVar.next();
            ku3 ku3VarI = qv3Var.i(l.longValue(), true);
            String strE = ku3VarI.e();
            if (!l8g.c(strE) && (iIndexOf = spannableStringBuilder.toString().indexOf(strE)) >= 0) {
                int length = strE.length() + iIndexOf;
                if (!z) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iIndexOf, length, 33);
                    spannableStringBuilder.setSpan(new jv3(l.longValue()), iIndexOf, length, 33);
                }
                f7bVar.d(spannableStringBuilder, ku3VarI.x(), z, length);
            }
        }
        return spannableStringBuilder;
    }

    public static String c(Context context, Integer num, boolean z, frf frfVar) {
        if (num == null) {
            return "";
        }
        String strI = z ? ho7.i(" ", context.getString(fvd.a), " ") : "";
        if (num.intValue() > 1) {
            strI = strI + num + " ";
        }
        StringBuilder sbM = az1.m(strI);
        sbM.append((String) frfVar.get());
        return sbM.toString();
    }

    public static String d(String str, String str2) {
        return u45.k(str, " ", str2);
    }

    public static String e(String str) {
        if (l8g.c(str)) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String g(Context context, boolean z, boolean z2) {
        String string = z2 ? context.getString(c5d.tt_audio) : "";
        return z ? d("🎤", string) : dnf.j(string);
    }

    public static String h(Context context, si9 si9Var, boolean z, boolean z2, long j) {
        String string;
        z00 z00VarI = si9Var.i();
        if (z00VarI == null) {
            return "";
        }
        int i = z00VarI.d;
        boolean z3 = si9Var.o != j;
        boolean z4 = z3 && (i == 5 || z00VarI.a());
        boolean z5 = i == 4 || (!z3 && z00VarI.a());
        boolean z6 = z00VarI.c == 2;
        if (z5 && z6) {
            string = z2 ? context.getString(c5d.tt_call_outgoing_canceled_video_cap) : context.getString(c5d.tt_call_outgoing_canceled_video);
        } else if (z5) {
            string = z2 ? context.getString(c5d.tt_call_outgoing_canceled_audio_cap) : context.getString(c5d.tt_call_outgoing_canceled_audio);
        } else if (z4 && z6) {
            string = z2 ? context.getString(c5d.tt_call_missed_video_cap) : context.getString(c5d.tt_call_missed_video);
        } else if (z4) {
            string = z2 ? context.getString(c5d.tt_call_missed_audio_cap) : context.getString(c5d.tt_call_missed_audio);
        } else if (z3 && z6) {
            StringBuilder sbM = az1.m(z2 ? context.getString(c5d.tt_call_incoming_video_cap) : context.getString(c5d.tt_call_incoming_video));
            sbM.append(i(z00VarI));
            string = sbM.toString();
        } else if (z3) {
            StringBuilder sbM2 = az1.m(z2 ? context.getString(c5d.tt_call_incoming_audio_cap) : context.getString(c5d.tt_call_incoming_audio));
            sbM2.append(i(z00VarI));
            string = sbM2.toString();
        } else if (z6) {
            StringBuilder sbM3 = az1.m(z2 ? context.getString(c5d.tt_call_outgoing_video_cap) : context.getString(c5d.tt_call_outgoing_video));
            sbM3.append(i(z00VarI));
            string = sbM3.toString();
        } else {
            StringBuilder sbM4 = az1.m(z2 ? context.getString(c5d.tt_call_outgoing_audio_cap) : context.getString(c5d.tt_call_outgoing_audio));
            sbM4.append(i(z00VarI));
            string = sbM4.toString();
        }
        return z ? d("📞", string) : string;
    }

    public static String i(z00 z00Var) {
        long j = z00Var.e;
        return j == 0 ? "" : " ".concat(z7i.a(j));
    }

    public static String j(Context context, a10 a10Var, qu3 qu3Var, boolean z, boolean z2) {
        String string;
        try {
            string = s5j.j(qu3Var.b(a10Var), a10Var);
        } catch (Exception unused) {
            string = null;
        }
        if (l8g.c(string)) {
            string = context.getString(c5d.tt_contact);
        } else if (!z2) {
            string = context.getString(c5d.tt_contact_with_name, string);
        }
        return z ? d("👤", string) : dnf.j(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence k(android.content.Context r16, defpackage.f7b r17, defpackage.qv3 r18, boolean r19, defpackage.si9 r20, defpackage.ku3 r21, boolean r22, boolean r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6g.k(android.content.Context, f7b, qv3, boolean, si9, ku3, boolean, boolean, long, boolean):java.lang.CharSequence");
    }

    public static String l(Context context, ku3 ku3Var, boolean z, boolean z2, boolean z3, d10 d10Var) {
        c10 c10Var = d10Var.a;
        int iOrdinal = c10Var.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            return "";
        }
        c10 c10Var2 = c10.c;
        if (!z && !z3) {
            return c10Var == c10Var2 ? n(context, ku3Var, z2, c5d.tt_control_you_add_user, c5d.tt_control_user_add_m, c5d.tt_control_user_add_f, c5d.tt_control_user_add) : n(context, ku3Var, z2, c5d.tt_control_you_remove_user, c5d.tt_control_user_remove_m, c5d.tt_control_user_remove_f, c5d.tt_control_user_remove);
        }
        if (c10Var == c10Var2 || c10Var == c10.b) {
            return n(context, ku3Var, false, 0, c5d.tt_control_user_add_you_m, c5d.tt_control_user_add_you_f, c5d.tt_control_user_add_you);
        }
        int i = c5d.tt_control_user_remove_you_m;
        return n(context, ku3Var, false, 0, i, c5d.tt_control_user_remove_you_f, i);
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        int iLog10 = (int) (Math.log10(j) / Math.log10(1024.0d));
        if (iLog10 > 4) {
            return 4;
        }
        return iLog10;
    }

    public static String n(Context context, ku3 ku3Var, boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            return context.getString(i);
        }
        int i5 = ku3Var.a.b.l;
        return i5 == 2 ? context.getString(i2) : i5 == 3 ? context.getString(i3) : context.getString(i4);
    }

    public static String o(Context context, boolean z, boolean z2) {
        String string = context.getString(z ? c5d.tt_gif : c5d.tt_photo);
        return z2 ? d("📷", string) : dnf.j(string);
    }

    public static String p(int i, int i2, Context context) {
        return String.format(context.getResources().getQuantityString(i, i2), Integer.valueOf(i2));
    }

    public static m7f q(Context context) {
        m7f m7fVar = new m7f(dnf.j(context.getString(c5d.oneme_unsupported_attach_message)));
        new zq0(1).a(m7fVar, 0, m7fVar.length());
        return m7fVar;
    }

    public static String r(Context context, boolean z) {
        String string = context.getString(c5d.tt_video);
        return z ? d("🎬", string) : dnf.j(string);
    }

    public static void s(HashMap map, i6g i6gVar) {
        Integer num = (Integer) map.get(i6gVar);
        map.put(i6gVar, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
    }

    public static String t(long j, int i, boolean z, Context context) {
        if (j <= 0) {
            return "0";
        }
        double dPow = j / Math.pow(1024.0d, i);
        return u45.k(((z && i == 0) || i == 1) ? ((DecimalFormat) c.get()).format(dPow) : ((DecimalFormat) d.get()).format(dPow), " ", context != null ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? context.getString(c5d.tt_file_size_unit_b) : context.getString(c5d.tt_file_size_unit_tb) : context.getString(c5d.tt_file_size_unit_gb) : context.getString(c5d.tt_file_size_unit_mb) : context.getString(c5d.tt_file_size_unit_kb) : context.getString(c5d.tt_file_size_unit_b) : b[i]);
    }

    public static String u(long j, boolean z, Context context) {
        return j <= 0 ? "0" : t(j, m(j), z, context);
    }

    public final CharSequence f(Context context, f7b f7bVar, si9 si9Var, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5) {
        i6g i6gVar;
        i6g i6gVar2;
        i6g i6gVar3;
        q2i q2iVarR;
        s7c s7cVar;
        boolean zT = si9Var.t();
        jdc jdcVar = si9Var.x0;
        if (!zT && (jdcVar == null || ((yl7) jdcVar.c) == null)) {
            return "";
        }
        if (si9Var.G() || (si9Var.L() && !si9Var.z())) {
            s10 s10Var = s10.c;
            if (z3) {
                boolean zG = si9Var.G();
                return (zG && si9Var.L()) ? d("📷", context.getString(c5d.tt_photo_and_video)) : zG ? o(context, jdcVar.r(s10Var).b.o, true) : si9Var.z() ? dnf.j(context.getString(c5d.oneme_video_message)) : r(context, true);
            }
            HashMap map = new HashMap();
            int i = 0;
            while (true) {
                int iP = jdcVar.p();
                i6gVar = i6g.c;
                i6gVar2 = i6g.a;
                i6gVar3 = i6g.b;
                if (i >= iP) {
                    break;
                }
                w10 w10VarO = jdcVar.o(i);
                if (w10VarO.a != s10Var) {
                    s(map, i6gVar);
                } else if (w10VarO.b.o) {
                    s(map, i6gVar3);
                } else {
                    s(map, i6gVar2);
                }
                i++;
            }
            if (map.isEmpty()) {
                return "";
            }
            StringBuilder sbM = az1.m("" + c(context, (Integer) map.get(i6g.d), false, new zpc(1, context, z)));
            sbM.append(c(context, (Integer) map.get(i6gVar2), !l8g.c(r1), new zpc(2, context, z)));
            StringBuilder sbM2 = az1.m(sbM.toString());
            sbM2.append(c(context, (Integer) map.get(i6gVar3), !l8g.c(r1), new zpc(3, context, z)));
            StringBuilder sbM3 = az1.m(sbM2.toString());
            sbM3.append(c(context, (Integer) map.get(i6gVar), !l8g.c(r1), new zpc(4, context, z)));
            return sbM3.toString();
        }
        if (si9Var.A()) {
            return g(context, z, z4);
        }
        if (si9Var.B()) {
            return h(context, si9Var, z, true, j);
        }
        Object obj = null;
        strK = null;
        strK = null;
        String strK = null;
        if (si9Var.J()) {
            r10 r10VarO = si9Var.o();
            int i2 = r10VarO.j;
            String string = f7bVar.a.getString(c5d.tt_sticker);
            if (z5) {
                List list = r10VarO.g;
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (f7bVar.j.a(0, str)) {
                            strK = u45.k(str, " ", string);
                            break;
                        }
                    }
                }
                if (strK != null) {
                    return dnf.j(strK);
                }
            }
            return z ? d("🌄", string) : dnf.j(string);
        }
        if (si9Var.I()) {
            String string2 = context.getString(z2 ? c5d.tt_link_acs : c5d.tt_link);
            return z ? d("🔗", string2) : dnf.j(string2);
        }
        if (si9Var.t() && jdcVar.r(s10.s0) != null) {
            String string3 = context.getString(c5d.tt_game);
            return z ? d("🎮", string3) : string3;
        }
        if (si9Var.E()) {
            String str2 = si9Var.l().c;
            return z ? d("📄", str2) : str2;
        }
        if (si9Var.C()) {
            return j(context, si9Var.j(), (qu3) this.a.getValue(), z, false);
        }
        if (si9Var.H()) {
            String string4 = context.getString((si9Var.H() ? jdcVar.r(s10.v0).l : null).e == 4 ? c5d.tt_present_accepted : c5d.tt_present);
            return z ? d("🎁", string4) : string4;
        }
        if (si9Var.F()) {
            String string5 = context.getString(c5d.tt_location);
            return z ? d("📍", string5) : dnf.j(string5);
        }
        if (jdcVar != null && ((yl7) jdcVar.c) != null) {
            return context.getString(c5d.tt_keyboard);
        }
        if (si9Var.z()) {
            return dnf.j(context.getString(c5d.oneme_video_message));
        }
        if (si9Var.M() && (q2iVarR = si9Var.r()) != null) {
            String str3 = (String) q2iVarR.a().a;
            if (l8g.c(str3)) {
                return q(context);
            }
            StringBuilder sb = new StringBuilder(str3);
            Iterator it2 = q2iVarR.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                l2i l2iVar = (l2i) next;
                if (l2iVar.a == k2i.o && (s7cVar = l2iVar.b) != null && ((String) s7cVar.a).length() > 0) {
                    obj = next;
                    break;
                }
            }
            l2i l2iVar2 = (l2i) obj;
            if (l2iVar2 == null) {
                return sb.toString();
            }
            String strA = l2iVar2.a();
            if (l8g.d(strA)) {
                sb.append(". ");
                sb.append(strA);
            }
            return sb.toString();
        }
        return q(context);
    }
}
