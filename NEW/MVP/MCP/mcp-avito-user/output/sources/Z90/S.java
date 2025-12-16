package z90;

import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lz90/S;", "", "", "description", "Lz90/T;", "img", "title", "<init>", "(Ljava/lang/String;Lz90/T;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lz90/T;", "b", "()Lz90/T;", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class S {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("img")
    @Y61.l
    private final T img;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public S(@Y61.l String str, @Y61.l T t12, @Y61.l String str2) {
        this.description = str;
        this.img = t12;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final T getImg() {
        return this.img;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
