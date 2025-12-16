package nx0;

import X41.g;
import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RawJson.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lnx0/a;", "", "value", "", "_avito_socket-events_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44487a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419250a;

    private /* synthetic */ C44487a(String str) {
        this.f419250a = str;
    }

    public static final /* synthetic */ C44487a a(String str) {
        return new C44487a(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C44487a) {
            return L.f(this.f419250a, ((C44487a) obj).f419250a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f419250a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("RawJson(value="), this.f419250a, ')');
    }
}
