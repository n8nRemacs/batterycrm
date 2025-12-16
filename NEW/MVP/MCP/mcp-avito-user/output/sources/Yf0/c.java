package YF0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"LYF0/c;", "", "", "step", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "value", "valueMax", "valueMin", "", "valuePrefix", "", "LYF0/d;", "valueRanges", "valueSuffix", "<init>", "(JLcom/avito/android/remote/model/text/AttributedText;JJJLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "J", "a", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "d", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "g", "()Ljava/util/List;", "h", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("step")
    private final long step;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("value")
    private final long value;

    @com.google.gson.annotations.c("valueMax")
    private final long valueMax;

    @com.google.gson.annotations.c("valueMin")
    private final long valueMin;

    @com.google.gson.annotations.c("valuePrefix")
    @Y61.l
    private final String valuePrefix;

    @com.google.gson.annotations.c("valueRanges")
    @Y61.k
    private final List<d> valueRanges;

    @com.google.gson.annotations.c("valueSuffix")
    @Y61.k
    private final String valueSuffix;

    public c(long j12, @Y61.k AttributedText attributedText, long j13, long j14, long j15, @Y61.l String str, @Y61.k List<d> list, @Y61.k String str2) {
        this.step = j12;
        this.title = attributedText;
        this.value = j13;
        this.valueMax = j14;
        this.valueMin = j15;
        this.valuePrefix = str;
        this.valueRanges = list;
        this.valueSuffix = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: d, reason: from getter */
    public final long getValueMax() {
        return this.valueMax;
    }

    /* renamed from: e, reason: from getter */
    public final long getValueMin() {
        return this.valueMin;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getValuePrefix() {
        return this.valuePrefix;
    }

    @Y61.k
    public final List<d> g() {
        return this.valueRanges;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getValueSuffix() {
        return this.valueSuffix;
    }
}
