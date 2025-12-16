package YF0;

import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LYF0/j;", "", "LYF0/b;", "icon", "", "singleDateTitle", "title", "<init>", "(LYF0/b;Ljava/lang/String;Ljava/lang/String;)V", "LYF0/b;", "a", "()LYF0/b;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final b icon;

    @com.google.gson.annotations.c("singleDateTitle")
    @Y61.l
    private final String singleDateTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public j(@Y61.l b bVar, @Y61.l String str, @Y61.k String str2) {
        this.icon = bVar;
        this.singleDateTitle = str;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final b getIcon() {
        return this.icon;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getSingleDateTitle() {
        return this.singleDateTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
