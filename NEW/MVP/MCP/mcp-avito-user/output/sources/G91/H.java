package g91;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: SendTextMessageRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lg91/H;", "", "", "channelId", "", "chunkIndex", "idempotencyKey", "quoteMessageId", SearchParamsConverterKt.SOURCE, "text", "xHash", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getChunkIndex", "()Ljava/lang/Long;", "getIdempotencyKey", "getQuoteMessageId", "getSource", "getText", "getXHash", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class H {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("chunkIndex")
    @Y61.l
    private final Long chunkIndex;

    @com.google.gson.annotations.c("idempotencyKey")
    @Y61.k
    private final String idempotencyKey;

    @com.google.gson.annotations.c("quoteMessageId")
    @Y61.l
    private final String quoteMessageId;

    @com.google.gson.annotations.c(SearchParamsConverterKt.SOURCE)
    @Y61.l
    private final String source;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c("xHash")
    @Y61.l
    private final String xHash;

    public H(@Y61.k String str, @Y61.l Long l12, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5, @Y61.l String str6) {
        this.channelId = str;
        this.chunkIndex = l12;
        this.idempotencyKey = str2;
        this.quoteMessageId = str3;
        this.source = str4;
        this.text = str5;
        this.xHash = str6;
    }
}
