package MZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.landing.LandingManagerUspItem;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingManagerUsp.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LMZ/i;", "", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "", "Lcom/avito/android/mortgage/api/model/landing/LandingManagerUspItem;", "usp", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/mortgage/api/model/ActionButton;)V", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/mortgage/api/model/ActionButton;", "a", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ActionButton action;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final UniversalImage image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("usp")
    @Y61.k
    private final List<LandingManagerUspItem> usp;

    public i(@Y61.k UniversalImage universalImage, @Y61.k String str, @Y61.k List<LandingManagerUspItem> list, @Y61.l ActionButton actionButton) {
        this.image = universalImage;
        this.title = str;
        this.usp = list;
        this.action = actionButton;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    public final List<LandingManagerUspItem> d() {
        return this.usp;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.image, iVar.image) && L.f(this.title, iVar.title) && L.f(this.usp, iVar.usp) && L.f(this.action, iVar.action);
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.image.hashCode() * 31, 31, this.title), 31, this.usp);
        ActionButton actionButton = this.action;
        return iE2 + (actionButton == null ? 0 : actionButton.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "LandingManagerUsp(image=" + this.image + ", title=" + this.title + ", usp=" + this.usp + ", action=" + this.action + ')';
    }
}
