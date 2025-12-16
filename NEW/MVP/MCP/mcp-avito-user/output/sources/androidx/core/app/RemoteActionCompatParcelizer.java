package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

@RestrictTo
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objO = remoteActionCompat.f44515a;
        if (versionedParcel.j(1)) {
            objO = versionedParcel.o();
        }
        remoteActionCompat.f44515a = (IconCompat) objO;
        CharSequence charSequenceI = remoteActionCompat.f44516b;
        if (versionedParcel.j(2)) {
            charSequenceI = versionedParcel.i();
        }
        remoteActionCompat.f44516b = charSequenceI;
        CharSequence charSequenceI2 = remoteActionCompat.f44517c;
        if (versionedParcel.j(3)) {
            charSequenceI2 = versionedParcel.i();
        }
        remoteActionCompat.f44517c = charSequenceI2;
        Parcelable parcelableM = remoteActionCompat.f44518d;
        if (versionedParcel.j(4)) {
            parcelableM = versionedParcel.m();
        }
        remoteActionCompat.f44518d = (PendingIntent) parcelableM;
        boolean zG2 = remoteActionCompat.f44519e;
        if (versionedParcel.j(5)) {
            zG2 = versionedParcel.g();
        }
        remoteActionCompat.f44519e = zG2;
        boolean zG3 = remoteActionCompat.f44520f;
        if (versionedParcel.j(6)) {
            zG3 = versionedParcel.g();
        }
        remoteActionCompat.f44520f = zG3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.q(false, false);
        IconCompat iconCompat = remoteActionCompat.f44515a;
        versionedParcel.p(1);
        versionedParcel.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.f44516b;
        versionedParcel.p(2);
        versionedParcel.t(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f44517c;
        versionedParcel.p(3);
        versionedParcel.t(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f44518d;
        versionedParcel.p(4);
        versionedParcel.w(pendingIntent);
        boolean z12 = remoteActionCompat.f44519e;
        versionedParcel.p(5);
        versionedParcel.r(z12);
        boolean z13 = remoteActionCompat.f44520f;
        versionedParcel.p(6);
        versionedParcel.r(z13);
    }
}
