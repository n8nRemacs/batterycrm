package NZ0;

import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.internal.mlkit_common.zzy;
import com.google.android.gms.internal.mlkit_common.zzz;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public abstract class f {
    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        return C36727t.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }

    @N
    public final String toString() {
        zzy zzyVarZzb = zzz.zzb("RemoteModelSource");
        zzyVarZzb.zza("firebaseModelName", null);
        return zzyVarZzb.toString();
    }
}
