package KC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKC0/h;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "LKC0/b;", "coloredIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LKC0/b;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LKC0/b;", "a", "()LKC0/b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("coloredIcon")
    @Y61.k
    private final b coloredIcon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public h(@Y61.k AttributedText attributedText, @Y61.k b bVar) {
        this.title = attributedText;
        this.coloredIcon = bVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final b getColoredIcon() {
        return this.coloredIcon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.title, hVar.title) && L.f(this.coloredIcon, hVar.coloredIcon);
    }

    public final int hashCode() {
        return this.coloredIcon.hashCode() + (this.title.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "CptLandingTerm(title=" + this.title + ", coloredIcon=" + this.coloredIcon + ')';
    }
}
