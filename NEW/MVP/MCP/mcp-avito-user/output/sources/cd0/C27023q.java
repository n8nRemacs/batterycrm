package cD0;

import com.avito.android.remote.model.text.AttributedText;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffUpsellInfo.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LcD0/q;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LcD0/p;", AdFormat.BANNER, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LcD0/p;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LcD0/p;", "a", "()LcD0/p;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C27023q {

    @com.google.gson.annotations.c("featureBanner")
    @Y61.l
    private final C27022p banner;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C27023q(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l C27022p c27022p) {
        this.title = str;
        this.description = attributedText;
        this.banner = c27022p;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C27022p getBanner() {
        return this.banner;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27023q)) {
            return false;
        }
        C27023q c27023q = (C27023q) obj;
        return L.f(this.title, c27023q.title) && L.f(this.description, c27023q.description) && L.f(this.banner, c27023q.banner);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        C27022p c27022p = this.banner;
        return iHashCode2 + (c27022p != null ? c27022p.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TariffUpsellInfo(title=" + this.title + ", description=" + this.description + ", banner=" + this.banner + ')';
    }
}
