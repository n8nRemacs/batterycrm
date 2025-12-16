package androidx.privacysandbox.ads.adservices.appsetid;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AppSetId.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/a;", "", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f53510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53511b;

    /* compiled from: AppSetId.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/a$a;", "", "<init>", "()V", "", "SCOPE_APP", "I", "SCOPE_DEVELOPER", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.appsetid.a$a, reason: collision with other inner class name */
    public static final class C1886a {
        public /* synthetic */ C1886a(C42822w c42822w) {
            this();
        }

        public C1886a() {
        }
    }

    static {
        new C1886a(null);
    }

    public a(@k String str, int i12) {
        this.f53510a = str;
        this.f53511b = i12;
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f53510a, aVar.f53510a) && this.f53511b == aVar.f53511b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53511b) + (this.f53510a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return G.g(new StringBuilder("AppSetId: id="), this.f53510a, ", scope=", this.f53511b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
