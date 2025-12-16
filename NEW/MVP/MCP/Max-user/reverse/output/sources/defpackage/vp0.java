package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.SparseBooleanArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class vp0 implements e1e {
    public Object X;
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object o;

    public vp0(String str, Bitmap bitmap) {
        this.d = bitmap;
        this.o = str;
        this.a = bitmap.getByteCount();
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        this.X = MediaStore.Images.Media.getContentUri("external_primary");
    }

    @Override // defpackage.e1e
    public uz9 a() {
        return uz9.d;
    }

    public zva b() {
        int iMax;
        int i;
        char c;
        cf3 cf3Var;
        zva zvaVar;
        int i2;
        ArrayList arrayList = (ArrayList) this.X;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i3 = this.c;
        int i4 = this.b;
        double dSqrt = -1.0d;
        if (i4 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i4) {
                dSqrt = Math.sqrt(i4 / height);
            }
        } else if (i3 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i3) {
            dSqrt = i3 / iMax;
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        int i5 = this.a;
        lmb[] lmbVarArr = arrayList.isEmpty() ? null : (lmb[]) arrayList.toArray(new lmb[arrayList.size()]);
        b4 b4Var = new b4();
        b4Var.o = new float[3];
        b4Var.d = lmbVarArr;
        int[] iArr2 = new int[32768];
        b4Var.b = iArr2;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= iArr.length) {
                break;
            }
            int i7 = iArr[i6];
            int iG = (b4.g(Color.green(i7), 8, 5) << 5) | (b4.g(Color.red(i7), 8, 5) << 10) | b4.g(Color.blue(i7), 8, 5);
            iArr[i6] = iG;
            iArr2[iG] = iArr2[iG] + 1;
            i6++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < 32768) {
            if (iArr2[i8] > 0) {
                int iRgb = Color.rgb(b4.g((i8 >> 10) & 31, 5, 8), b4.g((i8 >> 5) & 31, 5, 8), b4.g(i8 & 31, 5, 8));
                float[] fArr = (float[]) b4Var.o;
                ThreadLocal threadLocal = rf3.a;
                i2 = i;
                rf3.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (b4Var.j(fArr)) {
                    iArr2[i8] = 0;
                }
            } else {
                i2 = i;
            }
            if (iArr2[i8] > 0) {
                i9++;
            }
            i8++;
            i = i2;
        }
        int i10 = i;
        int[] iArr3 = new int[i9];
        b4Var.a = iArr3;
        int i11 = 0;
        for (int i12 = 0; i12 < 32768; i12++) {
            if (iArr2[i12] > 0) {
                iArr3[i11] = i12;
                i11++;
            }
        }
        if (i9 <= i5) {
            b4Var.c = new ArrayList();
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = iArr3[i13];
                ((ArrayList) b4Var.c).add(new mmb(Color.rgb(b4.g((i14 >> 10) & 31, 5, 8), b4.g((i14 >> 5) & 31, 5, 8), b4.g(i14 & 31, 5, 8)), iArr2[i14]));
            }
            c = 2;
        } else {
            c = 2;
            PriorityQueue priorityQueue = new PriorityQueue(i5, b4.X);
            priorityQueue.offer(new cf3(b4Var, 0, ((int[]) b4Var.a).length - 1));
            while (priorityQueue.size() < i5 && (cf3Var = (cf3) priorityQueue.poll()) != null) {
                int i15 = cf3Var.b;
                int iMin = cf3Var.a;
                int i16 = i10;
                if ((i15 + 1) - iMin <= i16) {
                    break;
                }
                b4 b4Var2 = cf3Var.j;
                if ((i15 + 1) - iMin <= i16) {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
                int i17 = cf3Var.e - cf3Var.d;
                int i18 = cf3Var.g - cf3Var.f;
                int i19 = cf3Var.i - cf3Var.h;
                int i20 = (i17 < i18 || i17 < i19) ? (i18 < i17 || i18 < i19) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) b4Var2.a;
                int[] iArr5 = (int[]) b4Var2.b;
                b4.c(i20, iMin, i15, iArr4);
                Arrays.sort(iArr4, iMin, cf3Var.b + 1);
                b4.c(i20, iMin, cf3Var.b, iArr4);
                int i21 = cf3Var.c / 2;
                int i22 = iMin;
                int i23 = 0;
                while (true) {
                    int i24 = cf3Var.b;
                    if (i22 > i24) {
                        break;
                    }
                    i23 += iArr5[iArr4[i22]];
                    if (i23 >= i21) {
                        iMin = Math.min(i24 - 1, i22);
                        break;
                    }
                    i22++;
                }
                cf3 cf3Var2 = new cf3(b4Var2, iMin + 1, cf3Var.b);
                cf3Var.b = iMin;
                cf3Var.a();
                priorityQueue.offer(cf3Var2);
                priorityQueue.offer(cf3Var);
                i10 = 1;
            }
            ArrayList arrayList2 = new ArrayList(priorityQueue.size());
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                cf3 cf3Var3 = (cf3) it.next();
                b4 b4Var3 = cf3Var3.j;
                int[] iArr6 = (int[]) b4Var3.a;
                int[] iArr7 = (int[]) b4Var3.b;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                for (int i29 = cf3Var3.a; i29 <= cf3Var3.b; i29++) {
                    int i30 = iArr6[i29];
                    int i31 = iArr7[i30];
                    i26 += i31;
                    i25 = (((i30 >> 10) & 31) * i31) + i25;
                    i27 = (((i30 >> 5) & 31) * i31) + i27;
                    i28 = (i31 * (i30 & 31)) + i28;
                }
                float f = i26;
                mmb mmbVar = new mmb(Color.rgb(b4.g(Math.round(i25 / f), 5, 8), b4.g(Math.round(i27 / f), 5, 8), b4.g(Math.round(i28 / f), 5, 8)), i26);
                if (!b4Var.j(mmbVar.b())) {
                    arrayList2.add(mmbVar);
                }
            }
            b4Var.c = arrayList2;
        }
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) b4Var.c;
        ArrayList arrayList4 = (ArrayList) this.o;
        zva zvaVar2 = new zva(arrayList4, arrayList3);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) zvaVar2.d;
        int size = arrayList4.size();
        int i32 = 0;
        while (i32 < size) {
            z1g z1gVar = (z1g) arrayList4.get(i32);
            float[] fArr2 = z1gVar.c;
            float[] fArr3 = z1gVar.a;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (float f4 : fArr2) {
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length = fArr2.length;
                for (int i33 = 0; i33 < length; i33++) {
                    float f5 = fArr2[i33];
                    if (f5 > 0.0f) {
                        fArr2[i33] = f5 / f3;
                    }
                }
            }
            us usVar = (us) zvaVar2.c;
            List list = (List) zvaVar2.b;
            int size2 = list.size();
            float f6 = 0.0f;
            int i34 = 0;
            mmb mmbVar2 = null;
            while (i34 < size2) {
                mmb mmbVar3 = (mmb) list.get(i34);
                float[] fArrB = mmbVar3.b();
                float f7 = fArrB[1];
                float f8 = f2;
                float[] fArr4 = z1gVar.b;
                if (f7 < fArr3[0] || f7 > fArr3[c]) {
                    zvaVar = zvaVar2;
                } else {
                    float f9 = fArrB[c];
                    if (f9 < fArr4[0] || f9 > fArr4[c] || sparseBooleanArray.get(mmbVar3.d)) {
                        zvaVar = zvaVar2;
                    } else {
                        float[] fArrB2 = mmbVar3.b();
                        mmb mmbVar4 = (mmb) zvaVar2.o;
                        int i35 = mmbVar4 != null ? mmbVar4.e : 1;
                        zvaVar = zvaVar2;
                        float[] fArr5 = z1gVar.c;
                        float f10 = fArr5[0];
                        float fAbs = f10 > f8 ? (1.0f - Math.abs(fArrB2[1] - fArr3[1])) * f10 : f8;
                        float f11 = fArr5[1];
                        float fAbs2 = f11 > f8 ? (1.0f - Math.abs(fArrB2[c] - fArr4[1])) * f11 : f8;
                        float f12 = fArr5[c];
                        float f13 = fAbs + fAbs2 + (f12 > f8 ? (mmbVar3.e / i35) * f12 : f8);
                        if (mmbVar2 == null || f13 > f6) {
                            mmbVar2 = mmbVar3;
                            f6 = f13;
                        }
                    }
                }
                i34++;
                zvaVar2 = zvaVar;
                f2 = f8;
            }
            zva zvaVar3 = zvaVar2;
            if (mmbVar2 != null) {
                sparseBooleanArray.append(mmbVar2.d, true);
            }
            usVar.put(z1gVar, mmbVar2);
            i32++;
            zvaVar2 = zvaVar3;
        }
        zva zvaVar4 = zvaVar2;
        sparseBooleanArray.clear();
        return zvaVar4;
    }

    @Override // defpackage.e1e
    public void c(ContentResolver contentResolver, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream == null) {
            return;
        }
        try {
            ((Bitmap) this.d).compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
        } finally {
        }
    }

    public void d() {
        this.a = 1;
        this.o = (gz9) this.d;
        this.c = 0;
    }

    public boolean e() {
        zy9 zy9VarB = ((gz9) this.o).b.b();
        int iA = zy9VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) zy9VarB.d).get(iA + zy9VarB.a) == 0) || this.b == 65039;
    }

    @Override // defpackage.e1e
    public Integer getHeight() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.e1e
    public Integer getWidth() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.e1e
    public Uri h() {
        return (Uri) this.X;
    }

    @Override // defpackage.e1e
    public String i() {
        return (String) this.o;
    }

    @Override // defpackage.e1e
    public Integer k() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.e1e
    public void n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsoluteFile());
        try {
            ((Bitmap) this.d).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    public vp0(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.o = arrayList;
        this.a = 16;
        this.b = 12544;
        this.c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.X = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(zva.X);
            this.d = bitmap;
            arrayList.add(z1g.d);
            arrayList.add(z1g.e);
            arrayList.add(z1g.f);
            arrayList.add(z1g.g);
            arrayList.add(z1g.h);
            arrayList.add(z1g.i);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public vp0(gz9 gz9Var, int[] iArr) {
        this.a = 1;
        this.d = gz9Var;
        this.o = gz9Var;
    }
}
