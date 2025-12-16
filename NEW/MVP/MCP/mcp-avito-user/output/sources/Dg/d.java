package DG;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigerSlotsV1Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"LDG/d;", "", "LDG/c;", "button", "", "LDG/n;", "slots", "", "subtitle", "text", "title", "<init>", "(LDG/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LDG/c;", "a", "()LDG/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getSubtitle", "()Ljava/lang/String;", "c", "getTitle", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final c button;

    @com.google.gson.annotations.c("slots")
    @Y61.k
    private final List<n> slots;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public d(@Y61.l c cVar, @Y61.k List<n> list, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.button = cVar;
        this.slots = list;
        this.subtitle = str;
        this.text = str2;
        this.title = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getButton() {
        return this.button;
    }

    @Y61.k
    public final List<n> b() {
        return this.slots;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
