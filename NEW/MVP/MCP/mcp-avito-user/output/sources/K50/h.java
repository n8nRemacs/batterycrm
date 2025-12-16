package K50;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: PassportEnabledResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LK50/h;", "", "", "enabled", "isMultiPassport", "<init>", "(ZZ)V", "Z", "a", "()Z", "b", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("enabled")
    private final boolean enabled;

    @com.google.gson.annotations.c("isMultiprofileTextsEnabled")
    private final boolean isMultiPassport;

    public h(boolean z12, boolean z13) {
        this.enabled = z12;
        this.isMultiPassport = z13;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsMultiPassport() {
        return this.isMultiPassport;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.enabled == hVar.enabled && this.isMultiPassport == hVar.isMultiPassport;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMultiPassport) + (Boolean.hashCode(this.enabled) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportEnabledResult(enabled=");
        sb2.append(this.enabled);
        sb2.append(", isMultiPassport=");
        return r.x(sb2, this.isMultiPassport, ')');
    }
}
