package T70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/f;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f15425a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f15426b;

    public f(@k g gVar, @k a aVar) {
        this.f15425a = gVar;
        this.f15426b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f15425a, fVar.f15425a) && L.f(this.f15426b, fVar.f15426b);
    }

    public final int hashCode() {
        return this.f15426b.hashCode() + (this.f15425a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "GridGalleryViewState(navbarViewState=" + this.f15425a + ", contentViewState=" + this.f15426b + ')';
    }
}
