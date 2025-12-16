package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lds/c;", "", "", "hint", "Lds/f;", "inputSheet", "", "maxInput", "minInput", ChannelContext.Item.PLACEHOLDER, "placeholderDisabled", "selectedValue", "Lds/d;", "title", "<init>", "(Ljava/lang/String;Lds/f;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lds/d;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lds/f;", "b", "()Lds/f;", "J", "c", "()J", "d", "e", "f", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "Lds/d;", "h", "()Lds/d;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ds.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39795c {

    @com.google.gson.annotations.c("hint")
    @Y61.k
    private final String hint;

    @com.google.gson.annotations.c("inputSheet")
    @Y61.k
    private final C39798f inputSheet;

    @com.google.gson.annotations.c("maxInput")
    private final long maxInput;

    @com.google.gson.annotations.c("minInput")
    private final long minInput;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.k
    private final String placeholder;

    @com.google.gson.annotations.c("placeholderDisabled")
    @Y61.k
    private final String placeholderDisabled;

    @com.google.gson.annotations.c("selectedValue")
    @Y61.l
    private final Long selectedValue;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final C39796d title;

    public C39795c(@Y61.k String str, @Y61.k C39798f c39798f, long j12, long j13, @Y61.k String str2, @Y61.k String str3, @Y61.l Long l12, @Y61.k C39796d c39796d) {
        this.hint = str;
        this.inputSheet = c39798f;
        this.maxInput = j12;
        this.minInput = j13;
        this.placeholder = str2;
        this.placeholderDisabled = str3;
        this.selectedValue = l12;
        this.title = c39796d;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C39798f getInputSheet() {
        return this.inputSheet;
    }

    /* renamed from: c, reason: from getter */
    public final long getMaxInput() {
        return this.maxInput;
    }

    /* renamed from: d, reason: from getter */
    public final long getMinInput() {
        return this.minInput;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getPlaceholderDisabled() {
        return this.placeholderDisabled;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Long getSelectedValue() {
        return this.selectedValue;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final C39796d getTitle() {
        return this.title;
    }
}
