package w1;

import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b extends AbstractC49421a {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f441151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f441152c;

    public b() {
        super(0);
        this.f441151b = 204;
        this.f441152c = "Session ID was not found or was deleted";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f441151b, bVar.f441151b) && L.f(this.f441152c, bVar.f441152c);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f441152c;
    }

    public final int hashCode() {
        Integer num = this.f441151b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f441152c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SberIDServerException(httpCode=" + this.f441151b + ", message=" + this.f441152c + ")";
    }
}
