package UB0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiTariffCpxInfoV4Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LUB0/s;", "", "", "groupSlug", "", "isActive", "title", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "c", "()Z", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    @com.google.gson.annotations.c("groupSlug")
    @Y61.l
    private final String groupSlug;

    @com.google.gson.annotations.c("isActive")
    private final boolean isActive;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public s(@Y61.l String str, boolean z12, @Y61.k String str2) {
        this.groupSlug = str;
        this.isActive = z12;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getGroupSlug() {
        return this.groupSlug;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }
}
