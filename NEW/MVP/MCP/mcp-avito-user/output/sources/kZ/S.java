package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LKZ/S;", "", "", "title", ChannelContext.Item.PLACEHOLDER, "value", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class S {

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
    private final String value;

    public S(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        this.title = str;
        this.placeholder = str2;
        this.value = str3;
        this.error = str4;
    }

    public static S a(S s5, String str, String str2, int i12) {
        String str3 = s5.title;
        String str4 = s5.placeholder;
        if ((i12 & 4) != 0) {
            str = s5.value;
        }
        s5.getClass();
        return new S(str3, str4, str, str2);
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
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s5 = (S) obj;
        return kotlin.jvm.internal.L.f(this.title, s5.title) && kotlin.jvm.internal.L.f(this.placeholder, s5.placeholder) && kotlin.jvm.internal.L.f(this.value, s5.value) && kotlin.jvm.internal.L.f(this.error, s5.error);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.placeholder);
        String str = this.value;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyObjectDetailsStringField(title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", error=");
        return C22026a.c(sb2, this.error, ')');
    }
}
