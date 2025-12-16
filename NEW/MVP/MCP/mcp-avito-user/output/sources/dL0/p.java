package Dl0;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: MainShortVideosOnAppV3Response.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0016\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"LDl0/p;", "", "", "id", "LDl0/q;", "infoPanel", "", "previewUrl", "shareUrl", "LDl0/l;", "status", "", "thumbnail", "videoUrl", "<init>", "(Ljava/lang/Long;LDl0/q;Ljava/lang/String;Ljava/lang/String;LDl0/l;Ljava/util/Map;Ljava/lang/String;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "LDl0/q;", "getInfoPanel", "()LDl0/q;", "Ljava/lang/String;", "getPreviewUrl", "()Ljava/lang/String;", "getShareUrl", "LDl0/l;", "getStatus", "()LDl0/l;", "Ljava/util/Map;", "getThumbnail", "()Ljava/util/Map;", "getVideoUrl", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final Long id;

    @com.google.gson.annotations.c("infoPanel")
    @Y61.l
    private final q infoPanel;

    @com.google.gson.annotations.c("previewUrl")
    @Y61.l
    private final String previewUrl;

    @com.google.gson.annotations.c("shareUrl")
    @Y61.l
    private final String shareUrl;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final l status;

    @com.google.gson.annotations.c("thumbnail")
    @Y61.l
    private final Map<String, String> thumbnail;

    @com.google.gson.annotations.c("videoUrl")
    @Y61.l
    private final String videoUrl;

    public p(@Y61.l Long l12, @Y61.l q qVar, @Y61.l String str, @Y61.l String str2, @Y61.l l lVar, @Y61.l Map<String, String> map, @Y61.l String str3) {
        this.id = l12;
        this.infoPanel = qVar;
        this.previewUrl = str;
        this.shareUrl = str2;
        this.status = lVar;
        this.thumbnail = map;
        this.videoUrl = str3;
    }
}
