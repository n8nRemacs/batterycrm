package KZ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationMortgageProgressItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LKZ/v;", "LKZ/p;", "", "id", "title", "", "LKZ/w;", "steps", "", "currentStepIdx", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "I", "a", "()I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class v implements InterfaceC14286p {

    @com.google.gson.annotations.c("currentStepIdx")
    private final int currentStepIdx;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("steps")
    @Y61.k
    private final List<w> steps;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public v(@Y61.k String str, @Y61.k String str2, @Y61.k List<w> list, int i12) {
        this.id = str;
        this.title = str2;
        this.steps = list;
        this.currentStepIdx = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getCurrentStepIdx() {
        return this.currentStepIdx;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final List<w> c() {
        return this.steps;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.L.f(this.id, vVar.id) && kotlin.jvm.internal.L.f(this.title, vVar.title) && kotlin.jvm.internal.L.f(this.steps, vVar.steps) && this.currentStepIdx == vVar.currentStepIdx;
    }

    public final int hashCode() {
        return Integer.hashCode(this.currentStepIdx) + androidx.compose.foundation.H.e(androidx.compose.foundation.H.d(this.id.hashCode() * 31, 31, this.title), 31, this.steps);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationMortgageProgressItemValue(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", steps=");
        sb2.append(this.steps);
        sb2.append(", currentStepIdx=");
        return androidx.appcompat.app.r.t(sb2, this.currentStepIdx, ')');
    }
}
