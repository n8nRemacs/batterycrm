package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StepDetails.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJZ/r;", "", "", "title", "", "LJZ/q;", "steps", "", "currentStepIdx", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "a", "()I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class r {

    @com.google.gson.annotations.c("currentStepIndex")
    private final int currentStepIdx;

    @com.google.gson.annotations.c("steps")
    @Y61.k
    private final List<q> steps;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public r(@Y61.k String str, @Y61.k List<q> list, int i12) {
        this.title = str;
        this.steps = list;
        this.currentStepIdx = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getCurrentStepIdx() {
        return this.currentStepIdx;
    }

    @Y61.k
    public final List<q> b() {
        return this.steps;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.title, rVar.title) && L.f(this.steps, rVar.steps) && this.currentStepIdx == rVar.currentStepIdx;
    }

    public final int hashCode() {
        return Integer.hashCode(this.currentStepIdx) + H.e(this.title.hashCode() * 31, 31, this.steps);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepDetails(title=");
        sb2.append(this.title);
        sb2.append(", steps=");
        sb2.append(this.steps);
        sb2.append(", currentStepIdx=");
        return androidx.appcompat.app.r.t(sb2, this.currentStepIdx, ')');
    }
}
