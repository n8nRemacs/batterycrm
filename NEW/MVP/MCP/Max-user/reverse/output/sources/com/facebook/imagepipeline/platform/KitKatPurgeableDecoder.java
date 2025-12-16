package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import defpackage.d26;
import defpackage.fz4;
import defpackage.l5j;
import defpackage.nf9;
import defpackage.qk4;
import defpackage.vc3;

@fz4
@TargetApi(19)
/* loaded from: classes.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final d26 c;

    @fz4
    public KitKatPurgeableDecoder(d26 d26Var) {
        this.c = d26Var;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap a(vc3 vc3Var, BitmapFactory.Options options) {
        nf9 nf9Var = (nf9) vc3Var.Z();
        int iQ = nf9Var.Q();
        d26 d26Var = this.c;
        qk4 qk4VarK0 = vc3.k0((byte[]) d26Var.b.get(iQ), d26Var.a, vc3.X);
        try {
            byte[] bArr = (byte[]) qk4VarK0.Z();
            nf9Var.P(0, 0, iQ, bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iQ, options);
            l5j.e(bitmapDecodeByteArray, "BitmapFactory returned null");
            qk4VarK0.close();
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            vc3.P(qk4VarK0);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(vc3 vc3Var, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.d(i, vc3Var) ? null : DalvikPurgeableDecoder.b;
        nf9 nf9Var = (nf9) vc3Var.Z();
        if (!(i <= nf9Var.Q())) {
            throw new IllegalArgumentException();
        }
        int i2 = i + 2;
        d26 d26Var = this.c;
        qk4 qk4VarK0 = vc3.k0((byte[]) d26Var.b.get(i2), d26Var.a, vc3.X);
        try {
            byte[] bArr2 = (byte[]) qk4VarK0.Z();
            nf9Var.P(0, 0, i, bArr2);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            l5j.e(bitmapDecodeByteArray, "BitmapFactory returned null");
            qk4VarK0.close();
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            vc3.P(qk4VarK0);
            throw th;
        }
    }
}
