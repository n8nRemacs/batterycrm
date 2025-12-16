package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class gaj {
    public static Bitmap a(Context context, int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = cab.a;
                break;
            case 1:
                i2 = cab.b;
                break;
            case 2:
                i2 = cab.m;
                break;
            case 3:
                i2 = cab.s;
                break;
            case 4:
                i2 = cab.t;
                break;
            case 5:
                i2 = cab.u;
                break;
            case 6:
                i2 = cab.v;
                break;
            case 7:
                i2 = cab.w;
                break;
            case 8:
                i2 = cab.x;
                break;
            case 9:
                i2 = cab.y;
                break;
            case 10:
                i2 = cab.c;
                break;
            case 11:
                i2 = cab.d;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                i2 = cab.e;
                break;
            case 13:
                i2 = cab.f;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                i2 = cab.g;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                i2 = cab.h;
                break;
            case 16:
                i2 = cab.i;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                i2 = cab.j;
                break;
            case 18:
                i2 = cab.k;
                break;
            case 19:
                i2 = cab.l;
                break;
            case 20:
                i2 = cab.n;
                break;
            case 21:
                i2 = cab.o;
                break;
            case 22:
                i2 = cab.p;
                break;
            case 23:
                i2 = cab.q;
                break;
            default:
                i2 = cab.r;
                break;
        }
        Drawable drawableA = eri.a(context, i2);
        if (drawableA instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableA).getBitmap();
        }
        return null;
    }

    public static final void b(esg esgVar) {
        esgVar.b(1, new a4e(15));
    }
}
