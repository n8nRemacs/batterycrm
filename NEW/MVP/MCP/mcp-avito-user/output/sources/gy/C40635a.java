package gY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.map_core.view.draw_button.DrawingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DrawingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgY/a;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C40635a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DrawingState f396485a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f396486b;

    public C40635a(@k DrawingState drawingState, @l Y41.a<G0> aVar) {
        this.f396485a = drawingState;
        this.f396486b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40635a)) {
            return false;
        }
        C40635a c40635a = (C40635a) obj;
        return this.f396485a == c40635a.f396485a && L.f(this.f396486b, c40635a.f396486b);
    }

    public final int hashCode() {
        int iHashCode = this.f396485a.hashCode() * 31;
        Y41.a<G0> aVar = this.f396486b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DrawButtonState(drawingState=");
        sb2.append(this.f396485a);
        sb2.append(", onClick=");
        return r.v(sb2, this.f396486b, ')');
    }

    public /* synthetic */ C40635a(DrawingState drawingState, Y41.a aVar, int i12, C42822w c42822w) {
        this(drawingState, (i12 & 2) != 0 ? null : aVar);
    }
}
