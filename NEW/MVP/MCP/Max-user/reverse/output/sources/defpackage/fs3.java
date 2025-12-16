package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.animated.gif.GifFrame;
import com.facebook.animated.gif.GifImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import tech.kwik.core.crypto.MissingKeysException;

/* loaded from: classes.dex */
public final class fs3 {
    public static final byte[] k = {-81, -65, -20, 40, -103, -109, -46, 76, -98, -105, -122, -15, -100, 97, 17, -32, 67, -112, -88, -103};
    public static final byte[] l = {56, 118, 44, -9, -11, 89, 52, -77, 77, 23, -102, -26, -92, -56, 12, -83, -52, -69, 127, 10};
    public static final byte[] m = {13, -19, -29, -34, -9, 0, -90, -37, -127, -109, -127, -66, 110, 38, -99, -53, -7, -67, 46, -39};
    public final int a;
    public boolean b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object[] h;
    public final Object i;
    public Object j;

    public fs3(kk4 kk4Var, ywf ywfVar, Rect rect, boolean z) {
        new Rect();
        new Rect();
        this.c = kk4Var;
        this.d = ywfVar;
        GifImage gifImage = (GifImage) ywfVar.a;
        this.e = gifImage;
        int[] iArrF = gifImage.f();
        this.g = iArrF;
        kk4Var.getClass();
        int length = iArrF.length;
        for (int i = 0; i < length; i++) {
            if (iArrF[i] < 11) {
                iArrF[i] = 100;
            }
        }
        kk4 kk4Var2 = (kk4) this.c;
        int[] iArr = (int[]) this.g;
        kk4Var2.getClass();
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        this.a = i2;
        kk4 kk4Var3 = (kk4) this.c;
        int[] iArr2 = (int[]) this.g;
        kk4Var3.getClass();
        int[] iArr3 = new int[iArr2.length];
        int length2 = iArr2.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr3[i5] = i4;
            i4 += iArr2[i5];
        }
        this.f = d((GifImage) this.e, rect);
        this.b = z;
        this.h = new ye[((GifImage) this.e).e()];
        for (int i6 = 0; i6 < ((GifImage) this.e).e(); i6++) {
            ((ye[]) this.h)[i6] = ((GifImage) this.e).g(i6);
        }
        Paint paint = new Paint();
        this.i = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect d(GifImage gifImage, Rect rect) {
        return rect == null ? new Rect(0, 0, gifImage.k(), gifImage.h()) : new Rect(0, 0, Math.min(rect.width(), gifImage.k()), Math.min(rect.height(), gifImage.h()));
    }

    public void a(String str, hf5 hf5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strA = uwi.a((byte[]) this.f);
        String strA2 = uwi.a(((kc) ((hc[]) this.h)[hf5Var.ordinal()]).d);
        StringBuilder sbL = wy1.l("CLIENT_", str, " ", strA, " ");
        sbL.append(strA2);
        arrayList.add(sbL.toString());
        String strA3 = uwi.a((byte[]) this.f);
        String strA4 = uwi.a(((kc) ((hc[]) this.i)[hf5Var.ordinal()]).d);
        StringBuilder sbL2 = wy1.l("SERVER_", str, " ", strA3, " ");
        sbL2.append(strA4);
        arrayList.add(sbL2.toString());
        try {
            Files.write((Path) null, arrayList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            ((bh8) this.e).error("Writing secrets to file 'null' failed", e);
            this.b = false;
        }
    }

    public synchronized void b(byte[] bArr) {
        this.g = bArr;
        zzg zzgVar = (zzg) ((qje) this.d).b;
        byte[] bArrW = r5j.y().w(zzgVar.a == 1 ? l : zzgVar.b() ? m : k, (byte[]) this.g);
        ((bh8) this.e).secret("Initial secret", bArrW);
        ((hc[]) this.h)[0] = new kc(zzgVar, bArrW, 1, (bh8) this.e);
        ((hc[]) this.i)[0] = new kc(zzgVar, bArrW, 2, (bh8) this.e);
    }

    public void c(hf5 hf5Var, jbg jbgVar, zzg zzgVar) {
        kc kcVar;
        kc kcVar2;
        if (jbgVar == jbg.TLS_AES_128_GCM_SHA256) {
            kcVar = new kc(zzgVar, 1, (bh8) this.e, 0);
            kcVar2 = new kc(zzgVar, 2, (bh8) this.e, 0);
        } else if (jbgVar == jbg.TLS_AES_256_GCM_SHA384) {
            kcVar = new lc(zzgVar, 1, (bh8) this.e, 0);
            kcVar2 = new lc(zzgVar, 2, (bh8) this.e, 0);
        } else {
            if (jbgVar != jbg.TLS_CHACHA20_POLY1305_SHA256) {
                throw new IllegalStateException("unsupported cipher suite " + jbgVar);
            }
            kcVar = new kc(zzgVar, 1, (bh8) this.e, 1);
            kcVar2 = new kc(zzgVar, 2, (bh8) this.e, 1);
        }
        ((hc[]) this.h)[hf5Var.ordinal()] = kcVar;
        if (hf5Var != hf5.b) {
            ((hc[]) this.i)[hf5Var.ordinal()] = kcVar2;
        }
        kcVar.q = kcVar2;
        kcVar2.q = kcVar;
    }

    public synchronized hc e(hf5 hf5Var) {
        hc hcVar;
        try {
            hcVar = this.a == 1 ? ((hc[]) this.h)[hf5Var.ordinal()] : ((hc[]) this.i)[hf5Var.ordinal()];
            if (hcVar == null) {
                throw new MissingKeysException(hf5Var, ((boolean[]) this.j)[hf5Var.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hcVar;
    }

    public synchronized hc f(hf5 hf5Var) {
        hc hcVar;
        try {
            hcVar = this.a == 1 ? ((hc[]) this.i)[hf5Var.ordinal()] : ((hc[]) this.h)[hf5Var.ordinal()];
            if (hcVar == null) {
                throw new MissingKeysException(hf5Var, ((boolean[]) this.j)[hf5Var.ordinal()]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hcVar;
    }

    public synchronized Bitmap g(int i, int i2) {
        try {
            Bitmap bitmap = (Bitmap) this.j;
            if (bitmap != null && (bitmap.getWidth() < i || ((Bitmap) this.j).getHeight() < i2)) {
                synchronized (this) {
                    Bitmap bitmap2 = (Bitmap) this.j;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.j = null;
                    }
                }
            }
            if (((Bitmap) this.j) == null) {
                this.j = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            ((Bitmap) this.j).eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return (Bitmap) this.j;
    }

    public void h(Canvas canvas, int i) {
        GifFrame gifFrameD = ((GifImage) this.e).d(i);
        try {
            if (gifFrameD.d() > 0 && gifFrameD.c() > 0) {
                i(canvas, gifFrameD);
            }
        } finally {
            gifFrameD.a();
        }
    }

    public void i(Canvas canvas, GifFrame gifFrame) {
        int iD;
        int iC;
        int iE;
        int iF;
        if (this.b) {
            float fMax = Math.max(gifFrame.d() / Math.min(gifFrame.d(), canvas.getWidth()), gifFrame.c() / Math.min(gifFrame.c(), canvas.getHeight()));
            iD = (int) (gifFrame.d() / fMax);
            iC = (int) (gifFrame.c() / fMax);
            iE = (int) (gifFrame.e() / fMax);
            iF = (int) (gifFrame.f() / fMax);
        } else {
            iD = gifFrame.d();
            iC = gifFrame.c();
            iE = gifFrame.e();
            iF = gifFrame.f();
        }
        synchronized (this) {
            Bitmap bitmapG = g(iD, iC);
            this.j = bitmapG;
            gifFrame.g(iD, iC, bitmapG);
            canvas.save();
            canvas.translate(iE, iF);
            canvas.drawBitmap((Bitmap) this.j, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public void j(Canvas canvas, GifFrame gifFrame, ye yeVar, ye yeVar2) {
        Rect rect = (Rect) this.f;
        if (rect == null || rect.width() <= 0 || ((Rect) this.f).height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / ((Rect) this.f).width();
        if (yeVar2 != null && yeVar2.e == 2) {
            int iCeil = (int) Math.ceil(yeVar2.c * width);
            int iCeil2 = (int) Math.ceil(yeVar2.d * width);
            int iCeil3 = (int) Math.ceil(yeVar2.a * width);
            int iCeil4 = (int) Math.ceil(yeVar2.b * width);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), (Paint) this.i);
        }
        int iD = gifFrame.d();
        int iC = gifFrame.c();
        Rect rect2 = new Rect(0, 0, iD, iC);
        int i = (int) (iD * width);
        int i2 = (int) (iC * width);
        int iE = (int) (gifFrame.e() * width);
        int iF = (int) (gifFrame.f() * width);
        Rect rect3 = new Rect(iE, iF, i + iE, i2 + iF);
        synchronized (this) {
            Bitmap bitmapG = g(iD, iC);
            gifFrame.g(iD, iC, bitmapG);
            canvas.drawBitmap(bitmapG, rect2, rect3, (Paint) null);
        }
    }

    public fs3(qje qjeVar, bh8 bh8Var) {
        this.h = new hc[hf5.values().length];
        this.i = new hc[hf5.values().length];
        this.j = new boolean[hf5.values().length];
        this.d = qjeVar;
        this.a = 1;
        this.e = bh8Var;
    }
}
