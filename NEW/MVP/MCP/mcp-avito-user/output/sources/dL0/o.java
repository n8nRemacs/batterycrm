package Dl0;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: MainShortVideosOnAppV3Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"LDl0/o;", "", "LDl0/d;", "item", "", "previewUrl", "shareUrl", "LDl0/l;", "status", "", "thumbnail", "videoUrl", "<init>", "(LDl0/d;Ljava/lang/String;Ljava/lang/String;LDl0/l;Ljava/util/Map;Ljava/lang/String;)V", "LDl0/d;", "a", "()LDl0/d;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "LDl0/l;", "d", "()LDl0/l;", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "f", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {

    @com.google.gson.annotations.c("item")
    @Y61.l
    private final d item;

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

    public o(@Y61.l d dVar, @Y61.l String str, @Y61.l String str2, @Y61.l l lVar, @Y61.l Map<String, String> map, @Y61.l String str3) {
        this.item = dVar;
        this.previewUrl = str;
        this.shareUrl = str2;
        this.status = lVar;
        this.thumbnail = map;
        this.videoUrl = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final d getItem() {
        return this.item;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final l getStatus() {
        return this.status;
    }

    @Y61.l
    public final Map<String, String> e() {
        return this.thumbnail;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }
}
