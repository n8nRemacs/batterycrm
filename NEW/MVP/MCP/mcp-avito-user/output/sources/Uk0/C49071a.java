package uk0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Luk0/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "_avito-discouraged_avito-api_imv-similar-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C49071a {

    @c("description")
    @l
    private final AttributedText description;

    @c("title")
    @k
    private final AttributedText title;

    public C49071a(@k AttributedText attributedText, @l AttributedText attributedText2) {
        this.title = attributedText;
        this.description = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49071a)) {
            return false;
        }
        C49071a c49071a = (C49071a) obj;
        return L.f(this.title, c49071a.title) && L.f(this.description, c49071a.description);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.description;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvSimilarAdvertsHeader(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.description, ')');
    }
}
