package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class gvi {
    public static int a(Context context) {
        int iA;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int i = point.x;
        int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        try {
            iA = daj.a();
        } catch (Exception e) {
            Log.d("EglUtils", "getMaxTextureSize: ", e);
            iA = 0;
        }
        if (iA > 0) {
            iSqrt = Math.min(iSqrt, iA);
        }
        u45.o(iSqrt, "maxBitmapSize: ", "BitmapLoadUtils");
        return iSqrt;
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ArrayList c(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoH = f5.h(it.next());
            if (mediaRoute2InfoH != null) {
                arrayList.add(mediaRoute2InfoH.getId());
            }
        }
        return arrayList;
    }

    public static h59 d(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info != null) {
            hc8 hc8Var = new hc8(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            Bundle bundle = (Bundle) hc8Var.b;
            bundle.putInt("connectionState", mediaRoute2Info.getConnectionState());
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                bundle.putInt("deviceType", extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    hc8Var.q(parcelableArrayList);
                }
                return hc8Var.v();
            }
        }
        return null;
    }

    public static void e(int i, int i2) {
        String strC;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strC = ivi.c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(ho7.f(i2, "negative size: "));
                }
                strC = ivi.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? g(i, i3, "start index") : (i2 < 0 || i2 > i3) ? g(i2, i3, "end index") : ivi.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String g(int i, int i2, String str) {
        if (i < 0) {
            return ivi.c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ivi.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(ho7.f(i2, "negative size: "));
    }
}
