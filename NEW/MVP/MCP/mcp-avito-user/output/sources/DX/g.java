package dX;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceAlertContent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LdX/g;", "", "", "alertSlug", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LdX/f;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LdX/f;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LdX/f;", "a", "()LdX/f;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final f action;

    @com.google.gson.annotations.c("alertSlug")
    @Y61.k
    private final String alertSlug;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public g(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.l f fVar) {
        this.alertSlug = str;
        this.title = str2;
        this.description = attributedText;
        this.action = fVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final f getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getAlertSlug() {
        return this.alertSlug;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.alertSlug, gVar.alertSlug) && L.f(this.title, gVar.title) && L.f(this.description, gVar.description) && L.f(this.action, gVar.action);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.alertSlug.hashCode() * 31, 31, this.title), 31, this.description);
        f fVar = this.action;
        return iB2 + (fVar == null ? 0 : fVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceAlertContent(alertSlug=" + this.alertSlug + ", title=" + this.title + ", description=" + this.description + ", action=" + this.action + ')';
    }
}
