package KC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptLevelsResult.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LKC0/i;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "description", "", "isEnabled", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;ZLcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "getDescription", "Z", "()Z", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final ButtonAction button;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("isEnabled")
    private final boolean isEnabled;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public i(@Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k AttributedText attributedText3, boolean z12, @Y61.k ButtonAction buttonAction) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.description = attributedText3;
        this.isEnabled = z12;
        this.button = buttonAction;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.title, iVar.title) && L.f(this.subtitle, iVar.subtitle) && L.f(this.description, iVar.description) && this.isEnabled == iVar.isEnabled && L.f(this.button, iVar.button);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        return this.button.hashCode() + androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.b((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.description), 31, this.isEnabled);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptLevel(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }
}
