package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.T;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.UUID;

/* compiled from: RemoteProgressUpdater.java */
@RestrictTo
/* loaded from: classes10.dex */
public class q implements T {
    @Override // androidx.work.T
    @N
    public final D0<Void> a(@N Context context, @N UUID uuid, @N C23544h c23544h) {
        return t.a(context).c(uuid, c23544h);
    }
}
