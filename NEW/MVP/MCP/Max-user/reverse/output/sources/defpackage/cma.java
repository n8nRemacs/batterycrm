package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class cma {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static Notification.Action.Builder d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    public static zka e(ArrayList<Parcelable> arrayList, int i) {
        pkd[] pkdVarArr;
        int i2;
        Notification.Action action = (Notification.Action) arrayList.get(i);
        RemoteInput[] remoteInputArrG = ala.g(action);
        if (remoteInputArrG == null) {
            pkdVarArr = null;
        } else {
            pkd[] pkdVarArr2 = new pkd[remoteInputArrG.length];
            for (int i3 = 0; i3 < remoteInputArrG.length; i3++) {
                RemoteInput remoteInput = remoteInputArrG[i3];
                pkdVarArr2[i3] = new pkd(ala.h(remoteInput), ala.f(remoteInput), ala.b(remoteInput), ala.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? fla.c(remoteInput) : 0, ala.d(remoteInput), null);
            }
            pkdVarArr = pkdVarArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z = ala.c(action).getBoolean("android.support.allowGeneratedReplies") || dla.a(action);
        boolean z2 = ala.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = i4 >= 28 ? ela.a(action) : ala.c(action).getInt("android.support.action.semanticAction", 0);
        boolean zE = i4 >= 29 ? fla.e(action) : false;
        boolean zA = i4 >= 31 ? gla.a(action) : false;
        if (cla.a(action) == null && (i2 = action.icon) != 0) {
            return new zka(i2 != 0 ? IconCompat.d(null, "", i2) : null, action.title, action.actionIntent, ala.c(action), pkdVarArr, null, z, iA, z2, zE, zA);
        }
        if (cla.a(action) != null) {
            Icon iconA = cla.a(action);
            PorterDuff.Mode mode = IconCompat.k;
            if (ob7.d(iconA) != 2 || ob7.b(iconA) != 0) {
                iconCompatA = ob7.a(iconA);
            }
        }
        return new zka(iconCompatA, action.title, action.actionIntent, ala.c(action), pkdVarArr, null, z, iA, z2, zE, zA);
    }
}
