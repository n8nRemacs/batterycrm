package bC0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: AdvanceInfo.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LbC0/a;", "", "", "value", "minValue", "", "minValueMessage", ChannelContext.Item.PLACEHOLDER, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "I", "d", "()I", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25492a {

    @com.google.gson.annotations.c("minValue")
    private final int minValue;

    @com.google.gson.annotations.c("minValueMessage")
    @k
    private final String minValueMessage;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @com.google.gson.annotations.c("value")
    private final int value;

    public C25492a(int i12, int i13, @k String str, @k String str2) {
        this.value = i12;
        this.minValue = i13;
        this.minValueMessage = str;
        this.placeholder = str2;
    }

    /* renamed from: a, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMinValueMessage() {
        return this.minValueMessage;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: d, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
