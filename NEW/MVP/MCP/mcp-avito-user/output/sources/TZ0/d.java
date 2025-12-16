package TZ0;

import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.Task;
import j.N;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public interface d extends VZ0.a<List<a>>, k {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    void close();

    @N
    Task<List<a>> gQ(@N com.google.mlkit.vision.common.a aVar);
}
