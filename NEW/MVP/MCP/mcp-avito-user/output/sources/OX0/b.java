package OX0;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public interface b extends com.google.android.gms.common.api.j<k> {
    @N
    @Deprecated
    Task<SavePasswordResult> savePassword(@N SavePasswordRequest savePasswordRequest);
}
