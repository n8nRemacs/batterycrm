package Cj0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LCj0/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "nextUsagePublicId", "LCj0/i;", "primaryAction", "secondaryAction", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;LCj0/i;LCj0/i;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LCj0/i;", "c", "()LCj0/i;", "d", "e", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("nextUsagePublicId")
    @Y61.k
    private final String nextUsagePublicId;

    @com.google.gson.annotations.c("primaryAction")
    @Y61.l
    private final i primaryAction;

    @com.google.gson.annotations.c("secondaryAction")
    @Y61.l
    private final i secondaryAction;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public b(@Y61.k AttributedText attributedText, @Y61.k String str, @Y61.l i iVar, @Y61.l i iVar2, @Y61.k String str2) {
        this.description = attributedText;
        this.nextUsagePublicId = str;
        this.primaryAction = iVar;
        this.secondaryAction = iVar2;
        this.title = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getNextUsagePublicId() {
        return this.nextUsagePublicId;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final i getPrimaryAction() {
        return this.primaryAction;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final i getSecondaryAction() {
        return this.secondaryAction;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
