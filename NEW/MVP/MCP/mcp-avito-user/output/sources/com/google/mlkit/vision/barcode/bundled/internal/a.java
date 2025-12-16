package com.google.mlkit.vision.barcode.bundled.internal;

import SZ0.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.c;
import com.google.barhopper.deeplearning.g;
import com.google.barhopper.deeplearning.i;
import com.google.barhopper.deeplearning.j;
import com.google.barhopper.deeplearning.l;
import com.google.barhopper.deeplearning.n;
import com.google.barhopper.deeplearning.o;
import com.google.photos.vision.barhopper.C37647a;
import com.google.photos.vision.barhopper.C37651e;
import com.google.photos.vision.barhopper.C37652f;
import com.google.photos.vision.barhopper.C37653g;
import com.google.photos.vision.barhopper.C37655i;
import com.google.photos.vision.barhopper.C37658l;
import com.google.photos.vision.barhopper.D;
import com.google.photos.vision.barhopper.F;
import com.google.photos.vision.barhopper.H;
import com.google.photos.vision.barhopper.J;
import com.google.photos.vision.barhopper.O;
import com.google.photos.vision.barhopper.q;
import com.google.photos.vision.barhopper.r;
import com.google.photos.vision.barhopper.s;
import j.P;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class a extends zzbk {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f362398q = {5, 7, 7, 7, 5, 5};

    /* renamed from: r, reason: collision with root package name */
    public static final double[][] f362399r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f362400a;

    /* renamed from: b, reason: collision with root package name */
    public final RecognitionOptions f362401b;

    /* renamed from: p, reason: collision with root package name */
    @P
    public BarhopperV3 f362402p;

    static {
        double[] dArr = new double[2];
        // fill-array-data instruction
        dArr[0] = 0.5d;
        dArr[1] = 1.0d;
        f362399r = new double[][]{new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, dArr, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    }

    public a(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f362401b = recognitionOptions;
        this.f362400a = context;
        recognitionOptions.a(zzbcVar.zza());
    }

    @P
    public static zzap f4(@P D d12, @P String str, String str2) {
        if (d12 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzap(d12.q(), d12.zzd(), d12.n(), d12.o(), d12.zzc(), d12.p(), d12.t(), matcher.find() ? matcher.group(1) : null);
    }

    public final C37647a g4(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = this.f362402p;
        C36729v.j(barhopperV3);
        C36729v.j(byteBuffer);
        boolean zIsDirect = byteBuffer.isDirect();
        RecognitionOptions recognitionOptions = this.f362401b;
        if (zIsDirect) {
            return barhopperV3.b(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.c(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.c(zzbuVar.zzd(), zzbuVar.zza(), bArr, recognitionOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(d dVar, zzbu zzbuVar) {
        C37647a c37647aD;
        Matrix matrix;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        int i12;
        zzar zzarVar;
        zzas zzasVar;
        int i13;
        int i14;
        Point[] pointArr;
        int i15;
        int i16;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        int iZzb = zzbuVar.zzb();
        int i17 = -1;
        boolean z12 = 0;
        if (iZzb == -1) {
            BarhopperV3 barhopperV3 = this.f362402p;
            C36729v.j(barhopperV3);
            c37647aD = barhopperV3.d((Bitmap) f.g4(dVar), this.f362401b);
        } else if (iZzb == 17) {
            c37647aD = g4((ByteBuffer) f.g4(dVar), zzbuVar);
        } else if (iZzb != 35) {
            if (iZzb != 842094169) {
                int iZzb2 = zzbuVar.zzb();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(iZzb2);
                throw new IllegalArgumentException(sb2.toString());
            }
            c37647aD = g4((ByteBuffer) f.g4(dVar), zzbuVar);
        } else {
            Image image = (Image) f.g4(dVar);
            C36729v.j(image);
            c37647aD = g4(image.getPlanes()[0].getBuffer(), zzbuVar);
        }
        ArrayList arrayList = new ArrayList();
        e eVar = e.f15073a;
        int iZzd = zzbuVar.zzd();
        int iZza = zzbuVar.zza();
        int iZzc = zzbuVar.zzc();
        eVar.getClass();
        if (iZzc == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            matrix.postTranslate((-iZzd) / 2.0f, (-iZza) / 2.0f);
            matrix.postRotate(iZzc * 90);
            int i18 = iZzc % 2;
            int i19 = i18 != 0 ? iZza : iZzd;
            if (i18 == 0) {
                iZzd = iZza;
            }
            matrix.postTranslate(i19 / 2.0f, iZzd / 2.0f);
        }
        for (s sVar : c37647aD.p()) {
            if (sVar.o() > 0 && matrix != null) {
                float[] fArr = new float[8];
                zzek zzekVarA = sVar.A();
                int iO2 = sVar.o();
                for (int i22 = z12; i22 < iO2; i22++) {
                    int i23 = i22 + i22;
                    fArr[i23] = ((C37653g) zzekVarA.get(i22)).n();
                    fArr[i23 + 1] = ((C37653g) zzekVarA.get(i22)).o();
                }
                matrix.mapPoints(fArr);
                int iZzc2 = zzbuVar.zzc();
                for (int i24 = z12; i24 < iO2; i24++) {
                    r rVar = (r) sVar.zzG();
                    int i25 = (i24 + iZzc2) % iO2;
                    int i26 = i24 + i24;
                    C37652f c37652fP = C37653g.p();
                    int i27 = (int) fArr[i26];
                    if (c37652fP.f352437d) {
                        c37652fP.e();
                        c37652fP.f352437d = z12;
                    }
                    C37653g.r((C37653g) c37652fP.f352436c, i27);
                    int i28 = (int) fArr[i26 + 1];
                    if (c37652fP.f352437d) {
                        c37652fP.e();
                        c37652fP.f352437d = z12;
                    }
                    C37653g.s((C37653g) c37652fP.f352436c, i28);
                    C37653g c37653g = (C37653g) c37652fP.zzl();
                    if (rVar.f352437d) {
                        rVar.e();
                        rVar.f352437d = z12;
                    }
                    s.B((s) rVar.f352436c, i25, c37653g);
                    sVar = (s) rVar.zzl();
                }
            }
            if (sVar.F()) {
                O oT2 = sVar.t();
                zzatVar = new zzat(oT2.p() + i17, oT2.zzc(), oT2.zze(), oT2.zzd());
            } else {
                zzatVar = null;
            }
            if (sVar.H()) {
                zzci zzciVarZzb = sVar.zzb();
                zzawVar = new zzaw(zzciVarZzb.zzd() + i17, zzciVarZzb.zzc());
            } else {
                zzawVar = null;
            }
            if (sVar.I()) {
                C37655i c37655iV = sVar.v();
                zzaxVar = new zzax(c37655iV.zzc(), c37655iV.zzd());
            } else {
                zzaxVar = null;
            }
            if (sVar.K()) {
                q qVarX = sVar.x();
                zzazVar = new zzaz(qVarX.zzd(), qVarX.zzc(), qVarX.p() + i17);
            } else {
                zzazVar = null;
            }
            if (sVar.J()) {
                C37658l c37658lW = sVar.w();
                zzayVar = new zzay(c37658lW.zzc(), c37658lW.zzd());
            } else {
                zzayVar = null;
            }
            if (sVar.G()) {
                C37651e c37651eU = sVar.u();
                zzauVar = new zzau(c37651eU.n(), c37651eU.o());
            } else {
                zzauVar = null;
            }
            if (sVar.C()) {
                F fQ2 = sVar.q();
                zzaqVar = new zzaq(fQ2.zzj(), fQ2.zze(), fQ2.zzf(), fQ2.zzh(), fQ2.zzi(), f4(fQ2.o(), sVar.y().zzn() ? sVar.y().zzv() : null, "DTSTART:([0-9TZ]*)"), f4(fQ2.n(), sVar.y().zzn() ? sVar.y().zzv() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (sVar.D()) {
                H hR2 = sVar.r();
                zzcd zzcdVarN = hR2.n();
                zzav zzavVar = zzcdVarN != null ? new zzav(zzcdVarN.zzd(), zzcdVarN.zzi(), zzcdVarN.zzh(), zzcdVarN.zzc(), zzcdVarN.zzf(), zzcdVarN.zze(), zzcdVarN.zzj()) : null;
                String strZzd = hR2.zzd();
                String strZze = hR2.zze();
                zzek zzekVarS = hR2.s();
                if (zzekVarS.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[zzekVarS.size()];
                    for (int i29 = z12; i29 < zzekVarS.size(); i29++) {
                        zzawVarArr2[i29] = new zzaw(((zzci) zzekVarS.get(i29)).zzd() + i17, ((zzci) zzekVarS.get(i29)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                zzek zzekVarR = hR2.r();
                if (zzekVarR.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[zzekVarR.size()];
                    int i32 = z12;
                    while (i32 < zzekVarR.size()) {
                        zzatVarArr2[i32] = new zzat(((O) zzekVarR.get(i32)).p() + i17, ((O) zzekVarR.get(i32)).zzc(), ((O) zzekVarR.get(i32)).zze(), ((O) zzekVarR.get(i32)).zzd());
                        i32++;
                        i17 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) hR2.t().toArray(new String[0]);
                zzek zzekVarQ = hR2.q();
                if (zzekVarQ.isEmpty()) {
                    i12 = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[zzekVarQ.size()];
                    for (int i33 = 0; i33 < zzekVarQ.size(); i33++) {
                        zzaoVarArr2[i33] = new zzao(((zzcb) zzekVarQ.get(i33)).zzc() - 1, (String[]) ((zzcb) zzekVarQ.get(i33)).zzb().toArray(new String[0]));
                    }
                    i12 = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, strZzd, strZze, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i12 = z12;
                zzarVar = null;
            }
            if (sVar.E()) {
                J jS2 = sVar.s();
                zzasVar = new zzas(jS2.zzi(), jS2.p(), jS2.v(), jS2.t(), jS2.q(), jS2.zze(), jS2.zzc(), jS2.zzd(), jS2.zzf(), jS2.u(), jS2.r(), jS2.zzj(), jS2.zzh(), jS2.s());
            } else {
                zzasVar = null;
            }
            switch (sVar.L() - 1) {
                case 0:
                    i13 = i12;
                    break;
                case 1:
                    i13 = 1;
                    break;
                case 2:
                    i13 = 2;
                    break;
                case 3:
                    i13 = 4;
                    break;
                case 4:
                    i13 = 8;
                    break;
                case 5:
                    i14 = 16;
                    i13 = i14;
                    break;
                case 6:
                    i14 = 32;
                    i13 = i14;
                    break;
                case 7:
                    i14 = 64;
                    i13 = i14;
                    break;
                case 8:
                    i14 = 128;
                    i13 = i14;
                    break;
                case 9:
                    i14 = 256;
                    i13 = i14;
                    break;
                case 10:
                    i14 = 512;
                    i13 = i14;
                    break;
                case 11:
                    i14 = 1024;
                    i13 = i14;
                    break;
                case 12:
                    i14 = 2048;
                    i13 = i14;
                    break;
                case 13:
                    i14 = 4096;
                    i13 = i14;
                    break;
                default:
                    i13 = -1;
                    break;
            }
            String strZ = sVar.z();
            String strZzv = sVar.y().zzn() ? sVar.y().zzv() : null;
            byte[] bArrZzy = sVar.y().zzy();
            zzek zzekVarA2 = sVar.A();
            if (zzekVarA2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[zzekVarA2.size()];
                for (int i34 = i12; i34 < zzekVarA2.size(); i34++) {
                    pointArr2[i34] = new Point(((C37653g) zzekVarA2.get(i34)).n(), ((C37653g) zzekVarA2.get(i34)).o());
                }
                pointArr = pointArr2;
            }
            switch (sVar.n() - 1) {
                case 1:
                    i15 = 1;
                    continue;
                    arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i17 = -1;
                    z12 = i12;
                case 2:
                    i15 = 2;
                    continue;
                    arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i17 = -1;
                    z12 = i12;
                case 3:
                    i16 = 3;
                    break;
                case 4:
                    i15 = 4;
                    continue;
                    arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i17 = -1;
                    z12 = i12;
                case 5:
                    i16 = 5;
                    break;
                case 6:
                    i16 = 6;
                    break;
                case 7:
                    i16 = 7;
                    break;
                case 8:
                    i15 = 8;
                    continue;
                    arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i17 = -1;
                    z12 = i12;
                case 9:
                    i16 = 9;
                    break;
                case 10:
                    i16 = 10;
                    break;
                case 11:
                    i16 = 11;
                    break;
                case 12:
                    i16 = 12;
                    break;
                default:
                    i15 = i12;
                    continue;
                    arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i17 = -1;
                    z12 = i12;
            }
            i15 = i16;
            arrayList.add(new zzba(i13, strZ, strZzv, bArrZzy, pointArr, i15, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i17 = -1;
            z12 = i12;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() throws IOException {
        Context context = this.f362400a;
        if (this.f362402p != null) {
            return;
        }
        this.f362402p = new BarhopperV3();
        i iVarN = j.n();
        com.google.barhopper.deeplearning.f fVarN = g.n();
        int i12 = 16;
        int i13 = 0;
        for (int i14 = 0; i14 < 6; i14++) {
            c cVarN = com.google.barhopper.deeplearning.d.n();
            if (cVarN.f352437d) {
                cVarN.e();
                cVarN.f352437d = false;
            }
            com.google.barhopper.deeplearning.d.s((com.google.barhopper.deeplearning.d) cVarN.f352436c, i12);
            if (cVarN.f352437d) {
                cVarN.e();
                cVarN.f352437d = false;
            }
            com.google.barhopper.deeplearning.d.p((com.google.barhopper.deeplearning.d) cVarN.f352436c, i12);
            for (int i15 = 0; i15 < f362398q[i14]; i15++) {
                double[] dArr = f362399r[i13];
                float f12 = (float) (dArr[0] * 320.0d);
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f13 = f12 / fSqrt;
                if (cVarN.f352437d) {
                    cVarN.e();
                    cVarN.f352437d = false;
                }
                com.google.barhopper.deeplearning.d.q((com.google.barhopper.deeplearning.d) cVarN.f352436c, f13);
                float f14 = f12 * fSqrt;
                if (cVarN.f352437d) {
                    cVarN.e();
                    cVarN.f352437d = false;
                }
                com.google.barhopper.deeplearning.d.r((com.google.barhopper.deeplearning.d) cVarN.f352436c, f14);
                i13++;
            }
            i12 += i12;
            if (fVarN.f352437d) {
                fVarN.e();
                fVarN.f352437d = false;
            }
            g.p((g) fVarN.f352436c, (com.google.barhopper.deeplearning.d) cVarN.zzl());
        }
        if (iVarN.f352437d) {
            iVarN.e();
            iVarN.f352437d = false;
        }
        j.p((j) iVarN.f352436c, (g) fVarN.zzl());
        try {
            InputStream inputStreamOpen = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = this.f362402p;
                        C36729v.j(barhopperV3);
                        l lVarN = com.google.barhopper.deeplearning.a.n();
                        zzdb zzdbVarZzt = zzdb.zzt(inputStreamOpen);
                        if (iVarN.f352437d) {
                            iVarN.e();
                            iVarN.f352437d = false;
                        }
                        j.q((j) iVarN.f352436c, zzdbVarZzt);
                        if (lVarN.f352437d) {
                            lVarN.e();
                            lVarN.f352437d = false;
                        }
                        com.google.barhopper.deeplearning.a.p((com.google.barhopper.deeplearning.a) lVarN.f352436c, (j) iVarN.zzl());
                        n nVarN = o.n();
                        zzdb zzdbVarZzt2 = zzdb.zzt(inputStreamOpen2);
                        if (nVarN.f352437d) {
                            nVarN.e();
                            nVarN.f352437d = false;
                        }
                        o.q((o) nVarN.f352436c, zzdbVarZzt2);
                        zzdb zzdbVarZzt3 = zzdb.zzt(inputStreamOpen3);
                        if (nVarN.f352437d) {
                            nVarN.e();
                            nVarN.f352437d = false;
                        }
                        o.p((o) nVarN.f352436c, zzdbVarZzt3);
                        if (lVarN.f352437d) {
                            lVarN.e();
                            lVarN.f352437d = false;
                        }
                        com.google.barhopper.deeplearning.a.q((com.google.barhopper.deeplearning.a) lVarN.f352436c, (o) nVarN.zzl());
                        barhopperV3.a(lVarN.zzl());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpen3 != null) {
                            try {
                                inputStreamOpen3.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th4;
            }
        } catch (IOException e12) {
            throw new IllegalStateException("Failed to open Barcode models", e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f362402p;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f362402p = null;
        }
    }
}
