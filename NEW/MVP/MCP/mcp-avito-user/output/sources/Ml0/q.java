package ml0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lml0/q;", "", "Lml0/r;", "helpContent", "", "percent", "text", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "", "withHelpIcon", "<init>", "(Lml0/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;)V", "Lml0/r;", "a", "()Lml0/r;", "Ljava/lang/String;", "getPercent", "()Ljava/lang/String;", "b", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getValue", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    @com.google.gson.annotations.c("helpContent")
    @Y61.l
    private final r helpContent;

    @com.google.gson.annotations.c("percent")
    @Y61.l
    private final String percent;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final AttributedText value;

    @com.google.gson.annotations.c("withHelpIcon")
    @Y61.l
    private final Boolean withHelpIcon;

    public q(@Y61.l r rVar, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, @Y61.l Boolean bool) {
        this.helpContent = rVar;
        this.percent = str;
        this.text = str2;
        this.title = str3;
        this.value = attributedText;
        this.withHelpIcon = bool;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final r getHelpContent() {
        return this.helpContent;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }
}
