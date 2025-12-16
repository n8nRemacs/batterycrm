package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23638w;
import androidx.work.InterfaceC23639x;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.UUID;

/* compiled from: RemoteForegroundUpdater.java */
@RestrictTo
/* loaded from: classes10.dex */
public class p implements InterfaceC23639x {
    @Override // androidx.work.InterfaceC23639x
    @N
    public final D0<Void> a(@N Context context, @N UUID uuid, @N C23638w c23638w) {
        return t.a(context).b(uuid.toString(), c23638w);
    }
}
