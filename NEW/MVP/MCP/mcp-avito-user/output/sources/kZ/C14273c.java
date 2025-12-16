package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationAppealsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKZ/c;", "", "", "title", "iconUrl", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LKZ/e;", "additionalBlock", "LKZ/d;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LKZ/e;LKZ/d;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LKZ/e;", "b", "()LKZ/e;", "LKZ/d;", "a", "()LKZ/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14273c {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final C14274d action;

    @com.google.gson.annotations.c("additionalBlock")
    @Y61.l
    private final C14275e additionalBlock;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final String iconUrl;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14273c(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.l C14275e c14275e, @Y61.k C14274d c14274d) {
        this.title = str;
        this.iconUrl = str2;
        this.description = attributedText;
        this.additionalBlock = c14275e;
        this.action = c14274d;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C14274d getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C14275e getAdditionalBlock() {
        return this.additionalBlock;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14273c)) {
            return false;
        }
        C14273c c14273c = (C14273c) obj;
        return kotlin.jvm.internal.L.f(this.title, c14273c.title) && kotlin.jvm.internal.L.f(this.iconUrl, c14273c.iconUrl) && kotlin.jvm.internal.L.f(this.description, c14273c.description) && kotlin.jvm.internal.L.f(this.additionalBlock, c14273c.additionalBlock) && kotlin.jvm.internal.L.f(this.action, c14273c.action);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.iconUrl), 31, this.description);
        C14275e c14275e = this.additionalBlock;
        return this.action.hashCode() + ((iB2 + (c14275e == null ? 0 : c14275e.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationAppealBankInfo(title=" + this.title + ", iconUrl=" + this.iconUrl + ", description=" + this.description + ", additionalBlock=" + this.additionalBlock + ", action=" + this.action + ')';
    }
}
