package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQ80/g;", "", "", "Lcom/avito/android/remote/model/text/AttributedText;", "lineY", "", "maxValue", "<init>", "(Ljava/util/List;J)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    @com.google.gson.annotations.c("lineY")
    @Y61.k
    private final List<AttributedText> lineY;

    @com.google.gson.annotations.c("maxValue")
    private final long maxValue;

    public g(@Y61.k List<AttributedText> list, long j12) {
        this.lineY = list;
        this.maxValue = j12;
    }

    @Y61.k
    public final List<AttributedText> a() {
        return this.lineY;
    }

    /* renamed from: b, reason: from getter */
    public final long getMaxValue() {
        return this.maxValue;
    }
}
