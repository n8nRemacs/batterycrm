package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseLongArray;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* loaded from: classes2.dex */
public final class jbe implements p20, xx1, sy2, w74, tm6, rl3, c6f, gu3, zc3, apf, uy, g5a, qu6, rof, orf, tn8, bh8 {
    public final /* synthetic */ int a;
    public static final jbe b = new jbe(1);
    public static final jbe c = new jbe(2);
    public static final jbe d = new jbe(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1555484473, -1555484473, 1716072647), new st0(new tt0(524890311, 4796615), new ut0(1028206791, 4796615), new vt0(1028206791, 4796615)), new wt0(-11980601, 340340935, -1, -2058800953), new xt0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812}), -9810433, 1030376959, 342511103, -1, 342511103, -4112, 342511103, -1, 342511103, 2053787135, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -11980601, -1685946, -53188, -11980601, -1303826233, -2062807794, -1, -8356967, -8356967, -11980601, -871625458, -1895035634, 1879837966, -1895035634), new au0(-1, 340340935, -11980601, -1), new bu0(new cu0(-1, -9810433, -9810433, -1), -9810433, -9810433, -9810433, -15987442, -2062807794, -2062808050, -1207170034, -9810433, 16777215, -2062808050, -1207170034, -2062807794));
    public static final yt0 X = new yt0(new rt0(new qt0(-1723256633, -1723256633, 1716072647), new st0(new tt0(524890311, 4796615), new ut0(1028206791, 4796615), new vt0(1028206791, 4796615)), new wt0(-11980601, 524890311, -1, -2058800953), new xt0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812}), -11980601, 1548300487, 340340935, -1442305, 340340935, 340340935, 524890311, -656897, 340340935, 2051616967, new int[]{-2432769, -2432769, -2432769}, new int[]{-2432769, -2432769}), new zt0(-2432769, -11980601, -1685946, -16711919, -11980601, -11980601, -11980601, -1, -2062744269, -2062744269, -16711919, -871561933, -1894972109, 1879901491, -1894972109), new au0(-2432769, 340340935, -11980601, -1), new bu0(new cu0(-1, -11980601, -11980601, -1), -11980601, -11980601, -16711919, -15923917, -2062744269, -2062744269, -1207106253, -11980601, 16777215, -2062744269, -1207106253, -11980601));
    public static final th3 Y = new th3(new hg3(new gg3(-53188, -15921907, -11980601, -2693121), new ig3(-15987442, -4933959, -11980601)), new kg3(new jg3(-857370754, -857370754, 15044478, -9199105, -9199105, 7578111, -3962899, -3962899, -5283609, -5283609, -5283609, -2987919, -2987919, 13789297, -11631873, -11631873, 5145343), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -7523380, 1030376959, 694832639, -7523380, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -5762087, -16729857, 47359, -14779661, 1997555, 872415231, 452984831, -1, -2130706433), -11980601, 1543503872, -2055524153, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521230, -871625714, -1727263730, 1493172224, -11980601, -1184014, -3962899, new int[]{-2053557249, -2053557249}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-1732738, -3962899}), new vh3(-11980601, -11980601, -53188, -2062808050, -11980601, -1), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-14810958), 520093696), new ii3(-1723256633, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1723256633)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552977290, -1723256633))), new oi3(new pi3(688655374, 252447758), -1, 1308622847), new qi3(-1, -15987698, -1, -53188, -15987698, -2062808050, 1712065550, -11980601));
    public static final wcg Z = new wcg(new tcg(new ucg(-15921907, 336136457, -11980601, -1), new vcg(2047675661, 168364297, -1723256633)), new xcg(new ycg(-1, 336136457, -15921907, -4276546, -11184811, -7566196, -11980601), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552517514, -1552517514, -1552517514, -1552517514, -1723256633)), new adg(new bdg(new cdg(688655374, 252447758))), new ddg(new edg(-1, -15921907, -2062742259, -11980601), new fdg(-1543503873, -1191182337, -1552517514, -1552517514, -1723256633)));
    public static final r6i s0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987698, -7566196, -7566196, -11980601, 1879837710), new t6i(252447758, 252447758, -11980601), new u6i(-15987698, -11980601, 1712065550, -15987698, -1207170034, -2062808050, -2062808050, -11980601));
    public static final /* synthetic */ jbe t0 = new jbe(4);
    public static final jbe u0 = new jbe(5);
    public static final jbe v0 = new jbe(6);
    public static final jbe w0 = new jbe(7);
    public static final jbe x0 = new jbe(8);
    public static final jbe y0 = new jbe(9);
    public static final jbe z0 = new jbe(10);
    public static final jbe A0 = new jbe(11);
    public static final /* synthetic */ jbe B0 = new jbe(12);

    public /* synthetic */ jbe(int i) {
        this.a = i;
    }

    public static final String b(zf zfVar) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = zfVar.b;
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "Illegal Capacity: "));
        }
        int[] iArr2 = new int[Math.max(i, 8)];
        int i2 = 0;
        while (zfVar.b != 0) {
            int iC = zfVar.c();
            int length = iArr2.length;
            if (i2 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i2] = iC;
            i2++;
            iArr2 = iArr;
        }
        while (i2 != 0) {
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            i2--;
            int i3 = iArr2[i2];
            String str = "";
            switch (i3) {
                case 0:
                case 2:
                    break;
                case 1:
                    str = "=";
                    break;
                case 3:
                case 5:
                    str = "{";
                    break;
                case 4:
                    str = "{:";
                    break;
                case 6:
                case 7:
                    str = "[";
                    break;
                default:
                    throw new IllegalArgumentException(ho7.f(i3, ""));
            }
            sb.append(str);
            zfVar.e(i3);
        }
        return sb.toString();
    }

    public static void l(EventItemsMap eventItemsMap, u42 u42Var) {
        eventItemsMap.set("local_connection_type", u42Var.b);
        eventItemsMap.set("remote_connection_type", u42Var.e);
        eventItemsMap.set("local_address", u42Var.d);
        eventItemsMap.set("remote_address", u42Var.g);
        String str = u42Var.h;
        Integer numValueOf = null;
        if (str != null) {
            Float fValueOf = q1e.a.a(str) ? Float.valueOf(Float.parseFloat(str)) : null;
            if (fValueOf != null) {
                numValueOf = Integer.valueOf(n7j.c((int) fValueOf.floatValue(), 0, 60000));
            }
        }
        eventItemsMap.set(RttRateHintConfig.RTT, numValueOf);
        eventItemsMap.set("transport", u42Var.i);
    }

    private final void n(String str, Throwable th) {
    }

    private final void q(String str, Throwable th) {
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r14) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbe.A(tm9):l0g");
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.rof
    public int J(hf6 hf6Var) {
        String str = hf6Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(wy1.h("Unsupported MIME type: ", str));
    }

    @Override // defpackage.orf
    public prf a(u73 u73Var) {
        return new tk6((Context) u73Var.c, (String) u73Var.d, (ggg) u73Var.o, u73Var.a, u73Var.b);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = kdd.g;
        wqi.e("kdd", "RECENT ADDED update handle fail", (Throwable) obj);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? tr8.a : or8.d(list);
    }

    @Override // defpackage.apf
    public ybj c(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = fud.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? n5e.f(bundle) : n5e.f(null);
    }

    @Override // defpackage.bh8
    public void cc(String str) {
    }

    @Override // defpackage.tn8
    public Map d(Map map) {
        return map == null ? new HashMap() : map;
    }

    @Override // defpackage.bh8
    public void debug(String str) {
    }

    @Override // defpackage.bh8
    public void decrypted(String str, byte[] bArr) {
    }

    @Override // defpackage.xx1
    public String e() {
        return "other";
    }

    @Override // defpackage.bh8
    public void encrypted(String str, byte[] bArr) {
    }

    @Override // defpackage.uy, defpackage.bh8
    public void error(String str, Throwable th) {
        int i = this.a;
    }

    @Override // defpackage.rof
    public boolean f(hf6 hf6Var) {
        String str = hf6Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = s0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = Z;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Y;
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

    @Override // defpackage.bh8
    public vqc getQLog() {
        return new mni();
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return o;
    }

    @Override // defpackage.bh8
    public void info(String str) {
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return taj.b((Executor) v6dVar.f(new fsc(nq0.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    @Override // defpackage.bh8
    public boolean logRecovery() {
        return false;
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        cl clVar = new cl();
        clVar.c = "";
        int iM = efi.m(tm9Var);
        for (int i = 0; i < iM; i++) {
            String strO = efi.o(tm9Var);
            strO.getClass();
            switch (strO) {
                case "description":
                    clVar.c = efi.o(tm9Var);
                    break;
                case "name":
                    clVar.b = efi.o(tm9Var);
                    break;
                case "botId":
                    clVar.a = efi.l(tm9Var, 0L);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new gr0(clVar);
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    @Override // defpackage.bh8
    public void raw(String str, byte[] bArr) {
    }

    @Override // defpackage.bh8
    public void received(Instant instant, int i, btc btcVar) {
    }

    @Override // defpackage.bh8
    public void receivedPacketInfo(String str) {
    }

    @Override // defpackage.bh8
    public void recovery(String str) {
    }

    @Override // defpackage.bh8
    public void secret(String str, byte[] bArr) {
    }

    @Override // defpackage.bh8
    public void sent(Instant instant, List list) {
    }

    @Override // defpackage.bh8
    public void sentPacketInfo(String str) {
    }

    @Override // defpackage.bh8
    public void stream(String str) {
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    @Override // defpackage.bh8
    public void warn(String str) {
    }

    @Override // defpackage.rof
    public tof x(hf6 hf6Var) {
        String str = hf6Var.n;
        List list = hf6Var.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new qs3(list);
                case "application/pgs":
                    return new k5i(7);
                case "application/x-mp4-vtt":
                    return new mc5(23);
                case "text/vtt":
                    return new wib(19);
                case "application/x-quicktime-tx3g":
                    return new rog(list);
                case "text/x-ssa":
                    return new u8f(list);
                case "application/vobsub":
                    return new gge(list);
                case "application/x-subrip":
                    return new unf();
                case "application/ttml+xml":
                    return new sjg();
            }
        }
        throw new IllegalArgumentException(wy1.h("Unsupported MIME type: ", str));
    }

    public jbe() {
        this.a = 27;
        new SparseLongArray();
    }

    @Override // defpackage.bh8
    public void debug(String str, Exception exc) {
    }

    @Override // defpackage.bh8
    public void decrypted(String str) {
    }

    @Override // defpackage.bh8
    public void error(String str) {
    }

    @Override // defpackage.bh8
    public void raw(String str, ByteBuffer byteBuffer, int i, int i2) {
    }

    @Override // defpackage.bh8
    public void recovery(String str, Instant instant) {
    }

    @Override // defpackage.bh8
    public void debug(String str, byte[] bArr) {
    }
}
