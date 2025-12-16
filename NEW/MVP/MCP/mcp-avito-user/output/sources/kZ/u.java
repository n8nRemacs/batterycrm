package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.Metadata;

/* compiled from: ApplicationIssueItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LKZ/u;", "LKZ/p;", "", "title", "description", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "referTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/ActionButton;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/avito/android/mortgage/api/model/ActionButton;", "a", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "getReferTo", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class u implements InterfaceC14286p {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ActionButton action;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("referTo")
    @Y61.k
    private final String referTo;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public u(@Y61.k String str, @Y61.l String str2, @Y61.l ActionButton actionButton, @Y61.k String str3) {
        this.title = str;
        this.description = str2;
        this.action = actionButton;
        this.referTo = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.L.f(this.title, uVar.title) && kotlin.jvm.internal.L.f(this.description, uVar.description) && kotlin.jvm.internal.L.f(this.action, uVar.action) && kotlin.jvm.internal.L.f(this.referTo, uVar.referTo);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.action;
        return this.referTo.hashCode() + ((iHashCode2 + (actionButton != null ? actionButton.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationIssueItemValue(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", referTo=");
        return C22026a.c(sb2, this.referTo, ')');
    }
}
