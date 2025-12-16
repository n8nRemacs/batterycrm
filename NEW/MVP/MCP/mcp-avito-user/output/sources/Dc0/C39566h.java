package dC0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LdC0/h;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "", "LdC0/g;", "features", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dC0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39566h {

    @com.google.gson.annotations.c("features")
    @k
    private final List<C39565g> features;

    @com.google.gson.annotations.c("name")
    @l
    private final AttributedText name;

    public C39566h(@l AttributedText attributedText, @k List<C39565g> list) {
        this.name = attributedText;
        this.features = list;
    }

    @k
    public final List<C39565g> a() {
        return this.features;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39566h)) {
            return false;
        }
        C39566h c39566h = (C39566h) obj;
        return L.f(this.name, c39566h.name) && L.f(this.features, c39566h.features);
    }

    public final int hashCode() {
        AttributedText attributedText = this.name;
        return this.features.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelFeatureGroup(name=");
        sb2.append(this.name);
        sb2.append(", features=");
        return H.p(sb2, this.features, ')');
    }
}
