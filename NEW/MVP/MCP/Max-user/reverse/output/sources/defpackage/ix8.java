package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class ix8 extends sw8 {
    public static final int[] x2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean y2;
    public static boolean z2;
    public final Context O1;
    public final m4h P1;
    public final enb Q1;
    public final long R1;
    public final int S1;
    public final boolean T1;
    public u70 U1;
    public boolean V1;
    public boolean W1;
    public Surface X1;
    public p65 Y1;
    public boolean Z1;
    public int a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public long e2;
    public long f2;
    public long g2;
    public int h2;
    public int i2;
    public int j2;
    public long k2;
    public long l2;
    public long m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public float r2;
    public rch s2;
    public boolean t2;
    public int u2;
    public hx8 v2;
    public w3h w2;

    public ix8(Context context, hw8 hw8Var, Handler handler, xl5 xl5Var) {
        super(2, hw8Var, 30.0f);
        this.R1 = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.S1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.O1 = applicationContext;
        this.P1 = new m4h(applicationContext, 0);
        this.Q1 = new enb(handler, 16, xl5Var);
        this.T1 = "NVIDIA".equals(xxg.c);
        this.f2 = -9223372036854775807L;
        this.o2 = -1;
        this.p2 = -1;
        this.r2 = -1.0f;
        this.a2 = 1;
        this.u2 = 0;
        this.s2 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0846  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p0(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix8.p0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q0(defpackage.ow8 r10, defpackage.gf6 r11) {
        /*
            int r0 = r11.A0
            int r1 = r11.B0
            r2 = -1
            if (r0 == r2) goto Lc1
            if (r1 != r2) goto Lb
            goto Lc1
        Lb:
            java.lang.String r3 = r11.v0
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = defpackage.cx8.d(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.getClass()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = r2
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = r4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = r9
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = r8
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto L81;
                case 1: goto Lbc;
                case 2: goto L81;
                case 3: goto L84;
                case 4: goto L81;
                case 5: goto Lbc;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            int r0 = r0 * r1
        L82:
            r4 = r8
            goto Lbd
        L84:
            java.lang.String r11 = defpackage.xxg.d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "Amazon"
            java.lang.String r4 = defpackage.xxg.c
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lad
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lad
            boolean r10 = r10.f
            if (r10 == 0) goto Lad
            goto Lbb
        Lad:
            r10 = 16
            int r11 = defpackage.xxg.f(r0, r10)
            int r10 = defpackage.xxg.f(r1, r10)
            int r10 = r10 * r11
            int r0 = r10 * 256
            goto L82
        Lbb:
            return r2
        Lbc:
            int r0 = r0 * r1
        Lbd:
            int r0 = r0 * r9
            int r4 = r4 * r8
            int r0 = r0 / r4
            return r0
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix8.q0(ow8, gf6):int");
    }

    public static wg7 r0(uy0 uy0Var, gf6 gf6Var, boolean z, boolean z3) {
        String str = gf6Var.v0;
        if (str == null) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        uy0Var.getClass();
        List listE = cx8.e(str, z, z3);
        String strB = cx8.b(gf6Var);
        if (strB == null) {
            return wg7.j(listE);
        }
        List listE2 = cx8.e(strB, z, z3);
        tg7 tg7VarI = wg7.i();
        tg7VarI.d(listE);
        tg7VarI.d(listE2);
        return tg7VarI.i();
    }

    public static int s0(ow8 ow8Var, gf6 gf6Var) {
        int i = gf6Var.w0;
        List list = gf6Var.x0;
        if (i == -1) {
            return q0(ow8Var, gf6Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return gf6Var.w0 + length;
    }

    @Override // defpackage.sw8
    public final rh4 A(ow8 ow8Var, gf6 gf6Var, gf6 gf6Var2) {
        rh4 rh4VarB = ow8Var.b(gf6Var, gf6Var2);
        int i = rh4VarB.e;
        int i2 = gf6Var2.A0;
        u70 u70Var = this.U1;
        if (i2 > u70Var.b || gf6Var2.B0 > u70Var.c) {
            i |= 256;
        }
        if (s0(ow8Var, gf6Var2) > this.U1.d) {
            i |= 64;
        }
        int i3 = i;
        return new rh4(ow8Var.a, gf6Var, gf6Var2, i3 != 0 ? 0 : rh4VarB.d, i3);
    }

    public final void A0(int i, int i2) {
        nh4 nh4Var = this.J1;
        nh4Var.i += i;
        int i3 = i + i2;
        nh4Var.h += i3;
        this.h2 += i3;
        int i4 = this.i2 + i3;
        this.i2 = i4;
        nh4Var.j = Math.max(i4, nh4Var.j);
        int i5 = this.S1;
        if (i5 <= 0 || this.h2 < i5) {
            return;
        }
        t0();
    }

    @Override // defpackage.sw8
    public final MediaCodecDecoderException B(IllegalStateException illegalStateException, ow8 ow8Var) {
        Surface surface = this.X1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, ow8Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final void B0(long j) {
        nh4 nh4Var = this.J1;
        nh4Var.l += j;
        nh4Var.m++;
        this.m2 += j;
        this.n2++;
    }

    @Override // defpackage.sw8
    public final boolean J() {
        return this.t2 && xxg.a < 23;
    }

    @Override // defpackage.sw8
    public final float K(float f, gf6[] gf6VarArr) {
        float fMax = -1.0f;
        for (gf6 gf6Var : gf6VarArr) {
            float f2 = gf6Var.C0;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // defpackage.sw8
    public final ArrayList L(uy0 uy0Var, gf6 gf6Var, boolean z) {
        wg7 wg7VarR0 = r0(uy0Var, gf6Var, z, this.t2);
        Pattern pattern = cx8.a;
        ArrayList arrayList = new ArrayList(wg7VarR0);
        Collections.sort(arrayList, new dj3(7, new sl6(17, gf6Var)));
        return arrayList;
    }

    @Override // defpackage.sw8
    public final gw8 N(ow8 ow8Var, gf6 gf6Var, MediaCrypto mediaCrypto, float f) {
        int i;
        ff3 ff3Var;
        u70 u70Var;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2;
        char c;
        boolean z;
        Pair pairD;
        int iQ0;
        p65 p65Var = this.Y1;
        if (p65Var != null && p65Var.a != ow8Var.f) {
            if (this.X1 == p65Var) {
                this.X1 = null;
            }
            p65Var.release();
            this.Y1 = null;
        }
        String str = ow8Var.c;
        gf6[] gf6VarArr = this.Z;
        gf6VarArr.getClass();
        int i3 = gf6Var.A0;
        float f2 = gf6Var.C0;
        int i4 = gf6Var.B0;
        ff3 ff3Var2 = gf6Var.H0;
        int iS0 = s0(ow8Var, gf6Var);
        if (gf6VarArr.length == 1) {
            if (iS0 != -1 && (iQ0 = q0(ow8Var, gf6Var)) != -1) {
                iS0 = Math.min((int) (iS0 * 1.5f), iQ0);
            }
            u70Var = new u70(i3, i4, iS0, 5);
            i = i4;
            ff3Var = ff3Var2;
        } else {
            int length = gf6VarArr.length;
            int iMax = i3;
            int iMax2 = i4;
            int i5 = 0;
            boolean z3 = false;
            while (i5 < length) {
                gf6 gf6Var2 = gf6VarArr[i5];
                int i6 = i5;
                if (ff3Var2 != null && gf6Var2.H0 == null) {
                    ef6 ef6VarA = gf6Var2.a();
                    ef6VarA.w = ff3Var2;
                    gf6Var2 = new gf6(ef6VarA);
                }
                rh4 rh4VarB = ow8Var.b(gf6Var, gf6Var2);
                gf6[] gf6VarArr2 = gf6VarArr;
                int i7 = gf6Var2.B0;
                if (rh4VarB.d != 0) {
                    int i8 = gf6Var2.A0;
                    i2 = length;
                    c = 65535;
                    z3 |= i8 == -1 || i7 == -1;
                    iMax = Math.max(iMax, i8);
                    iMax2 = Math.max(iMax2, i7);
                    iS0 = Math.max(iS0, s0(ow8Var, gf6Var2));
                } else {
                    i2 = length;
                    c = 65535;
                }
                i5 = i6 + 1;
                gf6VarArr = gf6VarArr2;
                length = i2;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i4 > i3;
                int i9 = z4 ? i4 : i3;
                boolean z5 = z4;
                int i10 = z4 ? i3 : i4;
                float f3 = i10 / i9;
                ff3Var = ff3Var2;
                int i11 = 0;
                while (i11 < 9) {
                    int i12 = x2[i11];
                    int i13 = i11;
                    int i14 = (int) (i12 * f3);
                    if (i12 <= i9 || i14 <= i10) {
                        break;
                    }
                    int i15 = i10;
                    int i16 = i9;
                    if (xxg.a >= 21) {
                        int i17 = z5 ? i14 : i12;
                        if (!z5) {
                            i12 = i14;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = ow8Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(xxg.f(i17, widthAlignment) * widthAlignment, xxg.f(i12, heightAlignment) * heightAlignment);
                        }
                        i = i4;
                        if (ow8Var.e(point2.x, point2.y, f2)) {
                            point = point2;
                            break;
                        }
                        i11 = i13 + 1;
                        i4 = i;
                        i10 = i15;
                        i9 = i16;
                    } else {
                        i = i4;
                        try {
                            int iF = xxg.f(i12, 16) * 16;
                            int iF2 = xxg.f(i14, 16) * 16;
                            if (iF * iF2 <= cx8.i()) {
                                int i18 = z5 ? iF2 : iF;
                                if (!z5) {
                                    iF = iF2;
                                }
                                point2 = new Point(i18, iF);
                                point = point2;
                                break;
                            }
                            i11 = i13 + 1;
                            i4 = i;
                            i10 = i15;
                            i9 = i16;
                        } catch (MediaCodecUtil$DecoderQueryException unused) {
                        }
                    }
                }
                i = i4;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    ef6 ef6VarA2 = gf6Var.a();
                    ef6VarA2.p = iMax;
                    ef6VarA2.q = iMax2;
                    iS0 = Math.max(iS0, q0(ow8Var, new gf6(ef6VarA2)));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax);
                    sb2.append("x");
                    sb2.append(iMax2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                i = i4;
                ff3Var = ff3Var2;
            }
            u70Var = new u70(iMax, iMax2, iS0, 5);
        }
        this.U1 = u70Var;
        int i19 = this.t2 ? this.u2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i3);
        mediaFormat.setInteger("height", i);
        tui.d(mediaFormat, gf6Var.x0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        tui.c(mediaFormat, "rotation-degrees", gf6Var.D0);
        if (ff3Var != null) {
            ff3 ff3Var3 = ff3Var;
            tui.c(mediaFormat, "color-transfer", ff3Var3.c);
            tui.c(mediaFormat, "color-standard", ff3Var3.a);
            tui.c(mediaFormat, "color-range", ff3Var3.b);
            byte[] bArr = ff3Var3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(gf6Var.v0) && (pairD = cx8.d(gf6Var)) != null) {
            tui.c(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", u70Var.b);
        mediaFormat.setInteger("max-height", u70Var.c);
        tui.c(mediaFormat, "max-input-size", u70Var.d);
        if (xxg.a >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.T1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (this.X1 == null) {
            if (!y0(ow8Var)) {
                throw new IllegalStateException();
            }
            if (this.Y1 == null) {
                this.Y1 = p65.c(this.O1, ow8Var.f);
            }
            this.X1 = this.Y1;
        }
        return new gw8(ow8Var, mediaFormat, gf6Var, this.X1, mediaCrypto);
    }

    @Override // defpackage.sw8
    public final void O(oh4 oh4Var) {
        if (this.W1) {
            ByteBuffer byteBuffer = oh4Var.Y;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    jw8 jw8Var = this.S0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    jw8Var.setParameters(bundle);
                }
            }
        }
    }

    @Override // defpackage.sw8
    public final void S(Exception exc) {
        pai.c("MediaCodecVideoRenderer", "Video codec error", exc);
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new cch(enbVar, exc, 1));
        }
    }

    @Override // defpackage.sw8
    public final void T(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new s50(enbVar, str2, j, j2, 3));
        } else {
            str2 = str;
        }
        this.V1 = p0(str2);
        ow8 ow8Var = this.Z0;
        ow8Var.getClass();
        boolean z = false;
        if (xxg.a >= 29 && "video/x-vnd.on2.vp9".equals(ow8Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = ow8Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.W1 = z;
        if (xxg.a < 23 || !this.t2) {
            return;
        }
        jw8 jw8Var = this.S0;
        jw8Var.getClass();
        this.v2 = new hx8(this, jw8Var);
    }

    @Override // defpackage.sw8
    public final void U(String str) {
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new cch(enbVar, str, 0));
        }
    }

    @Override // defpackage.sw8
    public final rh4 V(i5i i5iVar) {
        rh4 rh4VarV = super.V(i5iVar);
        gf6 gf6Var = (gf6) i5iVar.b;
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new cch(enbVar, gf6Var, rh4VarV));
        }
        return rh4VarV;
    }

    @Override // defpackage.sw8
    public final void W(gf6 gf6Var, MediaFormat mediaFormat) {
        jw8 jw8Var = this.S0;
        if (jw8Var != null) {
            jw8Var.j(this.a2);
        }
        if (this.t2) {
            this.o2 = gf6Var.A0;
            this.p2 = gf6Var.B0;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.o2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.p2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = gf6Var.E0;
        int i = gf6Var.D0;
        this.r2 = f;
        if (xxg.a < 21) {
            this.q2 = i;
        } else if (i == 90 || i == 270) {
            int i2 = this.o2;
            this.o2 = this.p2;
            this.p2 = i2;
            this.r2 = 1.0f / f;
        }
        float f2 = gf6Var.C0;
        m4h m4hVar = this.P1;
        m4hVar.d = f2;
        j16 j16Var = (j16) m4hVar.p;
        ((i16) j16Var.d).c();
        ((i16) j16Var.e).c();
        j16Var.a = false;
        j16Var.b = -9223372036854775807L;
        j16Var.c = 0;
        m4hVar.c();
    }

    @Override // defpackage.sw8
    public final void X(long j) {
        super.X(j);
        if (this.t2) {
            return;
        }
        this.j2--;
    }

    @Override // defpackage.sw8
    public final void Y() {
        o0();
    }

    @Override // defpackage.sw8
    public final void Z(oh4 oh4Var) {
        boolean z = this.t2;
        if (!z) {
            this.j2++;
        }
        if (xxg.a >= 23 || !z) {
            return;
        }
        long j = oh4Var.X;
        n0(j);
        v0();
        this.J1.f++;
        u0();
        X(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.Surface] */
    @Override // defpackage.sk0, defpackage.t4c
    public final void a(int i, Object obj) {
        Handler handler;
        Handler handler2;
        int iIntValue;
        m4h m4hVar = this.P1;
        if (i != 1) {
            if (i == 7) {
                this.w2 = (w3h) obj;
                return;
            }
            if (i == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.u2 != iIntValue2) {
                    this.u2 = iIntValue2;
                    if (this.t2) {
                        d0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i == 5 && m4hVar.h != (iIntValue = ((Integer) obj).intValue())) {
                    m4hVar.h = iIntValue;
                    m4hVar.d(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.a2 = iIntValue3;
            jw8 jw8Var = this.S0;
            if (jw8Var != null) {
                jw8Var.j(iIntValue3);
                return;
            }
            return;
        }
        p65 p65VarC = obj instanceof Surface ? (Surface) obj : null;
        if (p65VarC == null) {
            p65 p65Var = this.Y1;
            if (p65Var != null) {
                p65VarC = p65Var;
            } else {
                ow8 ow8Var = this.Z0;
                if (ow8Var != null && y0(ow8Var)) {
                    p65VarC = p65.c(this.O1, ow8Var.f);
                    this.Y1 = p65VarC;
                }
            }
        }
        Surface surface = this.X1;
        enb enbVar = this.Q1;
        if (surface == p65VarC) {
            if (p65VarC == null || p65VarC == this.Y1) {
                return;
            }
            rch rchVar = this.s2;
            if (rchVar != null && (handler = (Handler) enbVar.b) != null) {
                handler.post(new n1h(enbVar, 6, rchVar));
            }
            if (this.Z1) {
                Surface surface2 = this.X1;
                Handler handler3 = (Handler) enbVar.b;
                if (handler3 != null) {
                    handler3.post(new nh2(enbVar, surface2, SystemClock.elapsedRealtime(), 6));
                    return;
                }
                return;
            }
            return;
        }
        this.X1 = p65VarC;
        m4hVar.getClass();
        p65 p65Var2 = p65VarC instanceof p65 ? null : p65VarC;
        if (m4hVar.c != p65Var2) {
            m4hVar.b();
            m4hVar.c = p65Var2;
            m4hVar.d(true);
        }
        this.Z1 = false;
        int i2 = this.X;
        jw8 jw8Var2 = this.S0;
        if (jw8Var2 != null) {
            if (xxg.a < 23 || p65VarC == null || this.V1) {
                d0();
                Q();
            } else {
                jw8Var2.k(p65VarC);
            }
        }
        if (p65VarC == null || p65VarC == this.Y1) {
            this.s2 = null;
            o0();
            return;
        }
        rch rchVar2 = this.s2;
        if (rchVar2 != null && (handler2 = (Handler) enbVar.b) != null) {
            handler2.post(new n1h(enbVar, 6, rchVar2));
        }
        o0();
        if (i2 == 2) {
            long j = this.R1;
            this.f2 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // defpackage.sw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(long r31, long r33, defpackage.jw8 r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, defpackage.gf6 r44) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix8.b0(long, long, jw8, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, gf6):boolean");
    }

    @Override // defpackage.sk0
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.sw8
    public final void f0() {
        super.f0();
        this.j2 = 0;
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final boolean i() {
        p65 p65Var;
        if (super.i() && (this.b2 || (((p65Var = this.Y1) != null && this.X1 == p65Var) || this.S0 == null || this.t2))) {
            this.f2 = -9223372036854775807L;
            return true;
        }
        if (this.f2 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f2) {
            return true;
        }
        this.f2 = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.sw8
    public final boolean i0(ow8 ow8Var) {
        return this.X1 != null || y0(ow8Var);
    }

    @Override // defpackage.sk0
    public final void j() {
        enb enbVar = this.Q1;
        this.s2 = null;
        o0();
        this.Z1 = false;
        this.v2 = null;
        try {
            this.J0 = null;
            this.K1 = -9223372036854775807L;
            this.L1 = -9223372036854775807L;
            this.M1 = 0;
            H();
            nh4 nh4Var = this.J1;
            enbVar.getClass();
            synchronized (nh4Var) {
            }
            Handler handler = (Handler) enbVar.b;
            if (handler != null) {
                handler.post(new n1h(enbVar, 8, nh4Var));
            }
        } catch (Throwable th) {
            nh4 nh4Var2 = this.J1;
            enbVar.getClass();
            synchronized (nh4Var2) {
                Handler handler2 = (Handler) enbVar.b;
                if (handler2 != null) {
                    handler2.post(new n1h(enbVar, 8, nh4Var2));
                }
                throw th;
            }
        }
    }

    @Override // defpackage.sk0
    public final void k(boolean z, boolean z3) {
        this.J1 = new nh4(0);
        jld jldVar = this.c;
        jldVar.getClass();
        boolean z4 = jldVar.a;
        fsi.d((z4 && this.u2 == 0) ? false : true);
        if (this.t2 != z4) {
            this.t2 = z4;
            d0();
        }
        nh4 nh4Var = this.J1;
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new cch(enbVar, nh4Var, 2));
        }
        this.c2 = z3;
        this.d2 = false;
    }

    @Override // defpackage.sw8
    public final int k0(uy0 uy0Var, gf6 gf6Var) {
        boolean z;
        int i = 0;
        if (!wz9.j(gf6Var.v0)) {
            return sk0.b(0, 0, 0);
        }
        boolean z3 = gf6Var.y0 != null;
        wg7 wg7VarR0 = r0(uy0Var, gf6Var, z3, false);
        if (z3 && wg7VarR0.isEmpty()) {
            wg7VarR0 = r0(uy0Var, gf6Var, false, false);
        }
        if (wg7VarR0.isEmpty()) {
            return sk0.b(1, 0, 0);
        }
        int i2 = gf6Var.O0;
        if (i2 != 0 && i2 != 2) {
            return sk0.b(2, 0, 0);
        }
        ow8 ow8Var = (ow8) wg7VarR0.get(0);
        boolean zC = ow8Var.c(gf6Var);
        if (zC) {
            z = true;
        } else {
            for (int i3 = 1; i3 < wg7VarR0.size(); i3++) {
                ow8 ow8Var2 = (ow8) wg7VarR0.get(i3);
                if (ow8Var2.c(gf6Var)) {
                    z = false;
                    zC = true;
                    ow8Var = ow8Var2;
                    break;
                }
            }
            z = true;
        }
        int i4 = zC ? 4 : 3;
        int i5 = ow8Var.d(gf6Var) ? 16 : 8;
        int i6 = ow8Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (zC) {
            wg7 wg7VarR02 = r0(uy0Var, gf6Var, z3, true);
            if (!wg7VarR02.isEmpty()) {
                Pattern pattern = cx8.a;
                ArrayList arrayList = new ArrayList(wg7VarR02);
                Collections.sort(arrayList, new dj3(7, new sl6(17, gf6Var)));
                ow8 ow8Var3 = (ow8) arrayList.get(0);
                if (ow8Var3.c(gf6Var) && ow8Var3.d(gf6Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final void l(long j, boolean z) {
        super.l(j, z);
        o0();
        m4h m4hVar = this.P1;
        m4hVar.k = 0L;
        m4hVar.n = -1L;
        m4hVar.l = -1L;
        this.k2 = -9223372036854775807L;
        this.e2 = -9223372036854775807L;
        this.i2 = 0;
        if (!z) {
            this.f2 = -9223372036854775807L;
        } else {
            long j2 = this.R1;
            this.f2 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
    }

    @Override // defpackage.sk0
    public final void m() {
        try {
            try {
                C();
                d0();
                mc5 mc5Var = this.M0;
                if (mc5Var != null) {
                    mc5Var.E(null);
                }
                this.M0 = null;
            } catch (Throwable th) {
                mc5 mc5Var2 = this.M0;
                if (mc5Var2 != null) {
                    mc5Var2.E(null);
                }
                this.M0 = null;
                throw th;
            }
        } finally {
            p65 p65Var = this.Y1;
            if (p65Var != null) {
                if (this.X1 == p65Var) {
                    this.X1 = null;
                }
                p65Var.release();
                this.Y1 = null;
            }
        }
    }

    @Override // defpackage.sk0
    public final void n() {
        this.h2 = 0;
        this.g2 = SystemClock.elapsedRealtime();
        this.l2 = SystemClock.elapsedRealtime() * 1000;
        this.m2 = 0L;
        this.n2 = 0;
        m4h m4hVar = this.P1;
        m4hVar.b = true;
        m4hVar.k = 0L;
        m4hVar.n = -1L;
        m4hVar.l = -1L;
        i4h i4hVar = m4hVar.q;
        if (i4hVar != null) {
            k4h k4hVar = (k4h) m4hVar.r;
            k4hVar.getClass();
            k4hVar.b.sendEmptyMessage(1);
            i4hVar.a(new ehg(12, m4hVar));
        }
        m4hVar.d(false);
    }

    @Override // defpackage.sk0
    public final void o() {
        this.f2 = -9223372036854775807L;
        t0();
        int i = this.n2;
        if (i != 0) {
            long j = this.m2;
            enb enbVar = this.Q1;
            Handler handler = (Handler) enbVar.b;
            if (handler != null) {
                handler.post(new cch(enbVar, j, i));
            }
            this.m2 = 0L;
            this.n2 = 0;
        }
        m4h m4hVar = this.P1;
        m4hVar.b = false;
        i4h i4hVar = m4hVar.q;
        if (i4hVar != null) {
            i4hVar.c();
            k4h k4hVar = (k4h) m4hVar.r;
            k4hVar.getClass();
            k4hVar.b.sendEmptyMessage(2);
        }
        m4hVar.b();
    }

    public final void o0() {
        jw8 jw8Var;
        this.b2 = false;
        if (xxg.a < 23 || !this.t2 || (jw8Var = this.S0) == null) {
            return;
        }
        this.v2 = new hx8(this, jw8Var);
    }

    public final void t0() {
        if (this.h2 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.g2;
            int i = this.h2;
            enb enbVar = this.Q1;
            Handler handler = (Handler) enbVar.b;
            if (handler != null) {
                handler.post(new bch(enbVar, i, j, 0));
            }
            this.h2 = 0;
            this.g2 = jElapsedRealtime;
        }
    }

    public final void u0() {
        this.d2 = true;
        if (this.b2) {
            return;
        }
        this.b2 = true;
        Surface surface = this.X1;
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new nh2(enbVar, surface, SystemClock.elapsedRealtime(), 6));
        }
        this.Z1 = true;
    }

    public final void v0() {
        int i = this.o2;
        if (i == -1 && this.p2 == -1) {
            return;
        }
        rch rchVar = this.s2;
        if (rchVar != null && rchVar.a == i && rchVar.b == this.p2 && rchVar.c == this.q2 && rchVar.d == this.r2) {
            return;
        }
        rch rchVar2 = new rch(this.r2, i, this.p2, this.q2);
        this.s2 = rchVar2;
        enb enbVar = this.Q1;
        Handler handler = (Handler) enbVar.b;
        if (handler != null) {
            handler.post(new n1h(enbVar, 6, rchVar2));
        }
    }

    @Override // defpackage.sw8, defpackage.sk0
    public final void w(float f, float f2) {
        super.w(f, f2);
        m4h m4hVar = this.P1;
        m4hVar.g = f;
        m4hVar.k = 0L;
        m4hVar.n = -1L;
        m4hVar.l = -1L;
        m4hVar.d(false);
    }

    public final void w0(jw8 jw8Var, int i) {
        v0();
        lfi.a("releaseOutputBuffer");
        jw8Var.releaseOutputBuffer(i, true);
        lfi.c();
        this.l2 = SystemClock.elapsedRealtime() * 1000;
        this.J1.f++;
        this.i2 = 0;
        u0();
    }

    public final void x0(jw8 jw8Var, int i, long j) {
        v0();
        lfi.a("releaseOutputBuffer");
        jw8Var.g(i, j);
        lfi.c();
        this.l2 = SystemClock.elapsedRealtime() * 1000;
        this.J1.f++;
        this.i2 = 0;
        u0();
    }

    public final boolean y0(ow8 ow8Var) {
        if (xxg.a < 23 || this.t2 || p0(ow8Var.a)) {
            return false;
        }
        return !ow8Var.f || p65.b(this.O1);
    }

    public final void z0(jw8 jw8Var, int i) {
        lfi.a("skipVideoBuffer");
        jw8Var.releaseOutputBuffer(i, false);
        lfi.c();
        this.J1.g++;
    }
}
