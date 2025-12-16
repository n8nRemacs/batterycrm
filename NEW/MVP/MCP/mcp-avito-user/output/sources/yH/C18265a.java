package Yh;

import X41.g;
import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContainerPayload.kt */
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LYh/a;", "", "value", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18265a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19610a;

    private /* synthetic */ C18265a(String str) {
        this.f19610a = str;
    }

    public static final /* synthetic */ C18265a a(String str) {
        return new C18265a(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18265a) {
            return L.f(this.f19610a, ((C18265a) obj).f19610a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19610a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("BeduinModelId(value="), this.f19610a, ')');
    }
}
