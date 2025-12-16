package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.b;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tracer.nativebridge.NativeBridge;

/* loaded from: classes.dex */
public final class rha implements m7c, ul, sy2, zc3, tm6, rl3, NativeBridge, wzg, pug, mn0, fod, q7c, pc6, tn8, z94, dc8 {
    public static rha D0;
    public static rha b;
    public final /* synthetic */ int a;
    public static final rha c = new rha(1);
    public static final rha d = new rha(2);
    public static final rha o = new rha(3);
    public static final yt0 X = new yt0(new rt0(new qt0(-1547347432, -1547347432, 1724209688), new st0(new tt0(535060519, 14966823), new ut0(1038376999, 14966823), new vt0(1038376999, 14966823)), new wt0(-1810393, 350511143, -1, -2048630745), new xt0(1306812455, 182738983, 14966823, new int[]{1306812455, -2132516825}), -1810393, 1038376999, 350511143, -1, 350511143, -4112, 350511143, -1, 350511143, 2061787175, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -1810393, -1685946, -53188, -1810393, -1293656025, -2062807794, -1, -6716293, -6716293, -1810393, -1559491314, -1895035634, 1879837966, -1895035634), new au0(-1, 350511143, -1810393, -1), new bu0(new cu0(-1, -1810393, -1810393, -1), -1810393, -1810393, -1810393, -15987442, -2062807794, -2062807794, -1207169778, -1810393, 16777215, -2062807794, -1207169778, -2062807794));
    public static final yt0 Y = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(535060519, 14966823), new ut0(1038376999, 14966823), new vt0(1038376999, 14966823)), new wt0(-1810393, 535060519, -1, -2048630745), new xt0(1306812455, 182738983, 14966823, new int[]{1306812455, -2132516825}), -1810393, 1558470695, 350511143, -6734, 350511143, 350511143, 535060519, -656897, 350511143, 2061787175, new int[]{-6734, -6734, -6734}, new int[]{-1442305, -1442305}), new zt0(-138063, -1810393, -1685946, -16711919, -1810393, -1810393, -1810393, -1, -2060253947, -2060253947, -16711919, -1556937467, -1892481787, 1882391813, -1892481787), new au0(-3863, 350511143, -1810393, -1), new bu0(new cu0(-1, -1810393, -1810393, -1), -1810393, -1810393, -16711919, -13433595, -2060253947, -2060253947, -1204615931, -1810393, 16777215, -2060253947, -1204615931, -1810393));
    public static final th3 Z = new th3(new hg3(new gg3(-53188, -15921907, -2466521, -2693121), new ig3(-15987442, -4933959, -2466521)), new kg3(new jg3(-855661710, -855661710, 16753522, 1726857816, 1726857816, 15581784, -80508, -22690, 1945270786, -85671, -30659, -31160, -31160, 16746056, -1004471, -1004471, 15772745), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -1810393, 1038376999, 702832679, -1810393, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -2398672, -16729857, 47359, -2056382, 14720834, 872415231, 452984831, -1, -2130706433), -1810393, 1543503872, -2050663912, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1306812455, -1810393, -1184014, -151184, new int[]{-2050663912, -2050663912}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new vh3(-1810393, -1810393, -53188, -2062807794, -1810393, -855638017), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-3713756), 520093696), new ii3(-1713086425, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1713742553)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552977290, -1713742553))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -1810393));
    public static final wcg s0 = new wcg(new tcg(new ucg(-15921907, 336136457, -1810393, -1), new vcg(2047675661, 168364297, -1713086425)), new xcg(new ycg(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -1810393), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1713086425)), new adg(new bdg(new cdg(688655630, 252448014))), new ddg(new edg(-1, -15921907, -2062742259, -1810393), new fdg(-1543503873, -1191182337, -1552977290, -1552977290, -1713086425)));
    public static final r6i t0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987442, -7762804, -7762804, -1810393, 1879837966), new t6i(252448014, 252448014, -1810393), new u6i(-15987442, -1810393, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -1810393));
    public static final rha u0 = new rha(4);
    public static final rha v0 = new rha(5);
    public static final rha w0 = new rha(6);
    public static final rha x0 = new rha(7);
    public static final rha y0 = new rha(8);
    public static final rha z0 = new rha(9);
    public static final rha A0 = new rha(10);
    public static final rha B0 = new rha(11);
    public static final rha C0 = new rha(12);

    public /* synthetic */ rha(int i) {
        this.a = i;
    }

    public static byte[] o(wg7 wg7Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(wg7Var.size());
        Iterator<E> it = wg7Var.iterator();
        while (it.hasNext()) {
            hb4 hb4Var = (hb4) it.next();
            Bundle bundleC = hb4Var.c();
            Bitmap bitmap = hb4Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                hsi.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(hb4.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static y21 p(nc5 nc5Var, sb8 sb8Var) {
        IOException iOException = sb8Var.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (nc5Var.a(1)) {
            return new y21(1, 2, 300000L);
        }
        if (nc5Var.a(2)) {
            return new y21(2, 2, 60000L);
        }
        return null;
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

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        if (tm9Var.l()) {
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
            qxg qxgVarB = null;
            String strP2 = null;
            for (int i = 0; i < iM; i++) {
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
                    strP = null;
                }
                if (strP != null) {
                    try {
                        if (strP.equals("hash")) {
                            try {
                                strP2 = efi.p(tm9Var, null);
                            } catch (Throwable th3) {
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
                                strP2 = null;
                            }
                        } else if (strP.equals("user")) {
                            qxgVarB = i5j.b(tm9Var);
                        } else {
                            try {
                                tm9Var.v();
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
                    } catch (Throwable th5) {
                        try {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it5 = vfe.a.iterator();
                            while (it5.hasNext()) {
                                ((qwa) it5.next()).getClass();
                                qwa.a(th5);
                            }
                            int iV5 = az1.v(ctd.a);
                            if (iV5 != 0) {
                                if (iV5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                            Iterator it6 = vfe.a.iterator();
                            while (it6.hasNext()) {
                                ((qwa) it6.next()).getClass();
                                qwa.a(th6);
                            }
                            int iV6 = az1.v(ctd.a);
                            if (iV6 != 0) {
                                if (iV6 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th6;
                            }
                        }
                    }
                }
            }
            if (strP2 != null) {
                return new do3(strP2, qxgVarB);
            }
        }
        return null;
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Z;
    }

    @Override // defpackage.mn0
    public long a(long j) {
        return j;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).y();
    }

    @Override // defpackage.fod
    public void b(Object obj) {
        try {
            xc3.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.dc8
    public void c() {
    }

    @Override // defpackage.tn8
    public Map d(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    @Override // defpackage.q7c
    public CharSequence e(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.a.getString(u4d.not_set);
        }
        return null;
    }

    @Override // defpackage.ul
    public tl f(tl tlVar, Object obj) {
        switch (this.a) {
            case 2:
                for (sa9 sa9Var : ((dm0) obj).a) {
                    Object obj2 = sa9Var.a;
                    if (!(obj2 instanceof mm)) {
                        tlVar = ((yl) sa9Var.c).getConfigExtractor().f(tlVar, obj2);
                    }
                }
                break;
        }
        return tlVar;
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
        return taj.b((Executor) v6dVar.f(new fsc(ze0.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return t0;
    }

    @Override // defpackage.pc6
    public Widget l(String str, b bVar) {
        ChatsListWidget chatsListWidget = new ChatsListWidget(str);
        chatsListWidget.x0 = bVar;
        if (chatsListWidget.isAttached()) {
            chatsListWidget.A0().setItemViewCacheSize(Integer.MIN_VALUE);
            chatsListWidget.A0().setRecycledViewPool(bVar);
        }
        return chatsListWidget;
    }

    @Override // defpackage.dc8
    public void load() {
        synchronized (tmi.a) {
            Object obj = tmi.b;
            synchronized (obj) {
                if (tmi.c) {
                    return;
                }
                long jA = tmi.a();
                synchronized (obj) {
                    tmi.d = jA;
                    tmi.c = true;
                }
            }
        }
    }

    @Override // ru.ok.tracer.nativebridge.NativeBridge
    public void log(String str) {
        if (str != null) {
            jeg.a(str);
        }
    }

    public void m(le5 le5Var) {
        le5Var.b(qti.class, vki.a);
        le5Var.b(lyi.class, fpi.a);
        le5Var.b(sti.class, xki.a);
        le5Var.b(fui.class, zki.a);
        le5Var.b(bui.class, yki.a);
        le5Var.b(dui.class, ali.a);
        le5Var.b(ori.class, pji.a);
        le5Var.b(mri.class, oji.a);
        le5Var.b(wsi.class, oki.a);
        le5Var.b(uxi.class, poi.a);
        le5Var.b(kri.class, mji.a);
        le5Var.b(iri.class, kji.a);
        le5Var.b(xui.class, bmi.a);
        le5Var.b(yzi.class, iki.a);
        le5Var.b(to8.class, lki.a);
        le5Var.b(lsi.class, hki.a);
        le5Var.b(zui.class, dmi.a);
        le5Var.b(oxi.class, joi.a);
        le5Var.b(qxi.class, loi.a);
        le5Var.b(mxi.class, hoi.a);
        le5Var.b(nui.class, kli.a);
        le5Var.b(wzi.class, gii.a);
        le5Var.b(pui.class, nli.a);
        le5Var.b(ovi.class, omi.a);
        le5Var.b(uvi.class, umi.a);
        le5Var.b(svi.class, smi.a);
        le5Var.b(qvi.class, qmi.a);
        le5Var.b(swi.class, ini.a);
        le5Var.b(uwi.class, kni.a);
        le5Var.b(ywi.class, tni.a);
        le5Var.b(wwi.class, rni.a);
        le5Var.b(lui.class, ili.a);
        le5Var.b(axi.class, vni.a);
        le5Var.b(cxi.class, xni.a);
        le5Var.b(exi.class, zni.a);
        le5Var.b(gxi.class, boi.a);
        le5Var.b(kxi.class, doi.a);
        le5Var.b(ixi.class, foi.a);
        le5Var.b(qwi.class, bni.a);
        le5Var.b(iti.class, tki.a);
        le5Var.b(mwi.class, eni.a);
        le5Var.b(kwi.class, cni.a);
        le5Var.b(owi.class, gni.a);
        le5Var.b(sxi.class, noi.a);
        le5Var.b(wyi.class, upi.a);
        le5Var.b(nqi.class, uii.a);
        le5Var.b(jqi.class, sii.a);
        le5Var.b(hqi.class, rii.a);
        le5Var.b(lqi.class, tii.a);
        le5Var.b(rqi.class, xii.a);
        le5Var.b(pqi.class, vii.a);
        le5Var.b(tqi.class, yii.a);
        le5Var.b(pai.class, zii.a);
        le5Var.b(wqi.class, aji.a);
        le5Var.b(yqi.class, bji.a);
        le5Var.b(ari.class, dji.a);
        le5Var.b(yfi.class, bii.a);
        le5Var.b(agi.class, eii.a);
        le5Var.b(zfi.class, cii.a);
        le5Var.b(eti.class, rki.a);
        le5Var.b(qri.class, qji.a);
        le5Var.b(eei.class, dgi.a);
        le5Var.b(cei.class, egi.a);
        le5Var.b(hsi.class, wji.a);
        le5Var.b(iei.class, ggi.a);
        le5Var.b(gei.class, igi.a);
        le5Var.b(uei.class, chi.a);
        le5Var.b(tei.class, ehi.a);
        le5Var.b(mei.class, jgi.a);
        le5Var.b(jei.class, kgi.a);
        le5Var.b(kfi.class, khi.a);
        le5Var.b(jfi.class, lhi.a);
        le5Var.b(pfi.class, ohi.a);
        le5Var.b(ofi.class, phi.a);
        le5Var.b(wfi.class, yhi.a);
        le5Var.b(vfi.class, aii.a);
        le5Var.b(sfi.class, rhi.a);
        le5Var.b(qfi.class, thi.a);
        le5Var.b(ave.class, uhi.a);
        le5Var.b(tfi.class, whi.a);
        le5Var.b(mzi.class, voi.a);
        le5Var.b(yyi.class, rji.a);
        le5Var.b(gzi.class, gli.a);
        le5Var.b(ezi.class, eli.a);
        le5Var.b(azi.class, jki.a);
        le5Var.b(kzi.class, toi.a);
        le5Var.b(izi.class, roi.a);
        le5Var.b(ozi.class, xoi.a);
        le5Var.b(czi.class, pki.a);
        le5Var.b(uzi.class, ypi.a);
        le5Var.b(szi.class, aqi.a);
        le5Var.b(qzi.class, wpi.a);
        le5Var.b(wxi.class, zoi.a);
        le5Var.b(cti.class, qki.a);
        le5Var.b(kti.class, uki.a);
        le5Var.b(fqi.class, hii.a);
        le5Var.b(ssi.class, mki.a);
        le5Var.b(gti.class, ski.a);
        le5Var.b(jsi.class, xji.a);
        le5Var.b(bsi.class, tji.a);
        le5Var.b(dsi.class, uji.a);
        le5Var.b(zri.class, sji.a);
        le5Var.b(fsi.class, vji.a);
        le5Var.b(jui.class, cli.a);
        le5Var.b(hui.class, bli.a);
        le5Var.b(zdi.class, bgi.a);
        le5Var.b(qx7.class, lpi.a);
        le5Var.b(uyi.class, opi.a);
        le5Var.b(syi.class, mpi.a);
        le5Var.b(dqi.class, fii.a);
        le5Var.b(gri.class, iji.a);
        le5Var.b(eri.class, gji.a);
        le5Var.b(cri.class, eji.a);
        le5Var.b(rui.class, xli.a);
        le5Var.b(vui.class, zli.a);
        le5Var.b(tui.class, yli.a);
        le5Var.b(rei.class, ygi.a);
        le5Var.b(pei.class, ahi.a);
        le5Var.b(bvi.class, fmi.a);
        le5Var.b(gvi.class, jmi.a);
        le5Var.b(dvi.class, gmi.a);
        le5Var.b(t49.class, imi.a);
        le5Var.b(gfi.class, fhi.a);
        le5Var.b(efi.class, ghi.a);
        le5Var.b(ayi.class, dpi.a);
        le5Var.b(yxi.class, bpi.a);
        le5Var.b(nyi.class, hpi.a);
        le5Var.b(pyi.class, jpi.a);
        le5Var.b(wvi.class, wmi.a);
        le5Var.b(iwi.class, zmi.a);
        le5Var.b(yvi.class, xmi.a);
        le5Var.b(gwi.class, ymi.a);
        le5Var.b(nfi.class, mhi.a);
        le5Var.b(lfi.class, nhi.a);
        le5Var.b(usi.class, nki.a);
        le5Var.b(nsi.class, kki.a);
        le5Var.b(ivi.class, kmi.a);
        le5Var.b(mvi.class, mmi.a);
        le5Var.b(kvi.class, lmi.a);
        le5Var.b(ifi.class, hhi.a);
        le5Var.b(hfi.class, jhi.a);
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        switch (this.a) {
            case 9:
                yebVar.getIcon();
                return ipi.a(-1, yebVar.getIcon().k);
            default:
                return ipi.a(0, yebVar.a().i().d.d);
        }
    }

    public int q(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return Y;
    }

    @Override // ru.ok.tracer.nativebridge.NativeBridge
    public void setKey(String str, String str2) {
        if (str != null) {
            feg fegVar = feg.a;
            Map mapSingletonMap = Collections.singletonMap(str, str2);
            if (feg.b) {
                return;
            }
            try {
                uyf uyfVar = feg.f;
                if (uyfVar == null) {
                    uyfVar = null;
                }
                uyfVar.c(mapSingletonMap);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return d1g.a(((Number) obj).intValue());
    }

    @Override // defpackage.sy2
    public wcg u() {
        return s0;
    }
}
