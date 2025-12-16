package OZ0;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f12323a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final Executor f12324b;

    /* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f12325a = 0;
    }

    public /* synthetic */ b(int i12, Executor executor, e eVar) {
        this.f12323a = i12;
        this.f12324b = executor;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12323a == bVar.f12323a && C36727t.a(this.f12324b, bVar.f12324b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12323a), this.f12324b});
    }
}
