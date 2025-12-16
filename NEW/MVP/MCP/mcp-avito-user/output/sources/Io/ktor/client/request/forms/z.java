package io.ktor.client.request.forms;

import androidx.media3.common.C23088b;
import io.ktor.http.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: formDsl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/client/request/forms/z;", "", "T", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class z<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f399746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f399747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T f399748c;

    public z() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(String str, Object obj, T t12, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            T.f399899a.getClass();
            t12 = T.a.f399901b;
        }
        this.f399746a = str;
        this.f399747b = obj;
        this.f399748c = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f399746a, zVar.f399746a) && L.f(this.f399747b, zVar.f399747b) && L.f(this.f399748c, zVar.f399748c);
    }

    public final int hashCode() {
        return this.f399748c.hashCode() + C23088b.a(this.f399746a.hashCode() * 31, 31, this.f399747b);
    }

    @Y61.k
    public final String toString() {
        return "FormPart(key=" + this.f399746a + ", value=" + this.f399747b + ", headers=" + this.f399748c + ')';
    }
}
