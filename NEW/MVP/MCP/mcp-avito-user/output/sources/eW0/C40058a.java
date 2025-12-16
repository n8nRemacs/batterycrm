package eW0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TemplateUnit.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LeW0/a;", "LeW0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "left", "right", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLeft", "()Lcom/avito/android/remote/model/text/AttributedText;", "getRight", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40058a implements InterfaceC40066i {

    @com.google.gson.annotations.c("left")
    @Y61.l
    private final AttributedText left;

    @com.google.gson.annotations.c("right")
    @Y61.l
    private final AttributedText right;

    public C40058a(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
        this.left = attributedText;
        this.right = attributedText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40058a)) {
            return false;
        }
        C40058a c40058a = (C40058a) obj;
        return L.f(this.left, c40058a.left) && L.f(this.right, c40058a.right);
    }

    public final int hashCode() {
        AttributedText attributedText = this.left;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.right;
        return iHashCode + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnsTemplate(left=");
        sb2.append(this.left);
        sb2.append(", right=");
        return com.avito.android.actions_sheet.a.w(sb2, this.right, ')');
    }
}
