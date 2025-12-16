package q3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AbExperimentDto.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lq3/h;", "", "", "label", "", "isControl", "isChosenProd", "isChosenStaging", "<init>", "(Ljava/lang/String;ZZZ)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "()Z", "b", "d", "(Z)V", "c", "e", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("isChosenProd")
    private boolean isChosenProd;

    @com.google.gson.annotations.c("isChosenStaging")
    private boolean isChosenStaging;

    @com.google.gson.annotations.c("isControl")
    private final boolean isControl;

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    public h(@k String str, boolean z12, boolean z13, boolean z14) {
        this.label = str;
        this.isControl = z12;
        this.isChosenProd = z13;
        this.isChosenStaging = z14;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsChosenProd() {
        return this.isChosenProd;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsChosenStaging() {
        return this.isChosenStaging;
    }

    public final void d(boolean z12) {
        this.isChosenProd = z12;
    }

    public final void e(boolean z12) {
        this.isChosenStaging = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.label, hVar.label) && this.isControl == hVar.isControl && this.isChosenProd == hVar.isChosenProd && this.isChosenStaging == hVar.isChosenStaging;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isChosenStaging) + r.i(r.i(this.label.hashCode() * 31, 31, this.isControl), 31, this.isChosenProd);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbFeatureDto(label=");
        sb2.append(this.label);
        sb2.append(", isControl=");
        sb2.append(this.isControl);
        sb2.append(", isChosenProd=");
        sb2.append(this.isChosenProd);
        sb2.append(", isChosenStaging=");
        return r.x(sb2, this.isChosenStaging, ')');
    }
}
