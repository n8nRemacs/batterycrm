package iB0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceManualResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LiB0/a;", "", "", "minValue", "", "minValueMessage", ChannelContext.Item.PLACEHOLDER, "currency", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41265a {

    @com.google.gson.annotations.c("currency")
    @l
    private final String currency;

    @com.google.gson.annotations.c("minValue")
    @l
    private final Integer minValue;

    @com.google.gson.annotations.c("minValueMessage")
    @l
    private final String minValueMessage;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    public C41265a(@l Integer num, @l String str, @l String str2, @l String str3) {
        this.minValue = num;
        this.minValueMessage = str;
        this.placeholder = str2;
        this.currency = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Integer getMinValue() {
        return this.minValue;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getMinValueMessage() {
        return this.minValueMessage;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }
}
