package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nla {
    public String B;
    public final boolean E;
    public final Notification F;
    public boolean G;
    public final ArrayList H;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean m;
    public bma n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    public String v;
    public Bundle w;
    public String z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean l = true;
    public boolean u = false;
    public int x = 0;
    public int y = 0;
    public int A = 0;
    public int C = 0;
    public int D = 0;

    public nla(Context context, String str) {
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.z = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.H = new ArrayList();
        this.E = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        ggg gggVar = new ggg(this);
        nla nlaVar = (nla) gggVar.X;
        bma bmaVar = nlaVar.n;
        if (bmaVar != null) {
            bmaVar.b(gggVar);
        }
        Notification notificationBuild = ((Notification.Builder) gggVar.o).build();
        if (bmaVar != null) {
            nlaVar.n.getClass();
        }
        if (bmaVar != null && (bundle = notificationBuild.extras) != null) {
            bmaVar.a(bundle);
        }
        return notificationBuild;
    }

    public final Bundle b() {
        if (this.w == null) {
            this.w = new Bundle();
        }
        return this.w;
    }

    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void e(int i) {
        Notification notification = this.F;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void f(int i, boolean z) {
        Notification notification = this.F;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void g(Bitmap bitmap) {
        IconCompat iconCompatB;
        if (bitmap == null) {
            iconCompatB = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(zvc.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(zvc.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            iconCompatB = IconCompat.b(bitmap);
        }
        this.i = iconCompatB;
    }

    public final void h(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = mla.a(mla.e(mla.c(mla.b(), 4), 5));
    }

    public final void i(bma bmaVar) {
        if (this.n != bmaVar) {
            this.n = bmaVar;
            if (bmaVar == null || ((nla) bmaVar.b) == this) {
                return;
            }
            bmaVar.b = this;
            i(bmaVar);
        }
    }
}
