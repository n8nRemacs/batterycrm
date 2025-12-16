package m80;

import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnhandledPhotoPickerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm80/f;", "Lm80/k;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f implements k {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f414346a;

    public f(@l String str) {
        this.f414346a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f414346a, ((f) obj).f414346a);
    }

    public final int hashCode() {
        String str = this.f414346a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("OpenPhotoEditScreenEvent(imageId="), this.f414346a, ')');
    }
}
