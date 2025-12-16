package KC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptConfigureMigrationResult.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LKC0/l;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "LKC0/b;", "coloredIcon", "textIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;LKC0/b;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "LKC0/b;", "a", "()LKC0/b;", "c", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class l {

    @com.google.gson.annotations.c("coloredIcon")
    @Y61.l
    private final b coloredIcon;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("textIcon")
    @Y61.l
    private final AttributedText textIcon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public l(@Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l b bVar, @Y61.l AttributedText attributedText3) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.coloredIcon = bVar;
        this.textIcon = attributedText3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final b getColoredIcon() {
        return this.coloredIcon;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getTextIcon() {
        return this.textIcon;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.title, lVar.title) && L.f(this.subtitle, lVar.subtitle) && L.f(this.coloredIcon, lVar.coloredIcon) && L.f(this.textIcon, lVar.textIcon);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        b bVar = this.coloredIcon;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AttributedText attributedText2 = this.textIcon;
        return iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptMigrationItem(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", coloredIcon=");
        sb2.append(this.coloredIcon);
        sb2.append(", textIcon=");
        return com.avito.android.actions_sheet.a.w(sb2, this.textIcon, ')');
    }
}
