package K50;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LK50/c;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "showSearch", "cancelActionTitle", "confirmActionTitle", "", "LK50/a;", "businessVrfList", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "e", "()Z", "b", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("businessVrfList")
    @Y61.k
    private final List<a> businessVrfList;

    @com.google.gson.annotations.c("cancelActionTitle")
    @Y61.k
    private final String cancelActionTitle;

    @com.google.gson.annotations.c("confirmActionTitle")
    @Y61.k
    private final String confirmActionTitle;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("showSearch")
    private final boolean showSearch;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public c(@Y61.k String str, @Y61.k AttributedText attributedText, boolean z12, @Y61.k String str2, @Y61.k String str3, @Y61.k List<a> list) {
        this.title = str;
        this.description = attributedText;
        this.showSearch = z12;
        this.cancelActionTitle = str2;
        this.confirmActionTitle = str3;
        this.businessVrfList = list;
    }

    @Y61.k
    public final List<a> a() {
        return this.businessVrfList;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getCancelActionTitle() {
        return this.cancelActionTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getConfirmActionTitle() {
        return this.confirmActionTitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getShowSearch() {
        return this.showSearch;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.title, cVar.title) && L.f(this.description, cVar.description) && this.showSearch == cVar.showSearch && L.f(this.cancelActionTitle, cVar.cancelActionTitle) && L.f(this.confirmActionTitle, cVar.confirmActionTitle) && L.f(this.businessVrfList, cVar.businessVrfList);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.businessVrfList.hashCode() + H.d(H.d(r.i(com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.description), 31, this.showSearch), 31, this.cancelActionTitle), 31, this.confirmActionTitle);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BusinessVrfResultData(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", showSearch=");
        sb2.append(this.showSearch);
        sb2.append(", cancelActionTitle=");
        sb2.append(this.cancelActionTitle);
        sb2.append(", confirmActionTitle=");
        sb2.append(this.confirmActionTitle);
        sb2.append(", businessVrfList=");
        return H.p(sb2, this.businessVrfList, ')');
    }
}
