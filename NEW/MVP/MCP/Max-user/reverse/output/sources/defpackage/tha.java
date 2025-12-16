package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.http.HttpStatus;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiCaptchaException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiInvocationParamException;
import ru.ok.android.api.core.ApiLoginException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.session.ApiRecreateSessionException;
import ru.ok.android.api.session.ApiSessionChangedException;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes.dex */
public class tha implements ox7, zc3, sy2, tm6, rl3, pug, ghg, uc3, wmb, jn8, kp5, clb, z94, ec8 {
    public static tha b;
    public static volatile ssb u0;
    public final /* synthetic */ int a;
    public static final tha c = new tha(1);
    public static final tha d = new tha(2);
    public static final tha o = new tha(3);
    public static final yt0 X = new yt0(new rt0(new qt0(-1306230231, -1725660631, 1713668649), new st0(new tt0(693802087, 5936231), new ut0(1029346407, 5936231), new vt0(1381667943, 5936231)), new wt0(-13786316, 704643071, -13786316, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -3158065, -2133864497, 536870911, -14734048, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14931677, -14931677, -14931677}, new int[]{-14931677, -14931677}), new zt0(-14470357, -1191182337, -1685946, -36771, -1543503873, -1543503873, -2130706433, -520093697, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new au0(-14470357, 352321535, 1728053247, -1), new bu0(new cu0(-1, -520093697, -1, -520093697), -13786316, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
    public static final yt0 Y = new yt0(new rt0(new qt0(-1722117017, -1722117017, 1717212263), new st0(new tt0(704643071, 16777215), new ut0(1029346407, 5936231), new vt0(1381667943, 5936231)), new wt0(-1, 704643071, -13786316, 704643071), new xt0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231}), -520093697, -2130706433, 704643071, -14393816, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-15115975, -15249357, -15448274}, new int[]{-15448274, -15115975}), new zt0(-15381968, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new au0(-15381968, 452984831, -2046820353, -1), new bu0(new cu0(-15115975, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
    public static final th3 Z = new th3(new hg3(new gg3(-48049, -1579033, -13786316, -5058310), new ig3(-1, 1895825407, -13786316)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -15986931, -15986931, 1378180151, 1378180151, 1378180151, 0, 0, 0, 0, 0, 0), new lg3(721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -2405632, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13786316, 721439744, 1305464783, -1, -10669092, 721429580, 1305464783, -1), new og3(new mg3(452984831, new int[]{16777215, 285212671, 553648127}), new ng3(452984831, new int[]{16777215, 285212671, 553648127}), new qg3(new pg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new sg3(new rg3(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433})), new tg3(new int[]{-1558435549, -535025373, -535025373}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831, 872415231, 452984831), -13786316, 1929379840, -1305786566, -868325805, -12687789, -15263716, -1, 536870911, 402653183, -13786316, -1559491060, -871625204, -1727263220, -2145035209, -13786316, -12500154, -15986931, new int[]{-1305786566, -1305786566}, new int[]{-13940934, -13940934}, new int[]{-650221997, -1304533421, -1942067629}, new int[]{-15986931, -15986931}), new vh3(-13786316, -520093697, -3259817, -2130706433, -13786316, -855638017), new bi3(new ci3(855638016, 637534208), new di3(687865856), new ei3(687865856)), new ji3(new hi3(new gi3(new fi3(-16741368), 536870911), new ii3(-1725062348, 184549375, 1728053247)), new ki3(new li3(1207959551, -1725062348)), new mi3(new ni3(1207959551, 2063597567, 1207959551, -1548240711, -1725062348))), new oi3(new pi3(536870911, 268435455), -855638017, 1883137619), new qi3(-855638017, -855638017, -15987188, -3259817, -520093697, 1895825407, 1207959551, -13786316));
    public static final wcg s0 = new wcg(new tcg(new ucg(-1, 352321535, -13786316, -14801890), new vcg(1728053247, 184549375, -1725062348)), new xcg(new ycg(-15921907, 352321535, -855638017, -11513776, 1895825407, -8618884, -13786316), new zcg(-1559425779, 2063597567, 1207959551, 184549375, -1548109383, -1548109383, -1548109383, -1548109383, -1725062348)), new adg(new bdg(new cdg(536870911, 268435455))), new ddg(new edg(-15921907, -855638017, 1895825407, -13786316), new fdg(-1559425779, 2063597567, -1548109383, -1548109383, -1725062348)));
    public static final r6i t0 = new r6i(new q6i(-15198184, -14801890, 401074151, -14801890), new s6i(-855638017, 1895825407, -8618884, -13786316, 1895825407), new t6i(266856423, 15198183, -13786316), new u6i(-1579033, -13786316, 1474815975, -1, -1108875289, -2130706433, -2130706433, -13786316));
    public static final tha v0 = new tha(5);
    public static final tha w0 = new tha(6);
    public static final tha x0 = new tha(9);
    public static final tha y0 = new tha(11);
    public static final /* synthetic */ tha z0 = new tha(12);

    public /* synthetic */ tha(int i) {
        this.a = i;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != ((byte) 10)) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == ((byte) 10)) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i10][i11];
                    byte[] bArr4 = yxg.a;
                    int i13 = b2 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b3 = bArr[i7 + i12];
                byte[] bArr5 = yxg.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static rw5 b(String str, String str2) {
        return new rw5(str, 1, str2.getBytes(lb2.a));
    }

    public static la5 n(int i) {
        Object next;
        zg5 zg5Var = la5.s0;
        zg5Var.getClass();
        f2 f2Var = new f2(0, zg5Var);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((la5) next).a == i) {
                break;
            }
        }
        la5 la5Var = (la5) next;
        return la5Var == null ? la5.X : la5Var;
    }

    public static long s(sb8 sb8Var) {
        Throwable cause = sb8Var.a;
        if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        int i = DataSourceException.b;
        while (cause != null) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((sb8Var.b - 1) * 1000, 5000);
    }

    public static boolean t(nme nmeVar) {
        String str = nmeVar.b;
        ssb ssbVar = u0;
        if (ssbVar == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        if (g5j.a(ssbVar, "system.shutdown.until.ts")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("system.");
        sb.append(str);
        sb.append(".shutdown.until.ts");
        return g5j.a(ssbVar, sb.toString());
    }

    public static void v(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commands");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        long jOptLong = jSONObjectOptJSONObject.optLong("tagShutdownMs");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("featureShutdownMs");
        Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("globalShutdownMs"));
        Long lValueOf2 = Long.valueOf(jOptLong2);
        Long lValueOf3 = Long.valueOf(jOptLong);
        nn8 nn8Var = new nn8();
        g5j.b(nn8Var, "system.shutdown.until.ts", lValueOf);
        g5j.b(nn8Var, "system." + str + ".shutdown.until.ts", lValueOf2);
        if (str2 != null) {
            g5j.b(nn8Var, "system." + str + '.' + str2 + ".shutdown.until.ts", lValueOf3);
        }
        nn8 nn8VarB = nn8Var.b();
        ssb ssbVar = u0;
        if (ssbVar == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        AtomicReference atomicReference = (AtomicReference) ((bwf) ssbVar.c).getValue();
        loop0: while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Object it = ((on8) nn8VarB.entrySet()).iterator();
            while (((mn8) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((kn8) it).next();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    linkedHashMap.remove(str3);
                } else {
                    linkedHashMap.put(str3, value);
                }
            }
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
        }
        ssb ssbVar2 = u0;
        if (ssbVar2 == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
        ssbVar2.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.zc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l0g A(defpackage.tm9 r14) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tha.A(tm9):l0g");
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public sfg mo163B(int i, int i2) {
        return new jx4();
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Z;
    }

    @Override // defpackage.kp5
    public void Q(i9e i9eVar) {
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return new yr8(new l35((m35) obj, dsd.c(0, "SELECT * FROM draft_uploads"), 0));
            default:
                return (byte[]) obj;
        }
    }

    @Override // defpackage.ec8
    public void c() {
    }

    @Override // defpackage.clb
    public double d(double d2, double d3, double d4, boolean z) {
        return 1.0d;
    }

    @Override // defpackage.jn8
    public Object e(pub pubVar) {
        return pubVar.S0;
    }

    @Override // defpackage.clb
    public void f(double d2) {
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = t0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = s0;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Z;
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
        return X;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return taj.b((Executor) v6dVar.f(new fsc(o48.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return t0;
    }

    @Override // defpackage.wmb
    public Object l(Uri uri, ve4 ve4Var) {
        return Long.valueOf(xxg.E(new BufferedReader(new InputStreamReader(ve4Var)).readLine()));
    }

    @Override // defpackage.ec8
    public void load() {
        synchronized (vmi.a) {
            Object obj = vmi.b;
            synchronized (obj) {
                if (vmi.c) {
                    return;
                }
                long jA = vmi.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    vmi.d = jA;
                    vmi.c = true;
                }
            }
        }
    }

    @Override // defpackage.uc3
    public void m() {
    }

    @Override // defpackage.uc3
    public void o(vve vveVar, Throwable th) {
        Object objA = vveVar.a();
        op5.j(vc3.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(vveVar)), objA == null ? null : objA.getClass().getName());
    }

    public y21 p(nc5 nc5Var, sb8 sb8Var) {
        int i;
        IOException iOException = sb8Var.a;
        boolean z = false;
        if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).d) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (nc5Var.a(1)) {
            return new y21(1, 3, 300000L);
        }
        if (nc5Var.a(2)) {
            return new y21(2, 3, 60000L);
        }
        return null;
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) throws JsonParseException {
        Object apiInvocationParamException;
        switch (this.a) {
            case 1:
                xx7Var.p();
                String strB = null;
                int iX = 0;
                String strB2 = null;
                String strB3 = null;
                String strA0 = null;
                String strA02 = null;
                String strName = null;
                String strR = null;
                while (xx7Var.hasNext()) {
                    String strName2 = xx7Var.name();
                    switch (strName2.hashCode()) {
                        case -1125973592:
                            if (!strName2.equals("ver_redirect_url")) {
                                xx7Var.v();
                                break;
                            } else {
                                xx7Var.B();
                                break;
                            }
                        case -830722045:
                            if (!strName2.equals("error_field")) {
                                xx7Var.v();
                                break;
                            } else {
                                strA0 = xx7Var.a0();
                                break;
                            }
                        case -22145738:
                            if (!strName2.equals("session_key")) {
                                xx7Var.v();
                                break;
                            } else {
                                strB = xx7Var.B();
                                break;
                            }
                        case 96784904:
                            if (!strName2.equals(NegotiationErrorStat.KEY_ERROR)) {
                                xx7Var.v();
                                break;
                            } else {
                                strB3 = xx7Var.B();
                                break;
                            }
                        case 329868490:
                            if (!strName2.equals("error_msg")) {
                                xx7Var.v();
                                break;
                            } else {
                                strB3 = xx7Var.B();
                                break;
                            }
                        case 438353305:
                            if (!strName2.equals("session_secret_key")) {
                                xx7Var.v();
                                break;
                            } else {
                                strB2 = xx7Var.B();
                                break;
                            }
                        case 717465530:
                            if (!strName2.equals("custom_error")) {
                                xx7Var.v();
                                break;
                            } else if (xx7Var.peek() == 110) {
                                xx7Var.v();
                                break;
                            } else {
                                xx7Var.p();
                                while (xx7Var.hasNext()) {
                                    strName = xx7Var.name();
                                    strR = xx7Var.R();
                                }
                                xx7Var.n();
                                break;
                            }
                        case 1635686852:
                            if (!strName2.equals("error_code")) {
                                xx7Var.v();
                                break;
                            } else {
                                iX = xx7Var.x();
                                break;
                            }
                        case 1635703681:
                            if (!strName2.equals("error_data")) {
                                xx7Var.v();
                                break;
                            } else {
                                strA02 = xx7Var.a0();
                                break;
                            }
                        case 1636060774:
                            if (!strName2.equals("error_page")) {
                                xx7Var.v();
                                break;
                            } else {
                                int iPeek = xx7Var.peek();
                                if (iPeek == 110) {
                                    xx7Var.v();
                                    break;
                                } else if (iPeek == 123) {
                                    xx7Var.p();
                                    while (xx7Var.hasNext()) {
                                        String strName3 = xx7Var.name();
                                        if (strName3.hashCode() == 954925063 && strName3.equals("message")) {
                                            int iPeek2 = xx7Var.peek();
                                            if (iPeek2 == 110) {
                                                xx7Var.v();
                                            } else if (iPeek2 != 123) {
                                                xx7Var.B();
                                            } else {
                                                xx7Var.p();
                                                while (xx7Var.hasNext()) {
                                                    String strName4 = xx7Var.name();
                                                    if (strName4.hashCode() == 106748362 && strName4.equals("plain")) {
                                                        xx7Var.B();
                                                    } else {
                                                        xx7Var.v();
                                                    }
                                                }
                                                xx7Var.n();
                                            }
                                        } else {
                                            xx7Var.v();
                                        }
                                    }
                                    xx7Var.n();
                                    break;
                                } else {
                                    xx7Var.B();
                                    break;
                                }
                            }
                            break;
                        default:
                            xx7Var.v();
                            break;
                    }
                }
                xx7Var.n();
                if (iX == 100) {
                    apiInvocationParamException = new ApiInvocationParamException(strB3, strA0, 100, strA02, strName, strR);
                } else {
                    if (iX == 107) {
                        if (strB == null) {
                            throw new JsonParseException("No sessionKey");
                        }
                        if (strB2 != null) {
                            return new ApiSessionChangedException(strB3, strB, strB2);
                        }
                        throw new JsonParseException("No sessionSecretKey");
                    }
                    if (iX == 401) {
                        apiInvocationParamException = new ApiLoginException(strB3, strA0, HttpStatus.SC_UNAUTHORIZED, strA02, strName, strR);
                    } else {
                        if (iX != 403) {
                            return (iX == 102 || iX == 103) ? new ApiRecreateSessionException(iX, strB3) : new ApiInvocationException(strB3, strA0, iX, strA02, strName, strR);
                        }
                        apiInvocationParamException = new ApiCaptchaException(strB3, strA0, HttpStatus.SC_FORBIDDEN, strA02, strName, strR);
                    }
                }
                return apiInvocationParamException;
            default:
                xx7Var.v();
                return null;
        }
    }

    public int q(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return Y;
    }

    @Override // defpackage.clb
    public void reset() {
    }

    @Override // defpackage.sy2
    public wcg u() {
        return s0;
    }

    @Override // defpackage.kp5
    public void w() {
    }
}
