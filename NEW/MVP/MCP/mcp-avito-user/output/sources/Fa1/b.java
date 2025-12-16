package Fa1;

import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4791a;

    public b(String str) {
        this.f4791a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f4791a, ((b) obj).f4791a);
    }

    public final int hashCode() {
        return this.f4791a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("TextItem(text="), this.f4791a, ')');
    }
}
