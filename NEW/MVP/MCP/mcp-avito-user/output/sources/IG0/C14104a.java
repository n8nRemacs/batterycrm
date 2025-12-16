package Ig0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"LIg0/a;", "", "", "LIg0/b;", "buttons", "", "text", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ig0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14104a {

    @com.google.gson.annotations.c("buttons")
    @Y61.k
    private final List<C14105b> buttons;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14104a(@Y61.k List<C14105b> list, @Y61.k String str, @Y61.k String str2) {
        this.buttons = list;
        this.text = str;
        this.title = str2;
    }

    @Y61.k
    public final List<C14105b> a() {
        return this.buttons;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
