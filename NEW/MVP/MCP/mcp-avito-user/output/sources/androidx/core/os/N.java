package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import j.X;

/* compiled from: UserManagerCompat.java */
/* loaded from: classes.dex */
public class N {

    /* compiled from: UserManagerCompat.java */
    @X
    public static class a {
    }

    public static boolean a(@j.N Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
