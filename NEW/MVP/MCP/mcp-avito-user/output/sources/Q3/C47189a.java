package q3;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AbExperimentDto.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lq3/a;", "", "", "label", "title", "", "Lq3/h;", "features", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "(Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C47189a {

    @com.google.gson.annotations.c("features")
    @k
    private final List<h> features;

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    @com.google.gson.annotations.c("title")
    @k
    private String title;

    public C47189a(@k String str, @k String str2, @k List<h> list) {
        this.label = str;
        this.title = str2;
        this.features = list;
    }

    @k
    public final List<h> a() {
        return this.features;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final void d(@k String str) {
        this.title = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47189a)) {
            return false;
        }
        C47189a c47189a = (C47189a) obj;
        return L.f(this.label, c47189a.label) && L.f(this.title, c47189a.title) && L.f(this.features, c47189a.features);
    }

    public final int hashCode() {
        return this.features.hashCode() + H.d(this.label.hashCode() * 31, 31, this.title);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbExperimentDto(label=");
        sb2.append(this.label);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", features=");
        return H.p(sb2, this.features, ')');
    }
}
