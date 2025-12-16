package ZJ0;

import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LZJ0/f;", "", "", "platformDynamics", "", "platformDynamicsABGroup", "platformSpendings", "<init>", "(ZLjava/lang/String;Z)V", "Z", "a", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    @com.google.gson.annotations.c("platformDynamics")
    private final boolean platformDynamics;

    @com.google.gson.annotations.c("platformDynamicsABGroup")
    @Y61.l
    private final String platformDynamicsABGroup;

    @com.google.gson.annotations.c("platformSpendings")
    private final boolean platformSpendings;

    public f(boolean z12, @Y61.l String str, boolean z13) {
        this.platformDynamics = z12;
        this.platformDynamicsABGroup = str;
        this.platformSpendings = z13;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPlatformDynamics() {
        return this.platformDynamics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getPlatformDynamicsABGroup() {
        return this.platformDynamicsABGroup;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPlatformSpendings() {
        return this.platformSpendings;
    }
}
