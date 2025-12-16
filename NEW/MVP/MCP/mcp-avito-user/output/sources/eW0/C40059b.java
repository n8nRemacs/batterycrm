package eW0;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TemplateUnit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LeW0/b;", "LeW0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "fromType", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getFromType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40059b implements InterfaceC40066i {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("from_type")
    @Y61.l
    private final String fromType;

    public C40059b(@Y61.k AttributedText attributedText, @Y61.l String str) {
        this.description = attributedText;
        this.fromType = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40059b)) {
            return false;
        }
        C40059b c40059b = (C40059b) obj;
        return L.f(this.description, c40059b.description) && L.f(this.fromType, c40059b.fromType);
    }

    public final int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        String str = this.fromType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionTemplate(description=");
        sb2.append(this.description);
        sb2.append(", fromType=");
        return C22026a.c(sb2, this.fromType, ')');
    }
}
