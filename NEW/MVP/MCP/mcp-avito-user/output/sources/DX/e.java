package dX;

import androidx.compose.foundation.H;
import com.avito.android.loyalty.remote.model.quality_service.GradeColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LdX/e;", "", "", "id", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "color", "title", "", "score", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LdX/a;", "badge", "<init>", "(Ljava/lang/String;Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;LdX/a;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "a", "()Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "e", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LdX/a;", "getBadge", "()LdX/a;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("badge")
    @Y61.l
    private final C39634a badge;

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final GradeColor color;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("score")
    @Y61.l
    private final Integer score;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public e(@Y61.k String str, @Y61.l GradeColor gradeColor, @Y61.k String str2, @Y61.l Integer num, @Y61.k AttributedText attributedText, @Y61.l C39634a c39634a) {
        this.id = str;
        this.color = gradeColor;
        this.title = str2;
        this.score = num;
        this.description = attributedText;
        this.badge = c39634a;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final GradeColor getColor() {
        return this.color;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getScore() {
        return this.score;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.id, eVar.id) && this.color == eVar.color && L.f(this.title, eVar.title) && L.f(this.score, eVar.score) && L.f(this.description, eVar.description) && L.f(this.badge, eVar.badge);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        GradeColor gradeColor = this.color;
        int iD2 = H.d((iHashCode + (gradeColor == null ? 0 : gradeColor.hashCode())) * 31, 31, this.title);
        Integer num = this.score;
        int iB2 = com.avito.android.actions_sheet.a.b((iD2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.description);
        C39634a c39634a = this.badge;
        if (c39634a == null) {
            return iB2;
        }
        c39634a.getClass();
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "CriteriaItem(id=" + this.id + ", color=" + this.color + ", title=" + this.title + ", score=" + this.score + ", description=" + this.description + ", badge=" + this.badge + ')';
    }
}
