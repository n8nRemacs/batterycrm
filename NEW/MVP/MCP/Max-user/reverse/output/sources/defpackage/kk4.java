package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kk4 implements zc3, sy2, wzg, v3g, gu3, nyg, jp5, m7c, ff4, rca {
    public static kk4 b;
    public final /* synthetic */ int a;
    public static final mi c = new mi();
    public static final kk4 d = new kk4(2);
    public static final kk4 o = new kk4(3);
    public static final yt0 X = new yt0(new rt0(new qt0(-1545705638, -1545705638, 1725851482), new st0(new tt0(534669146, 14575450), new ut0(1037985626, 14575450), new vt0(1037985626, 14575450)), new wt0(-2201766, 350119770, -1, -2049022118), new xt0(1306421082, 182347610, 14575450, new int[]{1306421082, -2132908198}), -2201766, 1037985626, 350119770, -1, 350119770, -4112, 350119770, -1, 350119770, 2061395802, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -2201766, -1685946, -53188, -2201766, -1294047398, -2062807794, -1, -6718085, -6718085, -2201766, -1559491314, -1895035634, 1879837966, -1895035634), new au0(-1, 350119770, -2201766, -1), new bu0(new cu0(-1, -2201766, -2201766, -1), -2201766, -2201766, -2201766, -15987442, -2062807794, -2062807794, -1207169778, -2201766, 16777215, -2062807794, -1207169778, -2062807794));
    public static final yt0 Y = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(534669146, 14575450), new ut0(1037985626, 14575450), new vt0(1037985626, 14575450)), new wt0(-2201766, 534669146, -1, -2049022118), new xt0(1306421082, 182347610, 14575450, new int[]{1306421082, -2132908198}), -2201766, 1558079322, 350119770, -269865, 350119770, 350119770, 534669146, -656897, 350119770, 2061395802, new int[]{-269865, -269865, -269865}, new int[]{-269865, -269865}), new zt0(-269865, -2201766, -1685946, -16711919, -2201766, -2201766, -1539468, -1, -2060253179, -2060253179, -16711919, -1556936699, -1892481019, 1882392581, -1892481019), new au0(-5399, 350119770, -2201766, -1), new bu0(new cu0(-1, -2201766, -2201766, -1), -2201766, -2201766, -16711919, -13432827, -2060253179, -2060253179, -1204615163, -2201766, 16777215, -2060253179, -1204615163, -1536896));
    public static final th3 Z = new th3(new hg3(new gg3(-53188, -15921907, -2201766, -9770), new ig3(-15987442, -4606796, -2201766)), new kg3(new jg3(0, 0, 0, 0, 0, 0, -1860715, -467260, 1087914242, 1087914242, 1087914242, 0, 0, 0, 0, 0, 0), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -2201766, 1037985626, 702441306, -2201766, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -4240576, -16729857, 47359, -1011632, 15765584, 872415231, 452984831, -1, -2130706433), -2201766, 1543503872, -1295746452, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, -2459798, -2201766, -1184014, -1860715, new int[]{-2049022118, -2049022118}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-1860715, -467260}), new vh3(-2201766, -2201766, -53188, -2062807794, -2201766, -855638017), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-2208708), 520093696), new ii3(-1713477798, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1713477798)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552519313, -1713477798))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -2201766));
    public static final wcg s0 = new wcg(new tcg(new ucg(-15921907, 336136457, -2201766, -1), new vcg(2047675661, 168364297, -1713477798)), new xcg(new ycg(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -2201766), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1713477798)), new adg(new bdg(new cdg(688655630, 252448014))), new ddg(new edg(-1, -15921907, -2062742259, -2201766), new fdg(-1543503873, -1191182337, -1552519313, -1552519313, -1713477798)));
    public static final r6i t0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987442, -7566967, -7566967, -2201766, 1879837966), new t6i(252448014, 252448014, -2201766), new u6i(-15987442, -2201766, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -2201766));
    public static final int[] u0 = {R.attr.state_checked};
    public static final int[] v0 = {-16842912};
    public static final kk4 w0 = new kk4(5);
    public static final /* synthetic */ kk4 x0 = new kk4(6);
    public static final kk4 y0 = new kk4(7);
    public static final kk4 z0 = new kk4(8);
    public static final kk4 A0 = new kk4(9);
    public static final kk4 B0 = new kk4(10);
    public static final kk4 C0 = new kk4(11);
    public static final kk4 D0 = new kk4(12);

    public /* synthetic */ kk4(int i) {
        this.a = i;
    }

    public static void e(xcf xcfVar, yeb yebVar) {
        Drawable drawableD = pbj.d(xcfVar, u0);
        EnhancedVectorDrawable enhancedVectorDrawable = drawableD instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawableD : null;
        if (enhancedVectorDrawable == null) {
            return;
        }
        Drawable drawableD2 = pbj.d(xcfVar, v0);
        GradientDrawable gradientDrawable = drawableD2 instanceof GradientDrawable ? (GradientDrawable) drawableD2 : null;
        if (gradientDrawable == null) {
            return;
        }
        z18.e(enhancedVectorDrawable, "circle_background", yebVar.b().a.n);
        gradientDrawable.setStroke(kti.d(2 * vw4.d().getDisplayMetrics().density), yebVar.i().b.b);
    }

    public static kk4 f(Context context, int i) {
        z5j.a("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, z5d.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(z5d.MaterialCalendarItem_android_insetBottom, 0));
        gti.c(context, typedArrayObtainStyledAttributes, z5d.MaterialCalendarItem_itemFillColor);
        gti.c(context, typedArrayObtainStyledAttributes, z5d.MaterialCalendarItem_itemTextColor);
        gti.c(context, typedArrayObtainStyledAttributes, z5d.MaterialCalendarItem_itemStrokeColor);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.MaterialCalendarItem_itemStrokeWidth, 0);
        xse.a(context, typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(z5d.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new g0(0)).g();
        typedArrayObtainStyledAttributes.recycle();
        kk4 kk4Var = new kk4(15);
        z5j.d(rect.left);
        z5j.d(rect.top);
        z5j.d(rect.right);
        z5j.d(rect.bottom);
        return kk4Var;
    }

    public static xcf j(Context context) {
        int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, uwc.ic_check_filled_24);
        v1a v1aVar = a93.s0;
        z18.e(enhancedVectorDrawable, "circle_background", v1aVar.x(context).k().b().a.n);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(iD, iD);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(kti.d(2 * vw4.d().getDisplayMetrics().density), v1aVar.x(context).k().i().b.b);
        xcf xcfVar = new xcf(null, null);
        xcfVar.a(u0, enhancedVectorDrawable);
        xcfVar.a(v0, gradientDrawable);
        return xcfVar;
    }

    public static qh9 o(yeb yebVar) {
        return new qh9(yebVar.a().i().a.o, yebVar.a().r().a.o);
    }

    public static synchronized kk4 t() {
        try {
            if (b == null) {
                b = new kk4(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static fje y(JSONObject jSONObject) {
        return jSONObject.has("roomId") ? new eje(jSONObject.getInt("roomId")) : dje.a;
    }

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        int iM2;
        String strP2;
        int iM3;
        String strP3;
        switch (this.a) {
            case 2:
                if (!tm9Var.l()) {
                    return null;
                }
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
                String strP4 = null;
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
                            if (strP.equals("trackId")) {
                                try {
                                    strP4 = efi.p(tm9Var, null);
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
                                    strP4 = null;
                                }
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
                if (strP4 == null) {
                    return null;
                }
                return new o70(strP4);
            case 7:
                try {
                    iM2 = efi.m(tm9Var);
                } catch (Throwable th7) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                    Iterator it7 = vfe.a.iterator();
                    while (it7.hasNext()) {
                        ((qwa) it7.next()).getClass();
                        qwa.a(th7);
                    }
                    int iV7 = az1.v(ctd.a);
                    if (iV7 != 0) {
                        if (iV7 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th7;
                    }
                    iM2 = 0;
                }
                Long lValueOf = null;
                for (int i2 = 0; i2 < iM2; i2++) {
                    try {
                        strP2 = efi.p(tm9Var, null);
                    } catch (Throwable th8) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                        Iterator it8 = vfe.a.iterator();
                        while (it8.hasNext()) {
                            ((qwa) it8.next()).getClass();
                            qwa.a(th8);
                        }
                        int iV8 = az1.v(ctd.a);
                        if (iV8 != 0) {
                            if (iV8 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th8;
                        }
                        strP2 = null;
                    }
                    if (strP2 != null) {
                        try {
                            if (strP2.equals("folderSync")) {
                                lValueOf = Long.valueOf(tm9Var.t0());
                            } else {
                                try {
                                    tm9Var.v();
                                } catch (Throwable th9) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                    Iterator it9 = vfe.a.iterator();
                                    while (it9.hasNext()) {
                                        ((qwa) it9.next()).getClass();
                                        qwa.a(th9);
                                    }
                                    int iV9 = az1.v(ctd.a);
                                    if (iV9 != 0) {
                                        if (iV9 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th9;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            try {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                Iterator it10 = vfe.a.iterator();
                                while (it10.hasNext()) {
                                    ((qwa) it10.next()).getClass();
                                    qwa.a(th10);
                                }
                                int iV10 = az1.v(ctd.a);
                                if (iV10 != 0) {
                                    if (iV10 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th10;
                                }
                            } catch (Throwable th11) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                Iterator it11 = vfe.a.iterator();
                                while (it11.hasNext()) {
                                    ((qwa) it11.next()).getClass();
                                    qwa.a(th11);
                                }
                                int iV11 = az1.v(ctd.a);
                                if (iV11 != 0) {
                                    if (iV11 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th11;
                                }
                            }
                        }
                    }
                }
                if (lValueOf != null) {
                    return new kd6(lValueOf.longValue());
                }
                return null;
            default:
                try {
                    iM3 = efi.m(tm9Var);
                } catch (Throwable th12) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it12 = vfe.a.iterator();
                    while (it12.hasNext()) {
                        ((qwa) it12.next()).getClass();
                        qwa.a(th12);
                    }
                    int iV12 = az1.v(ctd.a);
                    if (iV12 != 0) {
                        if (iV12 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                    iM3 = 0;
                }
                if (iM3 == 0) {
                    return null;
                }
                for (int i3 = 0; i3 < iM3; i3++) {
                    try {
                        strP3 = efi.p(tm9Var, null);
                    } catch (Throwable th13) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                        Iterator it13 = vfe.a.iterator();
                        while (it13.hasNext()) {
                            ((qwa) it13.next()).getClass();
                            qwa.a(th13);
                        }
                        int iV13 = az1.v(ctd.a);
                        if (iV13 != 0) {
                            if (iV13 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th13;
                        }
                        strP3 = null;
                    }
                    if (strP3 != null) {
                        if (strP3.equals("profile")) {
                            wac wacVarC = f6j.c(tm9Var);
                            if (wacVarC != null) {
                                return new lka(wacVarC);
                            }
                            return null;
                        }
                        try {
                            tm9Var.v();
                        } catch (Throwable th14) {
                            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                            Iterator it14 = vfe.a.iterator();
                            while (it14.hasNext()) {
                                ((qwa) it14.next()).getClass();
                                qwa.a(th14);
                            }
                            int iV14 = az1.v(ctd.a);
                            if (iV14 != 0) {
                                if (iV14 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th14;
                            }
                        }
                    }
                }
                return null;
        }
    }

    @Override // defpackage.jp5
    public rfg B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Z;
    }

    @Override // defpackage.jp5
    public void N(h9e h9eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rca
    public void a(String str) {
        switch (this.a) {
            case 25:
                Log.d("NativeMedia", str);
                break;
            default:
                wqi.c("RLottie", str, new Object[0]);
                break;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        wqi.e("g5i", "failure!", (Throwable) obj);
    }

    public Object b(Object obj) throws ImageCaptureException {
        ck5 ck5Var;
        cb0 cb0Var = (cb0) obj;
        jf7 jf7Var = cb0Var.b;
        iac iacVar = cb0Var.a;
        if (pfi.d(jf7Var.getFormat())) {
            try {
                rw0 rw0Var = ck5.b;
                ByteBuffer byteBufferI = jf7Var.s()[0].I();
                byteBufferI.rewind();
                byte[] bArr = new byte[byteBufferI.capacity()];
                byteBufferI.get(bArr);
                ck5Var = new ck5(new pk5(new ByteArrayInputStream(bArr)));
                jf7Var.s()[0].I().rewind();
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract EXIF data.", e);
            }
        } else {
            ck5Var = null;
        }
        if (((ImageCaptureRotationOptionQuirk) ov4.a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
            s90 s90Var = h52.i;
        } else if (pfi.d(jf7Var.getFormat())) {
            z5j.e(ck5Var, "JPEG image must have exif.");
            Size size = new Size(jf7Var.getWidth(), jf7Var.getHeight());
            int iA = iacVar.c - ck5Var.a();
            Size size2 = bhg.b(bhg.h(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = bhg.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
            RectF rectF = new RectF(iacVar.b);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iA2 = ck5Var.a();
            Matrix matrix = new Matrix(iacVar.e);
            matrix.postConcat(matrixA);
            r02 mniVar = jf7Var.getImageInfo() instanceof s02 ? ((s02) jf7Var.getImageInfo()).a : new mni();
            jf7Var.getFormat();
            return new xa0(jf7Var, ck5Var, jf7Var.getFormat(), size3, rect, iA2, matrix, mniVar);
        }
        ck5 ck5Var2 = ck5Var;
        Rect rect2 = iacVar.b;
        int i = iacVar.c;
        Matrix matrix2 = iacVar.e;
        r02 mniVar2 = jf7Var.getImageInfo() instanceof s02 ? ((s02) jf7Var.getImageInfo()).a : new mni();
        Size size4 = new Size(jf7Var.getWidth(), jf7Var.getHeight());
        if (pfi.d(jf7Var.getFormat())) {
            z5j.e(ck5Var2, "JPEG image must have Exif.");
        }
        return new xa0(jf7Var, ck5Var2, jf7Var.getFormat(), size4, rect2, i, matrix2, mniVar2);
    }

    @Override // defpackage.rca
    public void c(String str, Throwable th) {
        switch (this.a) {
            case 25:
                Log.e("NativeMedia", str, th);
                break;
            default:
                wqi.e("RLottie", str, th);
                break;
        }
    }

    @Override // defpackage.ff4
    public DatagramSocket createSocket() {
        return new DatagramSocket(new InetSocketAddress((InetAddress) null, 0));
    }

    @Override // defpackage.rca
    public void d(Throwable th) {
        switch (this.a) {
            case 25:
                Log.e("NativeMedia", th != null ? th.getMessage() : null, th);
                break;
            default:
                wqi.e("RLottie", "fail!", th);
                break;
        }
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

    @Override // defpackage.sy2
    public r6i k() {
        return t0;
    }

    @Override // defpackage.nyg
    public int l(Object obj) {
        return ((sc3) obj).getSizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // defpackage.v3g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m(int r6, java.lang.CharSequence r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L4:
            if (r2 >= r6) goto L24
            if (r3 != r1) goto L24
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            w3g r4 = defpackage.y3g.a
            r4 = 1
            if (r3 == 0) goto L20
            if (r3 == r4) goto L1e
            if (r3 == r1) goto L1e
            switch(r3) {
                case 14: goto L20;
                case 15: goto L20;
                case 16: goto L1e;
                case 17: goto L1e;
                default: goto L1c;
            }
        L1c:
            r3 = r1
            goto L21
        L1e:
            r3 = r0
            goto L21
        L20:
            r3 = r4
        L21:
            int r2 = r2 + 1
            goto L4
        L24:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk4.m(int, java.lang.CharSequence):int");
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        return ipi.a(0, yebVar.getIcon().a.e);
    }

    public jp0 p(rf7 rf7Var, Object obj) {
        jp0 jp0Var = new jp0(q(rf7Var.b).toString(), rf7Var.h, rf7Var.i, rf7Var.g, null, null);
        jp0Var.g = obj;
        return jp0Var;
    }

    public Uri q(Uri uri) {
        return uri;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return Y;
    }

    public c1f s(Uri uri) {
        return new c1f(q(uri).toString());
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return true;
    }

    @Override // defpackage.sy2
    public wcg u() {
        return s0;
    }

    public jp0 v(rf7 rf7Var, Object obj) {
        ty0 ty0Var;
        String name;
        y6c y6cVar = rf7Var.o;
        if (y6cVar != null) {
            ty0 ty0VarB = y6cVar.b();
            name = y6cVar.getClass().getName();
            ty0Var = ty0VarB;
        } else {
            ty0Var = null;
            name = null;
        }
        jp0 jp0Var = new jp0(q(rf7Var.b).toString(), rf7Var.h, rf7Var.i, rf7Var.g, ty0Var, name);
        jp0Var.g = obj;
        return jp0Var;
    }

    @Override // defpackage.jp5
    public void w() {
        throw new UnsupportedOperationException();
    }

    public Signature[] x(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
