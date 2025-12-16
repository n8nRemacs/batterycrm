package os;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Los/y;", "", "Los/m;", "icon", "", "isToggleEnabled", "", "toggleText", "<init>", "(Los/m;ZLjava/lang/String;)V", "Los/m;", "a", "()Los/m;", "Z", "c", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final m icon;

    @com.google.gson.annotations.c("isToggleEnabled")
    private final boolean isToggleEnabled;

    @com.google.gson.annotations.c("toggleText")
    @Y61.k
    private final String toggleText;

    public y(@Y61.l m mVar, boolean z12, @Y61.k String str) {
        this.icon = mVar;
        this.isToggleEnabled = z12;
        this.toggleText = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final m getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getToggleText() {
        return this.toggleText;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsToggleEnabled() {
        return this.isToggleEnabled;
    }
}
