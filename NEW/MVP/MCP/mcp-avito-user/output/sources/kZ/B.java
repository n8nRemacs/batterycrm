package KZ;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationProcessItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKZ/B;", "LKZ/p;", "", "LKZ/A;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "legalText", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class B implements InterfaceC14286p {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final List<A> actions;

    @com.google.gson.annotations.c("legalText")
    @Y61.l
    private final AttributedText legalText;

    public B(@Y61.k List<A> list, @Y61.l AttributedText attributedText) {
        this.actions = list;
        this.legalText = attributedText;
    }

    @Y61.k
    public final List<A> a() {
        return this.actions;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getLegalText() {
        return this.legalText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return kotlin.jvm.internal.L.f(this.actions, b12.actions) && kotlin.jvm.internal.L.f(this.legalText, b12.legalText);
    }

    public final int hashCode() {
        int iHashCode = this.actions.hashCode() * 31;
        AttributedText attributedText = this.legalText;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationProcessItemValue(actions=");
        sb2.append(this.actions);
        sb2.append(", legalText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.legalText, ')');
    }
}
