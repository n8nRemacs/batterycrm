package uj0;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MobileCreateLotOnItemEditingResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Luj0/a;", "", "", "buttonText", "deepLinkUri", "image", "images", "", "lotId", "subtitle", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JLjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getButtonText", "()Ljava/lang/String;", "a", "getImage", "Ljava/lang/Object;", "getImages", "()Ljava/lang/Object;", "J", "getLotId", "()J", "getSubtitle", "getTitle", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C49067a {

    @c("buttonText")
    @k
    private final String buttonText;

    @c("deepLinkUri")
    @k
    private final String deepLinkUri;

    @c("image")
    @k
    private final String image;

    @c("images")
    @k
    private final Object images;

    @c("lotId")
    private final long lotId;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public C49067a(@k String str, @k String str2, @k String str3, @k Object obj, long j12, @l String str4, @k String str5) {
        this.buttonText = str;
        this.deepLinkUri = str2;
        this.image = str3;
        this.images = obj;
        this.lotId = j12;
        this.subtitle = str4;
        this.title = str5;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDeepLinkUri() {
        return this.deepLinkUri;
    }
}
