package cX;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcX/d;", "LcX/a;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements InterfaceC27115a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final UniversalImage f57916a;

    public d(@l UniversalImage universalImage) {
        this.f57916a = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f57916a, ((d) obj).f57916a);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f57916a;
        if (universalImage == null) {
            return 0;
        }
        return universalImage.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("ImageField(image="), this.f57916a, ')');
    }
}
