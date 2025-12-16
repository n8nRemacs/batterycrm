package JZ;

import KZ.C14279i;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageSelectedAppeal.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LJZ/n;", "", "", "id", "iconUrl", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "status", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfo;", "creditInfo", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealComment;", "comment", "LKZ/i;", "selectBankButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfo;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealComment;LKZ/i;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "g", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfo;", "b", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfo;", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealComment;", "a", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealComment;", "LKZ/i;", "e", "()LKZ/i;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class n {

    @com.google.gson.annotations.c("comment")
    @Y61.l
    private final ApplicationAppealComment comment;

    @com.google.gson.annotations.c("creditInfo")
    @Y61.l
    private final ApplicationAppealCreditInfo creditInfo;

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final String iconUrl;

    @com.google.gson.annotations.c("appealId")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("selectBankButton")
    @Y61.l
    private final C14279i selectBankButton;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final AttributedText status;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.l ApplicationAppealCreditInfo applicationAppealCreditInfo, @Y61.l ApplicationAppealComment applicationAppealComment, @Y61.l C14279i c14279i) {
        this.id = str;
        this.iconUrl = str2;
        this.title = str3;
        this.status = attributedText;
        this.creditInfo = applicationAppealCreditInfo;
        this.comment = applicationAppealComment;
        this.selectBankButton = c14279i;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ApplicationAppealComment getComment() {
        return this.comment;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final ApplicationAppealCreditInfo getCreditInfo() {
        return this.creditInfo;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final C14279i getSelectBankButton() {
        return this.selectBankButton;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.id, nVar.id) && L.f(this.iconUrl, nVar.iconUrl) && L.f(this.title, nVar.title) && L.f(this.status, nVar.status) && L.f(this.creditInfo, nVar.creditInfo) && L.f(this.comment, nVar.comment) && L.f(this.selectBankButton, nVar.selectBankButton);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final AttributedText getStatus() {
        return this.status;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.iconUrl), 31, this.title);
        AttributedText attributedText = this.status;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ApplicationAppealCreditInfo applicationAppealCreditInfo = this.creditInfo;
        int iHashCode2 = (iHashCode + (applicationAppealCreditInfo == null ? 0 : applicationAppealCreditInfo.hashCode())) * 31;
        ApplicationAppealComment applicationAppealComment = this.comment;
        int iHashCode3 = (iHashCode2 + (applicationAppealComment == null ? 0 : applicationAppealComment.hashCode())) * 31;
        C14279i c14279i = this.selectBankButton;
        return iHashCode3 + (c14279i != null ? c14279i.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MortgageSelectedAppeal(id=" + this.id + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", status=" + this.status + ", creditInfo=" + this.creditInfo + ", comment=" + this.comment + ", selectBankButton=" + this.selectBankButton + ')';
    }
}
