package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LKZ/P;", "", "", "title", ChannelContext.Item.PLACEHOLDER, "", "value", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class P {

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final String error;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.k
    private final String placeholder;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("value")
    @Y61.l
    private final Long value;

    public P(@Y61.k String str, @Y61.k String str2, @Y61.l Long l12, @Y61.l String str3) {
        this.title = str;
        this.placeholder = str2;
        this.value = l12;
        this.error = str3;
    }

    public static P a(P p12, Long l12, String str, int i12) {
        String str2 = p12.title;
        String str3 = p12.placeholder;
        if ((i12 & 4) != 0) {
            l12 = p12.value;
        }
        p12.getClass();
        return new P(str2, str3, l12, str);
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p12 = (P) obj;
        return kotlin.jvm.internal.L.f(this.title, p12.title) && kotlin.jvm.internal.L.f(this.placeholder, p12.placeholder) && kotlin.jvm.internal.L.f(this.value, p12.value) && kotlin.jvm.internal.L.f(this.error, p12.error);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.placeholder);
        Long l12 = this.value;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.error;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyObjectDetailsIntField(title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", error=");
        return C22026a.c(sb2, this.error, ')');
    }
}
