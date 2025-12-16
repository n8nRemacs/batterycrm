package os;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Los/c;", "", "Los/m;", "icon", "", "isSelectAutoType", "", "Los/x;", "segments", "", "title", "<init>", "(Los/m;ZLjava/util/List;Ljava/lang/String;)V", "Los/m;", "a", "()Los/m;", "Z", "d", "()Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final m icon;

    @com.google.gson.annotations.c("isSelectAutoType")
    private final boolean isSelectAutoType;

    @com.google.gson.annotations.c("segments")
    @Y61.k
    private final List<x> segments;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public c(@Y61.l m mVar, boolean z12, @Y61.k List<x> list, @Y61.k String str) {
        this.icon = mVar;
        this.isSelectAutoType = z12;
        this.segments = list;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final m getIcon() {
        return this.icon;
    }

    @Y61.k
    public final List<x> b() {
        return this.segments;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSelectAutoType() {
        return this.isSelectAutoType;
    }
}
