package nb1;

import X41.g;
import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

@g
/* renamed from: nb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44374a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f415216a;

    public final boolean equals(Object obj) {
        if (obj instanceof C44374a) {
            if (L.f(this.f415216a, ((C44374a) obj).f415216a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f415216a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("PushToken(value="), this.f415216a, ')');
    }
}
