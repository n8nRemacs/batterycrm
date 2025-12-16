package defpackage;

import android.hardware.camera2.CaptureResult;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import androidx.work.WorkRequest;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public final class mni implements p20, wzg, sy2, tm6, rl3, zc3, gu3, m7c, lg9, r02, ru6, nyg, g5a, vqc, v1c, qp5 {
    public static final mni a = new mni();
    public static final mni b = new mni();
    public static final mni c = new mni();
    public static final yt0 d = new yt0(new rt0(new qt0(-1308594459, -1728024859, 1711304421), new st0(new tt0(687894245, 28389), new ut0(1030317541, 6907365), new vt0(1382641064, 6909352)), new wt0(-16745729, 704643071, -16745729, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14671838, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14671838, -14671838, -14671838}, new int[]{-14671838, -14671838}), new zt0(-14671838, -1191182337, -1685946, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-14078413, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -12542721, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -1107296257, -2130706433));
    public static final yt0 o = new yt0(new rt0(new qt0(-1728021761, -1728021761, 1711307519), new st0(new tt0(704643071, 16777215), new ut0(1030317541, 6907365), new vt0(1382641064, 6909352)), new wt0(-1, 704643071, -16745729, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -14526260, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-12310068, -14528027, -16742196}, new int[]{-12310068, -16742196}), new zt0(-15375889, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-15375889, 452984831, -2046820353, -1), new bu0(new cu0(-16745729, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 X = new th3(new hg3(new gg3(-48049, -1579033, -16745729, -5058310), new ig3(-1, 1895825407, -16745729)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -15856111, -15856111, 0, 0, 0, 0, 0, 0, 0, 0, 0), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -14528027, 721429580, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(234881023, new int[]{16777215, 285212671, 553648127}), new ng3(234881023, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(654311423, new int[]{16777215, 452984831}), new int[]{654311423, 1308622847}), new sg3(new rg3(452984831, new int[]{16777215, 452984831}), new int[]{872415231, 1308622847})), new tg3(new int[]{-1558175710, -534765534, -534765534}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -16745729, 1933394762, 352321535, -868400310, -12762294, -15263716, -1, 536870911, 402653183, -16745729, -1559425779, -871625458, -1727263474, 0, -16745729, -12500154, -15856111, new int[]{352321535, 352321535}, new int[]{352321535, 352321535}, new int[]{-650625467, -1304936891, -1942471099}, new int[]{-15856111, -15856111}), new vh3(-16745729, -520093697, -3259817, -2130706433, -16745729, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-16751924), 536870911), new ii3(-1728021761, 184549375, 1728053247)), new ki3(new li3(1207959551, -1728021761)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548240711, -1728021761))), new oi3(new pi3(536870911, 268435455), -855638017, 1882734149), new qi3(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -16745729));
    public static final wcg Y = new wcg(new tcg(new ucg(-1, 352321535, -16745729, -14803164), new vcg(1728053247, 184549375, -1728021761)), new xcg(new ycg(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -16745729), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1728021761)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -16745729), new fdg(-1559425779, 2063597567, -1548240711, -1548240711, -1728021761)));
    public static final r6i Z = new r6i(new q6i(-15198184, -14803164, 401074151, -14803164), new s6i(-855638017, 1895825407, -8815492, -16745729, 1895825407), new t6i(266856423, 15198183, -16745729), new u6i(-1579033, -16745729, 1474815975, -1, -1108875289, -2130706433, -2130706433, -16745729));
    public static final mni s0 = new mni();
    public static final mni t0 = new mni();
    public static final mni u0 = new mni();
    public static final mni v0 = new mni();
    public static final mni w0 = new mni();
    public static final mni x0 = new mni();
    public static final mni y0 = new mni();
    public static final mni z0 = new mni();

    public mni() {
        new LinkedHashSet(20);
    }

    public static int B(String str) {
        int iHashCode = str.hashCode();
        return iHashCode != 3213448 ? (iHashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals(HttpHost.DEFAULT_SCHEME_NAME) ? 80 : -1;
    }

    public static g00 C(w10 w10Var, long j, long j2) {
        if (w10Var.f()) {
            return new g00(w10Var, w10Var.b, j, j2);
        }
        if (!w10Var.h()) {
            return null;
        }
        v10 v10Var = w10Var.d;
        return new g00(w10Var, v10Var, v10Var.b, j, j2);
    }

    public static boolean D(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && yxg.q(str.charAt(i + 1)) != -1 && yxg.q(str.charAt(i3)) != -1;
    }

    public static String E(int i, String str, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                qu0 qu0Var = new qu0();
                qu0Var.v0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = yxg.q(str.charAt(iCharCount + 1));
                        int iQ2 = yxg.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            qu0Var.x0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            qu0Var.q0((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        qu0Var.q0(32);
                        iCharCount++;
                    } else {
                        qu0Var.x0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return qu0Var.k0();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static ArrayList F(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iC = vmf.C(str, '&', i, 4);
            if (iC == -1) {
                iC = str.length();
            }
            int iC2 = vmf.C(str, '=', i, 4);
            if (iC2 == -1 || iC2 > iC) {
                arrayList.add(str.substring(i, iC));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iC2));
                arrayList.add(str.substring(iC2 + 1, iC));
            }
            i = iC + 1;
        }
        return arrayList;
    }

    public static Spannable H(CharSequence charSequence, int i, boolean z, wu7 wu7Var) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if (obj instanceof nmc) {
                nmc nmcVar = (nmc) obj;
                nmcVar.b = i;
                nmcVar.c = z;
            } else if ((obj instanceof URLSpan) && !(obj instanceof d88)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new d88(((URLSpan) obj).getURL(), i, z), spanStart, spanEnd, 33);
                } catch (Throwable unused) {
                }
            }
            if (wu7Var != null) {
                wu7Var.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    public static String y(String str, int i, int i2, String str2, int i3) {
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || vmf.t(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !D(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                qu0 qu0Var = new qu0();
                qu0Var.v0(i5, iCharCount, str);
                qu0 qu0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i7 && z3) {
                            String str3 = z ? "+" : "%2B";
                            qu0Var.v0(i4, str3.length(), str3);
                        } else {
                            if (iCodePointAt2 >= i6 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !vmf.t(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || D(iCharCount, length, str))))) {
                                    qu0Var.x0(iCodePointAt2);
                                }
                            }
                            if (qu0Var2 == null) {
                                qu0Var2 = new qu0();
                            }
                            qu0Var2.x0(iCodePointAt2);
                            while (!qu0Var2.P()) {
                                byte b2 = qu0Var2.readByte();
                                qu0Var.q0(37);
                                char[] cArr = ga7.j;
                                qu0Var.q0(cArr[((b2 & 255) >> 4) & 15]);
                                qu0Var.q0(cArr[b2 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 0;
                    i6 = 32;
                    i7 = 43;
                }
                return qu0Var.k0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static vc3 z(vc3 vc3Var) {
        try {
            if (!vc3.i0(vc3Var) || !(vc3Var.Z() instanceof CloseableStaticBitmap)) {
                vc3.P(vc3Var);
                return null;
            }
            vc3 vc3VarCloneUnderlyingBitmapReference = ((CloseableStaticBitmap) vc3Var.Z()).cloneUnderlyingBitmapReference();
            vc3Var.close();
            return vc3VarCloneUnderlyingBitmapReference;
        } catch (Throwable th) {
            vc3.P(vc3Var);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mni.A(tm9):l0g");
    }

    @Override // defpackage.sy2
    public th3 G() {
        return X;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = kdd.g;
        wqi.e("kdd", "RECENT REMOVED update handle fail", (Throwable) obj);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return vqa.i((List) obj);
    }

    @Override // defpackage.v1c
    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.v1c
    public void c(float f, float f2) {
    }

    @Override // defpackage.r02
    public ryf e() {
        return ryf.b;
    }

    @Override // defpackage.lg9
    public void f(vf9 vf9Var, boolean z) {
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = Z;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = Y;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = X;
        oi3 oi3Var = th3Var.f;
        bi3 bi3Var = th3Var.d;
        vh3 vh3Var = th3Var.c;
        hg3 hg3Var = th3Var.a;
        qi3 qi3Var = th3Var.g;
        ji3 ji3Var = th3Var.e;
        kg3 kg3Var = th3Var.b;
        if (i == vuc.chat_common_action_background_error) {
            return hg3Var.a.a;
        }
        if (i == vuc.chat_common_action_background_neutral) {
            return hg3Var.a.b;
        }
        if (i == vuc.chat_common_action_background_themed) {
            return hg3Var.a.c;
        }
        if (i == vuc.chat_common_action_background_themedFade) {
            return hg3Var.a.d;
        }
        if (i == vuc.chat_common_action_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_action_icon_neutral) {
            return hg3Var.b.a;
        }
        if (i == vuc.chat_common_action_icon_neutralSecondary) {
            return hg3Var.b.b;
        }
        if (i == vuc.chat_common_action_icon_themedFade) {
            return hg3Var.b.c;
        }
        if (i == vuc.chat_common_background_accent) {
            return kg3Var.e;
        }
        if (i == vuc.chat_common_background_capsule) {
            return kg3Var.f;
        }
        if (i == vuc.chat_common_background_capsuleOutside) {
            return kg3Var.g;
        }
        if (i == vuc.chat_common_background_capsuleSecondary) {
            return kg3Var.h;
        }
        if (i == vuc.chat_common_background_chatFAB) {
            return kg3Var.i;
        }
        if (i == vuc.chat_common_background_contrastFloatingSecondary) {
            return kg3Var.j;
        }
        if (i == vuc.chat_common_background_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_background_neutral) {
            return kg3Var.k;
        }
        if (i == vuc.chat_common_background_neutralFade) {
            return 1543503872;
        }
        if (i == vuc.chat_common_background_neutralFadeSecondary) {
            return kg3Var.l;
        }
        if (i == vuc.chat_common_background_neutralFadeTertiary) {
            return kg3Var.m;
        }
        if (i == vuc.chat_common_background_neutralThemed) {
            return kg3Var.n;
        }
        if (i == vuc.chat_common_background_overlay) {
            return kg3Var.o;
        }
        if (i == vuc.chat_common_background_overlayHard) {
            return kg3Var.p;
        }
        if (i == vuc.chat_common_background_overlaySecondary) {
            return kg3Var.q;
        }
        if (i == vuc.chat_common_background_pattern) {
            return kg3Var.r;
        }
        if (i == vuc.chat_common_background_searchHighlight) {
            return kg3Var.s;
        }
        if (i == vuc.chat_common_background_stickerBlank) {
            return kg3Var.t;
        }
        if (i == vuc.chat_common_background_surfaceGround) {
            return kg3Var.u;
        }
        if (i == vuc.chat_common_background_timelineActive) {
            return -1191182337;
        }
        if (i == vuc.chat_common_background_timelinePassive) {
            return 1392508927;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep1) {
            return kg3Var.a.a;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep2) {
            return kg3Var.a.b;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep3) {
            return kg3Var.a.c;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep4) {
            return kg3Var.a.d;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep5) {
            return kg3Var.a.e;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep6) {
            return kg3Var.a.f;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep1) {
            return kg3Var.a.g;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep2) {
            return kg3Var.a.h;
        }
        if (i == vuc.chat_common_background_chatBackground_patternColor) {
            return kg3Var.a.i;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep1) {
            return kg3Var.a.j;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep2) {
            return kg3Var.a.k;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep1) {
            return kg3Var.a.l;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep2) {
            return kg3Var.a.m;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep3) {
            return kg3Var.a.n;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep4) {
            return kg3Var.a.o;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep5) {
            return kg3Var.a.p;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep6) {
            return kg3Var.a.q;
        }
        if (i == vuc.chat_common_background_fileType_archiveBadge) {
            return -6543440;
        }
        if (i == vuc.chat_common_background_fileType_archiveBkg) {
            return kg3Var.b.a;
        }
        if (i == vuc.chat_common_background_fileType_archiveElement) {
            return kg3Var.b.b;
        }
        if (i == vuc.chat_common_background_fileType_archiveIcon) {
            return kg3Var.b.c;
        }
        if (i == vuc.chat_common_background_fileType_background) {
            return kg3Var.b.d;
        }
        if (i == vuc.chat_common_background_fileType_dataBadge) {
            return -15697601;
        }
        if (i == vuc.chat_common_background_fileType_dataBkg) {
            return kg3Var.b.e;
        }
        if (i == vuc.chat_common_background_fileType_dataElement) {
            return kg3Var.b.f;
        }
        if (i == vuc.chat_common_background_fileType_dataIcon) {
            return kg3Var.b.g;
        }
        if (i == vuc.chat_common_background_fileType_imageBadge) {
            return kg3Var.b.h;
        }
        if (i == vuc.chat_common_background_fileType_imageBkg) {
            return kg3Var.b.i;
        }
        if (i == vuc.chat_common_background_fileType_imageElement) {
            return kg3Var.b.j;
        }
        if (i == vuc.chat_common_background_fileType_imageIcon) {
            return kg3Var.b.k;
        }
        if (i == vuc.chat_common_background_fileType_musicBadge) {
            return kg3Var.b.l;
        }
        if (i == vuc.chat_common_background_fileType_musicBkg) {
            return kg3Var.b.m;
        }
        if (i == vuc.chat_common_background_fileType_musicElement) {
            return kg3Var.b.n;
        }
        if (i == vuc.chat_common_background_fileType_musicIcon) {
            return kg3Var.b.o;
        }
        if (i == vuc.chat_common_background_fileType_presentationBadge) {
            return kg3Var.b.p;
        }
        if (i == vuc.chat_common_background_fileType_presentationBkg) {
            return kg3Var.b.q;
        }
        if (i == vuc.chat_common_background_fileType_presentationElement) {
            return kg3Var.b.r;
        }
        if (i == vuc.chat_common_background_fileType_presentationIcon) {
            return kg3Var.b.s;
        }
        if (i == vuc.chat_common_background_fileType_programBadge) {
            return kg3Var.b.t;
        }
        if (i == vuc.chat_common_background_fileType_programBkg) {
            return kg3Var.b.u;
        }
        if (i == vuc.chat_common_background_fileType_programElement) {
            return kg3Var.b.v;
        }
        if (i == vuc.chat_common_background_fileType_programIcon) {
            return kg3Var.b.w;
        }
        if (i == vuc.chat_common_background_fileType_textBadge) {
            return -14983490;
        }
        if (i == vuc.chat_common_background_fileType_textBkg) {
            return kg3Var.b.x;
        }
        if (i == vuc.chat_common_background_fileType_textElement) {
            return kg3Var.b.y;
        }
        if (i == vuc.chat_common_background_fileType_textIcon) {
            return kg3Var.b.z;
        }
        if (i == vuc.chat_common_background_fileType_unknownBadge) {
            return kg3Var.b.A;
        }
        if (i == vuc.chat_common_background_fileType_unknownBkg) {
            return kg3Var.b.B;
        }
        if (i == vuc.chat_common_background_fileType_unknownElement) {
            return kg3Var.b.C;
        }
        if (i == vuc.chat_common_background_fileType_unknownIcon) {
            return kg3Var.b.D;
        }
        if (i == vuc.chat_common_background_fileType_videoBadge) {
            return kg3Var.b.E;
        }
        if (i == vuc.chat_common_background_fileType_videoBkg) {
            return kg3Var.b.F;
        }
        if (i == vuc.chat_common_background_fileType_videoElement) {
            return kg3Var.b.G;
        }
        if (i == vuc.chat_common_background_fileType_videoIcon) {
            return kg3Var.b.H;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
            return kg3Var.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
            return kg3Var.c.b.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
            return kg3Var.c.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
            return kg3Var.c.d.a.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRBackground) {
            return kg3Var.d.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep1) {
            return kg3Var.d.c;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep2) {
            return kg3Var.d.d;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep3) {
            return kg3Var.d.e;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep4) {
            return kg3Var.d.f;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
            return kg3Var.d.g;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
            return kg3Var.d.h;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep1) {
            return kg3Var.d.i;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep2) {
            return kg3Var.d.j;
        }
        if (i == vuc.chat_common_icon_accent) {
            return vh3Var.a;
        }
        if (i == vuc.chat_common_icon_accentContrast) {
            return vh3Var.b;
        }
        if (i == vuc.chat_common_icon_capsule || i == vuc.chat_common_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_icon_negative) {
            return vh3Var.c;
        }
        if (i == vuc.chat_common_icon_secondary) {
            return vh3Var.d;
        }
        if (i == vuc.chat_common_icon_themed) {
            return vh3Var.e;
        }
        if (i == vuc.chat_common_icon_verificationCapsule) {
            return vh3Var.f;
        }
        if (i == vuc.chat_common_shadows_elevation2_primary) {
            return bi3Var.a.a;
        }
        if (i == vuc.chat_common_shadows_elevation2_secondary) {
            return bi3Var.a.b;
        }
        if (i == vuc.chat_common_shadows_topBar_color) {
            return bi3Var.b.a;
        }
        if (i == vuc.chat_common_shadows_writeBar_color) {
            return bi3Var.c.a;
        }
        if (i == vuc.chat_common_states_background_active_neutralFadeTertiary) {
            return ji3Var.a.a.b;
        }
        if (i == vuc.chat_common_states_background_active_action_themed) {
            return ji3Var.a.a.a.a;
        }
        if (i == vuc.chat_common_states_background_disabled_accent) {
            return ji3Var.a.b.a;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralFadeSecondary) {
            return ji3Var.a.b.b;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralThemed) {
            return ji3Var.a.b.c;
        }
        if (i == vuc.chat_common_states_icon_disabled_negative) {
            return ji3Var.b.a.a;
        }
        if (i == vuc.chat_common_states_icon_disabled_themed) {
            return ji3Var.b.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_contrast) {
            return ji3Var.c.a.a;
        }
        if (i == vuc.chat_common_states_text_disabled_contrastStatic) {
            return ji3Var.c.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_negative) {
            return ji3Var.c.a.c;
        }
        if (i == vuc.chat_common_states_text_disabled_primary) {
            return ji3Var.c.a.d;
        }
        if (i == vuc.chat_common_states_text_disabled_themed) {
            return ji3Var.c.a.e;
        }
        if (i == vuc.chat_common_stroke_contrast) {
            return oi3Var.b;
        }
        if (i == vuc.chat_common_stroke_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_stroke_glass) {
            return oi3Var.c;
        }
        if (i == vuc.chat_common_stroke_separator_primary) {
            return oi3Var.a.a;
        }
        if (i == vuc.chat_common_stroke_separator_secondary) {
            return oi3Var.a.b;
        }
        if (i == vuc.chat_common_text_capsule) {
            return qi3Var.a;
        }
        if (i == vuc.chat_common_text_capsuleSecondary) {
            return qi3Var.b;
        }
        if (i == vuc.chat_common_text_contrast) {
            return qi3Var.c;
        }
        if (i == vuc.chat_common_text_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_text_fileType) {
            return -520093697;
        }
        if (i == vuc.chat_common_text_negative) {
            return qi3Var.d;
        }
        if (i == vuc.chat_common_text_primary) {
            return qi3Var.e;
        }
        if (i == vuc.chat_common_text_secondary) {
            return qi3Var.f;
        }
        if (i == vuc.chat_common_text_tertiary) {
            return qi3Var.g;
        }
        if (i == vuc.chat_common_text_themed) {
            return qi3Var.h;
        }
        if (i == vuc.chat_topbar_background_default_neutral) {
            return tcgVar.a.a;
        }
        if (i == vuc.chat_topbar_background_default_neutralFade) {
            return tcgVar.a.b;
        }
        if (i == vuc.chat_topbar_background_default_primary) {
            return -855638017;
        }
        if (i == vuc.chat_topbar_background_default_themed) {
            return tcgVar.a.c;
        }
        if (i == vuc.chat_topbar_background_default_topbar) {
            return tcgVar.a.d;
        }
        if (i == vuc.chat_topbar_background_disabled_neutral) {
            return tcgVar.b.a;
        }
        if (i == vuc.chat_topbar_background_disabled_neutralFade) {
            return tcgVar.b.b;
        }
        if (i == vuc.chat_topbar_background_disabled_themed) {
            return tcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_default_contrast) {
            return xcgVar.a.a;
        }
        if (i == vuc.chat_topbar_icon_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_icon_default_neutralFade) {
            return xcgVar.a.b;
        }
        if (i == vuc.chat_topbar_icon_default_primary) {
            return xcgVar.a.c;
        }
        if (i == vuc.chat_topbar_icon_default_quaternary) {
            return xcgVar.a.d;
        }
        if (i == vuc.chat_topbar_icon_default_secondary) {
            return xcgVar.a.e;
        }
        if (i == vuc.chat_topbar_icon_default_tertiary) {
            return xcgVar.a.f;
        }
        if (i == vuc.chat_topbar_icon_default_themed) {
            return xcgVar.a.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrast) {
            return xcgVar.b.a;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrastStatic) {
            return xcgVar.b.b;
        }
        if (i == vuc.chat_topbar_icon_disabled_negative) {
            return xcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_disabled_neutralFade) {
            return xcgVar.b.d;
        }
        if (i == vuc.chat_topbar_icon_disabled_primary) {
            return xcgVar.b.e;
        }
        if (i == vuc.chat_topbar_icon_disabled_quaternary) {
            return xcgVar.b.f;
        }
        if (i == vuc.chat_topbar_icon_disabled_secondary) {
            return xcgVar.b.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_tertiary) {
            return xcgVar.b.h;
        }
        if (i == vuc.chat_topbar_icon_disabled_themed) {
            return xcgVar.b.i;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_primary) {
            return adgVar.a.a.a;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_secondary) {
            return adgVar.a.a.b;
        }
        if (i == vuc.chat_topbar_text_default_contrast) {
            return ddgVar.a.a;
        }
        if (i == vuc.chat_topbar_text_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_text_default_primary) {
            return ddgVar.a.b;
        }
        if (i == vuc.chat_topbar_text_default_secondary) {
            return ddgVar.a.c;
        }
        if (i == vuc.chat_topbar_text_default_themed) {
            return ddgVar.a.d;
        }
        if (i == vuc.chat_topbar_text_disabled_contrast) {
            return ddgVar.b.a;
        }
        if (i == vuc.chat_topbar_text_disabled_contrastStatic) {
            return ddgVar.b.b;
        }
        if (i == vuc.chat_topbar_text_disabled_primary) {
            return ddgVar.b.c;
        }
        if (i == vuc.chat_topbar_text_disabled_secondary) {
            return ddgVar.b.d;
        }
        if (i == vuc.chat_topbar_text_disabled_themed) {
            return ddgVar.b.e;
        }
        if (i == vuc.chat_writebar_background_emojiArea) {
            return q6iVar.a;
        }
        if (i == vuc.chat_writebar_background_input) {
            return q6iVar.b;
        }
        if (i == vuc.chat_writebar_background_neutralFade) {
            return q6iVar.c;
        }
        if (i == vuc.chat_writebar_background_surface) {
            return q6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_neutral) {
            return s6iVar.a;
        }
        if (i == vuc.chat_writebar_icon_neutralSecondary) {
            return s6iVar.b;
        }
        if (i == vuc.chat_writebar_icon_neutralTertiary) {
            return s6iVar.c;
        }
        if (i == vuc.chat_writebar_icon_themed) {
            return s6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_verificationReplyTo) {
            return s6iVar.e;
        }
        if (i == vuc.chat_writebar_stroke_areaSeparator) {
            return t6iVar.a;
        }
        if (i == vuc.chat_writebar_stroke_input) {
            return t6iVar.b;
        }
        if (i == vuc.chat_writebar_stroke_themed) {
            return t6iVar.c;
        }
        if (i == vuc.chat_writebar_text_input) {
            return u6iVar.a;
        }
        if (i == vuc.chat_writebar_text_inputMDLink) {
            return u6iVar.b;
        }
        if (i == vuc.chat_writebar_text_inputPlaceholder) {
            return u6iVar.c;
        }
        if (i == vuc.chat_writebar_text_primary) {
            return u6iVar.d;
        }
        if (i == vuc.chat_writebar_text_replyMessage) {
            return u6iVar.e;
        }
        if (i == vuc.chat_writebar_text_replyTo) {
            return u6iVar.f;
        }
        if (i == vuc.chat_writebar_text_secondary) {
            return u6iVar.g;
        }
        if (i == vuc.chat_writebar_text_themed) {
            return u6iVar.h;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown attr res passed "));
    }

    @Override // javax.inject.Provider
    public Object get() {
        iwf iwfVar = new iwf();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(l9c.a, new jb0(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(l9c.c, new jb0(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(l0e.b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(l9c.b, new jb0(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < l9c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new ib0(iwfVar, map);
    }

    @Override // defpackage.r02
    public long getTimestamp() {
        return -1L;
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return d;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return taj.b((Executor) v6dVar.f(new fsc(gqg.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return Z;
    }

    @Override // defpackage.nyg
    public int l(Object obj) {
        return ((nf9) obj).Q();
    }

    @Override // defpackage.r02
    public p02 m() {
        return p02.a;
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        yebVar.getIcon();
        return ipi.a(-1, yebVar.getIcon().k);
    }

    @Override // defpackage.r02
    public int o() {
        return 1;
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        return efi.o(tm9Var);
    }

    @Override // defpackage.r02
    public n02 q() {
        return n02.a;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return o;
    }

    @Override // defpackage.r02
    public CaptureResult s() {
        return null;
    }

    @Override // defpackage.v1c
    public void t(float f, float f2, int i, int i2, j1c j1cVar) {
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return d1g.a(((Number) obj).intValue());
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Y;
    }

    @Override // defpackage.r02
    public o02 v() {
        return o02.a;
    }

    @Override // defpackage.lg9
    public boolean x(vf9 vf9Var) {
        return false;
    }
}
