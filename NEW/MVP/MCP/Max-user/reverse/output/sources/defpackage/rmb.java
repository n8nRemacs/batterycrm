package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.GestureDetector;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class rmb {
    public static final nme a = new nme("HEAP_DUMP", 1);

    public static final or6 a(Context context, cm6 cm6Var) {
        GestureDetector gestureDetector = new GestureDetector(context, new pr6(0, cm6Var));
        gestureDetector.setIsLongpressEnabled(false);
        return new or6(gestureDetector, 0);
    }

    public static void b(int i, Collection collection) {
        boolean zContains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String strC = c(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(c(((Integer) it.next()).intValue()));
        }
        z5j.a(wy1.j("Effects target ", strC, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."), zContains);
    }

    public static String c(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static g0h d(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(rmb.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(Bundle bundle, g0h g0hVar) {
        if (g0hVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(g0hVar));
        bundle.putParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN, bundle2);
    }
}
