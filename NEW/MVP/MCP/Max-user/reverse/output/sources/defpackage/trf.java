package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class trf {
    public final String i;
    public final ey1 j;
    public final i12 k;
    public final kce l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public wb0 s;
    public final ky4 u;
    public final vd x;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final dcf v = new dcf(1);
    public final znd w = new znd(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.List] */
    public trf(Context context, String str, t22 t22Var, ey1 ey1Var) throws CameraUnavailableException, NumberFormatException {
        int i;
        ArrayList arrayListSingletonList;
        int[] outputFormats;
        long[] jArr;
        int[] iArr;
        boolean z;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        str.getClass();
        this.i = str;
        ey1Var.getClass();
        this.j = ey1Var;
        this.l = new kce();
        this.u = ky4.b(context);
        try {
            i12 i12VarB = t22Var.b(str);
            this.k = i12VarB;
            Integer num = (Integer) i12VarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) i12VarB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 3) {
                        this.n = true;
                    } else if (i2 == 6) {
                        this.o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
                        this.r = true;
                    }
                }
            }
            this.x = new vd(this.k);
            ArrayList arrayList = this.a;
            int i3 = this.m;
            boolean z2 = this.n;
            boolean z3 = this.o;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            vrf vrfVar = new vrf();
            wrf wrfVar = wrf.MAXIMUM;
            ctd.k(1, wrfVar, 0L, vrfVar);
            vrf vrfVarG = ctd.g(arrayList3, vrfVar);
            ctd.k(3, wrfVar, 0L, vrfVarG);
            vrf vrfVarG2 = ctd.g(arrayList3, vrfVarG);
            ctd.k(2, wrfVar, 0L, vrfVarG2);
            vrf vrfVarG3 = ctd.g(arrayList3, vrfVarG2);
            wrf wrfVar2 = wrf.PREVIEW;
            vrfVarG3.a(new qb0(1, wrfVar2, 0L));
            ctd.k(3, wrfVar, 0L, vrfVarG3);
            vrf vrfVarG4 = ctd.g(arrayList3, vrfVarG3);
            vrfVarG4.a(new qb0(2, wrfVar2, 0L));
            ctd.k(3, wrfVar, 0L, vrfVarG4);
            vrf vrfVarG5 = ctd.g(arrayList3, vrfVarG4);
            vrfVarG5.a(new qb0(1, wrfVar2, 0L));
            ctd.k(1, wrfVar2, 0L, vrfVarG5);
            vrf vrfVarG6 = ctd.g(arrayList3, vrfVarG5);
            vrfVarG6.a(new qb0(1, wrfVar2, 0L));
            ctd.k(2, wrfVar2, 0L, vrfVarG6);
            vrf vrfVarG7 = ctd.g(arrayList3, vrfVarG6);
            vrfVarG7.a(new qb0(1, wrfVar2, 0L));
            vrfVarG7.a(new qb0(2, wrfVar2, 0L));
            ctd.k(3, wrfVar, 0L, vrfVarG7);
            arrayList3.add(vrfVarG7);
            arrayList2.addAll(arrayList3);
            wrf wrfVar3 = wrf.RECORD;
            if (i3 == 0 || i3 == 1 || i3 == 3) {
                ArrayList arrayList4 = new ArrayList();
                vrf vrfVar2 = new vrf();
                vrfVar2.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar3, 0L, vrfVar2);
                vrf vrfVarG8 = ctd.g(arrayList4, vrfVar2);
                vrfVarG8.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar3, 0L, vrfVarG8);
                vrf vrfVarG9 = ctd.g(arrayList4, vrfVarG8);
                vrfVarG9.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar3, 0L, vrfVarG9);
                vrf vrfVarG10 = ctd.g(arrayList4, vrfVarG9);
                vrfVarG10.a(new qb0(1, wrfVar2, 0L));
                vrfVarG10.a(new qb0(1, wrfVar3, 0L));
                ctd.k(3, wrfVar3, 0L, vrfVarG10);
                vrf vrfVarG11 = ctd.g(arrayList4, vrfVarG10);
                vrfVarG11.a(new qb0(1, wrfVar2, 0L));
                vrfVarG11.a(new qb0(2, wrfVar3, 0L));
                i = 3;
                ctd.k(3, wrfVar3, 0L, vrfVarG11);
                vrf vrfVarG12 = ctd.g(arrayList4, vrfVarG11);
                vrfVarG12.a(new qb0(2, wrfVar2, 0L));
                vrfVarG12.a(new qb0(2, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG12);
                arrayList4.add(vrfVarG12);
                arrayList2.addAll(arrayList4);
            } else {
                i = 3;
            }
            wrf wrfVar4 = wrf.VGA;
            if (i3 == 1 || i3 == i) {
                ArrayList arrayList5 = new ArrayList();
                vrf vrfVar3 = new vrf();
                vrfVar3.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar, 0L, vrfVar3);
                vrf vrfVarG13 = ctd.g(arrayList5, vrfVar3);
                vrfVarG13.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG13);
                vrf vrfVarG14 = ctd.g(arrayList5, vrfVarG13);
                vrfVarG14.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG14);
                vrf vrfVarG15 = ctd.g(arrayList5, vrfVarG14);
                vrfVarG15.a(new qb0(1, wrfVar2, 0L));
                vrfVarG15.a(new qb0(1, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG15);
                vrf vrfVarG16 = ctd.g(arrayList5, vrfVarG15);
                vrfVarG16.a(new qb0(2, wrfVar4, 0L));
                vrfVarG16.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG16);
                vrf vrfVarG17 = ctd.g(arrayList5, vrfVarG16);
                vrfVarG17.a(new qb0(2, wrfVar4, 0L));
                vrfVarG17.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG17);
                arrayList5.add(vrfVarG17);
                arrayList2.addAll(arrayList5);
            }
            if (z2) {
                ArrayList arrayList6 = new ArrayList();
                vrf vrfVar4 = new vrf();
                ctd.k(5, wrfVar, 0L, vrfVar4);
                vrf vrfVarG18 = ctd.g(arrayList6, vrfVar4);
                vrfVarG18.a(new qb0(1, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG18);
                vrf vrfVarG19 = ctd.g(arrayList6, vrfVarG18);
                vrfVarG19.a(new qb0(2, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG19);
                vrf vrfVarG20 = ctd.g(arrayList6, vrfVarG19);
                vrfVarG20.a(new qb0(1, wrfVar2, 0L));
                vrfVarG20.a(new qb0(1, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG20);
                vrf vrfVarG21 = ctd.g(arrayList6, vrfVarG20);
                vrfVarG21.a(new qb0(1, wrfVar2, 0L));
                vrfVarG21.a(new qb0(2, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG21);
                vrf vrfVarG22 = ctd.g(arrayList6, vrfVarG21);
                vrfVarG22.a(new qb0(2, wrfVar2, 0L));
                vrfVarG22.a(new qb0(2, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG22);
                vrf vrfVarG23 = ctd.g(arrayList6, vrfVarG22);
                vrfVarG23.a(new qb0(1, wrfVar2, 0L));
                vrfVarG23.a(new qb0(3, wrfVar, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG23);
                vrf vrfVarG24 = ctd.g(arrayList6, vrfVarG23);
                vrfVarG24.a(new qb0(2, wrfVar2, 0L));
                vrfVarG24.a(new qb0(3, wrfVar, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG24);
                arrayList6.add(vrfVarG24);
                arrayList2.addAll(arrayList6);
            }
            if (z3 && i3 == 0) {
                ArrayList arrayList7 = new ArrayList();
                vrf vrfVar5 = new vrf();
                vrfVar5.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar, 0L, vrfVar5);
                vrf vrfVarG25 = ctd.g(arrayList7, vrfVar5);
                vrfVarG25.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG25);
                vrf vrfVarG26 = ctd.g(arrayList7, vrfVarG25);
                vrfVarG26.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG26);
                arrayList7.add(vrfVarG26);
                arrayList2.addAll(arrayList7);
            }
            if (i3 == 3) {
                ArrayList arrayList8 = new ArrayList();
                vrf vrfVar6 = new vrf();
                vrfVar6.a(new qb0(1, wrfVar2, 0L));
                vrfVar6.a(new qb0(1, wrfVar4, 0L));
                vrfVar6.a(new qb0(2, wrfVar, 0L));
                ctd.k(5, wrfVar, 0L, vrfVar6);
                vrf vrfVarG27 = ctd.g(arrayList8, vrfVar6);
                vrfVarG27.a(new qb0(1, wrfVar2, 0L));
                vrfVarG27.a(new qb0(1, wrfVar4, 0L));
                vrfVarG27.a(new qb0(3, wrfVar, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG27);
                arrayList8.add(vrfVarG27);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            kce kceVar = this.l;
            String str2 = this.i;
            if (((ExtraSupportedSurfaceCombinationsQuirk) kceVar.b) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                vrf vrfVar7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.e()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(arrayListSingletonList);
            if (this.r) {
                ArrayList arrayList10 = this.b;
                ArrayList arrayList11 = new ArrayList();
                vrf vrfVar8 = new vrf();
                wrf wrfVar5 = wrf.ULTRA_MAXIMUM;
                vrfVar8.a(new qb0(2, wrfVar5, 0L));
                vrfVar8.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar3, 0L, vrfVar8);
                vrf vrfVarG28 = ctd.g(arrayList11, vrfVar8);
                vrfVarG28.a(new qb0(3, wrfVar5, 0L));
                vrfVarG28.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar3, 0L, vrfVarG28);
                vrf vrfVarG29 = ctd.g(arrayList11, vrfVarG28);
                vrfVarG29.a(new qb0(5, wrfVar5, 0L));
                vrfVarG29.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar3, 0L, vrfVarG29);
                vrf vrfVarG30 = ctd.g(arrayList11, vrfVarG29);
                vrfVarG30.a(new qb0(2, wrfVar5, 0L));
                vrfVarG30.a(new qb0(1, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG30);
                vrf vrfVarG31 = ctd.g(arrayList11, vrfVarG30);
                vrfVarG31.a(new qb0(3, wrfVar5, 0L));
                vrfVarG31.a(new qb0(1, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG31);
                vrf vrfVarG32 = ctd.g(arrayList11, vrfVarG31);
                vrfVarG32.a(new qb0(5, wrfVar5, 0L));
                vrfVarG32.a(new qb0(1, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG32);
                vrf vrfVarG33 = ctd.g(arrayList11, vrfVarG32);
                vrfVarG33.a(new qb0(2, wrfVar5, 0L));
                vrfVarG33.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG33);
                vrf vrfVarG34 = ctd.g(arrayList11, vrfVarG33);
                vrfVarG34.a(new qb0(3, wrfVar5, 0L));
                vrfVarG34.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG34);
                vrf vrfVarG35 = ctd.g(arrayList11, vrfVarG34);
                vrfVarG35.a(new qb0(5, wrfVar5, 0L));
                vrfVarG35.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG35);
                vrf vrfVarG36 = ctd.g(arrayList11, vrfVarG35);
                vrfVarG36.a(new qb0(2, wrfVar5, 0L));
                vrfVarG36.a(new qb0(1, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG36);
                vrf vrfVarG37 = ctd.g(arrayList11, vrfVarG36);
                vrfVarG37.a(new qb0(3, wrfVar5, 0L));
                vrfVarG37.a(new qb0(1, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG37);
                vrf vrfVarG38 = ctd.g(arrayList11, vrfVarG37);
                vrfVarG38.a(new qb0(5, wrfVar5, 0L));
                vrfVarG38.a(new qb0(1, wrfVar2, 0L));
                ctd.k(5, wrfVar, 0L, vrfVarG38);
                arrayList11.add(vrfVarG38);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.p = zHasSystemFeature;
            wrf wrfVar6 = wrf.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.c;
                ArrayList arrayList13 = new ArrayList();
                vrf vrfVar9 = new vrf();
                ctd.k(2, wrfVar6, 0L, vrfVar9);
                vrf vrfVarG39 = ctd.g(arrayList13, vrfVar9);
                ctd.k(1, wrfVar6, 0L, vrfVarG39);
                vrf vrfVarG40 = ctd.g(arrayList13, vrfVarG39);
                ctd.k(3, wrfVar6, 0L, vrfVarG40);
                vrf vrfVarG41 = ctd.g(arrayList13, vrfVarG40);
                wrf wrfVar7 = wrf.s720p;
                vrfVarG41.a(new qb0(2, wrfVar7, 0L));
                ctd.k(3, wrfVar6, 0L, vrfVarG41);
                vrf vrfVarG42 = ctd.g(arrayList13, vrfVarG41);
                vrfVarG42.a(new qb0(1, wrfVar7, 0L));
                ctd.k(3, wrfVar6, 0L, vrfVarG42);
                vrf vrfVarG43 = ctd.g(arrayList13, vrfVarG42);
                vrfVarG43.a(new qb0(2, wrfVar7, 0L));
                ctd.k(2, wrfVar6, 0L, vrfVarG43);
                vrf vrfVarG44 = ctd.g(arrayList13, vrfVarG43);
                vrfVarG44.a(new qb0(2, wrfVar7, 0L));
                ctd.k(1, wrfVar6, 0L, vrfVarG44);
                vrf vrfVarG45 = ctd.g(arrayList13, vrfVarG44);
                vrfVarG45.a(new qb0(1, wrfVar7, 0L));
                ctd.k(2, wrfVar6, 0L, vrfVarG45);
                vrf vrfVarG46 = ctd.g(arrayList13, vrfVarG45);
                vrfVarG46.a(new qb0(1, wrfVar7, 0L));
                ctd.k(1, wrfVar6, 0L, vrfVarG46);
                arrayList13.add(vrfVarG46);
                arrayList12.addAll(arrayList13);
            }
            if (this.x.b) {
                ArrayList arrayList14 = this.f;
                ArrayList arrayList15 = new ArrayList();
                vrf vrfVar10 = new vrf();
                ctd.k(1, wrfVar, 0L, vrfVar10);
                vrf vrfVarG47 = ctd.g(arrayList15, vrfVar10);
                ctd.k(2, wrfVar, 0L, vrfVarG47);
                vrf vrfVarG48 = ctd.g(arrayList15, vrfVarG47);
                vrfVarG48.a(new qb0(1, wrfVar2, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG48);
                vrf vrfVarG49 = ctd.g(arrayList15, vrfVarG48);
                vrfVarG49.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG49);
                vrf vrfVarG50 = ctd.g(arrayList15, vrfVarG49);
                vrfVarG50.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG50);
                vrf vrfVarG51 = ctd.g(arrayList15, vrfVarG50);
                vrfVarG51.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar3, 0L, vrfVarG51);
                vrf vrfVarG52 = ctd.g(arrayList15, vrfVarG51);
                vrfVarG52.a(new qb0(1, wrfVar2, 0L));
                vrfVarG52.a(new qb0(1, wrfVar3, 0L));
                ctd.k(2, wrfVar3, 0L, vrfVarG52);
                vrf vrfVarG53 = ctd.g(arrayList15, vrfVarG52);
                vrfVarG53.a(new qb0(1, wrfVar2, 0L));
                vrfVarG53.a(new qb0(1, wrfVar3, 0L));
                ctd.k(3, wrfVar3, 0L, vrfVarG53);
                arrayList15.add(vrfVarG53);
                arrayList14.addAll(arrayList15);
            }
            zid zidVar = (zid) this.k.b().a;
            zidVar.getClass();
            try {
                outputFormats = ((StreamConfigurationMap) zidVar.a).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException e) {
                gri.j("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                int length = iArr3.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (iArr3[i4] == 4101) {
                        ArrayList arrayList16 = this.g;
                        ArrayList arrayList17 = new ArrayList();
                        vrf vrfVar11 = new vrf();
                        ctd.k(4, wrfVar, 0L, vrfVar11);
                        vrf vrfVarG54 = ctd.g(arrayList17, vrfVar11);
                        vrfVarG54.a(new qb0(1, wrfVar2, 0L));
                        ctd.k(4, wrfVar, 0L, vrfVarG54);
                        arrayList17.add(vrfVarG54);
                        arrayList16.addAll(arrayList17);
                        break;
                    }
                    i4++;
                }
            }
            i12 i12Var = this.k;
            s90 s90Var = zlf.a;
            int i5 = Build.VERSION.SDK_INT;
            boolean z4 = (i5 < 33 || (jArr = (long[]) i12Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.q = z4;
            if (z4 && i5 >= 33) {
                ArrayList arrayList18 = this.h;
                ArrayList arrayList19 = new ArrayList();
                vrf vrfVar12 = new vrf();
                ctd.k(1, wrfVar6, 4L, vrfVar12);
                vrf vrfVarG55 = ctd.g(arrayList19, vrfVar12);
                ctd.k(2, wrfVar6, 4L, vrfVarG55);
                vrf vrfVarG56 = ctd.g(arrayList19, vrfVarG55);
                ctd.k(1, wrfVar3, 3L, vrfVarG56);
                vrf vrfVarG57 = ctd.g(arrayList19, vrfVarG56);
                ctd.k(2, wrfVar3, 3L, vrfVarG57);
                vrf vrfVarG58 = ctd.g(arrayList19, vrfVarG57);
                ctd.k(3, wrfVar, 2L, vrfVarG58);
                vrf vrfVarG59 = ctd.g(arrayList19, vrfVarG58);
                ctd.k(2, wrfVar, 2L, vrfVarG59);
                vrf vrfVarG60 = ctd.g(arrayList19, vrfVarG59);
                vrfVarG60.a(new qb0(1, wrfVar2, 1L));
                ctd.k(3, wrfVar, 2L, vrfVarG60);
                vrf vrfVarG61 = ctd.g(arrayList19, vrfVarG60);
                vrfVarG61.a(new qb0(1, wrfVar2, 1L));
                ctd.k(2, wrfVar, 2L, vrfVarG61);
                vrf vrfVarG62 = ctd.g(arrayList19, vrfVarG61);
                vrfVarG62.a(new qb0(1, wrfVar2, 1L));
                ctd.k(1, wrfVar3, 3L, vrfVarG62);
                vrf vrfVarG63 = ctd.g(arrayList19, vrfVarG62);
                vrfVarG63.a(new qb0(1, wrfVar2, 1L));
                ctd.k(2, wrfVar3, 3L, vrfVarG63);
                vrf vrfVarG64 = ctd.g(arrayList19, vrfVarG63);
                vrfVarG64.a(new qb0(1, wrfVar2, 1L));
                ctd.k(2, wrfVar2, 1L, vrfVarG64);
                vrf vrfVarG65 = ctd.g(arrayList19, vrfVarG64);
                vrfVarG65.a(new qb0(1, wrfVar2, 1L));
                vrfVarG65.a(new qb0(1, wrfVar3, 3L));
                ctd.k(3, wrfVar3, 2L, vrfVarG65);
                vrf vrfVarG66 = ctd.g(arrayList19, vrfVarG65);
                vrfVarG66.a(new qb0(1, wrfVar2, 1L));
                vrfVarG66.a(new qb0(2, wrfVar3, 3L));
                ctd.k(3, wrfVar3, 2L, vrfVarG66);
                vrf vrfVarG67 = ctd.g(arrayList19, vrfVarG66);
                vrfVarG67.a(new qb0(1, wrfVar2, 1L));
                vrfVarG67.a(new qb0(2, wrfVar2, 1L));
                ctd.k(3, wrfVar, 2L, vrfVarG67);
                arrayList19.add(vrfVarG67);
                arrayList18.addAll(arrayList19);
            }
            i12 i12Var2 = this.k;
            if (i5 < 33 || (iArr = (int[]) i12Var2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z = false;
            } else {
                for (int i6 : iArr) {
                    if (i6 == 2) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList20 = this.d;
                ArrayList arrayList21 = new ArrayList();
                vrf vrfVar13 = new vrf();
                ctd.k(1, wrfVar6, 0L, vrfVar13);
                vrf vrfVarG68 = ctd.g(arrayList21, vrfVar13);
                ctd.k(2, wrfVar6, 0L, vrfVarG68);
                vrf vrfVarG69 = ctd.g(arrayList21, vrfVarG68);
                vrfVarG69.a(new qb0(1, wrfVar6, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG69);
                vrf vrfVarG70 = ctd.g(arrayList21, vrfVarG69);
                vrfVarG70.a(new qb0(2, wrfVar6, 0L));
                ctd.k(3, wrfVar, 0L, vrfVarG70);
                vrf vrfVarG71 = ctd.g(arrayList21, vrfVarG70);
                vrfVarG71.a(new qb0(1, wrfVar6, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG71);
                vrf vrfVarG72 = ctd.g(arrayList21, vrfVarG71);
                vrfVarG72.a(new qb0(2, wrfVar6, 0L));
                ctd.k(2, wrfVar, 0L, vrfVarG72);
                vrf vrfVarG73 = ctd.g(arrayList21, vrfVarG72);
                vrfVarG73.a(new qb0(1, wrfVar2, 0L));
                ctd.k(1, wrfVar6, 0L, vrfVarG73);
                vrf vrfVarG74 = ctd.g(arrayList21, vrfVarG73);
                vrfVarG74.a(new qb0(2, wrfVar2, 0L));
                ctd.k(1, wrfVar6, 0L, vrfVarG74);
                vrf vrfVarG75 = ctd.g(arrayList21, vrfVarG74);
                vrfVarG75.a(new qb0(1, wrfVar2, 0L));
                ctd.k(2, wrfVar6, 0L, vrfVarG75);
                vrf vrfVarG76 = ctd.g(arrayList21, vrfVarG75);
                vrfVarG76.a(new qb0(2, wrfVar2, 0L));
                ctd.k(2, wrfVar6, 0L, vrfVarG76);
                arrayList21.add(vrfVarG76);
                arrayList20.addAll(arrayList21);
            }
            b();
        } catch (CameraAccessExceptionCompat e2) {
            throw new CameraUnavailableException(e2);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        zi3 zi3Var = new zi3(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), zi3Var);
        Size size2 = d4f.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), zi3Var);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), zi3Var);
    }

    public static int e(Range range, Range range2) {
        z5j.f("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(pb0 pb0Var, List list) {
        List list2;
        HashMap map = this.e;
        if (map.containsKey(pb0Var)) {
            list2 = (List) map.get(pb0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = pb0Var.d;
            int i = pb0Var.a;
            if (!z) {
                int i2 = pb0Var.b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i != 2) {
                            if (pb0Var.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.c;
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.g);
            }
            map.put(pb0Var, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((vrf) it.next()).c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() throws NumberFormatException {
        Size size;
        Size size2;
        Size size3;
        int i;
        ey1 ey1Var;
        CamcorderProfile camcorderProfileC;
        CamcorderProfile camcorderProfileC2;
        Size sizeE = this.u.e();
        try {
            i = Integer.parseInt(this.i);
            ey1Var = this.j;
            camcorderProfileC = null;
            camcorderProfileC2 = ey1Var.p(i, 1) ? ey1Var.c(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((zid) this.k.b().a).a).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = d4f.d;
            } else {
                Arrays.sort(outputSizes, new zi3(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = d4f.f;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = d4f.d;
            }
            size2 = size;
        }
        if (camcorderProfileC2 != null) {
            size2 = new Size(camcorderProfileC2.videoFrameWidth, camcorderProfileC2.videoFrameHeight);
        } else {
            Size size6 = d4f.d;
            if (ey1Var.p(i, 10)) {
                camcorderProfileC = ey1Var.c(i, 10);
            } else if (ey1Var.p(i, 8)) {
                camcorderProfileC = ey1Var.c(i, 8);
            } else if (ey1Var.p(i, 12)) {
                camcorderProfileC = ey1Var.c(i, 12);
            } else if (ey1Var.p(i, 6)) {
                camcorderProfileC = ey1Var.c(i, 6);
            } else if (ey1Var.p(i, 5)) {
                camcorderProfileC = ey1Var.c(i, 5);
            } else if (ey1Var.p(i, 4)) {
                camcorderProfileC = ey1Var.c(i, 4);
            }
            if (camcorderProfileC == null) {
                size3 = size6;
                this.s = new wb0(d4f.c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfileC.videoFrameWidth, camcorderProfileC.videoFrameHeight);
        }
        size3 = size2;
        this.s = new wb0(d4f.c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List d(pb0 pb0Var, List list) {
        s90 s90Var = zlf.a;
        if (pb0Var.a != 0 || pb0Var.b != 8) {
            return null;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            List listC = ((vrf) it.next()).c(list);
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x034f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair g(int r35, java.util.ArrayList r36, java.util.HashMap r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 3869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trf.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d90 d90Var = (d90) it.next();
            arrayList4.add(d90Var.a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), d90Var);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            xwg xwgVar = (xwg) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int inputFormat = xwgVar.getInputFormat();
            arrayList4.add(qb0.b(i, inputFormat, size, i(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), xwgVar);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(xwgVar.getInputFormat(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final wb0 i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.t;
        if (!arrayList.contains(numValueOf)) {
            j(this.s.b, d4f.e, i);
            j(this.s.d, d4f.g, i);
            HashMap map = this.s.f;
            i12 i12Var = this.k;
            Size sizeC = c((StreamConfigurationMap) ((zid) i12Var.b().a).a, i, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i), sizeC);
            }
            HashMap map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) i12Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.s;
    }

    public final void j(HashMap map, Size size, int i) {
        if (this.p) {
            Size sizeC = c((StreamConfigurationMap) ((zid) this.k.b().a).a, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new zi3(false));
            }
            map.put(numValueOf, size);
        }
    }
}
