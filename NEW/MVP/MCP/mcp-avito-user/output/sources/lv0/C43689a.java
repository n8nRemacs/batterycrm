package lV0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: FavoriteItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlV0/a;", "", "favorite-item_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C43689a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f413819a;

    public C43689a(boolean z12) {
        this.f413819a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43689a) && this.f413819a == ((C43689a) obj).f413819a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f413819a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("FavoriteItem(isFavorite="), this.f413819a, ')');
    }
}
