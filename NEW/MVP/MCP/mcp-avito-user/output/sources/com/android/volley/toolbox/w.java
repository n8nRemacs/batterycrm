package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.w;
import j.P;

/* compiled from: ImageRequest.java */
/* loaded from: classes10.dex */
public class w extends Request<Bitmap> {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f67146s = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final Object f67147p;

    /* renamed from: q, reason: collision with root package name */
    @j.B
    @P
    public final w.b<Bitmap> f67148q;

    /* renamed from: r, reason: collision with root package name */
    public final Bitmap.Config f67149r;

    public w(String str, w.b bVar, ImageView.ScaleType scaleType, Bitmap.Config config, @P w.a aVar) {
        super(0, str, aVar);
        this.f67147p = new Object();
        this.f67036m = new com.android.volley.m(2.0f, 1000, 2);
        this.f67148q = bVar;
        this.f67149r = config;
    }

    @Override // com.android.volley.Request
    public final Request.Priority j() {
        return Request.Priority.f67039b;
    }

    @Override // com.android.volley.Request
    public final com.android.volley.w<Bitmap> m(com.android.volley.r rVar) {
        com.android.volley.w<Bitmap> wVarP;
        synchronized (f67146s) {
            try {
                try {
                    wVarP = p(rVar);
                } catch (OutOfMemoryError e12) {
                    com.android.volley.z.a("Caught OOM for %d byte image, url=%s", Integer.valueOf(rVar.f67100b.length), this.f67027d);
                    return new com.android.volley.w<>(new ParseError(e12));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVarP;
    }

    @Override // com.android.volley.Request
    /* renamed from: o */
    public void c(Bitmap bitmap) {
        w.b<Bitmap> bVar;
        synchronized (this.f67147p) {
            bVar = this.f67148q;
        }
        if (bVar != null) {
            bVar.b(bitmap);
        }
    }

    public final com.android.volley.w<Bitmap> p(com.android.volley.r rVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.f67149r;
        byte[] bArr = rVar.f67100b;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return bitmapDecodeByteArray == null ? new com.android.volley.w<>(new ParseError(rVar)) : new com.android.volley.w<>(bitmapDecodeByteArray, n.b(rVar));
    }
}
