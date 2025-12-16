package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import ru.ok.tracer.upload.SampleUploadWorker;

/* loaded from: classes.dex */
public class q85 implements zc3, sy2, p47, m7c, yf, kp5, if9, rca {
    public final /* synthetic */ int a;
    public static final q85 b = new q85(1);
    public static final q85 c = new q85(2);
    public static final q85 d = new q85(3);
    public static final yt0 o = new yt0(new rt0(new qt0(-1298910156, -1718340556, 1720988724), new st0(new tt0(698759738, 10893882), new ut0(1034304058, 10893882), new vt0(1386625594, 10893882)), new wt0(-5883334, 704643071, -5883334, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14931904, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14931904, -14931904, -14931904}, new int[]{-14931904, -14931904}), new zt0(-14931904, -1191182337, -36771, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-1, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -4242621, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final yt0 X = new yt0(new rt0(new qt0(-1722117017, -1722117017, 1717212263), new st0(new tt0(536870911, 16777215), new ut0(1034304058, 10893882), new vt0(1386625594, 10893882)), new wt0(-1, 704643071, -5883334, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -6475968, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-6475968, -6475968, -3785925}, new int[]{-6475968, -3785925}), new zt0(-4245188, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-5883334, 452984831, -2046820353, -1), new bu0(new cu0(-5883334, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Y = new th3(new hg3(new gg3(-48049, -1579033, -4242621, -5058310), new ig3(-1, 1895825407, -4242621)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -16120563, -16120563, -14083792, -14083792, -14083792, -13430493, -13430493, 3346723, -14737352, -14737352, 2039864), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -2542026, 735655478, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(452984831, new int[]{16777215, 285212671, 553648127}), new ng3(452984831, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new sg3(new rg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new tg3(new int[]{-1555155145, -531744969, -531744969}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -4242621, 1933061678, -1300620761, -867549891, -11911875, -15263716, -1, 536870911, 402653183, -4242621, -1559425779, -871625458, -1727263474, 1297112007, -4242621, -12172991, -15788237, new int[]{-1300620761, -1300620761}, new int[]{-12902360, -12902360}, new int[]{-644272594, -1298584018, -1936118226}, new int[]{-15788237, -14744308}), new vh3(-4242621, -520093697, -3259817, -2130706433, -4242621, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-4250588), 536870911), new ii3(-1715518653, 184549375, 1728053247)), new ki3(new li3(1207959551, -1715518653)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548240711, -1715518653))), new oi3(new pi3(536870911, 268435455), -855638017, 1889087022), new qi3(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -1));
    public static final wcg Z = new wcg(new tcg(new ucg(-1, 352321535, -5883334, -15788509), new vcg(1728053247, 184549375, -1717159366)), new xcg(new ycg(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -4242621), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1715518653)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -4242621), new fdg(-1559425779, 2063597567, -1548109897, -1548109897, -1715518653)));
    public static final r6i s0 = new r6i(new q6i(-15198184, -15788509, 401074151, -15788509), new s6i(-855638017, 1895825407, -8816004, -5883334, 1895825407), new t6i(266856423, 15198183, -5883334), new u6i(-1579033, -5883334, 1474815975, -1, -1108875289, -2130706433, -2130706433, -5883334));
    public static final q85 t0 = new q85(4);
    public static final int[] u0 = {8, 13, 11, 2, 0, 1, 7};
    public static final q85 v0 = new q85(6);
    public static final q85 w0 = new q85(7);
    public static final q85 x0 = new q85(8);
    public static final q85 y0 = new q85(9);
    public static final q85 z0 = new q85(11);
    public static final q85 A0 = new q85(12);

    public /* synthetic */ q85(int i) {
        this.a = i;
    }

    public static final long e(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1L;
    }

    public static final String f(Uri uri) {
        String string = uri.toString();
        return string.length() > 30 ? string.substring(0, 30).concat("...") : string;
    }

    public static final void j(rf7 rf7Var) {
        if (!(rf7Var.k.a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(ArrayList arrayList, int i) {
        if (jni.f(i, 0, 7, u0) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static u81 q(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -2105248304) {
            if (str.equals("MOVIE_SHARE")) {
                return u81.c;
            }
            return null;
        }
        if (iHashCode == -1881579439) {
            if (str.equals("RECORD")) {
                return u81.b;
            }
            return null;
        }
        if (iHashCode == -1284823979) {
            if (str.equals("ADD_PARTICIPANT")) {
                return u81.a;
            }
            return null;
        }
        if (iHashCode == 65120 && str.equals("ASR")) {
            return u81.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.l0g s(defpackage.tm9 r19) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q85.s(tm9):l0g");
    }

    public static void v(Context context, nme nmeVar, File file, String str, Long l, Map map, int i) throws Throwable {
        String str2 = (i & 16) != 0 ? null : str;
        Map map2 = (i & 128) != 0 ? id5.a : map;
        long length = file.length();
        String name = file.getName();
        long jE = t4j.e(u4j.b(context.getPackageManager(), context.getPackageName()));
        r5j r5jVar = new r5j(14);
        r5jVar.H("tracer_feature_name", nmeVar.b);
        r5jVar.F("tracer_feature_uze_gzip", true);
        r5jVar.H("tracer_sample_file_path", file.getPath());
        r5jVar.G(length, "tracer_sample_file_size");
        r5jVar.H("tracer_sample_file_name", name);
        r5jVar.H("tracer_feature_tag", str2);
        r5jVar.F("tracer_has_attr1", true);
        ((HashMap) r5jVar.b).put("tracer_attr1", l);
        ((HashMap) r5jVar.b).put("tracer_custom_properties_keys", (String[]) map2.keySet().toArray(new String[0]));
        r5jVar.E(map2);
        r5jVar.G(jE, "tracer_version_code");
        yd4 yd4VarG = r5jVar.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        feg fegVar = feg.a;
        Object obj = feg.c().get(nca.b);
        if ((obj instanceof s74 ? (s74) obj : null) == null) {
            new s7c(13).d();
        }
        c5i.d(context).a((ogb) ((ngb) ((ngb) new ngb(SampleUploadWorker.class).setConstraints(new bu3(3, false, true, true, false, -1L, -1L, ue3.h0(linkedHashSet)))).setInputData(yd4VarG)).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:482:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r21) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q85.A(tm9):l0g");
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public sfg mo163B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Y;
    }

    @Override // defpackage.kp5
    public void Q(i9e i9eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rca
    public void a(String str) {
        wqi.c("Webm", str, new Object[0]);
    }

    @Override // defpackage.yf
    public int b() {
        return 0;
    }

    @Override // defpackage.rca
    public void c(String str, Throwable th) {
        wqi.e("Webm", str, th);
    }

    @Override // defpackage.rca
    public void d(Throwable th) {
        wqi.e("Webm", "fail!", th);
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

    @Override // defpackage.sy2
    public yt0 i() {
        return o;
    }

    @Override // defpackage.sy2
    public r6i k() {
        return s0;
    }

    public raj m(gf6 gf6Var) {
        int i;
        int i2;
        String str = gf6Var.v0;
        if (str != null) {
            i = 1;
            i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new aq(i2);
                case "application/x-icy":
                    return new bc7();
                case "application/id3":
                    return new kc7(null);
                case "application/x-emsg":
                    return new aq(i);
                case "application/x-scte35":
                    return new b8f();
            }
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public void n(en8 en8Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Event bus " + en8Var + " accessed from non-main thread " + Looper.myLooper());
    }

    public boolean o() {
        return this instanceof lp8;
    }

    public void p(float f, float f2, float f3, gte gteVar) {
        gteVar.c(f, 0.0f);
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return X;
    }

    public boolean t(gf6 gf6Var) {
        String str = gf6Var.v0;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.sy2
    public wcg u() {
        return Z;
    }

    @Override // defpackage.kp5
    public void w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.if9
    public double x(pf9 pf9Var) {
        int iOrdinal = pf9Var.ordinal();
        if (iOrdinal == 0) {
            return 0.0d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        op5.n("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", pf9Var);
        return 0.0d;
    }
}
