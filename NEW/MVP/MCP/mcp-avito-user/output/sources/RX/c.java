package RX;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Api1MandatoryVerificationPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LRX/c;", "", "", "description", "LRX/d;", "image", "title", "<init>", "(Ljava/lang/String;LRX/d;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LRX/d;", "b", "()LRX/d;", "c", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("image")
    @k
    private final d image;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k String str, @k d dVar, @k String str2) {
        this.description = str;
        this.image = dVar;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final d getImage() {
        return this.image;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
