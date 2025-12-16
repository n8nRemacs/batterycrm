package androidx.work.multiprocess;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.C23638w;
import androidx.work.impl.Y;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.UUID;

/* compiled from: RemoteWorkManager.java */
/* loaded from: classes10.dex */
public abstract class t {
    @RestrictTo
    public t() {
    }

    @N
    public static t a(@N Context context) {
        Y yF2 = Y.f(context);
        if (yF2.f55566k == null) {
            synchronized (Y.f55556o) {
                try {
                    if (yF2.f55566k == null) {
                        try {
                            androidx.camera.core.processing.j jVar = RemoteWorkManagerClient.f56113i;
                            yF2.f55566k = (t) RemoteWorkManagerClient.class.getConstructor(Context.class, Y.class).newInstance(yF2.f55557b, yF2);
                        } catch (Throwable unused) {
                            androidx.work.G.a().getClass();
                        }
                        if (yF2.f55566k == null && !TextUtils.isEmpty(yF2.f55558c.f55456j)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        t tVar = yF2.f55566k;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @N
    @RestrictTo
    public abstract D0<Void> b(@N String str, @N C23638w c23638w);

    @N
    @RestrictTo
    public abstract D0<Void> c(@N UUID uuid, @N C23544h c23544h);
}
