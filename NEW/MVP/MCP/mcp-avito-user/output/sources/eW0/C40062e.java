package eW0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TemplateUnit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LeW0/e;", "LeW0/i;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "value", "relativeValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getValue", "()Lcom/avito/android/remote/model/text/AttributedText;", "getRelativeValue", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40062e implements InterfaceC40066i {

    @com.google.gson.annotations.c("relative_value")
    @Y61.l
    private final AttributedText relativeValue;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final AttributedText value;

    public C40062e(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2) {
        this.title = str;
        this.value = attributedText;
        this.relativeValue = attributedText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40062e)) {
            return false;
        }
        C40062e c40062e = (C40062e) obj;
        return L.f(this.title, c40062e.title) && L.f(this.value, c40062e.value) && L.f(this.relativeValue, c40062e.relativeValue);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.value);
        AttributedText attributedText = this.relativeValue;
        return iB2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderTemplate(title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", relativeValue=");
        return com.avito.android.actions_sheet.a.w(sb2, this.relativeValue, ')');
    }
}
