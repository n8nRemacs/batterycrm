package KZ;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LKZ/N;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "LKZ/Q;", "linkOption", "LKZ/O;", "addressOption", "LKZ/P;", "costField", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LKZ/Q;LKZ/O;LKZ/P;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "LKZ/Q;", "d", "()LKZ/Q;", "LKZ/O;", "b", "()LKZ/O;", "LKZ/P;", "c", "()LKZ/P;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class N {

    @com.google.gson.annotations.c("addressOption")
    @Y61.k
    private final O addressOption;

    @com.google.gson.annotations.c("costField")
    @Y61.k
    private final P costField;

    @com.google.gson.annotations.c("linkOption")
    @Y61.k
    private final Q linkOption;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public N(@Y61.k AttributedText attributedText, @Y61.k Q q12, @Y61.k O o12, @Y61.k P p12) {
        this.title = attributedText;
        this.linkOption = q12;
        this.addressOption = o12;
        this.costField = p12;
    }

    public static N a(N n12, Q q12, O o12, P p12, int i12) {
        AttributedText attributedText = n12.title;
        if ((i12 & 2) != 0) {
            q12 = n12.linkOption;
        }
        if ((i12 & 4) != 0) {
            o12 = n12.addressOption;
        }
        if ((i12 & 8) != 0) {
            p12 = n12.costField;
        }
        n12.getClass();
        return new N(attributedText, q12, o12, p12);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final O getAddressOption() {
        return this.addressOption;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final P getCostField() {
        return this.costField;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final Q getLinkOption() {
        return this.linkOption;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n12 = (N) obj;
        return kotlin.jvm.internal.L.f(this.title, n12.title) && kotlin.jvm.internal.L.f(this.linkOption, n12.linkOption) && kotlin.jvm.internal.L.f(this.addressOption, n12.addressOption) && kotlin.jvm.internal.L.f(this.costField, n12.costField);
    }

    @Y61.k
    public final N f(@Y61.l Long l12) {
        P p12 = this.costField;
        p12.getClass();
        return a(this, null, null, P.a(p12, l12, null, 3), 7);
    }

    public final int hashCode() {
        return this.costField.hashCode() + ((this.addressOption.hashCode() + ((this.linkOption.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RealtyObjectDetails(title=" + this.title + ", linkOption=" + this.linkOption + ", addressOption=" + this.addressOption + ", costField=" + this.costField + ')';
    }
}
