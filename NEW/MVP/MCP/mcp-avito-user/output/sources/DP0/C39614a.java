package dP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WalletPinClickstreamEvent.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LdP0/a;", "", "", "id", "version", "", "", "params", "", "hasSensitiveData", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39614a {

    @c("hasSensitiveData")
    @l
    private final Boolean hasSensitiveData;

    @c("id")
    @l
    private final Integer id;

    @c("params")
    @l
    private final Map<String, Object> params;

    @c("version")
    @l
    private final Integer version;

    public C39614a(@l Integer num, @l Integer num2, @l Map<String, ? extends Object> map, @l Boolean bool) {
        this.id = num;
        this.version = num2;
        this.params = map;
        this.hasSensitiveData = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @l
    public final Map<String, Object> c() {
        return this.params;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }
}
