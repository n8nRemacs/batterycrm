package dO0;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ThemeImage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdO0/a;", "", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C39608a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Image f393852a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f393853b;

    public C39608a(@k Image image, @l Image image2) {
        this.f393852a = image;
        this.f393853b = image2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39608a)) {
            return false;
        }
        C39608a c39608a = (C39608a) obj;
        return L.f(this.f393852a, c39608a.f393852a) && L.f(this.f393853b, c39608a.f393853b);
    }

    public final int hashCode() {
        int iHashCode = this.f393852a.hashCode() * 31;
        Image image = this.f393853b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThemeImage(lightImage=");
        sb2.append(this.f393852a);
        sb2.append(", darkImage=");
        return c.o(sb2, this.f393853b, ')');
    }
}
