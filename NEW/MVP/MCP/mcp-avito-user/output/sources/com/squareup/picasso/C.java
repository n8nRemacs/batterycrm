package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import j.N;
import j.P;
import okio.e0;

/* compiled from: RequestHandler.java */
/* loaded from: classes7.dex */
public abstract class C {
    public static void a(int i12, int i13, int i14, int i15, BitmapFactory.Options options, A a12) {
        int iMax;
        double dFloor;
        if (i15 > i13 || i14 > i12) {
            if (i13 == 0) {
                dFloor = Math.floor(i14 / i12);
            } else if (i12 == 0) {
                dFloor = Math.floor(i15 / i13);
            } else {
                int iFloor = (int) Math.floor(i15 / i13);
                int iFloor2 = (int) Math.floor(i14 / i12);
                iMax = a12.f366297i ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(A a12) {
        boolean zA2 = a12.a();
        Bitmap.Config config = a12.f366304p;
        boolean z12 = config != null;
        boolean z13 = a12.f366303o;
        if (!zA2 && !z12 && !z13) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zA2;
        options.inInputShareable = z13;
        options.inPurgeable = z13;
        if (z12) {
            options.inPreferredConfig = config;
        }
        return options;
    }

    public abstract boolean b(A a12);

    public int d() {
        return 0;
    }

    @P
    public abstract a e(A a12, int i12);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }

    /* compiled from: RequestHandler.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Picasso.LoadedFrom f366326a;

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f366327b;

        /* renamed from: c, reason: collision with root package name */
        public final e0 f366328c;

        /* renamed from: d, reason: collision with root package name */
        public final int f366329d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@N e0 e0Var, @N Picasso.LoadedFrom loadedFrom) {
            this(null, e0Var, loadedFrom, 0);
            StringBuilder sb2 = K.f366360a;
            if (e0Var == null) {
                throw new NullPointerException("source == null");
            }
        }

        public a(@P Bitmap bitmap, @P e0 e0Var, @N Picasso.LoadedFrom loadedFrom, int i12) {
            if ((bitmap != null) != (e0Var != null)) {
                this.f366327b = bitmap;
                this.f366328c = e0Var;
                StringBuilder sb2 = K.f366360a;
                this.f366326a = loadedFrom;
                this.f366329d = i12;
                return;
            }
            throw new AssertionError();
        }
    }
}
