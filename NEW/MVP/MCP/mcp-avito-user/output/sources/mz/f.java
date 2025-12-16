package MZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingActionItem.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LMZ/f;", "", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "LMZ/a;", "viewPortAnalytics", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/mortgage/api/model/ActionButton;LMZ/a;)V", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "Lcom/avito/android/mortgage/api/model/ActionButton;", "a", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "LMZ/a;", "e", "()LMZ/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final ActionButton action;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final UniversalImage image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("viewPortAnalytics")
    @Y61.l
    private final a viewPortAnalytics;

    public f(@Y61.k UniversalImage universalImage, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k ActionButton actionButton, @Y61.l a aVar) {
        this.image = universalImage;
        this.title = attributedText;
        this.description = attributedText2;
        this.action = actionButton;
        this.viewPortAnalytics = aVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final a getViewPortAnalytics() {
        return this.viewPortAnalytics;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.image, fVar.image) && L.f(this.title, fVar.title) && L.f(this.description, fVar.description) && L.f(this.action, fVar.action) && L.f(this.viewPortAnalytics, fVar.viewPortAnalytics);
    }

    public final int hashCode() {
        int iHashCode = (this.action.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.image.hashCode() * 31, 31, this.title), 31, this.description)) * 31;
        a aVar = this.viewPortAnalytics;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "LandingActionItem(image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", action=" + this.action + ", viewPortAnalytics=" + this.viewPortAnalytics + ')';
    }
}
