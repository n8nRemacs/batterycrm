package eW0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TemplateUnit.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LeW0/d;", "LeW0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "left", "", "right", "relativeValue", "", "LeW0/d$a;", "expandedInfo", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLeft", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getRight", "()Ljava/lang/String;", "getRelativeValue", "Ljava/util/List;", "getExpandedInfo", "()Ljava/util/List;", "a", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40061d implements InterfaceC40066i {

    @com.google.gson.annotations.c("expanded_info")
    @Y61.k
    private final List<a> expandedInfo;

    @com.google.gson.annotations.c("left")
    @Y61.k
    private final AttributedText left;

    @com.google.gson.annotations.c("relative_value")
    @Y61.l
    private final AttributedText relativeValue;

    @com.google.gson.annotations.c("right")
    @Y61.k
    private final String right;

    /* compiled from: TemplateUnit.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LeW0/d$a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "left", "right", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLeft", "()Lcom/avito/android/remote/model/text/AttributedText;", "getRight", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eW0.d$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c("left")
        @Y61.k
        private final AttributedText left;

        @com.google.gson.annotations.c("right")
        @Y61.k
        private final AttributedText right;

        public a(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
            this.left = attributedText;
            this.right = attributedText2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.left, aVar.left) && L.f(this.right, aVar.right);
        }

        public final int hashCode() {
            return this.right.hashCode() + (this.left.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(left=");
            sb2.append(this.left);
            sb2.append(", right=");
            return com.avito.android.actions_sheet.a.w(sb2, this.right, ')');
        }
    }

    public C40061d(@Y61.k AttributedText attributedText, @Y61.k String str, @Y61.l AttributedText attributedText2, @Y61.k List<a> list) {
        this.left = attributedText;
        this.right = str;
        this.relativeValue = attributedText2;
        this.expandedInfo = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40061d)) {
            return false;
        }
        C40061d c40061d = (C40061d) obj;
        return L.f(this.left, c40061d.left) && L.f(this.right, c40061d.right) && L.f(this.relativeValue, c40061d.relativeValue) && L.f(this.expandedInfo, c40061d.expandedInfo);
    }

    public final int hashCode() {
        int iD2 = H.d(this.left.hashCode() * 31, 31, this.right);
        AttributedText attributedText = this.relativeValue;
        return this.expandedInfo.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandedTemplate(left=");
        sb2.append(this.left);
        sb2.append(", right=");
        sb2.append(this.right);
        sb2.append(", relativeValue=");
        sb2.append(this.relativeValue);
        sb2.append(", expandedInfo=");
        return H.p(sb2, this.expandedInfo, ')');
    }
}
