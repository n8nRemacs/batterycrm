package tM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LtM0/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LtM0/b;", "list", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C48579c {

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("list")
    @k
    private final List<C48578b> list;

    public C48579c(@l AttributedText attributedText, @k List<C48578b> list) {
        this.description = attributedText;
        this.list = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<C48578b> b() {
        return this.list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48579c)) {
            return false;
        }
        C48579c c48579c = (C48579c) obj;
        return L.f(this.description, c48579c.description) && L.f(this.list, c48579c.list);
    }

    public final int hashCode() {
        AttributedText attributedText = this.description;
        return this.list.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasBundlesTab(description=");
        sb2.append(this.description);
        sb2.append(", list=");
        return H.p(sb2, this.list, ')');
    }
}
