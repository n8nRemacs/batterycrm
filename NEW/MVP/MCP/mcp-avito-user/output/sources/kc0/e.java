package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptConfigureMigrationResult.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKC0/e;", "", "", "title", "", "LKC0/l;", "items", "Lcom/avito/android/remote/model/text/AttributedText;", "legalInfo", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final ButtonAction button;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<l> items;

    @com.google.gson.annotations.c("legalInfo")
    @Y61.l
    private final AttributedText legalInfo;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public e(@Y61.k String str, @Y61.k List<l> list, @Y61.l AttributedText attributedText, @Y61.k ButtonAction buttonAction) {
        this.title = str;
        this.items = list;
        this.legalInfo = attributedText;
        this.button = buttonAction;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @Y61.k
    public final List<l> b() {
        return this.items;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getLegalInfo() {
        return this.legalInfo;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.title, eVar.title) && L.f(this.items, eVar.items) && L.f(this.legalInfo, eVar.legalInfo) && L.f(this.button, eVar.button);
    }

    public final int hashCode() {
        int iE2 = H.e(this.title.hashCode() * 31, 31, this.items);
        AttributedText attributedText = this.legalInfo;
        return this.button.hashCode() + ((iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptConfigureMigrationResult(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", legalInfo=");
        sb2.append(this.legalInfo);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }
}
