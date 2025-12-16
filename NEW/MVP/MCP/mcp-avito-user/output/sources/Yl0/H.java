package Yl0;

import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LYl0/H;", "", "", "backgroundColor", "text", "textColor", "LYl0/I;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LYl0/I;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "LYl0/I;", "d", "()LYl0/I;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H {

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final String backgroundColor;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c("textColor")
    @Y61.k
    private final String textColor;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @Y61.l
    private final I tooltip;

    public H(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.l I i12) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.tooltip = i12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final I getTooltip() {
        return this.tooltip;
    }
}
