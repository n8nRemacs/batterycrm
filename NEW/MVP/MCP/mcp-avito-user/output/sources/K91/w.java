package K91;

import android.os.Bundle;
import androidx.compose.foundation.H;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class w extends x {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f9330a;

    public w(Bundle bundle) {
        super(0);
        this.f9330a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && L.f(this.f9330a, ((w) obj).f9330a);
    }

    public final int hashCode() {
        return this.f9330a.hashCode();
    }

    public final String toString() {
        return H.m(new StringBuilder("Success(result="), this.f9330a, ')');
    }
}
