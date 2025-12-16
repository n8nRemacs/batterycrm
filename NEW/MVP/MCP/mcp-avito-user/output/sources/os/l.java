package os;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Los/l;", "", "", "limitSet", "maxError", "minError", "minHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    @com.google.gson.annotations.c("limitSet")
    @Y61.l
    private final String limitSet;

    @com.google.gson.annotations.c("maxError")
    @Y61.l
    private final String maxError;

    @com.google.gson.annotations.c("minError")
    @Y61.l
    private final String minError;

    @com.google.gson.annotations.c("minHint")
    @Y61.l
    private final String minHint;

    public l(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.limitSet = str;
        this.maxError = str2;
        this.minError = str3;
        this.minHint = str4;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getLimitSet() {
        return this.limitSet;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getMaxError() {
        return this.maxError;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getMinError() {
        return this.minError;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getMinHint() {
        return this.minHint;
    }
}
