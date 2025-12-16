package qi;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqi/a;", "", "", "id", "version", "", "", "params", "", "hasSensitiveData", "<init>", "(IILjava/util/Map;Ljava/lang/Boolean;)V", "I", "b", "()I", "d", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47400a {

    @com.google.gson.annotations.c("hasSensitiveData")
    @l
    private final Boolean hasSensitiveData;

    @com.google.gson.annotations.c("id")
    private final int id;

    @com.google.gson.annotations.c("params")
    @l
    private final Map<String, String> params;

    @com.google.gson.annotations.c("version")
    private final int version;

    public C47400a(int i12, int i13, @l Map<String, String> map, @l Boolean bool) {
        this.id = i12;
        this.version = i13;
        this.params = map;
        this.hasSensitiveData = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    /* renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @l
    public final Map<String, String> c() {
        return this.params;
    }

    /* renamed from: d, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47400a)) {
            return false;
        }
        C47400a c47400a = (C47400a) obj;
        return this.id == c47400a.id && this.version == c47400a.version && L.f(this.params, c47400a.params) && L.f(this.hasSensitiveData, c47400a.hasSensitiveData);
    }

    public final int hashCode() {
        int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, String> map = this.params;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.hasSensitiveData;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", hasSensitiveData=");
        return C0.g(sb2, this.hasSensitiveData, ')');
    }
}
