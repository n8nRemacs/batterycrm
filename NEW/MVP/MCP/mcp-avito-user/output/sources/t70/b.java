package T70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT70/b;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f15392a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f15393b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f15394c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f15395d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f15396e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f15397f;

    public b() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f15392a, bVar.f15392a) && L.f(this.f15393b, bVar.f15393b) && L.f(this.f15394c, bVar.f15394c) && L.f(this.f15395d, bVar.f15395d) && L.f(this.f15396e, bVar.f15396e) && L.f(this.f15397f, bVar.f15397f);
    }

    public final int hashCode() {
        Integer num = this.f15392a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15393b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f15394c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f15395d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f15396e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f15397f;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryPositions(advertGalleryVideoPosition=");
        sb2.append(this.f15392a);
        sb2.append(", advertGalleryNativeVideoPosition=");
        sb2.append(this.f15393b);
        sb2.append(", advertGalleryRealtyPosition=");
        sb2.append(this.f15394c);
        sb2.append(", fullScreenVideoPosition=");
        sb2.append(this.f15395d);
        sb2.append(", fullScreenNativeVideoPosition=");
        sb2.append(this.f15396e);
        sb2.append(", fullScreenRealtyPosition=");
        return s.j(sb2, this.f15397f, ')');
    }

    public b(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6) {
        this.f15392a = num;
        this.f15393b = num2;
        this.f15394c = num3;
        this.f15395d = num4;
        this.f15396e = num5;
        this.f15397f = num6;
    }

    public /* synthetic */ b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4, (i12 & 16) != 0 ? null : num5, (i12 & 32) != 0 ? null : num6);
    }
}
