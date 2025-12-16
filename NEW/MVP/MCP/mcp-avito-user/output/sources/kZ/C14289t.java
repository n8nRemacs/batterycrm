package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationInfoBannerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKZ/t;", "LKZ/p;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14289t implements InterfaceC14286p {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14289t(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
        this.id = str;
        this.title = str2;
        this.description = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
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
        if (!(obj instanceof C14289t)) {
            return false;
        }
        C14289t c14289t = (C14289t) obj;
        return kotlin.jvm.internal.L.f(this.id, c14289t.id) && kotlin.jvm.internal.L.f(this.title, c14289t.title) && kotlin.jvm.internal.L.f(this.description, c14289t.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + androidx.compose.foundation.H.d(this.id.hashCode() * 31, 31, this.title);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationInfoBannerItemValue(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.description, ')');
    }
}
