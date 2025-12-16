package dC0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevel.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LdC0/e;", "", "", "title", "LdC0/f;", "titleButton", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LdC0/h;", "featureGroups", "<init>", "(Ljava/lang/String;LdC0/f;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LdC0/f;", "d", "()LdC0/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dC0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39563e {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("featureGroups")
    @k
    private final List<C39566h> featureGroups;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("titleButton")
    @l
    private final C39564f titleButton;

    public C39563e(@k String str, @l C39564f c39564f, @l AttributedText attributedText, @k List<C39566h> list) {
        this.title = str;
        this.titleButton = c39564f;
        this.description = attributedText;
        this.featureGroups = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<C39566h> b() {
        return this.featureGroups;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C39564f getTitleButton() {
        return this.titleButton;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39563e)) {
            return false;
        }
        C39563e c39563e = (C39563e) obj;
        return L.f(this.title, c39563e.title) && L.f(this.titleButton, c39563e.titleButton) && L.f(this.description, c39563e.description) && L.f(this.featureGroups, c39563e.featureGroups);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        C39564f c39564f = this.titleButton;
        int iHashCode2 = (iHashCode + (c39564f == null ? 0 : c39564f.hashCode())) * 31;
        AttributedText attributedText = this.description;
        return this.featureGroups.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevel(title=");
        sb2.append(this.title);
        sb2.append(", titleButton=");
        sb2.append(this.titleButton);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", featureGroups=");
        return H.p(sb2, this.featureGroups, ')');
    }
}
