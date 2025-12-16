package We;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"LWe/c;", "", "", "LWe/d;", "benefits", "", "benefitsTitle", "LWe/r;", "button", "description", "LWe/s;", "footerText", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;LWe/r;Ljava/lang/String;LWe/s;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LWe/r;", "c", "()LWe/r;", "d", "LWe/s;", "e", "()LWe/s;", "f", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: We.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15751c {

    @com.google.gson.annotations.c("benefits")
    @Y61.l
    private final List<C15752d> benefits;

    @com.google.gson.annotations.c("benefitsTitle")
    @Y61.l
    private final String benefitsTitle;

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final r button;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("footerText")
    @Y61.l
    private final s footerText;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C15751c(@Y61.l List<C15752d> list, @Y61.l String str, @Y61.k r rVar, @Y61.k String str2, @Y61.l s sVar, @Y61.k String str3) {
        this.benefits = list;
        this.benefitsTitle = str;
        this.button = rVar;
        this.description = str2;
        this.footerText = sVar;
        this.title = str3;
    }

    @Y61.l
    public final List<C15752d> a() {
        return this.benefits;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBenefitsTitle() {
        return this.benefitsTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final r getButton() {
        return this.button;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final s getFooterText() {
        return this.footerText;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
