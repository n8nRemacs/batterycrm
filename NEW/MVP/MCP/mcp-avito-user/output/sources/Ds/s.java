package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lds/s;", "", "Lds/f;", "inputSheet", "", "maxInput", "minInput", "", ChannelContext.Item.PLACEHOLDER, "selectedValue", "Lds/t;", "title", "", "Lds/u;", "values", "<init>", "(Lds/f;JJLjava/lang/String;Ljava/lang/Long;Lds/t;Ljava/util/List;)V", "Lds/f;", "a", "()Lds/f;", "J", "b", "()J", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "Lds/t;", "f", "()Lds/t;", "Ljava/util/List;", "g", "()Ljava/util/List;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s {

    @com.google.gson.annotations.c("inputSheet")
    @Y61.k
    private final C39798f inputSheet;

    @com.google.gson.annotations.c("maxInput")
    private final long maxInput;

    @com.google.gson.annotations.c("minInput")
    private final long minInput;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.l
    private final String placeholder;

    @com.google.gson.annotations.c("selectedValue")
    @Y61.l
    private final Long selectedValue;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final t title;

    @com.google.gson.annotations.c("values")
    @Y61.k
    private final List<u> values;

    public s(@Y61.k C39798f c39798f, long j12, long j13, @Y61.l String str, @Y61.l Long l12, @Y61.l t tVar, @Y61.k List<u> list) {
        this.inputSheet = c39798f;
        this.maxInput = j12;
        this.minInput = j13;
        this.placeholder = str;
        this.selectedValue = l12;
        this.title = tVar;
        this.values = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C39798f getInputSheet() {
        return this.inputSheet;
    }

    /* renamed from: b, reason: from getter */
    public final long getMaxInput() {
        return this.maxInput;
    }

    /* renamed from: c, reason: from getter */
    public final long getMinInput() {
        return this.minInput;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Long getSelectedValue() {
        return this.selectedValue;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final t getTitle() {
        return this.title;
    }

    @Y61.k
    public final List<u> g() {
        return this.values;
    }
}
