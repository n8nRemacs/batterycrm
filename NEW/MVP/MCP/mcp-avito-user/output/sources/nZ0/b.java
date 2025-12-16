package NZ0;

import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11592a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11593b;

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    public static class a {
    }

    public /* synthetic */ b(boolean z12, boolean z13, h hVar) {
        this.f11592a = z12;
        this.f11593b = z13;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11592a == bVar.f11592a && this.f11593b == bVar.f11593b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11592a), Boolean.valueOf(this.f11593b)});
    }
}
