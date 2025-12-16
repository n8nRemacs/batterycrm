package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import j.InterfaceC42164u;
import j.X;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes.dex */
class b {

    /* compiled from: ConcurrencyHelpers.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
