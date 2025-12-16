package xL0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiVasVisualV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"LxL0/c;", "", "", "allowed", "", "description", "enabled", "", "externalId", "price", "registryId", "title", "<init>", "(ZLjava/lang/String;ZJJJLjava/lang/String;)V", "Z", "a", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "J", "d", "()J", "e", "f", "g", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("allowed")
    private final boolean allowed;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("enabled")
    private final boolean enabled;

    @com.google.gson.annotations.c("externalId")
    private final long externalId;

    @com.google.gson.annotations.c("price")
    private final long price;

    @com.google.gson.annotations.c("registryId")
    private final long registryId;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public c(boolean z12, @Y61.k String str, boolean z13, long j12, long j13, long j14, @Y61.k String str2) {
        this.allowed = z12;
        this.description = str;
        this.enabled = z13;
        this.externalId = j12;
        this.price = j13;
        this.registryId = j14;
        this.title = str2;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAllowed() {
        return this.allowed;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: d, reason: from getter */
    public final long getExternalId() {
        return this.externalId;
    }

    /* renamed from: e, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* renamed from: f, reason: from getter */
    public final long getRegistryId() {
        return this.registryId;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
