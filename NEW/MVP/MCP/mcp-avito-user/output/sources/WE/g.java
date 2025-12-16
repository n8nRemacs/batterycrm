package We;

import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LWe/g;", "", "", "link", "text", "LWe/B;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;LWe/B;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "LWe/B;", "getTooltip", "()LWe/B;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    @com.google.gson.annotations.c("link")
    @Y61.l
    private final String link;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @Y61.l
    private final B tooltip;

    public g(@Y61.l String str, @Y61.k String str2, @Y61.l B b12) {
        this.link = str;
        this.text = str2;
        this.tooltip = b12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
