package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.e0h;
import defpackage.f0h;
import defpackage.g0h;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e0h e0hVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        g0h g0hVarH = remoteActionCompat.a;
        boolean z = true;
        if (e0hVar.e(1)) {
            g0hVarH = e0hVar.h();
        }
        remoteActionCompat.a = (IconCompat) g0hVarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (e0hVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f0h) e0hVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (e0hVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f0h) e0hVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) e0hVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (e0hVar.e(5)) {
            z2 = ((f0h) e0hVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!e0hVar.e(6)) {
            z = z3;
        } else if (((f0h) e0hVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e0h e0hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0hVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        e0hVar.i(1);
        e0hVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        e0hVar.i(2);
        Parcel parcel = ((f0h) e0hVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        e0hVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        e0hVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        e0hVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        e0hVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
