package R80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LR80/g;", "", "", "currentCount", "deltaCount", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    @com.google.gson.annotations.c("currentCount")
    @k
    private final String currentCount;

    @com.google.gson.annotations.c("deltaCount")
    @l
    private final String deltaCount;

    @com.google.gson.annotations.c("iconName")
    @k
    private final String iconName;

    public g(@k String str, @l String str2, @k String str3) {
        this.currentCount = str;
        this.deltaCount = str2;
        this.iconName = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCurrentCount() {
        return this.currentCount;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDeltaCount() {
        return this.deltaCount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }
}
