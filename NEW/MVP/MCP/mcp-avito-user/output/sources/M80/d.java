package m80;

import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UnhandledPhotoPickerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm80/d;", "Lm80/k;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements k {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f414343a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f414344b;

    public d(@l String str, @l ArrayList arrayList) {
        this.f414343a = str;
        this.f414344b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f414343a, dVar.f414343a) && L.f(this.f414344b, dVar.f414344b);
    }

    public final int hashCode() {
        String str = this.f414343a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList arrayList = this.f414344b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeletePhotoFromListEvent(imageId=");
        sb2.append(this.f414343a);
        sb2.append(", badges=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f414344b, ')');
    }
}
