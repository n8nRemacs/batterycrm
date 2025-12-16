package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class i5j {
    public static final String a(ew7 ew7Var, ree reeVar) {
        for (Annotation annotation : reeVar.getAnnotations()) {
            if (annotation instanceof kw7) {
                return ((kw7) annotation).discriminator();
            }
        }
        return ew7Var.a.e;
    }

    public static final qxg b(tm9 tm9Var) {
        int iM;
        String string;
        String string2;
        oxg oxgVar = new oxg();
        try {
            iM = efi.m(tm9Var);
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iM = 0;
        }
        for (int i = 0; i < iM; i++) {
            String strP = null;
            try {
                strP = efi.p(tm9Var, null);
            } catch (Throwable th2) {
                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = vfe.a.iterator();
                while (it2.hasNext()) {
                    ((qwa) it2.next()).getClass();
                    qwa.a(th2);
                }
                int iV2 = az1.v(ctd.a);
                if (iV2 != 0) {
                    if (iV2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
            }
            if (strP != null) {
                try {
                    String str = strP + "=";
                    switch (strP.hashCode()) {
                        case -2099474505:
                            if (strP.equals("DIALOGS_LED")) {
                                int iS0 = tm9Var.s0();
                                Integer numValueOf = Integer.valueOf(iS0);
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) str);
                                sb.append(iS0);
                                string = sb.toString();
                                oxgVar.j = numValueOf;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1972016425:
                            if (strP.equals("INCOMING_CALL")) {
                                String strW0 = tm9Var.w0();
                                string2 = ((Object) str) + strW0;
                                oxgVar.p = xrf.b(strW0);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1965172674:
                            if (strP.equals("DIALOGS_PUSH_SOUND")) {
                                String strW02 = tm9Var.w0();
                                string2 = ((Object) str) + strW02;
                                oxgVar.f = strW02;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1917056995:
                            if (strP.equals("SEARCH_BY_PHONE")) {
                                String strO = efi.o(tm9Var);
                                string2 = ((Object) str) + strO;
                                oxgVar.w = xrf.b(strO);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1840968095:
                            if (strP.equals("SAFE_MODE_NO_PIN")) {
                                boolean zG = efi.g(tm9Var);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((Object) str);
                                sb2.append(zG);
                                string2 = sb2.toString();
                                oxgVar.v = Boolean.valueOf(zG);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1674384187:
                            if (strP.equals("CONTENT_LEVEL_ACCESS")) {
                                boolean zG2 = efi.g(tm9Var);
                                Boolean boolValueOf = Boolean.valueOf(zG2);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append((Object) str);
                                sb3.append(zG2);
                                string = sb3.toString();
                                oxgVar.y = boolValueOf;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -952000630:
                            if (strP.equals("PUSH_SOUND")) {
                                String strW03 = tm9Var.w0();
                                string2 = ((Object) str) + strW03;
                                oxgVar.e = strW03;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -747186863:
                            if (strP.equals("SUGGEST_STICKERS")) {
                                String strO2 = efi.o(tm9Var);
                                string2 = ((Object) str) + strO2;
                                oxgVar.s = xrf.c(strO2);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -694542025:
                            if (strP.equals("PUSH_NEW_CONTACTS")) {
                                boolean zP0 = tm9Var.p0();
                                Boolean boolValueOf2 = Boolean.valueOf(zP0);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append((Object) str);
                                sb4.append(zP0);
                                string = sb4.toString();
                                oxgVar.a = boolValueOf2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -658898441:
                            if (strP.equals("DIALOGS_VIBR")) {
                                boolean zP02 = tm9Var.p0();
                                Boolean boolValueOf3 = Boolean.valueOf(zP02);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append((Object) str);
                                sb5.append(zP02);
                                string = sb5.toString();
                                oxgVar.m = boolValueOf3;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -389923664:
                            if (strP.equals("DONT_DISTURB_UNTIL")) {
                                long jT0 = tm9Var.t0();
                                Long lValueOf = Long.valueOf(jT0);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append((Object) str);
                                sb6.append(jT0);
                                string2 = sb6.toString();
                                oxgVar.b = lValueOf;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -248197113:
                            if (strP.equals("CHATS_VIBR")) {
                                boolean zP03 = tm9Var.p0();
                                Boolean boolValueOf4 = Boolean.valueOf(zP03);
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append((Object) str);
                                sb7.append(zP03);
                                string = sb7.toString();
                                oxgVar.n = boolValueOf4;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 75243:
                            if (strP.equals("LED")) {
                                int iS02 = tm9Var.s0();
                                Integer numValueOf2 = Integer.valueOf(iS02);
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append((Object) str);
                                sb8.append(iS02);
                                string = sb8.toString();
                                oxgVar.i = numValueOf2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 2634307:
                            if (strP.equals("VIBR")) {
                                boolean zP04 = tm9Var.p0();
                                Boolean boolValueOf5 = Boolean.valueOf(zP04);
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append((Object) str);
                                sb9.append(zP04);
                                string = sb9.toString();
                                oxgVar.l = boolValueOf5;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 130531239:
                            if (strP.equals("CHATS_LED")) {
                                int iS03 = tm9Var.s0();
                                Integer numValueOf3 = Integer.valueOf(iS03);
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append((Object) str);
                                sb10.append(iS03);
                                string = sb10.toString();
                                oxgVar.k = numValueOf3;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 136965804:
                            if (strP.equals("CHATS_PUSH_NOTIFICATION")) {
                                String strW04 = tm9Var.w0();
                                string2 = ((Object) str) + strW04;
                                oxgVar.d = strW04;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 345218686:
                            if (strP.equals("UNSAFE_FILES")) {
                                boolean zG3 = efi.g(tm9Var);
                                Boolean boolValueOf6 = Boolean.valueOf(zG3);
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append((Object) str);
                                sb11.append(zG3);
                                string = sb11.toString();
                                oxgVar.x = boolValueOf6;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 640193528:
                            if (strP.equals("INACTIVE_TTL")) {
                                String strO3 = efi.o(tm9Var);
                                string2 = ((Object) str) + strO3;
                                pxg pxgVar = pxg.TTL_6M;
                                if (strO3 != null) {
                                    switch (strO3) {
                                        case "1M":
                                            pxgVar = pxg.TTL_1M;
                                            break;
                                        case "3M":
                                            pxgVar = pxg.TTL_3M;
                                            break;
                                    }
                                }
                                oxgVar.q = pxgVar;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 836229259:
                            if (strP.equals("AUDIO_TRANSCRIPTION_ENABLED")) {
                                boolean zG4 = efi.g(tm9Var);
                                Boolean boolValueOf7 = Boolean.valueOf(zG4);
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append((Object) str);
                                sb12.append(zG4);
                                string = sb12.toString();
                                oxgVar.t = boolValueOf7;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1633771469:
                            if (strP.equals("CHATS_INVITE")) {
                                String strW05 = tm9Var.w0();
                                string2 = ((Object) str) + strW05;
                                oxgVar.o = xrf.b(strW05);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1684923157:
                            if (strP.equals("SAFE_MODE")) {
                                boolean zG5 = efi.g(tm9Var);
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append((Object) str);
                                sb13.append(zG5);
                                string2 = sb13.toString();
                                oxgVar.u = Boolean.valueOf(zG5);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1911151182:
                            if (strP.equals("CHATS_PUSH_SOUND")) {
                                String strW06 = tm9Var.w0();
                                string2 = ((Object) str) + strW06;
                                oxgVar.g = strW06;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1950966460:
                            if (strP.equals("DIALOGS_PUSH_NOTIFICATION")) {
                                String strW07 = tm9Var.w0();
                                string2 = ((Object) str) + strW07;
                                oxgVar.c = strW07;
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1958389377:
                            if (strP.equals("M_CALL_PUSH_NOTIFICATION")) {
                                String strO4 = efi.o(tm9Var);
                                string2 = ((Object) str) + strO4;
                                oxgVar.r = xrf.a(strO4);
                                string = string2;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 2130809258:
                            if (strP.equals("HIDDEN")) {
                                boolean zP05 = tm9Var.p0();
                                Boolean boolValueOf8 = Boolean.valueOf(zP05);
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append((Object) str);
                                sb14.append(zP05);
                                string = sb14.toString();
                                oxgVar.h = boolValueOf8;
                                break;
                            } else {
                                tm9Var.v();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        default:
                            tm9Var.v();
                            string = ((Object) str) + "skip!";
                            break;
                    }
                    wqi.c("ConfigurationUserSettingsParsing", string, new Object[0]);
                } catch (Throwable th3) {
                    try {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = vfe.a.iterator();
                        while (it3.hasNext()) {
                            ((qwa) it3.next()).getClass();
                            qwa.a(th3);
                        }
                        int iV3 = az1.v(ctd.a);
                        if (iV3 != 0) {
                            if (iV3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = vfe.a.iterator();
                        while (it4.hasNext()) {
                            ((qwa) it4.next()).getClass();
                            qwa.a(th4);
                        }
                        int iV4 = az1.v(ctd.a);
                        if (iV4 != 0) {
                            if (iV4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new qxg(oxgVar);
    }

    public static final Map c(tm9 tm9Var) {
        int iA = tm9Var.w().a();
        id5 id5Var = id5.a;
        if (iA != 8) {
            tm9Var.v();
            return id5Var;
        }
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return id5Var;
        }
        us usVar = new us(iM);
        for (int i = 0; i < iM; i++) {
            String strO = efi.o(tm9Var);
            if (strO != null) {
                usVar.put(strO, d(tm9Var));
            } else {
                tm9Var.v();
            }
        }
        return usVar;
    }

    public static final Object d(tm9 tm9Var) throws IOException {
        int iA = tm9Var.w().a();
        switch (iA == 0 ? -1 : uo3.$EnumSwitchMapping$0[az1.v(iA)]) {
            case 1:
                byte b = tm9Var.readByte();
                if (b == -64) {
                    return qqg.a;
                }
                throw tm9.m0(b, "Nil");
            case 2:
                return Boolean.valueOf(efi.g(tm9Var));
            case 3:
                if (tm9Var.w().a() == 3) {
                    return Long.valueOf(tm9Var.t0());
                }
                tm9Var.v();
                return null;
            case 4:
                if (tm9Var.w().a() == 4) {
                    return Float.valueOf(tm9Var.r0());
                }
                tm9Var.v();
                return null;
            case 5:
                return efi.o(tm9Var);
            case 6:
                return efi.s(tm9Var, new df3(2));
            case 7:
                return c(tm9Var);
            default:
                tm9Var.v();
                return null;
        }
    }
}
