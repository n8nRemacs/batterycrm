package ca1;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* renamed from: ca1.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27145k extends AbstractC27149o {

    /* renamed from: a, reason: collision with root package name */
    public final List f57949a;

    public C27145k(List list) {
        super(0);
        this.f57949a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27145k) && L.f(this.f57949a, ((C27145k) obj).f57949a);
    }

    public final int hashCode() {
        return this.f57949a.hashCode();
    }

    public final String toString() {
        return H.p(new StringBuilder("Data(items="), this.f57949a, ')');
    }
}
