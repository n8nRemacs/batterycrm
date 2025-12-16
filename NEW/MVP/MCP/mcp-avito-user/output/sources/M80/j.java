package m80;

import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnhandledPhotoPickerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm80/j;", "Lm80/k;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class j implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f414350a;

    public j(@Y61.k String str) {
        this.f414350a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f414350a, ((j) obj).f414350a);
    }

    public final int hashCode() {
        return this.f414350a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ShowLabelTooltip(id="), this.f414350a, ')');
    }
}
