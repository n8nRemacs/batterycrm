package Cp0;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectableItemsSection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCp0/f;", "Lcom/avito/conveyor_item/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f2711b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f2712c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f2713d;

    public f(@l String str, @k ArrayList arrayList) {
        this.f2711b = str;
        this.f2712c = arrayList;
        this.f2713d = str == null ? "" : str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return f.class.equals(obj != null ? obj.getClass() : null) && L.f(this.f2713d, ((f) obj).f2713d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF2713d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2713d() {
        return this.f2713d;
    }

    public final int hashCode() {
        return this.f2713d.hashCode();
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableItemsSection(title=");
        sb2.append(this.f2711b);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f2712c, ')');
    }
}
