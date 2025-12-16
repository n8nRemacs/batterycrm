package Ux0;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingSections.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUx0/a;", "", "", "enabled", "<init>", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ux0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15583a {

    @com.google.gson.annotations.c("enabled")
    @l
    private final Boolean enabled;

    public C15583a(@l Boolean bool) {
        this.enabled = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15583a) && L.f(this.enabled, ((C15583a) obj).enabled);
    }

    public final int hashCode() {
        Boolean bool = this.enabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public final String toString() {
        return C0.g(new StringBuilder("EventBusUpdate(enabled="), this.enabled, ')');
    }
}
